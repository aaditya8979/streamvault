package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.inmobi.media.sn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class ViewOnAttachStateChangeListenerC3743sn implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fo.m f28151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f28152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f28153c;

    public ViewOnAttachStateChangeListenerC3743sn(fo.m mVar, View view, ViewGroup viewGroup) {
        this.f28151a = mVar;
        this.f28152b = view;
        this.f28153c = viewGroup;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        tn.p.k(view, "v");
        this.f28151a.i(Boolean.valueOf(AbstractC3818vn.a(this.f28152b, this.f28153c)));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        tn.p.k(view, "v");
        this.f28151a.i(Boolean.FALSE);
    }
}
