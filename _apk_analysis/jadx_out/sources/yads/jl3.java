package yads;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes12.dex */
public final class jl3 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener f91271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f91272b;

    public jl3(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this.f91271a = onPreDrawListener;
        this.f91272b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f91271a.onPreDraw();
        this.f91272b.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
