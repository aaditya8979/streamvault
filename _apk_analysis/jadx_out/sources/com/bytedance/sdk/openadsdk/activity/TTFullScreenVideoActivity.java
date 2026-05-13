package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.od;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.yu.tlj;
import com.ironsource.C4157n2;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TTFullScreenVideoActivity extends TTBaseVideoActivity {

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private static com.bytedance.sdk.openadsdk.ouw.lh.vt f12890vm;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private boolean f12891th;
    private com.bytedance.sdk.openadsdk.ouw.lh.vt zih;

    private void fvf() {
        if (com.bytedance.sdk.openadsdk.vpp.ouw.ra() && isChangingConfigurations()) {
            qbp.ouw("BVA", "callback close is invoke by config change.");
            return;
        }
        if (this.f12881ra) {
            return;
        }
        this.f12881ra = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f12878ko;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        vpp vppVar = ouwVar != null ? ouwVar.vt : null;
        if (vppVar != null && jElapsedRealtime > 0) {
            vppVar.vby = jElapsedRealtime;
        }
        if (vppVar != null) {
            vppVar.ybr = ouwVar.tlj.get() ? 1 : 0;
        }
        tlj.ouw(vppVar);
        qbp.ouw("BVA", "invoke callback onAdClose, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("onAdClose");
            return;
        }
        com.bytedance.sdk.openadsdk.ouw.lh.vt vtVar = this.zih;
        if (vtVar != null) {
            vtVar.vt();
        } else {
            tlj.ouw(vppVar, "close", false);
        }
    }

    private void lh(int i10) {
        this.vt.uoy.ouw(null, String.format(com.bytedance.sdk.component.utils.vpp.ouw(zih.ouw(), "tt_skip_ad_time_text"), Integer.valueOf(i10)));
    }

    private void ouw(final String str) {
        bs.fkw(new com.bytedance.sdk.component.pno.pno("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    TTFullScreenVideoActivity.this.ouw(1).executeFullVideoCallback(TTFullScreenVideoActivity.this.vt.f13276ub, str);
                } catch (Throwable th2) {
                    qbp.yu("TTAD.FSVA", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pd() {
        qbp.ouw("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.ouw.lh.vt vtVar = this.zih;
        if (vtVar != null) {
            vtVar.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(g.f53147u, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ey() {
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.f12877cf) {
            return;
        }
        f12890vm = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.vt != null) {
            com.bytedance.sdk.openadsdk.le.vt.ouw().ouw("videoForceBreak", this.vt.vt);
        }
        try {
            fvf();
        } catch (Exception unused) {
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void jg() {
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        super.jg();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null || (yuVar = ouwVar.jae.ouw) == null) {
            return;
        }
        yuVar.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.fkw() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.fkw
            public final void ouw() {
                TTFullScreenVideoActivity.this.pd();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void jvy() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void kn() {
        pd();
        this.vt.vt.pv();
        vpp vppVar = this.vt.vt;
        vppVar.f13776mq = true;
        if (vpp.fkw(vppVar)) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
            vpp vppVar2 = ouwVar.vt;
            com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar2, ouwVar.fkw, vppVar2.f13796uq);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void mwh() {
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.ouw.lh.vt vtVar = this.zih;
            if (vtVar != null) {
                vtVar.ouw();
            } else {
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
                tlj.ouw(ouwVar != null ? ouwVar.vt : null, C4157n2.f33013v, false);
            }
        }
        if (jqy()) {
            this.vt.jae.le();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout od() {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f12880lh;
        return (vtVar == null || !(vtVar instanceof com.bytedance.sdk.openadsdk.component.reward.vt.pno)) ? this.vt.ey.le() : ((com.bytedance.sdk.openadsdk.component.reward.vt.pno) vtVar).ex();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null || vpp.fkw(ouwVar.vt)) {
            return;
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = this.vt.vt.f13788sd;
        if (vtVar == null) {
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar2 = new com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt();
            vtVar2.yu = 10.0d;
            this.vt.vt.f13788sd = vtVar2;
        } else if (vtVar.yu <= 0.0d) {
            vtVar.yu = 10.0d;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        fvf();
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("recycleRes");
        }
        ouw(isFinishing(), isChangingConfigurations());
        this.zih = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.f12877cf) {
            f12890vm = this.zih;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onStop() {
        boolean zKo;
        super.onStop();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null) {
            return;
        }
        if (ouwVar.vt == null) {
            zKo = false;
        } else {
            zih.yu();
            zKo = cf.ko(String.valueOf(this.vt.f13265le));
        }
        if (zKo) {
            vpp vppVar = this.vt.vt;
            boolean z10 = true;
            if (vppVar != null && vppVar.ex() != 100.0f) {
                z10 = false;
            }
            if (z10) {
                return;
            }
            if (this.f12891th) {
                this.f12891th = false;
                finish();
            } else if (this.vt.f13257bs.zih()) {
                finish();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void osn() {
        if (this.vt.vt.ex() != 100.0f) {
            this.f12891th = true;
        }
        pd();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void ouw(long j10, long j11) {
        vt((int) (j10 / 1000));
        int i10 = this.f12879le;
        if (i10 >= 0) {
            this.vt.uoy.ouw(String.valueOf(i10), null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void ouw(@NonNull Intent intent) {
        super.ouw(intent);
        this.vt.zvq = intent.getBooleanExtra("is_verity_playable", false);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(Bundle bundle) {
        if (this.f12877cf) {
            super.ouw(bundle);
            this.zih = (com.bytedance.sdk.openadsdk.ouw.lh.vt) od.ouw().ouw(this.f12876jg, com.bytedance.sdk.openadsdk.ouw.lh.vt.class);
            return;
        }
        if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            this.zih = od.ouw().f13902lh;
        }
        if (this.zih != null || bundle == null) {
            return;
        }
        this.zih = f12890vm;
        f12890vm = null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(boolean z10) {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pno() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r3.vt
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r0.vt
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.vpp.fkw(r0)
            r1 = 0
            if (r0 != 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r3.vt
            boolean r2 = r0.f13266lh
            if (r2 != 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.ouw.ryl r0 = r0.uoy
            java.lang.String r2 = "X"
            r0.ouw(r1, r2)
            goto L24
        L19:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r3.vt
            com.bytedance.sdk.openadsdk.component.reward.ouw.ryl r0 = r0.uoy
            java.lang.String r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getSkipText()
            r0.ouw(r1, r2)
        L24:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r3.vt
            com.bytedance.sdk.openadsdk.component.reward.ouw.ryl r0 = r0.uoy
            r1 = 1
            r0.fkw(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.pno():void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void qbp() {
        final View viewTlj = this.vt.ey.tlj();
        if (viewTlj != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTFullScreenVideoActivity$3;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f53147u, view);
                    safedk_TTFullScreenVideoActivity$3_onClick_2f865e131fb3fb8612e640b50ce81baa(view);
                }

                public void safedk_TTFullScreenVideoActivity$3_onClick_2f865e131fb3fb8612e640b50ce81baa(View view) {
                    if (TTFullScreenVideoActivity.this.vt.f13257bs.cf() && TTFullScreenVideoActivity.this.vt.tlj.get()) {
                        boolean z10 = TTFullScreenVideoActivity.this.vt.fak.fkw.get();
                        TTFullScreenVideoActivity.this.vt.f13257bs.yu(z10);
                        TTFullScreenVideoActivity.this.vt.ey.le(8);
                        View view2 = viewTlj;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.le.yu) {
                            ((com.bytedance.sdk.openadsdk.core.le.yu) view2).setImageResource(com.bytedance.sdk.component.utils.vpp.yu(TTFullScreenVideoActivity.this.vt.hun, "tt_close_btn"));
                        }
                        TTFullScreenVideoActivity.this.vt.ux.sendEmptyMessageDelayed(600, 5000L);
                        if (!vpp.lh(TTFullScreenVideoActivity.this.vt.vt)) {
                            return;
                        }
                        if (vpp.lh(TTFullScreenVideoActivity.this.vt.vt) && z10) {
                            return;
                        }
                    }
                    TTFullScreenVideoActivity.this.vt.f13257bs.ryl();
                    TTFullScreenVideoActivity.this.vt.fak.fkw();
                    TTFullScreenVideoActivity.this.vt.f13258cd.lh();
                    TTFullScreenVideoActivity.this.finish();
                }
            };
            viewTlj.setOnClickListener(onClickListener);
            viewTlj.setTag(viewTlj.getId(), onClickListener);
        }
        this.vt.uoy.ouw(new com.bytedance.sdk.openadsdk.component.reward.top.vt() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void lh() {
                View view = viewTlj;
                if (view != null) {
                    view.performClick();
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x00e1  */
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void ouw() {
                /*
                    Method dump skipped, instruction units count: 321
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.AnonymousClass4.ouw():void");
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw(String str) {
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.vt.f13260cj = !r1.f13260cj;
                com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = tTFullScreenVideoActivity.f12880lh;
                if (vtVar != null && vtVar.yu() != null) {
                    TTFullScreenVideoActivity.this.f12880lh.yu().ouw(TTFullScreenVideoActivity.this.vt.f13260cj);
                }
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = TTFullScreenVideoActivity.this.vt;
                ouwVar.ex.ouw(ouwVar.f13260cj, str);
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = TTFullScreenVideoActivity.this.vt;
                ouwVar2.f13257bs.lh(ouwVar2.f13260cj);
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = TTFullScreenVideoActivity.this.vt;
                ouwVar3.ksc.ouw(ouwVar3.f13260cj);
                vpp vppVar = TTFullScreenVideoActivity.this.vt.vt;
                if (vppVar == null || (yuVarSd = vppVar.sd()) == null || (yuVar = yuVarSd.ouw) == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = TTFullScreenVideoActivity.this.vt;
                if (ouwVar4.f13260cj) {
                    yuVar.ra(ouwVar4.ex.fkw());
                } else {
                    yuVar.pno(ouwVar4.ex.fkw());
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void vt() {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.vt.f13270pd.ouw(tTFullScreenVideoActivity.f12880lh);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void yu() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean vpp() {
        return false;
    }

    public final void vt(int i10) {
        int iMyk = this.vt.vt.myk();
        zih.yu();
        if (!cf.fkw(String.valueOf(this.vt.f13265le)) || (!vpp.fkw(this.vt.vt) && !this.vt.f13266lh)) {
            if (i10 >= iMyk) {
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
                if (!ouwVar.xdk) {
                    ouwVar.ouw(true);
                }
                pno();
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.vt;
        if (!ouwVar2.xdk) {
            ouwVar2.ouw(true);
        }
        if (i10 > iMyk) {
            pno();
        } else {
            lh(iMyk - i10);
            this.vt.uoy.fkw(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final com.bytedance.sdk.openadsdk.common.zih yu() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final boolean zin() {
        return false;
    }
}
