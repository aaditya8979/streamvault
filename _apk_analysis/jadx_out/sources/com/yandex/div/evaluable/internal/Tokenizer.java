package com.yandex.div.evaluable.internal;

import bo.a0;
import cn.b0;
import cn.f0;
import com.ironsource.mediationsdk.metadata.a;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.TokenizingException;
import com.yandex.div.evaluable.internal.Token;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: Tokenizer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class Tokenizer {

    @NotNull
    public static final Tokenizer INSTANCE = new Tokenizer();

    /* JADX INFO: compiled from: Tokenizer.kt */
    public static final class TokenizationState {
        private int index;

        @NotNull
        private final char[] source;

        @NotNull
        private final List<Token> tokens;

        public TokenizationState(@NotNull char[] cArr) {
            p.k(cArr, "source");
            this.source = cArr;
            this.tokens = new ArrayList();
        }

        public static /* synthetic */ int forward$default(TokenizationState tokenizationState, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            return tokenizationState.forward(i10);
        }

        public static /* synthetic */ char nextChar$default(TokenizationState tokenizationState, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            return tokenizationState.nextChar(i10);
        }

        public static /* synthetic */ char prevChar$default(TokenizationState tokenizationState, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            return tokenizationState.prevChar(i10);
        }

        public final char charAt(int i10) {
            if (i10 >= 0 && i10 < this.source.length) {
                return this.source[i10];
            }
            return (char) 0;
        }

        public final char currentChar() {
            int i10 = this.index;
            char[] cArr = this.source;
            if (i10 >= cArr.length) {
                return (char) 0;
            }
            return cArr[i10];
        }

        public final boolean currentCharIsEscaped() {
            int i10 = this.index;
            if (i10 >= this.source.length) {
                return false;
            }
            int i11 = 0;
            for (int i12 = i10 - 1; i12 > 0 && this.source[i12] == '\\'; i12--) {
                i11++;
            }
            return i11 % 2 == 1;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!p.f(TokenizationState.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            p.i(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Tokenizer.TokenizationState");
            return Arrays.equals(this.source, ((TokenizationState) obj).source);
        }

        public final int forward(int i10) {
            int i11 = this.index;
            this.index = i10 + i11;
            return i11;
        }

        public final int getIndex() {
            return this.index;
        }

        @NotNull
        public final List<Token> getTokens() {
            return this.tokens;
        }

        public int hashCode() {
            return Arrays.hashCode(this.source);
        }

        public final char nextChar(int i10) {
            int i11 = this.index;
            int i12 = i11 + i10;
            char[] cArr = this.source;
            if (i12 >= cArr.length) {
                return (char) 0;
            }
            return cArr[i11 + i10];
        }

        @NotNull
        public final String part(int i10, int i11) {
            return a0.y(this.source, i10, i11);
        }

        public final char prevChar(int i10) {
            int i11 = this.index;
            if (i11 - i10 >= 0) {
                return this.source[i11 - i10];
            }
            return (char) 0;
        }

        @NotNull
        public String toString() {
            return "TokenizationState(source=" + Arrays.toString(this.source) + ')';
        }
    }

    private Tokenizer() {
    }

    private final EvaluableException invalidToken(TokenizationState tokenizationState) {
        return new EvaluableException("Invalid token '" + tokenizationState.currentChar() + "' at position " + tokenizationState.getIndex(), null, 2, null);
    }

    private final boolean isAlphabetic(char c10) {
        if ('a' <= c10 && c10 < '{') {
            return true;
        }
        return ('A' <= c10 && c10 < '[') || c10 == '_';
    }

    private final boolean isAtEnd(char c10) {
        return c10 == 0;
    }

    private final boolean isAtEndOfExpression(char c10) {
        return c10 == '}';
    }

    private final boolean isAtEndOfString(TokenizationState tokenizationState, boolean z10) {
        return isAtEnd(tokenizationState.currentChar()) || isStartOfExpression(tokenizationState.currentChar(), tokenizationState) || (z10 && isAtEndOfStringLiteral(tokenizationState.currentChar(), tokenizationState));
    }

    private final boolean isAtEndOfStringLiteral(char c10, TokenizationState tokenizationState) {
        return c10 == '\'' && !tokenizationState.currentCharIsEscaped();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isDecimal(char r8, char r9, char r10) {
        /*
            r7 = this;
            boolean r0 = java.lang.Character.isDigit(r8)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L4e
            r0 = 46
            if (r8 != r0) goto L11
            boolean r8 = java.lang.Character.isDigit(r10)
            goto L4c
        L11:
            r0 = 69
            r3 = 101(0x65, float:1.42E-43)
            if (r8 != r3) goto L19
        L17:
            r4 = r2
            goto L1d
        L19:
            if (r8 != r0) goto L1c
            goto L17
        L1c:
            r4 = r1
        L1d:
            r5 = 45
            r6 = 43
            if (r4 == 0) goto L37
            boolean r8 = java.lang.Character.isDigit(r9)
            if (r8 == 0) goto L35
            boolean r8 = java.lang.Character.isDigit(r10)
            if (r8 != 0) goto L33
            if (r10 == r6) goto L33
            if (r10 != r5) goto L35
        L33:
            r8 = r2
            goto L4c
        L35:
            r8 = r1
            goto L4c
        L37:
            if (r8 != r6) goto L3b
        L39:
            r8 = r2
            goto L3f
        L3b:
            if (r8 != r5) goto L3e
            goto L39
        L3e:
            r8 = r1
        L3f:
            if (r8 == 0) goto L35
            if (r9 == r3) goto L45
            if (r9 != r0) goto L35
        L45:
            boolean r8 = java.lang.Character.isDigit(r10)
            if (r8 == 0) goto L35
            goto L33
        L4c:
            if (r8 == 0) goto L4f
        L4e:
            r1 = r2
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.evaluable.internal.Tokenizer.isDecimal(char, char, char):boolean");
    }

    private final boolean isDot(char c10) {
        return c10 == '.';
    }

    private final boolean isNumber(char c10) {
        return '0' <= c10 && c10 < ':';
    }

    private final boolean isOperator(List<? extends Token> list) {
        if (list.isEmpty() || (f0.F0(list) instanceof Token.Operator.Unary)) {
            return false;
        }
        return (f0.F0(list) instanceof Token.Operand) || (f0.F0(list) instanceof Token$Bracket$RightRound);
    }

    private final boolean isStartOfExpression(char c10, TokenizationState tokenizationState) {
        return c10 == '@' && TokenizationState.prevChar$default(tokenizationState, 0, 1, null) != '\\' && TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == '{';
    }

    private final boolean isUnaryOperator(List<? extends Token> list) {
        return (isOperator(list) || (f0.G0(list) instanceof Token.Operator.Unary)) ? false : true;
    }

    private final boolean isValidIdentifier(char c10) {
        return isAlphabetic(c10) || isNumber(c10);
    }

    private final boolean isWhiteSpace(char c10) {
        return c10 == ' ' || c10 == '\t' || c10 == '\r' || c10 == '\n';
    }

    private final boolean processExpression(TokenizationState tokenizationState, List<Token> list) {
        Token token;
        Token token2;
        if (!isStartOfExpression(tokenizationState.currentChar(), tokenizationState)) {
            return false;
        }
        tokenizationState.forward(2);
        while (!isAtEnd(tokenizationState.currentChar()) && tokenizationState.currentChar() != '}') {
            char cCurrentChar = tokenizationState.currentChar();
            if (cCurrentChar == '?') {
                list.add(Token.Operator.TernaryIf.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (cCurrentChar == ':') {
                list.add(Token.Operator.TernaryElse.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (cCurrentChar == '+') {
                if (isUnaryOperator(list)) {
                    token = Token.Operator.Unary.Plus.INSTANCE;
                } else {
                    if (!isOperator(list)) {
                        throw invalidToken(tokenizationState);
                    }
                    token = Token.Operator.Binary.Sum.Plus.INSTANCE;
                }
                list.add(token);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (cCurrentChar == '-') {
                if (isUnaryOperator(list)) {
                    token2 = Token.Operator.Unary.Minus.INSTANCE;
                } else {
                    if (!isOperator(list)) {
                        throw invalidToken(tokenizationState);
                    }
                    token2 = Token.Operator.Binary.Sum.Minus.INSTANCE;
                }
                list.add(token2);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (cCurrentChar == '*') {
                list.add(Token.Operator.Binary.Factor.Multiplication.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (cCurrentChar == '/') {
                list.add(Token.Operator.Binary.Factor.Division.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (cCurrentChar == '%') {
                list.add(Token.Operator.Binary.Factor.Modulo.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (cCurrentChar == '!') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == '=') {
                    list.add(Token.Operator.Binary.Equality.NotEqual.INSTANCE);
                    tokenizationState.forward(2);
                } else if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == ':') {
                    list.add(Token.Operator.Try.INSTANCE);
                    tokenizationState.forward(2);
                } else {
                    if (!isUnaryOperator(list)) {
                        throw invalidToken(tokenizationState);
                    }
                    list.add(Token.Operator.Unary.Not.INSTANCE);
                    TokenizationState.forward$default(tokenizationState, 0, 1, null);
                }
            } else if (cCurrentChar == '&') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) != '&') {
                    throw invalidToken(tokenizationState);
                }
                list.add(Token.Operator.Binary.Logical.And.INSTANCE);
                tokenizationState.forward(2);
            } else if (cCurrentChar == '|') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) != '|') {
                    throw invalidToken(tokenizationState);
                }
                list.add(Token.Operator.Binary.Logical.Or.INSTANCE);
                tokenizationState.forward(2);
            } else if (cCurrentChar == '<') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == '=') {
                    list.add(Token.Operator.Binary.Comparison.LessOrEqual.INSTANCE);
                    tokenizationState.forward(2);
                } else {
                    list.add(Token.Operator.Binary.Comparison.Less.INSTANCE);
                    TokenizationState.forward$default(tokenizationState, 0, 1, null);
                }
            } else if (cCurrentChar == '>') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == '=') {
                    list.add(Token.Operator.Binary.Comparison.GreaterOrEqual.INSTANCE);
                    tokenizationState.forward(2);
                } else {
                    list.add(Token.Operator.Binary.Comparison.Greater.INSTANCE);
                    TokenizationState.forward$default(tokenizationState, 0, 1, null);
                }
            } else if (cCurrentChar == '=') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) != '=') {
                    throw invalidToken(tokenizationState);
                }
                list.add(Token.Operator.Binary.Equality.Equal.INSTANCE);
                tokenizationState.forward(2);
            } else if (cCurrentChar == '(') {
                list.add(Token$Bracket$LeftRound.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (cCurrentChar == ')') {
                list.add(Token$Bracket$RightRound.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (cCurrentChar == ',') {
                list.add(Token.Function.ArgumentDelimiter.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (cCurrentChar == '\'') {
                processStringTemplate$default(this, tokenizationState, list, false, 4, null);
            } else if (isWhiteSpace(tokenizationState.currentChar())) {
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (isDecimal(tokenizationState.currentChar(), TokenizationState.prevChar$default(tokenizationState, 0, 1, null), TokenizationState.nextChar$default(tokenizationState, 0, 1, null))) {
                processNumber(tokenizationState, list);
            } else if (isAlphabetic(tokenizationState.currentChar())) {
                processIdentifier(tokenizationState, list);
            } else {
                if (!isDot(tokenizationState.currentChar())) {
                    throw invalidToken(tokenizationState);
                }
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
                list.add(Token.Operator.Dot.INSTANCE);
            }
        }
        if (isAtEndOfExpression(tokenizationState.currentChar())) {
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
            return true;
        }
        throw new TokenizingException("'}' expected at end of expression at " + tokenizationState.getIndex(), null, 2, null);
    }

    private final void processIdentifier(TokenizationState tokenizationState, List<Token> list) {
        Token.Function function;
        int index = tokenizationState.getIndex();
        Integer numValueOf = null;
        while (true) {
            int index2 = tokenizationState.getIndex();
            while (isValidIdentifier(tokenizationState.currentChar())) {
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            }
            if (isDot(tokenizationState.currentChar())) {
                numValueOf = Integer.valueOf(tokenizationState.getIndex() + 1);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
                if (numValueOf.intValue() - index2 <= 1) {
                    throw new EvaluableException("Unexpected token: .", null, 2, null);
                }
            }
            if (!isValidIdentifier(tokenizationState.currentChar()) && !isDot(tokenizationState.currentChar())) {
                int index3 = tokenizationState.getIndex();
                while (isWhiteSpace(tokenizationState.currentChar())) {
                    TokenizationState.forward$default(tokenizationState, 0, 1, null);
                }
                if (tokenizationState.currentChar() == '(') {
                    function = new Token.Function(tokenizationState.part(numValueOf != null ? numValueOf.intValue() : index, index3));
                    if (numValueOf == null) {
                        list.add(function);
                        return;
                    }
                    index3 = numValueOf.intValue() - 1;
                } else {
                    function = null;
                }
                String strPart = tokenizationState.part(index, index3);
                Tokenizer tokenizer = INSTANCE;
                if (!tokenizer.processKeyword(strPart, list)) {
                    if (tokenizer.isDot(tokenizationState.charAt(index3 - 1))) {
                        throw new EvaluableException("Unexpected token: .", null, 2, null);
                    }
                    list.add(Token.Operand.Variable.m7434boximpl(Token.Operand.Variable.m7435constructorimpl(strPart)));
                }
                if (function != null) {
                    list.add(Token.Operator.Dot.INSTANCE);
                    list.add(function);
                    return;
                }
                return;
            }
        }
    }

    private final boolean processKeyword(String str, List<Token> list) {
        Token.Operand.Literal.Bool boolM7416boximpl = p.f(str, "true") ? Token.Operand.Literal.Bool.m7416boximpl(Token.Operand.Literal.Bool.m7417constructorimpl(true)) : p.f(str, a.f32683h) ? Token.Operand.Literal.Bool.m7416boximpl(Token.Operand.Literal.Bool.m7417constructorimpl(false)) : null;
        if (boolM7416boximpl == null) {
            return false;
        }
        list.add(boolM7416boximpl);
        return true;
    }

    private final void processNumber(TokenizationState tokenizationState, List<Token> list) {
        String strPart;
        String strPart2;
        int index = tokenizationState.getIndex();
        boolean z10 = f0.G0(list) instanceof Token.Operator.Unary.Minus;
        if (z10) {
            b0.S(list);
        }
        do {
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
        } while (Character.isDigit(tokenizationState.currentChar()));
        if (tokenizationState.charAt(index) != '.' && !isDecimal(tokenizationState.currentChar(), TokenizationState.prevChar$default(tokenizationState, 0, 1, null), TokenizationState.nextChar$default(tokenizationState, 0, 1, null))) {
            if (z10) {
                strPart2 = '-' + tokenizationState.part(index, tokenizationState.getIndex());
            } else {
                strPart2 = tokenizationState.part(index, tokenizationState.getIndex());
            }
            try {
                list.add(Token.Operand.Literal.Num.m7422boximpl(Token.Operand.Literal.Num.m7423constructorimpl(Long.valueOf(Long.parseLong(strPart2)))));
                return;
            } catch (Exception unused) {
                throw new EvaluableException("Value " + strPart2 + " can't be converted to Integer type.", null, 2, null);
            }
        }
        while (isDecimal(tokenizationState.currentChar(), TokenizationState.prevChar$default(tokenizationState, 0, 1, null), TokenizationState.nextChar$default(tokenizationState, 0, 1, null))) {
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
        }
        if (z10) {
            strPart = '-' + tokenizationState.part(index, tokenizationState.getIndex());
        } else {
            strPart = tokenizationState.part(index, tokenizationState.getIndex());
        }
        try {
            list.add(Token.Operand.Literal.Num.m7422boximpl(Token.Operand.Literal.Num.m7423constructorimpl(Double.valueOf(Double.parseDouble(strPart)))));
        } catch (Exception unused2) {
            throw new EvaluableException("Value " + strPart + " can't be converted to Number type.", null, 2, null);
        }
    }

    /* JADX INFO: renamed from: processString-wB-4SYI, reason: not valid java name */
    private final String m7441processStringwB4SYI(TokenizationState tokenizationState, boolean z10) {
        int index = tokenizationState.getIndex();
        while (true) {
            if (isAtEndOfString(tokenizationState, z10)) {
                break;
            }
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
        }
        String strProcess$default = LiteralsEscaper.process$default(LiteralsEscaper.INSTANCE, tokenizationState.part(index, tokenizationState.getIndex()), null, 2, null);
        if (strProcess$default.length() > 0) {
            return Token.Operand.Literal.Str.m7429constructorimpl(strProcess$default);
        }
        return null;
    }

    private final void processStringTemplate(TokenizationState tokenizationState, List<Token> list, boolean z10) {
        if (z10) {
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
        }
        ArrayList arrayList = new ArrayList();
        String strM7441processStringwB4SYI = m7441processStringwB4SYI(tokenizationState, z10);
        if (isAtEnd(tokenizationState.currentChar())) {
            if (z10) {
                throw new TokenizingException("''' expected at end of string literal at " + tokenizationState.getIndex(), null, 2, null);
            }
            if (strM7441processStringwB4SYI != null) {
                list.add(Token.Operand.Literal.Str.m7428boximpl(strM7441processStringwB4SYI));
                return;
            }
            return;
        }
        if (isAtEndOfStringLiteral(tokenizationState.currentChar(), tokenizationState)) {
            if (strM7441processStringwB4SYI == null) {
                strM7441processStringwB4SYI = Token.Operand.Literal.Str.m7429constructorimpl("");
            }
            list.add(Token.Operand.Literal.Str.m7428boximpl(strM7441processStringwB4SYI));
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
            return;
        }
        if (strM7441processStringwB4SYI != null && isStartOfExpression(tokenizationState.currentChar(), tokenizationState)) {
            arrayList.add(Token$StringTemplate$Start.INSTANCE);
            arrayList.add(Token.Operand.Literal.Str.m7428boximpl(strM7441processStringwB4SYI));
        }
        while (isStartOfExpression(tokenizationState.currentChar(), tokenizationState)) {
            ArrayList arrayList2 = new ArrayList();
            processExpression(tokenizationState, arrayList2);
            String strM7441processStringwB4SYI2 = m7441processStringwB4SYI(tokenizationState, z10);
            if (!z10 && arrayList.isEmpty() && strM7441processStringwB4SYI2 == null && !isStartOfExpression(tokenizationState.currentChar(), tokenizationState)) {
                list.addAll(arrayList2);
                return;
            }
            if (arrayList.isEmpty()) {
                arrayList.add(Token$StringTemplate$Start.INSTANCE);
            }
            arrayList.add(Token$StringTemplate$StartOfExpression.INSTANCE);
            arrayList.addAll(arrayList2);
            arrayList.add(Token$StringTemplate$EndOfExpression.INSTANCE);
            if (strM7441processStringwB4SYI2 != null) {
                arrayList.add(Token.Operand.Literal.Str.m7428boximpl(strM7441processStringwB4SYI2));
            }
        }
        if (z10 && !isAtEndOfStringLiteral(tokenizationState.currentChar(), tokenizationState)) {
            throw new TokenizingException("''' expected at end of string literal at " + tokenizationState.getIndex(), null, 2, null);
        }
        if (!arrayList.isEmpty()) {
            list.addAll(arrayList);
            list.add(Token$StringTemplate$End.INSTANCE);
        }
        if (z10) {
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
        }
    }

    public static /* synthetic */ void processStringTemplate$default(Tokenizer tokenizer, TokenizationState tokenizationState, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        tokenizer.processStringTemplate(tokenizationState, list, z10);
    }

    private final List<Token> tokenize(char[] cArr) {
        TokenizationState tokenizationState = new TokenizationState(cArr);
        try {
            processStringTemplate(tokenizationState, tokenizationState.getTokens(), false);
            return tokenizationState.getTokens();
        } catch (EvaluableException e10) {
            if (!(e10 instanceof TokenizingException)) {
                throw e10;
            }
            throw new EvaluableException("Error tokenizing '" + a0.x(cArr) + "'.", e10);
        }
    }

    @NotNull
    public final List<Token> tokenize(@NotNull String str) {
        p.k(str, "input");
        char[] charArray = str.toCharArray();
        p.j(charArray, "this as java.lang.String).toCharArray()");
        return tokenize(charArray);
    }
}
