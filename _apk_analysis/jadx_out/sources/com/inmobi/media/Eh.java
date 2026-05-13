package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Eh extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gh f25393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ab f25394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONObject f25395c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eh(Gh gh2, Ab ab2, JSONObject jSONObject, hn.c cVar) {
        super(1, cVar);
        this.f25393a = gh2;
        this.f25394b = ab2;
        this.f25395c = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new Eh(this.f25393a, this.f25394b, this.f25395c, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return ((Eh) create((hn.c) obj)).invokeSuspend(bn.r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0045 A[Catch: Exception -> 0x004f, TRY_LEAVE, TryCatch #0 {Exception -> 0x004f, blocks: (B:3:0x0006, B:11:0x0025, B:14:0x002a, B:15:0x002f, B:16:0x0030, B:18:0x0034, B:21:0x0039, B:23:0x003d, B:25:0x0041, B:27:0x0045), top: B:33:0x0006 }] */
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
            com.inmobi.media.Gh r3 = r2.f25393a     // Catch: java.lang.Exception -> L4f
            com.inmobi.media.Cb r3 = r3.f25536e     // Catch: java.lang.Exception -> L4f
            com.inmobi.media.Ab r0 = r2.f25394b     // Catch: java.lang.Exception -> L4f
            r3.getClass()     // Catch: java.lang.Exception -> L4f
            java.lang.String r1 = "eventLogLevel"
            tn.p.k(r0, r1)     // Catch: java.lang.Exception -> L4f
            com.inmobi.media.Ab r3 = r3.f25258a     // Catch: java.lang.Exception -> L4f
            int r3 = r3.ordinal()     // Catch: java.lang.Exception -> L4f
            if (r3 == 0) goto L45
            r1 = 1
            if (r3 == r1) goto L39
            r1 = 2
            if (r3 == r1) goto L30
            r1 = 3
            if (r3 != r1) goto L2a
            com.inmobi.media.Ab r3 = com.inmobi.media.Ab.f25154d     // Catch: java.lang.Exception -> L4f
            if (r0 != r3) goto L5a
            goto L45
        L2a:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L4f
            r3.<init>()     // Catch: java.lang.Exception -> L4f
            throw r3     // Catch: java.lang.Exception -> L4f
        L30:
            com.inmobi.media.Ab r3 = com.inmobi.media.Ab.f25153c     // Catch: java.lang.Exception -> L4f
            if (r0 == r3) goto L45
            com.inmobi.media.Ab r3 = com.inmobi.media.Ab.f25154d     // Catch: java.lang.Exception -> L4f
            if (r0 != r3) goto L5a
            goto L45
        L39:
            com.inmobi.media.Ab r3 = com.inmobi.media.Ab.f25152b     // Catch: java.lang.Exception -> L4f
            if (r0 == r3) goto L45
            com.inmobi.media.Ab r3 = com.inmobi.media.Ab.f25153c     // Catch: java.lang.Exception -> L4f
            if (r0 == r3) goto L45
            com.inmobi.media.Ab r3 = com.inmobi.media.Ab.f25154d     // Catch: java.lang.Exception -> L4f
            if (r0 != r3) goto L5a
        L45:
            com.inmobi.media.Gh r3 = r2.f25393a     // Catch: java.lang.Exception -> L4f
            java.util.List r3 = r3.f25538g     // Catch: java.lang.Exception -> L4f
            org.json.JSONObject r0 = r2.f25395c     // Catch: java.lang.Exception -> L4f
            r3.add(r0)     // Catch: java.lang.Exception -> L4f
            goto L5a
        L4f:
            r3 = move-exception
            com.inmobi.media.Gh r0 = r2.f25393a
            r0.getClass()
            bn.g r0 = com.inmobi.media.P9.f26117a
            com.inmobi.media.AbstractC3481i9.a(r3)
        L5a:
            bn.r r3 = bn.r.f5635a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Eh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
