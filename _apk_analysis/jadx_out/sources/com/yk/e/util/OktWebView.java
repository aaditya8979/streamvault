package com.yk.e.util;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import bp.p1;
import bp.u0;
import g.a;

/* JADX INFO: loaded from: classes4.dex */
public class OktWebView extends WebView {
    public static final /* synthetic */ int IL1Iii = 0;

    public OktWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        u0 u0Var = new u0(this);
        WebSettings settings = getSettings();
        setVerticalScrollBarEnabled(false);
        settings.setSupportZoom(false);
        settings.setSaveFormData(false);
        settings.setJavaScriptEnabled(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setBuiltInZoomControls(false);
        settings.setAppCacheEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        getSettings().setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setWebViewClient(u0Var);
        addJavascriptInterface(new p1(this), "OktH5Bridge");
    }

    public void setIOktWebViewCallback(a aVar) {
    }
}
