package at.hschroedl.fluentast.ast.expression

import at.hschroedl.fluentast.cast
import at.hschroedl.fluentast.test.dummyLiteral
import at.hschroedl.fluentast.test.dummyType
import at.hschroedl.fluentast.test.toInlineString
import org.eclipse.jdt.core.dom.CastExpression
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CastExpressionTest {

    @Test
    internal fun cast_withType_returnsTypeCast() {
        val expression = cast(dummyType("Integer"),
                dummyLiteral(1)).build() as CastExpression

        assertEquals("(Integer)1", expression.toInlineString())
    }
}