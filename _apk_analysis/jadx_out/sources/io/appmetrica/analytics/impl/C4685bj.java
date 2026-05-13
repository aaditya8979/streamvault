package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4685bj {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0003, B:9:0x0011, B:11:0x0020), top: B:23:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[Catch: all -> 0x0030, TRY_ENTER, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0003, B:9:0x0011, B:11:0x0020), top: B:23:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.appmetrica.analytics.coreapi.internal.model.ScreenInfo a(android.content.Context r5) {
        /*
            r0 = 30
            r1 = 0
            boolean r0 = io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(r0)     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto Le
            android.view.Display r0 = androidx.core.content.f.a(r5)     // Catch: java.lang.Throwable -> Le
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 != 0) goto L1e
            java.lang.String r0 = "window"
            java.lang.Object r0 = r5.getSystemService(r0)     // Catch: java.lang.Throwable -> L30
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch: java.lang.Throwable -> L30
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch: java.lang.Throwable -> L30
        L1e:
            if (r0 == 0) goto L30
            java.lang.String r2 = "getting display metrics"
            java.lang.String r3 = "Display"
            io.appmetrica.analytics.impl.aj r4 = new io.appmetrica.analytics.impl.aj     // Catch: java.lang.Throwable -> L30
            r4.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils.accessSystemServiceSafely(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L30
            android.graphics.Point r0 = (android.graphics.Point) r0     // Catch: java.lang.Throwable -> L30
            goto L31
        L30:
            r0 = r1
        L31:
            if (r0 != 0) goto L34
            return r1
        L34:
            int r1 = r0.x
            int r2 = r0.y
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r0.x
            int r0 = r0.y
            int r0 = java.lang.Math.min(r2, r0)
            r2 = 0
            r3 = 0
            android.content.res.Resources r5 = r5.getResources()     // Catch: java.lang.Throwable -> L52
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()     // Catch: java.lang.Throwable -> L52
            int r2 = r5.densityDpi     // Catch: java.lang.Throwable -> L52
            float r3 = r5.density     // Catch: java.lang.Throwable -> L52
        L52:
            io.appmetrica.analytics.coreapi.internal.model.ScreenInfo r5 = new io.appmetrica.analytics.coreapi.internal.model.ScreenInfo
            r5.<init>(r1, r0, r2, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4685bj.a(android.content.Context):io.appmetrica.analytics.coreapi.internal.model.ScreenInfo");
    }
}
