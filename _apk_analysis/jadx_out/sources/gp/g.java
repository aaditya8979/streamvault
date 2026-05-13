package gp;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.lang.reflect.Array;
import tv.cjump.jni.NativeBitmapFactory;

/* JADX INFO: compiled from: DrawingCacheHolder.java */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f62744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f62745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap[][] f62746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f62747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f62748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f62749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f62750g;

    public void a(int i10, int i11, int i12, boolean z10, int i13) {
        Bitmap bitmap;
        boolean z11 = true;
        if (!z10 ? i10 > this.f62748e || i11 > this.f62749f : i10 != this.f62748e || i11 != this.f62749f) {
            z11 = false;
        }
        if (z11 && (bitmap = this.f62745b) != null) {
            bitmap.eraseColor(0);
            this.f62744a.setBitmap(this.f62745b);
            d();
            return;
        }
        if (this.f62745b != null) {
            c();
        }
        this.f62748e = i10;
        this.f62749f = i11;
        Bitmap.Config config = Bitmap.Config.ARGB_4444;
        if (i13 == 32) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapA = NativeBitmapFactory.a(i10, i11, config);
        this.f62745b = bitmapA;
        if (i12 > 0) {
            this.f62750g = i12;
            bitmapA.setDensity(i12);
        }
        Canvas canvas = this.f62744a;
        if (canvas != null) {
            canvas.setBitmap(this.f62745b);
            return;
        }
        Canvas canvas2 = new Canvas(this.f62745b);
        this.f62744a = canvas2;
        canvas2.setDensity(i12);
    }

    public final synchronized boolean b(Canvas canvas, float f10, float f11, Paint paint) {
        if (this.f62746c == null) {
            Bitmap bitmap = this.f62745b;
            if (bitmap == null) {
                return false;
            }
            canvas.drawBitmap(bitmap, f10, f11, paint);
            return true;
        }
        for (int i10 = 0; i10 < this.f62746c.length; i10++) {
            int i11 = 0;
            while (true) {
                Bitmap[] bitmapArr = this.f62746c[i10];
                if (i11 < bitmapArr.length) {
                    Bitmap bitmap2 = bitmapArr[i11];
                    if (bitmap2 != null) {
                        float width = (bitmap2.getWidth() * i11) + f10;
                        if (width <= canvas.getWidth() && bitmap2.getWidth() + width >= 0.0f) {
                            float height = (bitmap2.getHeight() * i10) + f11;
                            if (height <= canvas.getHeight() && bitmap2.getHeight() + height >= 0.0f) {
                                canvas.drawBitmap(bitmap2, width, height, paint);
                            }
                        }
                    }
                    i11++;
                }
            }
        }
        return true;
    }

    public synchronized void c() {
        Bitmap bitmap = this.f62745b;
        this.f62745b = null;
        this.f62749f = 0;
        this.f62748e = 0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        d();
        this.f62747d = null;
    }

    public final void d() {
        Bitmap[][] bitmapArr = this.f62746c;
        this.f62746c = null;
        if (bitmapArr != null) {
            for (int i10 = 0; i10 < bitmapArr.length; i10++) {
                int i11 = 0;
                while (true) {
                    Bitmap[] bitmapArr2 = bitmapArr[i10];
                    if (i11 < bitmapArr2.length) {
                        Bitmap bitmap = bitmapArr2[i11];
                        if (bitmap != null) {
                            bitmap.recycle();
                            bitmapArr[i10][i11] = null;
                        }
                        i11++;
                    }
                }
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void e(int i10, int i11, int i12, int i13) {
        int i14;
        d();
        int i15 = this.f62748e;
        if (i15 <= 0 || (i14 = this.f62749f) <= 0 || this.f62745b == null) {
            return;
        }
        if (i15 > i12 || i14 > i13) {
            int iMin = Math.min(i12, i10);
            int iMin2 = Math.min(i13, i11);
            int i16 = this.f62748e;
            int i17 = (i16 / iMin) + (i16 % iMin == 0 ? 0 : 1);
            int i18 = this.f62749f;
            int i19 = (i18 / iMin2) + (i18 % iMin2 == 0 ? 0 : 1);
            int i20 = i16 / i17;
            int i21 = i18 / i19;
            Bitmap[][] bitmapArr = (Bitmap[][]) Array.newInstance((Class<?>) Bitmap.class, i19, i17);
            if (this.f62744a == null) {
                Canvas canvas = new Canvas();
                this.f62744a = canvas;
                int i22 = this.f62750g;
                if (i22 > 0) {
                    canvas.setDensity(i22);
                }
            }
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            for (int i23 = 0; i23 < i19; i23++) {
                for (int i24 = 0; i24 < i17; i24++) {
                    Bitmap[] bitmapArr2 = bitmapArr[i23];
                    Bitmap bitmapA = NativeBitmapFactory.a(i20, i21, Bitmap.Config.ARGB_8888);
                    bitmapArr2[i24] = bitmapA;
                    int i25 = this.f62750g;
                    if (i25 > 0) {
                        bitmapA.setDensity(i25);
                    }
                    this.f62744a.setBitmap(bitmapA);
                    int i26 = i24 * i20;
                    int i27 = i23 * i21;
                    rect.set(i26, i27, i26 + i20, i27 + i21);
                    rect2.set(0, 0, bitmapA.getWidth(), bitmapA.getHeight());
                    this.f62744a.drawBitmap(this.f62745b, rect, rect2, (Paint) null);
                }
            }
            this.f62744a.setBitmap(this.f62745b);
            this.f62746c = bitmapArr;
        }
    }
}
