package ws;

import android.annotation.SuppressLint;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: LruArrayPool.java */
/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e<a, Object> f86707a = new e<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f86708b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f86709c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Class<?>, ws.a<?>> f86710d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f86711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86712f;

    /* JADX INFO: compiled from: LruArrayPool.java */
    public static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f86713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f86714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Class<?> f86715c;

        public a(b bVar) {
            this.f86713a = bVar;
        }

        public void a(int i10, Class<?> cls) {
            this.f86714b = i10;
            this.f86715c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f86714b == aVar.f86714b && this.f86715c == aVar.f86715c;
        }

        public int hashCode() {
            int i10 = this.f86714b * 31;
            Class<?> cls = this.f86715c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        @Override // ws.h
        public void offer() {
            this.f86713a.d(this);
        }

        public String toString() {
            return "Key{size=" + this.f86714b + "array=" + this.f86715c + '}';
        }
    }

    /* JADX INFO: compiled from: LruArrayPool.java */
    public static final class b extends c<a> {
        @Override // ws.c
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        public a f(int i10, Class<?> cls) {
            a aVarC = c();
            aVarC.a(i10, cls);
            return aVarC;
        }
    }

    public g(int i10) {
        this.f86711e = i10;
    }

    public synchronized void a() {
        d(0);
    }

    public final void b(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapJ = j(cls);
        Integer num = navigableMapJ.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapJ.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapJ.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    public final void c() {
        d(this.f86711e);
    }

    @SuppressLint({"RestrictedApi"})
    public final void d(int i10) {
        while (this.f86712f > i10) {
            Object objF = this.f86707a.f();
            ws.a aVarF = f(objF);
            this.f86712f -= aVarF.getArrayLength(objF) * aVarF.getElementSizeInBytes();
            b(aVarF.getArrayLength(objF), objF.getClass());
            if (Log.isLoggable(aVarF.getTag(), 2)) {
                Log.v(aVarF.getTag(), "evicted: " + aVarF.getArrayLength(objF));
            }
        }
    }

    public synchronized <T> T e(int i10, Class<T> cls) {
        Integer numCeilingKey;
        numCeilingKey = j(cls).ceilingKey(Integer.valueOf(i10));
        return (T) i(m(i10, numCeilingKey) ? this.f86708b.f(numCeilingKey.intValue(), cls) : this.f86708b.f(i10, cls), cls);
    }

    public final <T> ws.a<T> f(T t10) {
        return g(t10.getClass());
    }

    public final <T> ws.a<T> g(Class<T> cls) {
        ws.a<T> dVar = (ws.a) this.f86710d.get(cls);
        if (dVar == null) {
            if (cls.equals(int[].class)) {
                dVar = new f();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                dVar = new d();
            }
            this.f86710d.put(cls, dVar);
        }
        return dVar;
    }

    public final <T> T h(a aVar) {
        return (T) this.f86707a.a(aVar);
    }

    public final <T> T i(a aVar, Class<T> cls) {
        ws.a<T> aVarG = g(cls);
        T t10 = (T) h(aVar);
        if (t10 != null) {
            this.f86712f -= aVarG.getArrayLength(t10) * aVarG.getElementSizeInBytes();
            b(aVarG.getArrayLength(t10), cls);
        }
        if (t10 != null) {
            return t10;
        }
        if (Log.isLoggable(aVarG.getTag(), 2)) {
            Log.v(aVarG.getTag(), "Allocated " + aVar.f86714b + " bytes");
        }
        return aVarG.newArray(aVar.f86714b);
    }

    public final NavigableMap<Integer, Integer> j(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f86709c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f86709c.put(cls, treeMap);
        return treeMap;
    }

    public final boolean k() {
        int i10 = this.f86712f;
        return i10 == 0 || this.f86711e / i10 >= 2;
    }

    public final boolean l(int i10) {
        return i10 <= this.f86711e / 2;
    }

    public final boolean m(int i10, Integer num) {
        return num != null && (k() || num.intValue() <= i10 * 8);
    }

    public synchronized <T> void n(T t10) {
        Class<?> cls = t10.getClass();
        ws.a<T> aVarG = g(cls);
        int arrayLength = aVarG.getArrayLength(t10);
        int elementSizeInBytes = aVarG.getElementSizeInBytes() * arrayLength;
        if (l(elementSizeInBytes)) {
            a aVarF = this.f86708b.f(arrayLength, cls);
            this.f86707a.d(aVarF, t10);
            NavigableMap<Integer, Integer> navigableMapJ = j(cls);
            Integer num = navigableMapJ.get(Integer.valueOf(aVarF.f86714b));
            Integer numValueOf = Integer.valueOf(aVarF.f86714b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapJ.put(numValueOf, Integer.valueOf(iIntValue));
            this.f86712f += elementSizeInBytes;
            c();
        }
    }
}
