package yads;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes12.dex */
public final class gx3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f90150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f90151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3 f90152d;

    public gx3(ix3 ix3Var, WebView webView, String str) {
        this.f90152d = ix3Var;
        this.f90150b = webView;
        this.f90151c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ix3 ix3Var = this.f90152d;
        WebView webView = this.f90150b;
        String str = this.f90151c;
        ix3Var.getClass();
        ix3.a(webView, str);
    }
}
