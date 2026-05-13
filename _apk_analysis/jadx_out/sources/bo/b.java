package bo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Char.kt */
/* JADX INFO: loaded from: classes.dex */
public class b extends a {
    public static final int g(char c10) {
        int iB = a.b(c10, 10);
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a decimal digit");
    }

    public static final boolean h(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final boolean i(char c10) {
        return 55296 <= c10 && c10 < 57344;
    }

    @NotNull
    public static final String j(char c10) {
        return k0.a(c10);
    }
}
