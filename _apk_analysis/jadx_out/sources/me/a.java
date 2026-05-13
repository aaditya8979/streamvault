package me;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PaintDrawable.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f74119b;

    public a() {
        Paint paint = new Paint();
        this.f74119b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f74119b.setAntiAlias(true);
        this.f74119b.setColor(-5592406);
    }

    public void a(int i10) {
        this.f74119b.setColor(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f74119b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f74119b.setColorFilter(colorFilter);
    }
}
