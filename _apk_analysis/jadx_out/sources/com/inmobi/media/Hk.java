package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class Hk extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignalsConfig.UnifiedIdServiceConfig f25618b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hk(SignalsConfig.UnifiedIdServiceConfig unifiedIdServiceConfig, hn.c cVar) {
        super(1, cVar);
        this.f25618b = unifiedIdServiceConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new Hk(this.f25618b, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new Hk(this.f25618b, (hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cb, code lost:
    
        if (r2.a(r4, r12) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e0, code lost:
    
        if (r1.a(r3, r13, r12) == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Hk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
