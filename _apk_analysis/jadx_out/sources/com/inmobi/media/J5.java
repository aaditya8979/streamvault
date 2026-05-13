package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowInsets;
import com.inmobi.media.J5;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public abstract class J5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f25691c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static JSONObject f25694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Integer f25695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Float f25696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f25697i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L5 f25689a = new L5(0, 0, 2.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I5 f25690b = new I5(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static float f25692d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f25693e = true;

    static {
        C3850x5.f28483a.getClass();
        f25697i = C3850x5.u();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.view.WindowInsets r3) {
        /*
            java.lang.String r0 = "insets"
            tn.p.k(r3, r0)
            com.inmobi.media.x5 r0 = com.inmobi.media.C3850x5.f28483a
            r0.getClass()
            boolean r0 = com.inmobi.media.C3850x5.r()
            r1 = 1
            if (r0 == 0) goto L54
            byte r0 = g()
            com.inmobi.media.Df r0 = com.inmobi.media.Ef.a(r0)
            int r2 = androidx.core.view.WindowInsetsCompat.Type.systemGestures()
            android.graphics.Insets r3 = androidx.core.view.g2.a(r3, r2)
            java.lang.String r2 = "getInsets(...)"
            tn.p.j(r3, r2)
            int r0 = r0.ordinal()
            if (r0 == 0) goto L4c
            if (r0 == r1) goto L43
            r2 = 2
            if (r0 == r2) goto L4c
            r2 = 3
            if (r0 != r2) goto L3d
            int r0 = r3.right
            if (r0 != 0) goto L55
            int r3 = r3.bottom
            if (r3 != 0) goto L55
            goto L54
        L3d:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L43:
            int r0 = r3.left
            if (r0 != 0) goto L55
            int r3 = r3.bottom
            if (r3 != 0) goto L55
            goto L54
        L4c:
            int r0 = r3.left
            if (r0 != 0) goto L55
            int r3 = r3.right
            if (r3 != 0) goto L55
        L54:
            r1 = 0
        L55:
            java.lang.String r3 = "J5"
            java.lang.String r0 = "TAG"
            tn.p.j(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.J5.a(android.view.WindowInsets):int");
    }

    public static Display a(Context context) {
        C3850x5.f28483a.getClass();
        Object systemService = context.getSystemService("display");
        DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
        if (displayManager != null) {
            return displayManager.getDisplay(0);
        }
        return null;
    }

    public static String a() {
        Display displayA;
        Context context = Ji.f25747a;
        if (context == null || (displayA = a(context)) == null) {
            return "0x0";
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getMetrics(displayMetrics);
        return displayMetrics.widthPixels + VastAttributes.HORIZONTAL_POSITION + displayMetrics.heightPixels;
    }

    public static void a(final WindowInsets windowInsets, final Context context) {
        tn.p.k(windowInsets, "insets");
        if (f25693e) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: n9.x1
            @Override // java.lang.Runnable
            public final void run() {
                J5.b(windowInsets, context);
            }
        };
        Context context2 = Ji.f25747a;
        tn.p.k(runnable, "runnable");
        Ji.f25753g.submit(runnable);
    }

    public static void a(final Integer num) {
        final Context context = Ji.f25747a;
        if (context == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: n9.w1
            @Override // java.lang.Runnable
            public final void run() {
                J5.a(num, context);
            }
        };
        tn.p.k(runnable, "runnable");
        Ji.f25753g.submit(runnable);
    }

    public static final void a(Integer num, Context context) {
        tn.p.j("J5", "TAG");
        f25695g = num;
        ConcurrentHashMap concurrentHashMap = Ea.f25372b;
        Da.a(context, "display_info_store").a("nav_bar_type", num != null ? num.intValue() : -1, false);
    }

    public static void a(final LinkedHashMap linkedHashMap) {
        tn.p.k(linkedHashMap, "value");
        final Context context = Ji.f25747a;
        if (context == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: n9.y1
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                J5.a(linkedHashMap, context);
            }
        };
        tn.p.k(runnable, "runnable");
        Ji.f25753g.submit(runnable);
    }

    public static final void a(Map map, Context context) throws JSONException {
        tn.p.j("J5", "TAG");
        Objects.toString(map);
        if (f25694f == null) {
            f25694f = new JSONObject();
        }
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            JSONObject jSONObject = f25694f;
            if (jSONObject != null) {
                jSONObject.put(String.valueOf(iIntValue), map.get(Integer.valueOf(iIntValue)));
            }
        }
        ConcurrentHashMap concurrentHashMap = Ea.f25372b;
        Ea eaA = Da.a(context, "display_info_store");
        JSONObject jSONObject2 = f25694f;
        eaA.a("safe_area", jSONObject2 != null ? jSONObject2.toString() : null, false);
    }

    public static float b() {
        Display displayA;
        if (f25692d == -1.0f) {
            Context context = Ji.f25747a;
            if (context == null || (displayA = a(context)) == null) {
                return 2.0f;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            displayA.getMetrics(displayMetrics);
            float f10 = displayMetrics.density;
            if (f10 == 0.0f) {
                return 2.0f;
            }
            f25692d = f10;
        }
        return f25692d;
    }

    public static I5 b(Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        Display displayA = a(context);
        if (displayA == null) {
            return f25690b;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getRealMetrics(displayMetrics);
        return new I5(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static final void b(WindowInsets windowInsets, Context context) {
        try {
            String string = windowInsets.getSystemGestureInsets().toString();
            tn.p.j(string, "toString(...)");
            String[] strArr = (String[]) new Regex("Insets").split(string, 0).toArray(new String[0]);
            StringBuffer stringBuffer = new StringBuffer();
            if (strArr.length > 1) {
                String[] strArr2 = (String[]) new Regex(StringUtils.COMMA).split(new Regex("[^0-9,=a-zA-Z]*").replace(strArr[1], ""), 0).toArray(new String[0]);
                stringBuffer.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52301d);
                int length = strArr2.length;
                for (int i10 = 0; i10 < length; i10++) {
                    String[] strArr3 = (String[]) new Regex("=").split(strArr2[i10], 0).toArray(new String[0]);
                    if (strArr3.length == 2) {
                        stringBuffer.append("\"" + strArr3[0] + "\"");
                        stringBuffer.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                        stringBuffer.append(F3.b(((float) Integer.parseInt(strArr3[1])) / b()));
                        if (i10 < strArr2.length - 1) {
                            stringBuffer.append(", ");
                        }
                    }
                }
                stringBuffer.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e);
            }
            if (stringBuffer.length() > 0) {
                f25691c = stringBuffer.toString();
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                tn.p.h(context);
                Da.a(context, "display_info_store").a("gesture_margin", stringBuffer.toString(), false);
            }
        } catch (Exception unused) {
            tn.p.j("J5", "TAG");
        }
    }

    public static HashMap c() {
        HashMap map = new HashMap();
        try {
            map.put("d-device-screen-density", String.valueOf(b()));
            map.put("d-device-screen-size", e());
            map.put("d-density-dependent-screen-size", a());
            map.put("d-orientation", String.valueOf((int) g()));
            Float f10 = f25696h;
            map.put("d-textsize", String.valueOf(f10 != null ? f10.floatValue() : 37.0f));
            return map;
        } catch (Exception e10) {
            tn.p.j("J5", "TAG");
            e10.getMessage();
            return map;
        }
    }

    public static final void c(Context context) {
        Window window;
        WindowInsets rootWindowInsets;
        if (f25693e || !(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null) {
            return;
        }
        a(rootWindowInsets, context);
    }

    public static L5 d() {
        Display displayA;
        Context context = Ji.f25747a;
        if (context != null && (displayA = a(context)) != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            displayA.getMetrics(displayMetrics);
            float f10 = displayMetrics.density;
            return new L5((int) (displayMetrics.widthPixels / f10), (int) (displayMetrics.heightPixels / f10), f10);
        }
        return f25689a;
    }

    public static String e() {
        L5 l5D = d();
        return l5D.f25855a + "X" + l5D.f25856b;
    }

    public static Integer f() {
        Context context = Ji.f25747a;
        if (context == null) {
            return null;
        }
        int i10 = Settings.Secure.getInt(context.getContentResolver(), "navigation_mode", -1);
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return i10 != 2 ? null : 1;
    }

    public static byte g() {
        Display displayA;
        int rotation;
        Context context = Ji.f25747a;
        if (context == null || (displayA = a(context)) == null || (rotation = displayA.getRotation()) == 0) {
            return (byte) 1;
        }
        if (rotation == 1) {
            return (byte) 3;
        }
        if (rotation == 2) {
            return (byte) 2;
        }
        if (rotation == 3) {
            return (byte) 4;
        }
        tn.p.j("J5", "TAG");
        return (byte) 1;
    }

    public static L5 h() {
        Display displayA;
        Context context = Ji.f25747a;
        if (context != null && (displayA = a(context)) != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            displayA.getRealMetrics(displayMetrics);
            float f10 = displayMetrics.density;
            return new L5((int) (displayMetrics.widthPixels / f10), (int) (displayMetrics.heightPixels / f10), f10);
        }
        return f25689a;
    }

    public static void i() {
        if (f25697i) {
            if (f() != null) {
                tn.p.j("J5", "TAG");
                return;
            }
            Context context = Ji.f25747a;
            if (context == null) {
                return;
            }
            ConcurrentHashMap concurrentHashMap = Ea.f25372b;
            Ea eaA = Da.a(context, "display_info_store");
            tn.p.k("nav_bar_type", "key");
            int i10 = eaA.f25373a.getInt("nav_bar_type", -1);
            Integer numValueOf = Integer.valueOf(i10);
            f25695g = numValueOf;
            if (i10 == -1) {
                numValueOf = null;
            }
            f25695g = numValueOf;
            tn.p.j("J5", "TAG");
        }
    }

    public static void j() {
        Context context;
        if (f25697i && (context = Ji.f25747a) != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f25372b;
            Ea eaA = Da.a(context, "display_info_store");
            tn.p.k("safe_area", "key");
            JSONObject jSONObject = null;
            String string = eaA.f25373a.getString("safe_area", null);
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException unused) {
                    tn.p.j("J5", "TAG");
                }
            }
            f25694f = jSONObject;
            tn.p.j("J5", "TAG");
            Objects.toString(f25694f);
        }
    }
}
