package io.bidmachine.rendering.internal;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3978d4;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f70513a;

    private static void a(Object obj, String str, boolean z10, Object... objArr) {
        if (a()) {
            if (objArr != null && objArr.length != 0) {
                try {
                    str = String.format(str, objArr);
                } catch (Throwable unused) {
                }
            }
            if (obj != null) {
                String string = obj.toString();
                if (!TextUtils.isEmpty(string)) {
                    str = C3978d4.j.f31383d + string + "] " + str;
                }
            }
            if (z10) {
                Log.e("AdaptiveRendering", str);
            } else {
                Log.d("AdaptiveRendering", str);
            }
        }
    }

    public static void a(Object obj, String str, Object... objArr) {
        a(obj, str, true, objArr);
    }

    public static void a(String str, Object... objArr) {
        a(null, str, true, objArr);
    }

    private static void a(Throwable th2) {
        if (a()) {
            if (th2 instanceof UnknownHostException) {
                th2.printStackTrace();
            } else {
                Log.w("AdaptiveRendering", th2);
            }
        }
    }

    public static void a(boolean z10) {
        f70513a = z10;
    }

    public static boolean a() {
        return b();
    }

    public static void b(Object obj, String str, Object... objArr) {
        a(obj, str, false, objArr);
    }

    public static void b(Throwable th2) {
        a(th2);
    }

    public static boolean b() {
        return f70513a;
    }
}
