package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes3.dex */
public class MBridgeImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Xfermode f36961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f36970j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f36971k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float[] f36972l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private RectF f36973m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RectF f36974n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f36975o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f36976p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Path f36977q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Paint f36978r;

    public MBridgeImageView(Context context) {
        this(context, null);
    }

    public MBridgeImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBridgeImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f36977q = new Path();
        this.f36978r = new Paint();
        this.f36971k = new float[8];
        this.f36972l = new float[8];
        this.f36974n = new RectF();
        this.f36973m = new RectF();
        this.f36961a = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    private void a() {
        if (this.f36971k == null || this.f36972l == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                float[] fArr = this.f36971k;
                if (i10 >= fArr.length) {
                    return;
                }
                float f10 = this.f36964d;
                fArr[i10] = f10;
                this.f36972l[i10] = f10 - (this.f36969i / 2.0f);
                i10++;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
    }

    private void a(int i10, int i11) {
        Path path = this.f36977q;
        if (path != null) {
            path.reset();
        }
        Paint paint = this.f36978r;
        if (paint != null) {
            paint.setStrokeWidth(i10);
            this.f36978r.setColor(i11);
            this.f36978r.setStyle(Paint.Style.STROKE);
        }
    }

    private void a(Canvas canvas) {
        a(canvas, this.f36969i, this.f36970j, this.f36974n, this.f36971k);
    }

    private void a(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        try {
            a(i10, i11);
            Path path = this.f36977q;
            if (path != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
            if (canvas != null) {
                canvas.drawPath(this.f36977q, this.f36978r);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void b() {
        int i10;
        int i11;
        int i12;
        try {
            if (this.f36971k == null || this.f36972l == null) {
                return;
            }
            int i13 = 0;
            while (true) {
                i10 = 2;
                if (i13 >= 2) {
                    break;
                }
                float[] fArr = this.f36971k;
                float f10 = this.f36965e;
                fArr[i13] = f10;
                this.f36972l[i13] = f10 - (this.f36969i / 2.0f);
                i13++;
            }
            while (true) {
                i11 = 4;
                if (i10 >= 4) {
                    break;
                }
                float[] fArr2 = this.f36971k;
                float f11 = this.f36966f;
                fArr2[i10] = f11;
                this.f36972l[i10] = f11 - (this.f36969i / 2.0f);
                i10++;
            }
            while (true) {
                if (i11 >= 6) {
                    break;
                }
                float[] fArr3 = this.f36971k;
                float f12 = this.f36967g;
                fArr3[i11] = f12;
                this.f36972l[i11] = f12 - (this.f36969i / 2.0f);
                i11++;
            }
            for (i12 = 6; i12 < 8; i12++) {
                float[] fArr4 = this.f36971k;
                float f13 = this.f36968h;
                fArr4[i12] = f13;
                this.f36972l[i12] = f13 - (this.f36969i / 2.0f);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void c() {
        RectF rectF = this.f36974n;
        if (rectF != null) {
            float f10 = this.f36969i / 2.0f;
            rectF.set(f10, f10, this.f36962b - f10, this.f36963c - f10);
        }
    }

    private void d() {
        RectF rectF = this.f36973m;
        if (rectF != null) {
            rectF.set(0.0f, 0.0f, this.f36962b, this.f36963c);
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53141o, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f36973m, null, 31);
            int i10 = this.f36962b;
            int i11 = this.f36969i * 2;
            float f10 = (i10 - i11) * 1.0f;
            float f11 = i10;
            float f12 = this.f36963c;
            canvas.scale(f10 / f11, ((r5 - i11) * 1.0f) / f12, f11 / 2.0f, f12 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f36978r;
            if (paint != null) {
                paint.reset();
                this.f36978r.setAntiAlias(true);
                this.f36978r.setStyle(Paint.Style.FILL);
                this.f36978r.setXfermode(this.f36961a);
            }
            Path path = this.f36977q;
            if (path != null) {
                path.reset();
                this.f36977q.addRoundRect(this.f36973m, this.f36972l, Path.Direction.CCW);
            }
            canvas.drawPath(this.f36977q, this.f36978r);
            Paint paint2 = this.f36978r;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f36975o) {
                a(canvas);
            }
        } catch (Exception e10) {
            q0.a("MBridgeImageView", e10.getMessage());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f36962b = i10;
        this.f36963c = i11;
        if (this.f36976p) {
            b();
        } else {
            a();
        }
        c();
        d();
    }

    public void setBorder(int i10, int i11, int i12) {
        this.f36975o = true;
        this.f36969i = i11;
        this.f36970j = i12;
        this.f36964d = i10;
    }

    public void setCornerRadius(int i10) {
        this.f36964d = i10;
    }

    public void setCustomBorder(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f36975o = true;
        this.f36976p = true;
        this.f36969i = i14;
        this.f36970j = i15;
        this.f36965e = i10;
        this.f36967g = i12;
        this.f36966f = i11;
        this.f36968h = i13;
    }
}
