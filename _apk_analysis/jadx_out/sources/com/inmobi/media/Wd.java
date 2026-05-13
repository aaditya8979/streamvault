package com.inmobi.media;

import android.R;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class Wd extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3281ae f26537a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wd(C3281ae c3281ae, hn.c cVar) {
        super(2, cVar);
        this.f26537a = c3281ae;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Wd(this.f26537a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new Wd(this.f26537a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        C3281ae c3281ae = this.f26537a;
        c3281ae.getClass();
        c3281ae.f26788a.addView(c3281ae.f26794g, new RelativeLayout.LayoutParams(-1, -1));
        C3281ae c3281ae2 = this.f26537a;
        boolean z10 = c3281ae2.f26791d.f26210d.f26057a;
        c3281ae2.f26796i = z10;
        if (z10) {
            c3281ae2.a(c3281ae2.f26797j, c3281ae2.f26798k);
        } else {
            c3281ae2.a(c3281ae2.f26798k, c3281ae2.f26797j);
        }
        C3316bn c3316bn = this.f26537a.f26799l;
        if (c3316bn.f26886c.f25444a) {
            float fB = J5.b();
            ProgressBar progressBar = new ProgressBar(c3316bn.f26885b.getContext(), null, R.attr.progressBarStyleHorizontal);
            c3316bn.f26888e = progressBar;
            D6.a(progressBar, c3316bn.f26886c, fB);
            c3316bn.f26885b.addView(c3316bn.f26888e);
            p000do.i.d(c3316bn.f26884a, p000do.w0.c(), null, new Zm(c3316bn.f26887d, null, c3316bn), 2, null);
        }
        return bn.r.f5635a;
    }
}
