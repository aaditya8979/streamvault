package ed;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* JADX INFO: compiled from: UIUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static j0 f61080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static float f61081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static float f61082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static float f61083d;

    public j0(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (f61081b == 0.0f || f61082c == 0.0f) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            float fD = d(context);
            f61083d = fD;
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            if (i10 > i11) {
                f61081b = i11;
                f61082c = i10 - fD;
            } else {
                f61081b = i10;
                f61082c = i11 - fD;
            }
        }
    }

    public static int a(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static j0 c(Context context) {
        if (f61080a == null) {
            f61080a = new j0(context);
        }
        return f61080a;
    }

    public int b(int i10) {
        return Math.round((i10 * f61082c) / (1920.0f - f61083d));
    }

    public final int d(Context context) {
        return e(context, "com.android.internal.R$dimen", "system_bar_height", 48);
    }

    public final int e(Context context, String str, String str2, int i10) {
        try {
            Class<?> cls = Class.forName(str);
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField(str2).get(cls.newInstance()).toString()));
        } catch (Exception e10) {
            e10.printStackTrace();
            return i10;
        }
    }

    public int f(int i10) {
        return Math.round((i10 * f61081b) / 1080.0f);
    }
}
