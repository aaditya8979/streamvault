package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.vt.jg;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.bly.ex;
import com.bytedance.sdk.openadsdk.core.bly.ko;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.bly.zih;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.tc.vt.fkw;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class yu extends qbp {
    public static float ouw = 100.0f;
    private final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private float f13371le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public zih f13372lh;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.zin.ouw.ouw f13373ra;
    public ko vt;
    public int yu;

    public yu(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar, AdSlot adSlot, String str) {
        super(ouwVar.jvy, ouwVar.vt, adSlot, str, ouwVar.f13260cj, !ouwVar.euf);
        this.yu = 1;
        this.f13371le = -1.0f;
        this.fkw = ouwVar;
        setVideoBusiness(ouwVar.fqk);
    }

    public static /* synthetic */ void ouw(yu yuVar, jg jgVar) {
        if (jgVar != null) {
            double d10 = jgVar.fkw;
            double d11 = jgVar.f12443le;
            double d12 = jgVar.f12440cf;
            double d13 = jgVar.ryl;
            int iOuw = osn.ouw(yuVar.ryl, (float) d10);
            int iOuw2 = osn.ouw(yuVar.ryl, (float) d11);
            int iOuw3 = osn.ouw(yuVar.ryl, (float) d12);
            int iOuw4 = osn.ouw(yuVar.ryl, (float) d13);
            com.bytedance.sdk.component.utils.ko.vt("ExpressView", "vW x vH =" + d12 + VastAttributes.HORIZONTAL_POSITION + d13);
            if ((d13 != 0.0d && d12 != 0.0d) || yuVar.fvf.vt() == 7 || yuVar.fvf.vt() == 10 || (yuVar.fvf instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu)) {
                if ((yuVar.fvf instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) && (jgVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.vt)) {
                    FrameLayout frameLayout = ((com.bytedance.sdk.openadsdk.core.cf.le.vt) jgVar).zih;
                    if (frameLayout != null) {
                        if (yuVar.f13442rn.getParent() != null) {
                            ((ViewGroup) yuVar.f13442rn.getParent()).removeView(yuVar.f13442rn);
                        }
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.gravity = 17;
                        frameLayout.addView(yuVar.f13442rn, layoutParams);
                        return;
                    }
                    return;
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) yuVar.f13442rn.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new FrameLayout.LayoutParams(iOuw3, iOuw4);
                }
                layoutParams2.width = iOuw3;
                layoutParams2.height = iOuw4;
                layoutParams2.topMargin = iOuw2;
                layoutParams2.leftMargin = iOuw;
                layoutParams2.setMarginStart(iOuw);
                layoutParams2.setMarginEnd(layoutParams2.rightMargin);
                yuVar.f13442rn.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final boolean bly() {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.fkw.f13261gh;
        if (pnoVar == null || !(pnoVar.hun().tlj instanceof com.bytedance.sdk.openadsdk.activity.yu)) {
            return true;
        }
        return this.fkw.pv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final void cf() {
        super.cf();
        if (this.f13373ra != null) {
            com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.fkw.f13261gh;
            if (pnoVar != null && pnoVar.hun() != null) {
                this.f13373ra.ouw(this.fkw.f13261gh.hun().tlj.fkw());
            }
            this.f13373ra.vt();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/view/yu;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return safedk_yu_dispatchTouchEvent_24f56d0061c620f535955f898ef2ad21(motionEvent);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final long fkw() {
        ko koVar = this.vt;
        if (koVar != null) {
            return koVar.fkw();
        }
        return 0L;
    }

    public final View getBackupContainerBackgroundView() {
        if (zih()) {
            return this.f13372lh.getBackupContainerBackgroundView();
        }
        return null;
    }

    public final FrameLayout getVideoFrameLayout() {
        return zih() ? this.f13372lh.getVideoContainer() : this.f13442rn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final boolean l_() {
        return com.bytedance.sdk.openadsdk.component.reward.ouw.ouw(this.fkw);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final int le() {
        ko koVar = this.vt;
        if (koVar == null) {
            return 0;
        }
        int iLe = koVar.le();
        le(iLe);
        return iLe;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final fkw.ouw lh(int i10) {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar;
        fkw.ouw ouwVarLh = super.lh(i10);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.fkw;
        if (ouwVar.euf && (pnoVar = ouwVar.f13261gh) != null) {
            ouwVarLh.vt = pnoVar.f12985cf;
        }
        return ouwVarLh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void lh() {
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.lh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final void mwh() {
        try {
            com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.f13373ra;
            if (ouwVar != null) {
                ouwVar.yu();
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.ouw("TTAD.FRExpressView", th2);
        }
        super.mwh();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw() {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.FRExpressView", "onSkipVideo");
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.ouw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i10) {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.FRExpressView", "onChangeVideoState,stateType:".concat(String.valueOf(i10)));
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.ouw(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i10, jg jgVar) {
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.ouw(i10, jgVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i10, String str) {
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.ouw(i10, str);
        }
    }

    public final void ouw(long j10, long j11) {
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) {
            ((com.bytedance.sdk.openadsdk.core.cf.le.yu) yuVar).ouw(j10, j11);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.component.adexpress.vt.pno
    public final void ouw(View view, int i10, com.bytedance.sdk.component.adexpress.lh lhVar) {
        if (i10 == -1 || lhVar == null || i10 != 3) {
            super.ouw(view, i10, lhVar);
        } else {
            ra();
        }
    }

    public final void ouw(final jg jgVar) {
        if (jgVar == null) {
            return;
        }
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.yu.3
            @Override // java.lang.Runnable
            public final void run() {
                yu.ouw(yu.this, jgVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.component.adexpress.vt.ko
    public final void ouw(com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar, jg jgVar) {
        FrameLayout frameLayout;
        boolean z10;
        boolean z11;
        com.bytedance.sdk.openadsdk.core.bs bsVar;
        this.fvf = yuVar;
        vpp vppVar = this.f13435ko;
        if (vppVar != null && vppVar.lso()) {
            super.ouw(yuVar, jgVar);
            return;
        }
        if ((yuVar instanceof ex) && (bsVar = ((ex) yuVar).f13400jg) != null) {
            bsVar.f13477cf = this;
        }
        if (jgVar != null && jgVar.vt) {
            ouw(jgVar);
            this.yu = yuVar.vt();
            if ((this.fvf instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) && od.lh(this.f13435ko)) {
                try {
                    if ((jgVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.vt) && (frameLayout = ((com.bytedance.sdk.openadsdk.core.cf.le.vt) jgVar).f13519th) != null) {
                        com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.fkw.f13261gh;
                        if (pnoVar == null || pnoVar.hun() == null) {
                            z10 = false;
                            z11 = true;
                        } else {
                            com.bytedance.sdk.openadsdk.activity.pno pnoVarCf = this.fkw.f13261gh.hun().tlj.cf();
                            com.bytedance.sdk.openadsdk.activity.pno pnoVar2 = this.fkw.f13261gh;
                            z10 = pnoVarCf == pnoVar2;
                            z11 = pnoVar2.hun().tlj.fkw() || !z10;
                        }
                        com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = new com.bytedance.sdk.openadsdk.zin.ouw.ouw(this.ryl, this.f13435ko, this.fkw.ucs, z11, frameLayout);
                        this.f13373ra = ouwVar;
                        ouwVar.ouw(this.fkw.fqk);
                        this.f13373ra.ouw(false, (com.bytedance.sdk.openadsdk.mwh.le) null);
                        this.f13373ra.ouw();
                        com.bytedance.sdk.component.utils.qbp.ouw("TTAD.FRExpressView", "initPlayable success mute = " + this.fkw.f13260cj + ",isCurrentScene->" + z10 + ",isMute = " + z11);
                    }
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.ouw("TTAD.FRExpressView", th2);
                }
            }
            if (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu) {
                com.bytedance.sdk.openadsdk.component.reward.ouw.ko koVar = this.fkw.ex;
                koVar.f13236cf = true;
                com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = koVar.f13242ra;
                if (lhVar instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
                    ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) lhVar).f13898wp = true;
                }
            }
        }
        super.ouw(yuVar, jgVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(String str, JSONObject jSONObject) {
        super.ouw(str, jSONObject);
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.ouw(str, jSONObject);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(boolean z10, String str) {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.FRExpressView", "onMuteVideo,mute:".concat(String.valueOf(z10)));
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.ouw(z10, str);
        }
        setSoundMute(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final boolean ouw(JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.FRExpressView", "setPlaybackSpeed,params:".concat(String.valueOf(jSONObject)));
        ko koVar = this.vt;
        return koVar != null ? koVar.ouw(jSONObject) : super.ouw(jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final void pno() {
        this.f13449vm = true;
        this.f13442rn = new FrameLayout(this.ryl);
        if (!com.bytedance.sdk.openadsdk.core.cf.yu.ouw(this.f13435ko) && !com.bytedance.sdk.openadsdk.core.cf.yu.vt(this.f13435ko)) {
            addView(this.f13442rn, new FrameLayout.LayoutParams(-1, -1));
        }
        super.pno();
        com.bytedance.sdk.component.bly.le webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        setBackupListener(new com.bytedance.sdk.component.adexpress.vt.lh() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.yu.2
            @Override // com.bytedance.sdk.component.adexpress.vt.lh
            public final boolean ouw(ViewGroup viewGroup) {
                try {
                    ((qbp) viewGroup).rn();
                    yu.this.f13372lh = new zih(viewGroup.getContext());
                    yu yuVar = yu.this;
                    yuVar.f13372lh.ouw(yuVar.f13435ko, (qbp) viewGroup, yu.this.fkw.rrs);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.mwh.ra() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.yu.1
            @Override // com.bytedance.sdk.openadsdk.mwh.ra
            public final void ouw(jg jgVar) {
                yu.this.ouw(jgVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ra() {
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.ra();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final void ryl() {
        super.ryl();
        if (this.f13373ra != null) {
            com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.fkw.f13261gh;
            if (pnoVar != null && pnoVar.hun() != null) {
                this.f13373ra.ouw(true);
            }
            this.f13373ra.lh();
        }
    }

    public boolean safedk_yu_dispatchTouchEvent_24f56d0061c620f535955f898ef2ad21(MotionEvent motionEvent) {
        th thVar;
        ryl rylVar = this.fkw.ey;
        if (rylVar != null && (thVar = rylVar.f13361rn) != null && thVar.fkw()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f13371le = motionEvent.getY();
            } else if (action == 1) {
            }
            if (osn.ouw(this.f13371le, motionEvent.getY(), this.ryl)) {
                thVar.vt(5);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setExpressVideoListenerProxy(ko koVar) {
        this.vt = koVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.component.adexpress.dynamic.yu
    public final void setSoundMute(boolean z10) {
        super.setSoundMute(z10);
        com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.f13373ra;
        if (ouwVar != null) {
            ouwVar.ouw(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final boolean tlj() {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.fkw.f13261gh;
        return pnoVar == null || !(pnoVar.hun().tlj instanceof com.bytedance.sdk.openadsdk.activity.yu);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void vt(int i10) {
        ko koVar = this.vt;
        if (koVar != null) {
            koVar.vt(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final long yu() {
        ko koVar = this.vt;
        if (koVar != null) {
            return koVar.yu();
        }
        return 0L;
    }
}
