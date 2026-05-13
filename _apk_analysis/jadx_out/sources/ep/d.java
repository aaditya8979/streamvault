package ep;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: compiled from: DrawHelper.java */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Paint f61271a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Paint f61272b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static RectF f61273c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f61274d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f61275e = true;

    static {
        Paint paint = new Paint();
        f61271a = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        f61271a.setColor(0);
        f61273c = new RectF();
    }

    public static void a(Canvas canvas) {
        if (!f61274d) {
            f61273c.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            c(canvas, f61273c);
        } else if (f61275e) {
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        } else {
            canvas.drawColor(0);
        }
    }

    public static void b(Canvas canvas, float f10, float f11, float f12, float f13) {
        f61273c.set(f10, f11, f12, f13);
        c(canvas, f61273c);
    }

    public static void c(Canvas canvas, RectF rectF) {
        if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
            return;
        }
        canvas.drawRect(rectF, f61271a);
    }

    public static void d(Canvas canvas, String str) {
        if (f61272b == null) {
            Paint paint = new Paint();
            f61272b = paint;
            paint.setColor(SupportMenu.CATEGORY_MASK);
            f61272b.setTextSize(30.0f);
        }
        int height = canvas.getHeight() - 50;
        b(canvas, 10.0f, height - 50, (int) (f61272b.measureText(str) + 20.0f), canvas.getHeight());
        canvas.drawText(str, 10.0f, height, f61272b);
    }

    public static void e(boolean z10, boolean z11) {
        f61274d = z10;
        f61275e = z11;
    }
}
