package com.safedk.android.internal.partials;

import android.webkit.WebView;
import com.ironsource.Z7;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.f;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class NetworkBridge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ConcurrentHashMap<HttpURLConnection, f> f53038a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ConcurrentHashMap<Integer, RequestInfo> f53039b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f53040c = "SafeDKNetwork";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f53041d = "";

    public static class RequestInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f53045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f53046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f53047c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ByteArrayOutputStream f53048d = new ByteArrayOutputStream();

        public RequestInfo(String str, String str2) {
            this.f53045a = null;
            this.f53046b = null;
            this.f53045a = str;
            this.f53046b = str2;
        }

        public String a() {
            return this.f53045a;
        }

        public void a(String str) {
            this.f53046b = str;
        }

        public void a(byte[] bArr, long j10) {
            this.f53048d.write(bArr, 0, (int) j10);
        }

        public String b() {
            return this.f53046b;
        }

        public String c() {
            if (this.f53047c == null) {
                this.f53047c = this.f53048d.toString();
            }
            return this.f53047c;
        }

        public String toString() {
            return "Info{" + this.f53045a + Z7.f30794r + this.f53046b + h.f52302e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, WebView webView, String str2) {
        try {
            Logger.d("logWebviewLoadURLRequestImpl webview", "loadUrl " + webView.getId() + ", webview class name=" + webView.getClass().getCanonicalName() + ", WebView address : " + webView.toString() + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = ");
            Logger.d(f53040c, "logWebviewLoadURLRequest: " + str2);
            if (str2 != null) {
                BrandSafetyUtils.a(str, str2, webView);
            }
        } catch (Throwable th2) {
            Logger.e(f53040c, "caught exception", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    public static void disposeOfConnectionToStreamMapping(HttpURLConnection httpURLConnection) {
        try {
            f53038a.remove(httpURLConnection);
        } catch (Throwable th2) {
            Logger.e(f53040c, "Caught exception", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    public static Object invokeMethod(String str, String str2, Object obj, Class[] clsArr, Object[] objArr) throws IOException {
        try {
            Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(obj, objArr);
        } catch (ClassNotFoundException e10) {
            throw new IOException("Network access denied", e10.getCause());
        } catch (IllegalAccessException e11) {
            throw new IOException("Network access denied", e11.getCause());
        } catch (NoSuchMethodException e12) {
            throw new IOException("Network access denied", e12.getCause());
        } catch (InvocationTargetException e13) {
            throw new IOException("Network access denied", e13.getCause());
        } catch (Throwable th2) {
            new CrashReporter().caughtException(th2);
            throw new IOException("error occurred while trying to access network");
        }
    }

    public static void logWebviewLoadURLRequest(final String str, final WebView webView, final String str2) {
        Logger.d("logWebviewLoadURLRequest webview", "loadUrl " + webView.getId() + ", webview class name=" + webView.getClass().getCanonicalName() + ", WebView address : " + webView.toString() + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = ");
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().o()) {
            return;
        }
        if (k.c()) {
            Executors.newScheduledThreadPool(1).execute(new Runnable() { // from class: com.safedk.android.internal.partials.NetworkBridge.1
                @Override // java.lang.Runnable
                public void run() {
                    NetworkBridge.b(str, webView, str2);
                }
            });
        } else {
            b(str, webView, str2);
        }
    }
}
