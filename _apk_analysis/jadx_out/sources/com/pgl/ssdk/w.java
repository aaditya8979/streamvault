package com.pgl.ssdk;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f51434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f51435b;

    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            if (TextUtils.isEmpty(w.f51435b)) {
                String unused = w.f51435b = w.d();
                ax.b(z.a(), "romtype", w.f51435b);
            }
        }
    }

    public static String a(Context context) {
        String str = f51434a;
        if (str != null) {
            return str;
        }
        String string = Settings.Global.getString(context.getContentResolver(), "boot_count");
        f51434a = string;
        return string;
    }

    private static boolean b(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String c() {
        if (!TextUtils.isEmpty(f51435b)) {
            return f51435b;
        }
        String strA = ax.a(z.a(), "romtype", (String) null);
        f51435b = strA;
        if (!TextUtils.isEmpty(strA)) {
            return f51435b;
        }
        ar.b(new a());
        return "";
    }

    private static boolean c(String str) {
        try {
            return new File(str).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d() {
        return (b("com.samsung.android.knox.SemPersonaManager") || b("com.samsung.android.knoxguard.KnoxGuardManager")) ? "samsung" : (b("androidhnext.Manifest") || b("androidhnext.R")) ? "honor" : (b("androidhwext.Manifest") || b("androidhwext.R")) ? "huawei" : (b("oppo.Manifest") || b("oppo.R") || b("oplus.Manifest") || b("oplus.R") || b("com.oneplus.Manifest") || b("com.oneplus.R")) ? "oppo" : (b("vivo.Manifest") || b("vivo.R")) ? "vivo" : (b("miui.Manifest") || b("miui.R") || b("miui.os.Build")) ? "xiaomi" : (b("lineageos.platform.Manifest") || b("lineageos.platform.R")) ? "lineage" : c("/system/framework/com.motorola.motosignature.jar") ? "moto" : (c("/system/framework/transsion-framework.jar") || c("/system/framework/transsion-services.jar")) ? "transsion" : "other";
    }
}
