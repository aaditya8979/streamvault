package io.ktor.http;

import bo.d0;
import cn.w;
import gl.c0;
import io.ktor.http.b;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Query.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public static final void a(c0 c0Var, String str, int i10, int i11, int i12, boolean z10) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        if (i11 == -1) {
            int iF = f(i10, i12, str);
            int iE = e(iF, i12, str);
            if (iE > iF) {
                if (z10) {
                    strSubstring3 = gl.e.k(str, iF, iE, false, null, 12, null);
                } else {
                    strSubstring3 = str.substring(iF, iE);
                    p.j(strSubstring3, "substring(...)");
                }
                c0Var.c(strSubstring3, w.m());
                return;
            }
            return;
        }
        int iF2 = f(i10, i11, str);
        int iE2 = e(iF2, i11, str);
        if (iE2 > iF2) {
            if (z10) {
                strSubstring = gl.e.k(str, iF2, iE2, false, null, 12, null);
            } else {
                strSubstring = str.substring(iF2, iE2);
                p.j(strSubstring, "substring(...)");
            }
            int iF3 = f(i11 + 1, i12, str);
            int iE3 = e(iF3, i12, str);
            if (z10) {
                strSubstring2 = gl.e.k(str, iF3, iE3, true, null, 8, null);
            } else {
                strSubstring2 = str.substring(iF3, iE3);
                p.j(strSubstring2, "substring(...)");
            }
            c0Var.e(strSubstring, strSubstring2);
        }
    }

    public static final void b(c0 c0Var, String str, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        int iL0 = d0.l0(str);
        int i14 = 0;
        if (i10 <= iL0) {
            int i15 = -1;
            int i16 = 0;
            int i17 = i10;
            int i18 = i17;
            while (i16 != i11) {
                char cCharAt = str.charAt(i17);
                if (cCharAt == '&') {
                    a(c0Var, str, i18, i15, i17, z10);
                    i16++;
                    i15 = -1;
                    i18 = i17 + 1;
                } else if (cCharAt == '=' && i15 == -1) {
                    i15 = i17;
                }
                if (i17 != iL0) {
                    i17++;
                } else {
                    i13 = i18;
                    i12 = i15;
                    i14 = i16;
                }
            }
            return;
        }
        i12 = -1;
        i13 = i10;
        if (i14 == i11) {
            return;
        }
        a(c0Var, str, i13, i12, str.length(), z10);
    }

    @NotNull
    public static final b c(@NotNull String str, int i10, int i11, boolean z10) {
        p.k(str, "query");
        if (i10 > d0.l0(str)) {
            return b.f71179b.a();
        }
        b.a aVar = b.f71179b;
        c0 c0VarB = c.b(0, 1, null);
        b(c0VarB, str, i10, i11, z10);
        return c0VarB.build();
    }

    public static /* synthetic */ b d(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 1000;
        }
        if ((i12 & 8) != 0) {
            z10 = true;
        }
        return c(str, i10, i11, z10);
    }

    public static final int e(int i10, int i11, CharSequence charSequence) {
        while (i11 > i10 && bo.a.c(charSequence.charAt(i11 - 1))) {
            i11--;
        }
        return i11;
    }

    public static final int f(int i10, int i11, CharSequence charSequence) {
        while (i10 < i11 && bo.a.c(charSequence.charAt(i10))) {
            i10++;
        }
        return i10;
    }
}
