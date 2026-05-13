package com.bytedance.adsdk.ugeno.le.vt;

import android.view.View;
import com.bytedance.adsdk.ugeno.pno.lh;

/* JADX INFO: loaded from: classes2.dex */
public final class ouw implements lh.fkw {
    @Override // com.bytedance.adsdk.ugeno.pno.lh.fkw
    public final void ouw(View view, float f10) {
        view.setPivotX(f10 < 0.0f ? view.getWidth() : 0.0f);
        view.setPivotY(view.getHeight() * 0.5f);
        view.setRotationY(f10 * 90.0f);
    }
}
