package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3574m3 extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f27595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3580m9 f27596d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3574m3(String str, boolean z10, InterfaceC3580m9 interfaceC3580m9, hn.c cVar) {
        super(1, cVar);
        this.f27594b = str;
        this.f27595c = z10;
        this.f27596d = interfaceC3580m9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new C3574m3(this.f27594b, this.f27595c, this.f27596d, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return ((C3574m3) create((hn.c) obj)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27593a;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                C3823w3 c3823w3 = C3823w3.f28406a;
                tn.p.j("w3", "access$getTAG$p(...)");
                C3823w3 c3823w32 = C3823w3.f28406a;
                if (C3823w3.e()) {
                    int maxRetries = C3823w3.c().getMaxRetries();
                    String str = this.f27594b;
                    S2 s22 = new S2(str, this.f27595c, false, maxRetries + 1, 197);
                    InterfaceC3580m9 interfaceC3580m9 = this.f27596d;
                    if (interfaceC3580m9 != null) {
                        tn.p.j("w3", "access$getTAG$p(...)");
                        ((C3605n9) interfaceC3580m9).a("w3", "Received click (" + str + ") for pinging over HTTP");
                    }
                    InterfaceC3580m9 interfaceC3580m92 = this.f27596d;
                    this.f27593a = 1;
                    if (c3823w32.a(s22, null, interfaceC3580m92, this) == objG) {
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
            InterfaceC3580m9 interfaceC3580m93 = this.f27596d;
            if (interfaceC3580m93 != null) {
                C3823w3 c3823w33 = C3823w3.f28406a;
                tn.p.j("w3", "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m93).b("w3", "SDK encountered unexpected error in pinging click; " + e10.getMessage());
            }
        }
        return bn.r.f5635a;
    }
}
