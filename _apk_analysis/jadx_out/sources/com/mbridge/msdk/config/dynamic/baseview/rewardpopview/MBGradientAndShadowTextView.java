package com.mbridge.msdk.config.dynamic.baseview.rewardpopview;

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
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewConst;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes6.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LinearGradient f36592e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f36594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f36595c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f36596d = 40;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f36597e = 3.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f36598f = 1.5f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f36599g = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f36588a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f36589b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f36590c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f36591d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36588a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f36589b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f36590c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f36591d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f36588a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f36589b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f36590c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f36591d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    @RequiresApi(api = 21)
    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f36588a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f36589b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f36590c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f36591d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, a aVar) {
        super(context);
        this.f36588a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f36589b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f36590c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f36591d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (aVar != null) {
            this.f36588a = aVar.f36593a;
            this.f36589b = aVar.f36594b;
            this.f36590c = aVar.f36595c;
            this.f36591d = aVar.f36596d;
            this.mShadowRadius = aVar.f36597e;
            this.mShadowDx = aVar.f36598f;
            this.mShadowDy = aVar.f36599g;
        }
        a();
    }

    private void a() {
        setTextSize(this.f36591d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f36592e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f36588a, this.f36589b, Shader.TileMode.CLAMP);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f36590c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f36592e);
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
