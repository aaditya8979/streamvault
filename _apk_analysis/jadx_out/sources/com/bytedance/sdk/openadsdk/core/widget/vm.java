package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.cf.lh.yu;
import com.bytedance.sdk.openadsdk.core.ksc;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class vm implements com.bytedance.sdk.openadsdk.core.bly.ko, com.bytedance.sdk.openadsdk.core.cf.lh.ouw, yu.ouw, ksc {
    private int bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private boolean f14081cf;
    private final com.bytedance.sdk.openadsdk.core.le.lh fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.lh.ouw f14082le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final ouw f14083lh;
    public boolean ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private bs f14084ra;
    private final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw vt;
    private final com.bytedance.sdk.openadsdk.core.cf.lh.vt yu;
    private int pno = 0;
    private int tlj = 1;

    public interface ouw {
        void fkw();

        void le();

        void lh();

        void ouw();

        void vt();

        int yu();
    }

    public vm(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar, ouw ouwVar2) {
        this.vt = ouwVar;
        this.f14083lh = ouwVar2;
        this.fkw = new com.bytedance.sdk.openadsdk.core.le.lh(ouwVar.jvy) { // from class: com.bytedance.sdk.openadsdk.core.widget.vm.1
            @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
                return super.dispatchTouchEvent(motionEvent);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
            public void onMeasure(int i10, int i11) {
                if (1 == 0) {
                    setMeasuredDimension(0, 0);
                } else {
                    super.onMeasure(i10, i11);
                }
            }

            @Override // android.view.View
            public final void onWindowFocusChanged(boolean z10) {
                super.onWindowFocusChanged(z10);
                vm.this.ouw(z10);
            }
        };
        com.bytedance.sdk.openadsdk.core.cf.lh.vt vtVar = new com.bytedance.sdk.openadsdk.core.cf.lh.vt(ouwVar.hun, ouwVar.vt, true);
        this.yu = vtVar;
        vtVar.ouw((com.bytedance.sdk.openadsdk.core.bly.ko) this);
        vtVar.ouw((com.bytedance.sdk.openadsdk.core.cf.lh.ouw) this);
        com.bytedance.sdk.openadsdk.core.cf.lh.lh lhVar = vtVar.ouw;
        if (lhVar instanceof com.bytedance.sdk.openadsdk.core.cf.lh.yu) {
            com.bytedance.sdk.openadsdk.core.cf.lh.yu yuVar = (com.bytedance.sdk.openadsdk.core.cf.lh.yu) lhVar;
            yuVar.vt = this;
            bs bsVar = yuVar.ouw;
            this.f14084ra = bsVar;
            if (bsVar != null) {
                bsVar.f13484pd = this;
                bsVar.ouw = ouwVar.vt.vt();
            }
        }
        Context context = ouwVar.hun;
        vpp vppVar = ouwVar.vt;
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar3 = new com.bytedance.sdk.openadsdk.core.lh.ouw(context, vppVar, vppVar.vt(), uoy.vt(ouwVar.vt));
        this.f14082le = ouwVar3;
        ouwVar3.ouw(com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), ouwVar.vt.vt()));
        HashMap map = new HashMap();
        if (od.vt(ouwVar.vt)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 2);
        }
        ouwVar3.ouw(map);
    }

    private void cf() {
        this.fkw.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(boolean z10) {
        com.bytedance.sdk.openadsdk.core.cf.lh.lh lhVar = this.yu.ouw;
        if (lhVar instanceof com.bytedance.sdk.openadsdk.core.cf.lh.yu) {
            ((com.bytedance.sdk.openadsdk.core.cf.lh.yu) lhVar).ouw(z10);
        }
    }

    public final void bly() {
        this.ouw = true;
        ViewParent parent = this.fkw.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.fkw);
        }
        com.bytedance.sdk.openadsdk.core.cf.lh.vt vtVar = this.yu;
        if (vtVar != null) {
            vtVar.lh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final long fkw() {
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final boolean l_() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final int le() {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final void lh() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i10, com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i10, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.lh.ouw
    public final void ouw(View view, int i10, com.bytedance.sdk.component.adexpress.lh lhVar) {
        if (i10 == 2) {
            com.bytedance.sdk.openadsdk.core.model.ko koVar = (com.bytedance.sdk.openadsdk.core.model.ko) lhVar;
            String str = koVar.f13673ra;
            if (koVar.ryl > 0) {
                com.bytedance.sdk.openadsdk.core.uoy.ouw(true);
            }
            com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar = this.f14082le;
            ouwVar.ex = str;
            ouwVar.ouw(view, koVar.ouw, koVar.vt, koVar.f13672lh, koVar.yu, koVar.tlj, koVar.f13668cf);
            this.vt.fqk.kn();
            com.bytedance.sdk.openadsdk.core.uoy.ouw(false);
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.vt.vt, 9);
        }
    }

    public final void ouw(ViewGroup viewGroup) {
        View viewVt = this.yu.vt();
        if (viewVt == null) {
            return;
        }
        viewVt.setVisibility(4);
        viewGroup.addView(viewVt, new ViewGroup.LayoutParams(-1, -1));
        this.yu.ouw();
        this.bly = 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(String str, JSONObject jSONObject) {
        ouw ouwVar;
        if (!"skipToNextAd".equals(str) || (ouwVar = this.f14083lh) == null) {
            return;
        }
        ouwVar.ouw();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(boolean z10, String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ouw(android.app.Activity r7) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.widget.vm.ouw(android.app.Activity):boolean");
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final boolean ouw(JSONObject jSONObject) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ksc
    public final void p_() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.lh.yu.ouw
    public final void pno() {
        if (this.bly != 1) {
            return;
        }
        this.bly = 3;
        View viewVt = this.yu.vt();
        if (viewVt != null) {
            ViewGroup viewGroup = (ViewGroup) viewVt.getParent();
            if (viewGroup != null) {
                if (viewGroup == this.fkw) {
                    return;
                } else {
                    viewGroup.removeView(viewVt);
                }
            }
            if (this.fkw != null) {
                viewVt.setVisibility(0);
                this.fkw.addView(viewVt, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ksc
    public final int q_() {
        ouw ouwVar = this.f14083lh;
        if (ouwVar != null) {
            return ouwVar.yu();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ksc
    public final void r_() {
        ouw ouwVar = this.f14083lh;
        if (ouwVar != null) {
            ouwVar.fkw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ra() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.ksc
    public final void s_() {
        ouw ouwVar = this.f14083lh;
        if (ouwVar != null) {
            ouwVar.le();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ksc
    public final void t_() {
        this.tlj = 2;
    }

    public final boolean tlj() {
        return this.fkw.isAttachedToWindow() && this.fkw.getVisibility() == 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ksc
    public final void vt() {
        if (this.ouw || !tlj()) {
            return;
        }
        cf();
        ouw ouwVar = this.f14083lh;
        if (ouwVar != null) {
            ouwVar.vt();
        }
        ouw(false);
        bs bsVar = this.f14084ra;
        if (bsVar != null) {
            bsVar.ouw("popupDidDismiss", (JSONObject) null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final void vt(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ko
    public final long yu() {
        return 0L;
    }
}
