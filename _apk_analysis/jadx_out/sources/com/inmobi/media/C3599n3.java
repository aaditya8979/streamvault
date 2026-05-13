package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3599n3 extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3605n9 f27670c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3599n3(String str, C3605n9 c3605n9, hn.c cVar) {
        super(1, cVar);
        this.f27669b = str;
        this.f27670c = c3605n9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new C3599n3(this.f27669b, this.f27670c, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new C3599n3(this.f27669b, this.f27670c, (hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27668a;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                C3823w3 c3823w3 = C3823w3.f28406a;
                if (C3823w3.e()) {
                    int maxRetries = C3823w3.c().getMaxRetries();
                    String str = this.f27669b;
                    S2 s22 = new S2(str, true, false, maxRetries + 1, 193);
                    C3605n9 c3605n9 = this.f27670c;
                    if (c3605n9 != null) {
                        tn.p.j("w3", "access$getTAG$p(...)");
                        c3605n9.a("w3", "Received click (" + str + ") for pinging over HTTP");
                    }
                    C3605n9 c3605n92 = this.f27670c;
                    this.f27668a = 1;
                    if (c3823w3.a(s22, null, c3605n92, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
        } catch (Exception e10) {
            C3605n9 c3605n93 = this.f27670c;
            if (c3605n93 != null) {
                C3823w3 c3823w32 = C3823w3.f28406a;
                tn.p.j("w3", "access$getTAG$p(...)");
                c3605n93.b("w3", "SDK encountered unexpected error in pinging click; " + e10.getMessage());
            }
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
        }
        return bn.r.f5635a;
    }
}
