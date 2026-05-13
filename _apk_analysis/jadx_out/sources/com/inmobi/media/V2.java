package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class V2 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W2 f26467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S2 f26468d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V2(int i10, W2 w22, S2 s22, hn.c cVar) {
        super(2, cVar);
        this.f26466b = i10;
        this.f26467c = w22;
        this.f26468d = s22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new V2(this.f26466b, this.f26467c, this.f26468d, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((V2) create((C3431g9) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (r6.a("click", r1, 5, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = in.a.g()
            int r1 = r5.f26465a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.c.b(r6)
            goto L5d
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.c.b(r6)
            goto L47
        L1e:
            kotlin.c.b(r6)
            int r6 = r5.f26466b
            int r6 = r6 - r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "DELETE FROM click WHERE ts = (SELECT ts FROM click ORDER BY ts ASC LIMIT 1) AND (SELECT COUNT(*) FROM click) > "
            r1.append(r4)
            r1.append(r6)
            java.lang.String r6 = ";"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.inmobi.media.W2 r1 = r5.f26467c
            com.inmobi.media.g9 r1 = r1.f26518a
            r5.f26465a = r3
            java.lang.Object r6 = r1.a(r6, r5)
            if (r6 != r0) goto L47
            goto L5c
        L47:
            com.inmobi.media.W2 r6 = r5.f26467c
            com.inmobi.media.g9 r6 = r6.f26518a
            com.inmobi.media.S2 r1 = r5.f26468d
            android.content.ContentValues r1 = com.inmobi.media.Y2.a(r1)
            r5.f26465a = r2
            r2 = 5
            java.lang.String r3 = "click"
            java.lang.Object r6 = r6.a(r3, r1, r2, r5)
            if (r6 != r0) goto L5d
        L5c:
            return r0
        L5d:
            bn.r r6 = bn.r.f5635a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.V2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
