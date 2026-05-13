package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.ouw;
import com.bytedance.sdk.openadsdk.component.reward.tlj;
import com.bytedance.sdk.openadsdk.core.jqy;
import com.bytedance.sdk.openadsdk.core.model.fvf;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.vpp;
import com.bytedance.sdk.openadsdk.core.widget.vt;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.ex;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.ironsource.C4157n2;
import com.ironsource.Q6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TTRewardVideoActivity extends TTBaseVideoActivity {
    private static String ex;
    private static com.bytedance.sdk.openadsdk.ouw.fkw.ouw jae;
    private static String jqy;
    private static String qbp;
    private static String vpp;
    private static String zin;
    private String ksc;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private String f12923tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.ouw.fkw.ouw f12924th;

    /* JADX INFO: renamed from: uq, reason: collision with root package name */
    private boolean f12925uq;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public int f12926vm;
    public int zih;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private final AtomicBoolean f12922od = new AtomicBoolean(false);

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private int f12921cd = -1;

    private JSONObject fak() {
        JSONObject jSONObject = new JSONObject();
        int iRn = (int) this.vt.ex.rn();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, this.vt.vt.mt);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.vt.vt.xdk);
            jSONObject.put("network", ksc.ouw(getApplicationContext(), 60000L));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int i10 = this.vt.vt.f13799vi;
            String strFkw = "unKnow";
            if (i10 == 2) {
                strFkw = uoy.lh();
            } else if (i10 == 1) {
                strFkw = uoy.fkw();
            }
            jSONObject.put("user_agent", strFkw);
            JSONObject jSONObjectFak = this.vt.vt.fak();
            jSONObjectFak.put(Q6.V0, com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().vt());
            jSONObject.put("extra", jSONObjectFak);
            jSONObject.put("media_extra", this.f12923tc);
            jSONObject.put("video_duration", this.vt.vt.f13788sd.yu);
            jSONObject.put("play_start_ts", this.zih);
            jSONObject.put("play_end_ts", this.f12926vm);
            jSONObject.put("duration", iRn);
            jSONObject.put("user_id", this.ksc);
            jSONObject.put("trans_id", ex.ouw().replace("-", ""));
            return jSONObject;
        } catch (Throwable th2) {
            qbp.ouw("TTAD.RVA", "", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fvf() {
        qbp.ouw("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouwVar = this.f12924th;
        if (ouwVar != null) {
            ouwVar.onAdClicked();
        }
    }

    private void lh(long j10, long j11) {
        if (j11 <= 0) {
            return;
        }
        if (this.f12921cd == -1) {
            this.f12921cd = Math.min(100, this.vt.vt.myk);
        }
        if (((j10 / 1000.0f) / j11) * 100.0f >= this.f12921cd) {
            ko.vt("TTAD.RVA", "try verify reward 2 current " + j10 + ": duration = " + j11 + " mWatching = " + this.f12921cd);
            vt(0);
        }
    }

    public static /* synthetic */ boolean lh(TTRewardVideoActivity tTRewardVideoActivity) {
        tTRewardVideoActivity.f12925uq = true;
        return true;
    }

    public static /* synthetic */ void ouw(TTRewardVideoActivity tTRewardVideoActivity, final boolean z10, boolean z11) {
        if (!z11 && tTRewardVideoActivity.f12925uq && tTRewardVideoActivity.vt.tlj.get() && od.pno(tTRewardVideoActivity.vt.vt)) {
            tTRewardVideoActivity.vt.ksc.ra();
            return;
        }
        zih.yu();
        if (!cf.le(String.valueOf(tTRewardVideoActivity.vt.f13265le))) {
            if (!z11 && tTRewardVideoActivity.vt.tlj.get() && od.pno(tTRewardVideoActivity.vt.vt)) {
                tTRewardVideoActivity.vt.ksc.ra();
                return;
            } else if (z10) {
                tTRewardVideoActivity.finish();
                return;
            } else {
                tTRewardVideoActivity.pd();
                return;
            }
        }
        if (tTRewardVideoActivity.f12922od.get()) {
            if (tTRewardVideoActivity.vt.tlj.get() && od.pno(tTRewardVideoActivity.vt.vt)) {
                tTRewardVideoActivity.vt.ksc.ra();
                return;
            } else if (z10) {
                tTRewardVideoActivity.finish();
                return;
            } else {
                tTRewardVideoActivity.pd();
                return;
            }
        }
        if (od.pno(tTRewardVideoActivity.vt.vt) && tTRewardVideoActivity.vt.f13257bs.f13296le.getVisibility() == 0) {
            tTRewardVideoActivity.vt.ksc.ra();
            return;
        }
        tTRewardVideoActivity.vt.qbp.set(true);
        tTRewardVideoActivity.vt.ex.ryl();
        if (z10) {
            tTRewardVideoActivity.vt.ksc.yu();
        }
        final com.bytedance.sdk.openadsdk.core.widget.vt vtVar = new com.bytedance.sdk.openadsdk.core.widget.vt(tTRewardVideoActivity);
        tTRewardVideoActivity.f12880lh.mwh = vtVar;
        if (z10) {
            vtVar.ouw = zin;
            vtVar.vt = ex;
            vtVar.f14089lh = vpp;
        } else {
            vtVar.ouw = qbp;
            vtVar.vt = jqy;
            vtVar.f14089lh = vpp;
        }
        vtVar.yu = new vt.InterfaceC0247vt() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.7
            @Override // com.bytedance.sdk.openadsdk.core.widget.vt.InterfaceC0247vt
            public final void ouw() {
                TTRewardVideoActivity.this.vt.ex.cf();
                if (z10) {
                    TTRewardVideoActivity.this.vt.ksc.ouw(1000);
                }
                vtVar.dismiss();
                TTRewardVideoActivity.this.vt.qbp.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.vt.InterfaceC0247vt
            public final void vt() {
                vtVar.dismiss();
                TTRewardVideoActivity.lh(TTRewardVideoActivity.this);
                TTRewardVideoActivity.this.vt.qbp.set(false);
                TTRewardVideoActivity.this.vt.ksc.fkw();
                if (!z10 || !od.le(TTRewardVideoActivity.this.vt.vt)) {
                    TTRewardVideoActivity.this.pd();
                } else if (od.pno(TTRewardVideoActivity.this.vt.vt)) {
                    TTRewardVideoActivity.this.vt.ksc.ra();
                } else {
                    TTRewardVideoActivity.this.vt.f13258cd.lh();
                    TTRewardVideoActivity.this.finish();
                }
            }
        };
        vtVar.show();
    }

    private void ouw(String str) {
        ouw(str, false, 0, "", 0, "");
    }

    private void ouw(final String str, final boolean z10, final int i10, final String str2, final int i11, final String str3) {
        bs.fkw(new com.bytedance.sdk.component.pno.pno("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    TTRewardVideoActivity.this.ouw(0).executeRewardVideoCallback(TTRewardVideoActivity.this.vt.f13276ub, str, z10, i10, str2, i11, str3);
                } catch (Throwable th2) {
                    qbp.yu("TTAD.RVA", "rewarded_video", "executeRewardVideoCallback execute throw Exception : ", th2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(final boolean z10, final int i10, final String str, final int i11, final String str2, final int i12) {
        qbp.ouw("BVA", "invoke callback onRewardVerify: " + z10 + ", " + i10 + ", " + str + ", " + i11 + ", " + str2 + "; " + this);
        if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.8
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouwVar = TTRewardVideoActivity.this.f12924th;
                    if (ouwVar != null) {
                        ouwVar.ouw(z10, i10, str, i11, str2);
                        tlj.ouw(TTRewardVideoActivity.this.vt.vt, z10, i12);
                    }
                }
            });
        } else {
            ouw("onRewardVerify", z10, i10, str, i11, str2);
            tlj.ouw(this.vt.vt, z10, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void pd() {
        /*
            r4 = this;
            com.bytedance.sdk.openadsdk.yu.fkw.vt.ko$ouw r0 = new com.bytedance.sdk.openadsdk.yu.fkw.vt.ko$ouw
            r0.<init>()
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.vt
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            long r1 = r1.fkw()
            r0.ouw(r1)
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.vt
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            long r1 = r1.ko()
            r0.vt(r1)
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.vt
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            long r1 = r1.pno()
            r0.vt = r1
            r1 = 3
            r0.tlj = r1
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.vt
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            int r1 = r1.jg()
            r0.ryl = r1
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.vt
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            long r2 = r1.f13237jg
            r0.f14415le = r2
            com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw r1 = r1.lh()
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r2 = r4.vt
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r2 = r2.ex
            com.bytedance.sdk.openadsdk.yu.ra r2 = r2.zin
            com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(r1, r0, r2)
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.vt
            int r0 = r0.f13265le
            com.bytedance.sdk.openadsdk.core.jae.ouw(r0)
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.vt
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r0 = r0.ex
            java.lang.String r1 = "skip"
            r2 = 0
            r0.ouw(r1, r2)
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.vt
            boolean r1 = r0.f13266lh
            if (r1 == 0) goto L93
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r0.vt
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.th.lh(r0)
            r1 = 4
            r2 = 1
            if (r0 == 0) goto L7c
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.vt
            com.bytedance.sdk.openadsdk.component.reward.view.tlj r0 = r0.jae
            com.bytedance.sdk.openadsdk.component.reward.view.yu r0 = r0.ouw
            if (r0 == 0) goto L78
            int r0 = r0.yu
            if (r0 != 0) goto L78
            r4.finish()
            goto L7f
        L78:
            r4.ouw(r2, r1)
            goto L7f
        L7c:
            r4.ouw(r2, r1)
        L7f:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.vt
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r0.vt
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.th.ouw(r0)
            if (r0 == 0) goto L96
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.vt
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f13272rn
            boolean r0 = r0.get()
            if (r0 != 0) goto L96
        L93:
            r4.finish()
        L96:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.vt
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r0.vt
            com.bytedance.sdk.openadsdk.core.model.yu r0 = r0.sd()
            if (r0 == 0) goto Lb2
            com.bytedance.sdk.openadsdk.core.ryl.yu r0 = r0.ouw
            if (r0 == 0) goto Lb2
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r1 = r4.vt
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko r1 = r1.ex
            long r1 = r1.fkw()
            r0.fkw(r1)
            r0.yu(r1)
        Lb2:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r0 = r4.vt
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r0.vt
            r1 = 5
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.pd():void");
    }

    private void uoy() {
        tlj tljVar;
        if (com.bytedance.sdk.openadsdk.vpp.ouw.ra() && isChangingConfigurations()) {
            qbp.ouw("BVA", "reward callback close is invoke by config change.");
            return;
        }
        if (this.f12881ra) {
            qbp.ouw("BVA", "invoke callback onAdClose has already been called ");
            return;
        }
        this.f12881ra = true;
        qbp.ouw("BVA", "invoke callback onAdClose, ");
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f12878ko;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        vpp vppVar = ouwVar != null ? ouwVar.vt : null;
        if (vppVar != null && jElapsedRealtime > 0) {
            vppVar.vby = jElapsedRealtime;
        }
        if (vppVar != null) {
            vppVar.ybr = ouwVar.tlj.get() ? 1 : 0;
        }
        com.bytedance.sdk.openadsdk.yu.tlj.ouw(vppVar);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.vt;
        if (ouwVar2 != null && (tljVar = ouwVar2.ycd) != null) {
            tljVar.lh();
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("onAdClose");
            return;
        }
        com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouwVar3 = this.f12924th;
        if (ouwVar3 != null) {
            ouwVar3.vt();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = this.vt;
            com.bytedance.sdk.openadsdk.yu.tlj.ouw(ouwVar4 != null ? ouwVar4.vt : null, "close", false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(g.f53147u, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ey() {
        vt(2);
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.f12877cf) {
            return;
        }
        jae = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.vt != null) {
            com.bytedance.sdk.openadsdk.le.vt.ouw().ouw("videoForceBreak", this.vt.vt);
        }
        uoy();
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void jae() {
        this.f12926vm = (int) (System.currentTimeMillis() / 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void jg() {
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        super.jg();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null || (yuVar = ouwVar.jae.ouw) == null) {
            return;
        }
        yuVar.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.fkw() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.fkw
            public final void ouw() {
                TTRewardVideoActivity.this.fvf();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void jvy() {
        vt(0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void kn() {
        fvf();
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
    public final void ksc() {
        this.zih = (int) (System.currentTimeMillis() / 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void lh() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar;
        super.lh();
        if (this.f12922od.get() || (ouwVar = this.vt) == null) {
            return;
        }
        ouwVar.ycd = new tlj(new tlj.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.tlj.ouw
            public final void ouw() {
                if (TTRewardVideoActivity.this.f12922od.get() || TTRewardVideoActivity.this.f12925uq) {
                    return;
                }
                TTRewardVideoActivity.this.vt(1);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void mwh() {
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouwVar = this.f12924th;
            if (ouwVar != null) {
                ouwVar.ouw();
            } else {
                ko.vt("BVA", "performShowCallback: mRewardAdInteractionListener is null");
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.vt;
                com.bytedance.sdk.openadsdk.yu.tlj.ouw(ouwVar2 != null ? ouwVar2.vt : null, C4157n2.f33013v, false);
            }
        }
        if (jqy()) {
            this.vt.jae.le();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout od() {
        return this.vt.ey.le();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar;
        vpp vppVar;
        super.onCreate(bundle);
        try {
            if (qbp == null) {
                qbp = com.bytedance.sdk.component.utils.vpp.ouw(this, "tt_reward_msg");
                zin = com.bytedance.sdk.component.utils.vpp.ouw(this, "tt_msgPlayable");
                vpp = com.bytedance.sdk.component.utils.vpp.ouw(this, "tt_negtiveBtnBtnText");
                jqy = com.bytedance.sdk.component.utils.vpp.ouw(this, "tt_postiveBtnText");
                ex = com.bytedance.sdk.component.utils.vpp.ouw(this, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th2) {
            qbp.lh("TTAD.RVA", th2.getMessage());
        }
        if (bundle == null || (ouwVar = this.vt) == null || (vppVar = ouwVar.vt) == null || !vppVar.amr) {
            return;
        }
        this.f12922od.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        uoy();
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("recycleRes");
        }
        ouw(isFinishing(), isChangingConfigurations());
        this.f12924th = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        tlj tljVar;
        super.onPause();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null || (tljVar = ouwVar.ycd) == null) {
            return;
        }
        tljVar.ouw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        tlj tljVar;
        super.onResume();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null || (tljVar = ouwVar.ycd) == null) {
            return;
        }
        tljVar.vt();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar;
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.f12877cf) {
            jae = this.f12924th;
        }
        if (this.f12922od.get() && (ouwVar = this.vt) != null) {
            ouwVar.vt.amr = true;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void osn() {
        fvf();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void ouw(long j10, long j11) {
        int i10 = (int) (j10 / 1000);
        int iNg = this.vt.vt.ng();
        boolean z10 = iNg >= 0;
        vt(j10, j11);
        if (this.f12879le > 0) {
            this.vt.uoy.yu(true);
            if (!z10 || i10 < iNg) {
                this.vt.uoy.ouw(String.valueOf(this.f12879le), null);
                return;
            }
            this.vt.ouw(true);
            this.vt.uoy.ouw(String.valueOf(this.f12879le), TTAdDislikeToast.getSkipText());
            this.vt.uoy.fkw(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void ouw(@NonNull Intent intent) {
        super.ouw(intent);
        this.f12923tc = intent.getStringExtra("media_extra");
        this.ksc = intent.getStringExtra("user_id");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(Bundle bundle) {
        if (this.f12877cf) {
            super.ouw(bundle);
            this.f12924th = (com.bytedance.sdk.openadsdk.ouw.fkw.ouw) com.bytedance.sdk.openadsdk.core.od.ouw().ouw(this.f12876jg, com.bytedance.sdk.openadsdk.ouw.fkw.ouw.class);
        } else {
            if (!com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                this.f12924th = com.bytedance.sdk.openadsdk.core.od.ouw().vt;
            }
            if (this.f12924th == null && bundle != null) {
                this.f12924th = jae;
                jae = null;
            }
        }
        Log.e("TTAD.RVA", "initListener: listenerKey = " + this.f12876jg + ",mRewardAdInteractionListener = " + this.f12924th + ",savedInstanceState = " + bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(boolean z10) {
        if (z10) {
            vt(0);
            return;
        }
        zih.yu();
        if ((1.0d - (((double) this.f12879le) / this.vt.ex.zin())) * 100.0d >= cf.qbp(String.valueOf(this.vt.f13265le)).f14002le) {
            vt(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void pno() {
        this.vt.uoy.ouw(null, TTAdDislikeToast.getSkipText());
        this.vt.uoy.fkw(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void qbp() {
        final View viewTlj = this.vt.ey.tlj();
        if (viewTlj != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTRewardVideoActivity$5;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f53147u, view);
                    safedk_TTRewardVideoActivity$5_onClick_f3414ebfb089e371284d6c5d499ce7d7(view);
                }

                public void safedk_TTRewardVideoActivity$5_onClick_f3414ebfb089e371284d6c5d499ce7d7(View view) {
                    if (TTRewardVideoActivity.this.vt.f13257bs.cf() && TTRewardVideoActivity.this.vt.tlj.get()) {
                        boolean z10 = TTRewardVideoActivity.this.vt.fak.fkw.get();
                        TTRewardVideoActivity.this.vt.f13257bs.yu(z10);
                        TTRewardVideoActivity.this.vt.ey.le(8);
                        View view2 = viewTlj;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.le.yu) {
                            ((com.bytedance.sdk.openadsdk.core.le.yu) view2).setImageResource(com.bytedance.sdk.component.utils.vpp.yu(TTRewardVideoActivity.this.vt.hun, "tt_close_btn"));
                        }
                        TTRewardVideoActivity.this.vt.ux.sendEmptyMessageDelayed(600, 5000L);
                        if (!vpp.lh(TTRewardVideoActivity.this.vt.vt)) {
                            return;
                        }
                        if (vpp.lh(TTRewardVideoActivity.this.vt.vt) && z10) {
                            return;
                        }
                    }
                    TTRewardVideoActivity.this.vt.f13257bs.ryl();
                    TTRewardVideoActivity.this.vt.fak.fkw();
                    TTRewardVideoActivity.this.vt.f13258cd.lh();
                    if (od.yu(TTRewardVideoActivity.this.vt.vt)) {
                        TTRewardVideoActivity.ouw(TTRewardVideoActivity.this, true, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            };
            viewTlj.setOnClickListener(onClickListener);
            viewTlj.setTag(viewTlj.getId(), onClickListener);
        }
        this.vt.uoy.ouw(new com.bytedance.sdk.openadsdk.component.reward.top.vt() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.6
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void lh() {
                View view = viewTlj;
                if (view != null) {
                    view.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw() {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                TTRewardVideoActivity.ouw(tTRewardVideoActivity, od.lh(tTRewardVideoActivity.vt.vt), false);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw(String str) {
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
                com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = TTRewardVideoActivity.this.f12880lh;
                if (vtVar != null && vtVar.yu() != null) {
                    TTRewardVideoActivity.this.f12880lh.yu().ouw(TTRewardVideoActivity.this.vt.f13260cj);
                }
                TTRewardVideoActivity.this.vt.f13260cj = !r0.f13260cj;
                ko.ouw("TTAD.RVA", "rewarded_video", "will set is Mute " + TTRewardVideoActivity.this.vt.f13260cj + " mLastVolume=" + TTRewardVideoActivity.this.vt.fvf.vt);
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = TTRewardVideoActivity.this.vt;
                ouwVar.ex.ouw(ouwVar.f13260cj, str);
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = TTRewardVideoActivity.this.vt;
                ouwVar2.f13257bs.lh(ouwVar2.f13260cj);
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = TTRewardVideoActivity.this.vt;
                ouwVar3.ksc.ouw(ouwVar3.f13260cj);
                vpp vppVar = TTRewardVideoActivity.this.vt.vt;
                if (vppVar == null || (yuVarSd = vppVar.sd()) == null || (yuVar = yuVarSd.ouw) == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = TTRewardVideoActivity.this.vt;
                if (ouwVar4.f13260cj) {
                    yuVar.ra(ouwVar4.ex.fkw());
                } else {
                    yuVar.pno(ouwVar4.ex.fkw());
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void vt() {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.vt.f13270pd.ouw(tTRewardVideoActivity.f12880lh);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void yu() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void tc() {
        vt(0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void vm() {
        vt(0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean vpp() {
        return false;
    }

    public final void vt(final int i10) {
        if (this.f12922od.get() || this.f12925uq) {
            return;
        }
        this.f12922od.set(true);
        tlj tljVar = this.vt.ycd;
        if (tljVar != null) {
            tljVar.ouw = true;
        }
        zih.yu();
        boolean zCf = cf.cf(String.valueOf(this.vt.f13265le));
        ko.vt("TTAD.RVA", "verifyRewardVideo: dir=".concat(String.valueOf(zCf)));
        if (zCf) {
            vpp vppVar = this.vt.vt;
            ouw(true, vppVar.xdk, vppVar.mt, 0, "", i10);
        } else {
            zih.lh().ouw(fak(), new vpp.vt() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.9
                @Override // com.bytedance.sdk.openadsdk.core.vpp.vt
                public final void ouw(int i11, String str) {
                    ko.vt("TTAD.RVA", "onError: " + i11 + ", " + str);
                    TTRewardVideoActivity.this.ouw(false, 0, "", i11, str, i10);
                }

                @Override // com.bytedance.sdk.openadsdk.core.vpp.vt
                public final void ouw(jqy.vt vtVar) {
                    ko.vt("TTAD.RVA", "onVerify: " + vtVar.vt);
                    fvf fvfVar = vtVar.f13601lh;
                    TTRewardVideoActivity.this.ouw(vtVar.vt, fvfVar.f13662lh, fvfVar.yu, 0, "", i10);
                }
            });
        }
    }

    public final void vt(long j10, long j11) {
        boolean z10;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar != null) {
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar = ouwVar.vt;
            z10 = vppVar.myk >= 0 && vppVar.fwd() >= 0;
            if (z10) {
                j11 = this.vt.vt.fwd();
            }
        } else {
            z10 = false;
        }
        long j12 = j10 + (((long) this.vt.f13281wp) * 1000);
        if (z10) {
            lh(j12, j11);
            return;
        }
        if (this.f12921cd == -1) {
            zih.yu();
            this.f12921cd = cf.qbp(String.valueOf(this.vt.f13265le)).f14002le;
        }
        if (j11 <= 0) {
            return;
        }
        if (j11 >= 30000 && j12 >= 27000) {
            ko.vt("TTAD.RVA", "try verify reward 1");
            vt(0);
        } else if ((j12 * 100) / j11 >= this.f12921cd) {
            ko.vt("TTAD.RVA", "try verify reward 2");
            vt(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final com.bytedance.sdk.openadsdk.common.zih yu() {
        return new com.bytedance.sdk.openadsdk.common.zih(this.vt) { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.2
            @Override // com.bytedance.sdk.openadsdk.common.zih
            public final boolean lh() {
                return TTRewardVideoActivity.this.f12922od.get();
            }

            @Override // com.bytedance.sdk.openadsdk.common.zih
            public final void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
                com.bytedance.sdk.openadsdk.common.ouw.ouw(ouwVar, new ouw.vt() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.2.1
                    @Override // com.bytedance.sdk.openadsdk.common.ouw.vt
                    public final void ouw() {
                        TTRewardVideoActivity.this.ouw(true, 4);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.ouw.vt
                    public final void vt() {
                        TTRewardVideoActivity.this.finish();
                    }
                });
            }

            @Override // com.bytedance.sdk.openadsdk.common.zih
            public final boolean ouw() {
                return TTRewardVideoActivity.this.f12925uq;
            }

            @Override // com.bytedance.sdk.openadsdk.common.zih
            public final void vt() {
                TTRewardVideoActivity.lh(TTRewardVideoActivity.this);
            }

            @Override // com.bytedance.sdk.openadsdk.common.zih
            public final void yu() {
                TTRewardVideoActivity.this.finish();
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final boolean zin() {
        return true;
    }
}
