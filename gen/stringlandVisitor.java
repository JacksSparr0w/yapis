// Generated from C:/Users/Katsuba_V/IdeaProjects/yapis/src/main/resources\stringland.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link stringlandParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface stringlandVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link stringlandParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(stringlandParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringlandParser#concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat(stringlandParser.ConcatContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringlandParser#make}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMake(stringlandParser.MakeContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringlandParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(stringlandParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringlandParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(stringlandParser.ShowContext ctx);
}