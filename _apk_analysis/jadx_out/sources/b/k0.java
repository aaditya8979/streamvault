package b;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yk.e.activity.RewardWebActivity;

/* JADX INFO: loaded from: classes11.dex */
public final class k0 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RewardWebActivity f5328a;

    public k0(RewardWebActivity rewardWebActivity) {
        this.f5328a = rewardWebActivity;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f5328a.f3339llL1ii.setVisibility(8);
        this.f5328a.f3332IL.setVisibility(0);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return false;
    }
}
