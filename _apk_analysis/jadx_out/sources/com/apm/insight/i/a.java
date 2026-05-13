package com.apm.insight.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.o;
import java.util.UUID;

/* JADX INFO: compiled from: DeviceUuidFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile UUID f7268a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f7269b = "";

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private a(Context context) {
        if (f7268a == null) {
            synchronized (a.class) {
                if (f7268a == null) {
                    String strC = o.a().c();
                    if (strC != null) {
                        f7268a = UUID.fromString(strC);
                    } else {
                        String string = null;
                        try {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                        }
                        try {
                            if (string != null) {
                                f7268a = UUID.nameUUIDFromBytes(string.getBytes("utf8"));
                            } else {
                                f7268a = UUID.randomUUID();
                            }
                        } catch (Throwable unused2) {
                        }
                        try {
                            o.a().b(f7268a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    public static synchronized String a(Context context) {
        if (TextUtils.isEmpty(f7269b)) {
            new a(context);
            UUID uuid = f7268a;
            if (uuid != null) {
                f7269b = uuid.toString();
            }
        }
        return f7269b;
    }
}
