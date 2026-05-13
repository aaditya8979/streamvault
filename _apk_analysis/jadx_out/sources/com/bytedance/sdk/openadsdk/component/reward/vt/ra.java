package com.bytedance.sdk.openadsdk.component.reward.vt;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.component.reward.view.bly;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.model.zih;
import com.bytedance.sdk.openadsdk.tlj.yu;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ra extends vt {

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final int f13378ko;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private ViewGroup f13379rn;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private String f13380vm;
    private com.bytedance.sdk.openadsdk.component.reward.view.ra zih;

    public ra(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        super(ouwVar);
        this.f13380vm = "fullscreen_interstitial_ad";
        this.f13378ko = this.vt.ucs;
    }

    private boolean ex() {
        vpp vppVar = this.vt;
        return vppVar != null && vppVar.rn() == 2;
    }

    public static boolean ouw(vpp vppVar) {
        return !vpp.fkw(vppVar) && vppVar.ex() == 100.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final boolean fkw() {
        return ex();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final boolean le() {
        return ex();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final void ouw(FrameLayout frameLayout) {
        List<zih> list;
        zih zihVar;
        zih zihVar2;
        com.bytedance.sdk.openadsdk.component.reward.view.ra raVar;
        try {
            FrameLayout frameLayout2 = new FrameLayout(this.ouw.jvy);
            this.f13379rn = frameLayout2;
            frameLayout2.setId(rn.elx);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            this.f13379rn.setLayoutParams(layoutParams);
            View viewCf = this.ouw.ey.cf();
            if (viewCf != null) {
                layoutParams.bottomMargin = viewCf.getHeight();
            }
            com.bytedance.sdk.openadsdk.component.reward.view.ra raVar2 = new com.bytedance.sdk.openadsdk.component.reward.view.ra(this.ouw.jvy);
            this.zih = raVar2;
            raVar2.setId(rn.f14357ms);
            FrameLayout.LayoutParams layoutParams2 = this.ouw.vt.jqy() == 1 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(-2, -1);
            layoutParams2.gravity = 17;
            this.zih.setLayoutParams(layoutParams2);
            this.f13379rn.addView(this.zih);
            if (this.f13379rn != null && (raVar = this.zih) != null && this.ouw.jvy != null && this.vt != null) {
                com.bytedance.sdk.openadsdk.core.lh.vt ouwVar = this.ryl;
                if (ouwVar == null) {
                    Activity activity = this.ouw.jvy;
                    vpp vppVar = this.vt;
                    String str = this.f13380vm;
                    ouwVar = new com.bytedance.sdk.openadsdk.core.lh.ouw(activity, vppVar, str, uoy.ouw(str));
                    ouwVar.ouw(this.vt.f13782pd == 4 ? new com.bytedance.sdk.openadsdk.qbp.ouw.ouw.vt(com.bytedance.sdk.openadsdk.core.zih.ouw(), this.f13380vm) : null);
                    HashMap map = new HashMap();
                    map.put("click_scence", 1);
                    ouwVar.ouw(map);
                }
                Activity activity2 = this.ouw.jvy;
                if (activity2 != null && activity2 != null) {
                    ouwVar.f13631tc = new WeakReference<>(activity2);
                }
                raVar.setOnTouchListener(ouwVar);
                raVar.setOnClickListener(ouwVar);
            }
            vpp vppVar2 = this.vt;
            if (vppVar2 != null && this.zih != null) {
                List<zih> list2 = vppVar2.f13791tc;
                if (list2 != null && list2.size() > 0 && (zihVar2 = list2.get(0)) != null) {
                    try {
                        int i10 = zihVar2.vt;
                        int i11 = zihVar2.f13812lh;
                        if (i10 == 0 || i11 == 0) {
                            int i12 = this.f13378ko;
                            if (i12 == 33) {
                                this.zih.setRatio(1.0f);
                            } else if (i12 == 3) {
                                this.zih.setRatio(1.91f);
                            } else {
                                this.zih.setRatio(0.56f);
                            }
                        } else {
                            this.zih.setRatio(i10 / i11);
                        }
                    } catch (Exception e10) {
                        qbp.lh("TTAD.RFTI", e10.getMessage());
                    }
                }
                com.bytedance.sdk.openadsdk.component.reward.view.ra raVar3 = this.zih;
                vpp vppVar3 = this.vt;
                if (vppVar3 != null && (list = vppVar3.f13791tc) != null && list.size() > 0 && (zihVar = list.get(0)) != null) {
                    zih zihVar3 = list.get(0);
                    yu.ouw.ouw(yu.ouw.vt.ouw(zihVar3.ouw).ouw(zihVar3.vt).vt(zihVar3.f13812lh).fkw(osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw())).yu(osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw())).ouw(zihVar3.f13811le)).lh(1).vt(com.bytedance.sdk.openadsdk.tlj.lh.ouw(this.vt, zihVar.ouw, raVar3));
                }
            }
            frameLayout.addView(this.f13379rn);
        } catch (Exception e11) {
            Log.e("TTAD.RFTI", "bindAd: ", e11);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final void ouw(bly blyVar) {
        if (th.vt(this.vt)) {
            yu.ouw(blyVar, this.vt);
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
            ouwVar.f13273sd.ouw((long) (ouwVar.ex.zin() * 1000.0d));
        } else {
            if (!th.yu(this.vt) && !th.ra(this.vt)) {
                super.ouw(blyVar);
                return;
            }
            yu.vt(blyVar, this.vt);
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.ouw;
            if (ouwVar2.euf) {
                return;
            }
            ouwVar2.f13273sd.ouw((long) (ouwVar2.ex.zin() * 1000.0d));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.vt.vt
    public final void ra() {
        if (th.vt(this.vt)) {
            this.f13374le.vt(8);
        }
        this.pno.lh(false);
        this.pno.yu(false);
        if (this.vt.rn() == 2) {
            this.pno.ouw(false);
            this.f13374le.le(8);
            return;
        }
        this.pno.ouw(this.vt.ksc());
        if (this.ouw.lvd) {
            Message messageObtain = Message.obtain();
            messageObtain.what = TypedValues.Custom.TYPE_INT;
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
            int iZin = (int) (ouwVar.ex.zin() * 1000.0d);
            ouwVar.bly = iZin;
            messageObtain.arg1 = iZin;
            this.ouw.ux.sendMessage(messageObtain);
        }
    }
}
