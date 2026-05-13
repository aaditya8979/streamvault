package yads;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f96165a;

    public static IBinder a(Bundle bundle, String str) {
        if (ib3.f90737a >= 18) {
            return bundle.getBinder(str);
        }
        Method method = f96165a;
        if (method != null) {
            return (IBinder) method.invoke(bundle, str);
        }
        try {
            Method method2 = Bundle.class.getMethod("getIBinder", String.class);
            f96165a = method2;
            method2.setAccessible(true);
            method = f96165a;
            try {
                return (IBinder) method.invoke(bundle, str);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e10) {
                ih1.c("BundleUtil", ih1.a("Failed to invoke getIBinder via reflection", e10));
            }
        } catch (NoSuchMethodException e11) {
            ih1.c("BundleUtil", ih1.a("Failed to retrieve getIBinder method", e11));
        }
        return null;
    }
}
