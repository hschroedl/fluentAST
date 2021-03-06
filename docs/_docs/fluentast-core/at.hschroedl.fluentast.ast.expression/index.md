---
title: at.hschroedl.fluentast.ast.expression - fluentast-core
---

[fluentast-core](../index.html) / [at.hschroedl.fluentast.ast.expression](.)

## Package at.hschroedl.fluentast.ast.expression

Contains Fluentast representations of [Expression](#).

### Types

| [FluentAnnotation](-fluent-annotation.html) | `abstract class FluentAnnotation : `[`FluentExpression`](-fluent-expression/index.html) |
| [FluentArrayAccess](-fluent-array-access/index.html) | `class FluentArrayAccess : `[`FluentExpression`](-fluent-expression/index.html)<br>A wrapper class for [ArrayAccess](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/ArrayAccess.html). Subclass of [FluentExpression](-fluent-expression/index.html) |
| [FluentArrayCreation](-fluent-array-creation/index.html) | `class FluentArrayCreation : `[`FluentExpression`](-fluent-expression/index.html)<br>Used to create an [ArrayCreation](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/ArrayCreation.html) with the given [FluentArrayType](../at.hschroedl.fluentast.ast.type/-fluent-array-type/index.html) and a [FluentArrayInitializer](-fluent-array-initializer/index.html). |
| [FluentArrayInitializer](-fluent-array-initializer/index.html) | `class FluentArrayInitializer : `[`FluentExpression`](-fluent-expression/index.html) |
| [FluentAssignment](-fluent-assignment/index.html) | `class FluentAssignment : `[`FluentExpression`](-fluent-expression/index.html) |
| [FluentBooleanLiteral](-fluent-boolean-literal/index.html) | `class FluentBooleanLiteral : `[`FluentLiteral`](-fluent-literal.html)<br>Used to build a [BooleanLiteral](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/BooleanLiteral.html) with a given value. |
| [FluentCastExpression](-fluent-cast-expression/index.html) | `class FluentCastExpression : `[`FluentExpression`](-fluent-expression/index.html) |
| [FluentCharacterLiteral](-fluent-character-literal/index.html) | `class FluentCharacterLiteral : `[`FluentLiteral`](-fluent-literal.html)<br>Used to build a [CharacterLiteral](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/CharacterLiteral.html) with a given character value. |
| [FluentClassInstanceCreation](-fluent-class-instance-creation/index.html) | `class FluentClassInstanceCreation : `[`FluentExpression`](-fluent-expression/index.html) |
| [FluentConditionalExpression](-fluent-conditional-expression/index.html) | `class FluentConditionalExpression : `[`FluentExpression`](-fluent-expression/index.html) |
| [FluentExpression](-fluent-expression/index.html) | `abstract class FluentExpression : `[`FluentASTNode`](../at.hschroedl.fluentast.ast/-fluent-a-s-t-node/index.html)`, `[`FluentStandaloneNode`](../at.hschroedl.fluentast.ast/-fluent-standalone-node/index.html)`<`[`Expression`](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/Expression.html)`>` |
| [FluentFieldAccess](-fluent-field-access/index.html) | `class FluentFieldAccess : `[`FluentExpression`](-fluent-expression/index.html) |
| [FluentInfixExpression](-fluent-infix-expression/index.html) | `open class FluentInfixExpression : `[`FluentExpression`](-fluent-expression/index.html)<br>Used to build an [InfixExpression](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/InfixExpression.html) with a left operand, an operator and a right operand. |
| [FluentInfixLeftPartial](-fluent-infix-left-partial/index.html) | `class FluentInfixLeftPartial`<br>Used to build an [InfixExpression](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/InfixExpression.html). This partial represents an intermediate representation where an operator and left-hand-side operand has been set but a right-hand side operand is missing. |
| [FluentInfixOperatorPartial](-fluent-infix-operator-partial/index.html) | `class FluentInfixOperatorPartial`<br>Used to build an [InfixExpression](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/InfixExpression.html). This partial represents an intermediate representation where the operator has been set but a right-hand side and left-hand-side operand are missing. |
| [FluentInstanceOfExpression](-fluent-instance-of-expression/index.html) | `class FluentInstanceOfExpression : `[`FluentExpression`](-fluent-expression/index.html) |
| [FluentLiteral](-fluent-literal.html) | `abstract class FluentLiteral : `[`FluentExpression`](-fluent-expression/index.html)<br>Base class for other literals. See [NumberLiteral](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/NumberLiteral.html),[StringLiteral](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/StringLiteral.html),[BooleanLiteral](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/BooleanLiteral.html)... |
| [FluentMarkerAnnotation](-fluent-marker-annotation/index.html) | `class FluentMarkerAnnotation : `[`FluentAnnotation`](-fluent-annotation.html) |
| [FluentMethodInvocation](-fluent-method-invocation/index.html) | `class FluentMethodInvocation : `[`FluentExpression`](-fluent-expression/index.html) |
| [FluentName](-fluent-name/index.html) | `class FluentName : `[`FluentExpression`](-fluent-expression/index.html) |
| [FluentNormalAnnotation](-fluent-normal-annotation/index.html) | `class FluentNormalAnnotation : `[`FluentAnnotation`](-fluent-annotation.html) |
| [FluentNullLiteral](-fluent-null-literal/index.html) | `class FluentNullLiteral : `[`FluentExpression`](-fluent-expression/index.html)<br>Used to build a [NullLiteral](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/NullLiteral.html). |
| [FluentNumberLiteral](-fluent-number-literal/index.html) | `class FluentNumberLiteral : `[`FluentLiteral`](-fluent-literal.html)<br>Used to build a [NumberLiteral](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/NumberLiteral.html) with a given integer value. |
| [FluentParenthesizedExpression](-fluent-parenthesized-expression/index.html) | `class FluentParenthesizedExpression : `[`FluentExpression`](-fluent-expression/index.html) |
| [FluentPostfixExpression](-fluent-postfix-expression/index.html) | `class FluentPostfixExpression : `[`FluentExpression`](-fluent-expression/index.html) |
| [FluentPrefixExpression](-fluent-prefix-expression/index.html) | `class FluentPrefixExpression : `[`FluentExpression`](-fluent-expression/index.html) |
| [FluentSingleMemberAnnotation](-fluent-single-member-annotation/index.html) | `class FluentSingleMemberAnnotation : `[`FluentAnnotation`](-fluent-annotation.html) |
| [FluentStringLiteral](-fluent-string-literal/index.html) | `class FluentStringLiteral : `[`FluentExpression`](-fluent-expression/index.html)<br>Used to build a [StringLiteral](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/StringLiteral.html) with a given value. |
| [FluentSuperFieldAccess](-fluent-super-field-access/index.html) | `class FluentSuperFieldAccess : `[`FluentExpression`](-fluent-expression/index.html) |
| [FluentSuperMethodInvocation](-fluent-super-method-invocation/index.html) | `class FluentSuperMethodInvocation : `[`FluentExpression`](-fluent-expression/index.html)<br>Used to build a [SuperMethodInvocation](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/SuperMethodInvocation.html). |
| [FluentThisExpression](-fluent-this-expression/index.html) | `class FluentThisExpression : `[`FluentExpression`](-fluent-expression/index.html)<br>Used to build a [ThisExpression](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/ThisExpression.html). |
| [FluentTypeLiteral](-fluent-type-literal/index.html) | `class FluentTypeLiteral : `[`FluentExpression`](-fluent-expression/index.html)<br>Used to build a [TypeLiteral](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/TypeLiteral.html) from a [FluentType](../at.hschroedl.fluentast.ast.type/-fluent-type/index.html). |
| [FluentVariableDeclarationExpression](-fluent-variable-declaration-expression/index.html) | `class FluentVariableDeclarationExpression : `[`FluentExpression`](-fluent-expression/index.html)<br>A wrapper class for [VariableDeclarationExpression](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/VariableDeclarationExpression.html). |

