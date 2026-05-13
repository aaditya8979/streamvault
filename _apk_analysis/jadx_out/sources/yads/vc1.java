package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class vc1 implements uc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final km f96059a;

    public vc1(km kmVar) {
        this.f96059a = kmVar;
    }

    @Override // yads.uc1
    public final void a(Context context, View view) {
    }

    @Override // yads.uc1
    public final void onAttachedToWindow() {
        int i10 = tb.f95131b;
        if (tb.a((mu) this.f96059a)) {
            return;
        }
        this.f96059a.m();
    }

    @Override // yads.uc1
    public final void onDetachedFromWindow() {
        int i10 = tb.f95131b;
        if (tb.a((mu) this.f96059a)) {
            return;
        }
        this.f96059a.n();
    }
}
