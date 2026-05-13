package com.bytedance.sdk.openadsdk.core.bly;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.adexpress.vt.mwh;
import com.bytedance.sdk.component.adexpress.vt.tlj;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bly.lh;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.fak;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import com.bytedance.sdk.openadsdk.core.lh.ouw;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.uoy;
import com.bytedance.sdk.openadsdk.core.yu.ra;
import com.bytedance.sdk.openadsdk.tc.vt.fkw;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qbp extends com.bytedance.sdk.openadsdk.core.le.lh implements com.bytedance.sdk.component.adexpress.dynamic.yu, com.bytedance.sdk.component.adexpress.vt.ko, com.bytedance.sdk.component.adexpress.vt.pno, ko, ouw.InterfaceC0233ouw {
    private float bly;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private String f13429bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public long f13430cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.yu.yu.fkw f13431cf;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    private ThemeStatusBroadcastReceiver f13432cj;
    private float coz;
    private com.bytedance.sdk.openadsdk.core.yu.bly euf;
    public ViewGroup ex;
    private ra.ouw ey;
    private com.bytedance.sdk.openadsdk.core.cf.lh.vt fak;
    private PAGExpressAdWrapperListener fkw;
    private lh fqk;
    public com.bytedance.sdk.component.adexpress.vt.yu<? extends View> fvf;
    private float fwd;
    private final ViewTreeObserver.OnScrollChangedListener hun;
    public boolean jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public AdSlot f13433jg;
    public HashSet<String> jqy;
    private vpp jvy;

    /* JADX INFO: renamed from: kn, reason: collision with root package name */
    private List<com.bytedance.sdk.component.adexpress.vt.tlj> f13434kn;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.model.vpp f13435ko;
    public int ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private pno f13436le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.lh.lh f13437lh;
    private final Runnable lso;
    private float lvd;
    private com.bytedance.sdk.component.adexpress.vt.bly mt;
    public String mwh;
    private final SparseArray<lh.ouw> myk;

    /* JADX INFO: renamed from: ng, reason: collision with root package name */
    private float f13438ng;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.yu.ra f13439od;
    private String osn;
    private boolean ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    public com.bytedance.sdk.component.adexpress.vt.vt f13440pd;
    private String pno;
    private ex pv;
    public boolean qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private bly f13441ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public FrameLayout f13442rn;
    private boolean rrs;
    public final Context ryl;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private long f13443sd;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public boolean f13444tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public com.bytedance.sdk.component.adexpress.vt.lh f13445th;
    private float tlj;

    /* JADX INFO: renamed from: ub, reason: collision with root package name */
    private final Runnable f13446ub;
    private com.bytedance.sdk.component.adexpress.vt.rn ucs;
    private boolean uoy;

    /* JADX INFO: renamed from: uq, reason: collision with root package name */
    public final AtomicBoolean f13447uq;
    private final Runnable ux;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.vt.le f13448vh;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public boolean f13449vm;
    public String vpp;
    private int vt;

    /* JADX INFO: renamed from: wp, reason: collision with root package name */
    private tlj.ouw f13450wp;
    private com.bytedance.sdk.component.adexpress.vt.mwh xdk;
    private com.bytedance.sdk.openadsdk.core.cf.le.yu yhj;
    private com.bytedance.sdk.openadsdk.core.cf.vt.ra yib;
    private TTDislikeDialogAbstract yu;
    public boolean zih;
    public int zin;
    private int zvq;

    public qbp(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, AdSlot adSlot, String str) {
        super(context);
        this.ouw = true;
        this.vt = 0;
        this.mwh = "embeded_ad";
        this.pno = null;
        this.f13449vm = false;
        this.qbp = true;
        this.zin = -1;
        this.f13429bs = "";
        this.f13444tc = false;
        this.rrs = true;
        this.ksc = -1;
        this.f13439od = new com.bytedance.sdk.openadsdk.yu.ra();
        this.f13430cd = 0L;
        this.f13447uq = new AtomicBoolean(false);
        this.hun = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                qbp qbpVar = qbp.this;
                if (qbpVar.qbp && qbpVar.tlj()) {
                    qbp.this.zin();
                    qbp qbpVar2 = qbp.this;
                    qbpVar2.removeCallbacks(qbpVar2.ux);
                    qbp qbpVar3 = qbp.this;
                    qbpVar3.postDelayed(qbpVar3.ux, 500L);
                }
            }
        };
        this.ux = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.2
            @Override // java.lang.Runnable
            public final void run() {
                if (!fak.ouw(qbp.this, 0, 5, false)) {
                    qbp.this.fkw(8);
                } else {
                    qbp qbpVar = qbp.this;
                    qbpVar.fkw(qbpVar.getVisibility());
                }
            }
        };
        this.lso = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.3
            @Override // java.lang.Runnable
            public final void run() {
                qbp.this.fkw(0);
            }
        };
        this.f13446ub = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.4
            @Override // java.lang.Runnable
            public final void run() {
                qbp.this.fkw(8);
            }
        };
        this.zvq = 8;
        this.myk = new SparseArray<>();
        this.f13438ng = -1.0f;
        this.fwd = -1.0f;
        this.coz = -1.0f;
        this.lvd = -1.0f;
        this.f13443sd = 0L;
        this.mwh = str;
        this.ryl = context;
        this.f13435ko = vppVar;
        this.f13433jg = adSlot;
        this.f13444tc = false;
        pno();
    }

    public qbp(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, AdSlot adSlot, String str, boolean z10, boolean z11) {
        super(context);
        this.ouw = true;
        this.vt = 0;
        this.mwh = "embeded_ad";
        this.pno = null;
        this.f13449vm = false;
        this.qbp = true;
        this.zin = -1;
        this.f13429bs = "";
        this.f13444tc = false;
        this.rrs = true;
        this.ksc = -1;
        this.f13439od = new com.bytedance.sdk.openadsdk.yu.ra();
        this.f13430cd = 0L;
        this.f13447uq = new AtomicBoolean(false);
        this.hun = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                qbp qbpVar = qbp.this;
                if (qbpVar.qbp && qbpVar.tlj()) {
                    qbp.this.zin();
                    qbp qbpVar2 = qbp.this;
                    qbpVar2.removeCallbacks(qbpVar2.ux);
                    qbp qbpVar3 = qbp.this;
                    qbpVar3.postDelayed(qbpVar3.ux, 500L);
                }
            }
        };
        this.ux = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.2
            @Override // java.lang.Runnable
            public final void run() {
                if (!fak.ouw(qbp.this, 0, 5, false)) {
                    qbp.this.fkw(8);
                } else {
                    qbp qbpVar = qbp.this;
                    qbpVar.fkw(qbpVar.getVisibility());
                }
            }
        };
        this.lso = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.3
            @Override // java.lang.Runnable
            public final void run() {
                qbp.this.fkw(0);
            }
        };
        this.f13446ub = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.4
            @Override // java.lang.Runnable
            public final void run() {
                qbp.this.fkw(8);
            }
        };
        this.zvq = 8;
        this.myk = new SparseArray<>();
        this.f13438ng = -1.0f;
        this.fwd = -1.0f;
        this.coz = -1.0f;
        this.lvd = -1.0f;
        this.f13443sd = 0L;
        this.mwh = str;
        this.ryl = context;
        this.f13435ko = vppVar;
        this.f13433jg = adSlot;
        this.f13444tc = z10;
        this.rrs = z11;
        pno();
    }

    public static JSONObject ouw(View view) {
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("left", iArr[0]);
            jSONObject.put("top", iArr[1]);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private static void qbp() {
        if (com.bytedance.sdk.openadsdk.core.jg.fkw()) {
            return;
        }
        ryl.ouw();
    }

    private void th() {
        if (com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu.ouw(this.mwh)) {
            com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu(this.ryl, this.f13435ko, this.f13444tc, (com.bytedance.sdk.openadsdk.core.cf.le.ouw) this.xdk, this, this.bly, this.tlj, this.f13449vm, this.mwh);
            com.bytedance.sdk.openadsdk.core.cf.vt.ra raVar = new com.bytedance.sdk.openadsdk.core.cf.vt.ra(this.ryl, yuVar, this, this.xdk);
            yuVar.ouw((ko) this);
            this.f13434kn.add(raVar);
            return;
        }
        com.bytedance.sdk.component.adexpress.vt.le leVar = new com.bytedance.sdk.component.adexpress.vt.le(this.ryl, this.xdk, new zin(this, this.xdk));
        this.f13448vh = leVar;
        this.f13434kn.add(leVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zin() {
        if (this.f13447uq.get()) {
            this.f13439od.ouw(System.currentTimeMillis(), fak.ouw(this));
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.ko
    public final void a_(int i10) {
        com.bytedance.sdk.component.adexpress.vt.bly blyVar = this.mt;
        if (blyVar != null) {
            if (!this.ouw) {
                blyVar.bly();
            }
            this.mt.tlj();
            ((mwh) this.mt).ryl();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.fkw;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderFail(this, com.bytedance.sdk.openadsdk.core.pno.ouw(i10), i10);
        }
        vpp vppVar = this.jvy;
        if (vppVar != null) {
            vppVar.ouw(this.f13435ko, this.mwh);
        }
    }

    public boolean bly() {
        return true;
    }

    public void cf() {
        com.bytedance.sdk.component.bly.le leVar;
        ex exVar = this.pv;
        if (exVar == null || exVar.lh() == null || (leVar = this.pv.f12348le) == null) {
            return;
        }
        try {
            leVar.getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/bly/qbp;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return safedk_qbp_dispatchTouchEvent_b119640a8dfd335807573089f2af869f(motionEvent);
    }

    public long fkw() {
        return 0L;
    }

    public final void fkw(int i10) {
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar == null || !(yuVar instanceof ex)) {
            return;
        }
        ((ex) yuVar).ouw(i10);
        this.zvq = i10;
    }

    public com.bytedance.sdk.openadsdk.yu.ra getAdShowTime() {
        return this.f13439od;
    }

    public lh getBrandBannerController() {
        return this.fqk;
    }

    public pno getClickCreativeListener() {
        return this.f13436le;
    }

    public bly getClickListener() {
        return this.f13441ra;
    }

    public String getClosedListenerKey() {
        return this.osn;
    }

    public int getDynamicShowType() {
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar != null) {
            return yuVar.vt();
        }
        return 0;
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.tlj).intValue();
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.bly).intValue();
    }

    public bs getJsObject() {
        ex exVar = this.pv;
        if (exVar != null) {
            return exVar.f13400jg;
        }
        return null;
    }

    public int getRenderEngineCacheType() {
        tlj tljVar;
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (!(yuVar instanceof ex) || (tljVar = ((ex) yuVar).f13401ko) == null) {
            return 0;
        }
        for (Integer num : tljVar.ouw) {
            if (num.intValue() == 3 || num.intValue() == 2 || num.intValue() == -1) {
                return num.intValue();
            }
        }
        return TextUtils.isEmpty(tljVar.ouw()) ? -1 : 1;
    }

    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.core.zih.yu().ko();
    }

    public String getUgenTemplateErrorReason() {
        return this.f13429bs;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lh.ouw.InterfaceC0233ouw
    public long getVideoProgress() {
        com.bytedance.sdk.openadsdk.core.yu.bly blyVar = this.euf;
        if (blyVar != null) {
            return blyVar.getVideoProgress();
        }
        return 0L;
    }

    public com.bytedance.sdk.component.bly.le getWebView() {
        ex exVar = this.pv;
        if (exVar == null) {
            return null;
        }
        return exVar.f12348le;
    }

    public final void jg() {
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar2 = this.fvf;
        if (yuVar2 instanceof ex) {
            if (yuVar2 == null) {
                return;
            }
            ((ex) yuVar2).le();
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f13435ko;
            com.bytedance.sdk.component.utils.bly.vt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.6
                @Override // java.lang.Runnable
                public final void run() {
                    qbp.this.yu(1);
                }
            }, ((long) (vppVar != null ? vppVar.f13775mb.f13748lh : 5)) * 1000);
        } else if (yuVar2 instanceof com.bytedance.sdk.openadsdk.core.cf.le.ra) {
            ((com.bytedance.sdk.openadsdk.core.cf.le.ra) yuVar2).cf();
        }
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = this.f13435ko;
        if (vppVar2 != null && (yuVarSd = vppVar2.sd()) != null && (yuVar = yuVarSd.ouw) != null) {
            yuVar.ouw();
        }
        if ((this.fvf instanceof com.bytedance.sdk.openadsdk.core.cf.le.ra) && com.bytedance.sdk.openadsdk.core.model.rn.ouw(this.f13435ko, false)) {
            com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar3 = this.fvf;
            if (this.fak != null) {
                try {
                    if (yuVar3 instanceof com.bytedance.sdk.openadsdk.core.cf.le.ra) {
                        ViewGroup viewGroup = (ViewGroup) ((com.bytedance.sdk.openadsdk.core.cf.le.ra) yuVar3).ra().fkw;
                        this.ex = viewGroup;
                        if (viewGroup != null) {
                            this.fak.ouw();
                            View viewVt = this.fak.vt();
                            if (viewVt != null) {
                                ViewGroup viewGroup2 = (ViewGroup) viewVt.getParent();
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(viewVt);
                                }
                                this.ex.addView(viewVt, new ViewGroup.LayoutParams(-1, -1));
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void ko() {
        if (this.f13435ko == null) {
            return;
        }
        this.f13430cd = SystemClock.elapsedRealtime();
        if (!this.f13435ko.pd()) {
            this.f13431cf.ouw();
            tlj.ouw ouwVar = this.f13450wp;
            if (ouwVar != null) {
                ouwVar.ouw(this);
            }
            try {
                this.f13450wp.ouw();
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        final lh lhVar = this.fqk;
        if (lhVar == null) {
            a_(106);
            return;
        }
        lhVar.vt = this;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = lhVar.yu;
        if (vppVar != null && vppVar.lso()) {
            lhVar.fkw = com.bytedance.sdk.openadsdk.utils.bs.ouw().schedule(new lh.vt(lhVar.ouw.pno), com.bytedance.sdk.openadsdk.core.zih.yu().ko(), TimeUnit.MILLISECONDS);
        }
        lh.ouw ouwVar2 = lhVar.ouw;
        if (ouwVar2 == null) {
            com.bytedance.sdk.component.adexpress.vt.ko koVar = lhVar.vt;
            if (koVar != null) {
                koVar.a_(106);
                return;
            }
            return;
        }
        ouwVar2.ouw(new com.bytedance.sdk.component.adexpress.vt.ra() { // from class: com.bytedance.sdk.openadsdk.core.bly.lh.1
            @Override // com.bytedance.sdk.component.adexpress.vt.ra
            public final void ouw(int i10, String str) {
                if (lh.this.vt != null) {
                    lh.this.vt.a_(106);
                }
                lh.this.vt();
            }

            @Override // com.bytedance.sdk.component.adexpress.vt.ra
            public final void ouw(View view, com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
                if (lh.this.f13415lh == null || view == null) {
                    if (lh.this.vt != null) {
                        lh.this.vt.a_(106);
                    }
                } else if (lh.this.vt != null) {
                    lh.this.vt.ouw(lh.this.ouw, jgVar);
                }
                lh.this.vt();
            }
        });
        View viewLh = lhVar.ouw.lh();
        lhVar.f13415lh.removeView(viewLh);
        if (viewLh.getParent() != null) {
            ((ViewGroup) viewLh.getParent()).removeView(viewLh);
        }
        lhVar.f13415lh.addView(viewLh, new ViewGroup.LayoutParams(-1, -1));
    }

    public boolean l_() {
        return false;
    }

    public int le() {
        return 0;
    }

    public final void le(int i10) {
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if ((yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.ra) && i10 == 4) {
            ((com.bytedance.sdk.openadsdk.core.cf.le.ra) yuVar).tlj();
        }
    }

    public fkw.ouw lh(int i10) {
        return new fkw.ouw(i10);
    }

    public void lh() {
    }

    public void mwh() {
        try {
            lh lhVar = this.fqk;
            if (lhVar != null) {
                lhVar.ouw();
            }
            vm();
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            List<com.bytedance.sdk.component.adexpress.vt.tlj> list = this.f13434kn;
            if (list != null) {
                Iterator<com.bytedance.sdk.component.adexpress.vt.tlj> it = list.iterator();
                while (it.hasNext()) {
                    it.next().ouw();
                }
            }
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.f13435ko);
            com.bytedance.sdk.openadsdk.tc.ouw.lh.vt(this.f13435ko);
            this.f13437lh = null;
            this.yu = null;
            this.f13433jg = null;
            this.f13435ko = null;
            this.fkw = null;
            this.f13436le = null;
            this.f13445th = null;
            this.f13441ra = null;
            com.bytedance.sdk.openadsdk.core.cf.lh.vt vtVar = this.fak;
            if (vtVar != null) {
                vtVar.lh();
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.ouw("NativeExpressView", "detach error", th2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        zin();
        List<com.bytedance.sdk.component.adexpress.vt.tlj> list = this.f13434kn;
        if (list != null) {
            Iterator<com.bytedance.sdk.component.adexpress.vt.tlj> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        com.bytedance.sdk.component.utils.ko.fkw("webviewpool", "onAttachedToWindow+++");
        getViewTreeObserver().addOnScrollChangedListener(this.hun);
        com.bytedance.sdk.openadsdk.core.bly.ouw().ouw(this.osn, this.ey);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.hun);
        com.bytedance.sdk.openadsdk.core.bly.ouw().yu(this.osn);
        List<com.bytedance.sdk.component.adexpress.vt.tlj> list = this.f13434kn;
        if (list != null) {
            Iterator<com.bytedance.sdk.component.adexpress.vt.tlj> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        com.bytedance.sdk.component.utils.ko.fkw("webviewpool", "onDetachedFromWindow===");
        ouw(8, true, true);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        com.bytedance.sdk.component.utils.ko.fkw("webviewpool", "onFinishTemporaryDetach+++");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        zin();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        com.bytedance.sdk.component.utils.ko.fkw("webviewpool", "onStartTemporaryDetach===");
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (Build.VERSION.SDK_INT < 28) {
            onWindowVisibilityChanged(z10 ? getVisibility() : 8);
        }
        zin();
        com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(this.f13435ko, z10);
        if (z10) {
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.f13435ko, 4);
        } else {
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.f13435ko, 8);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        ouw(i10, true, false);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void onvideoComplate() {
    }

    public final JSONObject ouw(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        if (!(this.fvf instanceof ex)) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            int renderEngineCacheType = getRenderEngineCacheType();
            if (vppVar != null) {
                vpp.ouw ouwVar = vppVar.f13803xn;
                if (ouwVar != null && ouwVar.ouw()) {
                    jSONObject.put("engine_version", vppVar.f13803xn.tlj);
                } else if (vppVar.lht != null) {
                    jSONObject.put("engine_version", "v3");
                } else {
                    jSONObject.put("engine_version", "v1");
                }
            }
            jSONObject.put("engine_type", renderEngineCacheType);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ko.vt("NativeExpressView", "exception:" + e10.getMessage());
        }
        return jSONObject;
    }

    public void ouw() {
    }

    public void ouw(int i10) {
    }

    public void ouw(int i10, com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
    }

    public void ouw(int i10, String str) {
    }

    public final void ouw(int i10, boolean z10, boolean z11) {
        this.qbp = z10;
        removeCallbacks(this.f13446ub);
        removeCallbacks(this.lso);
        if (i10 == 0) {
            if (z11) {
                this.lso.run();
                return;
            } else {
                postDelayed(this.lso, 50L);
                return;
            }
        }
        if (z11) {
            this.f13446ub.run();
        } else {
            postDelayed(this.f13446ub, 50L);
        }
    }

    public void ouw(View view, int i10, com.bytedance.sdk.component.adexpress.lh lhVar) {
        View view2;
        JSONObject jSONObject;
        com.bytedance.sdk.component.utils.qbp.ouw("ClickCreativeListener", "trigger Class2 method1", Integer.valueOf(i10));
        if (i10 == -1 || lhVar == null) {
            return;
        }
        HashMap map = new HashMap();
        if (od.lh(this.f13435ko)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 1);
        }
        com.bytedance.sdk.openadsdk.core.model.ko koVar = (com.bytedance.sdk.openadsdk.core.model.ko) lhVar;
        if (com.bytedance.sdk.openadsdk.core.model.th.lh(this.f13435ko)) {
            try {
                JSONObject jSONObject2 = koVar.mwh;
                if (jSONObject2 != null) {
                    int iOptInt = jSONObject2.optInt("click_type", 0);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("click_type", iOptInt);
                    map.put("pag_json_data", jSONObject3.toString());
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.yu(th2.toString(), new Object[0]);
            }
        }
        pno pnoVar = this.f13436le;
        if (pnoVar != null) {
            pnoVar.yu(getDynamicShowType());
            this.f13436le.ouw(map);
        }
        bly blyVar = this.f13441ra;
        if (blyVar != null) {
            blyVar.yu(getDynamicShowType());
            this.f13441ra.ouw(map);
        }
        float f10 = koVar.ouw;
        float f11 = koVar.vt;
        float f12 = koVar.f13672lh;
        float f13 = koVar.yu;
        boolean z10 = koVar.f13668cf;
        SparseArray<lh.ouw> sparseArray = koVar.tlj;
        if (sparseArray == null || sparseArray.size() == 0) {
            sparseArray = this.myk;
        }
        SparseArray<lh.ouw> sparseArray2 = sparseArray;
        String str = koVar.f13673ra;
        if (view == null) {
            view2 = this;
        } else {
            jSONObjectOuw = view != this ? ouw(view) : null;
            view2 = view;
        }
        koVar.pno = i10;
        if (jSONObjectOuw != null && koVar.bly == null) {
            koVar.bly = jSONObjectOuw;
        }
        if (i10 == 13) {
            int i11 = koVar.f13670ko;
            if (i11 >= 0) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("switch", i11);
                    ouw(jSONObject4);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        switch (i10) {
            case 1:
                FrameLayout frameLayout = this.f13442rn;
                if (frameLayout != null) {
                    frameLayout.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                }
                com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f13435ko;
                if (vppVar == null || vppVar.ajl != 1 || z10) {
                    bly blyVar2 = this.f13441ra;
                    if (blyVar2 != null) {
                        blyVar2.bly = koVar;
                        blyVar2.ex = str;
                        blyVar2.ouw(view2, f10, f11, f12, f13, sparseArray2, z10);
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.fkw;
                    if (pAGExpressAdWrapperListener != null && !koVar.f13669jg) {
                        pAGExpressAdWrapperListener.onAdClicked();
                        break;
                    }
                }
                break;
            case 2:
                if (koVar.ryl > 0) {
                    uoy.ouw(true);
                }
                pno pnoVar2 = this.f13436le;
                if (pnoVar2 != null) {
                    pnoVar2.bly = koVar;
                    pnoVar2.ex = str;
                    if (com.bytedance.sdk.openadsdk.core.model.th.lh(this.f13435ko) && (jSONObject = koVar.mwh) != null) {
                        ((com.bytedance.sdk.openadsdk.core.lh.ouw) this.f13436le).f13625ra = jSONObject.optBoolean("is_ceiling_page", false);
                    }
                    this.f13436le.ouw(view2, f10, f11, f12, f13, sparseArray2, z10);
                }
                PAGExpressAdWrapperListener pAGExpressAdWrapperListener2 = this.fkw;
                if (pAGExpressAdWrapperListener2 != null && !koVar.f13669jg) {
                    pAGExpressAdWrapperListener2.onAdClicked();
                }
                uoy.ouw(false);
                com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.f13435ko, 9);
                break;
            case 3:
                TTDislikeDialogAbstract tTDislikeDialogAbstract = this.yu;
                if (tTDislikeDialogAbstract == null) {
                    com.bytedance.sdk.openadsdk.lh.lh lhVar2 = this.f13437lh;
                    if (lhVar2 == null) {
                        TTDelegateActivity.ouw(this.f13435ko, this.osn);
                    } else {
                        lhVar2.ouw();
                    }
                } else {
                    tTDislikeDialogAbstract.show();
                }
                break;
            case 4:
                FrameLayout frameLayout2 = this.f13442rn;
                if (frameLayout2 != null) {
                    frameLayout2.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                }
                com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = this.f13435ko;
                if (vppVar2 == null || vppVar2.ajl != 1 || z10) {
                    StringBuilder sb2 = new StringBuilder("Creativity....mAdType=");
                    sb2.append(this.mwh);
                    sb2.append(",!mVideoPause=");
                    sb2.append(!this.zih);
                    sb2.append("，isAutoPlay=");
                    sb2.append(com.bytedance.sdk.openadsdk.utils.uoy.lh(this.f13435ko));
                    com.bytedance.sdk.component.utils.ko.vt("ClickCreativeListener", sb2.toString());
                    if ("embeded_ad".equals(this.mwh) && com.bytedance.sdk.openadsdk.core.model.vpp.fkw(this.f13435ko) && !this.zih && com.bytedance.sdk.openadsdk.utils.uoy.lh(this.f13435ko)) {
                        com.bytedance.sdk.component.utils.ko.vt("ClickCreativeListener", "Creative....");
                        pno pnoVar3 = this.f13436le;
                        if (pnoVar3 != null) {
                            pnoVar3.bly = koVar;
                            pnoVar3.ex = str;
                            pnoVar3.ouw(view2, f10, f11, f12, f13, sparseArray2, z10);
                        }
                    } else {
                        com.bytedance.sdk.component.utils.ko.vt("ClickCreativeListener", "normal....");
                        bly blyVar3 = this.f13441ra;
                        if (blyVar3 != null) {
                            blyVar3.bly = koVar;
                            blyVar3.ex = str;
                            blyVar3.ouw(view2, f10, f11, f12, f13, sparseArray2, z10);
                        }
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener3 = this.fkw;
                    if (pAGExpressAdWrapperListener3 != null && !koVar.f13669jg) {
                        pAGExpressAdWrapperListener3.onAdClicked();
                        break;
                    }
                }
                break;
            case 5:
                ouw(!this.f13444tc, "dynamicClick");
                break;
            case 6:
                ouw();
                break;
            case 7:
                TTWebsiteActivity.ouw(this.ryl, this.f13435ko, this.mwh);
                break;
        }
    }

    public void ouw(mwh.ouw ouwVar) {
    }

    public void ouw(com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar, com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar;
        this.f13447uq.set(true);
        this.fvf = yuVar;
        com.bytedance.sdk.component.utils.ko.ouw("NativeExpressView", "render type is  ", Integer.valueOf(yuVar.vt()));
        if (this.zvq != getWindowVisibility() && bly()) {
            fkw(getWindowVisibility());
        }
        if (yuVar.vt() == 3 && (vppVar = this.f13435ko) != null && vppVar.fvf == 1) {
            vppVar.fvf = 0;
        }
        if (yuVar.vt() != 1 || (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu)) {
            View viewLh = yuVar.lh();
            if (viewLh.getParent() != null) {
                ((ViewGroup) viewLh.getParent()).removeView(viewLh);
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                arrayList.add(getChildAt(i10));
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11) instanceof com.bytedance.sdk.component.bly.le) {
                    removeView((View) arrayList.get(i11));
                }
            }
            if (com.bytedance.sdk.openadsdk.core.model.th.lh(this.f13435ko)) {
                addView(yuVar.lh(), new FrameLayout.LayoutParams(-1, -1));
            } else {
                addView(yuVar.lh());
            }
        }
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = this.f13435ko;
        if (vppVar2 != null) {
            com.bytedance.sdk.openadsdk.rn.lh.ouw(vppVar2.ouw, this.f13430cd, this.mwh, yuVar.vt());
        }
        com.bytedance.sdk.component.adexpress.vt.bly blyVar = this.mt;
        if (blyVar != null) {
            ((mwh) blyVar).ryl();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.fkw;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderSuccess(this, (float) jgVar.f12444lh, (float) jgVar.yu);
        }
        if ((this.fvf instanceof com.bytedance.sdk.openadsdk.core.cf.le.ra) && com.bytedance.sdk.openadsdk.core.model.rn.ouw(this.f13435ko, false)) {
            com.bytedance.sdk.openadsdk.core.cf.lh.vt vtVar = new com.bytedance.sdk.openadsdk.core.cf.lh.vt(this.ryl, this.f13435ko);
            this.fak = vtVar;
            vtVar.ouw(this);
            this.fak.ouw(new com.bytedance.sdk.openadsdk.core.cf.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.7
                @Override // com.bytedance.sdk.openadsdk.core.cf.lh.ouw
                public final void ouw(View view, int i12, com.bytedance.sdk.component.adexpress.lh lhVar) {
                    while (true) {
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this, this.f13435ko, lh(getDynamicShowType()));
        vpp vppVar3 = this.jvy;
        if (vppVar3 != null) {
            vppVar3.ouw(this.f13435ko, this.mwh);
        }
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, AdSlot adSlot, String str, boolean z10, boolean z11) {
        if (vppVar == null) {
            return;
        }
        this.mwh = str;
        this.f13435ko = vppVar;
        this.f13433jg = adSlot;
        this.f13444tc = z10;
        this.rrs = z11;
        int i10 = vppVar.kfa;
        this.vt = i10;
        if (i10 != 10) {
            return;
        }
        this.uoy = true;
        pno();
        ko();
        this.uoy = false;
    }

    public void ouw(String str, JSONObject jSONObject) {
    }

    public void ouw(boolean z10, String str) {
    }

    public boolean ouw(JSONObject jSONObject) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0378 A[Catch: Exception -> 0x03a6, TRY_LEAVE, TryCatch #5 {Exception -> 0x03a6, blocks: (B:102:0x0297, B:104:0x029f, B:106:0x02a6, B:108:0x02ae, B:110:0x02b6, B:112:0x02ba, B:114:0x02c0, B:125:0x02d9, B:127:0x02dd, B:129:0x02e1, B:131:0x0302, B:130:0x02ed, B:132:0x031b, B:133:0x0346, B:134:0x0378), top: B:171:0x0297 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void pno() {
        /*
            Method dump skipped, instruction units count: 1078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.bly.qbp.pno():void");
    }

    public void ra() {
    }

    public final void rn() {
        try {
            FrameLayout frameLayout = this.f13442rn;
            if (frameLayout == null || frameLayout.getParent() == null) {
                return;
            }
            removeView(this.f13442rn);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.ouw("NativeExpressView", "backupDestroy remove video container error", th2);
        }
    }

    public void ryl() {
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean safedk_qbp_dispatchTouchEvent_b119640a8dfd335807573089f2af869f(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.bly.qbp.safedk_qbp_dispatchTouchEvent_b119640a8dfd335807573089f2af869f(android.view.MotionEvent):boolean");
    }

    public void setBackupListener(com.bytedance.sdk.component.adexpress.vt.lh lhVar) {
        this.f13445th = lhVar;
        com.bytedance.sdk.component.adexpress.vt.le leVar = this.f13448vh;
        if (leVar != null) {
            leVar.ouw.ouw(lhVar);
        }
    }

    public void setBannerClickClosedListener(ra.ouw ouwVar) {
        this.ey = ouwVar;
    }

    public void setClickCreativeListener(pno pnoVar) {
        this.f13436le = pnoVar;
        if (pnoVar != null) {
            pnoVar.ouw((ouw.InterfaceC0233ouw) this);
        }
    }

    public void setClickListener(bly blyVar) {
        this.f13441ra = blyVar;
    }

    public void setClosedListenerKey(String str) {
        lh.ouw ouwVar;
        this.osn = str;
        lh lhVar = this.fqk;
        if (lhVar == null || (ouwVar = lhVar.ouw) == null) {
            return;
        }
        ouwVar.f13421lh = str;
    }

    public void setDislike(com.bytedance.sdk.openadsdk.lh.lh lhVar) {
        lh.ouw ouwVar;
        ouw ouwVar2;
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar != null && (yuVar instanceof zin) && (ouwVar2 = (ouw) yuVar.lh()) != null) {
            ouwVar2.setDislikeInner(lhVar);
        }
        lh lhVar2 = this.fqk;
        if (lhVar2 != null && (ouwVar = lhVar2.ouw) != null && (lhVar instanceof com.bytedance.sdk.openadsdk.lh.lh)) {
            ouwVar.ouw = lhVar;
        }
        this.f13437lh = lhVar;
    }

    public void setExpressInteractionListener(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        lh.ouw ouwVar;
        this.fkw = pAGExpressAdWrapperListener;
        lh lhVar = this.fqk;
        if (lhVar == null || (ouwVar = lhVar.ouw) == null) {
            return;
        }
        ouwVar.bly = pAGExpressAdWrapperListener;
    }

    public void setJsbLandingPageOpenListener(com.bytedance.sdk.openadsdk.core.widget.fkw fkwVar) {
        if (this.pv != null && getJsObject() != null) {
            getJsObject().vt = fkwVar;
        }
        com.bytedance.sdk.openadsdk.core.cf.le.yu yuVar = this.yhj;
        if (yuVar != null) {
            yuVar.ouw(fkwVar);
        }
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        lh.ouw ouwVar;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar;
        ouw ouwVar2;
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar != null && (yuVar instanceof zin) && (ouwVar2 = (ouw) yuVar.lh()) != null) {
            ouwVar2.setDislikeOuter(tTDislikeDialogAbstract);
        }
        lh lhVar = this.fqk;
        if (lhVar != null && (ouwVar = lhVar.ouw) != null) {
            if (tTDislikeDialogAbstract != null && (vppVar = ouwVar.fkw) != null) {
                tTDislikeDialogAbstract.setMaterialMeta(vppVar.yhj, vppVar.jae);
            }
            ouwVar.vt = tTDislikeDialogAbstract;
        }
        this.yu = tTDislikeDialogAbstract;
    }

    public void setSoundMute(boolean z10) {
        this.f13444tc = z10;
        com.bytedance.sdk.component.adexpress.vt.vt vtVar = this.f13440pd;
        if (vtVar != null && vtVar.vt() != null) {
            this.f13440pd.vt().setSoundMute(z10);
        }
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) {
            ((com.bytedance.sdk.openadsdk.core.cf.le.yu) yuVar).setSoundMute(z10);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) {
        bs bsVar;
        com.bytedance.sdk.openadsdk.mwh.vt vtVar;
        int iMin;
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar2;
        try {
            int i12 = Integer.parseInt(String.valueOf(charSequence));
            if (!TextUtils.equals(this.mwh, "banner_ad")) {
                int i13 = this.ksc;
                int i14 = ((i10 < i13 || i13 < 0 || !(this.jae || TextUtils.equals(this.mwh, "open_ad"))) && !((i12 == 0 && TextUtils.equals(this.mwh, "open_ad")) || le() == 5)) ? 0 : 1;
                int i15 = this.ksc;
                if (i10 <= i15) {
                    com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f13435ko;
                    iMin = (vppVar == null || (vtVar2 = vppVar.f13788sd) == null) ? i15 - i10 : (int) (Math.min(i15, vtVar2.yu * ((double) vtVar2.f11287th)) - ((double) i10));
                } else {
                    iMin = 0;
                }
                com.bytedance.sdk.component.adexpress.vt.vt vtVar3 = this.f13440pd;
                if (vtVar3 != null && vtVar3.vt() != null) {
                    this.f13440pd.vt().setTime(String.valueOf(i12), i14, iMin, false);
                }
                com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
                if (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) {
                    ((com.bytedance.sdk.openadsdk.core.cf.le.yu) yuVar).setTime(String.valueOf(i12), i14, iMin, false);
                }
            }
            com.bytedance.sdk.openadsdk.core.cf.lh.vt vtVar4 = this.fak;
            if (vtVar4 != null) {
                com.bytedance.sdk.openadsdk.core.cf.lh.lh lhVar = vtVar4.ouw;
                if (!(lhVar instanceof com.bytedance.sdk.openadsdk.core.cf.lh.yu) || (bsVar = ((com.bytedance.sdk.openadsdk.core.cf.lh.yu) lhVar).ouw) == null || (vtVar = bsVar.jqy) == null) {
                    return;
                }
                vtVar.ouw(i12);
            }
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void setTimeUpdate(int i10) {
    }

    public void setVastVideoHelper(com.bytedance.sdk.openadsdk.core.yu.bly blyVar) {
        this.euf = blyVar;
    }

    public void setVideoBusiness(com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar) {
        bs bsVar;
        ex exVar = this.pv;
        if (exVar == null || (bsVar = exVar.f13400jg) == null) {
            return;
        }
        bsVar.f13490uq = vtVar;
    }

    public void setVideoFrameChangeListener(com.bytedance.sdk.openadsdk.mwh.ra raVar) {
        if (this.pv == null || getJsObject() == null) {
            return;
        }
        getJsObject().jae = raVar;
    }

    public boolean tlj() {
        return true;
    }

    public final void vm() {
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f13435ko;
        if (vppVar == null || (yuVarSd = vppVar.sd()) == null || (yuVar = yuVarSd.ouw) == null) {
            return;
        }
        yuVar.yu(getVideoProgress());
    }

    public void vt(int i10) {
    }

    public final void vt(int i10, String str) {
        bs bsVar;
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar == null || !(yuVar instanceof ex) || (bsVar = ((ex) yuVar).f13400jg) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", i10);
            jSONObject.put("flag", str);
            bsVar.ouw("onVideoPaused", jSONObject);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void vt(JSONObject jSONObject) {
    }

    public long yu() {
        return 0L;
    }

    public final void yu(int i10) {
        if (com.bytedance.sdk.openadsdk.core.model.th.lh(this.f13435ko)) {
            com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
            if (yuVar instanceof ex) {
                ex exVar = (ex) yuVar;
                com.bytedance.sdk.component.utils.ko.vt("TTAD.WebViewRender", "notifyWillZoom() method called");
                if (exVar.f13400jg != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("zoom_type", i10);
                        exVar.f13400jg.ouw("expressAdViewWillZoom", jSONObject);
                    } catch (JSONException e10) {
                        com.bytedance.sdk.component.utils.qbp.lh("TTAD.WebViewRender", e10.getMessage());
                    }
                }
            }
        }
    }

    public final boolean zih() {
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        return yuVar != null && (yuVar instanceof zin);
    }
}
