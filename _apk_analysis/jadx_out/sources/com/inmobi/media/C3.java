package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class C3 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f25243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f25244d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3(long j10, hn.c cVar, sn.l lVar) {
        super(2, cVar);
        this.f25243c = (SuspendLambda) lVar;
        this.f25244d = j10;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, sn.l] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3 c32 = new C3(this.f25244d, cVar, this.f25243c);
        c32.f25242b = obj;
        return c32;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[PHI: r1 r7
      0x0041: PHI (r1v4 do.l0) = (r1v3 do.l0), (r1v5 do.l0) binds: [B:16:0x0040, B:23:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0041: PHI (r7v4 com.inmobi.media.C3) = (r7v3 com.inmobi.media.C3), (r7v6 com.inmobi.media.C3) binds: [B:16:0x0040, B:23:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.coroutines.jvm.internal.SuspendLambda, sn.l] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005e -> B:17:0x0041). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = in.a.g()
            int r1 = r6.f25241a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2b
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L23
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.f25242b
            do.l0 r1 = (p000do.l0) r1
            kotlin.c.b(r7)
            r7 = r6
            goto L54
        L23:
            java.lang.Object r1 = r6.f25242b
            do.l0 r1 = (p000do.l0) r1
            kotlin.c.b(r7)
            goto L40
        L2b:
            kotlin.c.b(r7)
            java.lang.Object r7 = r6.f25242b
            do.l0 r7 = (p000do.l0) r7
            r6.f25242b = r7
            r6.f25241a = r4
            r4 = 0
            java.lang.Object r1 = p000do.s0.a(r4, r6)
            if (r1 != r0) goto L3f
            goto L60
        L3f:
            r1 = r7
        L40:
            r7 = r6
        L41:
            boolean r4 = kotlinx.coroutines.d.h(r1)
            if (r4 == 0) goto L61
            kotlin.coroutines.jvm.internal.SuspendLambda r4 = r7.f25243c
            r7.f25242b = r1
            r7.f25241a = r3
            java.lang.Object r4 = r4.invoke(r7)
            if (r4 != r0) goto L54
            goto L60
        L54:
            long r4 = r7.f25244d
            r7.f25242b = r1
            r7.f25241a = r2
            java.lang.Object r4 = p000do.s0.a(r4, r7)
            if (r4 != r0) goto L41
        L60:
            return r0
        L61:
            bn.r r7 = bn.r.f5635a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
