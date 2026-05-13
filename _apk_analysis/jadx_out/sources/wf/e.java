package wf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: FastBitmapDrawable.java */
/* JADX INFO: loaded from: classes12.dex */
public class e extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f86385b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86388e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f86384a = new Paint(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f86386c = 255;

    public e(Bitmap bitmap) {
        b(bitmap);
    }

    public Bitmap a() {
        return this.f86385b;
    }

    public void b(Bitmap bitmap) {
        this.f86385b = bitmap;
        if (bitmap != null) {
            this.f86387d = bitmap.getWidth();
            this.f86388e = this.f86385b.getHeight();
        } else {
            this.f86388e = 0;
            this.f86387d = 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f86385b;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.f86385b, (Rect) null, getBounds(), this.f86384a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f86386c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f86388e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f86387d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f86388e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f86387d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f86386c = i10;
        this.f86384a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f86384a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f86384a.setFilterBitmap(z10);
    }
}
