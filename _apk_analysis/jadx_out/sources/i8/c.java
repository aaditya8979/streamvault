package i8;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: UnsafeReflectionAccessor.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Class f64008d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f64009b = d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f64010c = c();

    public static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public static Object d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f64008d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // i8.b
    public void b(AccessibleObject accessibleObject) {
        if (e(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e10) {
            throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e10);
        }
    }

    public boolean e(AccessibleObject accessibleObject) {
        if (this.f64009b != null && this.f64010c != null) {
            try {
                f64008d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f64009b, accessibleObject, Long.valueOf(((Long) f64008d.getMethod("objectFieldOffset", Field.class).invoke(this.f64009b, this.f64010c)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
