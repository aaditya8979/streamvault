package yads;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes9.dex */
public final class zv3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f97801b;

    public zv3(dw3 dw3Var) {
        this.f97801b = dw3Var.f89011g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f97801b.destroy();
    }
}
