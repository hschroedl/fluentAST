package at.hschroedl.fluentast.ast.expression

import at.hschroedl.fluentast.ast.FluentStatement
import at.hschroedl.fluentast.ast.type.FluentSimpleType
import at.hschroedl.fluentast.ast.type.FluentPrimitive
import at.hschroedl.fluentast.ast.type.FluentPrimitiveType
import at.hschroedl.fluentast.ast.type.FluentType
import org.eclipse.jdt.core.dom.AST
import org.eclipse.jdt.core.dom.Expression
import org.eclipse.jdt.core.dom.Statement
import org.eclipse.jdt.core.dom.Type

//TODO: Type hierarchy is possibly wrong, VarDecl are not statements! Use VaribleDeclarationStatement!
open class FluentVariableDeclaration(private val type: FluentType, private val name: String,
                                     private val expression: FluentExpression?) : FluentStatement() {

    constructor(type: String, name: String, expression: FluentExpression?) : this(
            FluentSimpleType(type), name,
            expression)

    override fun build(ast: AST): Statement {
        // TODO: Multiple varible fragments, e.g. int a = 3, b =4, c=5;
        val fragment = ast.newVariableDeclarationFragment()
        val ret = ast.newVariableDeclarationStatement(fragment)
        fragment.name = ast.newSimpleName(name)
        fragment.initializer = expression?.build(ast) as? Expression
        ret.type = type.build(ast) as? Type
        return ret
    }
}


class FluentIntDeclarationStatement(name: String, expression: FluentExpression?) :
        FluentVariableDeclaration(
                type = FluentPrimitiveType(
                        FluentPrimitive.INT), name = name, expression = expression) {

    constructor(name: String) : this(name = name, expression = null)
    constructor(name: String, initializer: Int) : this(name = name,
            expression = FluentNumberLiteral(initializer))
}


class FluentBoolDeclarationStatement(name: String, expression: FluentExpression?) :
        FluentVariableDeclaration(
                type = FluentPrimitiveType(
                        FluentPrimitive.BOOL), name = name, expression = expression) {
    constructor(name: String) : this(name, expression = null)
    constructor(name: String, initializer: Boolean) : this(name, expression = FluentBooleanLiteral(
            initializer))


}


class FluentCharDeclarationStatement(name: String, expression: FluentExpression?) :
        FluentVariableDeclaration(
                type = FluentPrimitiveType(
                        FluentPrimitive.CHAR), name = name, expression = expression) {
    constructor(name: String) : this(name, expression = null)
    constructor(name: String, initializer: Char) : this(name, expression = FluentCharLiteral(
            initializer))

}


// TODO: Clean up public methods, possibly most of them not needed
fun intVar(name: String): FluentStatement {
    return FluentIntDeclarationStatement(name)
}

fun `var`(name: String, initializer: Int): FluentStatement {
    return FluentIntDeclarationStatement(name, initializer)
}

fun intVar(name: String, expression: FluentExpression): FluentStatement {
    return FluentIntDeclarationStatement(name, expression)
}

fun boolVar(name: String): FluentStatement {
    return FluentBoolDeclarationStatement(name)
}

fun `var`(name: String, initializer: Boolean): FluentStatement {
    return FluentBoolDeclarationStatement(name, initializer)
}

fun boolVar(name: String, expression: FluentExpression): FluentStatement {
    return FluentBoolDeclarationStatement(name, expression)
}

fun charVar(name: String): FluentStatement {
    return FluentCharDeclarationStatement(name)
}

fun `var`(name: String, initializer: Char): FluentStatement {
    return FluentCharDeclarationStatement(name, initializer)
}

fun charVar(name: String, expression: FluentExpression): FluentStatement {
    return FluentCharDeclarationStatement(name, expression)
}

fun `var`(type: String, name: String): FluentStatement {
    return FluentVariableDeclaration(type, name, null)
}

fun `var`(type: String, name: String, expression: FluentExpression): FluentStatement {
    return FluentVariableDeclaration(type, name, expression)
}

