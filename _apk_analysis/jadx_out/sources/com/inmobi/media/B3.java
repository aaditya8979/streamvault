package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class B3 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f25195e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B3(long j10, sn.l lVar, long j11, hn.c cVar) {
        super(2, cVar);
        this.f25193c = j10;
        this.f25194d = lVar;
        this.f25195e = j11;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, sn.l] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        B3 b32 = new B3(this.f25193c, this.f25194d, this.f25195e, cVar);
        b32.f25192b = obj;
        return b32;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((B3) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[PHI: r1 r8
      0x0041: PHI (r1v4 do.l0) = (r1v3 do.l0), (r1v5 do.l0) binds: [B:16:0x0040, B:23:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0041: PHI (r8v4 com.inmobi.media.B3) = (r8v3 com.inmobi.media.B3), (r8v6 com.inmobi.media.B3) binds: [B:16:0x0040, B:23:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, sn.l] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005e -> B:17:0x0041). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = in.a.g()
            int r1 = r7.f25191a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2b
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L23
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            java.lang.Object r1 = r7.f25192b
            do.l0 r1 = (p000do.l0) r1
            kotlin.c.b(r8)
            r8 = r7
            goto L54
        L23:
            java.lang.Object r1 = r7.f25192b
            do.l0 r1 = (p000do.l0) r1
            kotlin.c.b(r8)
            goto L40
        L2b:
            kotlin.c.b(r8)
            java.lang.Object r8 = r7.f25192b
            do.l0 r8 = (p000do.l0) r8
            long r5 = r7.f25193c
            r7.f25192b = r8
            r7.f25191a = r4
            java.lang.Object r1 = p000do.s0.a(r5, r7)
            if (r1 != r0) goto L3f
            goto L60
        L3f:
            r1 = r8
        L40:
            r8 = r7
        L41:
            boolean r4 = kotlinx.coroutines.d.h(r1)
            if (r4 == 0) goto L61
            java.lang.Object r4 = r8.f25194d
            r8.f25192b = r1
            r8.f25191a = r3
            java.lang.Object r4 = r4.invoke(r8)
            if (r4 != r0) goto L54
            goto L60
        L54:
            long r4 = r8.f25195e
            r8.f25192b = r1
            r8.f25191a = r2
            java.lang.Object r4 = p000do.s0.a(r4, r8)
            if (r4 != r0) goto L41
        L60:
            return r0
        L61:
            bn.r r8 = bn.r.f5635a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.B3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
