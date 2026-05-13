package bo;

import java.util.Collection;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: _Strings.kt */
/* JADX INFO: loaded from: classes4.dex */
public class f0 extends e0 {
    @Nullable
    public static final Character A1(@NotNull CharSequence charSequence) {
        tn.p.k(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static final char B1(@NotNull CharSequence charSequence) {
        tn.p.k(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(d0.l0(charSequence));
    }

    @Nullable
    public static final Character C1(@NotNull CharSequence charSequence) {
        tn.p.k(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    @NotNull
    public static final CharSequence D1(@NotNull CharSequence charSequence) {
        tn.p.k(charSequence, "<this>");
        return new StringBuilder(charSequence).reverse();
    }

    public static final char E1(@NotNull CharSequence charSequence) {
        tn.p.k(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    @NotNull
    public static final String F1(@NotNull String str, int i10) {
        tn.p.k(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(0, zn.n.j(i10, str.length()));
            tn.p.j(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C G1(@NotNull CharSequence charSequence, @NotNull C c10) {
        tn.p.k(charSequence, "<this>");
        tn.p.k(c10, "destination");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            c10.add(Character.valueOf(charSequence.charAt(i10)));
        }
        return c10;
    }

    @NotNull
    public static final String x1(@NotNull String str, int i10) {
        tn.p.k(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(zn.n.j(i10, str.length()));
            tn.p.j(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final String y1(@NotNull String str, int i10) {
        tn.p.k(str, "<this>");
        if (i10 >= 0) {
            return F1(str, zn.n.e(str.length() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static final char z1(@NotNull CharSequence charSequence) {
        tn.p.k(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(0);
    }
}
