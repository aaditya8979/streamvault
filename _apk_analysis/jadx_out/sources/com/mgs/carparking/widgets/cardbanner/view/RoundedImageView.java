package com.mgs.carparking.widgets.cardbanner.view;

import android.annotation.SuppressLint;
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
import android.widget.ImageView;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: RoundedImageView.kt */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"AppCompatCustomView"})
public final class RoundedImageView extends ImageView {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f45143j = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Paint f45146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Matrix f45148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public BitmapShader f45149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f45150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public RectF f45151i;

    /* JADX INFO: compiled from: RoundedImageView.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        p.k(context, GAMConfig.KEY_CONTEXT);
        this.f45144b = 1;
        this.f45145c = 6;
        this.f45148f = new Matrix();
        Paint paint = new Paint();
        this.f45146d = paint;
        paint.setAntiAlias(true);
    }

    public final Bitmap a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            p.j(bitmap, "getBitmap(...)");
            return bitmap;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        p.j(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public final void b() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        Bitmap bitmapA = a(drawable);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f45149g = new BitmapShader(bitmapA, tileMode, tileMode);
        int i10 = this.f45144b;
        float fMax = 1.0f;
        if (i10 == 0) {
            fMax = (this.f45150h * 1.0f) / Math.min(bitmapA.getWidth(), bitmapA.getHeight());
        } else if (i10 == 1 && (bitmapA.getWidth() != getWidth() || bitmapA.getHeight() != getHeight())) {
            fMax = Math.max((getWidth() * 1.0f) / bitmapA.getWidth(), (getHeight() * 1.0f) / bitmapA.getHeight());
        }
        this.f45148f.setScale(fMax, fMax);
        BitmapShader bitmapShader = this.f45149g;
        p.h(bitmapShader);
        bitmapShader.setLocalMatrix(this.f45148f);
        this.f45146d.setShader(this.f45149g);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        p.k(canvas, "canvas");
        if (getDrawable() == null) {
            return;
        }
        b();
        if (this.f45144b != 1) {
            int i10 = this.f45147e;
            canvas.drawCircle(i10, i10, i10, this.f45146d);
        } else {
            RectF rectF = this.f45151i;
            p.h(rectF);
            int i11 = this.f45145c;
            canvas.drawRoundRect(rectF, i11, i11, this.f45146d);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f45144b == 0) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.f45150h = iMin;
            this.f45147e = iMin / 2;
            setMeasuredDimension(iMin, iMin);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@NotNull Parcelable parcelable) {
        p.k(parcelable, "state");
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("state_instance"));
        this.f45144b = bundle.getInt("state_type");
        this.f45145c = bundle.getInt("state_border_radius");
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_instance", super.onSaveInstanceState());
        bundle.putInt("state_type", this.f45144b);
        bundle.putInt("state_border_radius", this.f45145c);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f45144b == 1) {
            this.f45151i = new RectF(0.0f, 0.0f, i10, i11);
        }
    }

    public final void setBorderRadius(int i10) {
        rd.a aVar = rd.a.f78894a;
        Context context = getContext();
        p.j(context, "getContext(...)");
        int iA = aVar.a(context, i10);
        if (this.f45145c != iA) {
            this.f45145c = iA;
            invalidate();
        }
    }

    public final void setType(int i10) {
        if (this.f45144b != i10) {
            this.f45144b = i10;
            if (i10 != 1 && i10 != 0) {
                this.f45144b = 0;
            }
            requestLayout();
        }
    }
}
