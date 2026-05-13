package com.mbridge.msdk.videocommon.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.widget.MBImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes3.dex */
public class RoundImageView extends MBImageView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f42425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f42426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Matrix f42427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BitmapShader f42428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f42429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RectF f42430j;

    public RoundImageView(Context context) {
        super(context);
        this.f42427g = new Matrix();
        Paint paint = new Paint();
        this.f42425e = paint;
        paint.setAntiAlias(true);
        this.f42424d = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f42423c = 1;
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42427g = new Matrix();
        Paint paint = new Paint();
        this.f42425e = paint;
        paint.setAntiAlias(true);
        this.f42424d = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f42423c = 1;
    }

    public RoundImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42427g = new Matrix();
        Paint paint = new Paint();
        this.f42425e = paint;
        paint.setAntiAlias(true);
        this.f42424d = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f42423c = 1;
    }

    private Bitmap a(Drawable drawable) {
        try {
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            q0.b("View", th2.getMessage());
            return null;
        }
    }

    private void b() {
        Bitmap bitmapA;
        try {
            Drawable drawable = getDrawable();
            if (drawable == null || (bitmapA = a(drawable)) == null || bitmapA.isRecycled()) {
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f42428h = new BitmapShader(bitmapA, tileMode, tileMode);
            int i10 = this.f42423c;
            float fMax = 1.0f;
            if (i10 == 0) {
                fMax = (this.f42429i * 1.0f) / Math.min(bitmapA.getWidth(), bitmapA.getHeight());
            } else if (i10 == 1) {
                fMax = Math.max((getWidth() * 1.0f) / bitmapA.getWidth(), (getHeight() * 1.0f) / bitmapA.getHeight());
            }
            this.f42427g.setScale(fMax, fMax);
            this.f42428h.setLocalMatrix(this.f42427g);
            this.f42425e.setShader(this.f42428h);
        } catch (Throwable th2) {
            q0.b("RoundImageView", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.widget.MBImageView, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.widget.MBImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            if (getDrawable() == null) {
                return;
            }
            b();
            if (this.f42423c == 1) {
                RectF rectF = this.f42430j;
                float f10 = this.f42424d;
                canvas.drawRoundRect(rectF, f10, f10, this.f42425e);
            } else {
                float f11 = this.f42426f;
                canvas.drawCircle(f11, f11, f11, this.f42425e);
            }
        } catch (Throwable th2) {
            q0.b("RoundImageView", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.widget.MBImageView, android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f42423c == 0) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.f42429i = iMin;
            this.f42426f = iMin / 2;
            setMeasuredDimension(iMin, iMin);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("state_instance"));
        this.f42423c = bundle.getInt("state_type");
        this.f42424d = bundle.getInt("state_border_radius");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_instance", super.onSaveInstanceState());
        bundle.putInt("state_type", this.f42423c);
        bundle.putInt("state_border_radius", this.f42424d);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f42423c == 1) {
            this.f42430j = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
    }

    public void setBorderRadius(int i10) {
        int iA = v0.a(getContext(), i10);
        if (this.f42424d != iA) {
            this.f42424d = iA;
            invalidate();
        }
    }

    public void setType(int i10) {
        if (this.f42423c != i10) {
            this.f42423c = i10;
            if (i10 != 1 && i10 != 0) {
                this.f42423c = 0;
            }
            requestLayout();
        }
    }
}
