package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import androidx.annotation.RequiresApi;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ki {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f2994 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char f2995 = 0;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f2996 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static e f2997;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f2998;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static e f2999;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f3000;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char f3001;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f3002;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f3003;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f3004;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f3005;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f3006;

    public static class e {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f3008;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private boolean f3009;

        private e() {
            this.f3008 = false;
            this.f3009 = false;
        }

        public /* synthetic */ e(byte b10) {
            this();
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private boolean m6993() {
            return this.f3008;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final boolean m6994() {
            return this.f3009;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final void m6995() {
            this.f3009 = true;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final boolean m6996() {
            return m6993() || m6994();
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final void m6997() {
            this.f3008 = true;
        }
    }

    static {
        m6986();
        f3003 = true;
        f3005 = true;
        f3002 = true;
        byte b10 = 0;
        f3006 = false;
        f3004 = false;
        f2997 = new e(b10);
        f2999 = new e(b10);
        int i10 = f2996 + 29;
        f2994 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 22 : 'T') == 'T') {
        } else {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.webkit.WebChromeClient m6974(android.webkit.WebView r4) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.ki.f2996
            int r0 = r0 + 3
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ki.f2994 = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lf
            goto L15
        Lf:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r0 < r3) goto L3e
        L15:
            com.ironsource.adqualitysdk.sdk.i.au r0 = m6979()
            boolean r0 = r0.m4722()
            if (r0 == 0) goto L21
            r0 = r1
            goto L22
        L21:
            r0 = r2
        L22:
            if (r0 == r1) goto L25
            goto L3e
        L25:
            android.content.Context r0 = r4.getContext()
            boolean r0 = m6992(r0)
            if (r0 == 0) goto L3e
            int r0 = com.ironsource.adqualitysdk.sdk.i.ki.f2996
            int r0 = r0 + 9
            int r3 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ki.f2994 = r3
            int r0 = r0 % 2
            android.webkit.WebChromeClient r4 = androidx.webkit.internal.c.a(r4)
            goto L4a
        L3e:
            com.ironsource.adqualitysdk.sdk.i.hv r4 = m6990(r4)
            if (r4 == 0) goto L5f
            java.lang.Object r4 = r4.mo6430()
            android.webkit.WebChromeClient r4 = (android.webkit.WebChromeClient) r4
        L4a:
            int r0 = com.ironsource.adqualitysdk.sdk.i.ki.f2994
            int r0 = r0 + 11
            int r3 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ki.f2996 = r3
            int r0 = r0 % 2
            if (r0 != 0) goto L57
            goto L58
        L57:
            r1 = r2
        L58:
            if (r1 != 0) goto L5b
            return r4
        L5b:
            r4 = 0
            throw r4     // Catch: java.lang.Throwable -> L5d
        L5d:
            r4 = move-exception
            throw r4
        L5f:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            int r0 = android.view.KeyEvent.normalizeMetaState(r2)
            int r0 = 35 - r0
            java.lang.String r1 = "官\ue84d\ue2f9⪾퇲⋕\ude11㌜鷿貘\ue4b4赸李퍲娓̕⇣\uda8c缌䯄陒蛐\uece0㮫ł蠣藸顓Ꮾ贲\uee49鲺Կ阡ᐒ৭"
            java.lang.String r0 = m6991(r1, r0)
            java.lang.String r0 = r0.intern()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ki.m6974(android.webkit.WebView):android.webkit.WebChromeClient");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static <T> hv<T> m6975(WebView webView, ia iaVar, List<String> list, int i10) {
        int i11 = f2996 + 31;
        f2994 = i11 % 128;
        int i12 = i11 % 2;
        hv<T> hvVarM6987 = m6987(webView, iaVar, list, i10);
        int i13 = f2994 + 89;
        f2996 = i13 % 128;
        if ((i13 % 2 == 0 ? (char) 19 : 'Z') == 'Z') {
            return hvVarM6987;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static ia m6976() {
        ia iaVar = new ia() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.10
            @Override // com.ironsource.adqualitysdk.sdk.i.ia
            /* JADX INFO: renamed from: ﻛ */
            public final boolean mo5942(hv hvVar) {
                return WebChromeClient.class.equals(hvVar.mo6429().getType());
            }
        };
        int i10 = f2994 + 71;
        f2996 = i10 % 128;
        if (i10 % 2 != 0) {
            return iaVar;
        }
        int i11 = 49 / 0;
        return iaVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m6977(Context context) {
        int i10 = f2994 + 31;
        f2996 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            int i11 = 39 / 0;
            if (!f3003) {
                return;
            }
        } else if (!f3003) {
            return;
        }
        f3003 = false;
        try {
            WebView webView = new WebView(context);
            hk hkVar = new hk(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.3
                @Override // android.webkit.WebViewClient
                public void onLoadResource(WebView webView2, String str) {
                    super.onLoadResource(webView2, str);
                    CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53132f, webView2, str);
                }

                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView2, String str) {
                    super.onPageFinished(webView2, str);
                    CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53132f, webView2, str);
                }

                @Override // android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView2, WebResourceRequest webResourceRequest) {
                    return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f53132f, webView2, webResourceRequest, super.shouldInterceptRequest(webView2, webResourceRequest));
                }

                @Override // android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView2, String str) {
                    return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f53132f, webView2, str, super.shouldInterceptRequest(webView2, str));
                }
            });
            webView.setWebViewClient(hkVar);
            hi hiVar = new hi(null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.5
            });
            webView.setWebChromeClient(hiVar);
            f2997 = m6985(webView, hkVar, m6988());
            f2999 = m6985(webView, hiVar, m6976());
            int i12 = f2996 + 101;
            f2994 = i12 % 128;
            if (i12 % 2 == 0) {
            } else {
                throw null;
            }
        } catch (Throwable th2) {
            kd.m6948(m6991("娓̕键錭멥뤛ꋇঁɀ諻\udc3a\udeed", TextUtils.indexOf("", "") + 12).intern(), m6991("ᢧន횻\ud90e籄ⴂ閮\ue706丌獹띣鵢\ueea8\ue39a鷿貘愎骹\uf535\u1cceত◹蓍鎿\ue318橔ł蠣藸顓䲐뿋", 32 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), th2, false);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m6978(WebView webView, String str) {
        int i10 = f2994;
        int i11 = i10 + 121;
        f2996 = i11 % 128;
        int i12 = i11 % 2;
        if (!(webView != null)) {
            return;
        }
        int i13 = i10 + 43;
        f2996 = i13 % 128;
        if (i13 % 2 == 0) {
            webView.getHandler();
            throw null;
        }
        if (!(webView.getHandler() != null) && webView.getRootView() == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6991("⋳雀浄낺뤉ﬠ⠉襘舫愍嶩딹浄낺ጤ\u0018㪒组\udcc6㡨矗뫀", ExpandableListView.getPackedPositionGroup(0L) + 22).intern());
        sb2.append(str);
        sb2.append(m6991("鿉㽞蠠韒", (ViewConfiguration.getEdgeSlop() >> 16) + 4).intern());
        IronSourceNetworkBridge.webviewLoadUrl(webView, sb2.toString());
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static synchronized au m6979() {
        int i10 = f2996 + 111;
        f2994 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            ar.m4559().mo4570();
            throw null;
        }
        au auVarMo4570 = ar.m4559().mo4570();
        int i11 = f2996 + 73;
        f2994 = i11 % 128;
        if ((i11 % 2 != 0 ? (char) 6 : (char) 24) != 6) {
            return auVarMo4570;
        }
        int i12 = 76 / 0;
        return auVarMo4570;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static hv<WebViewClient> m6980(WebView webView) {
        int i10 = f2996 + 123;
        f2994 = i10 % 128;
        if ((i10 % 2 != 0 ? '$' : '\b') != '$') {
            m6977(webView.getContext());
            return m6981(webView, m6988(), f2997);
        }
        m6977(webView.getContext());
        int i11 = 47 / 0;
        return m6981(webView, m6988(), f2997);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static <T> hv<T> m6981(WebView webView, ia iaVar, e eVar) {
        int i10 = f2994 + 107;
        f2996 = i10 % 128;
        try {
        } catch (Throwable th2) {
            kd.m6948(m6991("娓̕键錭멥뤛ꋇঁɀ諻\udc3a\udeed", 12 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), m6991("ᢧន횻\ud90e籄ⴂ禺恗鷖엤\ue4b4赸\ufafc뎸\uef66벫멥뤛䦦筚鷿貘멥뤛ɻ♡", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27).intern(), th2, false);
        }
        if (i10 % 2 == 0) {
            eVar.m6996();
            throw null;
        }
        if (eVar.m6996()) {
            hv<T> hvVarM6975 = m6975(webView, iaVar, m6979().m4723(), m6979().m4727());
            boolean z10 = true;
            if (!eVar.m6994()) {
                return hvVarM6975;
            }
            int i11 = f2994 + 83;
            f2996 = i11 % 128;
            if ((i11 % 2 == 0 ? (char) 24 : ' ') != ' ') {
                throw null;
            }
            if (hvVarM6975 == null) {
                return hvVarM6975;
            }
            T tMo6430 = hvVarM6975.mo6430();
            if (tMo6430 != null) {
                if (!tMo6430.getClass().equals(hvVarM6975.mo6429().getType())) {
                    z10 = false;
                }
                if (!z10) {
                    return m6984(tMo6430, iaVar, m6979().m4726(), m6979().m4725());
                }
            }
            int i12 = f2996 + 39;
            f2994 = i12 % 128;
            int i13 = i12 % 2;
            return hvVarM6975;
        }
        return null;
    }

    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m6982(Context context) {
        boolean z10;
        if (f3005) {
            try {
                f3005 = false;
                WebView webView = new WebView(context);
                hk hkVar = new hk(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.1
                    @Override // android.webkit.WebViewClient
                    public void onLoadResource(WebView webView2, String str) {
                        super.onLoadResource(webView2, str);
                        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f53132f, webView2, str);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onPageFinished(WebView webView2, String str) {
                        super.onPageFinished(webView2, str);
                        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f53132f, webView2, str);
                    }

                    @Override // android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView2, WebResourceRequest webResourceRequest) {
                        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f53132f, webView2, webResourceRequest, super.shouldInterceptRequest(webView2, webResourceRequest));
                    }

                    @Override // android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView2, String str) {
                        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f53132f, webView2, str, super.shouldInterceptRequest(webView2, str));
                    }
                });
                webView.setWebViewClient(hkVar);
                if ((hkVar == webView.getWebViewClient() ? '^' : '\t') != '^') {
                    z10 = false;
                } else {
                    int i10 = f2994 + 15;
                    f2996 = i10 % 128;
                    int i11 = i10 % 2;
                    z10 = true;
                }
                f3006 = z10;
                int i12 = f2996 + 87;
                f2994 = i12 % 128;
                int i13 = i12 % 2;
            } catch (Throwable th2) {
                kd.m6948(m6991("娓̕键錭멥뤛ꋇঁɀ諻\udc3a\udeed", 12 - Color.red(0)).intern(), m6991("ᢧន횻\ud90e籄ⴂ閮\ue706丌獹띣鵢\ueea8\ue39a\uf535\u1cce\uf217\ue3c5鴤锓⍡둧ᄚ㸤䯢◑ꙓ\udf00翱瓩\uf773\uf8f5멥뤛䦦筚", ImageFormat.getBitsPerPixel(0) + 37).intern(), th2, false);
            }
        }
        return f3006;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.webkit.WebViewClient m6983(android.webkit.WebView r5) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.ki.f2994
            int r0 = r0 + 113
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ki.f2996 = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 == 0) goto L22
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 32
            r4 = 45
            if (r0 < r3) goto L1d
            r0 = r4
            goto L1f
        L1d:
            r0 = 95
        L1f:
            if (r0 == r4) goto L31
            goto L64
        L22:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            r4 = 56
            if (r0 < r3) goto L2c
            r0 = r4
            goto L2e
        L2c:
            r0 = 91
        L2e:
            if (r0 == r4) goto L31
            goto L64
        L31:
            com.ironsource.adqualitysdk.sdk.i.au r0 = m6979()
            boolean r0 = r0.m4724()
            if (r0 == 0) goto L64
            int r0 = com.ironsource.adqualitysdk.sdk.i.ki.f2996
            int r0 = r0 + 3
            int r3 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ki.f2994 = r3
            int r0 = r0 % 2
            android.content.Context r0 = r5.getContext()
            boolean r0 = m6982(r0)
            if (r0 == 0) goto L51
            r0 = r1
            goto L52
        L51:
            r0 = r2
        L52:
            if (r0 == r1) goto L55
            goto L64
        L55:
            android.webkit.WebViewClient r5 = androidx.webkit.internal.d.a(r5)
            int r0 = com.ironsource.adqualitysdk.sdk.i.ki.f2996
            int r0 = r0 + 123
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ki.f2994 = r1
            int r0 = r0 % 2
            goto L70
        L64:
            com.ironsource.adqualitysdk.sdk.i.hv r5 = m6980(r5)
            if (r5 == 0) goto L71
            java.lang.Object r5 = r5.mo6430()
            android.webkit.WebViewClient r5 = (android.webkit.WebViewClient) r5
        L70:
            return r5
        L71:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            int r0 = android.graphics.Color.red(r2)
            int r0 = r0 + 33
            java.lang.String r1 = "官\ue84d\ue2f9⪾퇲⋕\ude11㌜鷿貘\ue4b4赸李퍲娓̕键錭멥뤛猣ꅌł蠣藸顓Ꮾ贲\uee49鲺Կ阡ᐒ৭"
            java.lang.String r0 = m6991(r1, r0)
            java.lang.String r0 = r0.intern()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ki.m6983(android.webkit.WebView):android.webkit.WebViewClient");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static <T> hv<T> m6984(T t10, ia iaVar, List<String> list, int i10) {
        int i11 = f2994 + 33;
        f2996 = i11 % 128;
        if ((i11 % 2 == 0 ? '-' : '&') == '-') {
            m6987(t10, iaVar, list, i10);
            throw null;
        }
        hv<T> hvVarM6987 = m6987(t10, iaVar, list, i10);
        int i12 = f2996 + 9;
        f2994 = i12 % 128;
        if ((i12 % 2 != 0 ? '/' : '!') == '!') {
            return hvVarM6987;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static <T> e m6985(WebView webView, T t10, ia iaVar) {
        e eVar = new e((byte) 0);
        hv hvVarM6975 = m6975(webView, iaVar, m6979().m4723(), m6979().m4727());
        if (hvVarM6975 != null) {
            Object objMo6430 = hvVarM6975.mo6430();
            if (objMo6430 == t10) {
                int i10 = f2996 + 79;
                f2994 = i10 % 128;
                byte b10 = i10 % 2 == 0 ? (byte) 1 : (byte) 0;
                eVar.m6997();
                if (b10 == 0) {
                    throw null;
                }
            } else {
                hv hvVarM6984 = m6984(objMo6430, iaVar, m6979().m4726(), m6979().m4725());
                if ((hvVarM6984 == null ? (byte) 1 : (byte) 0) == 0) {
                    int i11 = f2994 + 93;
                    f2996 = i11 % 128;
                    int i12 = i11 % 2;
                    if ((hvVarM6984.mo6430() == t10 ? '@' : 'U') == '@') {
                        eVar.m6995();
                        int i13 = f2996 + 47;
                        f2994 = i13 % 128;
                        int i14 = i13 % 2;
                    }
                }
            }
        }
        return eVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m6986() {
        f3001 = (char) 6083;
        f2998 = (char) 30494;
        f2995 = (char) 62869;
        f3000 = (char) 43732;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static <T> hv<T> m6987(Object obj, ia iaVar, final List<String> list, int i10) {
        hv<T> hvVarM6528 = hu.m6425().m6427().m6528(obj, iaVar, new hm() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.2
            @Override // com.ironsource.adqualitysdk.sdk.i.hm
            /* JADX INFO: renamed from: ﻐ */
            public final Field[] mo6340(Object obj2) {
                hu.m6425().m6428();
                return hq.m6371(obj2.getClass(), true, -1, list);
            }
        }, list, i10);
        int i11 = f2996 + 77;
        f2994 = i11 % 128;
        int i12 = i11 % 2;
        return hvVarM6528;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static ia m6988() {
        ia iaVar = new ia() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.8
            @Override // com.ironsource.adqualitysdk.sdk.i.ia
            /* JADX INFO: renamed from: ﻛ */
            public final boolean mo5942(hv hvVar) {
                return WebViewClient.class.equals(hvVar.mo6429().getType());
            }
        };
        int i10 = f2996 + 65;
        f2994 = i10 % 128;
        int i11 = i10 % 2;
        return iaVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m6989(WebView webView) {
        int i10 = f2996 + 117;
        f2994 = i10 % 128;
        int i11 = i10 % 2;
        boolean z10 = m6983(webView) instanceof hk;
        int i12 = f2994 + 37;
        f2996 = i12 % 128;
        int i13 = i12 % 2;
        return z10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static hv<WebChromeClient> m6990(WebView webView) {
        int i10 = f2994 + 63;
        f2996 = i10 % 128;
        int i11 = i10 % 2;
        m6977(webView.getContext());
        hv<WebChromeClient> hvVarM6981 = m6981(webView, m6976(), f2999);
        int i12 = f2994 + 21;
        f2996 = i12 % 128;
        int i13 = i12 % 2;
        return hvVarM6981;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6991(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f3014) {
            char[] cArr2 = new char[cArr.length];
            n.f3013 = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i11 = n.f3013;
                if (i11 < cArr.length) {
                    cArr3[0] = cArr[i11];
                    cArr3[1] = cArr[i11 + 1];
                    int i12 = 58224;
                    for (int i13 = 0; i13 < 16; i13++) {
                        char c10 = cArr3[1];
                        char c11 = cArr3[0];
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f3001)) ^ ((c11 >>> 5) + f2995)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2998) ^ ((c12 + i12) ^ ((c12 << 4) + f3000))));
                        i12 -= 40503;
                    }
                    int i14 = n.f3013;
                    cArr2[i14] = cArr3[0];
                    cArr2[i14 + 1] = cArr3[1];
                    n.f3013 = i14 + 2;
                } else {
                    str2 = new String(cArr2, 0, i10);
                }
            }
        }
        return str2;
    }

    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m6992(Context context) {
        int i10 = f2996 + 99;
        f2994 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (f3002) {
            boolean z10 = false;
            f3002 = false;
            WebView webView = new WebView(context);
            hi hiVar = new hi(null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.4
            });
            webView.setWebChromeClient(hiVar);
            if ((hiVar == webView.getWebChromeClient() ? 'G' : '?') != '?') {
                int i11 = f2996 + 51;
                f2994 = i11 % 128;
                if ((i11 % 2 != 0 ? '!' : (char) 1) != '!') {
                    z10 = true;
                }
            }
            f3004 = z10;
            int i12 = f2994 + 115;
            f2996 = i12 % 128;
            int i13 = i12 % 2;
        }
        return f3004;
    }
}
