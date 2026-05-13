package b;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.yk.e.activity.GameActivity;

/* JADX INFO: loaded from: classes8.dex */
public final class y extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GameActivity f5343a;

    public y(GameActivity gameActivity) {
        this.f5343a = gameActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        this.f5343a.f3311IL.setProgress(i10);
    }
}
