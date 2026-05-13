package com.mbridge.msdk.dycreator.baseview.webview.client;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.ironsource.Z7;
import com.mbridge.msdk.dycreator.baseview.webview.communicator.WebCommunicator;
import com.mbridge.msdk.dycreator.baseview.webview.listener.WebViewEventListener;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes12.dex */
public class MBWebChromeClient extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37087a = "MBWebChromeClient";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WebViewEventListener f37088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebCommunicator f37089c;

    private boolean a(String str) {
        WebCommunicator webCommunicator;
        try {
            if (str.startsWith("mv:") || str.startsWith("mraid:")) {
                if (str.contains("wv_hybrid:")) {
                    str = str.substring(0, str.lastIndexOf(Z7.f30794r) + 1);
                }
                q0.a("MBWebChromeClient", "onConsoleMessage: message.length() = " + str.length() + Z7.f30794r + str);
                if (!TextUtils.isEmpty(str) && (webCommunicator = this.f37089c) != null) {
                    webCommunicator.onCommunication(str);
                }
                return true;
            }
        } catch (Throwable th2) {
            q0.b("MBWebChromeClient", th2.getMessage());
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (TextUtils.isEmpty(consoleMessage.message()) || !a(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (TextUtils.isEmpty(str2) || !a(str2)) {
            return false;
        }
        jsPromptResult.confirm("");
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        WebViewEventListener webViewEventListener = this.f37088b;
        if (webViewEventListener != null) {
            webViewEventListener.onProgressChanged(webView, i10);
        }
    }

    public void setCommunicator(WebCommunicator webCommunicator) {
        this.f37089c = webCommunicator;
    }

    public void setWebViewEventListener(WebViewEventListener webViewEventListener) {
        this.f37088b = webViewEventListener;
    }
}
