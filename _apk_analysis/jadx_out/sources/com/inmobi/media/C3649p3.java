package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3649p3 extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f27831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3580m9 f27832d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3649p3(String str, boolean z10, InterfaceC3580m9 interfaceC3580m9, hn.c cVar) {
        super(1, cVar);
        this.f27830b = str;
        this.f27831c = z10;
        this.f27832d = interfaceC3580m9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new C3649p3(this.f27830b, this.f27831c, this.f27832d, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return ((C3649p3) create((hn.c) obj)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27829a;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                C3823w3 c3823w3 = C3823w3.f28406a;
                if (C3823w3.e()) {
                    int maxRetries = C3823w3.c().getMaxRetries();
                    String str = this.f27830b;
                    S2 s22 = new S2(str, this.f27831c, true, maxRetries + 1, 197);
                    InterfaceC3580m9 interfaceC3580m9 = this.f27832d;
                    if (interfaceC3580m9 != null) {
                        tn.p.j("w3", "access$getTAG$p(...)");
                        ((C3605n9) interfaceC3580m9).c("w3", "Received click (" + str + ") for pinging in WebView");
                    }
                    InterfaceC3580m9 interfaceC3580m92 = this.f27832d;
                    this.f27829a = 1;
                    if (c3823w3.a(s22, null, interfaceC3580m92, this) == objG) {
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
            InterfaceC3580m9 interfaceC3580m93 = this.f27832d;
            if (interfaceC3580m93 != null) {
                C3823w3 c3823w32 = C3823w3.f28406a;
                tn.p.j("w3", "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m93).b("w3", "SDK encountered unexpected error in pinging click over WebView; " + e10.getMessage());
            }
        }
        return bn.r.f5635a;
    }
}
