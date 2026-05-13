package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.C3768tn;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProduceKt;

/* JADX INFO: renamed from: com.inmobi.media.tn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3768tn extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f28210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f28211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3768tn(View view, ViewGroup viewGroup, hn.c cVar) {
        super(2, cVar);
        this.f28210c = view;
        this.f28211d = viewGroup;
    }

    public static final bn.r a(View view, ViewOnAttachStateChangeListenerC3743sn viewOnAttachStateChangeListenerC3743sn) {
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3743sn);
        return bn.r.f5635a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3768tn c3768tn = new C3768tn(this.f28210c, this.f28211d, cVar);
        c3768tn.f28209b = obj;
        return c3768tn;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3768tn) create((fo.m) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f28208a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            fo.m mVar = (fo.m) this.f28209b;
            View view = this.f28210c;
            final ViewOnAttachStateChangeListenerC3743sn viewOnAttachStateChangeListenerC3743sn = new ViewOnAttachStateChangeListenerC3743sn(mVar, view, this.f28211d);
            view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3743sn);
            mVar.i(jn.a.a(AbstractC3818vn.b(this.f28210c, this.f28211d)));
            final View view2 = this.f28210c;
            sn.a aVar = new sn.a() { // from class: n9.la
                @Override // sn.a
                public final Object invoke() {
                    return C3768tn.a(view2, viewOnAttachStateChangeListenerC3743sn);
                }
            };
            this.f28208a = 1;
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
