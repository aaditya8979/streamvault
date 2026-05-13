package com.bytedance.sdk.openadsdk.lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes4.dex */
public final class ouw extends com.bytedance.sdk.openadsdk.core.le.pno {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private boolean f14173lh;
    private Paint ouw;
    private float vt;
    private int yu;

    public ouw(Context context) {
        super(context);
        this.vt = osn.vt(getContext());
        this.ouw = new Paint();
    }

    private float ouw(float f10, String str) {
        this.ouw.setTextSize(f10);
        return this.ouw.measureText(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.pno, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        String string = getText().toString();
        int width = getWidth();
        if (this.f14173lh || width <= 0) {
            return;
        }
        float textSize = getTextSize();
        this.ouw.set(getPaint());
        int paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
        float fOuw = ouw(textSize, string);
        while (fOuw > paddingLeft) {
            textSize -= 1.0f;
            this.ouw.setTextSize(textSize);
            if (textSize <= this.vt) {
                break;
            } else {
                fOuw = ouw(textSize, string);
            }
        }
        setTextSize(0, textSize);
        this.f14173lh = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.pno, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.yu = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, this.yu);
        } else {
            layoutParams.height = this.yu;
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.pno, android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        int i10 = this.yu;
        if (i10 == 0 || layoutParams == null) {
            return;
        }
        layoutParams.height = i10;
    }

    public final void setMinTextSize(float f10) {
        if (f10 <= 0.0f) {
            return;
        }
        this.vt = f10;
    }
}
