package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.ey;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.yu.vt;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class fkw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw f13231lh;
    public final com.bytedance.sdk.openadsdk.component.reward.view.pno ouw;
    public ouw vt;

    public interface ouw {
        void ouw(boolean z10, boolean z11, boolean z12, int i10);
    }

    public fkw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.f13231lh = ouwVar;
        this.ouw = new com.bytedance.sdk.openadsdk.component.reward.view.pno(ouwVar);
    }

    private void lh() {
        if (!vpp.yu(this.f13231lh.vt)) {
            com.bytedance.sdk.component.utils.ko.vt("TTAD.RFEndM", "TimeTrackLog report 408 from backup page");
            this.f13231lh.f13257bs.ouw(false, 408, "end_card_timeout");
        }
        this.f13231lh.f13257bs.ko();
        this.f13231lh.f13257bs.ouw(8);
        this.f13231lh.fak.ouw(8);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f13231lh;
        if (ouwVar.f13271ra) {
            osn.ouw((View) ouwVar.coz.f13382jg, 8);
            this.f13231lh.ey.le(0);
        }
        this.f13231lh.ey.yu(8);
        if (!this.f13231lh.vt.cd()) {
            com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.f13231lh.f13261gh;
            if (pnoVar != null) {
                this.ouw.ouw(pnoVar.hun().tlj.tlj());
            }
            this.ouw.ouw();
        } else if (!this.ouw.ouw(this.f13231lh.ex)) {
            this.f13231lh.jvy.finish();
        }
        this.f13231lh.ey.ra();
        vt(this.f13231lh.coz);
        this.f13231lh.uoy.lh(false);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.f13231lh;
        ouwVar2.f13258cd.ouw(ouwVar2.vt.ey());
    }

    private void ouw(com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar) {
        if (vpp.lh(this.f13231lh.vt)) {
            this.f13231lh.f13257bs.ouw(8);
            this.f13231lh.fak.ouw(0);
            this.f13231lh.fak.vt();
        } else {
            this.f13231lh.fak.ouw(8);
            this.f13231lh.f13257bs.ouw(0);
            this.f13231lh.f13257bs.qbp();
        }
        if (this.f13231lh.f13271ra) {
            osn.ouw((View) vtVar.f13382jg, 0);
            this.f13231lh.ey.le(8);
        }
        this.f13231lh.ey.yu(8);
        this.f13231lh.ey.ra();
        if (vpp.lh(this.f13231lh.vt)) {
            this.f13231lh.ux.sendEmptyMessageDelayed(800, 100L);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f13231lh;
        ouwVar.f13257bs.vt(ouwVar.f13260cj);
        this.f13231lh.f13257bs.bly();
        this.f13231lh.f13257bs.le();
        bs bsVar = this.f13231lh.f13257bs.f13300ra;
        if (bsVar != null) {
            bsVar.ouw("prerender_page_show", (JSONObject) null);
        }
        if (!od.vt(this.f13231lh.vt)) {
            this.f13231lh.uoy.lh(false);
        }
        com.bytedance.sdk.component.bly.le leVar = this.f13231lh.f13257bs.f13296le;
        if (leVar == null || leVar.getWebView() == null) {
            return;
        }
        leVar.le();
        leVar.getWebView().resumeTimers();
    }

    private void ouw(boolean z10, boolean z11, boolean z12, int i10) {
        HashMap map = new HashMap();
        map.put("webview_state", Integer.valueOf(this.f13231lh.f13257bs.vm() ? 1 : !this.f13231lh.f13257bs.mwh ? -1 : 2));
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f13231lh;
        com.bytedance.sdk.openadsdk.yu.lh.ouw(ouwVar.vt, ouwVar.fkw, z10, z11, z12, ouwVar.jvy.isFinishing(), i10, map);
    }

    private boolean ouw(boolean z10) {
        if (!th.lh(this.f13231lh.vt)) {
            return true;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f13231lh;
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar = ouwVar.jae.ouw;
        if (yuVar == null || yuVar.yu != 0 || z10) {
            return true;
        }
        ouwVar.uoy.lh(false);
        return false;
    }

    private int vt() {
        int i10 = this.f13231lh.vt.xne;
        if (i10 <= 5000 && i10 >= 0) {
            if (i10 < 1000) {
                i10 += 1000;
            }
            com.bytedance.sdk.openadsdk.core.zih.yu();
            int iOuw = com.bytedance.sdk.openadsdk.core.settings.cf.ouw(this.f13231lh.vt.fqk());
            if (iOuw <= 5000 && iOuw >= 0) {
                if (iOuw < 1000) {
                    iOuw += 1000;
                }
                return Math.min(i10, iOuw);
            }
        }
        return -1;
    }

    private boolean vt(com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar) {
        boolean z10;
        this.f13231lh.pno = vt();
        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFEndM", "showEndCard: cT2=" + this.f13231lh.pno);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f13231lh;
        vpp vppVar = ouwVar.vt;
        if (vppVar.f13752an) {
            return false;
        }
        int i10 = ouwVar.pno;
        if (i10 != -1) {
            if (i10 >= 0) {
                ouwVar.zin.set(false);
                Message messageObtain = Message.obtain();
                messageObtain.what = 700;
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.f13231lh;
                messageObtain.arg1 = ouwVar2.pno;
                ouwVar2.ux.sendMessage(messageObtain);
                if (!od.ra(this.f13231lh.vt)) {
                    z10 = true;
                }
            }
            z10 = false;
        } else if (ouwVar.f13261gh == null && od.pno(vppVar) && this.f13231lh.f13257bs.ryl.get()) {
            vtVar.zin();
            z10 = false;
        } else {
            vtVar.jg();
            z10 = true;
        }
        if (this.f13231lh.f13257bs.cf() ? false : z10) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.f13231lh;
            if (ouwVar3.f13273sd == null || !ouwVar3.vt()) {
                return true;
            }
            this.f13231lh.f13273sd.ouw(r7.pno);
        }
        return true;
    }

    public final void ouw() {
        zih zihVar = this.ouw.yu;
        if (zihVar != null) {
            DeviceUtils.AudioInfoReceiver.vt(zihVar);
            com.bytedance.sdk.component.bly.le leVar = zihVar.f13318lh;
            if (leVar != null) {
                ey.ouw(leVar.getWebView());
            }
        }
    }

    public final void ouw(boolean z10, com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar) {
        mwh mwhVar;
        this.f13231lh.f13280vm.set(z10);
        vtVar.mwh();
        this.f13231lh.vt.cd();
        this.f13231lh.uoy.yu(false);
        this.f13231lh.uoy.lh(false);
        this.f13231lh.f13257bs.jg();
        th thVar = this.f13231lh.ey.f13361rn;
        if (thVar != null) {
            thVar.yu();
        }
        this.f13231lh.ey.lh();
        com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar = this.f13231lh.jae;
        if (tljVar != null) {
            tljVar.vt();
        }
        pno pnoVar = this.f13231lh.ksc;
        if (pnoVar != null) {
            pnoVar.vt(pno.f13283lh);
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f13231lh;
        if (!TextUtils.isEmpty(vpp.ouw(ouwVar.hun, ouwVar.vt))) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.f13231lh;
            com.bytedance.sdk.openadsdk.utils.vpp.ouw(ouwVar2.jvy, od.cf(ouwVar2.vt), this.f13231lh.vt, vt.ouw.f14528lh);
            return;
        }
        if (vpp.lh(this.f13231lh.vt) && (mwhVar = this.f13231lh.fak) != null) {
            mwhVar.pno = SystemClock.elapsedRealtime();
        }
        if (!vpp.ouw(this.f13231lh.vt) && (vpp.lh(this.f13231lh.vt) || !this.f13231lh.f13257bs.th())) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.f13231lh;
            vpp vppVar = ouwVar3.vt;
            boolean z11 = ouwVar3.f13257bs.ryl.get();
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = this.f13231lh;
            if (vpp.ouw(vppVar, z11, ouwVar4.f13257bs.ucs, ouwVar4.fak.yu.get(), this.f13231lh.f13257bs.zih)) {
                if (!vpp.yu(this.f13231lh.vt) && !vpp.lh(this.f13231lh.vt)) {
                    com.bytedance.sdk.component.utils.ko.vt("TTAD.RFEndM", "TimeTrackLog report Success from Android");
                    this.f13231lh.f13257bs.ouw(true, 0, (String) null);
                }
                vt(vtVar);
                ouw(vtVar);
                return;
            }
        }
        lh();
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ouw(boolean r6, boolean r7, boolean r8, com.bytedance.sdk.openadsdk.component.reward.vt.vt r9, int r10) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ouw.fkw.ouw(boolean, boolean, boolean, com.bytedance.sdk.openadsdk.component.reward.vt.vt, int):void");
    }
}
