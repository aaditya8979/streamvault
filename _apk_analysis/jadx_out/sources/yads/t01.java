package yads;

import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class t01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f95028a = bo.c.f5644g;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.nio.charset.Charset a(java.util.Map r10) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.t01.a(java.util.Map):java.nio.charset.Charset");
    }

    public static final boolean a(Map map, u11 u11Var) {
        String strC = c(map, u11Var);
        if (strC == null) {
            return true;
        }
        return Boolean.parseBoolean(strC);
    }

    public static boolean b(Map map, u11 u11Var) {
        String strC = c(map, u11Var);
        if (strC == null) {
            return false;
        }
        return Boolean.parseBoolean(strC);
    }

    public static final String c(Map map, u11 u11Var) {
        if (map != null) {
            return (String) map.get(u11Var.f95505b);
        }
        return null;
    }

    public static int d(Map map, u11 u11Var) {
        String strC = c(map, u11Var);
        int i10 = tb.f95131b;
        if (strC != null) {
            try {
                return Integer.parseInt(strC);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList e(java.util.Map r10, yads.u11 r11) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = c(r10, r11)
            if (r10 == 0) goto Lb3
            int r11 = r10.length()
            if (r11 != 0) goto L13
            goto Lb3
        L13:
            kotlin.text.Regex r11 = new kotlin.text.Regex
            java.lang.String r1 = ","
            r11.<init>(r1)
            r1 = 0
            java.util.List r10 = r11.split(r10, r1)
            boolean r11 = r10.isEmpty()
            r2 = 1
            if (r11 != 0) goto L4b
            int r11 = r10.size()
            java.util.ListIterator r11 = r10.listIterator(r11)
        L2e:
            boolean r3 = r11.hasPrevious()
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r11.previous()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            if (r3 != 0) goto L41
            goto L2e
        L41:
            int r11 = r11.nextIndex()
            int r11 = r11 + r2
            java.util.List r10 = cn.f0.Y0(r10, r11)
            goto L4f
        L4b:
            java.util.List r10 = cn.w.m()
        L4f:
            java.lang.String[] r11 = new java.lang.String[r1]
            java.lang.Object[] r10 = r10.toArray(r11)
            java.lang.String[] r10 = (java.lang.String[]) r10
            int r11 = r10.length
            r3 = r1
        L59:
            if (r3 >= r11) goto Lb3
            r4 = r10[r3]
            kotlin.Result$a r5 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> La6
            int r5 = r4.length()     // Catch: java.lang.Throwable -> La6
            int r5 = r5 - r2
            r6 = r1
            r7 = r6
        L66:
            if (r6 > r5) goto L8b
            if (r7 != 0) goto L6c
            r8 = r6
            goto L6d
        L6c:
            r8 = r5
        L6d:
            char r8 = r4.charAt(r8)     // Catch: java.lang.Throwable -> La6
            r9 = 32
            int r8 = tn.p.m(r8, r9)     // Catch: java.lang.Throwable -> La6
            if (r8 > 0) goto L7b
            r8 = r2
            goto L7c
        L7b:
            r8 = r1
        L7c:
            if (r7 != 0) goto L85
            if (r8 != 0) goto L82
            r7 = r2
            goto L66
        L82:
            int r6 = r6 + 1
            goto L66
        L85:
            if (r8 != 0) goto L88
            goto L8b
        L88:
            int r5 = r5 + (-1)
            goto L66
        L8b:
            int r5 = r5 + 1
            java.lang.CharSequence r4 = r4.subSequence(r6, r5)     // Catch: java.lang.Throwable -> La6
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> La6
            java.lang.String r5 = "UTF-8"
            java.lang.String r4 = java.net.URLDecoder.decode(r4, r5)     // Catch: java.lang.Throwable -> La6
            if (r4 == 0) goto La1
            r0.add(r4)     // Catch: java.lang.Throwable -> La6
            goto La2
        La1:
            r4 = 0
        La2:
            kotlin.Result.m7534constructorimpl(r4)     // Catch: java.lang.Throwable -> La6
            goto Lb0
        La6:
            r4 = move-exception
            kotlin.Result$a r5 = kotlin.Result.Companion
            java.lang.Object r4 = kotlin.c.a(r4)
            kotlin.Result.m7534constructorimpl(r4)
        Lb0:
            int r3 = r3 + 1
            goto L59
        Lb3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.t01.e(java.util.Map, yads.u11):java.util.ArrayList");
    }
}
