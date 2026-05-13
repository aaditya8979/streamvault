package com.bytedance.sdk.openadsdk.core.bly;

import android.R;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.ko;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.fvf;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.f;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class ex extends com.bytedance.sdk.component.adexpress.fkw.ouw {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.model.vpp f13399cf;
    private final com.bytedance.sdk.component.pno.pno ex;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public bs f13400jg;
    private volatile int jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public tlj f13401ko;
    public com.bytedance.sdk.openadsdk.yu.yu.fkw mwh;
    private final Map<String, com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh> qbp;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.utils.ouw f13402rn;
    public JSONObject ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private final Runnable f13403tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.yu.mwh f13404th;
    public String tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private String f13405vm;
    private vpp.ouw vpp;
    private Context zih;
    private com.bytedance.sdk.component.adexpress.vt.ra zin;

    public ex(Context context, com.bytedance.sdk.component.adexpress.vt.mwh mwhVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        super(context, mwhVar, themeStatusBroadcastReceiver);
        this.qbp = Collections.synchronizedMap(new HashMap());
        this.jqy = 0;
        this.ex = new com.bytedance.sdk.component.pno.pno("webviewrender_template") { // from class: com.bytedance.sdk.openadsdk.core.bly.ex.1
            @Override // java.lang.Runnable
            public final void run() {
                if (ex.this.bly.get()) {
                    return;
                }
                ex exVar = ex.this;
                exVar.ryl = exVar.fkw.ouw();
                ex exVar2 = ex.this;
                exVar2.ouw(exVar2.ryl);
                if (ex.this.jqy == 0) {
                    ex.this.bly();
                }
                com.bytedance.sdk.openadsdk.core.jg.lh().post(ex.this.f13403tc);
            }
        };
        this.f13403tc = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.ex.2
            @Override // java.lang.Runnable
            public final void run() {
                bs bsVar;
                if (ex.this.bly.get() || ex.this.zin == null) {
                    return;
                }
                ex exVar = ex.this;
                com.bytedance.sdk.component.bly.le leVar = exVar.f12348le;
                if (leVar != null && leVar.getWebView() != null && (bsVar = exVar.f13400jg) != null) {
                    bs bsVarOuw = bsVar.vt(exVar.f12348le).ouw(exVar.f13399cf);
                    com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = exVar.f13399cf;
                    bsVarOuw.f13482lh = vppVar2.pv;
                    bsVarOuw.fkw = vppVar2.yhj;
                    bsVarOuw.f13481le = uoy.ouw(exVar.tlj);
                    bsVarOuw.f13485ra = exVar.f13399cf.hun();
                    bsVarOuw.tlj = exVar;
                    bsVarOuw.ryl = exVar.ryl;
                    bsVarOuw.ouw(exVar.f12348le).zin = exVar.mwh;
                }
                ex exVar2 = ex.this;
                ex.super.ouw(exVar2.zin);
            }
        };
        if (this.f12348le == null) {
            return;
        }
        this.zih = context;
        this.tlj = mwhVar.ouw;
        this.f13399cf = vppVar;
        this.mwh = fkwVar;
        themeStatusBroadcastReceiver.ouw(this);
        bly();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bly() {
        if (this.f12348le.getWebView() == null || !com.bytedance.sdk.openadsdk.utils.bs.le()) {
            this.jqy = 1;
            com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.ex.3
                @Override // java.lang.Runnable
                public final void run() {
                    ex.this.tlj();
                }
            });
        } else {
            tlj();
        }
        if (!jg.vt(this.f13399cf) || this.vt) {
            return;
        }
        jg.ouw(this.f13399cf);
    }

    private void cf() {
        vpp.ouw ouwVar;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f13399cf;
        if (vppVar == null || (ouwVar = vppVar.f13803xn) == null) {
            return;
        }
        this.vpp = ouwVar;
    }

    private static String ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        return com.bytedance.sdk.component.adexpress.ouw.vt.vt.yu((vppVar == null || !vppVar.th()) ? null : "v3");
    }

    private void ouw(com.bytedance.sdk.component.bly.le leVar) {
        if (leVar == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.ouw.lh lhVarOuw = com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(this.zih);
            lhVarOuw.vt = false;
            lhVarOuw.ouw(leVar.getWebView());
            leVar.setVerticalScrollBarEnabled(false);
            leVar.setHorizontalScrollBarEnabled(false);
            com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(leVar);
            leVar.ra();
            leVar.setUserAgentString(com.bytedance.sdk.openadsdk.utils.th.ouw(leVar.getWebView()));
            leVar.setMixedContentMode(0);
            leVar.setJavaScriptEnabled(true);
            leVar.setJavaScriptCanOpenWindowsAutomatically(true);
            leVar.setDomStorageEnabled(true);
            leVar.setDatabaseEnabled(true);
            leVar.setAllowFileAccess(false);
            leVar.setSupportZoom(true);
            leVar.setBuiltInZoomControls(true);
            leVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            leVar.setUseWideViewPort(true);
            leVar.setCacheMode(-1);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.WebViewRender", e10.toString());
        }
    }

    private void ryl() {
        com.bytedance.sdk.component.bly.le leVar = this.f12348le;
        if (leVar == null || leVar.getWebView() == null) {
            return;
        }
        this.f12348le.setBackgroundColor(0);
        this.f12348le.setBackgroundResource(R.color.transparent);
        ouw(this.f12348le);
        if (this.f12348le != null) {
            com.bytedance.sdk.openadsdk.yu.mwh mwhVar = new com.bytedance.sdk.openadsdk.yu.mwh(this.f13399cf, this.f12348le.getWebView());
            mwhVar.jae = false;
            this.f13404th = mwhVar;
        }
        this.f13404th.f14475od = this.mwh;
        tlj tljVar = new tlj(this.zih, this.f13400jg, this.f13399cf, this.f13404th, this.fkw);
        this.f13401ko = tljVar;
        this.f12348le.setWebViewClient(tljVar);
        this.f12348le.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.yu(this.f13400jg, this.f13404th));
        com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().ouw(this.f12348le, this.f13400jg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tlj() {
        com.bytedance.sdk.component.bly.le leVar = this.f12348le;
        if (leVar == null || leVar.getWebView() == null || this.jqy == 2) {
            return;
        }
        this.f13405vm = ouw(this.f13399cf);
        this.f12348le.setDisplayZoomControls(false);
        ouw(fvf.ouw(this.f13405vm));
        cf();
        bs bsVar = new bs(this.zih);
        this.f13400jg = bsVar;
        bsVar.f13483od = true;
        ryl();
        this.jqy = 2;
    }

    public static boolean vt(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw
    public final void fkw() {
        bs bsVar = this.f13400jg;
        if (bsVar == null) {
            return;
        }
        bsVar.ouw("expressWebviewRecycle", (JSONObject) null);
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw
    public final void le() {
        super.le();
        if (this.f13400jg == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expressShow", true);
            this.f13400jg.ouw("expressShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.ouw
    public final void onThemeChanged(int i10) {
        if (this.f13400jg == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i10);
        } catch (JSONException unused) {
        }
        this.f13400jg.ouw("themeChange", jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw
    /* JADX INFO: renamed from: ouw */
    public final com.bytedance.sdk.component.bly.le lh() {
        return this.f12348le;
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw
    public final void ouw(int i10) {
        if (i10 == this.pno) {
            return;
        }
        this.pno = i10;
        boolean z10 = i10 == 0;
        if (this.f13400jg == null || this.f12348le == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f.O, z10);
            this.f13400jg.ouw("expressAdShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw, com.bytedance.sdk.component.adexpress.vt.cf
    public final void ouw(com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
        super.ouw(jgVar);
        if (this.f12349lh) {
            com.bytedance.sdk.component.utils.bly.vt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.ex.4
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.component.utils.ko.vt("TTAD.WebViewRender", "resumeTimers..........");
                    WebView webView = ex.this.f12348le.getWebView();
                    if (webView != null) {
                        webView.resumeTimers();
                    }
                }
            }, 2000L);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw, com.bytedance.sdk.component.adexpress.vt.yu
    public final void ouw(com.bytedance.sdk.component.adexpress.vt.ra raVar) {
        this.zin = raVar;
        com.bytedance.sdk.openadsdk.utils.bs.vt(this.ex);
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw
    public final void pno() {
        super.pno();
        com.bytedance.sdk.openadsdk.utils.ouw ouwVar = this.f13402rn;
        if (ouwVar != null) {
            ouwVar.fkw.remove(new WeakReference(this));
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw
    public final void ra() {
        super.ra();
        com.bytedance.sdk.openadsdk.utils.ouw ouwVar = ko.ouw.ouw.ouw;
        this.f13402rn = ouwVar;
        ouwVar.ouw(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw, com.bytedance.sdk.component.adexpress.vt.yu
    public final int vt() {
        return this.f13399cf.kfa;
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw
    public final void yu() {
        if (this.bly.get()) {
            return;
        }
        super.yu();
        bs bsVar = this.f13400jg;
        if (bsVar != null) {
            bsVar.ouw();
            this.f13400jg.lh();
            this.f13400jg = null;
        }
        com.bytedance.sdk.openadsdk.yu.mwh mwhVar = this.f13404th;
        if (mwhVar != null) {
            mwhVar.ouw(false);
        }
        com.bytedance.sdk.openadsdk.core.jg.lh().removeCallbacks(this.f13403tc);
        this.qbp.clear();
    }
}
