package g8;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: compiled from: UnsafeAllocator.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: compiled from: UnsafeAllocator.java */
    public static class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f62243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f62244b;

        public a(Method method, Object obj) {
            this.f62243a = method;
            this.f62244b = obj;
        }

        @Override // g8.i
        public <T> T c(Class<T> cls) throws Exception {
            i.a(cls);
            return (T) this.f62243a.invoke(this.f62244b, cls);
        }
    }

    /* JADX INFO: compiled from: UnsafeAllocator.java */
    public static class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f62245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f62246b;

        public b(Method method, int i10) {
            this.f62245a = method;
            this.f62246b = i10;
        }

        @Override // g8.i
        public <T> T c(Class<T> cls) throws Exception {
            i.a(cls);
            return (T) this.f62245a.invoke(null, cls, Integer.valueOf(this.f62246b));
        }
    }

    /* JADX INFO: compiled from: UnsafeAllocator.java */
    public static class c extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f62247a;

        public c(Method method) {
            this.f62247a = method;
        }

        @Override // g8.i
        public <T> T c(Class<T> cls) throws Exception {
            i.a(cls);
            return (T) this.f62247a.invoke(null, cls, Object.class);
        }
    }

    /* JADX INFO: compiled from: UnsafeAllocator.java */
    public static class d extends i {
        @Override // g8.i
        public <T> T c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    public static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    public static i b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, iIntValue);
                } catch (Exception unused2) {
                    return new d();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new c(declaredMethod3);
            }
        }
    }

    public abstract <T> T c(Class<T> cls) throws Exception;
}
