package yads;

import android.view.WindowManager;

/* JADX INFO: loaded from: classes8.dex */
public final class rh3 implements qh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowManager f94461a;

    public rh3(WindowManager windowManager) {
        this.f94461a = windowManager;
    }

    @Override // yads.qh3
    public final void a() {
    }

    @Override // yads.qh3
    public final void a(ph3 ph3Var) {
        ph3Var.a(this.f94461a.getDefaultDisplay());
    }
}
