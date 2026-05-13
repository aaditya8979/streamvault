package com.inmobi.media;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import com.inmobi.media.Co;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProduceKt;

/* JADX INFO: loaded from: classes6.dex */
public final class Co extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f25280c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Co(ViewGroup viewGroup, hn.c cVar) {
        super(2, cVar);
        this.f25280c = viewGroup;
    }

    public static final bn.r a() {
        return bn.r.f5635a;
    }

    public static final void a(fo.m mVar, boolean z10) {
        mVar.i(Boolean.valueOf(z10));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        Co co2 = new Co(this.f25280c, cVar);
        co2.f25279b = obj;
        return co2;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        Co co2 = new Co(this.f25280c, (hn.c) obj2);
        co2.f25279b = (fo.m) obj;
        return co2.invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f25278a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            final fo.m mVar = (fo.m) this.f25279b;
            ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: n9.g
                @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                public final void onWindowFocusChanged(boolean z10) {
                    Co.a(mVar, z10);
                }
            };
            this.f25280c.getViewTreeObserver().addOnWindowFocusChangeListener(onWindowFocusChangeListener);
            ViewGroup viewGroup = this.f25280c;
            if (ViewCompat.isAttachedToWindow(viewGroup)) {
                viewGroup.addOnAttachStateChangeListener(new Bo(viewGroup, viewGroup, onWindowFocusChangeListener));
            } else {
                viewGroup.getViewTreeObserver().removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
            }
            sn.a aVar = new sn.a() { // from class: n9.h
                @Override // sn.a
                public final Object invoke() {
                    return Co.a();
                }
            };
            this.f25278a = 1;
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
