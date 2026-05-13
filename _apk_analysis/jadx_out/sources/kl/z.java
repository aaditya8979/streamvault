package kl;

import bo.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Text.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class z {
    @NotNull
    public static final k a(@NotNull String str) {
        tn.p.k(str, "<this>");
        return new k(str);
    }

    public static final char b(char c10) {
        if ('A' <= c10 && c10 < '[') {
            return (char) (c10 + ' ');
        }
        return c10 >= 0 && c10 < 128 ? c10 : Character.toLowerCase(c10);
    }

    @NotNull
    public static final String c(@NotNull String str) {
        tn.p.k(str, "<this>");
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            char cCharAt = str.charAt(i10);
            if (b(cCharAt) != cCharAt) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append((CharSequence) str, 0, i10);
        int iL0 = d0.l0(str);
        if (i10 <= iL0) {
            while (true) {
                sb2.append(b(str.charAt(i10)));
                if (i10 == iL0) {
                    break;
                }
                i10++;
            }
        }
        return sb2.toString();
    }
}
