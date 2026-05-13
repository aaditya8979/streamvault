package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* JADX INFO: compiled from: MBWebViewChecker.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Boolean f38888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Handler f38889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f38890c;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.webEnvCheck.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MBWebViewChecker.java */
    public class RunnableC0473a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f38891a;

        public RunnableC0473a(Context context) {
            this.f38891a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.f38888a == null) {
                try {
                    Boolean unused = a.f38888a = Boolean.valueOf(a.a(this.f38891a));
                } catch (Exception unused2) {
                    Boolean unused3 = a.f38888a = Boolean.FALSE;
                }
            }
        }
    }

    private static void a(WebView webView) {
        try {
            webView.destroy();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("MBWebViewChecker", "destroy webview error", e10);
            }
        }
    }

    public static boolean a(Context context) {
        WebView webView;
        try {
            webView = new WebView(context);
            webView.setWebViewClient(new b());
        } catch (Exception unused) {
            webView = null;
        }
        if (webView == null) {
            return false;
        }
        a(webView);
        return true;
    }

    public static boolean b(Context context) {
        g gVarB;
        try {
            gVarB = h.b().b(c.n().b());
        } catch (Exception unused) {
            gVarB = null;
        }
        if (gVarB != null) {
            f38890c = Boolean.valueOf(gVarB.D0());
        } else {
            f38890c = Boolean.FALSE;
        }
        Boolean bool = f38890c;
        if (bool == null || !bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f38888a == null) {
                try {
                    f38888a = Boolean.valueOf(a(context));
                } catch (Exception unused2) {
                    f38888a = Boolean.FALSE;
                }
            }
            if (f38888a == null) {
                f38888a = new Boolean(false);
            }
            return f38888a.booleanValue();
        }
        if (f38888a == null && f38889b == null) {
            f38889b = new Handler(Looper.getMainLooper());
            f38889b.post(new RunnableC0473a(context));
        }
        if (f38888a == null) {
            return true;
        }
        return f38888a.booleanValue();
    }
}
