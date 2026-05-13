package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.vt;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.ko.cf;
import com.bytedance.sdk.openadsdk.utils.jg;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.google.android.material.badge.BadgeDrawable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class bly extends lh {
    private cf bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.le.lh f12962cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private int f12963jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private fkw f12964ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public jg f12965le;
    private vt.AbstractC0212vt mwh;
    private final List<pno> pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.component.reward.top.lh f12966ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private pno f12967rn;
    private com.bytedance.sdk.openadsdk.core.le.pno ryl;
    private com.bytedance.sdk.openadsdk.core.le.lh tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private boolean f12968vm;
    private int zih;

    public bly(Activity activity, vpp vppVar, vt vtVar) {
        super(activity, vppVar, vtVar);
        this.pno = new ArrayList();
        this.f12968vm = false;
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(activity);
        this.tlj = lhVar;
        if (Build.VERSION.SDK_INT >= 35) {
            lhVar.setFitsSystemWindows(true);
        }
        activity.setContentView(this.tlj);
    }

    private static pno ouw(vt vtVar, vpp vppVar, int i10, int i11, boolean z10) {
        boolean zEy = vppVar.ey();
        AdSlot adSlot = vppVar.yiz;
        if (adSlot != null) {
            zEy = adSlot.getDurationSlotType() == 7;
        }
        return zEy ? new ra(vtVar, vppVar, i10, i11, z10) : new le(vtVar, vppVar, i10, i11, z10);
    }

    private int qbp() {
        pno pnoVar = this.f12967rn;
        if (pnoVar != null) {
            return pnoVar.tlj;
        }
        return -1;
    }

    private void vt(pno pnoVar) {
        try {
            this.ryl.setText(this.ouw.getString(com.bytedance.sdk.component.utils.vpp.vt(zih.ouw(), "tt_multiple_ad_indicator"), Integer.valueOf(pnoVar.f12985cf + 1), Integer.valueOf(this.f12963jg)));
            this.ryl.setVisibility(0);
        } catch (Throwable th2) {
            qbp.ouw("SeqSwitchLayoutManager", "updateCurrentAdIndex: ", th2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void bly() {
        super.bly();
        pno pnoVar = this.f12967rn;
        if (pnoVar != null) {
            pnoVar.zin();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final pno cf() {
        return this.f12967rn;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final fkw jg() {
        fkw fkwVar = this.f12964ko;
        if (fkwVar != null) {
            return fkwVar;
        }
        pno pnoVar = this.f12967rn;
        int i10 = pnoVar != null ? pnoVar.tlj : -1;
        int size = this.pno.size() - 1;
        while (true) {
            if (size <= i10) {
                break;
            }
            pno pnoVar2 = this.pno.get(size);
            if (pnoVar2 instanceof fkw) {
                fkw fkwVar2 = (fkw) pnoVar2;
                if (fkwVar2.ouw) {
                    this.f12964ko = fkwVar2;
                    break;
                }
            }
            size--;
        }
        return this.f12964ko;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final List<vpp> ko() {
        return this.vt.f13800vm.yu;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void le() {
        super.le();
        pno pnoVar = this.f12967rn;
        if (pnoVar != null) {
            pnoVar.mwh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void lh() {
        super.lh();
        pno pnoVar = this.f12967rn;
        if (pnoVar != null) {
            pnoVar.jg();
        }
        vt.AbstractC0212vt abstractC0212vt = this.mwh;
        if (abstractC0212vt != null) {
            abstractC0212vt.ouw(-1);
        }
        jg jgVar = this.f12965le;
        if (jgVar != null) {
            jgVar.vt();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final pno mwh() {
        pno pnoVar = this.f12967rn;
        if (pnoVar == null) {
            return null;
        }
        int i10 = pnoVar.tlj;
        while (true) {
            i10++;
            if (i10 >= this.pno.size()) {
                return null;
            }
            pno pnoVar2 = this.pno.get(i10);
            if (pnoVar2 instanceof ouw) {
                return pnoVar2;
            }
            if ((pnoVar2 instanceof fkw) && od.lh(pnoVar2.f12988le) && pnoVar2.f12990rn) {
                return pnoVar2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0170 A[SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.activity.lh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ouw() {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.bly.ouw():void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(float f10) {
        cf cfVar = this.bly;
        if (cfVar == null) {
            return;
        }
        cfVar.setProgress(f10);
        if (f10 == 0.0f && this.bly.getVisibility() == 0) {
            this.bly.setVisibility(4);
        } else {
            if (f10 <= 0.0f || this.bly.getVisibility() == 0) {
                return;
            }
            this.bly.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(int i10) {
        ko.vt("SeqSwitchLayoutManager", "changeCountDownStatus: status=".concat(String.valueOf(i10)));
        vt.AbstractC0212vt abstractC0212vt = this.mwh;
        if (abstractC0212vt != null) {
            if (i10 == 2) {
                abstractC0212vt.ouw(2);
            } else if (i10 == 1) {
                abstractC0212vt.vt(1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(int i10, int i11) {
        super.ouw(i10, i11);
        if (i10 < 0) {
            this.ryl.setVisibility(8);
            return;
        }
        if (TextUtils.isEmpty(this.f12978lh)) {
            this.ryl.setText(this.ouw.getString(com.bytedance.sdk.component.utils.vpp.vt(zih.ouw(), "tt_multiple_playable_wait_tips"), Integer.valueOf(i10)));
        } else {
            this.ryl.setText(String.format(this.f12978lh, Integer.valueOf(i10)));
        }
        this.ryl.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(Activity activity) {
        super.ouw(activity);
        pno pnoVar = this.f12967rn;
        if (pnoVar != null) {
            pnoVar.vt(activity);
        }
        int iQbp = qbp();
        for (pno pnoVar2 : this.pno) {
            if (pnoVar2.tlj >= iQbp) {
                pnoVar2.qbp();
            }
        }
        vt.AbstractC0212vt abstractC0212vt = this.mwh;
        if (abstractC0212vt != null) {
            abstractC0212vt.lh();
        }
        jg jgVar = this.f12965le;
        if (jgVar != null) {
            jgVar.lh();
        }
        pno pnoVar3 = this.f12967rn;
        if (pnoVar3 != null && !pnoVar3.jqy() && !this.vt.f13804zn) {
            com.bytedance.sdk.openadsdk.core.jg.vt().post(new vt.lh(this.vt));
        }
        this.f12967rn = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(Bundle bundle) {
        super.ouw(bundle);
        this.f12962cf = new com.bytedance.sdk.openadsdk.core.le.lh(this.ouw);
        this.tlj.addView(this.f12962cf, new FrameLayout.LayoutParams(-1, -1));
        this.bly = new cf(this.ouw);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, osn.ouw(this.ouw, 2.0f));
        layoutParams.gravity = 80;
        this.tlj.addView(this.bly, layoutParams);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(this.ouw);
        this.ryl = pnoVar;
        pnoVar.setTextColor(-1);
        this.ryl.setTextSize(15.0f);
        this.ryl.setShadowLayer(1.0f, 0.0f, 1.0f, ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = osn.ouw(this.ouw, 60.0f);
        layoutParams2.rightMargin = osn.ouw(this.ouw, 16.0f);
        layoutParams2.gravity = BadgeDrawable.TOP_END;
        this.tlj.addView(this.ryl, layoutParams2);
        com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = new com.bytedance.sdk.openadsdk.component.reward.top.lh(this.ouw);
        this.f12966ra = lhVar;
        this.tlj.addView(lhVar, new FrameLayout.LayoutParams(-1, -2));
        this.f12966ra.ouw(this.vt);
        this.f12966ra.setShowDislike(true);
        ouw(null, null, new vt.fkw(1, null));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(View view) {
        super.ouw(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.f12962cf.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(View view, boolean z10) {
        super.ouw(view, z10);
        if (view.getParent() == null && this.f12962cf != null) {
            view.setVisibility(4);
            int childCount = this.f12962cf.getChildCount();
            if (z10) {
                this.f12962cf.addView(view, 0);
            } else {
                this.f12962cf.addView(view, childCount - 1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(ouw ouwVar, boolean z10) {
        vt.AbstractC0212vt abstractC0212vt;
        super.ouw(ouwVar, z10);
        if (ouwVar == null || ouwVar != this.f12967rn || (abstractC0212vt = this.mwh) == null) {
            return;
        }
        if (z10) {
            abstractC0212vt.bly = (int) (1000.0f / abstractC0212vt.pno);
        } else {
            abstractC0212vt.bly = 1000;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(pno pnoVar) {
        vt.AbstractC0212vt abstractC0212vt;
        super.ouw(pnoVar);
        if (pnoVar == null) {
            return;
        }
        qbp.ouw("SeqSwitchLayoutManager", "onPlayableLoadingDismiss [scene=]" + pnoVar + ",isActive=" + pnoVar.ryl);
        if (pnoVar.ryl && (abstractC0212vt = this.mwh) != null) {
            abstractC0212vt.fkw();
        }
        pno pnoVarMwh = mwh();
        if (pnoVarMwh instanceof ouw) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVarKsc = pnoVarMwh.ksc();
            if (ouwVarKsc == null || !th.fkw(ouwVarKsc.vt)) {
                ((ouw) pnoVarMwh).vpp();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x011d  */
    @Override // com.bytedance.sdk.openadsdk.activity.lh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ouw(com.bytedance.sdk.openadsdk.activity.pno r13, com.bytedance.sdk.openadsdk.activity.pno r14, com.bytedance.sdk.openadsdk.activity.vt.fkw r15) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.bly.ouw(com.bytedance.sdk.openadsdk.activity.pno, com.bytedance.sdk.openadsdk.activity.pno, com.bytedance.sdk.openadsdk.activity.vt$fkw):void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(pno pnoVar, vt.fkw fkwVar) {
        pno pnoVar2 = this.f12967rn;
        if (pnoVar2 == null || pnoVar2 == pnoVar) {
            if (pnoVar2 != null && (pnoVar2 instanceof ouw)) {
                final long j10 = 0;
                if (pnoVar2.ksc() != null && this.f12967rn.ksc().ex != null) {
                    j10 = this.f12967rn.ksc().ex.pno;
                }
                final int i10 = this.f12967rn.f12985cf + 1;
                long jCurrentTimeMillis = System.currentTimeMillis();
                pno pnoVar3 = this.f12967rn;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(jCurrentTimeMillis, pnoVar3.f12988le, pnoVar3.e_(), "dislike_skip", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.bly.2
                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject ouw() {
                        return com.bytedance.sdk.openadsdk.yu.lh.ouw(i10);
                    }

                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject vt() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("duration", j10);
                        } catch (Throwable unused) {
                        }
                        return jSONObject;
                    }
                });
            }
            pno pnoVarMwh = mwh();
            if (pnoVarMwh == null) {
                pnoVarMwh = jg();
            }
            ouw(this.f12967rn, pnoVarMwh, fkwVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(pno pnoVar, boolean z10) {
        vt.AbstractC0212vt abstractC0212vt;
        super.ouw(pnoVar, z10);
        if (pnoVar == null) {
            return;
        }
        qbp.ouw("SeqSwitchLayoutManager", "setIsHappenInteraction [scene=]" + pnoVar + ",isActive=" + pnoVar.ryl + ",isHappenInteraction=" + z10);
        if (!pnoVar.ryl || (abstractC0212vt = this.mwh) == null) {
            return;
        }
        abstractC0212vt.f13019ko = z10;
        abstractC0212vt.f13029vm = 0;
        if (z10) {
            int i10 = abstractC0212vt.ryl;
            int i11 = abstractC0212vt.f13017cf;
            abstractC0212vt.tlj = i10 - i11;
            abstractC0212vt.f13018jg = i11;
            abstractC0212vt.mwh = i10;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(pno pnoVar, boolean z10, boolean z11, boolean z12, int i10) {
        fkw fkwVarJg;
        pno pnoVar2 = this.f12967rn;
        if ((pnoVar2 == null || pnoVar2 == pnoVar) && (fkwVarJg = jg()) != null) {
            vt.fkw fkwVar = new vt.fkw(i10, pnoVar != null ? pnoVar.ksc() : null);
            fkwVar.ouw.putBoolean("isSkip", z10);
            fkwVar.ouw.putBoolean("force", z11);
            fkwVar.ouw.putBoolean("isFromLandingPage", z12);
            ouw(this.f12967rn, fkwVarJg, fkwVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(boolean z10) {
        super.ouw(z10);
        pno pnoVar = this.f12967rn;
        if (pnoVar != null) {
            pnoVar.vt(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final boolean ouw(pno pnoVar, int i10) {
        return i10 == this.pno.size() - 1 && this.pno.get(i10) != null && (this.pno.get(i10) instanceof fkw);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final int pno() {
        vt.AbstractC0212vt abstractC0212vt = this.mwh;
        if (abstractC0212vt != null) {
            return abstractC0212vt.ouw();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ra() {
        super.ra();
        pno pnoVar = this.f12967rn;
        if (pnoVar != null) {
            pnoVar.yu();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final com.bytedance.sdk.openadsdk.component.reward.top.lh ryl() {
        return this.f12966ra;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void th() {
        vt.AbstractC0212vt abstractC0212vt = this.mwh;
        if (abstractC0212vt != null) {
            ko.vt("TTAD.AdSceneManager", "onDialogShow: ");
            if (abstractC0212vt.f13027th) {
                abstractC0212vt.qbp = true;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final int tlj() {
        return this.zih;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void vm() {
        vt.AbstractC0212vt abstractC0212vt = this.mwh;
        if (abstractC0212vt != null) {
            abstractC0212vt.le();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void vt() {
        super.vt();
        pno pnoVar = this.f12967rn;
        if (pnoVar != null) {
            pnoVar.lh();
        }
        vt.AbstractC0212vt abstractC0212vt = this.mwh;
        if (abstractC0212vt != null) {
            abstractC0212vt.vt(-1);
        }
        jg jgVar = this.f12965le;
        if (jgVar != null) {
            jgVar.ouw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void vt(Activity activity) {
        super.vt(activity);
        pno pnoVar = this.f12967rn;
        if (pnoVar != null) {
            pnoVar.ouw(activity);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void vt(pno pnoVar, int i10) {
        vt.AbstractC0212vt abstractC0212vt = this.mwh;
        if (abstractC0212vt == null) {
            return;
        }
        if (i10 == 2) {
            abstractC0212vt.ouw(i10);
            jg jgVar = this.f12965le;
            if (jgVar != null) {
                jgVar.vt();
                return;
            }
            return;
        }
        if (i10 == 1) {
            abstractC0212vt.vt(i10);
            jg jgVar2 = this.f12965le;
            if (jgVar2 != null) {
                jgVar2.ouw();
                return;
            }
            return;
        }
        if (i10 == 3 || i10 == 4) {
            try {
                this.f12967rn.ksc().ex.zih();
            } catch (Throwable th2) {
                qbp.yu("SeqSwitchLayoutManager", th2);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final boolean yu() {
        if (this.pno.isEmpty()) {
            return false;
        }
        List<pno> list = this.pno;
        pno pnoVar = list.get(list.size() - 1);
        return (pnoVar instanceof fkw) && ((fkw) pnoVar).ouw;
    }
}
