package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public final class jg extends com.bytedance.sdk.openadsdk.core.le.yu {
    private Paint ouw;
    private RectF vt;

    public jg(Context context) {
        super(context);
        Paint paint = new Paint();
        this.ouw = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.ouw.setColor(Color.parseColor("#99333333"));
        this.ouw.setAntiAlias(true);
        this.ouw.setStrokeWidth(0.0f);
        this.vt = new RectF();
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.yu, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.vt;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, rectF.bottom / 2.0f, this.ouw);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.yu, android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.vt.right == getMeasuredWidth() && this.vt.bottom == getMeasuredHeight()) {
            return;
        }
        this.vt.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }
}
