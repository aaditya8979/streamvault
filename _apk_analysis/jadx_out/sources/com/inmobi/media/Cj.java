package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class Cj extends ImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f25271b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f25272a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cj(Context context) {
        super(context);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f25272a = 1.0d;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53135i, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (size == 0 && size2 == 0) {
            super.onMeasure(i10, i11);
            return;
        }
        if (size == 0) {
            setMeasuredDimension((int) (((double) size2) * this.f25272a), size2);
            return;
        }
        if (size2 == 0) {
            setMeasuredDimension(size, (int) (((double) size) / this.f25272a));
            return;
        }
        double d10 = this.f25272a;
        int i12 = (int) (((double) size) / d10);
        if (i12 <= size2) {
            setMeasuredDimension(size, i12);
        } else {
            setMeasuredDimension((int) (((double) size2) * d10), size2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(@Nullable Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (bitmap == null || bitmap.getHeight() <= 0) {
            return;
        }
        this.f25272a = ((double) bitmap.getWidth()) / ((double) bitmap.getHeight());
        requestLayout();
    }
}
