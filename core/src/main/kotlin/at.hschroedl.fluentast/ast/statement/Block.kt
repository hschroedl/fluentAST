package at.hschroedl.fluentast.ast.statement

import at.hschroedl.fluentast.ast.FluentParsedNode
import at.hschroedl.fluentast.exception.FluentArgumentException
import org.eclipse.jdt.core.dom.*


abstract class FluentBlock internal constructor(): FluentStatement()

class FluentStatementBlock internal constructor() : FluentBlock() {

    private val statements: MutableCollection<FluentStatement> = mutableListOf()

    constructor(statements: Array<FluentStatement>) : this() {
        this.statements.addAll(statements)
    }


    override fun build(ast: AST): Statement {
        val block: Block = ast.newBlock()
        statements
                .map { it.build(ast) }
                .forEach { block.statements().add(it) }
        return block
    }
}

class FluentParsedBlock internal constructor(private val content: String) : FluentBlock() {

    override fun build(): Statement {

        val block = FluentParsedNode(content, ASTParser.K_STATEMENTS).build() as Block
        if (block.statements().isEmpty()) {
            throw FluentArgumentException(
                    "Failed to parse statements: '$content'. To create an empty block use 'block()'")
        }
        return block
    }

    override fun build(ast: AST): Statement {
        val convertedAstNodeWithMethodBody = ASTNode.copySubtree(ast, build())
        return convertedAstNodeWithMethodBody as Block
    }
}
