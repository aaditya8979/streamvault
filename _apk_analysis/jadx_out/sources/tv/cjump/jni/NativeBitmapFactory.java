package tv.cjump.jni;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import androidx.core.internal.view.SupportMenu;
import com.ironsource.C3978d4;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public class NativeBitmapFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f85422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f85423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f85424c;

    public static Bitmap a(int i10, int i11, Bitmap.Config config) {
        return b(i10, i11, config, config.equals(Bitmap.Config.ARGB_4444) || config.equals(Bitmap.Config.ARGB_8888));
    }

    public static synchronized Bitmap b(int i10, int i11, Bitmap.Config config, boolean z10) {
        if (f85423b && f85422a != null) {
            return c(i10, i11, config, z10);
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    public static Bitmap c(int i10, int i11, Bitmap.Config config, boolean z10) {
        return createBitmap(i10, i11, d(config), z10);
    }

    private static native Bitmap createBitmap(int i10, int i11, int i12, boolean z10);

    public static int d(Bitmap.Config config) {
        try {
            Field field = f85422a;
            if (field == null) {
                return 0;
            }
            return field.getInt(config);
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
            return 0;
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    public static void e() {
        try {
            Field declaredField = Bitmap.Config.class.getDeclaredField("nativeInt");
            f85422a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            f85422a = null;
            e10.printStackTrace();
        }
    }

    public static void f() {
        if (f85424c) {
            return;
        }
        if (!DanDeviceUtils.g() && !DanDeviceUtils.h()) {
            f85424c = true;
            f85423b = false;
            return;
        }
        if (f85423b) {
            return;
        }
        try {
            f85424c = true;
            f85423b = false;
        } catch (Error e10) {
            e10.printStackTrace();
            f85424c = true;
            f85423b = false;
        } catch (Exception e11) {
            e11.printStackTrace();
            f85424c = true;
            f85423b = false;
        }
        if (f85423b) {
            if (init()) {
                e();
                if (!h()) {
                    release();
                    f85424c = true;
                    f85423b = false;
                }
            } else {
                release();
                f85424c = true;
                f85423b = false;
            }
        }
        Log.e("NativeBitmapFactory", C3978d4.i.f31359r + f85423b);
    }

    public static synchronized void g() {
        boolean z10 = f85423b;
        f85422a = null;
        f85423b = false;
        if (z10) {
            release();
        }
    }

    @SuppressLint({"NewApi"})
    public static boolean h() {
        if (f85422a == null) {
            return false;
        }
        Bitmap bitmapC = null;
        try {
            try {
                bitmapC = c(2, 2, Bitmap.Config.ARGB_8888, true);
                boolean zIsPremultiplied = bitmapC != null && bitmapC.getWidth() == 2 && bitmapC.getHeight() == 2;
                if (zIsPremultiplied) {
                    if (!bitmapC.isPremultiplied()) {
                        bitmapC.setPremultiplied(true);
                    }
                    Canvas canvas = new Canvas(bitmapC);
                    Paint paint = new Paint();
                    paint.setColor(SupportMenu.CATEGORY_MASK);
                    paint.setTextSize(20.0f);
                    canvas.drawRect(0.0f, 0.0f, bitmapC.getWidth(), bitmapC.getHeight(), paint);
                    canvas.drawText("TestLib", 0.0f, 0.0f, paint);
                    zIsPremultiplied = bitmapC.isPremultiplied();
                }
                if (bitmapC != null) {
                    bitmapC.recycle();
                }
                return zIsPremultiplied;
            } catch (Error unused) {
                if (bitmapC != null) {
                    bitmapC.recycle();
                }
                return false;
            } catch (Exception e10) {
                Log.e("NativeBitmapFactory", "exception:" + e10.toString());
                if (bitmapC != null) {
                    bitmapC.recycle();
                }
                return false;
            }
        } catch (Throwable th2) {
            if (bitmapC != null) {
                bitmapC.recycle();
            }
            throw th2;
        }
    }

    private static native boolean init();

    private static native boolean release();
}
