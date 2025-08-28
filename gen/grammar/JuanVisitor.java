// Generated from grammar/Juan.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JuanParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JuanVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JuanParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JuanParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuanParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(JuanParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuanParser#declararVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararVariable(JuanParser.DeclararVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuanParser#asignarValor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignarValor(JuanParser.AsignarValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuanParser#imprimirValor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimirValor(JuanParser.ImprimirValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuanParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(JuanParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuanParser#bucle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle(JuanParser.BucleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuanParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(JuanParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expresionLiteral}
	 * labeled alternative in {@link JuanParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionLiteral(JuanParser.ExpresionLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumaOp}
	 * labeled alternative in {@link JuanParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumaOp(JuanParser.SumaOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expresionParentesis}
	 * labeled alternative in {@link JuanParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionParentesis(JuanParser.ExpresionParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparacionOp}
	 * labeled alternative in {@link JuanParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacionOp(JuanParser.ComparacionOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpresion}
	 * labeled alternative in {@link JuanParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpresion(JuanParser.IdExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicacionOp}
	 * labeled alternative in {@link JuanParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacionOp(JuanParser.MultiplicacionOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuanParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JuanParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuanParser#tipoVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoVariable(JuanParser.TipoVariableContext ctx);
}