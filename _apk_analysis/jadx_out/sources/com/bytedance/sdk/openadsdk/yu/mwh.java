package com.bytedance.sdk.openadsdk.yu;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.settings.fkw;
import com.bytedance.sdk.openadsdk.core.widget.ouw.le;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.ironsource.C3978d4;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class mwh {
    public static final int[] ouw = {10, 30, 50, 75, 100};
    public String bly;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    public volatile int f14466bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public boolean f14467cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.widget.ouw.le f14468cf;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    private final boolean f14469cj;
    public long ex;
    public String ey;
    public int fak;
    public final AtomicBoolean fkw;
    private final Context fqk;
    public final AtomicInteger fvf;
    private boolean hun;
    public boolean jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.zin.pno f14470jg;
    public long jqy;
    private final AtomicBoolean jvy;

    /* JADX INFO: renamed from: kn, reason: collision with root package name */
    private final AtomicBoolean f14471kn;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public bly f14472ko;
    public WeakReference<WebView> ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final AtomicBoolean f14473le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public long f14474lh;
    private long lso;
    private String mt;
    public boolean mwh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.yu.yu.fkw f14475od;
    public volatile long osn;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    public volatile long f14476pd;
    public boolean pno;
    private final int[] pv;
    public String qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f14477ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public int f14478rn;
    private final AtomicBoolean rrs;
    public le.ouw ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public boolean f14479tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public final vpp f14480th;
    public String tlj;

    /* JADX INFO: renamed from: ub, reason: collision with root package name */
    private long f14481ub;
    private volatile long ucs;
    public volatile long uoy;

    /* JADX INFO: renamed from: uq, reason: collision with root package name */
    public ryl f14482uq;
    private long ux;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    private final AtomicBoolean f14483vh;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public int f14484vm;
    public long vpp;
    public int vt;

    /* JADX INFO: renamed from: wp, reason: collision with root package name */
    private final AtomicInteger f14485wp;
    private final AtomicBoolean yhj;
    private long yib;
    public int yu;
    public AtomicBoolean zih;
    public long zin;

    public static class ouw {
        private final int[] ouw;

        public ouw(int[] iArr) {
            this.ouw = iArr;
        }

        @JavascriptInterface
        public final String getUrl() {
            return "";
        }

        @JavascriptInterface
        public final void readPercent(String str) {
            int iIntValue;
            try {
                iIntValue = Float.valueOf(str).intValue();
            } catch (Throwable unused) {
            }
            if (iIntValue > 100) {
                iIntValue = 100;
            } else if (iIntValue < 0) {
                iIntValue = 0;
            }
            int[] iArr = this.ouw;
            if (iArr == null || iArr.length <= 0) {
                return;
            }
            iArr[0] = iIntValue;
        }
    }

    public mwh(vpp vppVar, WebView webView) {
        this(vppVar, webView, false);
    }

    public mwh(vpp vppVar, WebView webView, ryl rylVar, int i10) {
        this(vppVar, webView);
        this.f14482uq = rylVar;
        this.fak = i10;
    }

    public mwh(vpp vppVar, WebView webView, boolean z10) {
        this.vt = 0;
        this.f14474lh = -1L;
        this.yu = 1;
        this.fkw = new AtomicBoolean(false);
        this.f14473le = new AtomicBoolean(false);
        this.rrs = new AtomicBoolean(false);
        this.jvy = new AtomicBoolean(false);
        this.f14477ra = -1;
        this.hun = false;
        this.f14478rn = 0;
        this.zih = new AtomicBoolean(false);
        this.qbp = "landingpage";
        this.zin = 0L;
        this.vpp = 0L;
        this.jqy = 0L;
        this.ex = 0L;
        this.f14481ub = 0L;
        this.f14479tc = false;
        this.f14469cj = false;
        int[] iArr = {0};
        this.pv = iArr;
        this.jae = false;
        this.f14467cd = false;
        this.f14476pd = 0L;
        this.fvf = new AtomicInteger(0);
        this.f14485wp = new AtomicInteger(0);
        this.f14471kn = new AtomicBoolean(false);
        this.f14466bs = 0;
        this.fak = -1;
        this.f14483vh = new AtomicBoolean(false);
        this.yhj = new AtomicBoolean(false);
        Context contextOuw = com.bytedance.sdk.openadsdk.core.zih.ouw();
        this.fqk = contextOuw;
        this.f14480th = vppVar;
        if (webView == null) {
            return;
        }
        this.hun = z10;
        WeakReference<WebView> weakReference = new WeakReference<>(webView);
        this.ksc = weakReference;
        WebView webView2 = weakReference.get();
        if (webView2 == null) {
            return;
        }
        if (vppVar != null) {
            if (vppVar.f13759ej == 1) {
                com.bytedance.sdk.openadsdk.core.widget.ouw.le leVar = new com.bytedance.sdk.openadsdk.core.widget.ouw.le(webView2, vppVar, contextOuw, this.hun);
                this.f14468cf = leVar;
                this.ryl = leVar.ex;
            }
        }
        if (vppVar != null && vppVar.zin() && com.bytedance.sdk.openadsdk.core.settings.cf.vt().pno.ouw(com.bytedance.sdk.openadsdk.core.settings.cf.ouw, false)) {
            this.f14472ko = new bly(vppVar, webView, this.hun);
        }
        if (webView instanceof com.bytedance.sdk.component.bly.fkw) {
            this.yib = ((com.bytedance.sdk.component.bly.fkw) webView2).ouw;
        } else {
            this.yib = System.currentTimeMillis();
        }
        try {
            PangleNetworkBridge.onAddedJavascriptInterface(webView2, new ouw(iArr), "JS_LANDING_PAGE_LOG_OBJ");
        } catch (Exception e10) {
            qbp.ouw("LandingPageLog", "addJavascriptInterface exception", e10);
        }
        if (vppVar != null && vppVar.fak() != null) {
            this.f14474lh = vppVar.fak().optLong("page_id", -1L);
        }
        this.mt = String.valueOf(SystemClock.elapsedRealtime());
    }

    private static void ouw(final vpp vppVar, final String str, final long j10, final int i10) {
        lh.ouw(System.currentTimeMillis(), vppVar, str, "lp_feeling_duration", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.mwh.4
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_lp_pre_render", i10);
                    jSONObject.put("meta_pre_render", vppVar.ucs() ? 1 : 0);
                    com.bytedance.sdk.openadsdk.core.model.vm vmVar = vppVar.f13775mb;
                    if (vmVar == null) {
                        vmVar = new com.bytedance.sdk.openadsdk.core.model.vm();
                    }
                    jSONObject.put("pre_render_status", vmVar.pno);
                    jSONObject.put("pre_render_use_gecko", vmVar.bly);
                    jSONObject.put("pre_render_add_type", vmVar.tlj);
                    com.bytedance.sdk.component.utils.ko.vt("LPPreRenderManager", "feeling duration is:", Long.valueOf(j10), jSONObject, str);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static /* synthetic */ void ouw(mwh mwhVar, int i10, String str) {
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.le.vt)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb2 = new StringBuilder(com.bytedance.sdk.openadsdk.core.settings.le.vt);
            jSONObject.putOpt("cid", mwhVar.f14480th.pv);
            jSONObject.putOpt(CreativeInfo.f52474c, mwhVar.f14480th.pv);
            jSONObject.put("log_extra", mwhVar.f14480th.yhj);
            uoy.ouw(sb2, "\"/** adInfo **/\"", jSONObject.toString());
            uoy.ouw(sb2, "\"/** first_page **/\"", String.valueOf(i10));
            uoy.ouw(sb2, "\"/** ix_to_externalurl **/\"", mwhVar.f14474lh != -1 ? "1" : "0");
            uoy.ouw(sb2, "\"/** preload_status **/\"", mwhVar.fak == 2 ? "2" : "0");
            uoy.ouw(sb2, "\"/** scene_state **/\"", str);
            uoy.ouw(sb2, "\"/** web_init_time **/\"", String.valueOf(mwhVar.yib));
            uoy.ouw(sb2, "\"/** channel_name **/\"", "\"" + mwhVar.f14480th.f13767ki + "\"");
            uoy.ouw(sb2, "\"/** session_id **/\"", "\"" + UUID.randomUUID().toString() + "\"");
            uoy.ouw(sb2, "\"/** web_url **/\"", "\"" + mwhVar.f14480th.osn + "\"");
            String string = sb2.toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            final String strConcat = SafeDKWebAppInterface.f52902f.concat(String.valueOf(string));
            WeakReference<WebView> weakReference = mwhVar.ksc;
            final WebView webView = weakReference != null ? weakReference.get() : null;
            if (TextUtils.isEmpty(strConcat) || webView == null) {
                return;
            }
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yu.mwh.3
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.component.utils.jg.ouw(webView, strConcat);
                }
            });
        } catch (Throwable th2) {
            qbp.yu(th2.getMessage(), new Object[0]);
        }
    }

    public static /* synthetic */ boolean ouw(com.bytedance.sdk.openadsdk.core.settings.le leVar, String str) {
        str.hashCode();
        switch (str) {
            case "0":
                return leVar.yu;
            case "1":
                return leVar.fkw;
            case "2":
                return leVar.f13989le;
            default:
                return false;
        }
    }

    public final void fkw() {
        com.bytedance.sdk.component.utils.ko.vt("LandingPageLog", C3978d4.i.f31366u0);
        if (this.f14481ub == 0) {
            this.f14481ub = System.currentTimeMillis();
        }
        this.zin = System.currentTimeMillis();
        if ("landingpage".equals(this.qbp) || "landingpage_endcard".equals(this.qbp) || "landingpage_split_screen".equals(this.qbp) || "landingpage_direct".equals(this.qbp) || "aggregate_page".equals(this.qbp)) {
            if (this.yhj.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.le.vt.ouw().ouw("landingStart", this.f14480th, this.mt);
            } else {
                com.bytedance.sdk.openadsdk.le.vt.ouw().ouw("landingContinue", this.f14480th, this.mt);
            }
        }
        if (com.bytedance.sdk.openadsdk.core.model.th.pno(this.f14480th) || com.bytedance.sdk.openadsdk.core.model.th.vt(this.f14480th)) {
            ouw(true, SystemClock.elapsedRealtime());
        }
    }

    public final void le() {
        com.bytedance.sdk.component.utils.ko.vt("LandingPageLog", "onStop");
        if ("landingpage".equals(this.qbp) || "landingpage_endcard".equals(this.qbp) || "landingpage_split_screen".equals(this.qbp) || "landingpage_direct".equals(this.qbp) || "aggregate_page".equals(this.qbp) || "landingpage_split_ceiling".equals(this.qbp)) {
            if (this.yu == 2) {
                if (this.vpp > 0 || !this.f14467cd) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - Math.max(this.zin, this.vpp);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("load_status", this.yu);
                        jSONObject.put("max_scroll_percent", this.pv[0]);
                        jSONObject.put("jump_times", this.fvf.getAndSet(0));
                        jSONObject.put("click_times", this.f14485wp.getAndSet(0));
                        jSONObject.putOpt("render_type", "h5");
                        jSONObject.putOpt("render_type_2", 0);
                    } catch (JSONException unused) {
                    }
                    this.jvy.set(true);
                    ouw("stay_page", jSONObject, Math.min(jCurrentTimeMillis, 600000L));
                    com.bytedance.sdk.openadsdk.le.vt.ouw().ouw("landingPause", this.f14480th, this.mt);
                }
            }
        }
    }

    public final void lh() {
        if (yu() && this.ucs > 0 && this.osn > 0 && !this.f14483vh.getAndSet(true)) {
            lh.vt(this.osn - this.ucs, this.f14480th, this.ey, (String) null);
        }
    }

    public final void ouw() {
        if (yu()) {
            this.uoy = SystemClock.elapsedRealtime();
            lh.ouw(this.f14480th, this.ey);
        }
    }

    public final void ouw(int i10) {
        com.bytedance.sdk.openadsdk.core.widget.ouw.le leVar = this.f14468cf;
        if (leVar == null || !this.mwh) {
            return;
        }
        leVar.ouw(i10);
    }

    public final void ouw(int i10, String str, String str2, String str3, boolean z10) {
        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = this.f14475od;
        if (fkwVar != null) {
            fkwVar.ouw((JSONObject) null);
        }
        if (!(str3 != null && str3.startsWith("image")) && this.yu != 2) {
            this.yu = 3;
        }
        this.f14477ra = i10;
        this.bly = str;
        this.tlj = str2;
        this.pno = z10;
    }

    public final void ouw(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.widget.ouw.le leVar = this.f14468cf;
        if (leVar != null && this.mwh) {
            leVar.ouw(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f14476pd != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f14485wp.incrementAndGet();
                if (this.f14471kn.getAndSet(true)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", this.f14480th.osn);
                } catch (JSONException unused) {
                }
                ouw("click_time", jSONObject, Math.max(SystemClock.elapsedRealtime() - this.f14476pd, 0L));
            }
        }
    }

    public final void ouw(com.bytedance.sdk.component.bly.le leVar) {
        int iFvf;
        Bitmap bitmapOuw;
        vpp vppVar;
        if ((!"landingpage".equals(this.qbp) && !"landingpage_endcard".equals(this.qbp) && !"landingpage_split_screen".equals(this.qbp) && !"landingpage_direct".equals(this.qbp) && !"aggregate_page".equals(this.qbp)) || (iFvf = com.bytedance.sdk.openadsdk.core.zih.yu().fvf()) == 0 || new Random().nextInt(100) + 1 > iFvf || leVar == null || leVar.getWebView() == null || leVar.getVisibility() != 0 || (bitmapOuw = osn.ouw(leVar)) == null || (vppVar = this.f14480th) == null) {
            return;
        }
        osn.ouw(vppVar, this.qbp, "landing_page_blank", bitmapOuw, leVar.getUrl(), this.f14474lh);
    }

    public final void ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.ouw.le leVar = this.f14468cf;
        if (leVar != null) {
            leVar.f14051lh = str;
        }
        bly blyVar = this.f14472ko;
        if (blyVar != null) {
            blyVar.fkw = str;
        }
        this.qbp = str;
    }

    public final void ouw(String str, String str2, long j10) {
        if (this.rrs.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (str.length() > 200) {
                    int iIndexOf = str.indexOf(38, 200);
                    int i10 = 300;
                    if (iIndexOf == -1 || iIndexOf > 300) {
                        iIndexOf = str.indexOf(63);
                    }
                    if (iIndexOf != -1 && iIndexOf <= 300) {
                        i10 = iIndexOf;
                    }
                    str = str.substring(0, i10);
                }
                jSONObject.put("url", str);
                jSONObject.put("type", str2);
            } catch (Throwable unused) {
            }
            ouw("load_finish_progress", jSONObject, j10);
        }
    }

    public final void ouw(String str, JSONObject jSONObject) {
        ouw(str, jSONObject, -1L);
    }

    public final void ouw(final String str, final JSONObject jSONObject, final long j10) {
        if (!this.jae || this.f14480th == null || TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.zin.pno pnoVar = this.f14470jg;
        final int iKo = pnoVar != null ? pnoVar.ko() : -1;
        lh.ouw(System.currentTimeMillis(), this.f14480th, this.qbp, str, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.mwh.1
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                if (jSONObject != null) {
                    try {
                        boolean zVt = od.vt(mwh.this.f14480th);
                        jSONObject.put("is_playable", zVt ? 1 : 0);
                        jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(mwh.this.f14480th) ? 1 : 0);
                        if (zVt && ("load_finish".equals(str) || "load_fail".equals(str))) {
                            jSONObject.put("playable_has_show", iKo);
                        }
                        if ("stay_page".equals(str)) {
                            jSONObject.put("first_page", mwh.this.f14484vm > 1 ? 0 : 1);
                        }
                    } catch (JSONException unused) {
                    }
                }
                com.bytedance.sdk.component.utils.ko.ouw("LPPreRenderManager", "sendEvent", str, mwh.this.qbp, jSONObject);
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                if (!com.bytedance.sdk.openadsdk.jg.ouw.lh(mwh.this.f14480th)) {
                    return null;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("is_lp_pre_render", mwh.this.f14478rn);
                    return jSONObject2;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j11 = j10;
                    if (j11 > 0) {
                        jSONObject2.put("duration", j11);
                    }
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }
        });
    }

    public final void ouw(boolean z10) {
        com.bytedance.sdk.component.utils.ko.vt("LandingPageLog", "onDestroy");
        WeakReference<WebView> weakReference = this.ksc;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                webView.removeJavascriptInterface("JS_LANDING_PAGE_LOG_OBJ");
            } catch (Exception e10) {
                qbp.ouw("LandingPageLog", "removeJavascriptInterface exception", e10);
            }
        }
        if (this.f14473le.compareAndSet(false, true)) {
            ouw(z10, "1");
            if (this.jae) {
                lh.ouw(this.f14480th, this.qbp, System.currentTimeMillis() - this.f14481ub, this.fak, ra());
            }
        } else if (this.yu == 2 && !this.jvy.get()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("load_status", this.yu);
                jSONObject.put("max_scroll_percent", this.pv[0]);
                jSONObject.put("jump_times", this.fvf.getAndSet(0));
                jSONObject.put("click_times", this.f14485wp.getAndSet(0));
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
            } catch (JSONException unused) {
            }
            ouw("stay_page", jSONObject, 0L);
        }
        if ("landingpage".equals(this.qbp) || "landingpage_endcard".equals(this.qbp) || "landingpage_split_screen".equals(this.qbp) || "landingpage_direct".equals(this.qbp) || "aggregate_page".equals(this.qbp) || "landingpage_split_ceiling".equals(this.qbp)) {
            com.bytedance.sdk.openadsdk.le.vt.ouw().ouw("landingFinish", this.f14480th, this.mt);
        }
    }

    public final void ouw(boolean z10, long j10) {
        if (z10) {
            this.ux = j10;
        } else {
            this.lso = j10;
        }
        if (this.ux <= 0 || this.lso <= 0 || !this.mwh || !this.zih.compareAndSet(false, true)) {
            return;
        }
        ouw(this.f14480th, this.qbp, this.lso - this.ux, this.f14478rn);
    }

    public final void ouw(boolean z10, final String str) {
        if (z10) {
            final int iRa = ra();
            lh.ouw(new com.bytedance.sdk.component.pno.pno("sendPrefLog") { // from class: com.bytedance.sdk.openadsdk.yu.mwh.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.bytedance.sdk.openadsdk.core.settings.cf cfVarYu = com.bytedance.sdk.openadsdk.core.zih.yu();
                        com.bytedance.sdk.openadsdk.core.settings.le leVar = (com.bytedance.sdk.openadsdk.core.settings.le) cfVarYu.pno.ouw("insert_js_config", com.bytedance.sdk.openadsdk.core.settings.le.ouw, new fkw.vt<com.bytedance.sdk.openadsdk.core.settings.le>() { // from class: com.bytedance.sdk.openadsdk.core.settings.cf.8
                            public AnonymousClass8() {
                            }

                            @Override // com.bytedance.sdk.openadsdk.core.settings.fkw.vt
                            public final /* synthetic */ le ouw(String str2) {
                                return new le(str2);
                            }
                        });
                        boolean zOuw = mwh.ouw(leVar, str);
                        if (zOuw) {
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.le.vt)) {
                                mwh.ouw(mwh.this, iRa, str);
                                return;
                            }
                            if (TextUtils.isEmpty(leVar.f13990lh) || !zOuw) {
                                return;
                            }
                            String str2 = leVar.f13990lh;
                            com.bytedance.sdk.component.ra.vt.vt vtVarVt = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.vt();
                            vtVarVt.ouw(str2);
                            HashMap map = new HashMap();
                            map.put("content-type", "application/json; charset=utf-8");
                            vtVarVt.yu(map);
                            vtVarVt.f12777ra = 9;
                            vtVarVt.f12776le = "sendPrefLog";
                            vtVarVt.ouw(new com.bytedance.sdk.component.ra.ouw.ouw() { // from class: com.bytedance.sdk.openadsdk.yu.mwh.2.1
                                @Override // com.bytedance.sdk.component.ra.ouw.ouw
                                public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, com.bytedance.sdk.component.ra.vt vtVar) {
                                    try {
                                        com.bytedance.sdk.openadsdk.core.settings.le.vt = vtVar.yu;
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        mwh.ouw(mwh.this, iRa, str);
                                    } catch (Exception e10) {
                                        qbp.ouw("LandingPageLog", "TTWebViewClient : onPageFinished", e10);
                                    }
                                }

                                @Override // com.bytedance.sdk.component.ra.ouw.ouw
                                public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, IOException iOException) {
                                    com.bytedance.sdk.component.utils.ko.vt("send landing page js error", iOException.toString());
                                }
                            });
                        }
                    } catch (Throwable th2) {
                        qbp.yu(th2.getMessage(), new Object[0]);
                    }
                }
            });
        }
    }

    public final int ra() {
        WeakReference<WebView> weakReference = this.ksc;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
                if (webBackForwardListCopyBackForwardList != null) {
                    if (webBackForwardListCopyBackForwardList.getCurrentIndex() == 0) {
                        return 1;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public final void vt() {
        if (yu()) {
            this.ucs = SystemClock.elapsedRealtime();
            lh();
        }
    }

    public final boolean yu() {
        vpp vppVar;
        return this.f14467cd && (vppVar = this.f14480th) != null && vppVar.hai;
    }
}
