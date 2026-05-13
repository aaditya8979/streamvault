package com.bytedance.adsdk.ugeno.le.vt;

import android.view.View;
import com.bytedance.adsdk.ugeno.pno.lh;

/* JADX INFO: loaded from: classes7.dex */
public final class vt implements lh.fkw {
    @Override // com.bytedance.adsdk.ugeno.pno.lh.fkw
    public final void ouw(View view, float f10) {
        int width = view.getWidth();
        if (f10 < -1.0f || f10 > 1.0f) {
            view.setAlpha(0.0f);
            return;
        }
        if (f10 < 0.0f) {
            view.setTranslationX((-width) * f10);
        } else {
            view.setTranslationX(width);
            view.setTranslationX((-width) * f10);
        }
        view.setAlpha(Math.max(0.0f, 1.0f - Math.abs(f10)));
    }
}
