---
title: FluentIfStatement - fluentast-core
---

[fluentast-core](../../index.html) / [at.hschroedl.fluentast.ast.statement](../index.html) / [FluentIfStatement](.)

# FluentIfStatement

`class FluentIfStatement : `[`FluentStatement`](../-fluent-statement/index.html) [(source)](https://github.com/hschroedl/FluentAST/tree/master/core/src/main/kotlin//at.hschroedl.fluentast/ast/statement/IfStatement.kt#L11)

Used to build an [IfStatement](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/IfStatement.html) with a condition and a then-statement,
but without a else-statement.

### Functions

| [build](build.html) | `fun build(ast: `[`AST`](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/AST.html)`): `[`IfStatement`](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/IfStatement.html)<br>Creates an [Statement](#) from the given [FluentStatement](../-fluent-statement/index.html) using the given [AST](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/AST.html). |
| [else_](else_.html) | `fun else_(statement: `[`FluentStatement`](../-fluent-statement/index.html)`): `[`FluentIfElseStatement`](../-fluent-if-else-statement/index.html)<br>Creates a new [FluentIfElseStatement](../-fluent-if-else-statement/index.html). |

### Inherited Functions

| [build](../-fluent-statement/build.html) | `open fun build(): `[`Statement`](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/Statement.html)<br>Creates a [Statement](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/Statement.html) using a new [AST](https://help.eclipse.org/neon/topic/org.eclipse.jdt.doc.isv/reference/api/org/eclipse/jdt/core/dom/AST.html). |

