package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes4.dex */
public class zih extends com.bytedance.sdk.openadsdk.core.le.yu {
    private final RectF fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private BitmapShader f14091le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f14092lh;
    private final Paint ouw;
    private int vt;
    private final Matrix yu;

    public zih(Context context) {
        this(context, null);
    }

    private zih(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private zih(Context context, AttributeSet attributeSet, byte b10) {
        super(context, attributeSet, 0);
        this.vt = 25;
        this.f14092lh = 25;
        this.fkw = new RectF();
        Paint paint = new Paint();
        this.ouw = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.yu = new Matrix();
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.yu, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmap;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f14091le == null) {
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
                int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, width, height);
                drawable.draw(canvas2);
                bitmap = bitmapCreateBitmap;
            }
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                this.f14091le = new BitmapShader(bitmap, tileMode, tileMode);
                float fMax = (bitmap.getWidth() == getWidth() && bitmap.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmap.getWidth(), (getHeight() * 1.0f) / bitmap.getHeight());
                this.yu.setScale(fMax, fMax);
                this.f14091le.setLocalMatrix(this.yu);
            }
        }
        BitmapShader bitmapShader = this.f14091le;
        if (bitmapShader == null) {
            super.onDraw(canvas);
        } else {
            this.ouw.setShader(bitmapShader);
            canvas.drawRoundRect(this.fkw, this.vt, this.f14092lh, this.ouw);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.le.yu, android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.fkw.set(0.0f, 0.0f, i10, i11);
    }

    public void setXRound(int i10) {
        this.vt = i10;
        postInvalidate();
    }

    public void setYRound(int i10) {
        this.f14092lh = i10;
        postInvalidate();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.f14091le = null;
    }
}
