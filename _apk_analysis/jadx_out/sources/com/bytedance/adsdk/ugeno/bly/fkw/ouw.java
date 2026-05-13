package com.bytedance.adsdk.ugeno.bly.fkw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.bytedance.adsdk.ugeno.ra.ra;
import com.bytedance.adsdk.ugeno.yu;

/* JADX INFO: loaded from: classes9.dex */
public final class ouw extends FrameLayout {
    private float fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private LinearLayout f11591le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private float f11592lh;
    public yu ouw;
    private Context pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private LinearLayout f11593ra;
    private float vt;
    private double yu;

    public ouw(Context context) {
        super(context);
        this.pno = context;
        this.f11591le = new LinearLayout(context);
        this.f11593ra = new LinearLayout(context);
        this.f11591le.setOrientation(0);
        this.f11591le.setGravity(GravityCompat.START);
        this.f11593ra.setOrientation(0);
        this.f11593ra.setGravity(GravityCompat.START);
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.vt, (int) this.f11592lh);
        float f10 = this.fkw;
        layoutParams.leftMargin = (int) f10;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = (int) f10;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.le();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.ra();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.fkw();
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.ouw(i10, i11);
        }
        super.onMeasure(i10, i11);
        this.f11591le.measure(i10, i11);
        double dFloor = Math.floor(this.yu);
        float f10 = this.fkw;
        float f11 = this.vt;
        this.f11593ra.measure(View.MeasureSpec.makeMeasureSpec((int) ((((double) (f10 + f10 + f11)) * dFloor) + ((double) f10) + ((this.yu - dFloor) * ((double) f11))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f11591le.getMeasuredHeight(), 1073741824));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.vt(i10, i11);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public final void ouw(double d10, int i10, int i11, float f10, int i12) {
        removeAllViews();
        this.f11591le.removeAllViews();
        this.f11593ra.removeAllViews();
        this.vt = (int) ra.ouw(this.pno, f10);
        this.f11592lh = (int) ra.ouw(this.pno, f10);
        this.yu = d10;
        this.fkw = i12;
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setImageResource(com.bytedance.adsdk.ugeno.ra.yu.vt(this.pno, "tt_ugen_rating_star"));
            starImageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            this.f11593ra.addView(starImageView);
        }
        for (int i14 = 0; i14 < 5; i14++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageResource(com.bytedance.adsdk.ugeno.ra.yu.vt(this.pno, "tt_ugen_rating_star"));
            starImageView2.setColorFilter(i11);
            this.f11591le.addView(starImageView2);
        }
        addView(this.f11591le);
        addView(this.f11593ra);
        requestLayout();
    }
}
