// Generated from TypeExpression.g4 by ANTLR 4.13.0
package parser;

	import java.util.ArrayList;
	import symbols.DataType;
	import symbols.Identifier;
	import symbols.SymbolTable;
	import expressions.*;
	

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TypeExpressionParser}.
 */
public interface TypeExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TypeExpressionParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(TypeExpressionParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeExpressionParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(TypeExpressionParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeExpressionParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(TypeExpressionParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeExpressionParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(TypeExpressionParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeExpressionParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(TypeExpressionParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeExpressionParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(TypeExpressionParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeExpressionParser#lista_var}.
	 * @param ctx the parse tree
	 */
	void enterLista_var(TypeExpressionParser.Lista_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeExpressionParser#lista_var}.
	 * @param ctx the parse tree
	 */
	void exitLista_var(TypeExpressionParser.Lista_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeExpressionParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(TypeExpressionParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeExpressionParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(TypeExpressionParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TypeExpressionParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TypeExpressionParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeExpressionParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(TypeExpressionParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeExpressionParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(TypeExpressionParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeExpressionParser#exprl}.
	 * @param ctx the parse tree
	 */
	void enterExprl(TypeExpressionParser.ExprlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeExpressionParser#exprl}.
	 * @param ctx the parse tree
	 */
	void exitExprl(TypeExpressionParser.ExprlContext ctx);
}