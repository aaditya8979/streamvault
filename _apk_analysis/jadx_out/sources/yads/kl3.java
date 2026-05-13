package yads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import kotlin.Result;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wl3 f91651a = new wl3(new bb2(), new yl3());

    public static final int a(int i10, float f10) {
        return Color.argb(zn.n.e(0, zn.n.j(255, (int) ((255 * (100 - f10)) / 100.0f))), Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    public static final int a(Context context) {
        return context.getResources().getDisplayMetrics().densityDpi;
    }

    public static final int a(Context context, float f10) {
        return vn.c.d(TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics()));
    }

    public static final int a(Context context, int i10) {
        return vn.c.d(i10 / context.getResources().getDisplayMetrics().density);
    }

    public static final int a(View view) {
        int i10;
        if (view == null || !view.isShown() || (i10 = f91651a.a(view).f96809a) <= 0) {
            return 0;
        }
        int width = view.getLayoutParams().width > 0 ? view.getLayoutParams().width : view.getWidth();
        int height = view.getLayoutParams().height > 0 ? view.getLayoutParams().height : view.getHeight();
        if (height <= 0 || width <= 0) {
            return 0;
        }
        return (i10 * 100) / (height * width);
    }

    public static final void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            try {
                if (viewGroup.getParent() instanceof ViewGroup) {
                    ViewParent parent = viewGroup.getParent();
                    tn.p.i(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(viewGroup);
                }
            } catch (Exception unused) {
            }
            try {
                viewGroup.removeAllViews();
            } catch (Exception unused2) {
            }
        }
    }

    public static final float b(int i10, float f10) {
        return ((i10 + 0.0f) / f10) + 0.5f;
    }

    public static final int b(Context context) {
        return (int) b(c(context), context.getResources().getDisplayMetrics().density);
    }

    public static final boolean b(View view) {
        return !view.isShown() || view.getAlpha() == 0.0f;
    }

    public static final int c(Context context) {
        Object objM7534constructorimpl;
        int iHeight;
        Object obj = dw2.f89000j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA == null || !nt2VarA.C0) {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        try {
            Result.a aVar = Result.Companion;
            Object systemService = context.getSystemService("window");
            tn.p.i(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            WindowManager windowManager = (WindowManager) systemService;
            if (Build.VERSION.SDK_INT >= 30) {
                iHeight = windowManager.getCurrentWindowMetrics().getBounds().height();
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                iHeight = displayMetrics.heightPixels;
            }
            objM7534constructorimpl = Result.m7534constructorimpl(Integer.valueOf(iHeight));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        Integer numValueOf = Integer.valueOf(context.getResources().getDisplayMetrics().heightPixels);
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = numValueOf;
        }
        return ((Number) objM7534constructorimpl).intValue();
    }

    public static final boolean c(View view) {
        Drawable background = view.getBackground();
        return (background == null || ((float) background.getAlpha()) == 0.0f) ? false : true;
    }

    public static final int d(Context context) {
        return (int) b(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().density);
    }
}
