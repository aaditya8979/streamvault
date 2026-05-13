package com.inmobi.media;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import com.inmobi.media.Eo;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProduceKt;

/* JADX INFO: loaded from: classes7.dex */
public final class Eo extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f25406c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eo(ViewGroup viewGroup, hn.c cVar) {
        super(2, cVar);
        this.f25406c = viewGroup;
    }

    public static final bn.r a() {
        return bn.r.f5635a;
    }

    public static final void a(fo.m mVar, int i10) {
        mVar.i(Boolean.valueOf(i10 == 0));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        Eo eo2 = new Eo(this.f25406c, cVar);
        eo2.f25405b = obj;
        return eo2;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        Eo eo2 = new Eo(this.f25406c, (hn.c) obj2);
        eo2.f25405b = (fo.m) obj;
        return eo2.invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f25404a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            final fo.m mVar = (fo.m) this.f25405b;
            mVar.i(jn.a.a(this.f25406c.getWindowVisibility() == 0));
            ViewTreeObserver.OnWindowVisibilityChangeListener onWindowVisibilityChangeListener = new ViewTreeObserver.OnWindowVisibilityChangeListener() { // from class: n9.c0
                @Override // android.view.ViewTreeObserver.OnWindowVisibilityChangeListener
                public final void onWindowVisibilityChanged(int i11) {
                    Eo.a(mVar, i11);
                }
            };
            this.f25406c.getViewTreeObserver().addOnWindowVisibilityChangeListener(onWindowVisibilityChangeListener);
            ViewGroup viewGroup = this.f25406c;
            if (ViewCompat.isAttachedToWindow(viewGroup)) {
                viewGroup.addOnAttachStateChangeListener(new Do(viewGroup, viewGroup, onWindowVisibilityChangeListener));
            } else {
                viewGroup.getViewTreeObserver().removeOnWindowVisibilityChangeListener(onWindowVisibilityChangeListener);
            }
            sn.a aVar = new sn.a() { // from class: n9.d0
                @Override // sn.a
                public final Object invoke() {
                    return Eo.a();
                }
            };
            this.f25404a = 1;
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
