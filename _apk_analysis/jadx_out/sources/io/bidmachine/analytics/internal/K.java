package io.bidmachine.analytics.internal;

import androidx.core.graphics.drawable.IconCompat;
import kotlin.Metadata;
import kotlin.Result;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\tJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\u0006\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tR'\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lio/bidmachine/analytics/internal/K;", "", "", "", "args", "Ljava/io/InputStream;", "a", "(Ljava/util/List;)Ljava/io/InputStream;", "Lbn/r;", "()V", "Lkotlin/Result;", "Ljava/lang/Object;", IconCompat.EXTRA_OBJ, "b", "Ljava/lang/String;", "processBuilder", "c", "start", "d", "getInputStream", "e", "destroy", "<init>", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Object obj;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String processBuilder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String start;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String getInputStream;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String destroy;

    public K() {
        Result.a aVar = Result.Companion;
        this.obj = Result.m7534constructorimpl(kotlin.c.a(new NullPointerException()));
        this.processBuilder = "amF2YS5sYW5nLlByb2Nlc3NCdWlsZGVy";
        this.start = "c3RhcnQ=";
        this.getInputStream = "Z2V0SW5wdXRTdHJlYW0=";
        this.destroy = "ZGVzdHJveQ==";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.InputStream a(java.util.List<java.lang.String> r6) {
        /*
            r5 = this;
            r0 = 0
            kotlin.Result$a r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = r5.processBuilder     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = io.bidmachine.analytics.internal.s0.a(r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L3b
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L3b
            java.lang.Class<java.util.List> r4 = java.util.List.class
            r3[r0] = r4     // Catch: java.lang.Throwable -> L3b
            java.lang.reflect.Constructor r3 = r1.getConstructor(r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L3b
            java.util.List r6 = cn.f0.g1(r6)     // Catch: java.lang.Throwable -> L3b
            r2[r0] = r6     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r6 = r3.newInstance(r2)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = r5.start     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = io.bidmachine.analytics.internal.s0.a(r2)     // Catch: java.lang.Throwable -> L3b
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3b
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r6 = r1.invoke(r6, r2)     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r6 = kotlin.Result.m7534constructorimpl(r6)     // Catch: java.lang.Throwable -> L3b
            goto L46
        L3b:
            r6 = move-exception
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r6 = kotlin.c.a(r6)
            java.lang.Object r6 = kotlin.Result.m7534constructorimpl(r6)
        L46:
            r5.obj = r6
            boolean r1 = kotlin.Result.m7540isSuccessimpl(r6)
            r2 = 0
            if (r1 == 0) goto L7a
            if (r6 == 0) goto L6c
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r3 = r5.getInputStream     // Catch: java.lang.Throwable -> L6a
            java.lang.String r3 = io.bidmachine.analytics.internal.s0.a(r3)     // Catch: java.lang.Throwable -> L6a
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L6a
            java.lang.reflect.Method r1 = r1.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L6c
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r6 = r1.invoke(r6, r0)     // Catch: java.lang.Throwable -> L6a
            goto L6d
        L6a:
            r6 = move-exception
            goto L74
        L6c:
            r6 = r2
        L6d:
            java.io.InputStream r6 = (java.io.InputStream) r6     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r6 = kotlin.Result.m7534constructorimpl(r6)     // Catch: java.lang.Throwable -> L6a
            goto L7e
        L74:
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r6 = kotlin.c.a(r6)
        L7a:
            java.lang.Object r6 = kotlin.Result.m7534constructorimpl(r6)
        L7e:
            boolean r0 = kotlin.Result.m7539isFailureimpl(r6)
            if (r0 == 0) goto L85
            goto L86
        L85:
            r2 = r6
        L86:
            java.io.InputStream r2 = (java.io.InputStream) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.K.a(java.util.List):java.io.InputStream");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.obj
            boolean r1 = kotlin.Result.m7540isSuccessimpl(r0)
            if (r1 == 0) goto L31
            if (r0 == 0) goto L26
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = r5.destroy     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = io.bidmachine.analytics.internal.s0.a(r2)     // Catch: java.lang.Throwable -> L24
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L24
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L24
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r0 = move-exception
            goto L2b
        L26:
            r0 = 0
        L27:
            kotlin.Result.m7534constructorimpl(r0)     // Catch: java.lang.Throwable -> L24
            goto L34
        L2b:
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.c.a(r0)
        L31:
            kotlin.Result.m7534constructorimpl(r0)
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.K.a():void");
    }
}
