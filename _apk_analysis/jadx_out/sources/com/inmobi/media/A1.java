package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class A1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f25129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f25130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f25131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f25132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f25133e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte f25134f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    static {
        PackageManager packageManager;
        byte b10 = 2;
        f25134f = (byte) 2;
        Context context = Ji.f25747a;
        String strValueOf = null;
        if (context != null) {
            try {
                packageManager = context.getPackageManager();
            } catch (Exception unused) {
            }
        } else {
            packageManager = null;
        }
        ApplicationInfo applicationInfo = packageManager != null ? packageManager.getApplicationInfo(context.getPackageName(), 128) : null;
        if (applicationInfo != null) {
            String str = applicationInfo.packageName;
            f25129a = str;
            f25132d = applicationInfo.loadLabel(packageManager).toString();
            tn.p.h(str);
            f25130b = packageManager.getInstallerPackageName(str);
        }
        PackageInfo packageInfo = packageManager != null ? packageManager.getPackageInfo(context.getPackageName(), 128) : null;
        if (packageInfo != null && ((strValueOf = packageInfo.versionName) == null || strValueOf.length() == 0)) {
            strValueOf = Build.VERSION.SDK_INT < 28 ? String.valueOf(packageInfo.versionCode) : String.valueOf(packageInfo.getLongVersionCode());
        }
        if (F3.a(strValueOf)) {
            f25131c = strValueOf;
        }
        try {
            C3850x5.f28483a.getClass();
            b10 = C3850x5.w() ? !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : 0;
        } catch (Error | Exception unused2) {
        }
        f25134f = b10;
        String str2 = f25129a;
        if (str2 != null) {
            f25133e.put("u-appbid", str2);
        }
        String str3 = f25132d;
        if (str3 != null) {
            f25133e.put("u-appdnm", str3);
        }
        String str4 = f25131c;
        if (str4 != null) {
            f25133e.put("u-appver", str4);
        }
        f25133e.put("u-appsecure", String.valueOf((int) b10));
    }
}
