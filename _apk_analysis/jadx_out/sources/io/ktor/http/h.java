package io.ktor.http;

import bn.r;
import bo.d0;
import cn.v;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: URLParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final List<String> f71206a = v.e("");

    public static final int b(String str, int i10, int i11, char c10) {
        int i12 = 0;
        while (true) {
            int i13 = i10 + i12;
            if (i13 >= i11 || str.charAt(i13) != c10) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public static final void c(e eVar, String str, int i10, int i11) {
        Integer numValueOf = Integer.valueOf(f(str, i10, i11));
        int i12 = 0;
        if (!(numValueOf.intValue() > 0)) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : i11;
        String strSubstring = str.substring(i10, iIntValue);
        p.j(strSubstring, "substring(...)");
        eVar.x(strSubstring);
        int i13 = iIntValue + 1;
        if (i13 < i11) {
            String strSubstring2 = str.substring(i13, i11);
            p.j(strSubstring2, "substring(...)");
            i12 = Integer.parseInt(strSubstring2);
        }
        eVar.y(i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int d(java.lang.String r12, int r13, int r14) {
        /*
            char r0 = r12.charAt(r13)
            r1 = 123(0x7b, float:1.72E-43)
            r2 = 97
            r3 = 1
            r4 = 0
            if (r2 > r0) goto L10
            if (r0 >= r1) goto L10
            r5 = r3
            goto L11
        L10:
            r5 = r4
        L11:
            r6 = 91
            r7 = 65
            r8 = -1
            if (r5 != 0) goto L24
            if (r7 > r0) goto L1e
            if (r0 >= r6) goto L1e
            r0 = r3
            goto L1f
        L1e:
            r0 = r4
        L1f:
            if (r0 != 0) goto L24
            r0 = r13
            r5 = r0
            goto L26
        L24:
            r0 = r13
            r5 = r8
        L26:
            if (r0 >= r14) goto L86
            char r9 = r12.charAt(r0)
            r10 = 58
            if (r9 != r10) goto L4b
            if (r5 != r8) goto L34
            int r0 = r0 - r13
            return r0
        L34:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Illegal character in scheme at position "
            r13.append(r14)
            r13.append(r5)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L4b:
            r11 = 35
            if (r9 == r11) goto L86
            r11 = 47
            if (r9 == r11) goto L86
            r11 = 63
            if (r9 == r11) goto L86
            if (r5 != r8) goto L83
            if (r2 > r9) goto L5f
            if (r9 >= r1) goto L5f
            r11 = r3
            goto L60
        L5f:
            r11 = r4
        L60:
            if (r11 != 0) goto L83
            if (r7 > r9) goto L68
            if (r9 >= r6) goto L68
            r11 = r3
            goto L69
        L68:
            r11 = r4
        L69:
            if (r11 != 0) goto L83
            r11 = 48
            if (r11 > r9) goto L73
            if (r9 >= r10) goto L73
            r10 = r3
            goto L74
        L73:
            r10 = r4
        L74:
            if (r10 != 0) goto L83
            r10 = 46
            if (r9 == r10) goto L83
            r10 = 43
            if (r9 == r10) goto L83
            r10 = 45
            if (r9 == r10) goto L83
            r5 = r0
        L83:
            int r0 = r0 + 1
            goto L26
        L86:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.h.d(java.lang.String, int, int):int");
    }

    @NotNull
    public static final List<String> e() {
        return f71206a;
    }

    public static final int f(String str, int i10, int i11) {
        boolean z10 = false;
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ':') {
                if (cCharAt == '[') {
                    z10 = true;
                } else if (cCharAt == ']') {
                    z10 = false;
                }
            } else if (!z10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final void g(e eVar, String str, int i10, int i11, int i12) {
        if (i12 == 1) {
            eVar.x("");
            String strSubstring = str.substring(i10, i11);
            p.j(strSubstring, "substring(...)");
            g.j(eVar, strSubstring);
            return;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                throw new IllegalArgumentException("Invalid file url: " + str);
            }
            eVar.x("");
            StringBuilder sb2 = new StringBuilder();
            sb2.append('/');
            String strSubstring2 = str.substring(i10, i11);
            p.j(strSubstring2, "substring(...)");
            sb2.append(strSubstring2);
            g.j(eVar, sb2.toString());
            return;
        }
        int iQ0 = d0.q0(str, '/', i10, false, 4, null);
        if (iQ0 == -1 || iQ0 == i11) {
            String strSubstring3 = str.substring(i10, i11);
            p.j(strSubstring3, "substring(...)");
            eVar.x(strSubstring3);
        } else {
            String strSubstring4 = str.substring(i10, iQ0);
            p.j(strSubstring4, "substring(...)");
            eVar.x(strSubstring4);
            String strSubstring5 = str.substring(iQ0, i11);
            p.j(strSubstring5, "substring(...)");
            g.j(eVar, strSubstring5);
        }
    }

    public static final void h(e eVar, String str, int i10, int i11) {
        if (i10 >= i11 || str.charAt(i10) != '#') {
            return;
        }
        String strSubstring = str.substring(i10 + 1, i11);
        p.j(strSubstring, "substring(...)");
        eVar.s(strSubstring);
    }

    public static final void i(e eVar, String str, int i10, int i11) {
        int iR0 = d0.r0(str, "@", i10, false, 4, null);
        if (iR0 == -1) {
            throw new IllegalArgumentException("Invalid mailto url: " + str + ", it should contain '@'.");
        }
        String strSubstring = str.substring(i10, iR0);
        p.j(strSubstring, "substring(...)");
        eVar.C(gl.e.i(strSubstring, 0, 0, null, 7, null));
        String strSubstring2 = str.substring(iR0 + 1, i11);
        p.j(strSubstring2, "substring(...)");
        eVar.x(strSubstring2);
    }

    public static final int j(final e eVar, String str, int i10, int i11) {
        int i12 = i10 + 1;
        if (i12 == i11) {
            eVar.B(true);
            return i11;
        }
        Integer numValueOf = Integer.valueOf(d0.q0(str, '#', i12, false, 4, null));
        if (!(numValueOf.intValue() > 0)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            i11 = numValueOf.intValue();
        }
        String strSubstring = str.substring(i12, i11);
        p.j(strSubstring, "substring(...)");
        d.d(strSubstring, 0, 0, false, 6, null).c(new sn.p() { // from class: gl.f0
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return io.ktor.http.h.k(eVar, (String) obj, (List) obj2);
            }
        });
        return i11;
    }

    public static final r k(e eVar, String str, List list) {
        p.k(str, "key");
        p.k(list, "values");
        eVar.e().c(str, list);
        return r.f5635a;
    }

    @NotNull
    public static final e l(@NotNull e eVar, @NotNull String str) {
        p.k(eVar, "<this>");
        p.k(str, "urlString");
        if (d0.u0(str)) {
            return eVar;
        }
        try {
            return m(eVar, str);
        } catch (Throwable th2) {
            throw new URLParserException(str, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021d  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final io.ktor.http.e m(@org.jetbrains.annotations.NotNull io.ktor.http.e r21, @org.jetbrains.annotations.NotNull java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.h.m(io.ktor.http.e, java.lang.String):io.ktor.http.e");
    }
}
