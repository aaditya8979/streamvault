package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.activity.vt;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.ryl;
import com.bytedance.sdk.openadsdk.component.reward.view.tlj;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.widget.vt;
import com.bytedance.sdk.openadsdk.core.zih;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ra extends ouw {
    private static String ex;
    private static String jqy;
    private static String ksc;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private static String f12996tc;
    private static String vpp;
    private int jae;

    public ra(vt vtVar, vpp vppVar, int i10, int i11, boolean z10) {
        super(vtVar, vppVar, i10, i11, z10);
        this.jae = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ouw(final boolean z10, boolean z11, final Runnable runnable) {
        if (!z11 && this.f12989ra.yu.getBoolean("user_has_give_up_reward", false) && runnable != null) {
            return false;
        }
        zih.yu();
        if (!cf.le(String.valueOf(this.bly.f13265le))) {
            if (runnable == null) {
                if (z10) {
                    lso();
                    return false;
                }
                yib();
            }
            return false;
        }
        if (this.f12989ra.yu.getBoolean("reward_verify", false)) {
            if (runnable == null) {
                if (z10) {
                    lso();
                    return false;
                }
                yib();
            }
            return false;
        }
        this.bly.qbp.set(true);
        this.bly.ex.ryl();
        if (z10) {
            this.bly.ksc.yu();
        }
        final com.bytedance.sdk.openadsdk.core.widget.vt vtVar = new com.bytedance.sdk.openadsdk.core.widget.vt(ux());
        ((ouw) this).vt.mwh = vtVar;
        if (z10) {
            vtVar.ouw = vpp;
            vtVar.vt = jqy;
            vtVar.f14089lh = ex;
        } else {
            vtVar.ouw = f12996tc;
            vtVar.vt = ksc;
            vtVar.f14089lh = ex;
        }
        vtVar.yu = new vt.InterfaceC0247vt() { // from class: com.bytedance.sdk.openadsdk.activity.ra.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.vt.InterfaceC0247vt
            public final void ouw() {
                ra.this.bly.ex.cf();
                if (z10) {
                    ra.this.bly.ksc.ouw(1000);
                }
                vtVar.dismiss();
                ra.this.bly.qbp.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.vt.InterfaceC0247vt
            public final void vt() {
                vtVar.dismiss();
                ra.this.f12989ra.yu.putBoolean("user_has_give_up_reward", true);
                ra.this.bly.qbp.set(false);
                ra.this.bly.ksc.fkw();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                } else if (!z10) {
                    ra.this.yib();
                } else {
                    ra.this.bly.f13258cd.lh();
                    ra.this.lso();
                }
            }
        };
        vtVar.show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void yib() {
        /*
            r4 = this;
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.bly
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r0 = r0.ex
            r0.zih()
            com.bytedance.sdk.openadsdk.yu.fkw.vt.ko$ouw r0 = new com.bytedance.sdk.openadsdk.yu.fkw.vt.ko$ouw
            r0.<init>()
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.bly
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            long r1 = r1.fkw()
            r0.ouw(r1)
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.bly
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            long r1 = r1.ko()
            r0.vt(r1)
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.bly
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            long r1 = r1.pno()
            r0.vt = r1
            r1 = 3
            r0.tlj = r1
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.bly
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            int r1 = r1.jg()
            r0.ryl = r1
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.bly
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            long r2 = r1.f13237jg
            r0.f14415le = r2
            com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw r1 = r1.lh()
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r2 = r4.bly
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r2 = r2.ex
            com.bytedance.sdk.openadsdk.yu.ra r2 = r2.zin
            com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(r1, r0, r2)
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.bly
            int r0 = r0.f13265le
            com.bytedance.sdk.openadsdk.core.jae.ouw(r0)
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.bly
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r0 = r0.ex
            java.lang.String r1 = "skip"
            r2 = 0
            r0.ouw(r1, r2)
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.bly
            boolean r0 = r0.f13266lh
            if (r0 == 0) goto L7c
            r4.fkw()
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.bly
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r0.vt
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.th.ouw(r0)
            if (r0 == 0) goto L7f
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.bly
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f13272rn
            boolean r0 = r0.get()
            if (r0 != 0) goto L7f
        L7c:
            r4.lso()
        L7f:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.bly
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r0.vt
            com.bytedance.sdk.openadsdk.core.model.yu r0 = r0.sd()
            if (r0 == 0) goto L9b
            com.bytedance.sdk.openadsdk.core.ryl.yu r0 = r0.ouw
            if (r0 == 0) goto L9b
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.bly
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            long r1 = r1.fkw()
            r0.fkw(r1)
            r0.yu(r1)
        L9b:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.bly
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r0.vt
            r1 = 5
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.ra.yib():void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void b_() {
        vt vtVar = this.f12989ra;
        if (vtVar != null && vtVar.vpp) {
            super.b_();
            return;
        }
        final View viewTlj = this.bly.ey.tlj();
        if (viewTlj != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.ra.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/ra$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f53147u, view);
                    safedk_ra$1_onClick_3f17a61493a760cd02e473c041e89efe(view);
                }

                public void safedk_ra$1_onClick_3f17a61493a760cd02e473c041e89efe(View view) {
                    if (ra.this.bly.f13257bs.cf() && ra.this.bly.tlj.get()) {
                        boolean z10 = ra.this.bly.fak.fkw.get();
                        ra.this.bly.f13257bs.yu(z10);
                        ra.this.bly.ey.le(8);
                        ra.this.bly.ux.sendEmptyMessageDelayed(600, 5000L);
                        if (!vpp.lh(ra.this.bly.vt)) {
                            return;
                        }
                        if (vpp.lh(ra.this.bly.vt) && z10) {
                            return;
                        }
                    }
                    ra.this.bly.f13257bs.ryl();
                    ra.this.bly.fak.fkw();
                    ra.this.bly.f13258cd.lh();
                    if (od.yu(ra.this.bly.vt)) {
                        ra.this.ouw(true, true, (Runnable) null);
                    } else {
                        ra.this.lso();
                    }
                }
            };
            viewTlj.setOnClickListener(onClickListener);
            viewTlj.setTag(viewTlj.getId(), onClickListener);
        }
        this.bly.uoy.ouw(new com.bytedance.sdk.openadsdk.component.reward.top.vt() { // from class: com.bytedance.sdk.openadsdk.activity.ra.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void lh() {
                View view = viewTlj;
                if (view != null) {
                    view.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw() {
                ra raVar = ra.this;
                raVar.ouw(od.lh(raVar.bly.vt), false, (Runnable) null);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw(String str) {
                ra.this.ouw(str);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void vt() {
                ra.this.f_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void yu() {
                ra raVar = ra.this;
                raVar.vt(raVar.bly);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ouw
    public final FrameLayout bly() {
        ryl rylVar;
        tlj tljVar;
        if (this.f12988le.lh()) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
            if (ouwVar == null || (tljVar = ouwVar.jae) == null) {
                return null;
            }
            return tljVar.ouw();
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.bly;
        if (ouwVar2 == null || (rylVar = ouwVar2.ey) == null) {
            return null;
        }
        return rylVar.le();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean d_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final String e_() {
        return "rewarded_video";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void f_() {
        this.bly.f13270pd.ouw(((ouw) this).vt);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean g_() {
        return this.bly.f13260cj;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno, com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void jvy() {
        ub();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ouw, com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(Activity activity, vt.fkw fkwVar) {
        vt vtVar;
        super.ouw(activity, fkwVar);
        if (com.bytedance.sdk.component.utils.vt.ouw(activity)) {
            return;
        }
        Intent intent = activity.getIntent();
        this.f12987ko = intent.getStringExtra("media_extra");
        this.f12986jg = intent.getStringExtra("user_id");
        try {
            if (f12996tc == null) {
                f12996tc = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_reward_msg");
                vpp = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_msgPlayable");
                ex = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_negtiveBtnBtnText");
                ksc = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_postiveBtnText");
                jqy = com.bytedance.sdk.component.utils.vpp.ouw(this.bly.hun, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th2) {
            qbp.lh("TTAD.RewardAdScene", th2.getMessage());
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar == null || (vtVar = this.f12989ra) == null) {
            return;
        }
        ouwVar.ycd = vtVar.f13003le;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // com.bytedance.sdk.openadsdk.activity.pno
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r2) {
        /*
            r1 = this;
            boolean r0 = r2.f13266lh
            if (r0 == 0) goto L17
            r1.fkw()
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r2.vt
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.th.ouw(r0)
            if (r0 == 0) goto L1a
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f13272rn
            boolean r0 = r0.get()
            if (r0 != 0) goto L1a
        L17:
            r1.lso()
        L1a:
            com.bytedance.sdk.openadsdk.common.ouw.vt(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.ra.ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw):void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(String str) {
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar2;
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = ((ouw) this).vt;
        if (vtVar != null && vtVar.yu() != null) {
            ((ouw) this).vt.yu().ouw(this.bly.f13260cj);
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        boolean z10 = !ouwVar.f13260cj;
        ouwVar.f13260cj = z10;
        tlj tljVar = ouwVar.jae;
        if (tljVar != null && (yuVar2 = tljVar.ouw) != null) {
            yuVar2.setSoundMute(z10);
        }
        ko.ouw("TTAD.RewardAdScene", "rewarded_video", "will set is Mute " + this.bly.f13260cj + " mLastVolume=" + this.bly.fvf.vt);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.bly;
        ouwVar2.ex.ouw(ouwVar2.f13260cj, str);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.bly;
        ouwVar3.f13257bs.lh(ouwVar3.f13260cj);
        vpp vppVar = this.bly.vt;
        if (vppVar == null || (yuVarSd = vppVar.sd()) == null || (yuVar = yuVarSd.ouw) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = this.bly;
        if (ouwVar4.f13260cj) {
            yuVar.ra(ouwVar4.ex.fkw());
        } else {
            yuVar.pno(ouwVar4.ex.fkw());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ouw, com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(final String str, final JSONObject jSONObject) {
        if ("skipToNextAd".equals(str) && this.bly.f13261gh != null && this.f12989ra.tlj.mwh() == null) {
            vt vtVar = this.f12989ra;
            if (vtVar != null && vtVar.vpp) {
                com.bytedance.sdk.openadsdk.common.zih zihVar = this.zin;
                if (zihVar != null && zihVar.ouw(od.lh(this.bly.vt), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.ra.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        ra.super.ouw(str, jSONObject);
                    }
                })) {
                    return;
                }
            } else if (ouw(od.lh(this.bly.vt), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.ra.5
                @Override // java.lang.Runnable
                public final void run() {
                    ra.super.ouw(str, jSONObject);
                }
            })) {
                return;
            }
        }
        super.ouw(str, jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void rrs() {
        super.rrs();
        this.fkw = false;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        ouwVar.jae.fkw = false;
        ouwVar.ex.tc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ouw, com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void vm() {
        ub();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ouw
    public final void vt() {
        this.bly.uoy.ouw(null, TTAdDislikeToast.getSkipText());
        this.bly.uoy.fkw(true);
    }
}
