package ke;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import java.util.Arrays;

/* JADX INFO: compiled from: ShadowBitmapDrawable.java */
/* JADX INFO: loaded from: classes8.dex */
public class a extends BitmapDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f73074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f73075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f73076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f73077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f73078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RectF f73079f = new RectF();

    public Bitmap a(int i10, int i11, float f10, float f11, float f12, int i12, float[] fArr) {
        if (i10 <= 0 || i11 <= 0) {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        RectF rectF = new RectF(f10, f10, i10 - f10, i11 - f10);
        rectF.top += Math.abs(f12);
        rectF.bottom -= Math.abs(f12);
        rectF.left += Math.abs(f11);
        rectF.right -= Math.abs(f11);
        Paint paint = new Paint(5);
        paint.setColor(i12);
        paint.setShadowLayer(f10, f11, f12, i12);
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return bitmapCreateBitmap;
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f73079f.set(rect.left + this.f73075b + Math.abs(this.f73077d), rect.top + this.f73075b + Math.abs(this.f73078e), (rect.right - this.f73075b) - Math.abs(this.f73077d), (rect.bottom - this.f73075b) - Math.abs(this.f73078e));
        le.a.b(this, "setBitmap", new Class[]{Bitmap.class}, new Object[]{a((int) this.f73079f.width(), (int) this.f73079f.height(), this.f73075b, this.f73077d, this.f73078e, this.f73074a, this.f73076c)});
    }

    public void c(int i10, float f10, int i11, int i12, float[] fArr) {
        boolean z10 = (this.f73074a == i10 && this.f73075b == f10 && this.f73077d == i11 && this.f73078e == i12 && Arrays.equals(this.f73076c, fArr)) ? false : true;
        this.f73074a = i10;
        this.f73076c = fArr;
        this.f73075b = f10;
        this.f73077d = i11;
        this.f73078e = i12;
        if (z10) {
            le.a.b(this, "setBitmap", new Class[]{Bitmap.class}, new Object[]{a((int) this.f73079f.width(), (int) this.f73079f.height(), this.f73075b, this.f73077d, this.f73078e, this.f73074a, this.f73076c)});
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (rect.right - rect.left <= 0 || rect.bottom - rect.top <= 0) {
            return;
        }
        b(rect);
    }
}
