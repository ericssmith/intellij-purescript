// This is a generated file. Not intended for manual editing.
package com.demo.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.demo.psi.PurescriptTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class PurescriptParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == PS_AEXP) {
      r = aexp(b, 0);
    }
    else if (t == PS_ALT) {
      r = alt(b, 0);
    }
    else if (t == PS_ALTS) {
      r = alts(b, 0);
    }
    else if (t == PS_APAT) {
      r = apat(b, 0);
    }
    else if (t == PS_ATYPE) {
      r = atype(b, 0);
    }
    else if (t == PS_CASEEXP) {
      r = caseexp(b, 0);
    }
    else if (t == PS_CDECL) {
      r = cdecl(b, 0);
    }
    else if (t == PS_CDECLS) {
      r = cdecls(b, 0);
    }
    else if (t == PS_CLASSDECL) {
      r = classdecl(b, 0);
    }
    else if (t == PS_CLAZZ) {
      r = clazz(b, 0);
    }
    else if (t == PS_CNAME) {
      r = cname(b, 0);
    }
    else if (t == PS_COMMENTS) {
      r = comments(b, 0);
    }
    else if (t == PS_CON) {
      r = con(b, 0);
    }
    else if (t == PS_CONSTR) {
      r = constr(b, 0);
    }
    else if (t == PS_CONSTRS) {
      r = constrs(b, 0);
    }
    else if (t == PS_CONTEXT) {
      r = context(b, 0);
    }
    else if (t == PS_DATADECL) {
      r = datadecl(b, 0);
    }
    else if (t == PS_DECL) {
      r = decl(b, 0);
    }
    else if (t == PS_DECLS) {
      r = decls(b, 0);
    }
    else if (t == PS_DOEXP) {
      r = doexp(b, 0);
    }
    else if (t == PS_DOT_DOT_PARENS) {
      r = dot_dot_parens(b, 0);
    }
    else if (t == PS_EXP) {
      r = exp(b, 0);
    }
    else if (t == PS_EXPORT) {
      r = export(b, 0);
    }
    else if (t == PS_EXPORT_1) {
      r = export1(b, 0);
    }
    else if (t == PS_EXPORT_2) {
      r = export2(b, 0);
    }
    else if (t == PS_EXPORT_3) {
      r = export3(b, 0);
    }
    else if (t == PS_EXPORT_4) {
      r = export4(b, 0);
    }
    else if (t == PS_EXPORTS) {
      r = exports(b, 0);
    }
    else if (t == PS_FEXP) {
      r = fexp(b, 0);
    }
    else if (t == PS_FIELDDECL) {
      r = fielddecl(b, 0);
    }
    else if (t == PS_FIXITY) {
      r = fixity(b, 0);
    }
    else if (t == PS_FORIMPDECL) {
      r = forimpdecl(b, 0);
    }
    else if (t == PS_FUNID) {
      r = funid(b, 0);
    }
    else if (t == PS_FUNLHS) {
      r = funlhs(b, 0);
    }
    else if (t == PS_FUNRHS) {
      r = funrhs(b, 0);
    }
    else if (t == PS_GCON) {
      r = gcon(b, 0);
    }
    else if (t == PS_GDPAT) {
      r = gdpat(b, 0);
    }
    else if (t == PS_GDRHS) {
      r = gdrhs(b, 0);
    }
    else if (t == PS_GENDECL) {
      r = gendecl(b, 0);
    }
    else if (t == PS_GTYCON) {
      r = gtycon(b, 0);
    }
    else if (t == PS_GUARD) {
      r = guard(b, 0);
    }
    else if (t == PS_GUARDS) {
      r = guards(b, 0);
    }
    else if (t == PS_IDECL) {
      r = idecl(b, 0);
    }
    else if (t == PS_IDECLS) {
      r = idecls(b, 0);
    }
    else if (t == PS_IFEXP) {
      r = ifexp(b, 0);
    }
    else if (t == PS_IMPDECL) {
      r = impdecl(b, 0);
    }
    else if (t == PS_IMPDECLS) {
      r = impdecls(b, 0);
    }
    else if (t == PS_IMPORT_0) {
      r = import0(b, 0);
    }
    else if (t == PS_IMPORT_1) {
      r = import1(b, 0);
    }
    else if (t == PS_IMPORT_2) {
      r = import2(b, 0);
    }
    else if (t == PS_IMPSPEC) {
      r = impspec(b, 0);
    }
    else if (t == PS_INFIXEXP) {
      r = infixexp(b, 0);
    }
    else if (t == PS_INSTANCEDECL) {
      r = instancedecl(b, 0);
    }
    else if (t == PS_LAMBDAEXP) {
      r = lambdaexp(b, 0);
    }
    else if (t == PS_LETEXP) {
      r = letexp(b, 0);
    }
    else if (t == PS_LEXP) {
      r = lexp(b, 0);
    }
    else if (t == PS_LITERAL) {
      r = literal(b, 0);
    }
    else if (t == PS_LPAT) {
      r = lpat(b, 0);
    }
    else if (t == PS_MODID) {
      r = modid(b, 0);
    }
    else if (t == PS_NEWTYPECONSTR) {
      r = newtypeconstr(b, 0);
    }
    else if (t == PS_NEWTYPEDECL) {
      r = newtypedecl(b, 0);
    }
    else if (t == PS_OP) {
      r = op(b, 0);
    }
    else if (t == PS_OPS) {
      r = ops(b, 0);
    }
    else if (t == PS_PAT) {
      r = pat(b, 0);
    }
    else if (t == PS_PROPERTY) {
      r = property(b, 0);
    }
    else if (t == PS_QCON) {
      r = qcon(b, 0);
    }
    else if (t == PS_QCONID) {
      r = qconid(b, 0);
    }
    else if (t == PS_QOP) {
      r = qop(b, 0);
    }
    else if (t == PS_QTYCLS) {
      r = qtycls(b, 0);
    }
    else if (t == PS_QTYCON) {
      r = qtycon(b, 0);
    }
    else if (t == PS_QUANTIFIER) {
      r = quantifier(b, 0);
    }
    else if (t == PS_QVAR) {
      r = qvar(b, 0);
    }
    else if (t == PS_QVARID) {
      r = qvarid(b, 0);
    }
    else if (t == PS_QVAROP) {
      r = qvarop(b, 0);
    }
    else if (t == PS_QVARSYM) {
      r = qvarsym(b, 0);
    }
    else if (t == PS_REC_CONSTR) {
      r = rec_constr(b, 0);
    }
    else if (t == PS_SCONTEXT) {
      r = scontext(b, 0);
    }
    else if (t == PS_SIMPLECLASS) {
      r = simpleclass(b, 0);
    }
    else if (t == PS_SIMPLETYPE) {
      r = simpletype(b, 0);
    }
    else if (t == PS_SLASH_SLASH_PARENS) {
      r = slash_slash_parens(b, 0);
    }
    else if (t == PS_STMT) {
      r = stmt(b, 0);
    }
    else if (t == PS_STMTS) {
      r = stmts(b, 0);
    }
    else if (t == PS_TOPDECL) {
      r = topdecl(b, 0);
    }
    else if (t == PS_TOPDECLS) {
      r = topdecls(b, 0);
    }
    else if (t == PS_TYCLS) {
      r = tycls(b, 0);
    }
    else if (t == PS_TYPE) {
      r = type(b, 0);
    }
    else if (t == PS_TYPEDECL) {
      r = typedecl(b, 0);
    }
    else if (t == PS_TYPESIGDECL) {
      r = typesigdecl(b, 0);
    }
    else if (t == PS_TYPESIGLHS) {
      r = typesiglhs(b, 0);
    }
    else if (t == PS_TYVAR) {
      r = tyvar(b, 0);
    }
    else if (t == PS_VAR) {
      r = var(b, 0);
    }
    else if (t == PS_VAROP) {
      r = varop(b, 0);
    }
    else if (t == PS_VARS) {
      r = vars(b, 0);
    }
    else if (t == PS_VARSYM) {
      r = varsym(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return module_declaration(b, l + 1);
  }

  /* ********************************************************** */
  // qvar DOT qvar | qvar | var | gcon | qcon | literal | onl LEFT_PAREN exp RIGHT_PAREN | LEFT_BRACKET exp RIGHT_BRACKET | LEFT_PAREN infixexp qop RIGHT_PAREN | LEFT_PAREN qop infixexp RIGHT_PAREN | lambdaexp | LEFT_BRACE exp* (COMMA exp)* RIGHT_BRACE
  public static boolean aexp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aexp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<aexp>");
    r = aexp_0(b, l + 1);
    if (!r) r = qvar(b, l + 1);
    if (!r) r = var(b, l + 1);
    if (!r) r = gcon(b, l + 1);
    if (!r) r = qcon(b, l + 1);
    if (!r) r = literal(b, l + 1);
    if (!r) r = aexp_6(b, l + 1);
    if (!r) r = aexp_7(b, l + 1);
    if (!r) r = aexp_8(b, l + 1);
    if (!r) r = aexp_9(b, l + 1);
    if (!r) r = lambdaexp(b, l + 1);
    if (!r) r = aexp_11(b, l + 1);
    exit_section_(b, l, m, PS_AEXP, r, false, null);
    return r;
  }

  // qvar DOT qvar
  private static boolean aexp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aexp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qvar(b, l + 1);
    r = r && consumeToken(b, PS_DOT);
    r = r && qvar(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // onl LEFT_PAREN exp RIGHT_PAREN
  private static boolean aexp_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aexp_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = onl(b, l + 1);
    r = r && consumeToken(b, PS_LEFT_PAREN);
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, PS_RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_BRACKET exp RIGHT_BRACKET
  private static boolean aexp_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aexp_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_LEFT_BRACKET);
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, PS_RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_PAREN infixexp qop RIGHT_PAREN
  private static boolean aexp_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aexp_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_LEFT_PAREN);
    r = r && infixexp(b, l + 1);
    r = r && qop(b, l + 1);
    r = r && consumeToken(b, PS_RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_PAREN qop infixexp RIGHT_PAREN
  private static boolean aexp_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aexp_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_LEFT_PAREN);
    r = r && qop(b, l + 1);
    r = r && infixexp(b, l + 1);
    r = r && consumeToken(b, PS_RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_BRACE exp* (COMMA exp)* RIGHT_BRACE
  private static boolean aexp_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aexp_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_LEFT_BRACE);
    r = r && aexp_11_1(b, l + 1);
    r = r && aexp_11_2(b, l + 1);
    r = r && consumeToken(b, PS_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // exp*
  private static boolean aexp_11_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aexp_11_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!exp(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "aexp_11_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (COMMA exp)*
  private static boolean aexp_11_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aexp_11_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!aexp_11_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "aexp_11_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA exp
  private static boolean aexp_11_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aexp_11_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_COMMA);
    r = r && exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // pat RIGHT_ARROW exp onl (WHERE decls)* | pat gdpat (WHERE decls)*
  public static boolean alt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<alt>");
    r = alt_0(b, l + 1);
    if (!r) r = alt_1(b, l + 1);
    exit_section_(b, l, m, PS_ALT, r, false, null);
    return r;
  }

  // pat RIGHT_ARROW exp onl (WHERE decls)*
  private static boolean alt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alt_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pat(b, l + 1);
    r = r && consumeToken(b, PS_RIGHT_ARROW);
    r = r && exp(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && alt_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (WHERE decls)*
  private static boolean alt_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alt_0_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!alt_0_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "alt_0_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WHERE decls
  private static boolean alt_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alt_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_WHERE);
    r = r && decls(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // pat gdpat (WHERE decls)*
  private static boolean alt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pat(b, l + 1);
    r = r && gdpat(b, l + 1);
    r = r && alt_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (WHERE decls)*
  private static boolean alt_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alt_1_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!alt_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "alt_1_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WHERE decls
  private static boolean alt_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alt_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_WHERE);
    r = r && decls(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // alt+
  public static boolean alts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alts")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<alts>");
    r = alt(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!alt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "alts", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, PS_ALTS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // var (AT apat)* | gcon | qcon | literal | UNDERSCORE | LEFT_PAREN pat RIGHT_PAREN | LEFT_BRACE exp (COMMA exp)* RIGHT_BRACE
  public static boolean apat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "apat")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<apat>");
    r = apat_0(b, l + 1);
    if (!r) r = gcon(b, l + 1);
    if (!r) r = qcon(b, l + 1);
    if (!r) r = literal(b, l + 1);
    if (!r) r = consumeToken(b, PS_UNDERSCORE);
    if (!r) r = apat_5(b, l + 1);
    if (!r) r = apat_6(b, l + 1);
    exit_section_(b, l, m, PS_APAT, r, false, null);
    return r;
  }

  // var (AT apat)*
  private static boolean apat_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "apat_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var(b, l + 1);
    r = r && apat_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AT apat)*
  private static boolean apat_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "apat_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!apat_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "apat_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // AT apat
  private static boolean apat_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "apat_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_AT);
    r = r && apat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_PAREN pat RIGHT_PAREN
  private static boolean apat_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "apat_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_LEFT_PAREN);
    r = r && pat(b, l + 1);
    r = r && consumeToken(b, PS_RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_BRACE exp (COMMA exp)* RIGHT_BRACE
  private static boolean apat_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "apat_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_LEFT_BRACE);
    r = r && exp(b, l + 1);
    r = r && apat_6_2(b, l + 1);
    r = r && consumeToken(b, PS_RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA exp)*
  private static boolean apat_6_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "apat_6_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!apat_6_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "apat_6_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA exp
  private static boolean apat_6_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "apat_6_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_COMMA);
    r = r && exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // gtycon | tyvar | LEFT_PAREN type RIGHT_PAREN | rec_constr | varop
  public static boolean atype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atype")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<atype>");
    r = gtycon(b, l + 1);
    if (!r) r = tyvar(b, l + 1);
    if (!r) r = atype_2(b, l + 1);
    if (!r) r = rec_constr(b, l + 1);
    if (!r) r = varop(b, l + 1);
    exit_section_(b, l, m, PS_ATYPE, r, false, null);
    return r;
  }

  // LEFT_PAREN type RIGHT_PAREN
  private static boolean atype_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atype_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_LEFT_PAREN);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, PS_RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // impdecls topdecls
  static boolean body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = impdecls(b, l + 1);
    r = r && topdecls(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // onl CASE exp onl OF NEWLINE alts
  public static boolean caseexp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseexp")) return false;
    if (!nextTokenIs(b, "<caseexp>", PS_CASE, PS_NEWLINE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<caseexp>");
    r = onl(b, l + 1);
    r = r && consumeToken(b, PS_CASE);
    r = r && exp(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && consumeTokens(b, 0, PS_OF, PS_NEWLINE);
    r = r && alts(b, l + 1);
    exit_section_(b, l, m, PS_CASEEXP, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // typesigdecl
  public static boolean cdecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cdecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<cdecl>");
    r = typesigdecl(b, l + 1);
    exit_section_(b, l, m, PS_CDECL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (cdecl onl)+
  public static boolean cdecls(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cdecls")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<cdecls>");
    r = cdecls_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!cdecls_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cdecls", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, PS_CDECLS, r, false, null);
    return r;
  }

  // cdecl onl
  private static boolean cdecls_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cdecls_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cdecl(b, l + 1);
    r = r && onl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CLASS (scontext DOUBLE_LEFT_ARROW)* con (var)*  (WHERE onl cdecls)*
  public static boolean classdecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classdecl")) return false;
    if (!nextTokenIs(b, PS_CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_CLASS);
    r = r && classdecl_1(b, l + 1);
    r = r && con(b, l + 1);
    r = r && classdecl_3(b, l + 1);
    r = r && classdecl_4(b, l + 1);
    exit_section_(b, m, PS_CLASSDECL, r);
    return r;
  }

  // (scontext DOUBLE_LEFT_ARROW)*
  private static boolean classdecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classdecl_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!classdecl_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classdecl_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // scontext DOUBLE_LEFT_ARROW
  private static boolean classdecl_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classdecl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = scontext(b, l + 1);
    r = r && consumeToken(b, PS_DOUBLE_LEFT_ARROW);
    exit_section_(b, m, null, r);
    return r;
  }

  // (var)*
  private static boolean classdecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classdecl_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!classdecl_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classdecl_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (var)
  private static boolean classdecl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classdecl_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (WHERE onl cdecls)*
  private static boolean classdecl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classdecl_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!classdecl_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classdecl_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WHERE onl cdecls
  private static boolean classdecl_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classdecl_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_WHERE);
    r = r && onl(b, l + 1);
    r = r && cdecls(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // qtycls tyvar+ | qtycls LEFT_PAREN tyvar atype* RIGHT_PAREN vars*
  public static boolean clazz(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz")) return false;
    if (!nextTokenIs(b, PS_CONID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = clazz_0(b, l + 1);
    if (!r) r = clazz_1(b, l + 1);
    exit_section_(b, m, PS_CLAZZ, r);
    return r;
  }

  // qtycls tyvar+
  private static boolean clazz_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qtycls(b, l + 1);
    r = r && clazz_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tyvar+
  private static boolean clazz_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tyvar(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!tyvar(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "clazz_0_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // qtycls LEFT_PAREN tyvar atype* RIGHT_PAREN vars*
  private static boolean clazz_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qtycls(b, l + 1);
    r = r && consumeToken(b, PS_LEFT_PAREN);
    r = r && tyvar(b, l + 1);
    r = r && clazz_1_3(b, l + 1);
    r = r && consumeToken(b, PS_RIGHT_PAREN);
    r = r && clazz_1_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // atype*
  private static boolean clazz_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_1_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!atype(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "clazz_1_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // vars*
  private static boolean clazz_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "clazz_1_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!vars(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "clazz_1_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // var | con
  public static boolean cname(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cname")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<cname>");
    r = var(b, l + 1);
    if (!r) r = con(b, l + 1);
    exit_section_(b, l, m, PS_CNAME, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // COMMENT | NCOMMENT | NCOMMENT_START | NCOMMENT_END
  public static boolean comments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<comments>");
    r = consumeToken(b, PS_COMMENT);
    if (!r) r = consumeToken(b, PS_NCOMMENT);
    if (!r) r = consumeToken(b, PS_NCOMMENT_START);
    if (!r) r = consumeToken(b, PS_NCOMMENT_END);
    exit_section_(b, l, m, PS_COMMENTS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CONID
  public static boolean con(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "con")) return false;
    if (!nextTokenIs(b, PS_CONID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_CONID);
    exit_section_(b, m, PS_CON, r);
    return r;
  }

  /* ********************************************************** */
  // con rec_constr | type
  public static boolean constr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<constr>");
    r = constr_0(b, l + 1);
    if (!r) r = type(b, l + 1);
    exit_section_(b, l, m, PS_CONSTR, r, false, null);
    return r;
  }

  // con rec_constr
  private static boolean constr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = con(b, l + 1);
    r = r && rec_constr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // constr onl (VERTICAL_BAR constr onl)*
  public static boolean constrs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constrs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<constrs>");
    r = constr(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && constrs_2(b, l + 1);
    exit_section_(b, l, m, PS_CONSTRS, r, false, null);
    return r;
  }

  // (VERTICAL_BAR constr onl)*
  private static boolean constrs_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constrs_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!constrs_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "constrs_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // VERTICAL_BAR constr onl
  private static boolean constrs_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constrs_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_VERTICAL_BAR);
    r = r && constr(b, l + 1);
    r = r && onl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // clazz | LEFT_PAREN clazz (COMMA clazz)* RIGHT_PAREN
  public static boolean context(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context")) return false;
    if (!nextTokenIs(b, "<context>", PS_CONID, PS_LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<context>");
    r = clazz(b, l + 1);
    if (!r) r = context_1(b, l + 1);
    exit_section_(b, l, m, PS_CONTEXT, r, false, null);
    return r;
  }

  // LEFT_PAREN clazz (COMMA clazz)* RIGHT_PAREN
  private static boolean context_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_LEFT_PAREN);
    r = r && clazz(b, l + 1);
    r = r && context_1_2(b, l + 1);
    r = r && consumeToken(b, PS_RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA clazz)*
  private static boolean context_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_1_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!context_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "context_1_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA clazz
  private static boolean context_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_COMMA);
    r = r && clazz(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DATA simpletype onl EQUAL onl constrs
  public static boolean datadecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "datadecl")) return false;
    if (!nextTokenIs(b, PS_DATA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_DATA);
    r = r && simpletype(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && consumeToken(b, PS_EQUAL);
    r = r && onl(b, l + 1);
    r = r && constrs(b, l + 1);
    exit_section_(b, m, PS_DATADECL, r);
    return r;
  }

  /* ********************************************************** */
  // gendecl | funlhs funrhs
  public static boolean decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<decl>");
    r = gendecl(b, l + 1);
    if (!r) r = decl_1(b, l + 1);
    exit_section_(b, l, m, PS_DECL, r, false, null);
    return r;
  }

  // funlhs funrhs
  private static boolean decl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = funlhs(b, l + 1);
    r = r && funrhs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // decl+
  public static boolean decls(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decls")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<decls>");
    r = decl(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!decl(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "decls", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, PS_DECLS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DO onl stmts
  public static boolean doexp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doexp")) return false;
    if (!nextTokenIs(b, PS_DO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_DO);
    r = r && onl(b, l + 1);
    r = r && stmts(b, l + 1);
    exit_section_(b, m, PS_DOEXP, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_PAREN DOT DOT RIGHT_PAREN
  public static boolean dot_dot_parens(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_dot_parens")) return false;
    if (!nextTokenIs(b, PS_LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PS_LEFT_PAREN, PS_DOT, PS_DOT, PS_RIGHT_PAREN);
    exit_section_(b, m, PS_DOT_DOT_PARENS, r);
    return r;
  }

  /* ********************************************************** */
  // infixexp COLON_COLON type | infixexp
  public static boolean exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<exp>");
    r = exp_0(b, l + 1);
    if (!r) r = infixexp(b, l + 1);
    exit_section_(b, l, m, PS_EXP, r, false, null);
    return r;
  }

  // infixexp COLON_COLON type
  private static boolean exp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = infixexp(b, l + 1);
    r = r && consumeToken(b, PS_COLON_COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // export1 | export2 | export3 | export4
  public static boolean export(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<export>");
    r = export1(b, l + 1);
    if (!r) r = export2(b, l + 1);
    if (!r) r = export3(b, l + 1);
    if (!r) r = export4(b, l + 1);
    exit_section_(b, l, m, PS_EXPORT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // qvar
  public static boolean export1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<export 1>");
    r = qvar(b, l + 1);
    exit_section_(b, l, m, PS_EXPORT_1, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // qcon onl (dot_dot_parens | LEFT_PAREN onl (cname onl (onl COMMA onl cname)*)? onl RIGHT_PAREN)?
  public static boolean export2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export2")) return false;
    if (!nextTokenIs(b, PS_CONID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qcon(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && export2_2(b, l + 1);
    exit_section_(b, m, PS_EXPORT_2, r);
    return r;
  }

  // (dot_dot_parens | LEFT_PAREN onl (cname onl (onl COMMA onl cname)*)? onl RIGHT_PAREN)?
  private static boolean export2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export2_2")) return false;
    export2_2_0(b, l + 1);
    return true;
  }

  // dot_dot_parens | LEFT_PAREN onl (cname onl (onl COMMA onl cname)*)? onl RIGHT_PAREN
  private static boolean export2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dot_dot_parens(b, l + 1);
    if (!r) r = export2_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_PAREN onl (cname onl (onl COMMA onl cname)*)? onl RIGHT_PAREN
  private static boolean export2_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export2_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_LEFT_PAREN);
    r = r && onl(b, l + 1);
    r = r && export2_2_0_1_2(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && consumeToken(b, PS_RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (cname onl (onl COMMA onl cname)*)?
  private static boolean export2_2_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export2_2_0_1_2")) return false;
    export2_2_0_1_2_0(b, l + 1);
    return true;
  }

  // cname onl (onl COMMA onl cname)*
  private static boolean export2_2_0_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export2_2_0_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cname(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && export2_2_0_1_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (onl COMMA onl cname)*
  private static boolean export2_2_0_1_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export2_2_0_1_2_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!export2_2_0_1_2_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "export2_2_0_1_2_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // onl COMMA onl cname
  private static boolean export2_2_0_1_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export2_2_0_1_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = onl(b, l + 1);
    r = r && consumeToken(b, PS_COMMA);
    r = r && onl(b, l + 1);
    r = r && cname(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MODULE modid
  public static boolean export3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export3")) return false;
    if (!nextTokenIs(b, PS_MODULE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_MODULE);
    r = r && modid(b, l + 1);
    exit_section_(b, m, PS_EXPORT_3, r);
    return r;
  }

  /* ********************************************************** */
  // slash_slash_parens
  public static boolean export4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export4")) return false;
    if (!nextTokenIs(b, PS_LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = slash_slash_parens(b, l + 1);
    exit_section_(b, m, PS_EXPORT_4, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_PAREN onl export (onl COMMA? onl export onl)* onl COMMA? onl RIGHT_PAREN
  public static boolean exports(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exports")) return false;
    if (!nextTokenIs(b, PS_LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_LEFT_PAREN);
    r = r && onl(b, l + 1);
    r = r && export(b, l + 1);
    r = r && exports_3(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && exports_5(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && consumeToken(b, PS_RIGHT_PAREN);
    exit_section_(b, m, PS_EXPORTS, r);
    return r;
  }

  // (onl COMMA? onl export onl)*
  private static boolean exports_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exports_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!exports_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exports_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // onl COMMA? onl export onl
  private static boolean exports_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exports_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = onl(b, l + 1);
    r = r && exports_3_0_1(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && export(b, l + 1);
    r = r && onl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean exports_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exports_3_0_1")) return false;
    consumeToken(b, PS_COMMA);
    return true;
  }

  // COMMA?
  private static boolean exports_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exports_5")) return false;
    consumeToken(b, PS_COMMA);
    return true;
  }

  /* ********************************************************** */
  // (fexp)* aexp+
  public static boolean fexp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fexp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<fexp>");
    r = fexp_0(b, l + 1);
    r = r && fexp_1(b, l + 1);
    exit_section_(b, l, m, PS_FEXP, r, false, null);
    return r;
  }

  // (fexp)*
  private static boolean fexp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fexp_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!fexp_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fexp_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (fexp)
  private static boolean fexp_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fexp_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fexp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // aexp+
  private static boolean fexp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fexp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = aexp(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!aexp(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fexp_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // vars COLON_COLON type
  public static boolean fielddecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fielddecl")) return false;
    if (!nextTokenIs(b, "<fielddecl>", PS_LEFT_PAREN, PS_VARID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<fielddecl>");
    r = vars(b, l + 1);
    r = r && consumeToken(b, PS_COLON_COLON);
    r = r && type(b, l + 1);
    exit_section_(b, l, m, PS_FIELDDECL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INFIXL | INFIXR | INFIX
  public static boolean fixity(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fixity")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<fixity>");
    r = consumeToken(b, PS_INFIXL);
    if (!r) r = consumeToken(b, PS_INFIXR);
    if (!r) r = consumeToken(b, PS_INFIX);
    exit_section_(b, l, m, PS_FIXITY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FOREIGN DATA? decl
  public static boolean forimpdecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forimpdecl")) return false;
    if (!nextTokenIs(b, PS_FOREIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_FOREIGN);
    r = r && forimpdecl_1(b, l + 1);
    r = r && decl(b, l + 1);
    exit_section_(b, m, PS_FORIMPDECL, r);
    return r;
  }

  // DATA?
  private static boolean forimpdecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forimpdecl_1")) return false;
    consumeToken(b, PS_DATA);
    return true;
  }

  /* ********************************************************** */
  // var
  public static boolean funid(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funid")) return false;
    if (!nextTokenIs(b, "<funid>", PS_LEFT_PAREN, PS_VARID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<funid>");
    r = var(b, l + 1);
    exit_section_(b, l, m, PS_FUNID, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // funid apat? (apat)*
  public static boolean funlhs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funlhs")) return false;
    if (!nextTokenIs(b, "<funlhs>", PS_LEFT_PAREN, PS_VARID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<funlhs>");
    r = funid(b, l + 1);
    r = r && funlhs_1(b, l + 1);
    r = r && funlhs_2(b, l + 1);
    exit_section_(b, l, m, PS_FUNLHS, r, false, null);
    return r;
  }

  // apat?
  private static boolean funlhs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funlhs_1")) return false;
    apat(b, l + 1);
    return true;
  }

  // (apat)*
  private static boolean funlhs_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funlhs_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!funlhs_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "funlhs_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (apat)
  private static boolean funlhs_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funlhs_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = apat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EQUAL onl exp onl (WHERE onl decls)* | gdrhs (WHERE decls)*
  public static boolean funrhs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funrhs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<funrhs>");
    r = funrhs_0(b, l + 1);
    if (!r) r = funrhs_1(b, l + 1);
    exit_section_(b, l, m, PS_FUNRHS, r, false, null);
    return r;
  }

  // EQUAL onl exp onl (WHERE onl decls)*
  private static boolean funrhs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funrhs_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_EQUAL);
    r = r && onl(b, l + 1);
    r = r && exp(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && funrhs_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (WHERE onl decls)*
  private static boolean funrhs_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funrhs_0_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!funrhs_0_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "funrhs_0_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WHERE onl decls
  private static boolean funrhs_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funrhs_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_WHERE);
    r = r && onl(b, l + 1);
    r = r && decls(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // gdrhs (WHERE decls)*
  private static boolean funrhs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funrhs_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = gdrhs(b, l + 1);
    r = r && funrhs_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (WHERE decls)*
  private static boolean funrhs_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funrhs_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!funrhs_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "funrhs_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // WHERE decls
  private static boolean funrhs_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funrhs_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_WHERE);
    r = r && decls(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_BRACKET RIGHT_BRACKET | qcon
  public static boolean gcon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gcon")) return false;
    if (!nextTokenIs(b, "<gcon>", PS_CONID, PS_LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<gcon>");
    r = parseTokens(b, 0, PS_LEFT_BRACKET, PS_RIGHT_BRACKET);
    if (!r) r = qcon(b, l + 1);
    exit_section_(b, l, m, PS_GCON, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // guards RIGHT_ARROW exp
  public static boolean gdpat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gdpat")) return false;
    if (!nextTokenIs(b, "<gdpat>", PS_NEWLINE, PS_VERTICAL_BAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<gdpat>");
    r = guards(b, l + 1);
    r = r && consumeToken(b, PS_RIGHT_ARROW);
    r = r && exp(b, l + 1);
    exit_section_(b, l, m, PS_GDPAT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // guards EQUAL exp onl gdrhs?
  public static boolean gdrhs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gdrhs")) return false;
    if (!nextTokenIs(b, "<gdrhs>", PS_NEWLINE, PS_VERTICAL_BAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<gdrhs>");
    r = guards(b, l + 1);
    r = r && consumeToken(b, PS_EQUAL);
    r = r && exp(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && gdrhs_4(b, l + 1);
    exit_section_(b, l, m, PS_GDRHS, r, false, null);
    return r;
  }

  // gdrhs?
  private static boolean gdrhs_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gdrhs_4")) return false;
    gdrhs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // typesigdecl | fixity INTEGER? ops
  public static boolean gendecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gendecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<gendecl>");
    r = typesigdecl(b, l + 1);
    if (!r) r = gendecl_1(b, l + 1);
    exit_section_(b, l, m, PS_GENDECL, r, false, null);
    return r;
  }

  // fixity INTEGER? ops
  private static boolean gendecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gendecl_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fixity(b, l + 1);
    r = r && gendecl_1_1(b, l + 1);
    r = r && ops(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INTEGER?
  private static boolean gendecl_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gendecl_1_1")) return false;
    consumeToken(b, PS_INTEGER);
    return true;
  }

  /* ********************************************************** */
  // qcon | LEFT_PAREN RIGHT_PAREN | LEFT_PAREN RIGHT_ARROW RIGHT_PAREN
  public static boolean gtycon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gtycon")) return false;
    if (!nextTokenIs(b, "<gtycon>", PS_CONID, PS_LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<gtycon>");
    r = qcon(b, l + 1);
    if (!r) r = parseTokens(b, 0, PS_LEFT_PAREN, PS_RIGHT_PAREN);
    if (!r) r = parseTokens(b, 0, PS_LEFT_PAREN, PS_RIGHT_ARROW, PS_RIGHT_PAREN);
    exit_section_(b, l, m, PS_GTYCON, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // pat LEFT_ARROW infixexp | LET decls | infixexp
  public static boolean guard(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "guard")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<guard>");
    r = guard_0(b, l + 1);
    if (!r) r = guard_1(b, l + 1);
    if (!r) r = infixexp(b, l + 1);
    exit_section_(b, l, m, PS_GUARD, r, false, null);
    return r;
  }

  // pat LEFT_ARROW infixexp
  private static boolean guard_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "guard_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pat(b, l + 1);
    r = r && consumeToken(b, PS_LEFT_ARROW);
    r = r && infixexp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LET decls
  private static boolean guard_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "guard_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_LET);
    r = r && decls(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // onl VERTICAL_BAR guard (COMMA guard)*
  public static boolean guards(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "guards")) return false;
    if (!nextTokenIs(b, "<guards>", PS_NEWLINE, PS_VERTICAL_BAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<guards>");
    r = onl(b, l + 1);
    r = r && consumeToken(b, PS_VERTICAL_BAR);
    r = r && guard(b, l + 1);
    r = r && guards_3(b, l + 1);
    exit_section_(b, l, m, PS_GUARDS, r, false, null);
    return r;
  }

  // (COMMA guard)*
  private static boolean guards_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "guards_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!guards_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "guards_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA guard
  private static boolean guards_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "guards_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_COMMA);
    r = r && guard(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // funlhs funrhs
  public static boolean idecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idecl")) return false;
    if (!nextTokenIs(b, "<idecl>", PS_LEFT_PAREN, PS_VARID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<idecl>");
    r = funlhs(b, l + 1);
    r = r && funrhs(b, l + 1);
    exit_section_(b, l, m, PS_IDECL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // idecl+
  public static boolean idecls(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idecls")) return false;
    if (!nextTokenIs(b, "<idecls>", PS_LEFT_PAREN, PS_VARID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<idecls>");
    r = idecl(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!idecl(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "idecls", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, PS_IDECLS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // onl IF exp onl THEN exp onl ELSE exp
  public static boolean ifexp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifexp")) return false;
    if (!nextTokenIs(b, "<ifexp>", PS_IF, PS_NEWLINE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<ifexp>");
    r = onl(b, l + 1);
    r = r && consumeToken(b, PS_IF);
    r = r && exp(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && consumeToken(b, PS_THEN);
    r = r && exp(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && consumeToken(b, PS_ELSE);
    r = r && exp(b, l + 1);
    exit_section_(b, l, m, PS_IFEXP, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IMPORT QUALIFIED? modid ("as" modid)* impspec*
  public static boolean impdecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impdecl")) return false;
    if (!nextTokenIs(b, PS_IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_IMPORT);
    r = r && impdecl_1(b, l + 1);
    r = r && modid(b, l + 1);
    r = r && impdecl_3(b, l + 1);
    r = r && impdecl_4(b, l + 1);
    exit_section_(b, m, PS_IMPDECL, r);
    return r;
  }

  // QUALIFIED?
  private static boolean impdecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impdecl_1")) return false;
    consumeToken(b, PS_QUALIFIED);
    return true;
  }

  // ("as" modid)*
  private static boolean impdecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impdecl_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!impdecl_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "impdecl_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // "as" modid
  private static boolean impdecl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impdecl_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "as");
    r = r && modid(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // impspec*
  private static boolean impdecl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impdecl_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!impspec(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "impdecl_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (impdecl onl)*
  public static boolean impdecls(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impdecls")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<impdecls>");
    int c = current_position_(b);
    while (true) {
      if (!impdecls_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "impdecls", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, PS_IMPDECLS, true, false, null);
    return true;
  }

  // impdecl onl
  private static boolean impdecls_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impdecls_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = impdecl(b, l + 1);
    r = r && onl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // import1 | import2
  public static boolean import0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<import 0>");
    r = import1(b, l + 1);
    if (!r) r = import2(b, l + 1);
    exit_section_(b, l, m, PS_IMPORT_0, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // var
  public static boolean import1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import1")) return false;
    if (!nextTokenIs(b, "<import 1>", PS_LEFT_PAREN, PS_VARID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<import 1>");
    r = var(b, l + 1);
    exit_section_(b, l, m, PS_IMPORT_1, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // qcon onl (dot_dot_parens | LEFT_PAREN onl (cname onl (onl COMMA onl cname)*)? onl RIGHT_PAREN)?
  public static boolean import2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import2")) return false;
    if (!nextTokenIs(b, PS_CONID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qcon(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && import2_2(b, l + 1);
    exit_section_(b, m, PS_IMPORT_2, r);
    return r;
  }

  // (dot_dot_parens | LEFT_PAREN onl (cname onl (onl COMMA onl cname)*)? onl RIGHT_PAREN)?
  private static boolean import2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import2_2")) return false;
    import2_2_0(b, l + 1);
    return true;
  }

  // dot_dot_parens | LEFT_PAREN onl (cname onl (onl COMMA onl cname)*)? onl RIGHT_PAREN
  private static boolean import2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dot_dot_parens(b, l + 1);
    if (!r) r = import2_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_PAREN onl (cname onl (onl COMMA onl cname)*)? onl RIGHT_PAREN
  private static boolean import2_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import2_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_LEFT_PAREN);
    r = r && onl(b, l + 1);
    r = r && import2_2_0_1_2(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && consumeToken(b, PS_RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (cname onl (onl COMMA onl cname)*)?
  private static boolean import2_2_0_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import2_2_0_1_2")) return false;
    import2_2_0_1_2_0(b, l + 1);
    return true;
  }

  // cname onl (onl COMMA onl cname)*
  private static boolean import2_2_0_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import2_2_0_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cname(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && import2_2_0_1_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (onl COMMA onl cname)*
  private static boolean import2_2_0_1_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import2_2_0_1_2_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!import2_2_0_1_2_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "import2_2_0_1_2_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // onl COMMA onl cname
  private static boolean import2_2_0_1_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import2_2_0_1_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = onl(b, l + 1);
    r = r && consumeToken(b, PS_COMMA);
    r = r && onl(b, l + 1);
    r = r && cname(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_PAREN onl import0 (onl COMMA? onl import0 onl)* onl COMMA? onl RIGHT_PAREN
  public static boolean impspec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impspec")) return false;
    if (!nextTokenIs(b, PS_LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_LEFT_PAREN);
    r = r && onl(b, l + 1);
    r = r && import0(b, l + 1);
    r = r && impspec_3(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && impspec_5(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && consumeToken(b, PS_RIGHT_PAREN);
    exit_section_(b, m, PS_IMPSPEC, r);
    return r;
  }

  // (onl COMMA? onl import0 onl)*
  private static boolean impspec_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impspec_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!impspec_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "impspec_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // onl COMMA? onl import0 onl
  private static boolean impspec_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impspec_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = onl(b, l + 1);
    r = r && impspec_3_0_1(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && import0(b, l + 1);
    r = r && onl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean impspec_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impspec_3_0_1")) return false;
    consumeToken(b, PS_COMMA);
    return true;
  }

  // COMMA?
  private static boolean impspec_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "impspec_5")) return false;
    consumeToken(b, PS_COMMA);
    return true;
  }

  /* ********************************************************** */
  // fexp VARSYMID fexp | MINUS infixexp | lexp
  public static boolean infixexp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixexp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<infixexp>");
    r = infixexp_0(b, l + 1);
    if (!r) r = infixexp_1(b, l + 1);
    if (!r) r = lexp(b, l + 1);
    exit_section_(b, l, m, PS_INFIXEXP, r, false, null);
    return r;
  }

  // fexp VARSYMID fexp
  private static boolean infixexp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixexp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fexp(b, l + 1);
    r = r && consumeToken(b, PS_VARSYMID);
    r = r && fexp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MINUS infixexp
  private static boolean infixexp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixexp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_MINUS);
    r = r && infixexp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INSTANCE typesigdecl (WHERE onl idecls*)?
  public static boolean instancedecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instancedecl")) return false;
    if (!nextTokenIs(b, PS_INSTANCE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_INSTANCE);
    r = r && typesigdecl(b, l + 1);
    r = r && instancedecl_2(b, l + 1);
    exit_section_(b, m, PS_INSTANCEDECL, r);
    return r;
  }

  // (WHERE onl idecls*)?
  private static boolean instancedecl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instancedecl_2")) return false;
    instancedecl_2_0(b, l + 1);
    return true;
  }

  // WHERE onl idecls*
  private static boolean instancedecl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instancedecl_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_WHERE);
    r = r && onl(b, l + 1);
    r = r && instancedecl_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // idecls*
  private static boolean instancedecl_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instancedecl_2_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!idecls(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "instancedecl_2_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // KEY|SEPARATOR|VALUE|COMMENT|QUOTE
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_KEY);
    if (!r) r = consumeToken(b, PS_SEPARATOR);
    if (!r) r = consumeToken(b, PS_VALUE);
    if (!r) r = consumeToken(b, PS_COMMENT);
    if (!r) r = consumeToken(b, PS_QUOTE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BACKSLASH apat+ RIGHT_ARROW exp
  public static boolean lambdaexp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaexp")) return false;
    if (!nextTokenIs(b, PS_BACKSLASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_BACKSLASH);
    r = r && lambdaexp_1(b, l + 1);
    r = r && consumeToken(b, PS_RIGHT_ARROW);
    r = r && exp(b, l + 1);
    exit_section_(b, m, PS_LAMBDAEXP, r);
    return r;
  }

  // apat+
  private static boolean lambdaexp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaexp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = apat(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!apat(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "lambdaexp_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // onl LET decls onl IN exp
  public static boolean letexp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letexp")) return false;
    if (!nextTokenIs(b, "<letexp>", PS_LET, PS_NEWLINE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<letexp>");
    r = onl(b, l + 1);
    r = r && consumeToken(b, PS_LET);
    r = r && decls(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && consumeToken(b, PS_IN);
    r = r && exp(b, l + 1);
    exit_section_(b, l, m, PS_LETEXP, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // lambdaexp | letexp | ifexp | caseexp | doexp | fexp
  public static boolean lexp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lexp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<lexp>");
    r = lambdaexp(b, l + 1);
    if (!r) r = letexp(b, l + 1);
    if (!r) r = ifexp(b, l + 1);
    if (!r) r = caseexp(b, l + 1);
    if (!r) r = doexp(b, l + 1);
    if (!r) r = fexp(b, l + 1);
    exit_section_(b, l, m, PS_LEXP, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DIGIT | STRING
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    if (!nextTokenIs(b, "<literal>", PS_DIGIT, PS_STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<literal>");
    r = consumeToken(b, PS_DIGIT);
    if (!r) r = consumeToken(b, PS_STRING);
    exit_section_(b, l, m, PS_LITERAL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // gcon apat+ | apat
  public static boolean lpat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lpat")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<lpat>");
    r = lpat_0(b, l + 1);
    if (!r) r = apat(b, l + 1);
    exit_section_(b, l, m, PS_LPAT, r, false, null);
    return r;
  }

  // gcon apat+
  private static boolean lpat_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lpat_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = gcon(b, l + 1);
    r = r && lpat_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // apat+
  private static boolean lpat_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lpat_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = apat(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!apat(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "lpat_0_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (CONID DOT)+ CONID | CONID
  public static boolean modid(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modid")) return false;
    if (!nextTokenIs(b, PS_CONID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = modid_0(b, l + 1);
    if (!r) r = consumeToken(b, PS_CONID);
    exit_section_(b, m, PS_MODID, r);
    return r;
  }

  // (CONID DOT)+ CONID
  private static boolean modid_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modid_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = modid_0_0(b, l + 1);
    r = r && consumeToken(b, PS_CONID);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CONID DOT)+
  private static boolean modid_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modid_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = modid_0_0_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!modid_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "modid_0_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // CONID DOT
  private static boolean modid_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modid_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PS_CONID, PS_DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // onl MODULE modid onl (onl exports)? onl WHERE onl body
  static boolean module_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_declaration")) return false;
    if (!nextTokenIs(b, "", PS_MODULE, PS_NEWLINE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = onl(b, l + 1);
    r = r && consumeToken(b, PS_MODULE);
    r = r && modid(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && module_declaration_4(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && consumeToken(b, PS_WHERE);
    r = r && onl(b, l + 1);
    r = r && body(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (onl exports)?
  private static boolean module_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_declaration_4")) return false;
    module_declaration_4_0(b, l + 1);
    return true;
  }

  // onl exports
  private static boolean module_declaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_declaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = onl(b, l + 1);
    r = r && exports(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // con type  | con rec_constr
  public static boolean newtypeconstr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "newtypeconstr")) return false;
    if (!nextTokenIs(b, PS_CONID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = newtypeconstr_0(b, l + 1);
    if (!r) r = newtypeconstr_1(b, l + 1);
    exit_section_(b, m, PS_NEWTYPECONSTR, r);
    return r;
  }

  // con type
  private static boolean newtypeconstr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "newtypeconstr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = con(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // con rec_constr
  private static boolean newtypeconstr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "newtypeconstr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = con(b, l + 1);
    r = r && rec_constr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NEWTYPE simpletype EQUAL newtypeconstr
  public static boolean newtypedecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "newtypedecl")) return false;
    if (!nextTokenIs(b, PS_NEWTYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_NEWTYPE);
    r = r && simpletype(b, l + 1);
    r = r && consumeToken(b, PS_EQUAL);
    r = r && newtypeconstr(b, l + 1);
    exit_section_(b, m, PS_NEWTYPEDECL, r);
    return r;
  }

  /* ********************************************************** */
  // NEWLINE*
  static boolean onl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "onl")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, PS_NEWLINE)) break;
      if (!empty_element_parsed_guard_(b, "onl", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // varop
  public static boolean op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<op>");
    r = varop(b, l + 1);
    exit_section_(b, l, m, PS_OP, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // op
  public static boolean ops(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ops")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<ops>");
    r = op(b, l + 1);
    exit_section_(b, l, m, PS_OPS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // lpat
  public static boolean pat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<pat>");
    r = lpat(b, l + 1);
    exit_section_(b, l, m, PS_PAT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (KEY? SEPARATOR VALUE?) | KEY
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    if (!nextTokenIs(b, "<property>", PS_KEY, PS_SEPARATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<property>");
    r = property_0(b, l + 1);
    if (!r) r = consumeToken(b, PS_KEY);
    exit_section_(b, l, m, PS_PROPERTY, r, false, null);
    return r;
  }

  // KEY? SEPARATOR VALUE?
  private static boolean property_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property_0_0(b, l + 1);
    r = r && consumeToken(b, PS_SEPARATOR);
    r = r && property_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KEY?
  private static boolean property_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0_0")) return false;
    consumeToken(b, PS_KEY);
    return true;
  }

  // VALUE?
  private static boolean property_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0_2")) return false;
    consumeToken(b, PS_VALUE);
    return true;
  }

  /* ********************************************************** */
  // qconid | CONID
  public static boolean qcon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qcon")) return false;
    if (!nextTokenIs(b, PS_CONID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qconid(b, l + 1);
    if (!r) r = consumeToken(b, PS_CONID);
    exit_section_(b, m, PS_QCON, r);
    return r;
  }

  /* ********************************************************** */
  // (CONID DOT)+ CONID
  public static boolean qconid(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qconid")) return false;
    if (!nextTokenIs(b, PS_CONID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qconid_0(b, l + 1);
    r = r && consumeToken(b, PS_CONID);
    exit_section_(b, m, PS_QCONID, r);
    return r;
  }

  // (CONID DOT)+
  private static boolean qconid_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qconid_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qconid_0_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!qconid_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qconid_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // CONID DOT
  private static boolean qconid_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qconid_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PS_CONID, PS_DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // qvarop | VARSYMID | MINUS | DOUBLE_LEFT_ARROW
  public static boolean qop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qop")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<qop>");
    r = qvarop(b, l + 1);
    if (!r) r = consumeToken(b, PS_VARSYMID);
    if (!r) r = consumeToken(b, PS_MINUS);
    if (!r) r = consumeToken(b, PS_DOUBLE_LEFT_ARROW);
    exit_section_(b, l, m, PS_QOP, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (modid DOT)* tycls
  public static boolean qtycls(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qtycls")) return false;
    if (!nextTokenIs(b, PS_CONID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qtycls_0(b, l + 1);
    r = r && tycls(b, l + 1);
    exit_section_(b, m, PS_QTYCLS, r);
    return r;
  }

  // (modid DOT)*
  private static boolean qtycls_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qtycls_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!qtycls_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qtycls_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // modid DOT
  private static boolean qtycls_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qtycls_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = modid(b, l + 1);
    r = r && consumeToken(b, PS_DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (modid DOT)* CONID
  public static boolean qtycon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qtycon")) return false;
    if (!nextTokenIs(b, PS_CONID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qtycon_0(b, l + 1);
    r = r && consumeToken(b, PS_CONID);
    exit_section_(b, m, PS_QTYCON, r);
    return r;
  }

  // (modid DOT)*
  private static boolean qtycon_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qtycon_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!qtycon_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qtycon_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // modid DOT
  private static boolean qtycon_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qtycon_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = modid(b, l + 1);
    r = r && consumeToken(b, PS_DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FORALL vars+ DOT onl
  public static boolean quantifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quantifier")) return false;
    if (!nextTokenIs(b, PS_FORALL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_FORALL);
    r = r && quantifier_1(b, l + 1);
    r = r && consumeToken(b, PS_DOT);
    r = r && onl(b, l + 1);
    exit_section_(b, m, PS_QUANTIFIER, r);
    return r;
  }

  // vars+
  private static boolean quantifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quantifier_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = vars(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!vars(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "quantifier_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // qvarid | LEFT_PAREN qvarsym RIGHT_PAREN | UNDERSCORE
  public static boolean qvar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qvar")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<qvar>");
    r = qvarid(b, l + 1);
    if (!r) r = qvar_1(b, l + 1);
    if (!r) r = consumeToken(b, PS_UNDERSCORE);
    exit_section_(b, l, m, PS_QVAR, r, false, null);
    return r;
  }

  // LEFT_PAREN qvarsym RIGHT_PAREN
  private static boolean qvar_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qvar_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_LEFT_PAREN);
    r = r && qvarsym(b, l + 1);
    r = r && consumeToken(b, PS_RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (modid DOT)* VARID
  public static boolean qvarid(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qvarid")) return false;
    if (!nextTokenIs(b, "<qvarid>", PS_CONID, PS_VARID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<qvarid>");
    r = qvarid_0(b, l + 1);
    r = r && consumeToken(b, PS_VARID);
    exit_section_(b, l, m, PS_QVARID, r, false, null);
    return r;
  }

  // (modid DOT)*
  private static boolean qvarid_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qvarid_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!qvarid_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qvarid_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // modid DOT
  private static boolean qvarid_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qvarid_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = modid(b, l + 1);
    r = r && consumeToken(b, PS_DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // qvarsym | BACKTICK qvarid BACKTICK
  public static boolean qvarop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qvarop")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<qvarop>");
    r = qvarsym(b, l + 1);
    if (!r) r = qvarop_1(b, l + 1);
    exit_section_(b, l, m, PS_QVAROP, r, false, null);
    return r;
  }

  // BACKTICK qvarid BACKTICK
  private static boolean qvarop_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qvarop_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_BACKTICK);
    r = r && qvarid(b, l + 1);
    r = r && consumeToken(b, PS_BACKTICK);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (modid DOT)* (VARSYMID | MINUS | DOUBLE_LEFT_ARROW)
  public static boolean qvarsym(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qvarsym")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<qvarsym>");
    r = qvarsym_0(b, l + 1);
    r = r && qvarsym_1(b, l + 1);
    exit_section_(b, l, m, PS_QVARSYM, r, false, null);
    return r;
  }

  // (modid DOT)*
  private static boolean qvarsym_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qvarsym_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!qvarsym_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qvarsym_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // modid DOT
  private static boolean qvarsym_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qvarsym_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = modid(b, l + 1);
    r = r && consumeToken(b, PS_DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // VARSYMID | MINUS | DOUBLE_LEFT_ARROW
  private static boolean qvarsym_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qvarsym_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_VARSYMID);
    if (!r) r = consumeToken(b, PS_MINUS);
    if (!r) r = consumeToken(b, PS_DOUBLE_LEFT_ARROW);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // onl LEFT_BRACE onl (onl fielddecl (onl COMMA onl fielddecl onl)*)? onl RIGHT_BRACE
  public static boolean rec_constr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rec_constr")) return false;
    if (!nextTokenIs(b, "<rec constr>", PS_LEFT_BRACE, PS_NEWLINE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<rec constr>");
    r = onl(b, l + 1);
    r = r && consumeToken(b, PS_LEFT_BRACE);
    r = r && onl(b, l + 1);
    r = r && rec_constr_3(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && consumeToken(b, PS_RIGHT_BRACE);
    exit_section_(b, l, m, PS_REC_CONSTR, r, false, null);
    return r;
  }

  // (onl fielddecl (onl COMMA onl fielddecl onl)*)?
  private static boolean rec_constr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rec_constr_3")) return false;
    rec_constr_3_0(b, l + 1);
    return true;
  }

  // onl fielddecl (onl COMMA onl fielddecl onl)*
  private static boolean rec_constr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rec_constr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = onl(b, l + 1);
    r = r && fielddecl(b, l + 1);
    r = r && rec_constr_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (onl COMMA onl fielddecl onl)*
  private static boolean rec_constr_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rec_constr_3_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!rec_constr_3_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rec_constr_3_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // onl COMMA onl fielddecl onl
  private static boolean rec_constr_3_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rec_constr_3_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = onl(b, l + 1);
    r = r && consumeToken(b, PS_COMMA);
    r = r && onl(b, l + 1);
    r = r && fielddecl(b, l + 1);
    r = r && onl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // simpleclass | LEFT_PAREN simpleclass (COMMA simpleclass)* RIGHT_PAREN
  public static boolean scontext(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scontext")) return false;
    if (!nextTokenIs(b, "<scontext>", PS_CONID, PS_LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<scontext>");
    r = simpleclass(b, l + 1);
    if (!r) r = scontext_1(b, l + 1);
    exit_section_(b, l, m, PS_SCONTEXT, r, false, null);
    return r;
  }

  // LEFT_PAREN simpleclass (COMMA simpleclass)* RIGHT_PAREN
  private static boolean scontext_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scontext_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_LEFT_PAREN);
    r = r && simpleclass(b, l + 1);
    r = r && scontext_1_2(b, l + 1);
    r = r && consumeToken(b, PS_RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA simpleclass)*
  private static boolean scontext_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scontext_1_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!scontext_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "scontext_1_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA simpleclass
  private static boolean scontext_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scontext_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_COMMA);
    r = r && simpleclass(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // qcon qvar+
  public static boolean simpleclass(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleclass")) return false;
    if (!nextTokenIs(b, PS_CONID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qcon(b, l + 1);
    r = r && simpleclass_1(b, l + 1);
    exit_section_(b, m, PS_SIMPLECLASS, r);
    return r;
  }

  // qvar+
  private static boolean simpleclass_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleclass_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qvar(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!qvar(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simpleclass_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // qcon? type | qcon (var)*
  public static boolean simpletype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpletype")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<simpletype>");
    r = simpletype_0(b, l + 1);
    if (!r) r = simpletype_1(b, l + 1);
    exit_section_(b, l, m, PS_SIMPLETYPE, r, false, null);
    return r;
  }

  // qcon? type
  private static boolean simpletype_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpletype_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simpletype_0_0(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // qcon?
  private static boolean simpletype_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpletype_0_0")) return false;
    qcon(b, l + 1);
    return true;
  }

  // qcon (var)*
  private static boolean simpletype_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpletype_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qcon(b, l + 1);
    r = r && simpletype_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (var)*
  private static boolean simpletype_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpletype_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!simpletype_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "simpletype_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (var)
  private static boolean simpletype_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpletype_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_PAREN BACKSLASH BACKSLASH RIGHT_PAREN
  public static boolean slash_slash_parens(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slash_slash_parens")) return false;
    if (!nextTokenIs(b, PS_LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PS_LEFT_PAREN, PS_BACKSLASH, PS_BACKSLASH, PS_RIGHT_PAREN);
    exit_section_(b, m, PS_SLASH_SLASH_PARENS, r);
    return r;
  }

  /* ********************************************************** */
  // pat LEFT_ARROW exp onl | exp
  public static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<stmt>");
    r = stmt_0(b, l + 1);
    if (!r) r = exp(b, l + 1);
    exit_section_(b, l, m, PS_STMT, r, false, null);
    return r;
  }

  // pat LEFT_ARROW exp onl
  private static boolean stmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pat(b, l + 1);
    r = r && consumeToken(b, PS_LEFT_ARROW);
    r = r && exp(b, l + 1);
    r = r && onl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // stmt+
  public static boolean stmts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmts")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<stmts>");
    r = stmt(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stmts", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, PS_STMTS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // typedecl | datadecl | newtypedecl | classdecl | instancedecl | decl | forimpdecl
  public static boolean topdecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "topdecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<topdecl>");
    r = typedecl(b, l + 1);
    if (!r) r = datadecl(b, l + 1);
    if (!r) r = newtypedecl(b, l + 1);
    if (!r) r = classdecl(b, l + 1);
    if (!r) r = instancedecl(b, l + 1);
    if (!r) r = decl(b, l + 1);
    if (!r) r = forimpdecl(b, l + 1);
    exit_section_(b, l, m, PS_TOPDECL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (topdecl onl)*
  public static boolean topdecls(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "topdecls")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<topdecls>");
    int c = current_position_(b);
    while (true) {
      if (!topdecls_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "topdecls", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, PS_TOPDECLS, true, false, null);
    return true;
  }

  // topdecl onl
  private static boolean topdecls_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "topdecls_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = topdecl(b, l + 1);
    r = r && onl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CONID
  public static boolean tycls(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tycls")) return false;
    if (!nextTokenIs(b, PS_CONID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_CONID);
    exit_section_(b, m, PS_TYCLS, r);
    return r;
  }

  /* ********************************************************** */
  // atype+ (RIGHT_ARROW onl type)?
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type>");
    r = type_0(b, l + 1);
    r = r && type_1(b, l + 1);
    exit_section_(b, l, m, PS_TYPE, r, false, null);
    return r;
  }

  // atype+
  private static boolean type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = atype(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!atype(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (RIGHT_ARROW onl type)?
  private static boolean type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1")) return false;
    type_1_0(b, l + 1);
    return true;
  }

  // RIGHT_ARROW onl type
  private static boolean type_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_RIGHT_ARROW);
    r = r && onl(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TYPEID simpletype EQUAL onl quantifier? onl (type | rec_constr)
  public static boolean typedecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedecl")) return false;
    if (!nextTokenIs(b, PS_TYPEID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_TYPEID);
    r = r && simpletype(b, l + 1);
    r = r && consumeToken(b, PS_EQUAL);
    r = r && onl(b, l + 1);
    r = r && typedecl_4(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && typedecl_6(b, l + 1);
    exit_section_(b, m, PS_TYPEDECL, r);
    return r;
  }

  // quantifier?
  private static boolean typedecl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedecl_4")) return false;
    quantifier(b, l + 1);
    return true;
  }

  // type | rec_constr
  private static boolean typedecl_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedecl_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    if (!r) r = rec_constr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // typesiglhs COLON_COLON quantifier? (context onl DOUBLE_RIGHT_ARROW)* type
  public static boolean typesigdecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typesigdecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<typesigdecl>");
    r = typesiglhs(b, l + 1);
    r = r && consumeToken(b, PS_COLON_COLON);
    r = r && typesigdecl_2(b, l + 1);
    r = r && typesigdecl_3(b, l + 1);
    r = r && type(b, l + 1);
    exit_section_(b, l, m, PS_TYPESIGDECL, r, false, null);
    return r;
  }

  // quantifier?
  private static boolean typesigdecl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typesigdecl_2")) return false;
    quantifier(b, l + 1);
    return true;
  }

  // (context onl DOUBLE_RIGHT_ARROW)*
  private static boolean typesigdecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typesigdecl_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!typesigdecl_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typesigdecl_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // context onl DOUBLE_RIGHT_ARROW
  private static boolean typesigdecl_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typesigdecl_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = context(b, l + 1);
    r = r && onl(b, l + 1);
    r = r && consumeToken(b, PS_DOUBLE_RIGHT_ARROW);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // var | con
  public static boolean typesiglhs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typesiglhs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<typesiglhs>");
    r = var(b, l + 1);
    if (!r) r = con(b, l + 1);
    exit_section_(b, l, m, PS_TYPESIGLHS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // var | LEFT_PAREN var COLON_COLON type (VERTICAL_BAR var)* RIGHT_PAREN
  public static boolean tyvar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tyvar")) return false;
    if (!nextTokenIs(b, "<tyvar>", PS_LEFT_PAREN, PS_VARID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<tyvar>");
    r = var(b, l + 1);
    if (!r) r = tyvar_1(b, l + 1);
    exit_section_(b, l, m, PS_TYVAR, r, false, null);
    return r;
  }

  // LEFT_PAREN var COLON_COLON type (VERTICAL_BAR var)* RIGHT_PAREN
  private static boolean tyvar_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tyvar_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_LEFT_PAREN);
    r = r && var(b, l + 1);
    r = r && consumeToken(b, PS_COLON_COLON);
    r = r && type(b, l + 1);
    r = r && tyvar_1_4(b, l + 1);
    r = r && consumeToken(b, PS_RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (VERTICAL_BAR var)*
  private static boolean tyvar_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tyvar_1_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!tyvar_1_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tyvar_1_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // VERTICAL_BAR var
  private static boolean tyvar_1_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tyvar_1_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_VERTICAL_BAR);
    r = r && var(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VARID | LEFT_PAREN varsym RIGHT_PAREN
  public static boolean var(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var")) return false;
    if (!nextTokenIs(b, "<var>", PS_LEFT_PAREN, PS_VARID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<var>");
    r = consumeToken(b, PS_VARID);
    if (!r) r = var_1(b, l + 1);
    exit_section_(b, l, m, PS_VAR, r, false, null);
    return r;
  }

  // LEFT_PAREN varsym RIGHT_PAREN
  private static boolean var_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_LEFT_PAREN);
    r = r && varsym(b, l + 1);
    r = r && consumeToken(b, PS_RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BACKSLASH BACKSLASH | MINUS | DOUBLE_LEFT_ARROW | VARSYMID | BACKTICK vars BACKTICK
  public static boolean varop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varop")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<varop>");
    r = parseTokens(b, 0, PS_BACKSLASH, PS_BACKSLASH);
    if (!r) r = consumeToken(b, PS_MINUS);
    if (!r) r = consumeToken(b, PS_DOUBLE_LEFT_ARROW);
    if (!r) r = consumeToken(b, PS_VARSYMID);
    if (!r) r = varop_4(b, l + 1);
    exit_section_(b, l, m, PS_VAROP, r, false, null);
    return r;
  }

  // BACKTICK vars BACKTICK
  private static boolean varop_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varop_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_BACKTICK);
    r = r && vars(b, l + 1);
    r = r && consumeToken(b, PS_BACKTICK);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // var (COMMA var)*
  public static boolean vars(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vars")) return false;
    if (!nextTokenIs(b, "<vars>", PS_LEFT_PAREN, PS_VARID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<vars>");
    r = var(b, l + 1);
    r = r && vars_1(b, l + 1);
    exit_section_(b, l, m, PS_VARS, r, false, null);
    return r;
  }

  // (COMMA var)*
  private static boolean vars_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vars_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!vars_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "vars_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA var
  private static boolean vars_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vars_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PS_COMMA);
    r = r && var(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BACKSLASH BACKSLASH | MINUS | DOUBLE_LEFT_ARROW | VARSYMID
  public static boolean varsym(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varsym")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<varsym>");
    r = parseTokens(b, 0, PS_BACKSLASH, PS_BACKSLASH);
    if (!r) r = consumeToken(b, PS_MINUS);
    if (!r) r = consumeToken(b, PS_DOUBLE_LEFT_ARROW);
    if (!r) r = consumeToken(b, PS_VARSYMID);
    exit_section_(b, l, m, PS_VARSYM, r, false, null);
    return r;
  }

}
