package com.gramrco.antlrlexer;

// Generated from Rust.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RustParser}.
 */
public interface RustListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RustParser#crate}.
	 * @param ctx the parse tree
	 */
	void enterCrate(RustParser.CrateContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#crate}.
	 * @param ctx the parse tree
	 */
	void exitCrate(RustParser.CrateContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#mod_body}.
	 * @param ctx the parse tree
	 */
	void enterMod_body(RustParser.Mod_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#mod_body}.
	 * @param ctx the parse tree
	 */
	void exitMod_body(RustParser.Mod_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#visibility}.
	 * @param ctx the parse tree
	 */
	void enterVisibility(RustParser.VisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#visibility}.
	 * @param ctx the parse tree
	 */
	void exitVisibility(RustParser.VisibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#visibility_restriction}.
	 * @param ctx the parse tree
	 */
	void enterVisibility_restriction(RustParser.Visibility_restrictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#visibility_restriction}.
	 * @param ctx the parse tree
	 */
	void exitVisibility_restriction(RustParser.Visibility_restrictionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(RustParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(RustParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#pub_item}.
	 * @param ctx the parse tree
	 */
	void enterPub_item(RustParser.Pub_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#pub_item}.
	 * @param ctx the parse tree
	 */
	void exitPub_item(RustParser.Pub_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#item_macro_use}.
	 * @param ctx the parse tree
	 */
	void enterItem_macro_use(RustParser.Item_macro_useContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#item_macro_use}.
	 * @param ctx the parse tree
	 */
	void exitItem_macro_use(RustParser.Item_macro_useContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#item_macro_path}.
	 * @param ctx the parse tree
	 */
	void enterItem_macro_path(RustParser.Item_macro_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#item_macro_path}.
	 * @param ctx the parse tree
	 */
	void exitItem_macro_path(RustParser.Item_macro_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#item_macro_path_parent}.
	 * @param ctx the parse tree
	 */
	void enterItem_macro_path_parent(RustParser.Item_macro_path_parentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#item_macro_path_parent}.
	 * @param ctx the parse tree
	 */
	void exitItem_macro_path_parent(RustParser.Item_macro_path_parentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#item_macro_path_segment}.
	 * @param ctx the parse tree
	 */
	void enterItem_macro_path_segment(RustParser.Item_macro_path_segmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#item_macro_path_segment}.
	 * @param ctx the parse tree
	 */
	void exitItem_macro_path_segment(RustParser.Item_macro_path_segmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#item_macro_tail}.
	 * @param ctx the parse tree
	 */
	void enterItem_macro_tail(RustParser.Item_macro_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#item_macro_tail}.
	 * @param ctx the parse tree
	 */
	void exitItem_macro_tail(RustParser.Item_macro_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#extern_crate}.
	 * @param ctx the parse tree
	 */
	void enterExtern_crate(RustParser.Extern_crateContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#extern_crate}.
	 * @param ctx the parse tree
	 */
	void exitExtern_crate(RustParser.Extern_crateContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#use_decl}.
	 * @param ctx the parse tree
	 */
	void enterUse_decl(RustParser.Use_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#use_decl}.
	 * @param ctx the parse tree
	 */
	void exitUse_decl(RustParser.Use_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#use_path}.
	 * @param ctx the parse tree
	 */
	void enterUse_path(RustParser.Use_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#use_path}.
	 * @param ctx the parse tree
	 */
	void exitUse_path(RustParser.Use_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#use_suffix}.
	 * @param ctx the parse tree
	 */
	void enterUse_suffix(RustParser.Use_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#use_suffix}.
	 * @param ctx the parse tree
	 */
	void exitUse_suffix(RustParser.Use_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#use_item}.
	 * @param ctx the parse tree
	 */
	void enterUse_item(RustParser.Use_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#use_item}.
	 * @param ctx the parse tree
	 */
	void exitUse_item(RustParser.Use_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#use_item_list}.
	 * @param ctx the parse tree
	 */
	void enterUse_item_list(RustParser.Use_item_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#use_item_list}.
	 * @param ctx the parse tree
	 */
	void exitUse_item_list(RustParser.Use_item_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#rename}.
	 * @param ctx the parse tree
	 */
	void enterRename(RustParser.RenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#rename}.
	 * @param ctx the parse tree
	 */
	void exitRename(RustParser.RenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#mod_decl_short}.
	 * @param ctx the parse tree
	 */
	void enterMod_decl_short(RustParser.Mod_decl_shortContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#mod_decl_short}.
	 * @param ctx the parse tree
	 */
	void exitMod_decl_short(RustParser.Mod_decl_shortContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#mod_decl}.
	 * @param ctx the parse tree
	 */
	void enterMod_decl(RustParser.Mod_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#mod_decl}.
	 * @param ctx the parse tree
	 */
	void exitMod_decl(RustParser.Mod_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#extern_mod}.
	 * @param ctx the parse tree
	 */
	void enterExtern_mod(RustParser.Extern_modContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#extern_mod}.
	 * @param ctx the parse tree
	 */
	void exitExtern_mod(RustParser.Extern_modContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#foreign_item}.
	 * @param ctx the parse tree
	 */
	void enterForeign_item(RustParser.Foreign_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#foreign_item}.
	 * @param ctx the parse tree
	 */
	void exitForeign_item(RustParser.Foreign_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#foreign_item_tail}.
	 * @param ctx the parse tree
	 */
	void enterForeign_item_tail(RustParser.Foreign_item_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#foreign_item_tail}.
	 * @param ctx the parse tree
	 */
	void exitForeign_item_tail(RustParser.Foreign_item_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#static_decl}.
	 * @param ctx the parse tree
	 */
	void enterStatic_decl(RustParser.Static_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#static_decl}.
	 * @param ctx the parse tree
	 */
	void exitStatic_decl(RustParser.Static_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void enterConst_decl(RustParser.Const_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void exitConst_decl(RustParser.Const_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#fn_decl}.
	 * @param ctx the parse tree
	 */
	void enterFn_decl(RustParser.Fn_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#fn_decl}.
	 * @param ctx the parse tree
	 */
	void exitFn_decl(RustParser.Fn_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decl(RustParser.Method_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decl(RustParser.Method_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#trait_method_decl}.
	 * @param ctx the parse tree
	 */
	void enterTrait_method_decl(RustParser.Trait_method_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#trait_method_decl}.
	 * @param ctx the parse tree
	 */
	void exitTrait_method_decl(RustParser.Trait_method_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#foreign_fn_decl}.
	 * @param ctx the parse tree
	 */
	void enterForeign_fn_decl(RustParser.Foreign_fn_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#foreign_fn_decl}.
	 * @param ctx the parse tree
	 */
	void exitForeign_fn_decl(RustParser.Foreign_fn_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#fn_head}.
	 * @param ctx the parse tree
	 */
	void enterFn_head(RustParser.Fn_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#fn_head}.
	 * @param ctx the parse tree
	 */
	void exitFn_head(RustParser.Fn_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(RustParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(RustParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#param_ty}.
	 * @param ctx the parse tree
	 */
	void enterParam_ty(RustParser.Param_tyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#param_ty}.
	 * @param ctx the parse tree
	 */
	void exitParam_ty(RustParser.Param_tyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(RustParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(RustParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#variadic_param_list}.
	 * @param ctx the parse tree
	 */
	void enterVariadic_param_list(RustParser.Variadic_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#variadic_param_list}.
	 * @param ctx the parse tree
	 */
	void exitVariadic_param_list(RustParser.Variadic_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#variadic_param_list_names_optional}.
	 * @param ctx the parse tree
	 */
	void enterVariadic_param_list_names_optional(RustParser.Variadic_param_list_names_optionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#variadic_param_list_names_optional}.
	 * @param ctx the parse tree
	 */
	void exitVariadic_param_list_names_optional(RustParser.Variadic_param_list_names_optionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#self_param}.
	 * @param ctx the parse tree
	 */
	void enterSelf_param(RustParser.Self_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#self_param}.
	 * @param ctx the parse tree
	 */
	void exitSelf_param(RustParser.Self_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#method_param_list}.
	 * @param ctx the parse tree
	 */
	void enterMethod_param_list(RustParser.Method_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#method_param_list}.
	 * @param ctx the parse tree
	 */
	void exitMethod_param_list(RustParser.Method_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#trait_method_param}.
	 * @param ctx the parse tree
	 */
	void enterTrait_method_param(RustParser.Trait_method_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#trait_method_param}.
	 * @param ctx the parse tree
	 */
	void exitTrait_method_param(RustParser.Trait_method_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#restricted_pat}.
	 * @param ctx the parse tree
	 */
	void enterRestricted_pat(RustParser.Restricted_patContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#restricted_pat}.
	 * @param ctx the parse tree
	 */
	void exitRestricted_pat(RustParser.Restricted_patContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#trait_method_param_list}.
	 * @param ctx the parse tree
	 */
	void enterTrait_method_param_list(RustParser.Trait_method_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#trait_method_param_list}.
	 * @param ctx the parse tree
	 */
	void exitTrait_method_param_list(RustParser.Trait_method_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#rtype}.
	 * @param ctx the parse tree
	 */
	void enterRtype(RustParser.RtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#rtype}.
	 * @param ctx the parse tree
	 */
	void exitRtype(RustParser.RtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#fn_rtype}.
	 * @param ctx the parse tree
	 */
	void enterFn_rtype(RustParser.Fn_rtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#fn_rtype}.
	 * @param ctx the parse tree
	 */
	void exitFn_rtype(RustParser.Fn_rtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void enterType_decl(RustParser.Type_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void exitType_decl(RustParser.Type_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#struct_decl}.
	 * @param ctx the parse tree
	 */
	void enterStruct_decl(RustParser.Struct_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#struct_decl}.
	 * @param ctx the parse tree
	 */
	void exitStruct_decl(RustParser.Struct_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#struct_tail}.
	 * @param ctx the parse tree
	 */
	void enterStruct_tail(RustParser.Struct_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#struct_tail}.
	 * @param ctx the parse tree
	 */
	void exitStruct_tail(RustParser.Struct_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#tuple_struct_field}.
	 * @param ctx the parse tree
	 */
	void enterTuple_struct_field(RustParser.Tuple_struct_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#tuple_struct_field}.
	 * @param ctx the parse tree
	 */
	void exitTuple_struct_field(RustParser.Tuple_struct_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#tuple_struct_field_list}.
	 * @param ctx the parse tree
	 */
	void enterTuple_struct_field_list(RustParser.Tuple_struct_field_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#tuple_struct_field_list}.
	 * @param ctx the parse tree
	 */
	void exitTuple_struct_field_list(RustParser.Tuple_struct_field_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void enterField_decl(RustParser.Field_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void exitField_decl(RustParser.Field_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#field_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterField_decl_list(RustParser.Field_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#field_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitField_decl_list(RustParser.Field_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#enum_decl}.
	 * @param ctx the parse tree
	 */
	void enterEnum_decl(RustParser.Enum_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#enum_decl}.
	 * @param ctx the parse tree
	 */
	void exitEnum_decl(RustParser.Enum_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#enum_variant}.
	 * @param ctx the parse tree
	 */
	void enterEnum_variant(RustParser.Enum_variantContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#enum_variant}.
	 * @param ctx the parse tree
	 */
	void exitEnum_variant(RustParser.Enum_variantContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#enum_variant_list}.
	 * @param ctx the parse tree
	 */
	void enterEnum_variant_list(RustParser.Enum_variant_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#enum_variant_list}.
	 * @param ctx the parse tree
	 */
	void exitEnum_variant_list(RustParser.Enum_variant_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#enum_variant_main}.
	 * @param ctx the parse tree
	 */
	void enterEnum_variant_main(RustParser.Enum_variant_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#enum_variant_main}.
	 * @param ctx the parse tree
	 */
	void exitEnum_variant_main(RustParser.Enum_variant_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#enum_tuple_field}.
	 * @param ctx the parse tree
	 */
	void enterEnum_tuple_field(RustParser.Enum_tuple_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#enum_tuple_field}.
	 * @param ctx the parse tree
	 */
	void exitEnum_tuple_field(RustParser.Enum_tuple_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#enum_tuple_field_list}.
	 * @param ctx the parse tree
	 */
	void enterEnum_tuple_field_list(RustParser.Enum_tuple_field_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#enum_tuple_field_list}.
	 * @param ctx the parse tree
	 */
	void exitEnum_tuple_field_list(RustParser.Enum_tuple_field_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#enum_field_decl}.
	 * @param ctx the parse tree
	 */
	void enterEnum_field_decl(RustParser.Enum_field_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#enum_field_decl}.
	 * @param ctx the parse tree
	 */
	void exitEnum_field_decl(RustParser.Enum_field_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#enum_field_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterEnum_field_decl_list(RustParser.Enum_field_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#enum_field_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitEnum_field_decl_list(RustParser.Enum_field_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#union_decl}.
	 * @param ctx the parse tree
	 */
	void enterUnion_decl(RustParser.Union_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#union_decl}.
	 * @param ctx the parse tree
	 */
	void exitUnion_decl(RustParser.Union_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#trait_decl}.
	 * @param ctx the parse tree
	 */
	void enterTrait_decl(RustParser.Trait_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#trait_decl}.
	 * @param ctx the parse tree
	 */
	void exitTrait_decl(RustParser.Trait_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#trait_item}.
	 * @param ctx the parse tree
	 */
	void enterTrait_item(RustParser.Trait_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#trait_item}.
	 * @param ctx the parse tree
	 */
	void exitTrait_item(RustParser.Trait_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ty_default}.
	 * @param ctx the parse tree
	 */
	void enterTy_default(RustParser.Ty_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ty_default}.
	 * @param ctx the parse tree
	 */
	void exitTy_default(RustParser.Ty_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#const_default}.
	 * @param ctx the parse tree
	 */
	void enterConst_default(RustParser.Const_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#const_default}.
	 * @param ctx the parse tree
	 */
	void exitConst_default(RustParser.Const_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#impl_block}.
	 * @param ctx the parse tree
	 */
	void enterImpl_block(RustParser.Impl_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#impl_block}.
	 * @param ctx the parse tree
	 */
	void exitImpl_block(RustParser.Impl_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#impl_what}.
	 * @param ctx the parse tree
	 */
	void enterImpl_what(RustParser.Impl_whatContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#impl_what}.
	 * @param ctx the parse tree
	 */
	void exitImpl_what(RustParser.Impl_whatContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#impl_item}.
	 * @param ctx the parse tree
	 */
	void enterImpl_item(RustParser.Impl_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#impl_item}.
	 * @param ctx the parse tree
	 */
	void exitImpl_item(RustParser.Impl_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#impl_item_tail}.
	 * @param ctx the parse tree
	 */
	void enterImpl_item_tail(RustParser.Impl_item_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#impl_item_tail}.
	 * @param ctx the parse tree
	 */
	void exitImpl_item_tail(RustParser.Impl_item_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(RustParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(RustParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#inner_attr}.
	 * @param ctx the parse tree
	 */
	void enterInner_attr(RustParser.Inner_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#inner_attr}.
	 * @param ctx the parse tree
	 */
	void exitInner_attr(RustParser.Inner_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#tt}.
	 * @param ctx the parse tree
	 */
	void enterTt(RustParser.TtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#tt}.
	 * @param ctx the parse tree
	 */
	void exitTt(RustParser.TtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#tt_delimited}.
	 * @param ctx the parse tree
	 */
	void enterTt_delimited(RustParser.Tt_delimitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#tt_delimited}.
	 * @param ctx the parse tree
	 */
	void exitTt_delimited(RustParser.Tt_delimitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#tt_parens}.
	 * @param ctx the parse tree
	 */
	void enterTt_parens(RustParser.Tt_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#tt_parens}.
	 * @param ctx the parse tree
	 */
	void exitTt_parens(RustParser.Tt_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#tt_brackets}.
	 * @param ctx the parse tree
	 */
	void enterTt_brackets(RustParser.Tt_bracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#tt_brackets}.
	 * @param ctx the parse tree
	 */
	void exitTt_brackets(RustParser.Tt_bracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#tt_block}.
	 * @param ctx the parse tree
	 */
	void enterTt_block(RustParser.Tt_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#tt_block}.
	 * @param ctx the parse tree
	 */
	void exitTt_block(RustParser.Tt_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#macro_tail}.
	 * @param ctx the parse tree
	 */
	void enterMacro_tail(RustParser.Macro_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#macro_tail}.
	 * @param ctx the parse tree
	 */
	void exitMacro_tail(RustParser.Macro_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(RustParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(RustParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#path_parent}.
	 * @param ctx the parse tree
	 */
	void enterPath_parent(RustParser.Path_parentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#path_parent}.
	 * @param ctx the parse tree
	 */
	void exitPath_parent(RustParser.Path_parentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#as_trait}.
	 * @param ctx the parse tree
	 */
	void enterAs_trait(RustParser.As_traitContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#as_trait}.
	 * @param ctx the parse tree
	 */
	void exitAs_trait(RustParser.As_traitContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#path_segment}.
	 * @param ctx the parse tree
	 */
	void enterPath_segment(RustParser.Path_segmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#path_segment}.
	 * @param ctx the parse tree
	 */
	void exitPath_segment(RustParser.Path_segmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#path_segment_no_super}.
	 * @param ctx the parse tree
	 */
	void enterPath_segment_no_super(RustParser.Path_segment_no_superContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#path_segment_no_super}.
	 * @param ctx the parse tree
	 */
	void exitPath_segment_no_super(RustParser.Path_segment_no_superContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#simple_path_segment}.
	 * @param ctx the parse tree
	 */
	void enterSimple_path_segment(RustParser.Simple_path_segmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#simple_path_segment}.
	 * @param ctx the parse tree
	 */
	void exitSimple_path_segment(RustParser.Simple_path_segmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ty_path}.
	 * @param ctx the parse tree
	 */
	void enterTy_path(RustParser.Ty_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ty_path}.
	 * @param ctx the parse tree
	 */
	void exitTy_path(RustParser.Ty_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#for_lifetime}.
	 * @param ctx the parse tree
	 */
	void enterFor_lifetime(RustParser.For_lifetimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#for_lifetime}.
	 * @param ctx the parse tree
	 */
	void exitFor_lifetime(RustParser.For_lifetimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#lifetime_def_list}.
	 * @param ctx the parse tree
	 */
	void enterLifetime_def_list(RustParser.Lifetime_def_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#lifetime_def_list}.
	 * @param ctx the parse tree
	 */
	void exitLifetime_def_list(RustParser.Lifetime_def_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#lifetime_def}.
	 * @param ctx the parse tree
	 */
	void enterLifetime_def(RustParser.Lifetime_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#lifetime_def}.
	 * @param ctx the parse tree
	 */
	void exitLifetime_def(RustParser.Lifetime_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#lifetime_bound}.
	 * @param ctx the parse tree
	 */
	void enterLifetime_bound(RustParser.Lifetime_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#lifetime_bound}.
	 * @param ctx the parse tree
	 */
	void exitLifetime_bound(RustParser.Lifetime_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ty_path_main}.
	 * @param ctx the parse tree
	 */
	void enterTy_path_main(RustParser.Ty_path_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ty_path_main}.
	 * @param ctx the parse tree
	 */
	void exitTy_path_main(RustParser.Ty_path_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ty_path_tail}.
	 * @param ctx the parse tree
	 */
	void enterTy_path_tail(RustParser.Ty_path_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ty_path_tail}.
	 * @param ctx the parse tree
	 */
	void exitTy_path_tail(RustParser.Ty_path_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ty_path_parent}.
	 * @param ctx the parse tree
	 */
	void enterTy_path_parent(RustParser.Ty_path_parentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ty_path_parent}.
	 * @param ctx the parse tree
	 */
	void exitTy_path_parent(RustParser.Ty_path_parentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ty_path_segment}.
	 * @param ctx the parse tree
	 */
	void enterTy_path_segment(RustParser.Ty_path_segmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ty_path_segment}.
	 * @param ctx the parse tree
	 */
	void exitTy_path_segment(RustParser.Ty_path_segmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ty_path_segment_no_super}.
	 * @param ctx the parse tree
	 */
	void enterTy_path_segment_no_super(RustParser.Ty_path_segment_no_superContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ty_path_segment_no_super}.
	 * @param ctx the parse tree
	 */
	void exitTy_path_segment_no_super(RustParser.Ty_path_segment_no_superContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(RustParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(RustParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#where_bound_list}.
	 * @param ctx the parse tree
	 */
	void enterWhere_bound_list(RustParser.Where_bound_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#where_bound_list}.
	 * @param ctx the parse tree
	 */
	void exitWhere_bound_list(RustParser.Where_bound_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#where_bound}.
	 * @param ctx the parse tree
	 */
	void enterWhere_bound(RustParser.Where_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#where_bound}.
	 * @param ctx the parse tree
	 */
	void exitWhere_bound(RustParser.Where_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#colon_bound}.
	 * @param ctx the parse tree
	 */
	void enterColon_bound(RustParser.Colon_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#colon_bound}.
	 * @param ctx the parse tree
	 */
	void exitColon_bound(RustParser.Colon_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#bound}.
	 * @param ctx the parse tree
	 */
	void enterBound(RustParser.BoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#bound}.
	 * @param ctx the parse tree
	 */
	void exitBound(RustParser.BoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#prim_bound}.
	 * @param ctx the parse tree
	 */
	void enterPrim_bound(RustParser.Prim_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#prim_bound}.
	 * @param ctx the parse tree
	 */
	void exitPrim_bound(RustParser.Prim_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ty}.
	 * @param ctx the parse tree
	 */
	void enterTy(RustParser.TyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ty}.
	 * @param ctx the parse tree
	 */
	void exitTy(RustParser.TyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#mut_or_const}.
	 * @param ctx the parse tree
	 */
	void enterMut_or_const(RustParser.Mut_or_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#mut_or_const}.
	 * @param ctx the parse tree
	 */
	void exitMut_or_const(RustParser.Mut_or_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#extern_abi}.
	 * @param ctx the parse tree
	 */
	void enterExtern_abi(RustParser.Extern_abiContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#extern_abi}.
	 * @param ctx the parse tree
	 */
	void exitExtern_abi(RustParser.Extern_abiContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ty_args}.
	 * @param ctx the parse tree
	 */
	void enterTy_args(RustParser.Ty_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ty_args}.
	 * @param ctx the parse tree
	 */
	void exitTy_args(RustParser.Ty_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#lifetime_list}.
	 * @param ctx the parse tree
	 */
	void enterLifetime_list(RustParser.Lifetime_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#lifetime_list}.
	 * @param ctx the parse tree
	 */
	void exitLifetime_list(RustParser.Lifetime_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ty_sum}.
	 * @param ctx the parse tree
	 */
	void enterTy_sum(RustParser.Ty_sumContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ty_sum}.
	 * @param ctx the parse tree
	 */
	void exitTy_sum(RustParser.Ty_sumContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ty_sum_list}.
	 * @param ctx the parse tree
	 */
	void enterTy_sum_list(RustParser.Ty_sum_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ty_sum_list}.
	 * @param ctx the parse tree
	 */
	void exitTy_sum_list(RustParser.Ty_sum_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ty_arg}.
	 * @param ctx the parse tree
	 */
	void enterTy_arg(RustParser.Ty_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ty_arg}.
	 * @param ctx the parse tree
	 */
	void exitTy_arg(RustParser.Ty_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ty_arg_list}.
	 * @param ctx the parse tree
	 */
	void enterTy_arg_list(RustParser.Ty_arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ty_arg_list}.
	 * @param ctx the parse tree
	 */
	void exitTy_arg_list(RustParser.Ty_arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ty_params}.
	 * @param ctx the parse tree
	 */
	void enterTy_params(RustParser.Ty_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ty_params}.
	 * @param ctx the parse tree
	 */
	void exitTy_params(RustParser.Ty_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#lifetime_param}.
	 * @param ctx the parse tree
	 */
	void enterLifetime_param(RustParser.Lifetime_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#lifetime_param}.
	 * @param ctx the parse tree
	 */
	void exitLifetime_param(RustParser.Lifetime_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#lifetime_param_list}.
	 * @param ctx the parse tree
	 */
	void enterLifetime_param_list(RustParser.Lifetime_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#lifetime_param_list}.
	 * @param ctx the parse tree
	 */
	void exitLifetime_param_list(RustParser.Lifetime_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ty_param}.
	 * @param ctx the parse tree
	 */
	void enterTy_param(RustParser.Ty_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ty_param}.
	 * @param ctx the parse tree
	 */
	void exitTy_param(RustParser.Ty_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ty_param_list}.
	 * @param ctx the parse tree
	 */
	void enterTy_param_list(RustParser.Ty_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ty_param_list}.
	 * @param ctx the parse tree
	 */
	void exitTy_param_list(RustParser.Ty_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#pat}.
	 * @param ctx the parse tree
	 */
	void enterPat(RustParser.PatContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#pat}.
	 * @param ctx the parse tree
	 */
	void exitPat(RustParser.PatContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#pat_no_mut}.
	 * @param ctx the parse tree
	 */
	void enterPat_no_mut(RustParser.Pat_no_mutContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#pat_no_mut}.
	 * @param ctx the parse tree
	 */
	void exitPat_no_mut(RustParser.Pat_no_mutContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#pat_range_end}.
	 * @param ctx the parse tree
	 */
	void enterPat_range_end(RustParser.Pat_range_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#pat_range_end}.
	 * @param ctx the parse tree
	 */
	void exitPat_range_end(RustParser.Pat_range_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#pat_lit}.
	 * @param ctx the parse tree
	 */
	void enterPat_lit(RustParser.Pat_litContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#pat_lit}.
	 * @param ctx the parse tree
	 */
	void exitPat_lit(RustParser.Pat_litContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#pat_list}.
	 * @param ctx the parse tree
	 */
	void enterPat_list(RustParser.Pat_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#pat_list}.
	 * @param ctx the parse tree
	 */
	void exitPat_list(RustParser.Pat_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#pat_list_with_dots}.
	 * @param ctx the parse tree
	 */
	void enterPat_list_with_dots(RustParser.Pat_list_with_dotsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#pat_list_with_dots}.
	 * @param ctx the parse tree
	 */
	void exitPat_list_with_dots(RustParser.Pat_list_with_dotsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#pat_list_dots_tail}.
	 * @param ctx the parse tree
	 */
	void enterPat_list_dots_tail(RustParser.Pat_list_dots_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#pat_list_dots_tail}.
	 * @param ctx the parse tree
	 */
	void exitPat_list_dots_tail(RustParser.Pat_list_dots_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#pat_elt}.
	 * @param ctx the parse tree
	 */
	void enterPat_elt(RustParser.Pat_eltContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#pat_elt}.
	 * @param ctx the parse tree
	 */
	void exitPat_elt(RustParser.Pat_eltContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#pat_elt_list}.
	 * @param ctx the parse tree
	 */
	void enterPat_elt_list(RustParser.Pat_elt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#pat_elt_list}.
	 * @param ctx the parse tree
	 */
	void exitPat_elt_list(RustParser.Pat_elt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#pat_fields}.
	 * @param ctx the parse tree
	 */
	void enterPat_fields(RustParser.Pat_fieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#pat_fields}.
	 * @param ctx the parse tree
	 */
	void exitPat_fields(RustParser.Pat_fieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#pat_field}.
	 * @param ctx the parse tree
	 */
	void enterPat_field(RustParser.Pat_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#pat_field}.
	 * @param ctx the parse tree
	 */
	void exitPat_field(RustParser.Pat_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(RustParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(RustParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void enterExpr_no_struct(RustParser.Expr_no_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void exitExpr_no_struct(RustParser.Expr_no_structContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(RustParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(RustParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(RustParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(RustParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#block_with_inner_attrs}.
	 * @param ctx the parse tree
	 */
	void enterBlock_with_inner_attrs(RustParser.Block_with_inner_attrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#block_with_inner_attrs}.
	 * @param ctx the parse tree
	 */
	void exitBlock_with_inner_attrs(RustParser.Block_with_inner_attrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(RustParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(RustParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#stmt_tail}.
	 * @param ctx the parse tree
	 */
	void enterStmt_tail(RustParser.Stmt_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#stmt_tail}.
	 * @param ctx the parse tree
	 */
	void exitStmt_tail(RustParser.Stmt_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#blocky_expr}.
	 * @param ctx the parse tree
	 */
	void enterBlocky_expr(RustParser.Blocky_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#blocky_expr}.
	 * @param ctx the parse tree
	 */
	void exitBlocky_expr(RustParser.Blocky_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#cond_or_pat}.
	 * @param ctx the parse tree
	 */
	void enterCond_or_pat(RustParser.Cond_or_patContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#cond_or_pat}.
	 * @param ctx the parse tree
	 */
	void exitCond_or_pat(RustParser.Cond_or_patContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#loop_label}.
	 * @param ctx the parse tree
	 */
	void enterLoop_label(RustParser.Loop_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#loop_label}.
	 * @param ctx the parse tree
	 */
	void exitLoop_label(RustParser.Loop_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#match_arms}.
	 * @param ctx the parse tree
	 */
	void enterMatch_arms(RustParser.Match_armsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#match_arms}.
	 * @param ctx the parse tree
	 */
	void exitMatch_arms(RustParser.Match_armsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#match_arm_intro}.
	 * @param ctx the parse tree
	 */
	void enterMatch_arm_intro(RustParser.Match_arm_introContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#match_arm_intro}.
	 * @param ctx the parse tree
	 */
	void exitMatch_arm_intro(RustParser.Match_arm_introContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#match_pat}.
	 * @param ctx the parse tree
	 */
	void enterMatch_pat(RustParser.Match_patContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#match_pat}.
	 * @param ctx the parse tree
	 */
	void exitMatch_pat(RustParser.Match_patContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#match_if_clause}.
	 * @param ctx the parse tree
	 */
	void enterMatch_if_clause(RustParser.Match_if_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#match_if_clause}.
	 * @param ctx the parse tree
	 */
	void exitMatch_if_clause(RustParser.Match_if_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_attrs}.
	 * @param ctx the parse tree
	 */
	void enterExpr_attrs(RustParser.Expr_attrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_attrs}.
	 * @param ctx the parse tree
	 */
	void exitExpr_attrs(RustParser.Expr_attrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#expr_inner_attrs}.
	 * @param ctx the parse tree
	 */
	void enterExpr_inner_attrs(RustParser.Expr_inner_attrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#expr_inner_attrs}.
	 * @param ctx the parse tree
	 */
	void exitExpr_inner_attrs(RustParser.Expr_inner_attrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrim_expr(RustParser.Prim_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrim_expr(RustParser.Prim_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#prim_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void enterPrim_expr_no_struct(RustParser.Prim_expr_no_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#prim_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void exitPrim_expr_no_struct(RustParser.Prim_expr_no_structContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#lit}.
	 * @param ctx the parse tree
	 */
	void enterLit(RustParser.LitContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#lit}.
	 * @param ctx the parse tree
	 */
	void exitLit(RustParser.LitContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#closure_params}.
	 * @param ctx the parse tree
	 */
	void enterClosure_params(RustParser.Closure_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#closure_params}.
	 * @param ctx the parse tree
	 */
	void exitClosure_params(RustParser.Closure_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#closure_param}.
	 * @param ctx the parse tree
	 */
	void enterClosure_param(RustParser.Closure_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#closure_param}.
	 * @param ctx the parse tree
	 */
	void exitClosure_param(RustParser.Closure_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#closure_param_list}.
	 * @param ctx the parse tree
	 */
	void enterClosure_param_list(RustParser.Closure_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#closure_param_list}.
	 * @param ctx the parse tree
	 */
	void exitClosure_param_list(RustParser.Closure_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#closure_tail}.
	 * @param ctx the parse tree
	 */
	void enterClosure_tail(RustParser.Closure_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#closure_tail}.
	 * @param ctx the parse tree
	 */
	void exitClosure_tail(RustParser.Closure_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#lifetime_or_expr}.
	 * @param ctx the parse tree
	 */
	void enterLifetime_or_expr(RustParser.Lifetime_or_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#lifetime_or_expr}.
	 * @param ctx the parse tree
	 */
	void exitLifetime_or_expr(RustParser.Lifetime_or_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(RustParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(RustParser.FieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#struct_update_base}.
	 * @param ctx the parse tree
	 */
	void enterStruct_update_base(RustParser.Struct_update_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#struct_update_base}.
	 * @param ctx the parse tree
	 */
	void exitStruct_update_base(RustParser.Struct_update_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(RustParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(RustParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#field_name}.
	 * @param ctx the parse tree
	 */
	void enterField_name(RustParser.Field_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#field_name}.
	 * @param ctx the parse tree
	 */
	void exitField_name(RustParser.Field_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#post_expr}.
	 * @param ctx the parse tree
	 */
	void enterPost_expr(RustParser.Post_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#post_expr}.
	 * @param ctx the parse tree
	 */
	void exitPost_expr(RustParser.Post_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#post_expr_tail}.
	 * @param ctx the parse tree
	 */
	void enterPost_expr_tail(RustParser.Post_expr_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#post_expr_tail}.
	 * @param ctx the parse tree
	 */
	void exitPost_expr_tail(RustParser.Post_expr_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#pre_expr}.
	 * @param ctx the parse tree
	 */
	void enterPre_expr(RustParser.Pre_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#pre_expr}.
	 * @param ctx the parse tree
	 */
	void exitPre_expr(RustParser.Pre_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#cast_expr}.
	 * @param ctx the parse tree
	 */
	void enterCast_expr(RustParser.Cast_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#cast_expr}.
	 * @param ctx the parse tree
	 */
	void exitCast_expr(RustParser.Cast_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#mul_expr}.
	 * @param ctx the parse tree
	 */
	void enterMul_expr(RustParser.Mul_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#mul_expr}.
	 * @param ctx the parse tree
	 */
	void exitMul_expr(RustParser.Mul_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expr(RustParser.Add_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expr(RustParser.Add_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr(RustParser.Shift_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr(RustParser.Shift_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#bit_and_expr}.
	 * @param ctx the parse tree
	 */
	void enterBit_and_expr(RustParser.Bit_and_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#bit_and_expr}.
	 * @param ctx the parse tree
	 */
	void exitBit_and_expr(RustParser.Bit_and_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#bit_xor_expr}.
	 * @param ctx the parse tree
	 */
	void enterBit_xor_expr(RustParser.Bit_xor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#bit_xor_expr}.
	 * @param ctx the parse tree
	 */
	void exitBit_xor_expr(RustParser.Bit_xor_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#bit_or_expr}.
	 * @param ctx the parse tree
	 */
	void enterBit_or_expr(RustParser.Bit_or_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#bit_or_expr}.
	 * @param ctx the parse tree
	 */
	void exitBit_or_expr(RustParser.Bit_or_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#cmp_expr}.
	 * @param ctx the parse tree
	 */
	void enterCmp_expr(RustParser.Cmp_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#cmp_expr}.
	 * @param ctx the parse tree
	 */
	void exitCmp_expr(RustParser.Cmp_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(RustParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(RustParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void enterOr_expr(RustParser.Or_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void exitOr_expr(RustParser.Or_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#range_expr}.
	 * @param ctx the parse tree
	 */
	void enterRange_expr(RustParser.Range_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#range_expr}.
	 * @param ctx the parse tree
	 */
	void exitRange_expr(RustParser.Range_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(RustParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(RustParser.Assign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#post_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void enterPost_expr_no_struct(RustParser.Post_expr_no_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#post_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void exitPost_expr_no_struct(RustParser.Post_expr_no_structContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#pre_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void enterPre_expr_no_struct(RustParser.Pre_expr_no_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#pre_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void exitPre_expr_no_struct(RustParser.Pre_expr_no_structContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#cast_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void enterCast_expr_no_struct(RustParser.Cast_expr_no_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#cast_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void exitCast_expr_no_struct(RustParser.Cast_expr_no_structContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#mul_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void enterMul_expr_no_struct(RustParser.Mul_expr_no_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#mul_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void exitMul_expr_no_struct(RustParser.Mul_expr_no_structContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#add_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expr_no_struct(RustParser.Add_expr_no_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#add_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expr_no_struct(RustParser.Add_expr_no_structContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#shift_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr_no_struct(RustParser.Shift_expr_no_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#shift_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr_no_struct(RustParser.Shift_expr_no_structContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#bit_and_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void enterBit_and_expr_no_struct(RustParser.Bit_and_expr_no_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#bit_and_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void exitBit_and_expr_no_struct(RustParser.Bit_and_expr_no_structContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#bit_xor_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void enterBit_xor_expr_no_struct(RustParser.Bit_xor_expr_no_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#bit_xor_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void exitBit_xor_expr_no_struct(RustParser.Bit_xor_expr_no_structContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#bit_or_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void enterBit_or_expr_no_struct(RustParser.Bit_or_expr_no_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#bit_or_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void exitBit_or_expr_no_struct(RustParser.Bit_or_expr_no_structContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#cmp_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void enterCmp_expr_no_struct(RustParser.Cmp_expr_no_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#cmp_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void exitCmp_expr_no_struct(RustParser.Cmp_expr_no_structContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#and_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr_no_struct(RustParser.And_expr_no_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#and_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr_no_struct(RustParser.And_expr_no_structContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#or_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void enterOr_expr_no_struct(RustParser.Or_expr_no_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#or_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void exitOr_expr_no_struct(RustParser.Or_expr_no_structContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#range_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void enterRange_expr_no_struct(RustParser.Range_expr_no_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#range_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void exitRange_expr_no_struct(RustParser.Range_expr_no_structContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#assign_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr_no_struct(RustParser.Assign_expr_no_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#assign_expr_no_struct}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr_no_struct(RustParser.Assign_expr_no_structContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(RustParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(RustParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RustParser#any_ident}.
	 * @param ctx the parse tree
	 */
	void enterAny_ident(RustParser.Any_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link RustParser#any_ident}.
	 * @param ctx the parse tree
	 */
	void exitAny_ident(RustParser.Any_identContext ctx);
}