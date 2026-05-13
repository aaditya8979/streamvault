package yads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;

/* JADX INFO: loaded from: classes11.dex */
public final class sh1 {
    public static Boolean a(Context context) {
        return (Boolean) a(context, th1.f95218d.f95226b);
    }

    public static Object a(Context context, String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            } catch (Throwable unused) {
                boolean z10 = ad1.f87661a;
                applicationInfo = null;
            }
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(str)) {
                Object obj = bundle.get(str);
                if (obj == null) {
                    return null;
                }
                return obj;
            }
        } catch (Throwable unused2) {
            boolean z11 = ad1.f87661a;
        }
        return null;
    }

    public static Boolean b(Context context) {
        return (Boolean) a(context, th1.f95219e.f95226b);
    }

    public static boolean c(Context context) {
        Boolean bool = (Boolean) a(context, th1.f95224j.f95226b);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
