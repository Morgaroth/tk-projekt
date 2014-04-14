// Generated from /home/mateusz/Dropbox/semVI/TK/tk-projekt/src/main/antlr4/Regulars.g4 by ANTLR 4.2.2
package parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RegularsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RegularsVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link RegularsParser#plus}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPlus(@NotNull RegularsParser.PlusContext ctx);

    /**
     * Visit a parse tree produced by {@link RegularsParser#range}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRange(@NotNull RegularsParser.RangeContext ctx);

    /**
     * Visit a parse tree produced by {@link RegularsParser#simple_regex}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSimple_regex(@NotNull RegularsParser.Simple_regexContext ctx);

    /**
     * Visit a parse tree produced by {@link RegularsParser#one_or_none}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOne_or_none(@NotNull RegularsParser.One_or_noneContext ctx);

    /**
     * Visit a parse tree produced by {@link RegularsParser#regex}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRegex(@NotNull RegularsParser.RegexContext ctx);

    /**
     * Visit a parse tree produced by {@link RegularsParser#set}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSet(@NotNull RegularsParser.SetContext ctx);

    /**
     * Visit a parse tree produced by {@link RegularsParser#star}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStar(@NotNull RegularsParser.StarContext ctx);

    /**
     * Visit a parse tree produced by {@link RegularsParser#set_items}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSet_items(@NotNull RegularsParser.Set_itemsContext ctx);

    /**
     * Visit a parse tree produced by {@link RegularsParser#negative_set}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNegative_set(@NotNull RegularsParser.Negative_setContext ctx);

    /**
     * Visit a parse tree produced by {@link RegularsParser#character}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCharacter(@NotNull RegularsParser.CharacterContext ctx);

    /**
     * Visit a parse tree produced by {@link RegularsParser#set_item}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSet_item(@NotNull RegularsParser.Set_itemContext ctx);

    /**
     * Visit a parse tree produced by {@link RegularsParser#elementary_regex}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitElementary_regex(@NotNull RegularsParser.Elementary_regexContext ctx);

    /**
     * Visit a parse tree produced by {@link RegularsParser#eos}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEos(@NotNull RegularsParser.EosContext ctx);

    /**
     * Visit a parse tree produced by {@link RegularsParser#basic_regex}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBasic_regex(@NotNull RegularsParser.Basic_regexContext ctx);

    /**
     * Visit a parse tree produced by {@link RegularsParser#start}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStart(@NotNull RegularsParser.StartContext ctx);

    /**
     * Visit a parse tree produced by {@link RegularsParser#any}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAny(@NotNull RegularsParser.AnyContext ctx);

    /**
     * Visit a parse tree produced by {@link RegularsParser#positive_set}.
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPositive_set(@NotNull RegularsParser.Positive_setContext ctx);

    /**
     * Visit a parse tree produced by {@link RegularsParser#group}.
     * @param ctx the parse tree
     * @return the visitor result
	 */
	T visitGroup(@NotNull RegularsParser.GroupContext ctx);
}