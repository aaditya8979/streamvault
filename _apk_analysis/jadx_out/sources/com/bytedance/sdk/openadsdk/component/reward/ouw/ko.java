package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.cd;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.mwh.yu.ouw;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ko;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class ko {
    public boolean bly;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private boolean f13235cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public boolean f13236cf;
    private FrameLayout ex;
    public final boolean fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public long f13237jg;
    private final vpp jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public String f13238ko;
    private long ksc;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private boolean f13241od;
    public long ouw;
    public long pno;
    public ouw.InterfaceC0239ouw qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh f13242ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public final ouw f13243rn;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private final String f13244tc;
    public boolean tlj;
    private final Activity vpp;
    public boolean yu;
    public com.bytedance.sdk.openadsdk.yu.ra zin;
    public boolean vt = false;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f13240lh = false;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public boolean f13239le = false;
    public long ryl = -1;
    public int mwh = -1;
    public boolean zih = false;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public int f13247vm = 0;

    /* JADX INFO: renamed from: uq, reason: collision with root package name */
    private float f13246uq = 1.0f;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public boolean f13245th = false;
    private HashSet<String> jae = new HashSet<>();

    public ko(ouw ouwVar) {
        this.f13243rn = ouwVar;
        this.vpp = ouwVar.jvy;
        this.jqy = ouwVar.vt;
        this.fkw = ouwVar.yu;
        this.f13244tc = ouwVar.fkw;
    }

    private boolean jae() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        if (lhVar != null) {
            if (lhVar.zin() != null) {
                com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVarZin = this.f13242ra.zin();
                if (ouwVarZin.ra() || ouwVarZin.pno()) {
                    com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar2 = this.f13242ra;
                    if (lhVar2 instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
                        ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) lhVar2).rrs();
                    }
                    return true;
                }
            } else if (this.vt) {
                this.vt = false;
                com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar3 = this.f13242ra;
                if (lhVar3 instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
                    ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) lhVar3).rrs();
                }
                return true;
            }
        }
        return false;
    }

    private void ksc() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        if (lhVar == null || lhVar.zin() == null) {
            return;
        }
        this.ouw = this.f13242ra.rn();
        if (this.f13242ra.zin().lh() || !this.f13242ra.zin().vt()) {
            this.f13242ra.cf();
            this.f13242ra.mwh();
            this.vt = true;
        }
    }

    private void od() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        if (lhVar instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
            ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) lhVar).hun();
        }
    }

    private void vt(long j10, long j11) {
        int iAbs = (int) Math.abs(((long) this.mwh) - j10);
        int i10 = this.mwh;
        if (i10 < 0 || iAbs > 500 || i10 > j11 || iAbs >= 500 || this.jae.contains(this.f13238ko)) {
            return;
        }
        if (this.mwh > j10) {
            com.bytedance.sdk.openadsdk.core.jg.lh().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.ko.1
                @Override // java.lang.Runnable
                public final void run() {
                    ko.this.th();
                    ko koVar = ko.this;
                    koVar.f13243rn.jae.ouw(koVar.mwh, koVar.f13238ko);
                }
            }, iAbs);
        } else {
            th();
            this.f13243rn.jae.ouw(this.mwh, this.f13238ko);
        }
        this.jae.add(this.f13238ko);
    }

    private void vt(com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar) {
        if (!jae() || vtVar == null) {
            return;
        }
        vtVar.ouw(this.ouw, true);
    }

    public final void bly() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        if (lhVar == null) {
            return;
        }
        lhVar.mwh();
        this.f13242ra = null;
    }

    public final void cf() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        if (lhVar != null) {
            lhVar.ryl();
        }
    }

    public final void ex() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        if (lhVar instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
            ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) lhVar).ux();
        }
    }

    public final long fkw() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        return lhVar != null ? lhVar.rn() : this.ouw;
    }

    public final int jg() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        if (lhVar != null) {
            return lhVar.vm();
        }
        return 0;
    }

    public final View jqy() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        if (lhVar instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
            return (View) ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) lhVar).fqk();
        }
        return null;
    }

    public final long ko() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        if (lhVar != null) {
            return lhVar.th() + this.f13242ra.zih();
        }
        return 0L;
    }

    public final void le() {
        this.vt = true;
    }

    public final com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw lh() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        if (lhVar != null) {
            return lhVar instanceof com.bytedance.sdk.openadsdk.component.reward.lh ? ((com.bytedance.sdk.openadsdk.component.reward.lh) lhVar).ouw : lhVar.vpp();
        }
        return null;
    }

    public final int mwh() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        if (lhVar != null) {
            return lhVar.qbp();
        }
        return 0;
    }

    public final void ouw(int i10, int i11) {
        if (this.f13242ra != null) {
            ko.ouw ouwVar = new ko.ouw();
            ouwVar.vt = pno();
            ouwVar.vt(ko());
            ouwVar.ouw(fkw());
            ouwVar.pno = i10;
            ouwVar.bly = i11;
            com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.yu(this.f13242ra.vpp(), ouwVar);
        }
    }

    public final void ouw(long j10, long j11) {
        this.pno = j10;
        vt(j10, j11);
    }

    public final void ouw(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.yu.ra raVar) {
        if (this.f13241od) {
            return;
        }
        this.f13241od = true;
        this.ex = frameLayout;
        vpp vppVar = this.jqy;
        cd cdVar = vppVar.f13793tj;
        if (cdVar != null) {
            this.f13247vm = cdVar.vt;
            this.f13246uq = cdVar.ouw;
        }
        this.zin = raVar;
        if (!vpp.fkw(vppVar)) {
            this.f13245th = false;
            com.bytedance.sdk.openadsdk.component.reward.lh lhVar = new com.bytedance.sdk.openadsdk.component.reward.lh(this.jqy, raVar);
            this.f13242ra = lhVar;
            ouw.InterfaceC0239ouw interfaceC0239ouw = this.qbp;
            if (interfaceC0239ouw != null) {
                lhVar.vt = interfaceC0239ouw;
                return;
            }
            return;
        }
        this.f13245th = true;
        this.f13242ra = new com.bytedance.sdk.openadsdk.core.mwh.yu.ouw(this.vpp, this.ex, this.jqy, raVar);
        ouw(this.f13235cd);
        ouw.InterfaceC0239ouw interfaceC0239ouw2 = this.qbp;
        if (interfaceC0239ouw2 != null) {
            ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) this.f13242ra).ucs = interfaceC0239ouw2;
        }
        ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) this.f13242ra).f13898wp = this.f13236cf;
    }

    public final void ouw(lh.ouw ouwVar) {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        if (lhVar != null) {
            lhVar.ouw(ouwVar);
        }
    }

    public final void ouw(com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar) {
        if (this.f13243rn.tlj.get()) {
            return;
        }
        ouw ouwVar = this.f13243rn;
        if (!ouwVar.pv || od.lh(ouwVar.vt)) {
            return;
        }
        if (!vpp.fkw(this.f13243rn.vt)) {
            com.bytedance.sdk.openadsdk.core.zih.yu();
            if (com.bytedance.sdk.openadsdk.core.settings.cf.bly(String.valueOf(this.f13243rn.f13265le)) == 1 && this.f13243rn.jae.fkw) {
                return;
            }
        }
        if (th.yu(this.f13243rn.vt) || th.ra(this.f13243rn.vt) || this.f13239le || !vtVar.le()) {
            return;
        }
        this.f13243rn.ux.removeMessages(300);
        Message messageObtain = Message.obtain();
        messageObtain.what = 300;
        this.f13243rn.ux.sendMessageDelayed(messageObtain, 5000L);
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar) {
        try {
            this.f13239le = false;
            if (this.vt) {
                ksc();
                vt(vtVar);
            } else if (yu()) {
                cf();
            }
        } catch (Throwable th2) {
            qbp.lh("TTAD.RFVideoPlayerMag", "onContinue throw Exception :" + th2.getMessage());
        }
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar, boolean z10) {
        if (this.tlj || (z10 && !this.f13239le)) {
            if (yu()) {
                cf();
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: continue play");
            } else {
                ksc();
                vt(vtVar);
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: recreate video player & exec play");
            }
            this.tlj = false;
        }
    }

    public final void ouw(String str, boolean z10) {
        if (this.f13242ra != null) {
            long jFkw = fkw();
            if (this.jqy.ryl()) {
                jFkw = this.f13243rn.ouw();
            }
            long j10 = jFkw;
            JSONObject jSONObjectOuw = uoy.ouw(this.jqy, this.f13242ra.zih(), this.f13242ra.zin());
            try {
                jSONObjectOuw.put("auto_click", z10);
                if (!z10) {
                    ouw ouwVar = this.f13243rn;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(jSONObjectOuw, ouwVar.yu ? ouwVar.vt.ng() : ouwVar.vt.myk(), (int) j10);
                }
            } catch (Exception unused) {
            }
            com.bytedance.sdk.openadsdk.yu.lh.ouw(this.jqy, this.f13244tc, str, j10, mwh(), jSONObjectOuw, this.zin);
            com.bytedance.sdk.component.utils.ko.vt("TTAD.RFVideoPlayerMag", "event tag:" + this.f13244tc + ", TotalPlayDuration=" + ko() + ",mBasevideoController.getPct()=" + mwh());
        }
        od();
    }

    public final void ouw(boolean z10) {
        this.f13235cd = z10;
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        if (lhVar instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
            if (z10) {
                ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) lhVar).ey = this.jqy.f13788sd.f11287th;
            } else {
                this.jqy.f13788sd.ouw(1);
                ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) this.f13242ra).ey = 1;
            }
        }
    }

    public final void ouw(boolean z10, String str) {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        if (lhVar != null) {
            lhVar.ouw(z10, str);
        }
    }

    public final boolean ouw() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        return (lhVar == null || lhVar.zin() == null || !this.f13242ra.zin().le()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ouw(long r11, boolean r13, final java.util.Map<java.lang.String, java.lang.Object> r14, com.bytedance.sdk.openadsdk.component.reward.vt.vt r15) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ouw.ko.ouw(long, boolean, java.util.Map, com.bytedance.sdk.openadsdk.component.reward.vt.vt):boolean");
    }

    public final boolean ouw(JSONObject jSONObject) {
        int i10;
        cd cdVar;
        if (this.f13242ra == null || jSONObject == null || !((i10 = this.f13247vm) == 1 || i10 == 2)) {
            this.zih = false;
            return false;
        }
        int iOptInt = jSONObject.optInt("switch", 0);
        float fOptDouble = (float) jSONObject.optDouble("speed", 0.0d);
        this.f13246uq = fOptDouble;
        if (fOptDouble <= 0.0f && (cdVar = this.f13243rn.vt.f13793tj) != null) {
            this.f13246uq = cdVar.ouw;
        }
        if (iOptInt == 0) {
            this.f13246uq = 1.0f;
            if (this.zih) {
                long jCurrentTimeMillis = this.f13237jg + (System.currentTimeMillis() - this.ksc);
                this.f13237jg = jCurrentTimeMillis;
                com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
                if (lhVar != null) {
                    lhVar.ouw(jCurrentTimeMillis);
                }
                com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar = this.f13243rn.fqk;
                if (vtVar != null) {
                    vtVar.lh(false);
                }
            }
        } else if (iOptInt == 1 && !this.zih) {
            this.ksc = System.currentTimeMillis();
            com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar2 = this.f13243rn.fqk;
            if (vtVar2 != null) {
                vtVar2.lh(true);
            }
        }
        this.zih = iOptInt == 1;
        if (this.f13247vm == 1) {
            return true;
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar2 = this.f13242ra;
        if (lhVar2 == null) {
            return false;
        }
        return lhVar2.ouw(this.f13246uq);
    }

    public final long pno() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        if (lhVar != null) {
            return lhVar.zih();
        }
        return 0L;
    }

    public final boolean qbp() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        if (lhVar == null || lhVar.zin() == null) {
            return false;
        }
        return this.f13242ra.zin().ouw();
    }

    public final void ra() {
        try {
            if (ouw()) {
                this.f13242ra.cf();
            }
        } catch (Throwable th2) {
            qbp.yu("RewardFullVideoPlayerManager onPause throw Exception :" + th2.getMessage(), new Object[0]);
        }
    }

    public final long rn() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        if (lhVar != null) {
            return lhVar.th();
        }
        return 0L;
    }

    public final void ryl() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        if (lhVar != null) {
            lhVar.cf();
        }
    }

    public final void tc() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        if (lhVar != null) {
            lhVar.bly();
        }
    }

    public final void th() {
        try {
            if (ouw()) {
                this.f13239le = true;
                ryl();
            }
        } catch (Exception e10) {
            qbp.lh("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + e10.getMessage());
        }
    }

    public final void tlj() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        if (lhVar != null) {
            lhVar.ko();
        }
    }

    public final void vm() {
        this.zih = false;
        bly();
    }

    public final void vpp() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        if (lhVar instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
            ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) lhVar).ey();
        }
    }

    public final boolean vt() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        return lhVar != null && lhVar.jqy();
    }

    public final boolean yu() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f13242ra;
        return (lhVar == null || lhVar.zin() == null || !this.f13242ra.zin().ra()) ? false : true;
    }

    public final void zih() {
        int i10 = this.f13247vm;
        if (i10 == 1 || i10 == 2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("switch", 0);
                ouw(jSONObject);
            } catch (Throwable th2) {
                qbp.ouw("TTAD.RFVideoPlayerMag", "onStopPlaySpeed: ", th2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final double zin() {
        /*
            r5 = this;
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r5.jqy
            com.bytedance.sdk.openadsdk.core.model.qbp r1 = r0.f13770kq
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.th.yu(r0)
            if (r0 == 0) goto L10
            if (r1 == 0) goto L10
            long r0 = r1.vt
        Le:
            double r0 = (double) r0
            goto L2d
        L10:
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r5.jqy
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.th.ra(r0)
            if (r0 == 0) goto L1d
            if (r1 == 0) goto L1d
            long r0 = r1.yu
            goto Le
        L1d:
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r5.jqy
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt r0 = r0.f13788sd
            if (r0 == 0) goto L2b
            double r1 = r0.yu
            int r0 = r0.f11287th
            double r3 = (double) r0
            double r0 = r1 * r3
            goto L2d
        L2b:
            r0 = 0
        L2d:
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw r2 = r5.f13243rn
            com.bytedance.sdk.openadsdk.component.reward.tlj r2 = r2.ycd
            if (r2 == 0) goto L37
            long r3 = (long) r0
            r2.ouw(r3)
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ouw.ko.zin():double");
    }
}
