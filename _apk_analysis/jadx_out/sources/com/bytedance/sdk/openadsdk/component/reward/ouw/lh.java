package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.R;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.vm;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes2.dex */
public final class lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public TTAdDislikeToast f13248lh;
    public final ouw ouw;
    public vm vt;

    public lh(ouw ouwVar) {
        this.ouw = ouwVar;
    }

    private void vt(final com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar) {
        if (this.vt == null) {
            ouw ouwVar = this.ouw;
            vm vmVar = new vm(ouwVar.jvy, ouwVar.vt);
            this.vt = vmVar;
            vmVar.setCallback(new vm.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.lh.1
                @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                public final void ouw() {
                    lh.this.ouw.f13259cf.set(true);
                    String str = "landing_page";
                    if (!th.vt(lh.this.ouw.vt) && !th.yu(lh.this.ouw.vt) && !th.le(lh.this.ouw.vt) && !th.ra(lh.this.ouw.vt)) {
                        if (!lh.this.ouw.tlj.get()) {
                            str = "video_player";
                        } else if (od.vt(lh.this.ouw.vt)) {
                            str = "playable";
                        } else if (!lh.this.ouw.vt.vm()) {
                            str = CampaignEx.JSON_NATIVE_VIDEO_ENDCARD;
                        }
                    }
                    lh.this.vt.setDislikeSource(str);
                    ouw ouwVar2 = lh.this.ouw;
                    if (ouwVar2.ex.f13239le) {
                        com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar = ouwVar2.jae;
                        if (tljVar != null) {
                            tljVar.ouw(8, false);
                            return;
                        }
                        return;
                    }
                    vtVar.ko();
                    if (lh.this.ouw.ex.ouw()) {
                        lh.this.ouw.ex.ryl();
                    }
                    ouw ouwVar3 = lh.this.ouw;
                    if (ouwVar3.f13282xn) {
                        ouwVar3.f13261gh.hun().ouw(lh.this.ouw.f13261gh, 2);
                    }
                    com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(lh.this.ouw.vt, 8);
                    lh.this.ouw.ksc.yu();
                    lh.this.ouw.ksc.le();
                    com.bytedance.sdk.openadsdk.utils.jg jgVar = lh.this.ouw.f13273sd;
                    if (jgVar != null) {
                        jgVar.vt();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                public final void ouw(FilterWord filterWord) {
                    if (lh.this.ouw.ryl.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    lh.this.ouw.ryl.set(true);
                    com.bytedance.sdk.openadsdk.activity.pno pnoVar = lh.this.ouw.f13261gh;
                    if (pnoVar != null) {
                        pnoVar.hun().f13007th = true;
                    }
                    TTAdDislikeToast tTAdDislikeToast = lh.this.f13248lh;
                    if (tTAdDislikeToast != null) {
                        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                public final void vt() {
                    lh.this.ouw.f13259cf.set(false);
                    ouw ouwVar2 = lh.this.ouw;
                    ko koVar = ouwVar2.ex;
                    if (koVar.f13239le) {
                        com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar = ouwVar2.jae;
                        if (tljVar != null) {
                            tljVar.ouw(0, true);
                            return;
                        }
                        return;
                    }
                    koVar.ouw(vtVar);
                    if (lh.this.ouw.ex.yu()) {
                        lh.this.ouw.ex.cf();
                    }
                    ouw ouwVar3 = lh.this.ouw;
                    if (ouwVar3.f13282xn) {
                        ouwVar3.f13261gh.hun().ouw(lh.this.ouw.f13261gh, 1);
                    }
                    com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(lh.this.ouw.vt, 4);
                    lh.this.ouw.ksc.ouw(0);
                    lh.this.ouw.ksc.lh();
                    com.bytedance.sdk.openadsdk.utils.jg jgVar = lh.this.ouw.f13273sd;
                    if (jgVar != null) {
                        jgVar.ouw();
                    }
                }
            });
            ((FrameLayout) this.ouw.jvy.findViewById(R.id.content)).addView(this.vt);
        }
        if (this.f13248lh == null) {
            this.f13248lh = new TTAdDislikeToast(this.ouw.jvy);
            ((FrameLayout) this.ouw.jvy.findViewById(R.id.content)).addView(this.f13248lh);
        }
    }

    public final void ouw() {
        TTAdDislikeToast tTAdDislikeToast = this.f13248lh;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.hide();
        }
    }

    public final void ouw(com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar) {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar;
        if (this.ouw.jvy.isFinishing()) {
            return;
        }
        ouw ouwVar = this.ouw;
        com.bytedance.sdk.openadsdk.activity.pno pnoVar2 = ouwVar.f13261gh;
        boolean z10 = (pnoVar2 instanceof com.bytedance.sdk.openadsdk.activity.fkw) && ((com.bytedance.sdk.openadsdk.activity.fkw) pnoVar2).ouw;
        if (ouwVar.ryl.get() || !((pnoVar = this.ouw.f13261gh) == null || !pnoVar.hun().f13007th || z10)) {
            if (this.f13248lh == null) {
                this.f13248lh = new TTAdDislikeToast(this.ouw.jvy);
                ((FrameLayout) this.ouw.jvy.findViewById(R.id.content)).addView(this.f13248lh);
            }
            this.f13248lh.show(TTAdDislikeToast.getDislikeTip());
            this.ouw.ryl.set(true);
            return;
        }
        if (this.vt == null) {
            try {
                vt(vtVar);
            } catch (Throwable th2) {
                ApmHelper.reportCustomError("initDislike error", "RewardFullDislikeManager", th2);
            }
        }
        vm vmVar = this.vt;
        if (vmVar != null) {
            vmVar.ouw();
        }
    }
}
