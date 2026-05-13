package yads;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public final class jo3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f91318c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f91319d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f91320a = new jb2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f91321b = new StringBuilder();

    public static String a(jb2 jb2Var, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int i10 = jb2Var.f91148b;
        int i11 = jb2Var.f91149c;
        while (i10 < i11 && !z10) {
            char c10 = (char) jb2Var.f91147a[i10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                i10++;
                sb2.append(c10);
            }
        }
        int i12 = jb2Var.f91148b;
        jb2Var.e((i10 - i12) + i12);
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        r8.e(r3 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(yads.jb2 r8) {
        /*
            r0 = 1
        L1:
            r1 = r0
        L2:
            int r2 = r8.f91149c
            int r3 = r8.f91148b
            int r4 = r2 - r3
            if (r4 <= 0) goto L59
            if (r1 == 0) goto L59
            byte[] r1 = r8.f91147a
            r4 = r1[r3]
            char r5 = (char) r4
            r6 = 9
            if (r5 == r6) goto L53
            r6 = 10
            if (r5 == r6) goto L53
            r6 = 12
            if (r5 == r6) goto L53
            r6 = 13
            if (r5 == r6) goto L53
            r6 = 32
            if (r5 == r6) goto L53
            int r5 = r3 + 2
            if (r5 > r2) goto L51
            int r3 = r3 + 1
            r6 = 47
            if (r4 != r6) goto L51
            r3 = r1[r3]
            r4 = 42
            if (r3 != r4) goto L51
        L35:
            int r3 = r5 + 1
            if (r3 >= r2) goto L49
            r7 = r1[r5]
            char r7 = (char) r7
            if (r7 != r4) goto L47
            r7 = r1[r3]
            char r7 = (char) r7
            if (r7 != r6) goto L47
            int r5 = r5 + 2
            r2 = r5
            goto L35
        L47:
            r5 = r3
            goto L35
        L49:
            int r1 = r8.f91148b
            int r2 = r2 - r1
            int r2 = r2 + r1
            r8.e(r2)
            goto L1
        L51:
            r1 = 0
            goto L2
        L53:
            int r3 = r3 + 1
            r8.e(r3)
            goto L1
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.jo3.a(yads.jb2):void");
    }

    public static String b(jb2 jb2Var, StringBuilder sb2) {
        a(jb2Var);
        if (jb2Var.f91149c - jb2Var.f91148b == 0) {
            return null;
        }
        String strA = a(jb2Var, sb2);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) jb2Var.m());
    }
}
