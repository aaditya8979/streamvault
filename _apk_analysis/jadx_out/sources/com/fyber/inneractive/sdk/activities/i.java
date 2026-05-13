package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f15808a;

    public i(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f15808a = inneractiveInternalBrowserActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/i;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.g.f53142p, view);
        safedk_i_onClick_1200834ee922fd5240cd40a80db83d37(view);
    }

    public void safedk_i_onClick_1200834ee922fd5240cd40a80db83d37(View view) {
        WebView webView = this.f15808a.f15789e;
        if (webView == null || !webView.canGoBack()) {
            return;
        }
        this.f15808a.f15789e.goBack();
    }
}
