package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.zin.ouw.ouw;

/* JADX INFO: loaded from: classes10.dex */
public final class ra extends bly implements Handler.Callback {
    private int ex;
    public int fkw;
    private int jae;
    private int jqy;
    private int ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public boolean f13284le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f13285lh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private boolean f13286od;
    public boolean ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f13287ra;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private boolean f13288tc;
    private boolean vpp;
    public long vt;
    public int yu;
    private final Handler zin;

    public ra(ouw ouwVar) {
        super(ouwVar);
        this.zin = new Handler(this);
        this.ouw = false;
        this.vt = 0L;
        this.f13285lh = 0;
        this.yu = 0;
        this.fkw = 0;
        this.f13284le = false;
        this.vpp = false;
        this.jqy = 0;
        this.f13288tc = false;
        this.ksc = 0;
        this.jae = 0;
        this.f13286od = false;
        od odVarOuw = od.ouw(this.tlj);
        this.f13287ra = odVarOuw == null ? 0 : odVarOuw.f13690cf;
        this.yu = this.tlj.od();
        int iNjr = this.tlj.njr();
        this.fkw = iNjr;
        this.ksc = Math.max(0, this.yu - iNjr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jg() {
        int i10 = !this.f13288tc ? this.fkw - this.f13285lh : this.fkw + this.jae;
        com.bytedance.sdk.openadsdk.core.zih.yu();
        int i11 = com.bytedance.sdk.openadsdk.core.settings.cf.qbp(String.valueOf(this.ryl.f13265le)).f14002le;
        int i12 = this.yu;
        boolean z10 = false;
        boolean z11 = i12 <= 0 || (((float) i10) / ((float) i12)) * 100.0f >= ((float) i11);
        com.bytedance.sdk.openadsdk.core.zih.yu();
        int iOuw = com.bytedance.sdk.openadsdk.core.settings.cf.ouw(String.valueOf(this.ryl.f13265le));
        com.bytedance.sdk.component.utils.ko.vt("RVIVPlayableNewManager", "tryRewardVerifyByOnlyPlayable: isPlayableWatchingRateOk = " + z11 + ",playedSecond =" + i10 + ",watchingRate =" + i11 + ",playableRewardType =" + iOuw);
        if (iOuw == 0) {
            com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.f13226vm;
            boolean zFkw = ouwVar != null ? ouwVar.fkw() : false;
            if (this.f13223ko) {
                zFkw = true;
            }
            if (z11 && zFkw) {
                z10 = true;
            }
        } else if (iOuw == 1) {
            z10 = z11;
        }
        if (z10) {
            this.ryl.fqk.ouw(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vt(int i10) {
        ouw(this.fkw);
        if (this.vpp) {
            return;
        }
        Handler handler = this.zin;
        handler.sendMessage(handler.obtainMessage(TypedValues.Custom.TYPE_INT, this.fkw, i10));
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final boolean bly() {
        return this.f13284le;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void fkw() {
        if (this.f13222jg) {
            super.fkw();
            pno();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r9) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ouw.ra.handleMessage(android.os.Message):boolean");
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void le() {
        if (this.f13222jg && !this.f13224rn) {
            super.le();
            this.zin.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void lh() {
        int i10;
        if (this.f13222jg) {
            boolean z10 = true;
            this.pno = true;
            com.bytedance.sdk.component.utils.ko.vt("RVIVPlayableNewManager", "showPlayable,countDownShowType =" + this.f13287ra + ",mPlayableDurationTime =" + this.yu + ",mPlayableCloseTime=" + this.fkw);
            if (this.ryl.euf || (1 != (i10 = this.f13287ra) && 2 != i10)) {
                z10 = false;
            }
            if (z10) {
                this.f13226vm.f14557rn = new ouw.InterfaceC0270ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.ra.2
                    @Override // com.bytedance.sdk.openadsdk.zin.ouw.ouw.InterfaceC0270ouw
                    public final void ouw(int i11) {
                        if (ra.this.f13286od) {
                            return;
                        }
                        ra.this.jqy = i11;
                        ra raVar = ra.this;
                        raVar.f13226vm.f14557rn = null;
                        raVar.vt(i11);
                    }
                };
            }
            this.f13226vm.ouw();
            if (od.pno(this.tlj)) {
                this.ryl.f13257bs.vt();
            }
            this.vt = System.currentTimeMillis();
            if (!z10) {
                vt(0);
            }
            this.ryl.fqk.zih();
            com.bytedance.sdk.openadsdk.component.reward.tlj tljVar = this.ryl.ycd;
            if (tljVar != null) {
                tljVar.ouw(this.yu);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void ouw() {
        if (this.f13222jg && !this.mwh) {
            super.ouw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void ouw(int i10) {
        this.f13285lh = i10;
        this.ex = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void ouw(long j10) {
        if (this.f13222jg && this.pno && !this.ryl.f13259cf.get() && this.vpp) {
            this.vpp = false;
            Message messageObtain = Message.obtain();
            messageObtain.what = TypedValues.Custom.TYPE_INT;
            messageObtain.arg1 = this.f13285lh;
            messageObtain.arg2 = this.jqy;
            this.zin.sendMessageDelayed(messageObtain, j10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void ouw(boolean z10) {
        AdSlot adSlot;
        com.bytedance.sdk.openadsdk.zin.ouw.vt vtVar;
        if (this.zih != null) {
            try {
                com.bytedance.sdk.openadsdk.zin.ouw.yu yuVarOuw = com.bytedance.sdk.openadsdk.zin.ouw.yu.ouw();
                vpp vppVar = this.tlj;
                FrameLayout frameLayout = this.zih;
                com.bytedance.sdk.openadsdk.mwh.le leVarVt = vt();
                com.bytedance.sdk.openadsdk.zin.ouw.vt vtVar2 = null;
                if (yuVarOuw.vt() && (adSlot = vppVar.yiz) != null && !TextUtils.isEmpty(adSlot.getBidAdm()) && od.le(vppVar) && frameLayout != null) {
                    String strUx = vppVar.ux();
                    if (!TextUtils.isEmpty(strUx)) {
                        int i10 = -1;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= yuVarOuw.vt.size()) {
                                vtVar = null;
                                break;
                            }
                            vtVar = yuVarOuw.vt.get(i11);
                            if (strUx.equals(vtVar.zin)) {
                                i10 = i11;
                                break;
                            }
                            i11++;
                        }
                        if (vtVar != null) {
                            yuVarOuw.ouw.removeMessages(strUx.hashCode());
                            yuVarOuw.vt.remove(i10);
                            com.bytedance.sdk.component.utils.ko.ouw("PlayablePreRenderManager", "getPreRenderPlayable success, size:", Integer.valueOf(yuVarOuw.vt.size()));
                            vppVar.kn();
                            com.bytedance.sdk.component.utils.ko.vt("PlayablePreManager", "initPreRenderPlb");
                            vtVar.qbp = frameLayout;
                            frameLayout.addView(vtVar.f14563th);
                            vtVar.f14564vm = leVarVt;
                            if (vtVar.zih) {
                                vtVar.f14564vm.ouw();
                            }
                            com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, uoy.lh(vppVar.yiz.getDurationSlotType()), "PL_use_pre_render");
                            vtVar2 = vtVar;
                        } else {
                            com.bytedance.sdk.component.utils.ko.vt("PlayablePreRenderManager", "getPreRenderPlayable fail");
                        }
                    }
                }
                this.f13226vm = vtVar2;
                vtVar2.ouw(this.ryl.fqk);
            } catch (Throwable th2) {
                th2.printStackTrace();
                qbp.lh("RVIVPlayableNewManager", "PreRender injection exception" + th2.getMessage());
            }
            if (this.f13226vm == null) {
                super.ouw(z10);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void pno() {
        if (this.f13222jg) {
            this.vpp = true;
            this.zin.removeMessages(TypedValues.Custom.TYPE_INT);
            this.zin.removeMessages(600);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final int ra() {
        return this.ex;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final com.bytedance.sdk.openadsdk.mwh.le vt() {
        return new com.bytedance.sdk.openadsdk.mwh.le() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.ra.1
            @Override // com.bytedance.sdk.openadsdk.mwh.le
            public final void ouw() {
                ra.this.jg();
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.bly
    public final void yu() {
        com.bytedance.sdk.openadsdk.core.widget.vt vtVar;
        if (this.f13222jg) {
            super.yu();
            if (DeviceUtils.ra() == 0) {
                this.ryl.f13260cj = true;
            }
            ouw ouwVar = this.ryl;
            if (ouwVar.f13260cj) {
                ouwVar.uoy.vt(true);
                lh(true);
            }
            com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar2 = this.ryl.coz;
            if ((vtVar2 == null || (vtVar = vtVar2.mwh) == null || !vtVar.isShowing()) && tlj() && this.f13285lh > 0) {
                ouw(0L);
            }
        }
    }
}
