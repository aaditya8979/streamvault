package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public final class wz0 implements be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zz0 f96564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b01 f96565b;

    public /* synthetic */ wz0(Context context) {
        this(new zz0(context), new b01(context));
    }

    public wz0(zz0 zz0Var, b01 b01Var) {
        this.f96564a = zz0Var;
        this.f96565b = b01Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    @Override // yads.be
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.td a() {
        /*
            r9 = this;
            yads.zz0 r0 = r9.f96564a
            r0.getClass()
            r1 = 1
            r2 = 0
            r3 = 0
            yads.pm2 r4 = r0.f97842a     // Catch: java.lang.Throwable -> L4f
            r4.getClass()     // Catch: java.lang.Throwable -> L4f
            java.lang.Class<com.google.android.gms.ads.identifier.AdvertisingIdClient> r4 = com.google.android.gms.ads.identifier.AdvertisingIdClient.class
            goto L13
        L10:
            boolean r4 = yads.ad1.f87661a     // Catch: java.lang.Throwable -> L4f
            r4 = r3
        L13:
            if (r4 == 0) goto L51
            yads.pm2 r5 = r0.f97842a     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = "getAdvertisingIdInfo"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L4f
            android.content.Context r8 = r0.f97844c     // Catch: java.lang.Throwable -> L4f
            r7[r2] = r8     // Catch: java.lang.Throwable -> L4f
            r5.getClass()     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r4 = yads.pm2.a(r4, r6, r7)     // Catch: java.lang.Throwable -> L4f
            if (r4 == 0) goto L51
            java.lang.String r5 = "getId"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r5 = yads.om2.a(r4, r5, r6)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = "isLimitAdTrackingEnabled"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r4 = yads.om2.a(r4, r6, r7)     // Catch: java.lang.Throwable -> L4f
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L4f
            yads.ud r0 = r0.f97843b     // Catch: java.lang.Throwable -> L4f
            r0.getClass()     // Catch: java.lang.Throwable -> L4f
            if (r4 == 0) goto L51
            if (r5 == 0) goto L51
            yads.td r0 = new yads.td     // Catch: java.lang.Throwable -> L4f
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L4f
            r0.<init>(r5, r4)     // Catch: java.lang.Throwable -> L4f
            goto L52
        L4f:
            boolean r0 = yads.ad1.f87661a
        L51:
            r0 = r3
        L52:
            if (r0 != 0) goto L94
            yads.b01 r0 = r9.f96565b
            yads.d01 r4 = r0.f87865d
            r4.getClass()
            android.content.Intent r4 = yads.d01.a()
            yads.gs2 r5 = r0.f87862a
            android.content.Context r6 = r0.f87863b
            r5.getClass()
            android.content.pm.PackageManager r5 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L6f
            android.content.pm.ResolveInfo r2 = r5.resolveService(r4, r2)     // Catch: java.lang.Throwable -> L6f
            goto L72
        L6f:
            boolean r2 = yads.ad1.f87661a
            r2 = r3
        L72:
            if (r2 == 0) goto L95
            yads.yz0 r2 = new yads.yz0     // Catch: java.lang.Throwable -> L91
            r2.<init>()     // Catch: java.lang.Throwable -> L91
            android.content.Context r5 = r0.f87863b     // Catch: java.lang.Throwable -> L91
            boolean r1 = r5.bindService(r4, r2, r1)     // Catch: java.lang.Throwable -> L91
            if (r1 == 0) goto L8e
            yads.c01 r1 = r0.f87864c     // Catch: java.lang.Throwable -> L91
            yads.td r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L91
            android.content.Context r0 = r0.f87863b     // Catch: java.lang.Throwable -> L91
            r0.unbindService(r2)     // Catch: java.lang.Throwable -> L91
            r3 = r1
            goto L95
        L8e:
            boolean r0 = yads.ad1.f87661a     // Catch: java.lang.Throwable -> L91
            goto L95
        L91:
            boolean r0 = yads.ad1.f87661a
            goto L95
        L94:
            r3 = r0
        L95:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.wz0.a():yads.td");
    }
}
