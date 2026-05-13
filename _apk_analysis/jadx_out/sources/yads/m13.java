package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.preference.PreferenceManager;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class m13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i13 f92207a = new i13();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f92208b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f92209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f92210d;

    public m13() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#2E7D32"));
        paint.setStrokeWidth(10.0f);
        this.f92209c = paint;
        this.f92210d = new Rect();
    }

    public final void a(ImageView imageView, Bitmap bitmap, g13 g13Var) {
        float fFloatValue;
        float width = imageView.getWidth();
        float height = imageView.getHeight();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        float fFloatValue2 = 0.0f;
        Float fValueOf = Float.valueOf(0.0f);
        if (height == 0.0f || height2 == 0.0f) {
            return;
        }
        boolean z10 = width / height > width2 / height2;
        float f10 = z10 ? width / width2 : height / height2;
        float f11 = width2 * f10;
        float f12 = height2 * f10;
        if (z10) {
            fFloatValue = 0.0f;
        } else {
            fFloatValue = (width / 2) - (((g13Var.f89769c / 2) + g13Var.f89767a) * f10);
            Float fValueOf2 = fFloatValue > 0.0f ? fValueOf : fFloatValue + f11 < width ? Float.valueOf(width - f11) : null;
            if (fValueOf2 != null) {
                fFloatValue = fValueOf2.floatValue();
            }
        }
        if (z10) {
            float f13 = (height / 2) - (((g13Var.f89770d / 2) + g13Var.f89768b) * f10);
            if (f13 <= 0.0f) {
                fValueOf = f13 + f12 < height ? Float.valueOf(height - f12) : null;
            }
            fFloatValue2 = fValueOf != null ? fValueOf.floatValue() : f13;
        }
        this.f92208b.setScale(f10, f10);
        this.f92208b.postTranslate(fFloatValue, fFloatValue2);
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setImageMatrix(this.f92208b);
        i13 i13Var = this.f92207a;
        Context context = imageView.getContext();
        i13Var.getClass();
        if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_smart_centers_debug_enabled", false)) {
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(bitmapCopy);
            Rect rect = this.f92210d;
            int i10 = g13Var.f89767a;
            int i11 = g13Var.f89768b;
            rect.set(i10, i11, g13Var.f89769c + i10, g13Var.f89770d + i11);
            canvas.drawRect(rect, this.f92209c);
            imageView.setImageBitmap(bitmapCopy);
        }
    }
}
