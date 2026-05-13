package kotlin.uuid;

import bo.f;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Uuid.kt */
/* JADX INFO: loaded from: classes4.dex */
public class b extends a {
    public static final void g(@NotNull String str, int i10) {
        p.k(str, "<this>");
        if (str.charAt(i10) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index " + i10 + ", but was '" + str.charAt(i10) + '\'').toString());
    }

    public static final void h(long j10, @NotNull byte[] bArr, int i10, int i11, int i12) {
        p.k(bArr, "dst");
        int i13 = 7 - i11;
        int i14 = 8 - i12;
        if (i14 > i13) {
            return;
        }
        while (true) {
            int i15 = f.d()[(int) ((j10 >> (i13 << 3)) & 255)];
            int i16 = i10 + 1;
            bArr[i10] = (byte) (i15 >> 8);
            i10 = i16 + 1;
            bArr[i16] = (byte) i15;
            if (i13 == i14) {
                return;
            } else {
                i13--;
            }
        }
    }

    public static final void i(@NotNull byte[] bArr, int i10, long j10) {
        p.k(bArr, "<this>");
        int i11 = 7;
        while (-1 < i11) {
            bArr[i10] = (byte) (j10 >> (i11 << 3));
            i11--;
            i10++;
        }
    }

    public static final String j(String str, int i10) {
        if (str.length() <= i10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        p.i(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(0, i10);
        p.j(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        sb2.append("...");
        return sb2.toString();
    }

    @NotNull
    public static final Uuid k(@NotNull String str) {
        p.k(str, "hexString");
        return Uuid.Companion.a(f.f(str, 0, 16, null, 4, null), f.f(str, 16, 32, null, 4, null));
    }

    @NotNull
    public static final Uuid l(@NotNull String str) {
        p.k(str, "hexDashString");
        long jF = f.f(str, 0, 8, null, 4, null);
        g(str, 8);
        long jF2 = f.f(str, 9, 13, null, 4, null);
        g(str, 13);
        long jF3 = f.f(str, 14, 18, null, 4, null);
        g(str, 18);
        long jF4 = f.f(str, 19, 23, null, 4, null);
        g(str, 23);
        return Uuid.Companion.a((jF << 32) | (jF2 << 16) | jF3, (jF4 << 48) | f.f(str, 24, 36, null, 4, null));
    }
}
