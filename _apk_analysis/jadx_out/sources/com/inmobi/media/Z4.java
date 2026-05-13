package com.inmobi.media;

import android.net.Network;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class Z4 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Network f26685a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z4(Network network, hn.c cVar) {
        super(2, cVar);
        this.f26685a = network;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Z4(this.f26685a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new Z4(this.f26685a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
        /*
            r2 = this;
            in.a.g()
            kotlin.c.b(r3)
            r3 = 0
            com.inmobi.media.core.config.models.AdConfig$CustomNetworkValidation r0 = com.inmobi.media.C3272a5.a()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            if (r0 == 0) goto L30
            java.lang.String r0 = r0.getUrlDomain()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            if (r0 == 0) goto L30
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            if (r1 <= 0) goto L1a
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 == 0) goto L30
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            java.lang.String r1 = ""
            boolean r0 = tn.p.f(r0, r1)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
            r0 = r0 ^ 1
            goto L31
        L2e:
            r0 = move-exception
            goto L53
        L30:
            r0 = r3
        L31:
            com.inmobi.media.C3272a5.f26738b = r0     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L40
            android.net.Network r0 = r2.f26685a     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L40
            com.inmobi.media.C3272a5.f26737a = r0     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L40
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L40
            com.inmobi.media.C3272a5.f26739c = r0     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L40
            android.net.Network r0 = com.inmobi.media.C3272a5.f26737a     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L40
            goto L4b
        L40:
            r0 = move-exception
            bn.g r1 = com.inmobi.media.P9.f26117a     // Catch: java.lang.Throwable -> L2e
            com.inmobi.media.L2 r1 = new com.inmobi.media.L2     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            com.inmobi.media.P9.a(r1)     // Catch: java.lang.Throwable -> L2e
        L4b:
            java.util.concurrent.atomic.AtomicBoolean r0 = com.inmobi.media.C3272a5.f26741e
            r0.set(r3)
            bn.r r3 = bn.r.f5635a
            return r3
        L53:
            java.util.concurrent.atomic.AtomicBoolean r1 = com.inmobi.media.C3272a5.f26741e
            r1.set(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Z4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
