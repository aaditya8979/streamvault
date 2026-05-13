package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.HashSet;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5089rg implements InterfaceC4940lg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f67622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f67623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5015og f67624c;

    public C5089rg() {
        this(C5009oa.k().u());
    }

    public C5089rg(C4965mg c4965mg) {
        this.f67622a = new HashSet();
        c4965mg.a(new C5269yl(this));
        c4965mg.a();
    }

    public final synchronized void a(@NonNull InterfaceC4811gg interfaceC4811gg) {
        this.f67622a.add(interfaceC4811gg);
        if (this.f67623b) {
            interfaceC4811gg.a(this.f67624c);
            this.f67622a.remove(interfaceC4811gg);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[Catch: all -> 0x003e, LOOP:0: B:7:0x0025->B:9:0x002b, LOOP_END, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x001b, B:7:0x0025, B:9:0x002b, B:10:0x0037), top: B:16:0x0004 }] */
    @Override // io.appmetrica.analytics.impl.InterfaceC4940lg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(@androidx.annotation.Nullable io.appmetrica.analytics.impl.C5015og r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 1
            if (r6 == 0) goto L1b
            io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger r1 = io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getMainPublicOrAnonymousLogger()     // Catch: java.lang.Throwable -> L3e
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L3e
            io.appmetrica.analytics.impl.ng r3 = r6.f67463d     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = r3.f67368a     // Catch: java.lang.Throwable -> L3e
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = r6.f67460a     // Catch: java.lang.Throwable -> L3e
            r2[r0] = r3     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "Received referrer from source %s: %s"
            r1.info(r3, r2)     // Catch: java.lang.Throwable -> L3e
        L1b:
            r5.f67624c = r6     // Catch: java.lang.Throwable -> L3e
            r5.f67623b = r0     // Catch: java.lang.Throwable -> L3e
            java.util.HashSet r6 = r5.f67622a     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L3e
        L25:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L37
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> L3e
            io.appmetrica.analytics.impl.gg r0 = (io.appmetrica.analytics.impl.InterfaceC4811gg) r0     // Catch: java.lang.Throwable -> L3e
            io.appmetrica.analytics.impl.og r1 = r5.f67624c     // Catch: java.lang.Throwable -> L3e
            r0.a(r1)     // Catch: java.lang.Throwable -> L3e
            goto L25
        L37:
            java.util.HashSet r6 = r5.f67622a     // Catch: java.lang.Throwable -> L3e
            r6.clear()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r5)
            return
        L3e:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5089rg.a(io.appmetrica.analytics.impl.og):void");
    }
}
