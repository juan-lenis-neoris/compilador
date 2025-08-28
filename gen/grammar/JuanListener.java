// Generated from grammar/Juan.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JuanParser}.
 */
public interface JuanListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JuanParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JuanParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuanParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JuanParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuanParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(JuanParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuanParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(JuanParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuanParser#declararVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclararVariable(JuanParser.DeclararVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuanParser#declararVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclararVariable(JuanParser.DeclararVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuanParser#asignarValor}.
	 * @param ctx the parse tree
	 */
	void enterAsignarValor(JuanParser.AsignarValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuanParser#asignarValor}.
	 * @param ctx the parse tree
	 */
	void exitAsignarValor(JuanParser.AsignarValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuanParser#imprimirValor}.
	 * @param ctx the parse tree
	 */
	void enterImprimirValor(JuanParser.ImprimirValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuanParser#imprimirValor}.
	 * @param ctx the parse tree
	 */
	void exitImprimirValor(JuanParser.ImprimirValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuanParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(JuanParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuanParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(JuanParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuanParser#bucle}.
	 * @param ctx the parse tree
	 */
	void enterBucle(JuanParser.BucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuanParser#bucle}.
	 * @param ctx the parse tree
	 */
	void exitBucle(JuanParser.BucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuanParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(JuanParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuanParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(JuanParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expresionLiteral}
	 * labeled alternative in {@link JuanParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresionLiteral(JuanParser.ExpresionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expresionLiteral}
	 * labeled alternative in {@link JuanParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresionLiteral(JuanParser.ExpresionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sumaOp}
	 * labeled alternative in {@link JuanParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterSumaOp(JuanParser.SumaOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumaOp}
	 * labeled alternative in {@link JuanParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitSumaOp(JuanParser.SumaOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expresionParentesis}
	 * labeled alternative in {@link JuanParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresionParentesis(JuanParser.ExpresionParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expresionParentesis}
	 * labeled alternative in {@link JuanParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresionParentesis(JuanParser.ExpresionParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparacionOp}
	 * labeled alternative in {@link JuanParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterComparacionOp(JuanParser.ComparacionOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparacionOp}
	 * labeled alternative in {@link JuanParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitComparacionOp(JuanParser.ComparacionOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpresion}
	 * labeled alternative in {@link JuanParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterIdExpresion(JuanParser.IdExpresionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpresion}
	 * labeled alternative in {@link JuanParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitIdExpresion(JuanParser.IdExpresionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicacionOp}
	 * labeled alternative in {@link JuanParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacionOp(JuanParser.MultiplicacionOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicacionOp}
	 * labeled alternative in {@link JuanParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacionOp(JuanParser.MultiplicacionOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuanParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JuanParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuanParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JuanParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuanParser#tipoVariable}.
	 * @param ctx the parse tree
	 */
	void enterTipoVariable(JuanParser.TipoVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuanParser#tipoVariable}.
	 * @param ctx the parse tree
	 */
	void exitTipoVariable(JuanParser.TipoVariableContext ctx);
}