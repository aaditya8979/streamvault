package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.adqualitysdk.sdk.i.bb;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public final class jt {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2912 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2913 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2914 = -8951586584454626386L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f2915;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private WeakReference<WebView> f2916;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private WeakReference<bb.e> f2917;

    public jt(WebView webView) {
        this.f2916 = new WeakReference<>(webView);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m6804(bb.e eVar) {
        this.f2917 = new WeakReference<>(eVar);
        int i10 = f2913 + 123;
        f2912 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m6805(bb.e eVar) {
        new WeakReference(eVar);
        int i10 = f2913 + 79;
        f2912 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6806(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2041) {
            f.f2039 = i10;
            char[] cArr2 = new char[cArr.length];
            f.f2040 = 0;
            while (true) {
                int i11 = f.f2040;
                if (i11 < cArr.length) {
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2039 * i11))) ^ f2914);
                    f.f2040++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final bb.e m6807() {
        int i10 = f2912 + 123;
        int i11 = i10 % 128;
        f2913 = i11;
        int i12 = i10 % 2;
        WeakReference<bb.e> weakReference = this.f2917;
        if ((weakReference != null ? 'D' : 'Q') != 'Q') {
            return weakReference.get();
        }
        int i13 = i11 + 9;
        f2912 = i13 % 128;
        int i14 = i13 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final WebView m6808() {
        int i10 = f2913 + 123;
        f2912 = i10 % 128;
        int i11 = i10 % 2;
        WebView webView = this.f2916.get();
        int i12 = f2913 + 29;
        f2912 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 3 : 'F') != 3) {
            return webView;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m6809(WebChromeClient webChromeClient) {
        WebView webViewM6808;
        int i10 = f2912 + 83;
        f2913 = i10 % 128;
        if (i10 % 2 != 0) {
            webViewM6808 = m6808();
            int i11 = 38 / 0;
            if (webViewM6808 == null) {
                return;
            }
        } else {
            webViewM6808 = m6808();
            if (webViewM6808 == null) {
                return;
            }
        }
        int i12 = f2912 + 71;
        f2913 = i12 % 128;
        int i13 = i12 % 2;
        try {
            WebChromeClient webChromeClientM6974 = ki.m6974(webViewM6808);
            if (!(webChromeClientM6974 != null)) {
                return;
            }
            int i14 = f2913 + 109;
            f2912 = i14 % 128;
            int i15 = i14 % 2;
            if (webChromeClientM6974 instanceof WebChromeClient) {
                return;
            }
            hi hiVar = new hi(webChromeClientM6974, webChromeClient);
            m6805((bb.e) hiVar);
            webViewM6808.setWebChromeClient(hiVar);
        } catch (Exception e10) {
            kd.m6948(m6806("Ϲ﹢\uf89eﬃ\uf563\uf786\uf22f\uec74\uee9e\ue92b\ueb51\ue583\ue031\ue252\udcff\udf27", 64937 - Color.blue(0)).intern(), m6806("ϫ頙㑖킎泈ॗꕗ䆨\uddf2稷ᙵ늷仵\uea8f蜿⍀뾜寸\uf01c豃⢥쓪愥ﵞ馺㗺퇉渇\u0a56", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 39877).intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m6810() {
        int i10 = f2913 + 71;
        int i11 = i10 % 128;
        f2912 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        boolean z10 = this.f2915;
        int i12 = i11 + 45;
        f2913 = i12 % 128;
        if (i12 % 2 == 0) {
            return z10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m6811(WebViewClient webViewClient) {
        int i10 = f2913 + 3;
        f2912 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            m6808();
            throw null;
        }
        WebView webViewM6808 = m6808();
        if (webViewM6808 != null) {
            try {
                hk hkVar = new hk(ki.m6983(webViewM6808), webViewClient);
                m6804(hkVar);
                webViewM6808.setWebViewClient(hkVar);
                this.f2915 = true;
                int i11 = f2912 + 51;
                f2913 = i11 % 128;
                if ((i11 % 2 != 0 ? '\\' : (char) 19) != '\\') {
                    return;
                } else {
                    throw null;
                }
            } catch (Exception e10) {
                kd.m6948(m6806("Ϲ﹢\uf89eﬃ\uf563\uf786\uf22f\uec74\uee9e\ue92b\ueb51\ue583\ue031\ue252\udcff\udf27", 64937 - View.MeasureSpec.getSize(0)).intern(), m6806("ϫ쇟蟚䗈ௐ즁进䷞Ꮒ퇁韙嗡ᯭ\ud9a9鿓左⏼\ue1cb\ua7f1旲⯥\ue9d2꾀涂㎃\uf18b랔", 49666 - TextUtils.lastIndexOf("", '0', 0)).intern(), e10, false);
            }
        }
        this.f2915 = false;
    }
}
