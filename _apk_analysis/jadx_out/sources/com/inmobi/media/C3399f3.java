package com.inmobi.media;

import android.os.Message;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3399f3 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HandlerC3425g3 f27130b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3399f3(HandlerC3425g3 handlerC3425g3, hn.c cVar) {
        super(2, cVar);
        this.f27130b = handlerC3425g3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3399f3(this.f27130b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3399f3(this.f27130b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27129a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            W2 w22 = (W2) C3823w3.f28407b.getValue();
            this.f27129a = 1;
            obj = w22.a(this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            return jn.a.a(this.f27130b.sendMessage(messageObtain));
        }
        C3823w3 c3823w3 = C3823w3.f28406a;
        tn.p.j("w3", "access$getTAG$p(...)");
        C3823w3.f28412g.set(false);
        return bn.r.f5635a;
    }
}
