package com.applovin.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes6.dex */
public class i0 extends View {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f8459w = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f8460x = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f8461y = Color.rgb(66, 145, 241);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f8462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f8463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f8464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f8465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RectF f8466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f8467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8470i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8471j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8472k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f8473l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f8474m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f8475n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f8476o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f8477p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f8478q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f8479r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float f8480s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f8481t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final float f8482u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f8483v;

    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static float c(Resources resources, float f10) {
            return (f10 * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static float d(Resources resources, float f10) {
            return f10 * resources.getDisplayMetrics().scaledDensity;
        }
    }

    public i0(Context context) {
        this(context, null);
    }

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public i0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8466e = new RectF();
        this.f8470i = 0;
        this.f8475n = "";
        this.f8476o = "";
        this.f8478q = "";
        this.f8481t = a.d(getResources(), 14.0f);
        this.f8483v = (int) a.c(getResources(), 100.0f);
        this.f8480s = a.c(getResources(), 4.0f);
        this.f8482u = a.d(getResources(), 18.0f);
        a();
        b();
    }

    private int a(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        int i11 = this.f8483v;
        return mode == Integer.MIN_VALUE ? Math.min(i11, size) : i11;
    }

    private float getProgressAngle() {
        return (getProgress() / this.f8471j) * 360.0f;
    }

    public void a() {
        this.f8472k = f8459w;
        this.f8468g = f8460x;
        this.f8467f = this.f8481t;
        setMax(100);
        setProgress(0);
        this.f8473l = this.f8480s;
        this.f8474m = 0;
        this.f8477p = this.f8482u;
        this.f8469h = f8461y;
    }

    public void b() {
        TextPaint textPaint = new TextPaint();
        this.f8464c = textPaint;
        textPaint.setColor(this.f8468g);
        this.f8464c.setTextSize(this.f8467f);
        this.f8464c.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.f8465d = textPaint2;
        textPaint2.setColor(this.f8469h);
        this.f8465d.setTextSize(this.f8477p);
        this.f8465d.setAntiAlias(true);
        Paint paint = new Paint();
        this.f8462a = paint;
        paint.setColor(this.f8472k);
        this.f8462a.setStyle(Paint.Style.STROKE);
        this.f8462a.setAntiAlias(true);
        this.f8462a.setStrokeWidth(this.f8473l);
        Paint paint2 = new Paint();
        this.f8463b = paint2;
        paint2.setColor(this.f8474m);
        this.f8463b.setAntiAlias(true);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53127a, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getFinishedStrokeColor() {
        return this.f8472k;
    }

    public float getFinishedStrokeWidth() {
        return this.f8473l;
    }

    public int getInnerBackgroundColor() {
        return this.f8474m;
    }

    public String getInnerBottomText() {
        return this.f8478q;
    }

    public int getInnerBottomTextColor() {
        return this.f8469h;
    }

    public float getInnerBottomTextSize() {
        return this.f8477p;
    }

    public int getMax() {
        return this.f8471j;
    }

    public String getPrefixText() {
        return this.f8475n;
    }

    public int getProgress() {
        return this.f8470i;
    }

    public String getSuffixText() {
        return this.f8476o;
    }

    public int getTextColor() {
        return this.f8468g;
    }

    public float getTextSize() {
        return this.f8467f;
    }

    @Override // android.view.View
    public void invalidate() {
        b();
        super.invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f8473l;
        this.f8466e.set(f10, f10, getWidth() - f10, getHeight() - f10);
        float width = getWidth();
        float f11 = this.f8473l;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((width - f11) + f11) / 2.0f, this.f8463b);
        canvas.drawArc(this.f8466e, 270.0f, -getProgressAngle(), false, this.f8462a);
        String str = this.f8475n + this.f8470i + this.f8476o;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.f8464c.measureText(str)) / 2.0f, (getWidth() - (this.f8464c.descent() + this.f8464c.ascent())) / 2.0f, this.f8464c);
        }
        if (TextUtils.isEmpty(getInnerBottomText())) {
            return;
        }
        this.f8465d.setTextSize(this.f8477p);
        canvas.drawText(getInnerBottomText(), (getWidth() - this.f8465d.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.f8479r) - ((this.f8464c.descent() + this.f8464c.ascent()) / 2.0f), this.f8465d);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(a(i10), a(i11));
        this.f8479r = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f8468g = bundle.getInt("text_color");
        this.f8467f = bundle.getFloat("text_size");
        this.f8477p = bundle.getFloat("inner_bottom_text_size");
        this.f8478q = bundle.getString("inner_bottom_text");
        this.f8469h = bundle.getInt("inner_bottom_text_color");
        this.f8472k = bundle.getInt("finished_stroke_color");
        this.f8473l = bundle.getFloat("finished_stroke_width");
        this.f8474m = bundle.getInt("inner_background_color");
        b();
        setMax(bundle.getInt("max"));
        setProgress(bundle.getInt("progress"));
        this.f8475n = bundle.getString("prefix");
        this.f8476o = bundle.getString("suffix");
        super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", getTextColor());
        bundle.putFloat("text_size", getTextSize());
        bundle.putFloat("inner_bottom_text_size", getInnerBottomTextSize());
        bundle.putFloat("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putString("inner_bottom_text", getInnerBottomText());
        bundle.putInt("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putInt("finished_stroke_color", getFinishedStrokeColor());
        bundle.putInt("max", getMax());
        bundle.putInt("progress", getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public void setFinishedStrokeColor(int i10) {
        this.f8472k = i10;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f10) {
        this.f8473l = f10;
        invalidate();
    }

    public void setInnerBackgroundColor(int i10) {
        this.f8474m = i10;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f8478q = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i10) {
        this.f8469h = i10;
        invalidate();
    }

    public void setInnerBottomTextSize(float f10) {
        this.f8477p = f10;
        invalidate();
    }

    public void setMax(int i10) {
        if (i10 > 0) {
            this.f8471j = i10;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f8475n = str;
        invalidate();
    }

    public void setProgress(int i10) {
        this.f8470i = i10;
        if (i10 > getMax()) {
            this.f8470i %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f8476o = str;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.f8468g = i10;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f8467f = f10;
        invalidate();
    }
}
