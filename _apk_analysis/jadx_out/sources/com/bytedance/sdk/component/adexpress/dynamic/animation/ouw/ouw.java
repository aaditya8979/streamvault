package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ouw extends yu {
    public ouw(View view, com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar) {
        super(view, ouwVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu
    public final List<ObjectAnimator> ouw() {
        float f10 = r0.zih / 100.0f;
        float f11 = r0.f12326vm / 100.0f;
        if ("reverse".equals(this.vt.pno) && this.vt.f12321le <= 0.0d) {
            f11 = f10;
            f10 = f11;
        }
        this.yu.setAlpha(f10);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yu, "alpha", f10, f11).setDuration((int) (this.vt.vt * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ouw(duration));
        return arrayList;
    }
}
