package com.inmobi.media;

import android.os.Message;
import com.inmobi.media.core.config.models.AdConfig;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3270a3 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W2 f26733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HandlerC3425g3 f26734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdConfig.ImaiConfig f26735d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3270a3(W2 w22, HandlerC3425g3 handlerC3425g3, AdConfig.ImaiConfig imaiConfig, hn.c cVar) {
        super(2, cVar);
        this.f26733b = w22;
        this.f26734c = handlerC3425g3;
        this.f26735d = imaiConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3270a3(this.f26733b, this.f26734c, this.f26735d, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3270a3) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f26732a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            W2 w22 = this.f26733b;
            this.f26732a = 1;
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
            C3823w3.f28412g.set(false);
            return bn.r.f5635a;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        return jn.a.a(this.f26734c.sendMessageDelayed(messageObtain, this.f26735d.getPingInterval() * 1000));
    }
}
