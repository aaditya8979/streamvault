package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class w82 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s82 f96306d = new s82();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile w82 f96307e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d03 f96308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dk0 f96309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pa3 f96310c;

    public w82(Context context, k31 k31Var) {
        v82 v82VarA = a(context);
        cp2 cp2VarB = b(context);
        t82 t82Var = new t82(v82VarA);
        this.f96310c = new pa3(v82VarA, k31Var);
        this.f96308a = new d03(cp2VarB, t82Var, k31Var);
        this.f96309b = new dk0(cp2VarB, context);
    }

    public static v82 a(Context context) {
        int iJ;
        try {
            iJ = zn.n.j(((int) (Runtime.getRuntime().maxMemory() / ((long) 1024))) / 8, ((int) (((r6.widthPixels * r6.heightPixels) * context.getResources().getDisplayMetrics().density) / 1024)) * 3);
        } catch (IllegalArgumentException unused) {
            boolean z10 = ad1.f87661a;
            iJ = 5120;
        }
        return new v82(zn.n.e(iJ, 5120));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static yads.cp2 b(android.content.Context r2) {
        /*
            java.lang.Object r0 = yads.dw2.f89000j
            yads.dw2 r0 = yads.cw2.a()
            yads.nt2 r0 = r0.a(r2)
            if (r0 == 0) goto L1f
            java.lang.Integer r0 = r0.f92973s0
            if (r0 == 0) goto L1f
            int r1 = r0.intValue()
            if (r1 == 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 == 0) goto L1f
            int r0 = r0.intValue()
            goto L20
        L1f:
            r0 = 4
        L20:
            yads.cp2 r2 = yads.dp2.a(r2, r0)
            r2.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.w82.b(android.content.Context):yads.cp2");
    }

    public final dk0 a() {
        return this.f96309b;
    }

    public final d03 b() {
        return this.f96308a;
    }

    public final pa3 c() {
        return this.f96310c;
    }
}
