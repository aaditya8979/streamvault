package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.inmobi.media.Kh;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes8.dex */
public class Kh extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3337ci f25814a;

    public Kh(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        this.f25814a = gestureDetectorOnGestureListenerC3337ci;
    }

    public static final void a(GeolocationPermissions.Callback callback, String str, DialogInterface dialogInterface, int i10) {
        callback.invoke(str, true, false);
    }

    public static final void a(JsResult jsResult, DialogInterface dialogInterface, int i10) {
        jsResult.confirm();
    }

    public static final void b(GeolocationPermissions.Callback callback, String str, DialogInterface dialogInterface, int i10) {
        callback.invoke(str, false, false);
    }

    public static final void b(JsResult jsResult, DialogInterface dialogInterface, int i10) {
        jsResult.confirm();
    }

    public static final void c(JsResult jsResult, DialogInterface dialogInterface, int i10) {
        jsResult.cancel();
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        if (defaultVideoPoster != null) {
            return defaultVideoPoster;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        tn.p.j(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        tn.p.k(consoleMessage, "cm");
        String str = consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId();
        InterfaceC3580m9 interfaceC3580m9 = this.f25814a.f26958i;
        if (interfaceC3580m9 == null) {
            return true;
        }
        String str2 = GestureDetectorOnGestureListenerC3337ci.f26937g1;
        tn.p.j(str2, "access$getTAG$cp(...)");
        ((C3605n9) interfaceC3580m9).c(str2, "Console message:" + str);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
        tn.p.k(str, "origin");
        tn.p.k(callback, "callback");
        if (this.f25814a.f26982u.get() != null) {
            new AlertDialog.Builder((Context) this.f25814a.f26982u.get()).setTitle("Location Permission").setMessage("Allow location access").setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: n9.l2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    Kh.a(callback, str, dialogInterface, i10);
                }
            }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: n9.m2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    Kh.b(callback, str, dialogInterface, i10);
                }
            }).create().show();
        }
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(str, "url");
        tn.p.k(str2, "message");
        tn.p.k(jsResult, "result");
        InterfaceC3580m9 interfaceC3580m9 = this.f25814a.f26958i;
        if (interfaceC3580m9 != null) {
            String str3 = GestureDetectorOnGestureListenerC3337ci.f26937g1;
            tn.p.j(str3, "access$getTAG$cp(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "jsAlert called with: " + str2 + str);
        }
        if (!this.f25814a.a(jsResult)) {
            return true;
        }
        Activity fullScreenActivity = this.f25814a.getFullScreenActivity();
        if (fullScreenActivity != null) {
            new AlertDialog.Builder(fullScreenActivity).setMessage(str2).setTitle(str).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: n9.k2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    Kh.a(jsResult, dialogInterface, i10);
                }
            }).setCancelable(false).create().show();
            return true;
        }
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(str, "url");
        tn.p.k(str2, "message");
        tn.p.k(jsResult, "result");
        InterfaceC3580m9 interfaceC3580m9 = this.f25814a.f26958i;
        if (interfaceC3580m9 != null) {
            String str3 = GestureDetectorOnGestureListenerC3337ci.f26937g1;
            tn.p.j(str3, "access$getTAG$cp(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "jsConfirm called with: " + str2 + str);
        }
        if (!this.f25814a.a(jsResult)) {
            return true;
        }
        if (this.f25814a.getFullScreenActivity() != null) {
            new AlertDialog.Builder(this.f25814a.getFullScreenActivity()).setMessage(str2).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: n9.i2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    Kh.b(jsResult, dialogInterface, i10);
                }
            }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: n9.j2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    Kh.c(jsResult, dialogInterface, i10);
                }
            }).create().show();
            return true;
        }
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        tn.p.k(webView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(str, "url");
        tn.p.k(str2, "message");
        tn.p.k(str3, "defaultValue");
        tn.p.k(jsPromptResult, "result");
        InterfaceC3580m9 interfaceC3580m9 = this.f25814a.f26958i;
        if (interfaceC3580m9 != null) {
            String str4 = GestureDetectorOnGestureListenerC3337ci.f26937g1;
            tn.p.j(str4, "access$getTAG$cp(...)");
            ((C3605n9) interfaceC3580m9).a(str4, "jsPrompt called with: " + str2 + str);
        }
        if (!this.f25814a.a(jsPromptResult)) {
            return true;
        }
        if (this.f25814a.getFullScreenActivity() != null) {
            return false;
        }
        jsPromptResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f25814a.f26958i;
        if (interfaceC3580m9 != null) {
            String str = GestureDetectorOnGestureListenerC3337ci.f26937g1;
            tn.p.j(str, "access$getTAG$cp(...)");
            ((C3605n9) interfaceC3580m9).c(str, "webview progress changed - " + i10);
        }
        super.onProgressChanged(webView, i10);
    }
}
