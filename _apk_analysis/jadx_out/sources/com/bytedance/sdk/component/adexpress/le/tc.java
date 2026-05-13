package com.bytedance.sdk.component.adexpress.le;

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
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public final class tc extends ImageView {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f12389lh;
    private Paint ouw;
    private int vt;
    private Matrix yu;

    public tc(Context context) {
        this(context, null);
    }

    private tc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private tc(Context context, AttributeSet attributeSet, byte b10) {
        super(context, attributeSet, 0);
        this.vt = 25;
        this.f12389lh = 25;
        Paint paint = new Paint();
        this.ouw = paint;
        paint.setAntiAlias(true);
        this.ouw.setFilterBitmap(true);
        this.yu = new Matrix();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        Drawable drawable = getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
            super.onDraw(canvas);
            return;
        }
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
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
        if (bitmap == null) {
            super.onDraw(canvas);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        float fMax = (bitmap.getWidth() == getWidth() && bitmap.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmap.getWidth(), (getHeight() * 1.0f) / bitmap.getHeight());
        this.yu.setScale(fMax, fMax);
        bitmapShader.setLocalMatrix(this.yu);
        this.ouw.setShader(bitmapShader);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.vt, this.f12389lh, this.ouw);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public final void setXRound(int i10) {
        this.vt = i10;
        postInvalidate();
    }

    public final void setYRound(int i10) {
        this.f12389lh = i10;
        postInvalidate();
    }
}
