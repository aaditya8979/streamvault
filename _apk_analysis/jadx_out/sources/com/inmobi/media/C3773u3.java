package com.inmobi.media;

import android.os.Message;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3773u3 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28223a;

    public C3773u3(hn.c cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3773u3(cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3773u3((hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f28223a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            W2 w22 = (W2) C3823w3.f28407b.getValue();
            this.f28223a = 1;
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
        if (!((Boolean) obj).booleanValue()) {
            C3823w3 c3823w3 = C3823w3.f28406a;
            tn.p.j("w3", "access$getTAG$p(...)");
            C3823w3.f28412g.set(false);
            C3823w3.g();
            return bn.r.f5635a;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        HandlerC3425g3 handlerC3425g3 = C3823w3.f28409d;
        if (handlerC3425g3 != null) {
            return jn.a.a(handlerC3425g3.sendMessage(messageObtain));
        }
        return null;
    }
}
