package com.bytedance.sdk.openadsdk.zin.ouw;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl;
import com.bytedance.sdk.openadsdk.core.widget.bly;
import com.bytedance.sdk.openadsdk.core.widget.ouw.fkw;
import com.bytedance.sdk.openadsdk.core.widget.tlj;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.th;
import com.bytedance.sdk.openadsdk.zin.pno;
import com.bytedance.sdk.openadsdk.zin.ra;
import com.ironsource.C3978d4;
import com.ironsource.Z7;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class ouw {
    public boolean bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public AtomicBoolean f14551cf;
    private boolean ex;
    public String fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public long f14552jg;
    private com.bytedance.sdk.openadsdk.core.lh.ouw jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public StringBuilder f14553ko;
    private int ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final String f14554le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public le f14555lh;
    public vt mwh;
    public final vpp ouw;

    @Nullable
    public com.bytedance.sdk.openadsdk.mwh.le pno;
    private volatile boolean qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public pno f14556ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public InterfaceC0270ouw f14557rn;
    public bly ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private int f14558tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private final FrameLayout f14559th;
    public volatile boolean tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private final int f14560vm;
    private AtomicBoolean vpp;

    @Nullable
    public tlj vt;
    public bs yu;
    private final Context zih;
    private int zin;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.zin.ouw.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0270ouw {
        void ouw(int i10);
    }

    public interface vt {
        void ouw();
    }

    public ouw(Context context, vpp vppVar, int i10, boolean z10, FrameLayout frameLayout) {
        this(context, vppVar, i10, z10, frameLayout, false);
    }

    public ouw(Context context, vpp vppVar, int i10, boolean z10, FrameLayout frameLayout, boolean z11) {
        this(context, vppVar, i10, z10, frameLayout, z11, 0);
    }

    public ouw(Context context, vpp vppVar, int i10, boolean z10, FrameLayout frameLayout, boolean z11, int i11) {
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar;
        List<vpp> list;
        this.bly = true;
        this.f14551cf = new AtomicBoolean(false);
        this.vpp = new AtomicBoolean(false);
        this.ksc = 0;
        this.f14552jg = 0L;
        this.zih = context;
        this.ouw = vppVar;
        this.f14558tc = i11;
        if (vppVar != null && (ouwVar = vppVar.f13800vm) != null && (list = ouwVar.yu) != null) {
            this.ksc = list.size();
        }
        this.f14560vm = i10;
        String strLh = uoy.lh(vppVar.yiz.getDurationSlotType());
        this.fkw = strLh;
        int iOuw = uoy.ouw(strLh);
        this.ex = z11;
        if (z11) {
            this.fkw = uoy.vt(iOuw);
        }
        this.f14554le = od.cf(vppVar);
        this.f14559th = frameLayout;
        le leVar = new le(context, true, le.lh.PLAYABLE);
        this.f14555lh = leVar;
        leVar.o_();
        this.f14555lh.setLayerType(2, null);
        this.f14555lh.setVisibility(4);
        this.f14555lh.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f14555lh.setEnabled(true);
        this.f14555lh.setTag(this.fkw);
        this.f14555lh.setMaterialMeta(vppVar.bs());
        this.f14555lh.setLandingPage(true);
        frameLayout.addView(this.f14555lh, new FrameLayout.LayoutParams(-1, -1));
        bly blyVar = new bly(context);
        this.ryl = blyVar;
        String str = this.fkw;
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar2 = this.jqy;
        boolean z12 = this.ex;
        blyVar.ouw = vppVar;
        blyVar.vt = str;
        blyVar.f14028lh = z12;
        blyVar.yu = ouwVar2;
        frameLayout.addView(blyVar, new FrameLayout.LayoutParams(-1, -1));
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = vppVar.f13788sd;
        if (vtVar == null || vtVar.f11281jg != 1) {
            tlj tljVar = new tlj(context);
            this.vt = tljVar;
            tljVar.vt();
            frameLayout.addView(this.vt, new FrameLayout.LayoutParams(-1, -1));
        }
        HashMap map = new HashMap();
        map.put("click_scence", 3);
        this.yu = new bs(context);
        String strHun = vppVar.hun();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isMultiAd", vppVar.tpk);
            jSONObject.put("currentIndex", this.f14558tc);
            jSONObject.put("totalAdCount", this.ksc);
        } catch (JSONException e10) {
            ko.yu("PlayableManager", e10);
        }
        bs bsVarOuw = this.yu.vt(this.f14555lh).ouw(this.ouw);
        bsVarOuw.ryl = com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.ouw(this.ouw, true, jSONObject);
        vpp vppVar2 = this.ouw;
        bsVarOuw.f13482lh = vppVar2.pv;
        bsVarOuw.fkw = vppVar2.yhj;
        bsVarOuw.f13481le = iOuw;
        bsVarOuw.f13485ra = strHun;
        bs bsVarOuw2 = bsVarOuw.ouw(this.f14555lh);
        bsVarOuw2.ouw = this.fkw;
        bsVarOuw2.ouw(map).zin = new th(3, this.fkw, this.ouw);
        vt(z10);
        this.f14555lh.setWebViewClient(new fkw(zih.ouw(), this.yu, this.ouw.pv, null) { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
            public void onLoadResource(WebView webView, String str2) {
                super.onLoadResource(webView, str2);
                CreativeInfoManager.onResourceLoaded(g.f53147u, webView, str2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/zin/ouw/ouw$5;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
                CreativeInfoManager.onWebViewPageFinished(g.f53147u, webView, str2);
                safedk_ouw$5_onPageFinished_d64d363eede4ac1fff4bf3e0f2ed227f(webView, str2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i12, String str2, String str3) {
                super.onReceivedError(webView, i12, str2, str3);
                ouw ouwVar3 = ouw.this;
                ouwVar3.bly = false;
                pno pnoVar = ouwVar3.f14556ra;
                if (pnoVar != null) {
                    pnoVar.njr = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(ouw.this.ouw);
                    ouw.this.f14556ra.ouw(i12, str2, str3);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
            @RequiresApi(api = 23)
            public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest.isForMainFrame()) {
                    ouw ouwVar3 = ouw.this;
                    ouwVar3.bly = false;
                    pno pnoVar = ouwVar3.f14556ra;
                    if (pnoVar == null || webResourceError == null) {
                        return;
                    }
                    pnoVar.njr = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(ouw.this.ouw);
                    ouw.this.f14556ra.ouw(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
            public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    ouw ouwVar3 = ouw.this;
                    ouwVar3.bly = false;
                    pno pnoVar = ouwVar3.f14556ra;
                    if (pnoVar != null) {
                        pnoVar.njr = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(ouw.this.ouw);
                        ouw.this.f14556ra.ouw(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    }
                }
            }

            public void safedk_ouw$5_onPageFinished_d64d363eede4ac1fff4bf3e0f2ed227f(WebView webView, String str2) {
                WebView webView2;
                super.onPageFinished(webView, str2);
                pno pnoVar = ouw.this.f14556ra;
                if (pnoVar != null) {
                    boolean z13 = pnoVar.osn == -1;
                    pnoVar.osn = 2;
                    if (!z13) {
                        pnoVar.f14602vh = str2;
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            pnoVar.vpp = jCurrentTimeMillis;
                            long j10 = pnoVar.zin;
                            jSONObject2.put("playable_html_load_start_duration", j10 != -1 ? jCurrentTimeMillis - j10 : 0L);
                            jSONObject2.put("playable_has_show", pnoVar.ko());
                        } catch (Throwable th2) {
                            ra.ouw("PlayablePlugin", "reportUrlLoadFinish error", th2);
                        }
                        pnoVar.vt("PL_sdk_html_load_finish", jSONObject2);
                    }
                    pnoVar.lvd = false;
                    pnoVar.ouw.removeCallbacks(pnoVar.vt);
                    try {
                        if (pnoVar.uoy == 0) {
                            if (pnoVar.f14591ra && (webView2 = pnoVar.jvy) != null) {
                                pnoVar.f14591ra = false;
                                webView2.evaluateJavascript("function playable_callJS(){return \"Android call the JS method is callJS\";}", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.zin.pno.11
                                    public AnonymousClass11() {
                                    }

                                    @Override // android.webkit.ValueCallback
                                    public final /* synthetic */ void onReceiveValue(String str3) {
                                        ra.ouw("Playable_CrashMonitor", "load inject js=".concat(String.valueOf(str3)));
                                    }
                                });
                            }
                            pnoVar.ryl();
                        }
                    } catch (Throwable th3) {
                        ra.ouw("PlayablePlugin", "crashMonitor error", th3);
                    }
                }
                ouw ouwVar3 = ouw.this;
                if (ouwVar3.bly) {
                    ouwVar3.ouw(0, 0);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    ouw ouwVar4 = ouw.this;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(jCurrentTimeMillis2, ouwVar4.ouw, ouwVar4.fkw, "py_loading_success");
                }
            }

            public WebResourceResponse safedk_ouw$5_shouldInterceptRequest_f12cfcaccb1cf2d9d8bc1b30c4bb316d(WebView webView, String str2) {
                try {
                    com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar2 = ouw.this.ouw.f13788sd;
                    if (vtVar2 != null && !TextUtils.isEmpty(vtVar2.bly)) {
                        pno pnoVar = ouw.this.f14556ra;
                        if (pnoVar != null) {
                            pnoVar.ouw.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zin.pno.2
                                public AnonymousClass2() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    pno.this.ksc++;
                                }
                            });
                        }
                        WebResourceResponse webResourceResponseOuw = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(ouw.this.ouw.f13788sd.bly, od.cf(ouw.this.ouw), str2);
                        if (webResourceResponseOuw == null) {
                            ko.ouw("PlayableManager", "Plb res: hit no ", str2);
                            return super.shouldInterceptRequest(webView, str2);
                        }
                        ko.ouw("PlayableManager", "Plb res: hit++ ", str2);
                        pno pnoVar2 = ouw.this.f14556ra;
                        if (pnoVar2 != null) {
                            pnoVar2.ouw.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zin.pno.3
                                public AnonymousClass3() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    pno.this.jae++;
                                }
                            });
                        }
                        return webResourceResponseOuw;
                    }
                    return super.shouldInterceptRequest(webView, str2);
                } catch (Throwable unused) {
                    return super.shouldInterceptRequest(webView, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                return CreativeInfoManager.onWebViewResponseWithHeaders(g.f53147u, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
            public final WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/zin/ouw/ouw$5;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
                return CreativeInfoManager.onWebViewResponse(g.f53147u, webView, str2, safedk_ouw$5_shouldInterceptRequest_f12cfcaccb1cf2d9d8bc1b30c4bb316d(webView, str2));
            }
        });
        this.f14555lh.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.yu(this.yu) { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.yu, android.webkit.WebChromeClient
            public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.yu, android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i12) {
                super.onProgressChanged(webView, i12);
                tlj tljVar2 = ouw.this.vt;
                if (tljVar2 == null || tljVar2.getVisibility() != 0) {
                    return;
                }
                ouw.this.vt.setProgress(i12);
            }
        });
        com.bytedance.sdk.openadsdk.core.widget.ouw.lh lhVarOuw = com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(this.zih);
        lhVarOuw.vt = false;
        lhVarOuw.ouw = false;
        lhVarOuw.ouw(this.f14555lh.getWebView());
        le leVar2 = this.f14555lh;
        leVar2.setUserAgentString(com.bytedance.sdk.openadsdk.utils.th.ouw(leVar2.getWebView()));
        this.f14555lh.setMixedContentMode(0);
    }

    private void vt(boolean z10) {
        com.bytedance.sdk.component.ouw.ko koVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cid", this.ouw.pv);
            jSONObject.put("log_extra", this.ouw.yhj);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        if (com.bytedance.sdk.openadsdk.core.bly.ouw().jg()) {
            ra.ouw = new ra.ouw() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.1
                @Override // com.bytedance.sdk.openadsdk.zin.ra.ouw
                public final void ouw(String str, String str2) {
                    ko.vt(str, str2);
                }

                @Override // com.bytedance.sdk.openadsdk.zin.ra.ouw
                public final void ouw(String str, String str2, Throwable th3) {
                    ko.lh(str, str2, th3);
                }
            };
        }
        Context contextOuw = zih.ouw();
        WebView webView = this.f14555lh.getWebView();
        com.bytedance.sdk.openadsdk.zin.lh lhVar = new com.bytedance.sdk.openadsdk.zin.lh() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.2
            @Override // com.bytedance.sdk.openadsdk.zin.lh
            public final void ouw(String str, JSONObject jSONObject2) {
                bs bsVar = ouw.this.yu;
                if (bsVar != null) {
                    bsVar.ouw(str, jSONObject2);
                }
            }
        };
        com.bytedance.sdk.openadsdk.zin.ouw ouwVar = new com.bytedance.sdk.openadsdk.zin.ouw() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.3
            @Override // com.bytedance.sdk.openadsdk.zin.ouw
            public final void lh() {
                com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar = ouw.this.yu.f13490uq;
                if (vtVar != null) {
                    vtVar.ra();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.zin.ouw
            public final com.bytedance.sdk.openadsdk.zin.yu ouw() {
                String strOuw = com.bytedance.sdk.openadsdk.common.lh.ouw();
                strOuw.hashCode();
                switch (strOuw) {
                    case "2g":
                        return com.bytedance.sdk.openadsdk.zin.yu.TYPE_2G;
                    case "3g":
                        return com.bytedance.sdk.openadsdk.zin.yu.TYPE_3G;
                    case "4g":
                        return com.bytedance.sdk.openadsdk.zin.yu.TYPE_4G;
                    case "5g":
                        return com.bytedance.sdk.openadsdk.zin.yu.TYPE_5G;
                    case "wifi":
                        return com.bytedance.sdk.openadsdk.zin.yu.TYPE_WIFI;
                    default:
                        return com.bytedance.sdk.openadsdk.zin.yu.TYPE_UNKNOWN;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.zin.ouw
            public final void ouw(int i10) {
                ouw ouwVar2 = ouw.this;
                ouwVar2.bly = false;
                if (i10 == 2 || i10 == 3 || i10 == 4) {
                    ouwVar2.ouw(2, i10);
                } else if (i10 == 5) {
                    ouwVar2.ouw(3, i10);
                } else {
                    ouwVar2.ouw(1, 0);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.zin.ouw
            public final void ouw(final JSONObject jSONObject2) {
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                ouw ouwVar2 = ouw.this;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(jCurrentTimeMillis, ouwVar2.ouw, ouwVar2.fkw, "playable_track", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.3.1
                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject lh() {
                        return jSONObject2;
                    }

                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject ouw() {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("is_new_playable", 1);
                            if (ouw.this.ouw.wp()) {
                                jSONObject3.put("is_pre_render", 1);
                            }
                            return jSONObject3;
                        } catch (JSONException e10) {
                            qbp.lh("PlayableManager", e10.getMessage());
                            return null;
                        }
                    }
                });
            }

            @Override // com.bytedance.sdk.openadsdk.zin.ouw
            public final void vt() {
                ouw ouwVar2 = ouw.this;
                ouwVar2.yu.f13488th = true;
                com.bytedance.sdk.openadsdk.mwh.le leVar = ouwVar2.pno;
                if (leVar != null) {
                    leVar.ouw();
                }
            }
        };
        pno pnoVar = webView == null ? new pno(contextOuw, lhVar, ouwVar) : new pno(contextOuw, webView, lhVar, ouwVar, pno.ouw.LAND_PAGE);
        this.f14556ra = pnoVar;
        pno pnoVarLh = pnoVar.lh(this.f14554le);
        pnoVarLh.mt = ryl.ouw(zih.ouw());
        pnoVarLh.f14573cj = com.bytedance.sdk.openadsdk.core.bly.ouw().pno();
        pnoVarLh.f14598ub = "open_news";
        pnoVarLh.pv = uoy.bly();
        pnoVarLh.f14579kn = jSONObject;
        pno pnoVarVt = pnoVarLh.vt(od.bly(this.ouw)).ouw().ouw(z10).vt(false);
        long jRyl = od.ryl(this.ouw);
        if (jRyl <= 0) {
            pnoVarVt.zih = 10L;
        } else {
            pnoVarVt.zih = jRyl;
        }
        long jRyl2 = od.ryl(this.ouw);
        if (jRyl2 <= 0) {
            pnoVarVt.f14604vm = 10L;
        } else {
            pnoVarVt.f14604vm = jRyl2;
        }
        pnoVarVt.f14605wp.put("sdkEdition", BuildConfig.VERSION_NAME);
        pnoVarVt.coz = od.le(this.ouw);
        pnoVarVt.f14577jg = this.fkw;
        this.f14556ra.yhj = com.bytedance.sdk.openadsdk.zin.fkw.vt(this.zih);
        Set<String> setOuw = this.f14556ra.hun.ouw();
        final WeakReference weakReference = new WeakReference(this.f14556ra);
        for (String str : setOuw) {
            if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (koVar = this.yu.vpp) != null) {
                koVar.ouw(str, new com.bytedance.sdk.component.ouw.yu<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.4
                    private JSONObject ouw(@NonNull JSONObject jSONObject2) {
                        try {
                            pno pnoVar2 = (pno) weakReference.get();
                            if (pnoVar2 == null) {
                                return null;
                            }
                            String strOuw = ouw();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (ra.ouw()) {
                                StringBuilder sb2 = new StringBuilder("PlayablePlugin JSB-REQ [");
                                sb2.append(strOuw);
                                sb2.append("] ");
                                sb2.append(jSONObject2 != null ? jSONObject2.toString() : "");
                                ra.ouw("PlayablePlugin", sb2.toString());
                            }
                            JSONObject jSONObjectOuw = pnoVar2.hun.ouw(strOuw, jSONObject2);
                            if (ra.ouw()) {
                                StringBuilder sb3 = new StringBuilder("PlayablePlugin JSB-RSP [");
                                sb3.append(strOuw);
                                sb3.append("] time:");
                                sb3.append(System.currentTimeMillis() - jCurrentTimeMillis);
                                sb3.append(Z7.f30794r);
                                sb3.append(jSONObjectOuw != null ? jSONObjectOuw.toString() : "");
                                ra.ouw("PlayablePlugin", sb3.toString());
                            }
                            return jSONObjectOuw;
                        } catch (Throwable unused) {
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.component.ouw.yu
                    public final /* bridge */ /* synthetic */ JSONObject ouw(String str2, @NonNull JSONObject jSONObject2) throws Exception {
                        return ouw(jSONObject2);
                    }
                });
            }
        }
    }

    public final boolean fkw() {
        bs bsVar = this.yu;
        if (bsVar != null) {
            return bsVar.f13488th;
        }
        return false;
    }

    public final void lh() {
        if (!this.f14551cf.get() || this.f14556ra == null) {
            return;
        }
        qbp.ouw("PlayableManager", "onPause() called");
        this.f14556ra.vt(false);
    }

    public void ouw() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar;
        tlj tljVar;
        final boolean z10 = true;
        if (this.f14551cf.getAndSet(true)) {
            return;
        }
        FrameLayout frameLayout = this.f14559th;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        qbp.ouw("PlayableManager", "showPlayable() called with: hasLoading = [false], loadingViewIsHide = [" + this.qbp + C3978d4.j.f31385e);
        if (this.qbp || (tljVar = this.vt) == null) {
            this.f14556ra.vt(true);
            bs bsVar = this.yu;
            if (bsVar != null && (vtVar = bsVar.f13490uq) != null) {
                vtVar.le();
            }
            InterfaceC0270ouw interfaceC0270ouw = this.f14557rn;
            if (interfaceC0270ouw != null) {
                interfaceC0270ouw.ouw(this.zin);
            }
            z10 = false;
        } else {
            vpp vppVar = this.ouw;
            if (!tljVar.isShown()) {
                tljVar.vt();
                tljVar.setVisibility(0);
                tljVar.ouw = SystemClock.elapsedRealtime();
                tljVar.ouw(vppVar);
            }
            pno pnoVar = this.f14556ra;
            if (pnoVar != null) {
                pnoVar.bly();
            }
        }
        if (this.f14556ra != null) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), this.ouw, this.fkw, "playable_track", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.7
                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                public final JSONObject lh() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_event", "start_show_plb");
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                public final JSONObject ouw() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("webview_state", ouw.this.f14556ra.euf);
                        jSONObject.put("has_loading", z10);
                        jSONObject.put("is_new_playable", 1);
                        return jSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            });
            this.f14556ra.njr = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(this.ouw);
        }
        le leVar = this.f14555lh;
        if (leVar != null) {
            leVar.setVisibility(0);
        } else {
            com.bytedance.sdk.openadsdk.rn.lh.ouw("plb_npe_crash", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.8
                @Override // com.bytedance.sdk.openadsdk.rn.vt
                public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("crash_ts", System.currentTimeMillis());
                    StringBuilder sb2 = ouw.this.f14553ko;
                    if (sb2 != null) {
                        jSONObject.put("destroy_stack_trace", sb2.toString());
                    }
                    jSONObject.put("destroy_ts", ouw.this.f14552jg);
                    com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                    yuVar.ouw = "plb_npe_crash";
                    yuVar.bly = jSONObject.toString();
                    return yuVar;
                }
            });
        }
    }

    public final void ouw(final int i10, final int i11) {
        InterfaceC0270ouw interfaceC0270ouw;
        com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar;
        pno pnoVar;
        vt vtVar2;
        if (this.qbp) {
            return;
        }
        this.qbp = true;
        this.zin = i10;
        qbp.ouw("PlayableManager", "onHidePlayableLoading() called with: hideReason = [" + i10 + "], errorDetail = [" + i11 + C3978d4.j.f31385e);
        if (i10 == 2) {
            this.tlj = true;
            this.f14556ra.euf = 3;
        } else if (i10 == 1) {
            this.tlj = true;
            this.f14556ra.euf = 2;
        } else if (i10 == 3) {
            this.tlj = true;
            this.f14556ra.euf = 4;
        } else if (i10 == 0) {
            this.f14556ra.euf = 1;
        }
        if (this.tlj && (vtVar2 = this.mwh) != null) {
            vtVar2.ouw();
        }
        if (this.f14551cf.get() && (pnoVar = this.f14556ra) != null) {
            pnoVar.vt(true);
        }
        bs bsVar = this.yu;
        if (bsVar != null && (vtVar = bsVar.f13490uq) != null) {
            vtVar.le();
        }
        if (!this.tlj && (interfaceC0270ouw = this.f14557rn) != null) {
            interfaceC0270ouw.ouw(i10);
        }
        tlj tljVar = this.vt;
        if (tljVar != null) {
            tljVar.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.9
                @Override // java.lang.Runnable
                public final void run() {
                    if (ouw.this.tlj) {
                        ouw.this.ryl.setVisibility(0);
                        InterfaceC0270ouw interfaceC0270ouw2 = ouw.this.f14557rn;
                        if (interfaceC0270ouw2 != null) {
                            interfaceC0270ouw2.ouw(i10);
                        }
                        ouw.this.ouw(true);
                    }
                    ouw ouwVar = ouw.this;
                    ouwVar.f14556ra.f14585mq = ouwVar.tlj;
                    ouw.this.vt.lh();
                    if (ouw.this.f14551cf.get()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ouw ouwVar2 = ouw.this;
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(jCurrentTimeMillis, ouwVar2.ouw, ouwVar2.fkw, "playable_track", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.9.1
                            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                            public final JSONObject lh() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("playable_event", "remove_loading_page");
                                } catch (Throwable unused) {
                                }
                                return jSONObject;
                            }

                            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                            public final JSONObject ouw() {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("remove_loading_page_type", i10);
                                    jSONObject.put("remove_loading_page_reason", i11);
                                    jSONObject.put("playable_url", ouw.this.f14554le);
                                    jSONObject.put("duration", ouw.this.vt.getDisplayDuration());
                                    jSONObject.put("is_new_playable", 1);
                                    return jSONObject;
                                } catch (Throwable unused) {
                                    return null;
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar) {
        this.jqy = ouwVar;
        tlj tljVar = this.vt;
        if (tljVar != null && tljVar.getDownloadButton() != null) {
            com.bytedance.sdk.openadsdk.core.le.pno downloadButton = this.vt.getDownloadButton();
            downloadButton.setOnClickListener(ouwVar);
            downloadButton.setOnTouchListener(ouwVar);
        }
        bly blyVar = this.ryl;
        if (blyVar != null) {
            blyVar.setClickListener(ouwVar);
        }
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar) {
        bs bsVar = this.yu;
        if (bsVar != null) {
            bsVar.f13490uq = vtVar;
        }
    }

    public final void ouw(boolean z10) {
        pno pnoVar = this.f14556ra;
        if (pnoVar != null) {
            pnoVar.ouw(z10);
        }
    }

    public final void ouw(boolean z10, com.bytedance.sdk.openadsdk.mwh.le leVar) {
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar;
        this.pno = leVar;
        this.f14556ra.myk = z10;
        com.bytedance.sdk.openadsdk.core.mwh.lh.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw();
        vpp vppVar = this.ouw;
        if (vppVar != null && (vtVar = vppVar.f13788sd) != null && !TextUtils.isEmpty(vtVar.bly) && com.bytedance.sdk.openadsdk.vpp.ouw.ouw("can_cancel_playable", false)) {
            com.bytedance.sdk.component.ra.vt.ouw ouwVar = ouwVarOuw.ouw.get(vppVar.f13788sd.bly);
            if (ouwVar != null) {
                ouwVar.lh();
            }
        }
        this.f14555lh.a_(this.f14554le);
        pno pnoVar = this.f14556ra;
        if (pnoVar != null) {
            pnoVar.njr = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(this.ouw);
            pno pnoVar2 = this.f14556ra;
            pnoVar2.osn = 1;
            JSONObject jSONObject = new JSONObject();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                pnoVar2.zin = jCurrentTimeMillis;
                long j10 = pnoVar2.qbp;
                jSONObject.put("playable_page_show_duration", j10 != -1 ? jCurrentTimeMillis - j10 : 0L);
            } catch (Throwable th2) {
                ra.ouw("PlayablePlugin", "reportUrlLoadStart error", th2);
            }
            pnoVar2.vt("PL_sdk_html_load_start", jSONObject);
            pnoVar2.lvd = true;
            pnoVar2.f14594sd = true;
            if (pnoVar2.coz) {
                pnoVar2.bly();
                pnoVar2.lvd = false;
                pnoVar2.f14594sd = false;
            }
            if (pnoVar2.pno) {
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    StringBuffer stringBuffer2 = new StringBuffer();
                    StringBuffer stringBuffer3 = new StringBuffer();
                    if (com.bytedance.sdk.openadsdk.zin.fkw.ouw(pnoVar2.rrs, com.bytedance.sdk.openadsdk.zin.fkw.ryl)) {
                        stringBuffer.append("Microphone_");
                        stringBuffer2.append("1");
                        if (com.bytedance.sdk.openadsdk.zin.fkw.ouw(pnoVar2.rrs, "android.permission.RECORD_AUDIO")) {
                            stringBuffer3.append("1");
                        } else {
                            stringBuffer3.append("0");
                        }
                    } else {
                        stringBuffer2.append("0");
                        stringBuffer3.append("0");
                    }
                    if (com.bytedance.sdk.openadsdk.zin.fkw.ouw(pnoVar2.rrs, com.bytedance.sdk.openadsdk.zin.fkw.f14540cf)) {
                        stringBuffer.append("Magetometer_");
                        stringBuffer2.append("1");
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer2.append("0");
                        stringBuffer3.append("0");
                    }
                    if (com.bytedance.sdk.openadsdk.zin.fkw.ouw(pnoVar2.rrs, com.bytedance.sdk.openadsdk.zin.fkw.tlj)) {
                        stringBuffer.append("Accelerometer_");
                        stringBuffer2.append("1");
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer2.append("0");
                        stringBuffer3.append("0");
                    }
                    if (com.bytedance.sdk.openadsdk.zin.fkw.ouw(pnoVar2.rrs, com.bytedance.sdk.openadsdk.zin.fkw.bly)) {
                        stringBuffer.append("Gyro_");
                        stringBuffer2.append("1");
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer2.append("0");
                        stringBuffer3.append("0");
                    }
                    if (com.bytedance.sdk.openadsdk.zin.fkw.ouw(pnoVar2.rrs, com.bytedance.sdk.openadsdk.zin.fkw.pno)) {
                        stringBuffer.append("Camera_");
                        stringBuffer2.append("1");
                        if (com.bytedance.sdk.openadsdk.zin.fkw.ouw(pnoVar2.rrs, "android.permission.CAMERA")) {
                            stringBuffer3.append("1");
                        } else {
                            stringBuffer3.append("0");
                        }
                    } else {
                        stringBuffer2.append("0");
                        stringBuffer3.append("0");
                    }
                    if (com.bytedance.sdk.openadsdk.zin.fkw.ouw(pnoVar2.rrs, com.bytedance.sdk.openadsdk.zin.fkw.f14543ra)) {
                        stringBuffer.append("Photo");
                        stringBuffer2.append("1");
                        if (com.bytedance.sdk.openadsdk.zin.fkw.ouw(pnoVar2.rrs)) {
                            stringBuffer3.append("1");
                        } else {
                            stringBuffer3.append("0");
                        }
                    } else {
                        stringBuffer2.append("0");
                        stringBuffer3.append("0");
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("playable_available_hardware_name", stringBuffer.toString());
                    jSONObject2.put("playable_available_hardware_code", stringBuffer2.toString());
                    jSONObject2.put("playable_available_hardware_auth_code", stringBuffer3.toString());
                    pnoVar2.vt("PL_sdk_hardware_detect", jSONObject2);
                    pnoVar2.pno = false;
                } catch (Throwable th3) {
                    ra.ouw("PlayablePlugin", "Hardware detect error", th3);
                }
            }
        }
    }

    public final void vt() {
        if (!this.f14551cf.get() || this.f14556ra == null) {
            return;
        }
        qbp.ouw("PlayableManager", "onResume() called");
        this.f14556ra.vt(true);
    }

    public final void yu() {
        pno pnoVar = this.f14556ra;
        if (pnoVar != null) {
            pnoVar.jg();
        }
        le leVar = this.f14555lh;
        if (leVar != null) {
            leVar.bly();
        }
        bs bsVar = this.yu;
        if (bsVar != null) {
            bsVar.lh();
        }
        this.f14552jg = System.currentTimeMillis();
        this.f14553ko = new StringBuilder();
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                StringBuilder sb2 = this.f14553ko;
                sb2.append(stackTraceElement);
                sb2.append("\n");
            }
        } catch (Throwable th2) {
            qbp.ouw("PlayableManager", "onDestroy() error", th2);
        }
        this.f14555lh = null;
    }
}
