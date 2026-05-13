package tn;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bo.d0;
import cn.p0;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ClassReference.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class g implements KClass<Object>, f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f85350c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Map<Class<? extends bn.e<?>>, Integer> f85351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final HashMap<String, String> f85352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final HashMap<String, String> f85353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final HashMap<String, String> f85354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Map<String, String> f85355h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Class<?> f85356b;

    /* JADX INFO: compiled from: ClassReference.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        @Nullable
        public final String a(@NotNull Class<?> cls) {
            String str;
            p.k(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (!cls.isArray()) {
                String str3 = (String) g.f85354g.get(cls.getName());
                return str3 == null ? cls.getCanonicalName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) g.f85354g.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        @Nullable
        public final String b(@NotNull Class<?> cls) {
            String str;
            p.k(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        p.h(simpleName);
                        String strE1 = d0.e1(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                        if (strE1 != null) {
                            return strE1;
                        }
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    if (enclosingConstructor == null) {
                        p.h(simpleName);
                        return d0.d1(simpleName, '$', null, 2, null);
                    }
                    p.h(simpleName);
                    return d0.e1(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
                }
                if (!cls.isArray()) {
                    String str3 = (String) g.f85355h.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) g.f85355h.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 == null) {
                    return "Array";
                }
            }
            return str2;
        }

        public final boolean c(@Nullable Object obj, @NotNull Class<?> cls) {
            p.k(cls, "jClass");
            Map map = g.f85351d;
            p.i(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                return y.k(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = rn.a.b(rn.a.c(cls));
            }
            return cls.isInstance(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i10 = 0;
        List listP = cn.w.p(sn.a.class, sn.l.class, sn.p.class, sn.q.class, sn.r.class, sn.s.class, sn.t.class, sn.u.class, sn.v.class, sn.w.class, sn.b.class, sn.c.class, sn.d.class, sn.e.class, sn.f.class, sn.g.class, sn.h.class, sn.i.class, sn.j.class, sn.k.class, sn.m.class, sn.n.class, sn.o.class);
        ArrayList arrayList = new ArrayList(cn.x.x(listP, 10));
        for (Object obj : listP) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                cn.w.w();
            }
            arrayList.add(bn.h.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f85351d = kotlin.collections.a.x(arrayList);
        HashMap<String, String> map = new HashMap<>();
        map.put(TypedValues.Custom.S_BOOLEAN, "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put(ImpressionLog.f51753w, "kotlin.Int");
        map.put(TypedValues.Custom.S_FLOAT, "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f85352e = map;
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f85353f = map2;
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put(com.safedk.android.utils.k.f53183d, "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        p.j(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            p.h(str);
            sb2.append(d0.h1(str, '.', null, 2, null));
            sb2.append("CompanionObject");
            Pair pairA = bn.h.a(sb2.toString(), str + ".Companion");
            map3.put(pairA.getFirst(), pairA.getSecond());
        }
        for (Map.Entry<Class<? extends bn.e<?>>, Integer> entry : f85351d.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f85354g = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(p0.f(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            p.h(str2);
            linkedHashMap.put(key, d0.h1(str2, '.', null, 2, null));
        }
        f85355h = linkedHashMap;
    }

    public g(@NotNull Class<?> cls) {
        p.k(cls, "jClass");
        this.f85356b = cls;
    }

    @Override // tn.f
    @NotNull
    public Class<?> a() {
        return this.f85356b;
    }

    @Override // kotlin.reflect.KClass
    public boolean equals(@Nullable Object obj) {
        return (obj instanceof g) && p.f(rn.a.b(this), rn.a.b((KClass) obj));
    }

    public final Void f() {
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        f();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public Collection<KFunction<Object>> getConstructors() {
        f();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass, kotlin.reflect.KDeclarationContainer
    @NotNull
    public Collection<KCallable<?>> getMembers() {
        f();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public Collection<KClass<?>> getNestedClasses() {
        f();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    public Object getObjectInstance() {
        f();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    public String getQualifiedName() {
        return f85350c.a(a());
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public List<KClass<? extends Object>> getSealedSubclasses() {
        f();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    public String getSimpleName() {
        return f85350c.b(a());
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public List<KType> getSupertypes() {
        f();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public List<KTypeParameter> getTypeParameters() {
        f();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    public KVisibility getVisibility() {
        f();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public int hashCode() {
        return rn.a.b(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public boolean isAbstract() {
        f();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isCompanion() {
        f();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isData() {
        f();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isFinal() {
        f();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isFun() {
        f();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isInner() {
        f();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isInstance(@Nullable Object obj) {
        return f85350c.c(obj, a());
    }

    @Override // kotlin.reflect.KClass
    public boolean isOpen() {
        f();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isSealed() {
        f();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean isValue() {
        f();
        throw new KotlinNothingValueException();
    }

    @NotNull
    public String toString() {
        return a() + " (Kotlin reflection is not available)";
    }
}
