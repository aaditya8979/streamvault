package com.bytedance.sdk.openadsdk.activity;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.ryl;
import com.bytedance.sdk.openadsdk.component.reward.view.tlj;
import com.bytedance.sdk.openadsdk.core.jae;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ko;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
public final class le extends ouw {
    private boolean vpp;

    public le(vt vtVar, vpp vppVar, int i10, int i11, boolean z10) {
        super(vtVar, vppVar, i10, i11, z10);
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
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.le.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/le$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f53147u, view);
                    safedk_le$1_onClick_73426f3ab8bb8e3591b9a66a9024f3bc(view);
                }

                public void safedk_le$1_onClick_73426f3ab8bb8e3591b9a66a9024f3bc(View view) {
                    if (le.this.bly.f13257bs.cf() && le.this.bly.tlj.get()) {
                        boolean z10 = le.this.bly.fak.fkw.get();
                        le.this.bly.f13257bs.yu(z10);
                        le.this.bly.ey.le(8);
                        le.this.bly.ux.sendEmptyMessageDelayed(600, 5000L);
                        if (!vpp.lh(le.this.bly.vt)) {
                            return;
                        }
                        if (vpp.lh(le.this.bly.vt) && z10) {
                            return;
                        }
                    }
                    le.this.bly.f13257bs.ryl();
                    le.this.bly.fak.fkw();
                    le.this.bly.f13258cd.lh();
                    le.this.lso();
                }
            };
            viewTlj.setOnClickListener(onClickListener);
            viewTlj.setTag(viewTlj.getId(), onClickListener);
        }
        this.bly.uoy.ouw(new com.bytedance.sdk.openadsdk.component.reward.top.vt() { // from class: com.bytedance.sdk.openadsdk.activity.le.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void lh() {
                View view = viewTlj;
                if (view != null) {
                    view.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw() {
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
                if (th.ouw(le.this.bly.vt) && !le.this.bly.f13272rn.get()) {
                    le.this.lso();
                    return;
                }
                le.this.bly.ex.zih();
                ko.ouw ouwVar = new ko.ouw();
                ouwVar.ouw(le.this.bly.ex.fkw());
                ouwVar.vt(le.this.bly.ex.ko());
                ouwVar.vt = le.this.bly.ex.pno();
                ouwVar.tlj = 3;
                ouwVar.ryl = le.this.bly.ex.jg();
                com.bytedance.sdk.openadsdk.component.reward.ouw.ko koVar = le.this.bly.ex;
                ouwVar.f14415le = koVar.f13237jg;
                com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(koVar.lh(), ouwVar, le.this.bly.ex.zin);
                jae.ouw(le.this.bly.f13265le);
                le.this.bly.ex.ouw("skip", false);
                le.this.bly.uoy.yu(false);
                le leVar = le.this;
                if (leVar.bly.f13266lh) {
                    leVar.fkw();
                } else {
                    leVar.lso();
                }
                vpp vppVar = le.this.bly.vt;
                if (vppVar != null && vppVar.sd() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = le.this.bly;
                    if (ouwVar2.ex != null && (yuVar = ouwVar2.vt.sd().ouw) != null) {
                        yuVar.fkw(le.this.bly.ex.fkw());
                        yuVar.yu(le.this.bly.ex.fkw());
                    }
                }
                com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(le.this.bly.vt, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw(String str) {
                le.this.ouw(str);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void vt() {
                le.this.f_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void yu() {
                le leVar = le.this;
                leVar.vt(leVar.bly);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ouw
    public final FrameLayout bly() {
        ryl rylVar;
        tlj tljVar;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar;
        if (!this.f12988le.lh()) {
            com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = ((ouw) this).vt;
            if (vtVar != null && (vtVar instanceof com.bytedance.sdk.openadsdk.component.reward.vt.pno)) {
                return ((com.bytedance.sdk.openadsdk.component.reward.vt.pno) vtVar).ex();
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.bly;
            if (ouwVar2 == null || (rylVar = ouwVar2.ey) == null) {
                return null;
            }
            return rylVar.le();
        }
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar2 = ((ouw) this).vt;
        if (vtVar2 != null && (vtVar2 instanceof com.bytedance.sdk.openadsdk.component.reward.vt.pno) && (ouwVar = this.bly) != null && !ouwVar.f13263kn) {
            return ((com.bytedance.sdk.openadsdk.component.reward.vt.pno) vtVar2).ex();
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.bly;
        if (ouwVar3 == null || (tljVar = ouwVar3.jae) == null) {
            return null;
        }
        return tljVar.ouw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean c_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean d_() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final String e_() {
        return "fullscreen_interstitial_ad";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno, com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ey() {
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
    public final void osn() {
        if (this.bly.vt.ex() != 100.0f) {
            this.vpp = true;
        }
        super.osn();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(String str) {
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar2;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        boolean z10 = !ouwVar.f13260cj;
        ouwVar.f13260cj = z10;
        tlj tljVar = ouwVar.jae;
        if (tljVar != null && (yuVar2 = tljVar.ouw) != null) {
            yuVar2.setSoundMute(z10);
        }
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = ((ouw) this).vt;
        if (vtVar != null && vtVar.yu() != null) {
            ((ouw) this).vt.yu().ouw(this.bly.f13260cj);
        }
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

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void rrs() {
        super.rrs();
        this.fkw = false;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        ouwVar.jae.fkw = false;
        ouwVar.ex.tc();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.ouw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vt() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r3.bly
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r0.vt
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.vpp.fkw(r0)
            r1 = 0
            if (r0 != 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r3.bly
            boolean r2 = r0.f13266lh
            if (r2 != 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.ouw.ryl r0 = r0.uoy
            java.lang.String r2 = "X"
            r0.ouw(r1, r2)
            goto L24
        L19:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r3.bly
            com.bytedance.sdk.openadsdk.component.reward.ouw.ryl r0 = r0.uoy
            java.lang.String r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getSkipText()
            r0.ouw(r1, r2)
        L24:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r3.bly
            com.bytedance.sdk.openadsdk.component.reward.ouw.ryl r0 = r0.uoy
            r1 = 1
            r0.fkw(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.le.vt():void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ouw, com.bytedance.sdk.openadsdk.activity.pno
    public final void yu() {
        boolean zKo;
        super.yu();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar == null) {
            return;
        }
        if (ouwVar.vt == null) {
            zKo = false;
        } else {
            zih.yu();
            zKo = cf.ko(String.valueOf(this.bly.f13265le));
        }
        if (zKo) {
            vpp vppVar = this.bly.vt;
            boolean z10 = true;
            if (vppVar != null && vppVar.ex() != 100.0f) {
                z10 = false;
            }
            if (z10) {
                return;
            }
            if (this.vpp) {
                this.vpp = false;
                lso();
            } else if (this.bly.f13257bs.zih()) {
                lso();
            }
        }
    }
}
