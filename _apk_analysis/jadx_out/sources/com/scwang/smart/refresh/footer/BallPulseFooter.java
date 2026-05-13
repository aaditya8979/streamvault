package com.scwang.smart.refresh.footer;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.ColorUtils;
import com.scwang.smart.refresh.footer.ball.R$styleable;
import oe.c;
import oe.f;
import re.b;

/* JADX INFO: loaded from: classes9.dex */
public class BallPulseFooter extends b implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f53222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f53223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Paint f53224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f53225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f53226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f53227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f53228k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f53229l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TimeInterpolator f53230m;

    public BallPulseFooter(Context context) {
        this(context, null);
    }

    public BallPulseFooter(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f53225h = -1118482;
        this.f53226i = -1615546;
        this.f53228k = 0L;
        this.f53229l = false;
        this.f53230m = new AccelerateDecelerateInterpolator();
        setMinimumHeight(se.b.c(60.0f));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BallPulseFooter);
        Paint paint = new Paint();
        this.f53224g = paint;
        paint.setColor(-1);
        this.f53224g.setStyle(Paint.Style.FILL);
        this.f53224g.setAntiAlias(true);
        pe.b bVar = pe.b.f77285d;
        this.f78899c = bVar;
        this.f78899c = pe.b.f77290i[typedArrayObtainStyledAttributes.getInt(R$styleable.BallPulseFooter_srlClassicsSpinnerStyle, bVar.f77291a)];
        int i10 = R$styleable.BallPulseFooter_srlNormalColor;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            s(typedArrayObtainStyledAttributes.getColor(i10, 0));
        }
        int i11 = R$styleable.BallPulseFooter_srlAnimatingColor;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            r(typedArrayObtainStyledAttributes.getColor(i11, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f53227j = se.b.c(4.0f);
    }

    @Override // re.b, oe.a
    public void d(@NonNull f fVar, int i10, int i11) {
        if (this.f53229l) {
            return;
        }
        invalidate();
        this.f53229l = true;
        this.f53228k = System.currentTimeMillis();
        this.f53224g.setColor(this.f53226i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        float fMin = Math.min(width, height);
        float f10 = this.f53227j;
        float f11 = (fMin - (f10 * 2.0f)) / 6.0f;
        float f12 = f11 * 2.0f;
        float f13 = (width / 2.0f) - (f10 + f12);
        float f14 = height / 2.0f;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        while (i10 < 3) {
            int i11 = i10 + 1;
            float interpolation = this.f53230m.getInterpolation((jCurrentTimeMillis - this.f53228k) - ((long) (i11 * 120)) > 0 ? (r10 % 750) / 750.0f : 0.0f);
            canvas.save();
            float f15 = i10;
            canvas.translate((f12 * f15) + f13 + (this.f53227j * f15), f14);
            if (interpolation < 0.5d) {
                float f16 = 1.0f - ((interpolation * 2.0f) * 0.7f);
                canvas.scale(f16, f16);
            } else {
                float f17 = ((interpolation * 2.0f) * 0.7f) - 0.4f;
                canvas.scale(f17, f17);
            }
            canvas.drawCircle(0.0f, 0.0f, f11, this.f53224g);
            canvas.restore();
            i10 = i11;
        }
        super.dispatchDraw(canvas);
        if (this.f53229l) {
            invalidate();
        }
    }

    @Override // re.b, oe.a
    public int j(@NonNull f fVar, boolean z10) {
        this.f53229l = false;
        this.f53228k = 0L;
        this.f53224g.setColor(this.f53225h);
        return 0;
    }

    public BallPulseFooter r(@ColorInt int i10) {
        this.f53226i = i10;
        this.f53223f = true;
        if (this.f53229l) {
            this.f53224g.setColor(i10);
        }
        return this;
    }

    public BallPulseFooter s(@ColorInt int i10) {
        this.f53225h = i10;
        this.f53222e = true;
        if (!this.f53229l) {
            this.f53224g.setColor(i10);
        }
        return this;
    }

    @Override // re.b, oe.a
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (!this.f53223f && iArr.length > 1) {
            r(iArr[0]);
            this.f53223f = false;
        }
        if (this.f53222e) {
            return;
        }
        if (iArr.length > 1) {
            s(iArr[1]);
        } else if (iArr.length > 0) {
            s(ColorUtils.compositeColors(-1711276033, iArr[0]));
        }
        this.f53222e = false;
    }
}
