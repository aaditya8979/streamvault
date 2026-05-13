package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public final class x01 implements be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gs2 f96576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f96577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z01 f96578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a11 f96579d;

    public /* synthetic */ x01(Context context) {
        this(context, new gs2());
    }

    public x01(Context context, gs2 gs2Var) {
        this.f96576a = gs2Var;
        this.f96577b = context.getApplicationContext();
        this.f96578c = new z01();
        this.f96579d = new a11();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    @Override // yads.be
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.td a() {
        /*
            r7 = this;
            yads.a11 r0 = r7.f96579d
            r0.getClass()
            android.content.Intent r0 = yads.a11.a()
            yads.gs2 r1 = r7.f96576a
            android.content.Context r2 = r7.f96577b
            r1.getClass()
            r1 = 0
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L1b
            r3 = 0
            android.content.pm.ResolveInfo r2 = r2.resolveService(r0, r3)     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            boolean r2 = yads.ad1.f87661a
            r2 = r1
        L1e:
            if (r2 == 0) goto L65
            com.monetization.ads.core.identifiers.ad.huawei.a r2 = new com.monetization.ads.core.identifiers.ad.huawei.a     // Catch: java.lang.Throwable -> L63
            r2.<init>()     // Catch: java.lang.Throwable -> L63
            android.content.Context r3 = r7.f96577b     // Catch: java.lang.Throwable -> L63
            r4 = 1
            boolean r0 = r3.bindService(r0, r2, r4)     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L60
            yads.z01 r0 = r7.f96578c     // Catch: java.lang.Throwable -> L63
            r0.getClass()     // Catch: java.lang.Throwable -> L63
            java.util.concurrent.LinkedBlockingQueue r3 = r2.f51013a     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L63
            r4 = 5
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L63
            java.lang.Object r3 = r3.poll(r4, r6)     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L63
            com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService r3 = (com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService) r3     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L63
            if (r3 == 0) goto L58
            java.lang.String r4 = r3.getOaid()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L63
            boolean r3 = r3.getOaidTrackLimited()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L63
            yads.ud r0 = r0.f97347a     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L63
            r0.getClass()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L63
            if (r4 == 0) goto L58
            yads.td r0 = new yads.td     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L63
            r0.<init>(r4, r3)     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L63
            goto L59
        L56:
            boolean r0 = yads.ad1.f87661a     // Catch: java.lang.Throwable -> L63
        L58:
            r0 = r1
        L59:
            android.content.Context r3 = r7.f96577b     // Catch: java.lang.Throwable -> L63
            r3.unbindService(r2)     // Catch: java.lang.Throwable -> L63
            r1 = r0
            goto L65
        L60:
            boolean r0 = yads.ad1.f87661a     // Catch: java.lang.Throwable -> L63
            goto L65
        L63:
            boolean r0 = yads.ad1.f87661a
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.x01.a():yads.td");
    }
}
