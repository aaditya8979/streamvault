package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.InputDevice;
import android.view.MotionEvent;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f51437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f51438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f51439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f51440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f51441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f51442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile boolean f51443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f51444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static InputManager f51445i;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f51446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f51447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f51448c;

        public a(String str, Context context, int i10) {
            this.f51446a = str;
            this.f51447b = context;
            this.f51448c = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (y.f51443g) {
                com.pgl.ssdk.ces.a.meta(171, null, this.f51446a);
            }
            InputManager inputManagerB = y.b(this.f51447b);
            if (inputManagerB == null) {
                return;
            }
            InputDevice inputDevice = inputManagerB.getInputDevice(this.f51448c);
            y.h();
            if (inputDevice == null) {
                y.b();
                y.c();
                y.c("nihc");
            } else if (inputDevice.isVirtual()) {
                y.d();
                y.e();
                y.c("vihc");
            } else {
                if (Build.VERSION.SDK_INT < 29 || !inputDevice.isExternal()) {
                    return;
                }
                y.f();
                y.g();
                y.c("eihc");
            }
        }
    }

    public static void a(MotionEvent motionEvent, Context context) {
        if (motionEvent == null || context == null) {
            return;
        }
        String str = null;
        if (f51443g) {
            try {
                if (motionEvent.getToolType(0) == 0 || motionEvent.getSource() == 0 || motionEvent.getSource() == 2) {
                    String string = Arrays.toString(new Exception().getStackTrace());
                    if (!string.contains("android.view.InputEventReceiver") && !string.contains("android.view.ViewRootImpl$WindowInputEventReceiver")) {
                        if (!string.contains("android.view.ViewRootImpl$InputStage")) {
                            str = string;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        ar.b(new a(str, context, motionEvent.getDeviceId()));
    }

    public static /* synthetic */ int b() {
        int i10 = f51439c;
        f51439c = i10 + 1;
        return i10;
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        h();
        str.hashCode();
        switch (str) {
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputManager b(Context context) {
        if (f51445i == null) {
            f51445i = (InputManager) context.getSystemService("input");
        }
        return f51445i;
    }

    public static /* synthetic */ int c() {
        int i10 = f51442f;
        f51442f = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str) {
        try {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt(str, sharedPreferencesA.getInt(str, 0) + 1).apply();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static /* synthetic */ int d() {
        int i10 = f51437a;
        f51437a = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int e() {
        int i10 = f51440d;
        f51440d = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int f() {
        int i10 = f51438b;
        f51438b = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int g() {
        int i10 = f51441e;
        f51441e = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h() {
        if (f51444h) {
            return;
        }
        try {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            if (sharedPreferencesA != null) {
                f51442f = sharedPreferencesA.getInt("nihc", 0);
                f51441e = sharedPreferencesA.getInt("eihc", 0);
                f51440d = sharedPreferencesA.getInt("vihc", 0);
                f51444h = true;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
