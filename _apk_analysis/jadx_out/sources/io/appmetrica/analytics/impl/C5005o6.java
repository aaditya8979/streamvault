package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C5005o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4676ba f67393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4801g6 f67394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f67395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4650aa f67396d;

    public C5005o6(Context context) {
        this(context, new C4676ba(), new C4801g6(), C4650aa.a(context));
    }

    public C5005o6(Context context, C4676ba c4676ba, C4801g6 c4801g6, C4650aa c4650aa) {
        this.f67395c = context;
        this.f67393a = c4676ba;
        this.f67394b = c4801g6;
        this.f67396d = c4650aa;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(io.appmetrica.analytics.impl.C5215wh r8) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f67395c
            java.io.File r0 = io.appmetrica.analytics.coreutils.internal.io.FileUtils.getCrashesDirectory(r0)
            io.appmetrica.analytics.impl.g6 r1 = r7.f67394b
            r1.getClass()
            if (r0 != 0) goto Lf
            goto Lb0
        Lf:
            boolean r1 = r0.exists()
            if (r1 == 0) goto L27
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto L1c
            goto L2d
        L1c:
            boolean r1 = r0.delete()
            if (r1 == 0) goto Lb0
            boolean r1 = r0.mkdir()
            goto L2b
        L27:
            boolean r1 = r0.mkdir()
        L2b:
            if (r1 == 0) goto Lb0
        L2d:
            io.appmetrica.analytics.impl.Gh r1 = r8.f67906e
            io.appmetrica.analytics.impl.Cf r1 = r1.f65349a
            android.content.ContentValues r2 = r1.f65118a
            java.lang.String r3 = "PROCESS_CFG_PROCESS_ID"
            java.lang.Integer r2 = r2.getAsInteger(r3)
            android.content.ContentValues r1 = r1.f65118a
            java.lang.String r3 = "PROCESS_CFG_PROCESS_SESSION_ID"
            java.lang.String r1 = r1.getAsString(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "-"
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            io.appmetrica.analytics.impl.aa r2 = r7.f67396d
            io.appmetrica.analytics.impl.y9 r2 = r2.b(r1)
            r3 = 0
            java.util.concurrent.locks.ReentrantLock r4 = r2.f68032a     // Catch: java.lang.Throwable -> La5
            r4.lock()     // Catch: java.lang.Throwable -> La5
            io.appmetrica.analytics.impl.Z9 r4 = r2.f68033b     // Catch: java.lang.Throwable -> La5
            r4.a()     // Catch: java.lang.Throwable -> La5
            io.appmetrica.analytics.impl.ba r4 = r7.f67393a     // Catch: java.lang.Throwable -> La5
            r4.getClass()     // Catch: java.lang.Throwable -> La5
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> La5
            r4.<init>(r0, r1)     // Catch: java.lang.Throwable -> La5
            java.io.PrintWriter r0 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> La5
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> La5
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> La5
            r6.<init>(r4)     // Catch: java.lang.Throwable -> La5
            r5.<init>(r6)     // Catch: java.lang.Throwable -> La5
            r0.<init>(r5)     // Catch: java.lang.Throwable -> La5
            io.appmetrica.analytics.impl.kb r3 = new io.appmetrica.analytics.impl.kb     // Catch: java.lang.Throwable -> La4
            io.appmetrica.analytics.impl.Q5 r4 = r8.f67902a     // Catch: java.lang.Throwable -> La4
            io.appmetrica.analytics.impl.Gh r5 = r8.f67906e     // Catch: java.lang.Throwable -> La4
            java.util.HashMap r8 = r8.f67905d     // Catch: java.lang.Throwable -> La4
            r3.<init>(r4, r5, r8)     // Catch: java.lang.Throwable -> La4
            java.lang.String r8 = r3.k()     // Catch: java.lang.Throwable -> La4
            r0.write(r8)     // Catch: java.lang.Throwable -> La4
            io.appmetrica.analytics.impl.mo.a(r0)
            r2.c()
            io.appmetrica.analytics.impl.aa r8 = r7.f67396d
            monitor-enter(r8)
            java.util.HashMap r0 = r8.f66361b     // Catch: java.lang.Throwable -> La1
            r0.remove(r1)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r8)
            goto Lb0
        La1:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        La4:
            r3 = r0
        La5:
            io.appmetrica.analytics.impl.mo.a(r3)
            r2.c()
            io.appmetrica.analytics.impl.aa r8 = r7.f67396d
            r8.a(r1)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5005o6.a(io.appmetrica.analytics.impl.wh):void");
    }
}
