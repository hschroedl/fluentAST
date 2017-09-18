package at.hschroedl.fluentast.ast.type

import at.hschroedl.fluentast.FluentASTNode
import at.hschroedl.fluentast.FluentChildNode
import at.hschroedl.fluentast.ast.expression.name
import org.eclipse.jdt.core.dom.*

abstract class FluentType : FluentASTNode(), FluentChildNode<Type> {

    abstract override fun build(ast: AST): Type
}

class FluentSimpleType(private val type: String) : FluentType() {
    override fun build(ast: AST): SimpleType {
        return ast.newSimpleType(name(type).build(ast))
    }
}

fun t(name: String): FluentType {
    return FluentSimpleType(name)
}

class FluentUnionType() : FluentType() {
    override fun build(ast: AST): Type {
        throw NotImplementedError()
    }

}

class FluentQualifiedType() : FluentType() {
    override fun build(ast: AST): QualifiedType {
        throw NotImplementedError()
    }
}

class FluentWildcardType() : FluentType() {
    override fun build(ast: AST): WildcardType {
        throw NotImplementedError()
    }
}
