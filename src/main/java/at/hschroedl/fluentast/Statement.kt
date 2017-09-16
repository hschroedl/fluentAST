package at.hschroedl.fluentast

import org.eclipse.jdt.core.dom.*


abstract class FluentStatement : FluentASTNode(), FluentRootNode, FluentChildNode {

    abstract override fun build(ast: AST): ASTNode

    override fun build(): ASTNode {
        val ast: AST = AST.newAST(AST.JLS8)
        return build(ast)
    }
}


class FluentEmptyStatement : FluentStatement() {
    override fun build(ast: AST): ASTNode {
        return ast.newEmptyStatement()
    }
}

class FluentReturnStatement : FluentStatement {

    private var expression: FluentExpression? = null

    constructor()

    constructor(expression: FluentExpression) : this() {
        this.expression = expression
    }

    override fun build(ast: AST): ASTNode {
        val ret = ast.newReturnStatement()
        if (expression != null) {
            ret.expression = expression?.build(ast) as Expression?
        }
        return ret
    }
}

class FluentBreakStatement : FluentStatement() {
    override fun build(ast: AST): ASTNode {
        return ast.newBreakStatement()
    }
}


fun br(): FluentStatement {
    return FluentBreakStatement()
}

fun ret(): FluentStatement {
    return FluentReturnStatement()
}

fun ret(expression: FluentExpression): FluentReturnStatement {
    return FluentReturnStatement(expression)
}

fun empty(): FluentStatement {
    return FluentEmptyStatement()
}



