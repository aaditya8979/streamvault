package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.Ao;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProduceKt;

/* JADX INFO: loaded from: classes7.dex */
public final class Ao extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f25189c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ao(ViewGroup viewGroup, hn.c cVar) {
        super(2, cVar);
        this.f25189c = viewGroup;
    }

    public static final bn.r a(View view, zo zoVar) {
        view.removeOnAttachStateChangeListener(zoVar);
        return bn.r.f5635a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        Ao ao2 = new Ao(this.f25189c, cVar);
        ao2.f25188b = obj;
        return ao2;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        Ao ao2 = new Ao(this.f25189c, (hn.c) obj2);
        ao2.f25188b = (fo.m) obj;
        return ao2.invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f25187a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            fo.m mVar = (fo.m) this.f25188b;
            mVar.i(jn.a.a(this.f25189c.isAttachedToWindow()));
            final zo zoVar = new zo(mVar);
            this.f25189c.addOnAttachStateChangeListener(zoVar);
            final ViewGroup viewGroup = this.f25189c;
            sn.a aVar = new sn.a() { // from class: n9.c
                @Override // sn.a
                public final Object invoke() {
                    return Ao.a(viewGroup, zoVar);
                }
            };
            this.f25187a = 1;
            if (ProduceKt.b(mVar, aVar, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return bn.r.f5635a;
    }
}
