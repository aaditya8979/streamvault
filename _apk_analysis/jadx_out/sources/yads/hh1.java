package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class hh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fh1 f90416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gc2 f90417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gh1 f90418c;

    public /* synthetic */ hh1(Context context, String str) {
        this(new fh1(context, str), new gc2(context), null);
    }

    public hh1(fh1 fh1Var, gc2 gc2Var, gh1 gh1Var) {
        this.f90416a = fh1Var;
        this.f90417b = gc2Var;
        this.f90418c = gh1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.gh1 a() {
        /*
            r6 = this;
            yads.fh1 r0 = r6.f90416a
            yads.pm2 r1 = r0.f89582b
            java.lang.String r2 = r0.f89581a
            r1.getClass()
            r1 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> Lf
            goto L12
        Lf:
            boolean r2 = yads.ad1.f87661a
            r2 = r1
        L12:
            r3 = 0
            if (r2 == 0) goto L2f
            yads.pm2 r4 = r0.f89582b
            android.content.Context r0 = r0.f89583c
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r3] = r0
            r4.getClass()
            java.lang.String r0 = "getFusedLocationProviderClient"
            java.lang.Object r0 = yads.pm2.a(r2, r0, r5)
            if (r0 == 0) goto L2f
            yads.yy0 r2 = new yads.yy0
            r2.<init>(r0)
            goto L30
        L2f:
            r2 = r1
        L30:
            if (r2 == 0) goto L57
            yads.gc2 r0 = r6.f90417b
            java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = r0.a(r4)
            yads.gc2 r4 = r6.f90417b
            java.lang.String r5 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r4 = r4.a(r5)
            if (r0 != 0) goto L46
            if (r4 == 0) goto L57
        L46:
            java.lang.Object r0 = r2.f97327a
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r3 = "getLastLocation"
            java.lang.Object r0 = yads.om2.a(r0, r3, r2)
            if (r0 == 0) goto L57
            yads.gh1 r1 = new yads.gh1
            r1.<init>(r0)
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.hh1.a():yads.gh1");
    }
}
