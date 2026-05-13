package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.le.vpp;

/* JADX INFO: loaded from: classes4.dex */
public final class yu extends zih<com.bytedance.sdk.component.adexpress.le.ra> {
    public yu(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar) {
        super(context, fkwVar, raVar);
        this.ouw = new com.bytedance.sdk.component.adexpress.le.ra(this.vt);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.vt, raVar.yu.f12317xn);
        this.ouw.setLayoutParams(layoutParams);
        this.ouw.setSlideText(this.yu.yu.f12315vm);
        vpp vppVar = this.ouw;
        if (vppVar instanceof com.bytedance.sdk.component.adexpress.le.ra) {
            ((com.bytedance.sdk.component.adexpress.le.ra) vppVar).setButtonText(this.yu.pno());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.zih, com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void ouw() {
        this.ouw.ouw();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.zih, com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void vt() {
        this.ouw.vt();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.zih
    public final void yu() {
    }
}
