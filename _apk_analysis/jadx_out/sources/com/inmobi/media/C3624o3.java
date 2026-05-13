package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3624o3 extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3605n9 f27745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3267a0 f27746d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3624o3(String str, C3605n9 c3605n9, C3267a0 c3267a0, hn.c cVar) {
        super(1, cVar);
        this.f27744b = str;
        this.f27745c = c3605n9;
        this.f27746d = c3267a0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new C3624o3(this.f27744b, this.f27745c, this.f27746d, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return ((C3624o3) create((hn.c) obj)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27743a;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                C3823w3 c3823w3 = C3823w3.f28406a;
                if (C3823w3.e()) {
                    int maxRetries = C3823w3.c().getMaxRetries();
                    String str = this.f27744b;
                    S2 s22 = new S2(str, true, false, maxRetries + 1, 197);
                    C3605n9 c3605n9 = this.f27745c;
                    if (c3605n9 != null) {
                        tn.p.j("w3", "access$getTAG$p(...)");
                        c3605n9.a("w3", "Received click (" + str + ") for pinging over HTTP");
                    }
                    C3267a0 c3267a0 = this.f27746d;
                    C3605n9 c3605n92 = this.f27745c;
                    this.f27743a = 1;
                    if (c3823w3.a(s22, c3267a0, c3605n92, this) == objG) {
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
            C3605n9 c3605n93 = this.f27745c;
            if (c3605n93 != null) {
                C3823w3 c3823w32 = C3823w3.f28406a;
                tn.p.j("w3", "access$getTAG$p(...)");
                c3605n93.b("w3", "SDK encountered unexpected error in pinging click; " + e10.getMessage());
            }
        }
        return bn.r.f5635a;
    }
}
