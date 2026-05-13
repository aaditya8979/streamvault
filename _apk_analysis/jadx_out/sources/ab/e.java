package ab;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: compiled from: DensityUtil.java */
/* JADX INFO: loaded from: classes.dex */
public class e {
    public static int a(Context context, float f10) {
        return (int) ((f10 * context.getApplicationContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(Context context, String str) {
        try {
            int identifier = Resources.getSystem().getIdentifier(str, "dimen", "android");
            if (identifier > 0) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
                int dimensionPixelSize2 = Resources.getSystem().getDimensionPixelSize(identifier);
                if (dimensionPixelSize2 >= dimensionPixelSize) {
                    return dimensionPixelSize2;
                }
                float f10 = (dimensionPixelSize * Resources.getSystem().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().density;
                return (int) (f10 >= 0.0f ? f10 + 0.5f : f10 - 0.5f);
            }
        } catch (Resources.NotFoundException unused) {
        }
        return 0;
    }

    @TargetApi(14)
    public static int c(Context context) {
        boolean z10 = context.getResources().getConfiguration().orientation == 1;
        if (k(context)) {
            return b(context, z10 ? "navigation_bar_height" : "navigation_bar_height_landscape");
        }
        return 0;
    }

    public static int d(Context context) {
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    public static int e(Context context) {
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    public static String f(Context context, int i10) {
        try {
            return context.getResources().getResourceEntryName(i10);
        } catch (Exception unused) {
            return "";
        }
    }

    public static int g(Context context) {
        return d(context) - j(context);
    }

    public static int h() {
        Resources system = Resources.getSystem();
        return system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android"));
    }

    public static int i(Context context) {
        int iH;
        int dimensionPixelSize;
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            try {
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(identifier);
                dimensionPixelSize = system.getDimensionPixelSize(identifier);
                if (dimensionPixelSize < dimensionPixelSize2) {
                    float f10 = (dimensionPixelSize2 * system.getDisplayMetrics().density) / context.getResources().getDisplayMetrics().density;
                    dimensionPixelSize = (int) (f10 >= 0.0f ? f10 + 0.5f : f10 - 0.5f);
                }
            } catch (Exception unused) {
                iH = h();
            }
        } else {
            dimensionPixelSize = 0;
        }
        iH = dimensionPixelSize;
        return iH == 0 ? a(context, 26.0f) : iH;
    }

    public static int j(Context context) {
        return k(context) ? i(context) + c(context) : i(context);
    }

    public static boolean k(Context context) {
        boolean z10;
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        int childCount = viewGroup.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                z10 = false;
                break;
            }
            View childAt = viewGroup.getChildAt(i10);
            int id2 = childAt.getId();
            if (id2 != -1 && "navigationBarBackground".equals(f(activity, id2)) && childAt.getVisibility() == 0) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (!z10) {
            return z10;
        }
        if (qa.c.k() && Build.VERSION.SDK_INT < 29) {
            try {
                return Settings.Global.getInt(activity.getContentResolver(), "navigationbar_hide_bar_enabled") == 0;
            } catch (Exception unused) {
            }
        }
        return (viewGroup.getSystemUiVisibility() & 2) == 0;
    }
}
