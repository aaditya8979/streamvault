package com.bytedance.sdk.openadsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Picture;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class osn {
    private static int bly = -1;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private static Boolean f14319cf = null;
    private static int fkw = -1;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static int f14320le = -1;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static float f14321lh = -1.0f;
    private static boolean mwh = true;
    private static float ouw = -1.0f;
    private static ViewConfiguration pno = null;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static WindowManager f14322ra = null;
    private static final Object ryl = new Object();
    private static float tlj = -1.0f;
    private static int vt = -1;
    private static int yu = -1;

    public static float bly(Context context) {
        ouw(context, true);
        return ouw;
    }

    public static int cf(Context context) {
        ouw(context, false);
        return vt;
    }

    public static int fkw(Context context) {
        ouw(context, false);
        return vt(context, yu);
    }

    public static void fkw(View view) {
        if (view == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.osn.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    osn.ouw(view2, 8);
                    view2.setAlpha(1.0f);
                }
            }
        });
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.start();
    }

    public static int jg(Context context) {
        return ((Integer) ryl(context).first).intValue();
    }

    private static boolean ko(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(clsLoadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static int le(Context context) {
        ouw(context, false);
        return fkw;
    }

    public static void le(View view) {
        if (view == null) {
            return;
        }
        ouw(view, 0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.osn.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    public static void lh() {
        f14319cf = Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean lh(android.app.Activity r7) {
        /*
            java.lang.Boolean r0 = com.bytedance.sdk.openadsdk.utils.osn.f14319cf
            if (r0 != 0) goto Lac
            java.lang.Object r0 = com.bytedance.sdk.openadsdk.utils.osn.ryl
            monitor-enter(r0)
            java.lang.Boolean r1 = com.bytedance.sdk.openadsdk.utils.osn.f14319cf     // Catch: java.lang.Throwable -> La9
            if (r1 != 0) goto La7
            java.lang.String r1 = "cutout_devices"
            java.lang.String r2 = ""
            java.lang.String r1 = com.bytedance.sdk.openadsdk.vpp.ouw.ouw(r1, r2)     // Catch: java.lang.Throwable -> La9
            java.lang.String r2 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> La9
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> La9
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L4c
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> La9
            if (r3 != 0) goto L4c
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> La9
            r3.<init>(r1)     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> La9
            r1 = r4
        L29:
            int r6 = r3.length()     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> La9
            if (r1 >= r6) goto L4c
            java.lang.String r6 = r3.getString(r1)     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> La9
            boolean r6 = r2.equals(r6)     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> La9
            if (r6 == 0) goto L3f
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> La9
            com.bytedance.sdk.openadsdk.utils.osn.f14319cf = r1     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> La9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La9
            return r5
        L3f:
            int r1 = r1 + 1
            goto L29
        L42:
            r1 = move-exception
            java.lang.String r2 = "UIUtils"
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> La9
            com.bytedance.sdk.component.utils.qbp.lh(r2, r1)     // Catch: java.lang.Throwable -> La9
        L4c:
            boolean r1 = yu(r7)     // Catch: java.lang.Throwable -> La9
            if (r1 != 0) goto La0
            java.lang.String r1 = "ro.miui.notch"
            int r1 = ouw(r1, r7)     // Catch: java.lang.Throwable -> La9
            if (r1 == r5) goto La0
            boolean r1 = ko(r7)     // Catch: java.lang.Throwable -> La9
            if (r1 != 0) goto La0
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch: java.lang.Throwable -> La9
            java.lang.String r2 = "com.oppo.feature.screen.heteromorphism"
            boolean r1 = r1.hasSystemFeature(r2)     // Catch: java.lang.Throwable -> La9
            if (r1 != 0) goto La0
            boolean r1 = rn(r7)     // Catch: java.lang.Throwable -> La9
            if (r1 != 0) goto La0
            java.lang.String r1 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> La9
            java.lang.String r2 = "IN2010"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> La9
            if (r2 != 0) goto L97
            java.lang.String r2 = "IN2020"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> La9
            if (r2 != 0) goto L97
            java.lang.String r2 = "KB2000"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> La9
            if (r2 != 0) goto L97
            java.lang.String r2 = "ONEPLUS"
            boolean r1 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> La9
            if (r1 == 0) goto L95
            goto L97
        L95:
            r1 = r4
            goto L98
        L97:
            r1 = r5
        L98:
            if (r1 != 0) goto La0
            boolean r7 = zih(r7)     // Catch: java.lang.Throwable -> La9
            if (r7 == 0) goto La1
        La0:
            r4 = r5
        La1:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> La9
            com.bytedance.sdk.openadsdk.utils.osn.f14319cf = r7     // Catch: java.lang.Throwable -> La9
        La7:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La9
            goto Lac
        La9:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        Lac:
            java.lang.Boolean r7 = com.bytedance.sdk.openadsdk.utils.osn.f14319cf
            boolean r7 = r7.booleanValue()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.osn.lh(android.app.Activity):boolean");
    }

    public static int[] lh(Context context) {
        if (context == null) {
            return null;
        }
        if (f14322ra == null) {
            f14322ra = (WindowManager) com.bytedance.sdk.openadsdk.core.zih.ouw().getSystemService("window");
        }
        int[] iArr = new int[2];
        WindowManager windowManager = f14322ra;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            try {
                Point point = new Point();
                Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                i10 = point.x;
                i11 = point.y;
            } catch (Exception unused) {
            }
            iArr[0] = i10;
            iArr[1] = i11;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    @Nullable
    public static int[] lh(View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    public static int mwh(Context context) {
        return ((Integer) ryl(context).second).intValue();
    }

    public static float ouw() {
        float f10 = tlj;
        if (f10 > 0.0f) {
            return f10;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.zih.ouw().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0.0f;
        }
        float dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        tlj = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static float ouw(Context context, float f10, boolean z10) {
        ouw(context, false);
        return (f10 * bly(context)) + (z10 ? 0.5f : 0.0f);
    }

    public static int ouw(Context context, float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return Float.valueOf(ouw(context, f10, true)).intValue();
    }

    public static int ouw(Bitmap bitmap) {
        try {
            ArrayList<Integer> arrayListVt = vt(bitmap);
            if (arrayListVt == null) {
                return -1;
            }
            HashMap map = new HashMap();
            for (Integer num : arrayListVt) {
                if (map.containsKey(num)) {
                    Integer numValueOf = Integer.valueOf(((Integer) map.get(num)).intValue() + 1);
                    map.remove(num);
                    map.put(num, numValueOf);
                } else {
                    map.put(num, 1);
                }
            }
            int iIntValue = 0;
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (i10 < iIntValue2) {
                    iIntValue = ((Integer) entry.getKey()).intValue();
                    i10 = iIntValue2;
                }
            }
            if (iIntValue == 0) {
                return -1;
            }
            return (int) ((i10 / ((bitmap.getWidth() * bitmap.getHeight()) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static int ouw(String str, Activity activity) {
        if (!tc.lh()) {
            return 0;
        }
        try {
            Class<?> clsLoadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
            return ((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, new String(str), 0)).intValue();
        } catch (ClassNotFoundException e10) {
            com.bytedance.sdk.component.utils.qbp.lh("UIUtils", e10.getMessage());
            return 0;
        } catch (IllegalAccessException e11) {
            com.bytedance.sdk.component.utils.qbp.lh("UIUtils", e11.getMessage());
            return 0;
        } catch (IllegalArgumentException e12) {
            com.bytedance.sdk.component.utils.qbp.lh("UIUtils", e12.getMessage());
            return 0;
        } catch (NoSuchMethodException e13) {
            com.bytedance.sdk.component.utils.qbp.lh("UIUtils", e13.getMessage());
            return 0;
        } catch (InvocationTargetException e14) {
            com.bytedance.sdk.component.utils.qbp.lh("UIUtils", e14.getMessage());
            return 0;
        }
    }

    private static Bitmap ouw(WebView webView) {
        Bitmap bitmapCreateBitmap = null;
        try {
            Picture pictureCapturePicture = webView.capturePicture();
            bitmapCreateBitmap = Bitmap.createBitmap(pictureCapturePicture.getWidth(), pictureCapturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            pictureCapturePicture.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("UIUtils", th2.getMessage());
            return bitmapCreateBitmap;
        }
    }

    public static Bitmap ouw(com.bytedance.sdk.component.bly.le leVar) {
        WebView webView = leVar.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        Bitmap bitmapVt = vt(leVar);
        if (bitmapVt == null) {
            bitmapVt = ouw(webView);
        }
        webView.setLayerType(layerType, null);
        if (bitmapVt == null) {
            return null;
        }
        return com.bytedance.sdk.component.utils.yu.ouw(bitmapVt, bitmapVt.getWidth() / 6, bitmapVt.getHeight() / 6);
    }

    public static void ouw(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(3846);
            activity.getWindow().addFlags(1792);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.qbp.lh("UIUtils", e10.getMessage());
        }
    }

    public static void ouw(Context context) {
        ouw(context, false);
    }

    private static void ouw(Context context, boolean z10) {
        Context contextOuw = context == null ? com.bytedance.sdk.openadsdk.core.zih.ouw() : context;
        if (contextOuw == null) {
            return;
        }
        f14322ra = (WindowManager) contextOuw.getSystemService("window");
        if (yu() || z10) {
            DisplayMetrics displayMetrics = contextOuw.getResources().getDisplayMetrics();
            ouw = displayMetrics.density;
            vt = displayMetrics.densityDpi;
            f14321lh = displayMetrics.scaledDensity;
            yu = displayMetrics.widthPixels;
            fkw = displayMetrics.heightPixels;
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        Configuration configuration = context.getResources().getConfiguration();
        if (configuration.orientation == 1) {
            int i10 = yu;
            int i11 = fkw;
            if (i10 > i11) {
                yu = i11;
                fkw = i10;
            }
        } else {
            int i12 = yu;
            int i13 = fkw;
            if (i12 < i13) {
                yu = i13;
                fkw = i12;
            }
        }
        f14320le = configuration.smallestScreenWidthDp;
    }

    public static void ouw(View view, float f10) {
        if (view == null) {
            return;
        }
        view.setAlpha(f10);
    }

    public static void ouw(View view, int i10) {
        if (view == null || view.getVisibility() == i10) {
            return;
        }
        if (i10 == 0 || i10 == 8 || i10 == 4) {
            view.setVisibility(i10);
        }
    }

    public static void ouw(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.leftMargin == i10 && marginLayoutParams.topMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.bottomMargin == i13) {
            return;
        }
        if (i10 != -3) {
            marginLayoutParams.leftMargin = i10;
        }
        if (i11 != -3) {
            marginLayoutParams.topMargin = i11;
        }
        if (i12 != -3) {
            marginLayoutParams.rightMargin = i12;
        }
        if (i13 != -3) {
            marginLayoutParams.bottomMargin = i13;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public static void ouw(View view, View.OnClickListener onClickListener, String str) {
        if (view != null) {
            view.setOnClickListener(onClickListener);
            return;
        }
        com.bytedance.sdk.component.utils.qbp.lh("OnclickListener ", str + " is null , can not set OnClickListener !!!");
    }

    public static void ouw(View view, View.OnTouchListener onTouchListener, String str) {
        if (view != null) {
            view.setOnTouchListener(onTouchListener);
            return;
        }
        com.bytedance.sdk.component.utils.qbp.lh("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
    }

    private static void ouw(TextView textView, com.bytedance.sdk.openadsdk.core.widget.rn rnVar, double d10, int i10) {
        if (d10 == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            rnVar.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d10)));
            }
            ouw(rnVar, d10, i10);
        }
    }

    public static void ouw(TextView textView, com.bytedance.sdk.openadsdk.core.widget.rn rnVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        ouw(textView, rnVar, vppVar, 14);
    }

    public static void ouw(TextView textView, com.bytedance.sdk.openadsdk.core.widget.rn rnVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, int i10) {
        com.bytedance.sdk.openadsdk.core.model.le leVar;
        ouw(textView, rnVar, (vppVar == null || (leVar = vppVar.f13802wp) == null) ? -1.0d : leVar.fkw, i10);
    }

    public static void ouw(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    public static void ouw(final com.bytedance.sdk.openadsdk.core.model.vpp vppVar, final String str, final String str2, final Bitmap bitmap, final String str3, final long j10) {
        bs.vt(new com.bytedance.sdk.component.pno.pno("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.osn.3
            @Override // java.lang.Runnable
            public final void run() {
                osn.vt(vppVar, str, str2, bitmap, str3, j10);
            }
        }, 10);
    }

    private static void ouw(com.bytedance.sdk.openadsdk.core.widget.rn rnVar, double d10, int i10) {
        if (d10 < 0.0d) {
            rnVar.setVisibility(8);
        } else {
            rnVar.setVisibility(0);
            rnVar.ouw(d10, i10);
        }
    }

    public static boolean ouw(float f10, float f11, Context context) {
        com.bytedance.sdk.component.utils.ko.ouw("UIUtils", Float.valueOf(f10), Float.valueOf(f11));
        if (f10 != -1.0f && f11 != -1.0f) {
            if (pno == null) {
                pno = ViewConfiguration.get(context);
            }
            if (bly == -1) {
                bly = pno.getScaledTouchSlop();
            }
            if (f10 - f11 > bly) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static int[] ouw(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static int pno(Context context) {
        ouw(context, false);
        return vt(context, fkw);
    }

    public static int ra(Context context) {
        if (context == null) {
            com.bytedance.sdk.openadsdk.core.zih.ouw();
        }
        if (context == null) {
            return f14320le;
        }
        if (context.getResources() != null && context.getResources().getConfiguration() != null) {
            f14320le = context.getResources().getConfiguration().smallestScreenWidthDp;
        }
        return f14320le;
    }

    public static void ra(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    private static boolean rn(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static Pair<Integer, Integer> ryl(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.zih.ouw();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    public static float tlj(Context context) {
        ouw(context, false);
        return f14321lh;
    }

    public static float vt(Context context) {
        ouw(context, false);
        ouw(context, false);
        return f14321lh * 8.0f;
    }

    public static int vt(Context context, float f10) {
        ouw(context, true);
        float fBly = bly(context);
        if (fBly <= 0.0f) {
            fBly = 1.0f;
        }
        return (int) ((f10 / fBly) + 0.5f);
    }

    private static Bitmap vt(com.bytedance.sdk.component.bly.le leVar) {
        if (leVar == null) {
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(leVar.getWidth(), leVar.getHeight(), Bitmap.Config.RGB_565);
            leVar.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static ArrayList<Integer> vt(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = width * height;
            int[] iArr = new int[i10];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = iArr[i11];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i12) >> 16, (65280 & i12) >> 8, i12 & 255)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void vt(Activity activity) {
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(1792);
            activity.getWindow().clearFlags(1792);
        } catch (Exception unused) {
        }
    }

    public static void vt(View view, final float f10) {
        if (view != null && f10 > 0.0f) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.osn.5
                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view2, Outline outline) {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f10);
                }
            });
            view.setClipToOutline(true);
        }
    }

    public static /* synthetic */ void vt(final com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str, String str2, final Bitmap bitmap, final String str3, final long j10) {
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar, str, str2, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.utils.osn.4
                        @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                        public final JSONObject lh() {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                int iOuw = osn.ouw(bitmap);
                                jSONObject.put("url", str3);
                                long j11 = j10;
                                if (j11 != -1) {
                                    jSONObject.put("page_id", j11);
                                }
                                jSONObject.put("render_type", "h5");
                                jSONObject.put("render_type_2", 0);
                                jSONObject.put("is_blank", iOuw == 100 ? 1 : 0);
                                jSONObject.put("is_playable", com.bytedance.sdk.openadsdk.core.model.od.vt(vppVar) ? 1 : 0);
                                jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(vppVar) ? 1 : 0);
                            } catch (JSONException unused) {
                            }
                            return jSONObject;
                        }
                    });
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.lh("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>".concat(String.valueOf(th2)));
            }
        }
    }

    public static boolean vt() {
        return mwh && Build.VERSION.SDK_INT >= 28;
    }

    public static int[] vt(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static int yu(Context context) {
        ouw(context, false);
        return yu;
    }

    private static boolean yu() {
        return ouw < 0.0f || vt < 0 || f14321lh < 0.0f || yu < 0 || fkw < 0;
    }

    public static boolean yu(Activity activity) {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        DisplayCutout displayCutout = null;
        try {
            WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
            if (rootWindowInsets != null) {
                displayCutout = rootWindowInsets.getDisplayCutout();
                mwh = false;
            }
            return displayCutout != null;
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.qbp.lh("UIUtils", e10.getMessage());
            return false;
        }
    }

    public static boolean yu(View view) {
        return view != null && view.getVisibility() == 0;
    }

    private static boolean zih(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", TypedValues.Custom.S_STRING, "android");
            String string = identifier > 0 ? resources.getString(identifier) : null;
            if (string != null) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
