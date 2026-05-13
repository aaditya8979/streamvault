package id;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PaintDrawable.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f64109b;

    public b() {
        Paint paint = new Paint();
        this.f64109b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f64109b.setAntiAlias(true);
        this.f64109b.setColor(-5592406);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f64109b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f64109b.setColorFilter(colorFilter);
    }
}
