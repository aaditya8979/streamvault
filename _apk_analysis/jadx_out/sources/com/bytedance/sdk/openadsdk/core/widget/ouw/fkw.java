package com.bytedance.sdk.openadsdk.core.widget.ouw;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.component.utils.jg;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.cf;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.rn.ouw.ouw;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.bly;
import com.bytedance.sdk.openadsdk.yu.mwh;
import com.bytedance.sdk.openadsdk.yu.ryl;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class fkw extends le.ouw {
    private static final HashSet<String> zin;
    public boolean bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public cf f14034cf;
    public final String fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public JSONObject f14035jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public vpp f14036ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public mwh f14037le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final bs f14038lh;
    public com.bytedance.sdk.openadsdk.core.mwh.yu.vt mwh;
    private final boolean ouw;
    public boolean pno;
    private TTCeilingLandingPageActivity.ouw qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public boolean f14039ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.common.fkw f14040rn;
    public Map<String, Object> ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private boolean f14041th;
    public String tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private final Stack<String> f14042vm;
    private boolean vt;
    public final Context yu;
    private String zih;

    static {
        HashSet<String> hashSet = new HashSet<>();
        zin = hashSet;
        hashSet.add("png");
        hashSet.add("ico");
        hashSet.add("jpg");
        hashSet.add("gif");
        hashSet.add("svg");
        hashSet.add("jpeg");
    }

    public fkw(Context context, bs bsVar, String str, com.bytedance.sdk.openadsdk.common.fkw fkwVar, mwh mwhVar, TTCeilingLandingPageActivity.ouw ouwVar) {
        this(context, bsVar, str, fkwVar, mwhVar, true);
        this.f14041th = true;
        this.qbp = ouwVar;
    }

    public fkw(Context context, bs bsVar, String str, com.bytedance.sdk.openadsdk.common.fkw fkwVar, mwh mwhVar, boolean z10) {
        this(context, bsVar, str, mwhVar, z10);
        this.f14040rn = fkwVar;
    }

    public fkw(Context context, bs bsVar, String str, mwh mwhVar, boolean z10) {
        this.f14039ra = true;
        this.pno = true;
        this.bly = false;
        this.yu = context;
        this.f14038lh = bsVar;
        this.fkw = str;
        this.f14037le = mwhVar;
        this.ouw = z10;
        this.f14042vm = new Stack<>();
    }

    public static String ouw(String str) {
        int iLastIndexOf;
        String strSubstring;
        if (str == null || (iLastIndexOf = str.lastIndexOf(46)) < 0 || iLastIndexOf == str.length() - 1 || (strSubstring = str.substring(iLastIndexOf)) == null || !zin.contains(strSubstring.toLowerCase(Locale.getDefault()))) {
            return null;
        }
        return "image/".concat(strSubstring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(final String str, final boolean z10, final int i10, final String str2, final String str3) {
        com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), this.f14036ko, this.tlj, "lp_not_http_open", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.core.widget.ouw.fkw.2
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("schema", str);
                    jSONObject.put("jump_url", str3);
                    jSONObject.put("success", z10);
                    jSONObject.put("error_type", i10);
                    jSONObject.put("error_reason", str2);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, g.f53147u);
        context.startActivity(intent);
    }

    private boolean vt(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if ("play.google.com".equals(uri.getHost())) {
                if (th.tlj(this.f14036ko) && this.f14035jg == null && this.f14034cf == null) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (!(this.yu instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.setData(uri);
                intent.setPackage("com.android.vending");
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.yu, intent);
                lh();
                this.f14035jg = null;
                this.f14034cf = null;
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final void lh() {
        if (TextUtils.isEmpty(this.tlj) || !th.bly(this.f14036ko) || this.vt) {
            return;
        }
        cf cfVar = this.f14034cf;
        if (cfVar != null) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw("click", this.f14036ko, cfVar, this.tlj, true, this.ryl, 1);
            this.vt = true;
            return;
        }
        JSONObject jSONObject = this.f14035jg;
        if (jSONObject != null) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(this.f14036ko, this.tlj, "click", jSONObject);
            this.vt = true;
        }
    }

    @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/ouw/fkw;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(g.f53147u, webView, str);
        safedk_fkw_onLoadResource_26feb395e244b5b8074d3068270bd5b1(webView, str);
    }

    @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/ouw/fkw;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(g.f53147u, webView, str);
        safedk_fkw_onPageFinished_20b45c83738685c8d4eb19fef28f2559(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        vpp vppVar;
        super.onPageStarted(webView, str, bitmap);
        vpp vppVar2 = this.f14036ko;
        int iOuw = (vppVar2 != null && vppVar2.zin() && com.bytedance.sdk.openadsdk.vpp.ouw.ouw("opt_web_index", false)) ? uoy.ouw(webView) : -1;
        ko.ouw("TTWebViewClient", "currentUrlIndex is:", Integer.valueOf(iOuw));
        mwh mwhVar = this.f14037le;
        if (mwhVar != null) {
            boolean z10 = this.ouw;
            mwhVar.mwh = z10;
            mwhVar.f14484vm++;
            le leVar = mwhVar.f14468cf;
            if (leVar != null && z10) {
                leVar.bly = str;
                leVar.yu();
                leVar.qbp.put(Integer.valueOf(leVar.tlj), Long.valueOf(SystemClock.elapsedRealtime()));
                leVar.vpp.put(Integer.valueOf(leVar.tlj), Long.valueOf(SystemClock.elapsedRealtime()));
                leVar.jae = leVar.ouw();
                final le leVar2 = mwhVar.f14468cf;
                leVar2.yu.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.ouw.le.3
                    public AnonymousClass3() {
                    }

                    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                    public final void onWindowFocusChanged(boolean z11) {
                        ko.ouw("_arbitrage_", "trigger onWindowFocusChanged: ", Boolean.valueOf(z11));
                        if (!z11) {
                            le leVar3 = le.this;
                            if (!leVar3.pno) {
                                leVar3.vt();
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                le leVar4 = le.this;
                                if (jElapsedRealtime - leVar4.ksc >= 50) {
                                    leVar4.ouw(3, leVar4.bly, leVar4.tlj);
                                    le.this.ksc = jElapsedRealtime;
                                    return;
                                }
                                return;
                            }
                            leVar3.pno = false;
                        }
                        if (z11) {
                            le.this.yu();
                            le leVar5 = le.this;
                            leVar5.qbp.put(Integer.valueOf(leVar5.tlj), Long.valueOf(SystemClock.elapsedRealtime()));
                        }
                    }
                });
            }
            bly blyVar = mwhVar.f14472ko;
            if (blyVar != null && z10) {
                if (blyVar.f14406lh) {
                    iOuw++;
                }
                if (blyVar.ouw(true)) {
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(blyVar.ouw, blyVar.fkw, blyVar.yu, str, iOuw);
                    blyVar.vt.put(Integer.valueOf(blyVar.yu), str);
                    blyVar.f14405le = SystemClock.elapsedRealtime();
                }
            }
            WeakReference<WebView> weakReference = mwhVar.ksc;
            WebView webView2 = weakReference != null ? weakReference.get() : null;
            if (webView2 != null) {
                try {
                    WebBackForwardList webBackForwardListCopyBackForwardList = webView2.copyBackForwardList();
                    if (webBackForwardListCopyBackForwardList != null && webBackForwardListCopyBackForwardList.getCurrentIndex() > mwhVar.f14466bs) {
                        mwhVar.fvf.incrementAndGet();
                    }
                    mwhVar.f14466bs = webBackForwardListCopyBackForwardList.getCurrentIndex();
                } catch (Exception e10) {
                    qbp.ouw("LandingPageLog", "copyBackForwardList exception", e10);
                }
            }
            if (mwhVar.f14476pd == 0) {
                mwhVar.f14476pd = SystemClock.elapsedRealtime();
            }
            com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = mwhVar.f14475od;
            if (fkwVar != null) {
                fkwVar.fkw();
            }
            if (mwhVar.fkw.compareAndSet(false, true)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    int i10 = mwhVar.fak;
                    if (i10 >= 0) {
                        jSONObject.putOpt("preload_status", Integer.valueOf(i10));
                    }
                } catch (Exception unused) {
                }
                mwhVar.ouw("load_start", jSONObject);
            }
        }
        com.bytedance.sdk.openadsdk.common.fkw fkwVar2 = this.f14040rn;
        if (fkwVar2 != null) {
            boolean z11 = this.ouw;
            fkwVar2.tlj.clear();
            fkwVar2.bly = z11;
            if (z11) {
                fkwVar2.f13087ra = true;
            }
            fkwVar2.f13082cf = fkwVar2.yu();
        }
        if (this.ouw && (vppVar = this.f14036ko) != null && vppVar.zin() && this.f14036ko.our.ouw() >= 2) {
            if (!TextUtils.isEmpty(str) && !str.equals(this.zih)) {
                if (this.f14042vm.contains(str)) {
                    while (!str.equals(this.f14042vm.peek())) {
                        this.f14042vm.pop();
                    }
                } else {
                    this.f14042vm.push(str);
                }
            }
            this.zih = str;
        }
        ko.ouw("TTWebViewClient-onPageStarted", "mNeedHardwareAcceleration:", Boolean.valueOf(this.pno), "hasSetHardwareAccelerate", Boolean.valueOf(this.bly));
        if (!this.pno || this.bly) {
            return;
        }
        ko.vt("TTWebViewClient-onPageStarted", "use hardware acceleration");
        this.bly = true;
        lh lhVarOuw = lh.ouw(this.yu);
        lhVarOuw.vt = true;
        lhVarOuw.ouw = webView.getSettings().getBuiltInZoomControls();
        lhVarOuw.ouw(webView);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.f14037le == null || webResourceError == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        this.f14037le.ouw(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), string, requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "", webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.f14037le == null || webResourceResponse == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        this.f14037le.ouw(webResourceResponse.getStatusCode(), String.valueOf(webResourceResponse.getReasonPhrase()), string, requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "", webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            try {
                sslErrorHandler.cancel();
            } catch (Throwable unused) {
            }
        }
        if (this.f14037le != null) {
            int primaryError = 0;
            String strConcat = "SslError: unknown";
            String url = null;
            if (sslError != null) {
                try {
                    primaryError = sslError.getPrimaryError();
                    strConcat = "SslError: ".concat(String.valueOf(sslError));
                    url = sslError.getUrl();
                } catch (Throwable unused2) {
                }
            }
            String str = url;
            this.f14037le.ouw(primaryError, strConcat, str, ouw(str), true);
        }
    }

    @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().vt();
        } catch (Exception unused) {
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public void safedk_fkw_onLoadResource_26feb395e244b5b8074d3068270bd5b1(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    public void safedk_fkw_onPageFinished_20b45c83738685c8d4eb19fef28f2559(WebView webView, String str) {
        if (ko.ouw()) {
            ko.ouw("WebChromeClient", "onPageFinished ".concat(String.valueOf(str)));
        }
        mwh mwhVar = this.f14037le;
        if (mwhVar != null) {
            boolean z10 = this.ouw;
            mwhVar.ouw(false, SystemClock.elapsedRealtime());
            le leVar = mwhVar.f14468cf;
            if (leVar != null && z10) {
                int i10 = leVar.tlj;
                if (!leVar.lh() && !leVar.jqy.contains(Integer.valueOf(i10))) {
                    leVar.jqy.add(Integer.valueOf(i10));
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Long l10 = leVar.vpp.get(Integer.valueOf(i10));
                    long jLongValue = l10 != null ? l10.longValue() : jElapsedRealtime;
                    com.bytedance.sdk.openadsdk.rn.ouw.ouw ouwVar = new ouw.C0257ouw().ouw(leVar.bly).ouw(leVar.tlj).ouw;
                    ouwVar.f14244rn = jElapsedRealtime - jLongValue;
                    com.bytedance.sdk.openadsdk.yu.lh.vt(leVar.vt, ouwVar, leVar.f14051lh);
                }
            }
            com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = mwhVar.f14475od;
            if (fkwVar != null) {
                fkwVar.le();
            }
            bly blyVar = mwhVar.f14472ko;
            if (blyVar != null && z10 && blyVar.ouw(false)) {
                com.bytedance.sdk.openadsdk.yu.lh.ouw(blyVar.ouw, blyVar.fkw, blyVar.yu, str, SystemClock.elapsedRealtime() - blyVar.f14405le);
            }
            if (webView != null && !mwhVar.f14479tc && mwhVar.jae) {
                mwhVar.f14479tc = true;
                jg.ouw(webView, "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});");
            }
            if (mwhVar.f14473le.compareAndSet(false, true)) {
                if (mwhVar.yu != 3) {
                    mwhVar.yu = 2;
                }
                mwhVar.zin = System.currentTimeMillis();
                boolean z11 = mwhVar.yu == 2;
                int iRa = mwhVar.ra();
                if (z11) {
                    long j10 = mwhVar.ex - mwhVar.jqy;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error_code", mwhVar.f14477ra);
                        jSONObject.put("error_msg", mwhVar.bly);
                        jSONObject.put("error_url", mwhVar.tlj);
                        int i11 = mwhVar.fak;
                        if (i11 >= 0) {
                            jSONObject.put("preload_status", i11);
                        }
                        jSONObject.put("first_page", iRa);
                        jSONObject.putOpt("render_type", "h5");
                        jSONObject.putOpt("render_type_2", 0);
                        jSONObject.put("url", mwhVar.f14480th.osn);
                        jSONObject.put("preload_h5_type", mwhVar.f14480th.gls);
                    } catch (Exception unused) {
                    }
                    mwhVar.ouw(z10, "0");
                    long jMin = Math.min(j10, 600000L);
                    mwhVar.ouw("load_finish", jSONObject, jMin);
                    if (mwhVar.yu()) {
                        mwhVar.osn = SystemClock.elapsedRealtime();
                        mwhVar.lh();
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(mwhVar.f14480th, mwhVar.ey, mwhVar.osn - mwhVar.uoy);
                    }
                    mwhVar.ouw(str, "load_finish", jMin);
                    ryl rylVar = mwhVar.f14482uq;
                    if (rylVar != null) {
                        rylVar.ouw(iRa);
                    }
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("error_code", mwhVar.f14477ra);
                        jSONObject2.put("error_msg", mwhVar.bly);
                        jSONObject2.put("error_url", mwhVar.tlj);
                        jSONObject2.put("first_page", iRa);
                        int i12 = mwhVar.fak;
                        if (i12 >= 0) {
                            jSONObject2.put("preload_status", i12);
                        }
                        jSONObject2.putOpt("render_type", "h5");
                        jSONObject2.putOpt("render_type_2", 0);
                        jSONObject2.put("url", mwhVar.f14480th.osn);
                        jSONObject2.put("preload_h5_type", mwhVar.f14480th.gls);
                    } catch (Exception unused2) {
                    }
                    mwhVar.ouw(z10, "2");
                    mwhVar.ouw("load_fail", jSONObject2);
                    if (mwhVar.yu()) {
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(mwhVar.f14480th, mwhVar.ey, SystemClock.elapsedRealtime() - mwhVar.uoy, mwhVar.f14477ra, mwhVar.bly, mwhVar.tlj);
                    }
                    if (mwhVar.pno) {
                        jSONObject2.remove("render_type");
                        jSONObject2.remove("render_type_2");
                        mwhVar.ouw("load_fail_main", jSONObject2);
                    }
                }
            }
        }
        com.bytedance.sdk.openadsdk.common.fkw fkwVar2 = this.f14040rn;
        if (fkwVar2 != null && this.ouw && fkwVar2.vt != null) {
            ko.vt("arbitrage_style", "trigger onPageFinished");
            fkwVar2.ouw(1);
        }
        super.onPageFinished(webView, str);
    }

    @RequiresApi(api = 21)
    public WebResourceResponse safedk_fkw_shouldInterceptRequest_b5d95277377121da55de290eb050f486(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public WebResourceResponse safedk_fkw_shouldInterceptRequest_ec30d0504d4705e0366df115b99edc2f(WebView webView, String str) {
        vpp vppVar;
        vpp vppVar2;
        mwh mwhVar = this.f14037le;
        if (mwhVar != null) {
            boolean z10 = this.ouw;
            bly blyVar = mwhVar.f14472ko;
            if (blyVar != null && z10 && (vppVar2 = blyVar.ouw) != null && com.bytedance.sdk.component.bly.vt.ouw(vppVar2.our.fkw, str)) {
                String str2 = blyVar.vt.get(Integer.valueOf(blyVar.yu));
                if (TextUtils.isEmpty(str2)) {
                    str2 = "";
                }
                com.bytedance.sdk.openadsdk.yu.lh.ouw(blyVar.ouw, blyVar.fkw, blyVar.yu, str2, str, 2);
            }
        }
        final com.bytedance.sdk.openadsdk.common.fkw fkwVar = this.f14040rn;
        if (fkwVar != null && (vppVar = fkwVar.ouw) != null && com.bytedance.sdk.component.bly.vt.ouw(vppVar.our.fkw, str)) {
            fkwVar.f13085le++;
            ko.lh("arbitrage_style", "trigger shouldInterceptRequest->1");
            com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.fkw.1
                public AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (fkw.this.lh()) {
                        com.bytedance.sdk.component.utils.ko.lh("arbitrage_style", "trigger shouldInterceptRequest->2");
                        fkw.this.ouw();
                    }
                }
            });
        }
        return super.shouldInterceptRequest(webView, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d8 A[Catch: all -> 0x022e, TryCatch #1 {all -> 0x022e, blocks: (B:77:0x014c, B:79:0x0160, B:81:0x0166, B:84:0x016d, B:86:0x0173, B:88:0x017b, B:94:0x0190, B:118:0x01db, B:96:0x0198, B:98:0x019c, B:100:0x01a0, B:102:0x01a4, B:104:0x01a8, B:106:0x01ac, B:108:0x01b2, B:110:0x01bb, B:112:0x01c7, B:117:0x01d8, B:91:0x0185, B:131:0x0226, B:133:0x022a, B:130:0x0216, B:120:0x01e0, B:122:0x01e8, B:127:0x0205, B:123:0x01ed, B:125:0x01f5, B:126:0x01fa), top: B:152:0x014c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean safedk_fkw_shouldOverrideUrlLoading_024929c98d88050b2317ea79b6460a0a(android.webkit.WebView r14, final java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.widget.ouw.fkw.safedk_fkw_shouldOverrideUrlLoading_024929c98d88050b2317ea79b6460a0a(android.webkit.WebView, java.lang.String):boolean");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/ouw/fkw;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f53147u, webView, webResourceRequest, safedk_fkw_shouldInterceptRequest_b5d95277377121da55de290eb050f486(webView, webResourceRequest));
    }

    @Override // com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/ouw/fkw;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(g.f53147u, webView, str, safedk_fkw_shouldInterceptRequest_ec30d0504d4705e0366df115b99edc2f(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/ouw/fkw;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_fkw_shouldOverrideUrlLoading_024929c98d88050b2317ea79b6460a0a = safedk_fkw_shouldOverrideUrlLoading_024929c98d88050b2317ea79b6460a0a(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(g.f53147u, webView, str, zSafedk_fkw_shouldOverrideUrlLoading_024929c98d88050b2317ea79b6460a0a);
        return zSafedk_fkw_shouldOverrideUrlLoading_024929c98d88050b2317ea79b6460a0a;
    }

    public final mwh vt() {
        return this.f14037le;
    }
}
