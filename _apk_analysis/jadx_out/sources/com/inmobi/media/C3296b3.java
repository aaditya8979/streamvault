package com.inmobi.media;

import android.os.Message;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3296b3 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S2 f26830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HandlerC3425g3 f26831d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3296b3(S2 s22, HandlerC3425g3 handlerC3425g3, hn.c cVar) {
        super(2, cVar);
        this.f26830c = s22;
        this.f26831d = handlerC3425g3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3296b3 c3296b3 = new C3296b3(this.f26830c, this.f26831d, cVar);
        c3296b3.f26829b = obj;
        return c3296b3;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3296b3) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        Object objG = in.a.g();
        int i10 = this.f26828a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            p000do.l0 l0Var = (p000do.l0) this.f26829b;
            C3524k3 c3524k3 = new C3524k3();
            S2 s22 = this.f26830c;
            this.f26829b = l0Var;
            this.f26828a = 1;
            obj = c3524k3.a(s22, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        if (((EnumC3273a6) obj) != null) {
            HandlerC3425g3 handlerC3425g3 = this.f26831d;
            S2 s23 = this.f26830c;
            int i11 = HandlerC3425g3.f27198a;
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = s23;
            handlerC3425g3.sendMessage(messageObtain);
        } else {
            S2 s24 = this.f26830c;
            HandlerC3425g3 handlerC3425g32 = this.f26831d;
            C3823w3 c3823w3 = C3823w3.f28406a;
            tn.p.j("w3", "access$getTAG$p(...)");
            String str = s24.f26275b;
            C3823w3.b(s24);
            int i12 = HandlerC3425g3.f27198a;
            handlerC3425g32.b(s24);
        }
        return bn.r.f5635a;
    }
}
