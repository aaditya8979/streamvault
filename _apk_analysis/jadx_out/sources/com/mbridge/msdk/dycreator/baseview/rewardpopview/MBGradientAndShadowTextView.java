package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes12.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LinearGradient f37067e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    public static class GradientAndShadowParameters {
        public int gradientEndColor;
        public int gradientStartColor;
        public int shadowColor;
        public int textSize = 40;
        public float shadowRadius = 3.0f;
        public float shadowDx = 1.5f;
        public float shadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f37063a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f37064b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f37065c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f37066d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37063a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f37064b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f37065c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f37066d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f37063a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f37064b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f37065c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f37066d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    @RequiresApi(api = 21)
    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f37063a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f37064b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f37065c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f37066d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, GradientAndShadowParameters gradientAndShadowParameters) {
        super(context);
        this.f37063a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f37064b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f37065c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f37066d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (gradientAndShadowParameters != null) {
            this.f37063a = gradientAndShadowParameters.gradientStartColor;
            this.f37064b = gradientAndShadowParameters.gradientEndColor;
            this.f37065c = gradientAndShadowParameters.shadowColor;
            this.f37066d = gradientAndShadowParameters.textSize;
            this.mShadowRadius = gradientAndShadowParameters.shadowRadius;
            this.mShadowDx = gradientAndShadowParameters.shadowDx;
            this.mShadowDy = gradientAndShadowParameters.shadowDy;
        }
        a();
    }

    private void a() {
        setTextSize(this.f37066d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f37067e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f37063a, this.f37064b, Shader.TileMode.CLAMP);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f37065c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f37067e);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
