package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class Jk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Jk f25756a = new Jk();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3688qh f25757b = new C3688qh();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f25758c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static p000do.p0 f25759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Mk f25760e;

    public static Object a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, hn.c cVar) {
        if (inMobiUnifiedIdInterface != null) {
            jn.a.a(f25758c.add(inMobiUnifiedIdInterface));
        }
        if (f25757b.f27983b.get() != null) {
            Objects.toString(inMobiUnifiedIdInterface);
            return bn.r.f5635a;
        }
        Object objA = a(cVar);
        return objA == in.a.g() ? objA : bn.r.f5635a;
    }

    public static Object a(hn.c cVar) {
        C3688qh c3688qh = Yi.f26652a;
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(SignalsConfig.class, "clazz");
        SignalsConfig.UnifiedIdServiceConfig unifiedIdServiceConfig = ((SignalsConfig) Y3.f26611a.a(SignalsConfig.class)).getUnifiedIdServiceConfig();
        unifiedIdServiceConfig.getUrl();
        Object objA = F3.a(f25757b, new Hk(unifiedIdServiceConfig, null), cVar);
        return objA == in.a.g() ? objA : bn.r.f5635a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (a((hn.c) r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.inmobi.media.Fk
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.Fk r0 = (com.inmobi.media.Fk) r0
            int r1 = r0.f25462c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25462c = r1
            goto L18
        L13:
            com.inmobi.media.Fk r0 = new com.inmobi.media.Fk
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f25460a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f25462c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.c.b(r7)
            goto L55
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            kotlin.c.b(r7)
            goto L4c
        L38:
            kotlin.c.b(r7)
            com.inmobi.media.qh r7 = com.inmobi.media.Jk.f25757b
            com.inmobi.media.Gk r2 = new com.inmobi.media.Gk
            r5 = 0
            r2.<init>(r5)
            r0.f25462c = r4
            java.lang.Object r7 = com.inmobi.media.F3.a(r7, r2, r0)
            if (r7 != r1) goto L4c
            goto L54
        L4c:
            r0.f25462c = r3
            java.lang.Object r7 = a(r0)
            if (r7 != r1) goto L55
        L54:
            return r1
        L55:
            bn.r r7 = bn.r.f5635a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Jk.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
