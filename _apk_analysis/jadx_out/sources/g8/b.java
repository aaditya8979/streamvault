package g8;

import com.google.gson.JsonIOException;
import com.google.gson.internal.LinkedTreeMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: compiled from: ConstructorConstructor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Type, e8.d<?>> f62212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i8.b f62213b = i8.b.a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class a<T> implements g8.e<T> {
        public a() {
        }

        @Override // g8.e
        public T a() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: g8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class C0769b<T> implements g8.e<T> {
        public C0769b() {
        }

        @Override // g8.e
        public T a() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class c<T> implements g8.e<T> {
        public c() {
        }

        @Override // g8.e
        public T a() {
            return (T) new LinkedHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class d<T> implements g8.e<T> {
        public d() {
        }

        @Override // g8.e
        public T a() {
            return (T) new LinkedTreeMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class e<T> implements g8.e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g8.i f62218a = g8.i.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f62219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Type f62220c;

        public e(Class cls, Type type) {
            this.f62219b = cls;
            this.f62220c = type;
        }

        @Override // g8.e
        public T a() {
            try {
                return (T) this.f62218a.c(this.f62219b);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f62220c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e10);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class f<T> implements g8.e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e8.d f62222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Type f62223b;

        public f(e8.d dVar, Type type) {
            this.f62222a = dVar;
            this.f62223b = type;
        }

        @Override // g8.e
        public T a() {
            return (T) this.f62222a.a(this.f62223b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class g<T> implements g8.e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e8.d f62225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Type f62226b;

        public g(e8.d dVar, Type type) {
            this.f62225a = dVar;
            this.f62226b = type;
        }

        @Override // g8.e
        public T a() {
            return (T) this.f62225a.a(this.f62226b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class h<T> implements g8.e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Constructor f62228a;

        public h(Constructor constructor) {
            this.f62228a = constructor;
        }

        @Override // g8.e
        public T a() {
            try {
                return (T) this.f62228a.newInstance(null);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Failed to invoke " + this.f62228a + " with no args", e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke " + this.f62228a + " with no args", e12.getTargetException());
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class i<T> implements g8.e<T> {
        public i() {
        }

        @Override // g8.e
        public T a() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class j<T> implements g8.e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f62231a;

        public j(Type type) {
            this.f62231a = type;
        }

        @Override // g8.e
        public T a() {
            Type type = this.f62231a;
            if (!(type instanceof ParameterizedType)) {
                throw new JsonIOException("Invalid EnumSet type: " + this.f62231a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) EnumSet.noneOf((Class) type2);
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f62231a.toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class k<T> implements g8.e<T> {
        public k() {
        }

        @Override // g8.e
        public T a() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class l<T> implements g8.e<T> {
        public l() {
        }

        @Override // g8.e
        public T a() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class m<T> implements g8.e<T> {
        public m() {
        }

        @Override // g8.e
        public T a() {
            return (T) new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class n<T> implements g8.e<T> {
        public n() {
        }

        @Override // g8.e
        public T a() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    public b(Map<Type, e8.d<?>> map) {
        this.f62212a = map;
    }

    public <T> g8.e<T> a(j8.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> clsC = aVar.c();
        e8.d<?> dVar = this.f62212a.get(type);
        if (dVar != null) {
            return new f(dVar, type);
        }
        e8.d<?> dVar2 = this.f62212a.get(clsC);
        if (dVar2 != null) {
            return new g(dVar2, type);
        }
        g8.e<T> eVarB = b(clsC);
        if (eVarB != null) {
            return eVarB;
        }
        g8.e<T> eVarC = c(type, clsC);
        return eVarC != null ? eVarC : d(type, clsC);
    }

    public final <T> g8.e<T> b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f62213b.b(declaredConstructor);
            }
            return new h(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final <T> g8.e<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new i() : EnumSet.class.isAssignableFrom(cls) ? new j(type) : Set.class.isAssignableFrom(cls) ? new k() : Queue.class.isAssignableFrom(cls) ? new l() : new m();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new n() : ConcurrentMap.class.isAssignableFrom(cls) ? new a() : SortedMap.class.isAssignableFrom(cls) ? new C0769b() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(j8.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) ? new d() : new c();
        }
        return null;
    }

    public final <T> g8.e<T> d(Type type, Class<? super T> cls) {
        return new e(cls, type);
    }

    public String toString() {
        return this.f62212a.toString();
    }
}
