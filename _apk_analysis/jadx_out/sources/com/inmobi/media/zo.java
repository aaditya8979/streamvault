package com.inmobi.media;

import android.view.View;

/* JADX INFO: loaded from: classes12.dex */
public final class zo implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fo.m f28673a;

    public zo(fo.m mVar) {
        this.f28673a = mVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        tn.p.k(view, "v");
        this.f28673a.i(Boolean.TRUE);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        tn.p.k(view, "v");
        this.f28673a.i(Boolean.FALSE);
    }
}
