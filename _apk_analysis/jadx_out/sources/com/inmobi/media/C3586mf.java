package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3586mf extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdConfig.OmidConfig f27625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f27626d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3586mf(AdConfig.OmidConfig omidConfig, Context context, hn.c cVar) {
        super(2, cVar);
        this.f27625c = omidConfig;
        this.f27626d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3586mf c3586mf = new C3586mf(this.f27625c, this.f27626d, cVar);
        c3586mf.f27624b = obj;
        return c3586mf;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3586mf) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
    
        if (r0 == r2) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.Object r2 = in.a.g()
            int r0 = r1.f27623a
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L25
            if (r0 == r6) goto L1f
            if (r0 != r5) goto L17
            kotlin.c.b(r18)
            goto Lc0
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L1f:
            kotlin.c.b(r18)     // Catch: java.lang.Throwable -> L72
            r0 = r18
            goto L6b
        L25:
            kotlin.c.b(r18)
            java.lang.Object r0 = r1.f27624b
            do.l0 r0 = (p000do.l0) r0
            com.inmobi.media.core.config.models.AdConfig$OmidConfig r0 = r1.f27625c
            kotlin.Result$a r7 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L72
            r1.f27623a = r6     // Catch: java.lang.Throwable -> L72
            java.lang.String r9 = r0.getUrl()     // Catch: java.lang.Throwable -> L72
            int r7 = r0.getMaxRetries()     // Catch: java.lang.Throwable -> L72
            int r0 = r0.getRetryInterval()     // Catch: java.lang.Throwable -> L72
            zn.i r8 = com.inmobi.media.Se.f26314a     // Catch: java.lang.Throwable -> L72
            int r0 = r0 * 1000
            long r10 = (long) r0     // Catch: java.lang.Throwable -> L72
            com.inmobi.media.Je r0 = new com.inmobi.media.Je     // Catch: java.lang.Throwable -> L72
            r12 = 0
            r13 = 0
            r14 = 0
            com.inmobi.media.Ai r15 = new com.inmobi.media.Ai     // Catch: java.lang.Throwable -> L72
            r15.<init>(r7, r10, r4)     // Catch: java.lang.Throwable -> L72
            r7 = 0
            r16 = 46
            r8 = r0
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            r14 = r7
            r15 = r16
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L72
            do.h0 r7 = p000do.w0.b()     // Catch: java.lang.Throwable -> L72
            com.inmobi.media.tf r8 = new com.inmobi.media.tf     // Catch: java.lang.Throwable -> L72
            r8.<init>(r0, r3)     // Catch: java.lang.Throwable -> L72
            java.lang.Object r0 = p000do.g.g(r7, r8, r1)     // Catch: java.lang.Throwable -> L72
            if (r0 != r2) goto L6b
            goto Lbf
        L6b:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L72
            java.lang.Object r0 = kotlin.Result.m7534constructorimpl(r0)     // Catch: java.lang.Throwable -> L72
            goto L7d
        L72:
            r0 = move-exception
            kotlin.Result$a r7 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.c.a(r0)
            java.lang.Object r0 = kotlin.Result.m7534constructorimpl(r0)
        L7d:
            java.lang.Throwable r7 = kotlin.Result.m7537exceptionOrNullimpl(r0)
            if (r7 == 0) goto L88
            java.util.concurrent.atomic.AtomicInteger r7 = com.inmobi.media.C3661pf.f27875b
            r7.set(r4)
        L88:
            android.content.Context r4 = r1.f27626d
            boolean r7 = kotlin.Result.m7540isSuccessimpl(r0)
            if (r7 == 0) goto Lc0
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            java.util.concurrent.atomic.AtomicInteger r8 = com.inmobi.media.C3661pf.f27875b
            r8.set(r6)
            com.inmobi.media.sf r6 = com.inmobi.media.C3661pf.f27876c
            if (r6 != 0) goto La3
            com.inmobi.media.sf r6 = new com.inmobi.media.sf
            r6.<init>(r4)
            com.inmobi.media.C3661pf.f27876c = r6
        La3:
            r1.f27624b = r0
            r1.f27623a = r5
            do.h0 r0 = p000do.w0.b()
            com.inmobi.media.rf r4 = new com.inmobi.media.rf
            r4.<init>(r6, r7, r3)
            java.lang.Object r0 = p000do.g.g(r0, r4, r1)
            java.lang.Object r3 = in.a.g()
            if (r0 != r3) goto Lbb
            goto Lbd
        Lbb:
            bn.r r0 = bn.r.f5635a
        Lbd:
            if (r0 != r2) goto Lc0
        Lbf:
            return r2
        Lc0:
            bn.r r0 = bn.r.f5635a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3586mf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
