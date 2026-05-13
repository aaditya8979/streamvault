package bo;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CharJVM.kt */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public static final int a(int i10) {
        boolean z10 = false;
        if (2 <= i10 && i10 < 37) {
            z10 = true;
        }
        if (z10) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new zn.i(2, 36));
    }

    public static final int b(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    public static final boolean c(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    @NotNull
    public static final String d(char c10, @NotNull Locale locale) {
        tn.p.k(locale, CommonUrlParts.LOCALE);
        String strValueOf = String.valueOf(c10);
        tn.p.i(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(locale);
        tn.p.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @NotNull
    public static final String e(char c10, @NotNull Locale locale) {
        tn.p.k(locale, CommonUrlParts.LOCALE);
        String strF = f(c10, locale);
        if (strF.length() <= 1) {
            String strValueOf = String.valueOf(c10);
            tn.p.i(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            tn.p.j(upperCase, "toUpperCase(...)");
            return !tn.p.f(strF, upperCase) ? strF : String.valueOf(Character.toTitleCase(c10));
        }
        if (c10 == 329) {
            return strF;
        }
        char cCharAt = strF.charAt(0);
        tn.p.i(strF, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = strF.substring(1);
        tn.p.j(strSubstring, "substring(...)");
        tn.p.i(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        tn.p.j(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }

    @NotNull
    public static final String f(char c10, @NotNull Locale locale) {
        tn.p.k(locale, CommonUrlParts.LOCALE);
        String strValueOf = String.valueOf(c10);
        tn.p.i(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        tn.p.j(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
