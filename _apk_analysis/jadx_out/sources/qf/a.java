package qf;

import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: compiled from: BubbleUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Properties f78258a = new Properties();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f78259b;

    public static int a(int i10) {
        return (int) TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static boolean b() throws Throwable {
        FileInputStream fileInputStream;
        Boolean bool = f78259b;
        if (bool != null) {
            return bool.booleanValue();
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                boolean z10 = true;
                if (TextUtils.isEmpty((String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, "ro.miui.ui.version.name"))) {
                    z10 = false;
                }
                f78259b = Boolean.valueOf(z10);
            } catch (Exception unused) {
                f78259b = Boolean.FALSE;
            }
            return f78259b.booleanValue();
        }
        try {
            fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
        } catch (IOException e11) {
            e = e11;
        }
        try {
            f78258a.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e12) {
            e = e12;
            fileInputStream2 = fileInputStream;
            e.printStackTrace();
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            f78259b = Boolean.valueOf(f78258a.containsKey("ro.miui.ui.version.name"));
            return f78259b.booleanValue();
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            }
            throw th;
        }
        f78259b = Boolean.valueOf(f78258a.containsKey("ro.miui.ui.version.name"));
        return f78259b.booleanValue();
    }

    public static int c(int i10) {
        return (int) TypedValue.applyDimension(2, i10, Resources.getSystem().getDisplayMetrics());
    }
}
