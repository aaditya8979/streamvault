package wo;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.reflect.KClass;
import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Platform.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a2 {
    public static final Object a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final <T> KSerializer<T> b(@NotNull KClass<T> kClass) {
        tn.p.k(kClass, "<this>");
        return d(kClass, new KSerializer[0]);
    }

    @Nullable
    public static final <T> KSerializer<T> c(@NotNull Class<T> cls, @NotNull KSerializer<Object>... kSerializerArr) throws IllegalAccessException, InvocationTargetException {
        tn.p.k(cls, "<this>");
        tn.p.k(kSerializerArr, "args");
        if (cls.isEnum() && m(cls)) {
            return e(cls);
        }
        KSerializer<T> kSerializerK = k(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerK != null) {
            return kSerializerK;
        }
        KSerializer<T> kSerializerH = h(cls);
        if (kSerializerH != null) {
            return kSerializerH;
        }
        KSerializer<T> kSerializerF = f(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerF != null) {
            return kSerializerF;
        }
        if (n(cls)) {
            return new so.g(rn.a.c(cls));
        }
        return null;
    }

    @Nullable
    public static final <T> KSerializer<T> d(@NotNull KClass<T> kClass, @NotNull KSerializer<Object>... kSerializerArr) {
        tn.p.k(kClass, "<this>");
        tn.p.k(kSerializerArr, "args");
        return c(rn.a.a(kClass), (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static final <T> KSerializer<T> e(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        tn.p.j(canonicalName, "getCanonicalName(...)");
        tn.p.i(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new h0(canonicalName, (Enum[]) enumConstants);
    }

    public static final <T> KSerializer<T> f(Class<T> cls, KSerializer<Object>... kSerializerArr) {
        Field field;
        KSerializer<T> kSerializerJ;
        Object objG = g(cls);
        if (objG != null && (kSerializerJ = j(objG, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length))) != null) {
            return kSerializerJ;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            tn.p.j(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i10 = 0;
            Class<?> cls2 = null;
            boolean z10 = false;
            while (true) {
                if (i10 >= length) {
                    if (!z10) {
                        break;
                    }
                } else {
                    Class<?> cls3 = declaredClasses[i10];
                    if (tn.p.f(cls3.getSimpleName(), "$serializer")) {
                        if (z10) {
                            break;
                        }
                        z10 = true;
                        cls2 = cls3;
                    }
                    i10++;
                }
            }
            cls2 = null;
            Class<?> cls4 = cls2;
            Object obj = (cls4 == null || (field = cls4.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof KSerializer) {
                return (KSerializer) obj;
            }
            return null;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public static final <T> Object g(Class<T> cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        tn.p.j(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i10];
            if (cls2.getAnnotation(m1.class) != null) {
                break;
            }
            i10++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        tn.p.j(simpleName, "getSimpleName(...)");
        return a(cls, simpleName);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> kotlinx.serialization.KSerializer<T> h(java.lang.Class<T> r11) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.a2.h(java.lang.Class):kotlinx.serialization.KSerializer");
    }

    @NotNull
    public static final Map<KClass<?>, KSerializer<?>> i() {
        Map mapD = cn.p0.d();
        mapD.put(tn.t.b(String.class), to.a.J(tn.x.f85368a));
        mapD.put(tn.t.b(Character.TYPE), to.a.D(tn.e.f85349a));
        mapD.put(tn.t.b(char[].class), to.a.d());
        mapD.put(tn.t.b(Double.TYPE), to.a.E(tn.j.f85358a));
        mapD.put(tn.t.b(double[].class), to.a.e());
        mapD.put(tn.t.b(Float.TYPE), to.a.F(tn.k.f85359a));
        mapD.put(tn.t.b(float[].class), to.a.f());
        mapD.put(tn.t.b(Long.TYPE), to.a.H(tn.r.f85361a));
        mapD.put(tn.t.b(long[].class), to.a.i());
        mapD.put(tn.t.b(bn.m.class), to.a.w(bn.m.f5624c));
        mapD.put(tn.t.b(Integer.TYPE), to.a.G(tn.o.f85360a));
        mapD.put(tn.t.b(int[].class), to.a.g());
        mapD.put(tn.t.b(bn.k.class), to.a.v(bn.k.f5619c));
        mapD.put(tn.t.b(Short.TYPE), to.a.I(tn.v.f85366a));
        mapD.put(tn.t.b(short[].class), to.a.n());
        mapD.put(tn.t.b(bn.p.class), to.a.x(bn.p.f5630c));
        mapD.put(tn.t.b(Byte.TYPE), to.a.C(tn.d.f85348a));
        mapD.put(tn.t.b(byte[].class), to.a.c());
        mapD.put(tn.t.b(bn.i.class), to.a.u(bn.i.f5614c));
        mapD.put(tn.t.b(Boolean.TYPE), to.a.B(tn.c.f85347a));
        mapD.put(tn.t.b(boolean[].class), to.a.b());
        mapD.put(tn.t.b(bn.r.class), to.a.y(bn.r.f5635a));
        mapD.put(tn.t.b(Void.class), to.a.l());
        try {
            mapD.put(tn.t.b(co.b.class), to.a.z(co.b.f6773c));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapD.put(tn.t.b(bn.n.class), to.a.r());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapD.put(tn.t.b(bn.l.class), to.a.q());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapD.put(tn.t.b(bn.q.class), to.a.s());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapD.put(tn.t.b(bn.j.class), to.a.p());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapD.put(tn.t.b(Uuid.class), to.a.A(Uuid.Companion));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return cn.p0.c(mapD);
    }

    public static final <T> KSerializer<T> j(Object obj, KSerializer<Object>... kSerializerArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i10 = 0; i10 < length; i10++) {
                    clsArr2[i10] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (objInvoke instanceof KSerializer) {
                return (KSerializer) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                throw e10;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e10.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final <T> KSerializer<T> k(Class<?> cls, KSerializer<Object>... kSerializerArr) {
        Object objA = a(cls, VastTagName.COMPANION);
        if (objA == null) {
            return null;
        }
        return j(objA, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static final <T> boolean l(@NotNull KClass<T> kClass) {
        tn.p.k(kClass, "<this>");
        return rn.a.a(kClass).isInterface();
    }

    public static final <T> boolean m(Class<T> cls) {
        return cls.getAnnotation(so.k.class) == null && cls.getAnnotation(so.d.class) == null;
    }

    public static final <T> boolean n(Class<T> cls) {
        if (cls.getAnnotation(so.d.class) != null) {
            return true;
        }
        so.k kVar = (so.k) cls.getAnnotation(so.k.class);
        return kVar != null && tn.p.f(tn.t.b(kVar.with()), tn.t.b(so.g.class));
    }

    public static final boolean o(@NotNull KClass<Object> kClass) {
        tn.p.k(kClass, "rootClass");
        return rn.a.a(kClass).isArray();
    }

    @NotNull
    public static final Void p(@NotNull KClass<?> kClass) {
        tn.p.k(kClass, "<this>");
        b2.f(kClass);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final <T, E extends T> E[] q(@NotNull ArrayList<E> arrayList, @NotNull KClass<T> kClass) {
        tn.p.k(arrayList, "<this>");
        tn.p.k(kClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) rn.a.a(kClass), arrayList.size());
        tn.p.i(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] eArr = (E[]) arrayList.toArray((Object[]) objNewInstance);
        tn.p.j(eArr, "toArray(...)");
        return eArr;
    }
}
