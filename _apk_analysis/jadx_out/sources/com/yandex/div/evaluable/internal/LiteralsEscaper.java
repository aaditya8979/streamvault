package com.yandex.div.evaluable.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bo.d0;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.TokenizingException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: LiteralsEscaper.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class LiteralsEscaper {

    @NotNull
    public static final LiteralsEscaper INSTANCE = new LiteralsEscaper();

    @NotNull
    private static final String[] ESCAPE_LITERALS = {"'", "@{"};

    private LiteralsEscaper() {
    }

    private final int countConsecutiveBackslashes(String str, int i10) {
        int i11 = i10;
        while (i11 < str.length() && str.charAt(i11) == '\\') {
            i11++;
        }
        return i11 - i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String escapeLiteral(String str, int i10, String[] strArr) {
        int i11 = 2;
        Exception exc = null;
        Object[] objArr = 0;
        if (i10 != str.length() && str.charAt(i10) != ' ') {
            for (String str2 : strArr) {
                if (isPossibleEscapeLiteral(str2, str, i10)) {
                    return str2;
                }
            }
            throw new EvaluableException("Incorrect string escape", null, 2, null);
        }
        String str3 = "Error tokenizing '" + str + "'.";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Alone backslash at ");
        sb2.append(i10 - 1);
        throw new EvaluableException(str3, new TokenizingException(sb2.toString(), exc, i11, objArr == true ? 1 : 0));
    }

    private final boolean isPossibleEscapeLiteral(String str, String str2, int i10) {
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i10 + i11;
            if (i12 >= str2.length() || str2.charAt(i12) != str.charAt(i11)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String process$default(LiteralsEscaper literalsEscaper, String str, String[] strArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            strArr = ESCAPE_LITERALS;
        }
        return literalsEscaper.process(str, strArr);
    }

    @NotNull
    public final String process(@NotNull String str, @NotNull String[] strArr) {
        p.k(str, TypedValues.Custom.S_STRING);
        p.k(strArr, "escapingLiterals");
        if (!d0.b0(str, '\\', false, 2, null)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = 0;
        while (length < str.length()) {
            if (str.charAt(length) != '\\') {
                sb2.append(str.charAt(length));
                length++;
            } else {
                int iCountConsecutiveBackslashes = countConsecutiveBackslashes(str, length);
                length += iCountConsecutiveBackslashes;
                int i10 = iCountConsecutiveBackslashes / 2;
                for (int i11 = 0; i11 < i10; i11++) {
                    sb2.append('\\');
                }
                if (iCountConsecutiveBackslashes % 2 == 1) {
                    String strEscapeLiteral = escapeLiteral(str, length, strArr);
                    sb2.append(strEscapeLiteral);
                    length += strEscapeLiteral.length();
                }
            }
        }
        String string = sb2.toString();
        p.j(string, "literalBuilder.toString()");
        return string;
    }
}
