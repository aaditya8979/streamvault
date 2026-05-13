package com.bytedance.adsdk.ugeno.le.ouw;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes4.dex */
public final class vt extends ouw {
    public vt(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.le.ouw.ouw
    public final Drawable vt(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }
}
