package com.bytedance.sdk.openadsdk.component.reward.vt;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.openadsdk.component.reward.ouw.ko;
import com.bytedance.sdk.openadsdk.component.reward.ouw.rn;
import com.bytedance.sdk.openadsdk.component.reward.view.ryl;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* JADX INFO: loaded from: classes10.dex */
public class ouw {
    public com.bytedance.sdk.openadsdk.core.mwh.yu.vt bly;
    public final ko fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final ryl f13374le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f13375lh;
    public com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouw;
    public final com.bytedance.sdk.openadsdk.component.reward.ouw.ryl pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final rn f13376ra;
    public jae tlj;
    public vpp vt;
    public int yu;

    public ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.ouw = ouwVar;
        this.vt = ouwVar.vt;
        this.f13375lh = ouwVar.yib;
        this.yu = ouwVar.yhj;
        this.fkw = ouwVar.ex;
        this.f13374le = ouwVar.ey;
        this.f13376ra = ouwVar.f13257bs;
        this.pno = ouwVar.uoy;
    }

    public final void lh() {
        if (od.vt(this.ouw.vt) && DeviceUtils.ra() == 0) {
            this.ouw.f13260cj = true;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
        ouwVar.uoy.vt(ouwVar.f13260cj);
    }

    public void ouw(com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar, jae jaeVar) {
        this.bly = vtVar;
        this.tlj = jaeVar;
    }

    public final void ouw(boolean z10) {
        if (this.ouw.tlj.get()) {
            return;
        }
        vpp vppVar = this.vt;
        if (vppVar != null && vppVar.lso()) {
            this.pno.lh(false);
            this.pno.ouw(true);
            this.ouw.ey.vt(8);
            this.ouw.ey.yu(8);
            return;
        }
        if (z10) {
            this.pno.ouw(this.ouw.vt.ksc());
            if (ouw()) {
                this.pno.lh(true);
            }
            if (ouw() || ((this instanceof ra) && this.ouw.vt.lh())) {
                this.pno.yu(true);
            } else {
                this.pno.yu();
                this.ouw.ey.le(0);
            }
        } else {
            this.pno.lh(false);
            this.pno.ouw(false);
            this.pno.yu(false);
            this.ouw.ey.le(8);
        }
        if (!z10) {
            this.ouw.ey.vt(4);
            this.ouw.ey.lh(8);
            this.ouw.ey.yu(8);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
        if (ouwVar.f13278vh != com.bytedance.sdk.openadsdk.component.reward.view.yu.ouw) {
            ouwVar.ey.vt(8);
            this.ouw.ey.yu(8);
        } else {
            ouwVar.ey.vt(0);
            this.ouw.ey.lh(0);
            this.ouw.ey.yu(0);
        }
    }

    public final boolean ouw() {
        int i10;
        return this.ouw.vt.cd() || (i10 = this.ouw.vt.ucs) == 15 || i10 == 5 || i10 == 50;
    }

    public final boolean vt() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
        if (ouwVar.f13261gh == null && ouwVar.ex.vt() && (th.lh(this.ouw.vt) || !vpp.fkw(this.ouw.vt))) {
            return false;
        }
        if (!th.vt(this.ouw.vt) || !this.ouw.f13275th.get()) {
            return (this.ouw.tlj.get() || this.ouw.f13259cf.get()) ? false : true;
        }
        FrameLayout frameLayoutLe = this.ouw.ey.le();
        frameLayoutLe.setVisibility(4);
        frameLayoutLe.setVisibility(0);
        return false;
    }
}
