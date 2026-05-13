package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

/* JADX INFO: loaded from: classes7.dex */
public class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile DisplayManager.DisplayListener f51293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f51294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f51295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f51296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f51297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile boolean f51298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile boolean f51299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static DisplayManager f51300h;

    public static class a implements DisplayManager.DisplayListener {
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i10) {
            aa.b(i10, 1);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i10) {
            aa.b(i10, 3);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i10) {
            aa.b(i10, 2);
        }
    }

    private static String a(int i10) {
        Display display = f51300h.getDisplay(i10);
        return display != null ? a(display) : "pd";
    }

    private static String a(Display display) {
        String name = display.getName();
        Object objA = av.a(display, display.getClass(), "getType", new Class[0], new Object[0]);
        Object objA2 = av.a(display, display.getClass(), "getOwnerPackageName", new Class[0], new Object[0]);
        Object objA3 = av.a(null, display.getClass(), "TYPE_VIRTUAL", null);
        return String.format("%s#%s#%b", objA2, name, Boolean.valueOf((objA == null || objA3 == null || ((Integer) objA).intValue() != ((Integer) objA3).intValue()) ? false : true));
    }

    public static boolean a(Context context) {
        Display[] displays;
        if (f51294b && (f51295c != null || f51296d != null || f51297e != null)) {
            return true;
        }
        if (f51294b && f51298f) {
            return f51299g;
        }
        int i10 = 0;
        if (context == null) {
            return false;
        }
        if (f51300h == null) {
            f51300h = (DisplayManager) context.getSystemService("display");
        }
        DisplayManager displayManager = f51300h;
        if (displayManager != null && (displays = displayManager.getDisplays()) != null) {
            int length = displays.length;
            while (true) {
                if (i10 < length) {
                    Display display = displays[i10];
                    if (display != null && display.getDisplayId() != 0) {
                        f51299g = true;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
        }
        f51298f = true;
        return f51299g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        try {
            String strA = a(i10);
            if (i11 == 1) {
                if (strA.equals(f51295c)) {
                    return;
                }
                f51295c = strA;
            } else if (i11 == 2) {
                if (strA.equals(f51296d)) {
                    return;
                }
                f51296d = strA;
            } else {
                if (i11 != 3 || strA.equals(f51297e)) {
                    return;
                }
                f51297e = strA;
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(Context context) {
        Handler handlerB;
        if (f51294b) {
            return;
        }
        if (f51293a == null) {
            f51293a = new a();
        }
        if (f51300h == null) {
            f51300h = (DisplayManager) context.getSystemService("display");
        }
        if (f51300h == null || (handlerB = ar.b()) == null) {
            return;
        }
        try {
            f51300h.registerDisplayListener(f51293a, handlerB);
            f51294b = true;
        } catch (Exception unused) {
        }
    }
}
