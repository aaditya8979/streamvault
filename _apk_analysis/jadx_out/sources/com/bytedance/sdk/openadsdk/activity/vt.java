package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.component.reward.ouw.cf;
import com.bytedance.sdk.openadsdk.component.reward.ryl;
import com.bytedance.sdk.openadsdk.component.reward.tlj;
import com.bytedance.sdk.openadsdk.core.model.cd;
import com.bytedance.sdk.openadsdk.core.model.ex;
import com.bytedance.sdk.openadsdk.core.model.jqy;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.ironsource.C3978d4;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class vt {
    public static com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouw;
    public static com.bytedance.sdk.openadsdk.ouw.lh.vt vt;
    public final boolean bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public final boolean f13000cf;
    public final com.bytedance.sdk.openadsdk.mwh.bly fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public Bundle f13001jg;
    private final boolean jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public boolean f13002ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public tlj f13003le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final vpp f13004lh;
    public int mwh;
    public com.bytedance.sdk.openadsdk.ouw.lh.vt pno;
    public boolean qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.ouw.fkw.ouw f13005ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public boolean f13006rn;
    public Activity ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public boolean f13007th;
    public com.bytedance.sdk.openadsdk.activity.lh tlj;
    public final boolean vpp;
    public Runnable zih;
    public final boolean zin;
    public final Bundle yu = new Bundle();

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public final cf.vt f13008vm = new cf.vt();

    public static class fkw {
        public boolean fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw f13014lh;
        public final Bundle ouw = new Bundle();
        public final int vt;
        public boolean yu;

        public fkw(int i10, com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
            this.vt = i10;
            this.f13014lh = ouwVar;
        }

        public final String toString() {
            return super.toString();
        }
    }

    public static class lh implements Runnable {
        private final vpp ouw;

        public lh(vpp vppVar) {
            this.ouw = vppVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            vpp vppVar = this.ouw;
            if (vppVar.f13804zn) {
                return;
            }
            if (vppVar.ey()) {
                ryl.ouw(zih.ouw()).ouw(this.ouw.yiz);
            } else {
                com.bytedance.sdk.openadsdk.component.reward.fkw.ouw(zih.ouw()).ouw(this.ouw.yiz);
            }
        }
    }

    public static class ouw extends AbstractC0212vt {
        public ouw(vt vtVar, vpp vppVar, com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar) {
            super(vtVar, vppVar, lhVar);
        }

        @Override // com.bytedance.sdk.openadsdk.activity.vt.AbstractC0212vt
        public final int ouw(vpp vppVar) {
            ex exVar;
            if (vppVar != null) {
                com.bytedance.sdk.openadsdk.core.model.ouw ouwVar = vppVar.f13800vm;
                if (ouwVar != null && (exVar = ouwVar.f13699le) != null) {
                    return exVar.f13653le;
                }
                String strValueOf = null;
                AdSlot adSlot = vppVar.yiz;
                if (adSlot != null) {
                    strValueOf = adSlot.getCodeId();
                } else {
                    int iFqk = vppVar.fqk();
                    if (iFqk != 0) {
                        strValueOf = String.valueOf(iFqk);
                    }
                }
                if (strValueOf != null) {
                    zih.yu();
                    return com.bytedance.sdk.openadsdk.core.settings.cf.jg(strValueOf);
                }
            }
            return 5;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.vt$vt, reason: collision with other inner class name */
    public static abstract class AbstractC0212vt implements Handler.Callback {

        /* JADX INFO: renamed from: bs, reason: collision with root package name */
        private int f13015bs;

        /* JADX INFO: renamed from: cd, reason: collision with root package name */
        private int f13016cd;

        /* JADX INFO: renamed from: cf, reason: collision with root package name */
        public int f13017cf;
        private boolean ey;
        public int fkw;
        private int fqk;
        private boolean fvf;
        private int hun;
        private boolean jae;

        /* JADX INFO: renamed from: jg, reason: collision with root package name */
        public int f13018jg;
        private final Context jqy;
        private boolean jvy;

        /* JADX INFO: renamed from: ko, reason: collision with root package name */
        public boolean f13019ko;
        private boolean ksc;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public int f13020le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public float f13021lh;
        private boolean lso;
        public int mwh;

        /* JADX INFO: renamed from: od, reason: collision with root package name */
        private boolean f13022od;
        private int osn;
        public final vt ouw;

        /* JADX INFO: renamed from: pd, reason: collision with root package name */
        private int f13023pd;
        public float pno;
        public boolean qbp;
        private boolean rrs;
        public int ryl;

        /* JADX INFO: renamed from: tc, reason: collision with root package name */
        private boolean f13026tc;

        /* JADX INFO: renamed from: th, reason: collision with root package name */
        public boolean f13027th;
        public int tlj;
        private int uoy;

        /* JADX INFO: renamed from: uq, reason: collision with root package name */
        private boolean f13028uq;
        private int ux;

        /* JADX INFO: renamed from: vm, reason: collision with root package name */
        public int f13029vm;
        private final com.bytedance.sdk.openadsdk.component.reward.top.lh vpp;
        public vpp vt;
        public int yu;
        private final Handler zin = new Handler(Looper.getMainLooper(), this);
        private final int ex = 1000;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public int f13024ra = -1;
        public int bly = 1000;
        private boolean fak = false;

        /* JADX INFO: renamed from: rn, reason: collision with root package name */
        public boolean f13025rn = false;
        public int zih = -1;

        public AbstractC0212vt(vt vtVar, vpp vppVar, com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar) {
            this.ouw = vtVar;
            this.vt = vppVar;
            this.vpp = lhVar;
            this.jqy = lhVar.getContext();
            this.yu = ouw(vppVar);
        }

        private void bly() {
            ko.vt("TTAD.AdSceneManager", "sendPlayableCountDownMessage: startPlayableCountDown=" + this.lso + ",isPlayableLoadingDismiss=" + this.f13028uq + ",isHappenInteraction=" + this.f13019ko);
            if (this.lso) {
                this.f13020le = 4;
                ouw(4, 1000);
            }
        }

        private void cf() {
            if (this.f13028uq && this.lso) {
                if (this.jae) {
                    this.lso = false;
                }
                if (this.fvf) {
                    return;
                }
                ko.vt("TTAD.AdSceneManager", "onPlayableCountDown: playableCountDown=" + this.f13023pd + ",isPlayableLoadingDismiss=" + this.f13028uq + ",isHappenInteraction=" + this.f13019ko + ",isLastAd=" + this.fvf);
                int i10 = this.f13023pd + 1;
                this.f13023pd = i10;
                if (this.f13019ko) {
                    this.mwh = this.ryl;
                } else {
                    this.mwh = this.tlj + this.f13017cf;
                }
                if (i10 >= this.tlj) {
                    if (!this.f13025rn) {
                        this.f13015bs++;
                        this.f13025rn = true;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("click_countdown_remaining", this.yu);
                            jSONObject.put("hint_sequence", this.f13015bs);
                            com.bytedance.sdk.openadsdk.yu.lh.yu(this.vt, this.ouw.tlj.cf().e_(), jSONObject);
                        } catch (Throwable unused) {
                        }
                    }
                    com.bytedance.sdk.openadsdk.activity.lh lhVar = this.ouw.tlj;
                    int i11 = this.f13018jg;
                    this.f13018jg = i11 - 1;
                    lhVar.ouw(i11, this.yu);
                    ko.vt("TTAD.AdSceneManager", "wait tips show time = " + this.f13018jg + ",hitSequence =" + this.f13015bs + ",hasHitSequenceAssigned=" + this.f13025rn);
                } else {
                    this.f13025rn = false;
                    this.ouw.tlj.ouw(-1, this.yu);
                }
                if (this.f13019ko && this.f13023pd >= this.f13016cd) {
                    ko.vt("TTAD.AdSceneManager", "next ad  show  = " + this.f13023pd + ",hasShowSkip=" + this.ksc + ",hasShowClose=" + this.jae);
                    if (!this.ksc && !this.jae) {
                        this.vpp.setShowPlayableNextAd(true, this.vt);
                    }
                }
                if (this.f13023pd >= this.mwh) {
                    ko.vt("TTAD.AdSceneManager", "prepare skip to next  ad " + this.f13018jg);
                    if (this.ouw.tlj.cf() != null) {
                        pno pnoVarCf = this.ouw.tlj.cf();
                        if (pnoVarCf instanceof com.bytedance.sdk.openadsdk.activity.fkw) {
                            this.zin.removeMessages(4);
                            ((com.bytedance.sdk.openadsdk.activity.fkw) pnoVarCf).tc();
                        }
                    }
                }
            }
        }

        private void jg() {
            ko.vt("TTAD.AdSceneManager", "onLandingPageCountDownForDialogStyle: lastInteractionTime=" + this.f13029vm + ",showAfterInactivityMs=" + this.fqk + ",hasShowDialog=" + this.qbp + ",popupCount =" + this.ux + ",maxTime =" + this.hun);
            if (this.f13029vm < this.fqk || this.qbp) {
                return;
            }
            int i10 = this.ux;
            if (i10 >= this.hun) {
                this.f13027th = false;
            } else {
                this.ux = i10 + 1;
                ko();
            }
        }

        private void ko() {
            pno pnoVarCf;
            this.qbp = true;
            this.f13029vm = 0;
            vt vtVar = this.ouw;
            if (vtVar == null || (pnoVarCf = vtVar.tlj.cf()) == null || pnoVarCf.ucs()) {
                return;
            }
            mwh();
        }

        private void mwh() {
            com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
            if (this.fvf || this.ksc || this.jae || (lhVar = this.vpp) == null) {
                return;
            }
            lhVar.setShowEndCardNextAd(true, this.vt);
        }

        private void ouw(int i10, int i11) {
            if (!this.fak) {
                this.zin.removeMessages(i10);
                this.zin.sendEmptyMessageDelayed(i10, i11);
            } else {
                ko.vt("TTAD.AdSceneManager", "sendNextMessageDelayInterval: isPause=" + this.fak);
            }
        }

        private void ouw(@NonNull Message message) {
            int i10 = this.yu;
            if (i10 <= 0) {
                pno();
                bly();
                ouw(true);
                tlj();
                return;
            }
            int i11 = this.fkw;
            int i12 = (int) ((((double) (i11 - i10)) * 100.0d) / ((double) i11));
            com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = this.vpp;
            StringBuilder sb2 = new StringBuilder();
            int i13 = this.yu;
            this.yu = i13 - 1;
            sb2.append(i13);
            sb2.append("s");
            lhVar.setCountDownFor1InN(sb2.toString(), i12);
            ra();
            cf();
            if (this.yu >= 0) {
                ouw(message.what, this.bly);
            }
            ryl();
        }

        private void ouw(boolean z10) {
            if (this.f13027th) {
                this.f13020le = 5;
                if (z10) {
                    ouw(5, 1000);
                } else {
                    this.zin.sendEmptyMessage(5);
                }
            }
        }

        private void pno() {
            if (this.f13024ra <= 0 || !this.f13022od) {
                return;
            }
            this.f13020le = 3;
            ouw(3, 1000);
        }

        private void ra() {
            int i10 = this.f13024ra;
            if (i10 > 0) {
                this.f13024ra = i10 - 1;
                ko.vt("TTAD.AdSceneManager", "onEndCardCountDownloadFinish: ,endCardTime " + this.f13024ra);
            }
            if (this.f13024ra == 0 && this.f13022od) {
                this.f13022od = false;
                vt vtVar = this.ouw;
                if (vtVar == null || vtVar.tlj.cf() == null) {
                    return;
                }
                pno pnoVarCf = this.ouw.tlj.cf();
                if (pnoVarCf instanceof com.bytedance.sdk.openadsdk.activity.fkw) {
                    ((com.bytedance.sdk.openadsdk.activity.fkw) pnoVarCf).tc();
                }
            }
        }

        private void ryl() {
            if (this.f13028uq && this.f13027th && !this.fvf) {
                ko.vt("TTAD.AdSceneManager", "onCountDownLPStart: countDownNew=" + this.uoy + ",lastInteractionTime=" + this.f13029vm + ",countDown=" + this.yu + ",isHappenInteraction =" + this.f13019ko);
                int i10 = this.uoy + 1;
                this.uoy = i10;
                this.f13029vm = this.f13029vm + 1;
                if (this.f13019ko && i10 >= this.osn) {
                    mwh();
                }
                if (this.rrs || this.ey) {
                    jg();
                }
            }
        }

        private void tlj() {
            if (this.ouw.tlj.yu()) {
                this.vpp.showSkipButton();
                this.ksc = true;
            } else {
                this.jae = true;
                this.vpp.showCloseButton();
            }
            this.vpp.setShowPlayableNextAd(false, this.vt);
            ko.vt("TTAD.AdSceneManager", "onCountDownFinish: hasShowSkip=" + this.ksc + ", hasShowClose=" + this.jae);
        }

        public final void fkw() {
            ko.vt("TTAD.AdSceneManager", "onPlaybleLoadingDismiss countDownload =" + this.yu + ",waitTipsTime=" + this.tlj + ",changeToNextTime=" + this.f13017cf + ",nextAdTipsShowTime=" + this.f13016cd + ",maxShowTime=" + this.ryl);
            this.f13028uq = true;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i10 = message.what;
            if (i10 == 1 || i10 == 2) {
                ouw(message);
            } else if (i10 == 3) {
                if (this.f13024ra > 0) {
                    ra();
                    if (this.f13024ra >= 0) {
                        ouw(message.what, 1000);
                    }
                }
            } else if (i10 == 4) {
                if (this.lso) {
                    cf();
                    if (this.lso && !this.fvf) {
                        ouw(message.what, 1000);
                    }
                }
            } else if (i10 == 5 && this.f13027th) {
                ryl();
                if (this.f13027th && !this.fvf) {
                    ouw(message.what, 1000);
                }
            }
            return true;
        }

        public final void le() {
            ko.vt("TTAD.AdSceneManager", "onDialogHide: ");
            if (this.f13027th) {
                mwh();
                this.qbp = false;
            }
        }

        public final void lh() {
            this.zin.removeMessages(this.f13020le);
        }

        public final void lh(int i10) {
            this.f13024ra = i10;
            if (i10 > 0) {
                this.f13022od = true;
                if (this.yu <= 0 || this.ksc) {
                    pno();
                }
            }
        }

        public final int ouw() {
            return this.yu;
        }

        public abstract int ouw(vpp vppVar);

        public final void ouw(int i10) {
            ko.vt("TTAD.AdSceneManager", "pause: " + this.yu + ",hasShowSkip =" + this.ksc + ",hasShowClose=" + this.jae + ",msgType =" + this.f13020le + ",playState=" + i10);
            if (i10 != -1) {
                this.zih = i10;
            }
            this.zin.removeMessages(this.f13020le);
        }

        public void ouw(int i10, vpp vppVar) {
            cd cdVar;
            if (vppVar != null && (cdVar = vppVar.f13793tj) != null) {
                this.pno = cdVar.ouw;
                this.vt = vppVar;
            }
            ko.vt("TTAD.AdSceneManager", "onSceneChanged: newTotalVideoDuration=" + i10 + ", countDownSeconds=" + this.yu + ", hasShowSkip=" + this.ksc + ", hasShowClose=" + this.jae + ", msgType=" + this.f13020le);
            if (this.ksc || this.jae) {
                return;
            }
            float f10 = i10;
            this.f13021lh = f10;
            int i11 = this.f13020le;
            if (f10 <= this.yu) {
                this.f13020le = 2;
                this.yu = (int) f10;
            } else if (i11 == 0) {
                this.f13020le = 1;
            }
            if (!this.f13026tc) {
                this.fkw = this.yu;
                this.f13026tc = true;
            }
            int i12 = this.f13020le;
            if (i11 == i12 && this.zin.hasMessages(i12)) {
                return;
            }
            this.zin.removeCallbacksAndMessages(null);
            this.zin.sendEmptyMessage(this.f13020le);
        }

        public final void ouw(pno pnoVar) {
            vpp vppVar;
            jqy jqyVar;
            if (pnoVar == null || (vppVar = pnoVar.f12988le) == null || (jqyVar = vppVar.f13765jg) == null) {
                return;
            }
            this.osn = jqyVar.f13667lh;
            this.fvf = pnoVar.zih;
            this.hun = jqyVar.ouw;
            this.jvy = pnoVar.f12990rn;
            this.fqk = jqyVar.vt;
            this.ey = th.le(vppVar);
            this.rrs = th.fkw(pnoVar.f12988le);
            this.f13027th = true;
            if ((this.yu <= 0 || this.ksc) && !this.zin.hasMessages(5)) {
                ouw(false);
            }
        }

        public final void ouw(vpp vppVar, boolean z10) {
            this.tlj = od.mwh(vppVar);
            this.f13017cf = od.rn(vppVar);
            od odVarOuw = od.ouw(vppVar);
            this.f13016cd = odVarOuw == null ? 0 : odVarOuw.f13691jg;
            od odVarOuw2 = od.ouw(vppVar);
            this.ryl = odVarOuw2 == null ? 0 : odVarOuw2.f13692ko;
            this.f13018jg = this.f13017cf;
            this.f13028uq = false;
            this.f13019ko = false;
            this.f13023pd = 0;
            this.lso = true;
            com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = this.vpp;
            if (lhVar != null) {
                lhVar.setShowPlayableNextAd(false, vppVar);
            }
            this.fvf = z10;
            if (this.yu <= 0 || this.ksc) {
                bly();
            }
            ko.vt("TTAD.AdSceneManager", "onCountDownPlayable: waitTipsTime=" + this.tlj + ",changeToNextTime=" + this.f13017cf + ",nextAdTipsShowTime=" + this.f13016cd + ",maxShowTime=" + this.ryl);
        }

        public final void vt() {
            this.lso = false;
            this.f13027th = false;
            this.f13025rn = false;
            this.f13015bs = 0;
            this.zih = -1;
            this.qbp = false;
            this.hun = 0;
            this.f13029vm = 0;
            this.uoy = 0;
            this.f13019ko = false;
            this.ux = 0;
            this.fak = false;
            com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = this.vpp;
            if (lhVar != null) {
                lhVar.setShowPlayableNextAd(false, this.vt);
            }
            ko.vt("TTAD.AdSceneManager", "resetPlayableStatus: lastPlayState=" + this.zih);
        }

        public final void vt(int i10) {
            if (this.zih == 2 && i10 != 1) {
                ko.vt("TTAD.AdSceneManager", "resume: pause by state is pause ,but resume is not by play");
                return;
            }
            if (i10 != -1) {
                this.zih = i10;
            }
            if (this.zin.hasMessages(this.f13020le)) {
                ko.vt("TTAD.AdSceneManager", "resume: has already msgType =" + this.f13020le);
                return;
            }
            if (this.fak) {
                ko.vt("TTAD.AdSceneManager", "resume: pause by endcard show,need not resume ");
                return;
            }
            vt vtVar = this.ouw;
            if (vtVar == null || vtVar.tlj.cf() == null || this.ouw.tlj.cf().ksc() == null || !this.ouw.tlj.cf().ksc().f13259cf.get()) {
                ko.vt("TTAD.AdSceneManager", "resume: countDownSeconds =" + this.yu + ",hasShowSkip =" + this.ksc + ",newState=" + i10 + ",msgType =" + this.f13020le + ",lastPlayState =" + this.zih);
                int i11 = this.f13020le;
                if (i11 == 1 || i11 == 2) {
                    if (this.yu < 0 || this.ksc || this.jae) {
                        return;
                    }
                    this.zin.sendEmptyMessageDelayed(i11, this.bly);
                    return;
                }
                if (i11 == 3) {
                    pno();
                } else if (i11 == 4) {
                    bly();
                } else if (i11 == 5) {
                    ouw(true);
                }
            }
        }

        public final void yu() {
            if (this.ksc || this.jae) {
                return;
            }
            ouw(-1);
            this.fak = true;
            com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = this.vpp;
            if (lhVar != null) {
                lhVar.setCountDownFor1InN("", -1);
                this.vpp.setShowEndCardNextAd(true, this.vt);
            }
        }
    }

    public static class yu extends AbstractC0212vt {
        private boolean jqy;
        private int vpp;
        private final int zin;

        public yu(vt vtVar, vpp vppVar, com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar) {
            super(vtVar, vppVar, lhVar);
            if (vppVar == null) {
                this.zin = 100;
                return;
            }
            int i10 = vppVar.myk;
            if (i10 >= 0) {
                this.zin = Math.min(100, i10);
            } else {
                zih.yu();
                this.zin = com.bytedance.sdk.openadsdk.core.settings.cf.qbp(String.valueOf(vppVar.fqk())).f14002le;
            }
        }

        @Override // com.bytedance.sdk.openadsdk.activity.vt.AbstractC0212vt, android.os.Handler.Callback
        public final boolean handleMessage(@NonNull Message message) {
            if (!this.jqy && this.yu <= this.vpp) {
                this.jqy = true;
                pno pnoVarCf = this.ouw.tlj.cf();
                if (pnoVarCf != null) {
                    pnoVarCf.ub();
                }
            }
            super.handleMessage(message);
            return true;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.vt.AbstractC0212vt
        public final int ouw(vpp vppVar) {
            ex exVar;
            if (vppVar != null) {
                com.bytedance.sdk.openadsdk.core.model.ouw ouwVar = vppVar.f13800vm;
                if (ouwVar != null && (exVar = ouwVar.f13699le) != null) {
                    return exVar.f13653le;
                }
                String strValueOf = null;
                AdSlot adSlot = vppVar.yiz;
                if (adSlot != null) {
                    strValueOf = adSlot.getCodeId();
                } else {
                    int iFqk = vppVar.fqk();
                    if (iFqk != 0) {
                        strValueOf = String.valueOf(iFqk);
                    }
                }
                if (strValueOf != null) {
                    zih.yu();
                    return com.bytedance.sdk.openadsdk.core.settings.cf.qbp(strValueOf).ryl;
                }
            }
            return 30;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.vt.AbstractC0212vt
        public final void ouw(int i10, vpp vppVar) {
            boolean z10 = this.f13020le == 0;
            int i11 = this.yu;
            super.ouw(i10, vppVar);
            if (!z10) {
                if (this.f13021lh < i11) {
                    this.vpp = (int) ((1.0f - (this.zin / 100.0f)) * this.yu);
                    return;
                }
                return;
            }
            if (this.f13020le == 1) {
                this.vpp = 3;
            } else {
                this.vpp = (int) ((1.0f - (this.zin / 100.0f)) * this.f13021lh);
            }
            tlj tljVar = this.ouw.f13003le;
            if (tljVar != null) {
                tljVar.ouw(this.yu);
            }
        }
    }

    public vt(Activity activity, vpp vppVar, boolean z10) {
        this.f13004lh = vppVar;
        this.qbp = z10;
        this.ryl = activity;
        boolean zBly = com.bytedance.sdk.openadsdk.vpp.ouw.bly();
        this.vpp = zBly;
        qbp.ouw("BVA", "AdSceneManager() called with: enableIvRvTopBarNewArch = [" + zBly + C3978d4.j.f31385e);
        this.fkw = new com.bytedance.sdk.openadsdk.mwh.bly(activity.getApplicationContext());
        boolean z11 = vppVar.tpk;
        this.bly = z11;
        this.jqy = z11 && 39 == vppVar.fvf;
        this.f13000cf = z11 && 40 == vppVar.fvf;
        int i10 = vppVar.fvf;
        if (i10 == 43 || i10 == 44) {
            this.tlj = new com.bytedance.sdk.openadsdk.activity.yu(this.ryl, vppVar, this);
        } else {
            this.tlj = new bly(this.ryl, vppVar, this);
        }
        boolean z12 = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("adapt_decor_size", 0) == 1;
        this.zin = z12;
        qbp.ouw("BVA", "scene manager isAdaptDecorSize =" + z12);
        this.tlj.ouw();
        if (vppVar.ey()) {
            this.f13003le = new tlj(new tlj.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.vt.1
                @Override // com.bytedance.sdk.openadsdk.component.reward.tlj.ouw
                public final void ouw() {
                    pno pnoVarCf;
                    if (vt.this.yu.getBoolean("reward_verify", false)) {
                        return;
                    }
                    vt vtVar = vt.this;
                    if (vtVar.f13006rn || vtVar.yu.getBoolean("user_has_give_up_reward", false) || (pnoVarCf = vt.this.tlj.cf()) == null) {
                        return;
                    }
                    pnoVarCf.lh(1);
                }
            });
        }
    }

    public final void fkw() {
        this.f13002ko = true;
        this.tlj.rn();
    }

    public final Activity lh() {
        com.bytedance.sdk.openadsdk.activity.lh lhVar = this.tlj;
        return lhVar == null ? this.ryl : lhVar.ouw;
    }

    public final void lh(pno pnoVar) {
        pnoVar.ouw(this.ryl, this.f13001jg);
        int i10 = this.mwh;
        if (i10 == 2) {
            pnoVar.mwh();
            return;
        }
        if (i10 == 3) {
            pnoVar.mwh();
            pnoVar.lh();
            pnoVar.vt(true);
        } else if (i10 == 4) {
            pnoVar.vt(false);
            pnoVar.jg();
        } else {
            if (i10 != 5) {
                return;
            }
            pnoVar.yu();
        }
    }

    public final void ouw(int i10) {
        this.tlj.ouw(i10);
    }

    public final void ouw(View view) {
        this.tlj.ouw(view);
    }

    public final void ouw(View view, boolean z10) {
        this.tlj.ouw(view, z10);
    }

    public final void ouw(pno pnoVar) {
        com.bytedance.sdk.openadsdk.activity.lh lhVar = this.tlj;
        if (lhVar == null) {
            return;
        }
        lhVar.ouw(pnoVar);
    }

    public final void ouw(pno pnoVar, int i10) {
        this.tlj.vt(pnoVar, i10);
    }

    public final void ouw(pno pnoVar, fkw fkwVar) {
        this.tlj.ouw(pnoVar, null, fkwVar);
    }

    public final void ouw(final pno pnoVar, final boolean z10, final int i10, final String str, final int i11, final String str2) {
        Activity activity;
        if (!this.f13002ko) {
            this.zih = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.vt.2
                @Override // java.lang.Runnable
                public final void run() {
                    vt.this.ouw(pnoVar, z10, i10, str, i11, str2);
                }
            };
            return;
        }
        if (this.f13006rn) {
            return;
        }
        this.f13006rn = true;
        tlj tljVar = this.f13003le;
        if (tljVar != null) {
            tljVar.ouw = true;
        }
        if (this.f13005ra == null || (activity = this.ryl) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.vt.3
            @Override // java.lang.Runnable
            public final void run() {
                vt.this.f13005ra.ouw(z10, i10, str, i11, str2);
            }
        });
        if (this.bly) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), pnoVar.f12988le, pnoVar.e_(), z10 ? "reward_success" : "reward_fail");
        }
    }

    public final void ouw(pno pnoVar, boolean z10, boolean z11, boolean z12, int i10) {
        this.tlj.ouw(pnoVar, z10, z11, z12, i10);
    }

    public final boolean ouw() {
        if (this.f13004lh != null && this.bly) {
            return this.jqy || this.f13000cf;
        }
        return false;
    }

    public final void vt() {
        Activity activity = this.ryl;
        if (activity != null) {
            activity.finish();
        }
    }

    public final void vt(pno pnoVar) {
        com.bytedance.sdk.openadsdk.activity.lh lhVar = this.tlj;
        if (lhVar == null) {
            return;
        }
        lhVar.ouw(pnoVar, true);
    }

    public final void vt(pno pnoVar, fkw fkwVar) {
        this.tlj.ouw(pnoVar, fkwVar);
    }

    public final void yu() {
        com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouwVar = this.f13005ra;
        if (ouwVar != null) {
            ouwVar.onAdClicked();
            return;
        }
        com.bytedance.sdk.openadsdk.ouw.lh.vt vtVar = this.pno;
        if (vtVar != null) {
            vtVar.onAdClicked();
        }
    }
}
