package i8;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: compiled from: ReflectionAccessor.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f64007a;

    static {
        f64007a = g8.c.c() < 9 ? new a() : new c();
    }

    public static b a() {
        return f64007a;
    }

    public abstract void b(AccessibleObject accessibleObject);
}
