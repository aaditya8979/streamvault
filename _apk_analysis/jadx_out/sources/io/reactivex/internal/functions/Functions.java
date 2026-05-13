package io.reactivex.internal.functions;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class Functions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dm.o<Object, Object> f71324a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Runnable f71325b = new q();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final dm.a f71326c = new n();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final dm.g<Object> f71327d = new o();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final dm.g<Throwable> f71328e = new s();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final dm.g<Throwable> f71329f = new d0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final dm.p f71330g = new p();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final dm.q<Object> f71331h = new i0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final dm.q<Object> f71332i = new t();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Callable<Object> f71333j = new c0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Comparator<Object> f71334k = new y();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final dm.g<ms.c> f71335l = new x();

    public enum HashSetCallable implements Callable<Set<Object>> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        public Set<Object> call() throws Exception {
            return new HashSet();
        }
    }

    public enum NaturalComparator implements Comparator<Object> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public static final class a<T> implements dm.g<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dm.a f71338b;

        public a(dm.a aVar) {
            this.f71338b = aVar;
        }

        @Override // dm.g
        public void accept(T t10) throws Exception {
            this.f71338b.run();
        }
    }

    public static final class a0<T> implements dm.g<Throwable> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dm.g<? super xl.j<T>> f71339b;

        public a0(dm.g<? super xl.j<T>> gVar) {
            this.f71339b = gVar;
        }

        @Override // dm.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) throws Exception {
            this.f71339b.accept(xl.j.b(th2));
        }
    }

    public static final class b<T1, T2, R> implements dm.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dm.c<? super T1, ? super T2, ? extends R> f71340b;

        public b(dm.c<? super T1, ? super T2, ? extends R> cVar) {
            this.f71340b = cVar;
        }

        @Override // dm.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return this.f71340b.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    public static final class b0<T> implements dm.g<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dm.g<? super xl.j<T>> f71341b;

        public b0(dm.g<? super xl.j<T>> gVar) {
            this.f71341b = gVar;
        }

        @Override // dm.g
        public void accept(T t10) throws Exception {
            this.f71341b.accept(xl.j.c(t10));
        }
    }

    public static final class c<T1, T2, T3, R> implements dm.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dm.h<T1, T2, T3, R> f71342b;

        public c(dm.h<T1, T2, T3, R> hVar) {
            this.f71342b = hVar;
        }

        @Override // dm.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 3) {
                return this.f71342b.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2]);
            }
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
        }
    }

    public static final class c0 implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    public static final class d<T1, T2, T3, T4, R> implements dm.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dm.i<T1, T2, T3, T4, R> f71343b;

        public d(dm.i<T1, T2, T3, T4, R> iVar) {
            this.f71343b = iVar;
        }

        @Override // dm.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 4) {
                throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
            }
            return this.f71343b.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3]);
        }
    }

    public static final class d0 implements dm.g<Throwable> {
        @Override // dm.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            tm.a.s(new OnErrorNotImplementedException(th2));
        }
    }

    public static final class e<T1, T2, T3, T4, T5, R> implements dm.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dm.j<T1, T2, T3, T4, T5, R> f71344b;

        public e(dm.j<T1, T2, T3, T4, T5, R> jVar) {
            this.f71344b = jVar;
        }

        @Override // dm.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 5) {
                throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
            }
            return this.f71344b.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4]);
        }
    }

    public static final class e0<T> implements dm.o<T, vm.b<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TimeUnit f71345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xl.s f71346c;

        public e0(TimeUnit timeUnit, xl.s sVar) {
            this.f71345b = timeUnit;
            this.f71346c = sVar;
        }

        @Override // dm.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public vm.b<T> apply(T t10) throws Exception {
            return new vm.b<>(t10, this.f71346c.b(this.f71345b), this.f71345b);
        }
    }

    public static final class f<T1, T2, T3, T4, T5, T6, R> implements dm.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dm.k<T1, T2, T3, T4, T5, T6, R> f71347b;

        public f(dm.k<T1, T2, T3, T4, T5, T6, R> kVar) {
            this.f71347b = kVar;
        }

        @Override // dm.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 6) {
                throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
            }
            return this.f71347b.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5]);
        }
    }

    public static final class f0<K, T> implements dm.b<Map<K, T>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dm.o<? super T, ? extends K> f71348a;

        public f0(dm.o<? super T, ? extends K> oVar) {
            this.f71348a = oVar;
        }

        @Override // dm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, T> map, T t10) throws Exception {
            map.put(this.f71348a.apply(t10), t10);
        }
    }

    public static final class g<T1, T2, T3, T4, T5, T6, T7, R> implements dm.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dm.l<T1, T2, T3, T4, T5, T6, T7, R> f71349b;

        public g(dm.l<T1, T2, T3, T4, T5, T6, T7, R> lVar) {
            this.f71349b = lVar;
        }

        @Override // dm.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 7) {
                throw new IllegalArgumentException("Array of size 7 expected but got " + objArr.length);
            }
            return this.f71349b.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6]);
        }
    }

    public static final class g0<K, V, T> implements dm.b<Map<K, V>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dm.o<? super T, ? extends V> f71350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dm.o<? super T, ? extends K> f71351b;

        public g0(dm.o<? super T, ? extends V> oVar, dm.o<? super T, ? extends K> oVar2) {
            this.f71350a = oVar;
            this.f71351b = oVar2;
        }

        @Override // dm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, V> map, T t10) throws Exception {
            map.put(this.f71351b.apply(t10), this.f71350a.apply(t10));
        }
    }

    public static final class h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements dm.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dm.m<T1, T2, T3, T4, T5, T6, T7, T8, R> f71352b;

        public h(dm.m<T1, T2, T3, T4, T5, T6, T7, T8, R> mVar) {
            this.f71352b = mVar;
        }

        @Override // dm.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 8) {
                throw new IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
            }
            return this.f71352b.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6], (T8) objArr[7]);
        }
    }

    public static final class h0<K, V, T> implements dm.b<Map<K, Collection<V>>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dm.o<? super K, ? extends Collection<? super V>> f71353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dm.o<? super T, ? extends V> f71354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dm.o<? super T, ? extends K> f71355c;

        public h0(dm.o<? super K, ? extends Collection<? super V>> oVar, dm.o<? super T, ? extends V> oVar2, dm.o<? super T, ? extends K> oVar3) {
            this.f71353a = oVar;
            this.f71354b = oVar2;
            this.f71355c = oVar3;
        }

        @Override // dm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Map<K, Collection<V>> map, T t10) throws Exception {
            K kApply = this.f71355c.apply(t10);
            Collection<? super V> collectionApply = (Collection) map.get(kApply);
            if (collectionApply == null) {
                collectionApply = this.f71353a.apply(kApply);
                map.put(kApply, collectionApply);
            }
            collectionApply.add(this.f71354b.apply(t10));
        }
    }

    public static final class i<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements dm.o<Object[], R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dm.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f71356b;

        public i(dm.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> nVar) {
            this.f71356b = nVar;
        }

        @Override // dm.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length != 9) {
                throw new IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
            }
            return this.f71356b.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2], (T4) objArr[3], (T5) objArr[4], (T6) objArr[5], (T7) objArr[6], (T8) objArr[7], (T9) objArr[8]);
        }
    }

    public static final class i0 implements dm.q<Object> {
        @Override // dm.q
        public boolean test(Object obj) {
            return true;
        }
    }

    public static final class j<T> implements Callable<List<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f71357b;

        public j(int i10) {
            this.f71357b = i10;
        }

        @Override // java.util.concurrent.Callable
        public List<T> call() throws Exception {
            return new ArrayList(this.f71357b);
        }
    }

    public static final class k<T> implements dm.q<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dm.e f71358b;

        public k(dm.e eVar) {
            this.f71358b = eVar;
        }

        @Override // dm.q
        public boolean test(T t10) throws Exception {
            return !this.f71358b.a();
        }
    }

    public static final class l<T, U> implements dm.o<T, U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<U> f71359b;

        public l(Class<U> cls) {
            this.f71359b = cls;
        }

        @Override // dm.o
        public U apply(T t10) throws Exception {
            return this.f71359b.cast(t10);
        }
    }

    public static final class m<T, U> implements dm.q<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<U> f71360b;

        public m(Class<U> cls) {
            this.f71360b = cls;
        }

        @Override // dm.q
        public boolean test(T t10) throws Exception {
            return this.f71360b.isInstance(t10);
        }
    }

    public static final class n implements dm.a {
        @Override // dm.a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    public static final class o implements dm.g<Object> {
        @Override // dm.g
        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    public static final class p implements dm.p {
    }

    public static final class q implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    public static final class r<T> implements dm.q<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f71361b;

        public r(T t10) {
            this.f71361b = t10;
        }

        @Override // dm.q
        public boolean test(T t10) throws Exception {
            return fm.a.c(t10, this.f71361b);
        }
    }

    public static final class s implements dm.g<Throwable> {
        @Override // dm.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            tm.a.s(th2);
        }
    }

    public static final class t implements dm.q<Object> {
        @Override // dm.q
        public boolean test(Object obj) {
            return false;
        }
    }

    public static final class u implements dm.o<Object, Object> {
        @Override // dm.o
        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    public static final class v<T, U> implements Callable<U>, dm.o<T, U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final U f71362b;

        public v(U u10) {
            this.f71362b = u10;
        }

        @Override // dm.o
        public U apply(T t10) throws Exception {
            return this.f71362b;
        }

        @Override // java.util.concurrent.Callable
        public U call() throws Exception {
            return this.f71362b;
        }
    }

    public static final class w<T> implements dm.o<List<T>, List<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Comparator<? super T> f71363b;

        public w(Comparator<? super T> comparator) {
            this.f71363b = comparator;
        }

        @Override // dm.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> apply(List<T> list) {
            Collections.sort(list, this.f71363b);
            return list;
        }
    }

    public static final class x implements dm.g<ms.c> {
        @Override // dm.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(ms.c cVar) throws Exception {
            cVar.request(Long.MAX_VALUE);
        }
    }

    public static final class y implements Comparator<Object> {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public static final class z<T> implements dm.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dm.g<? super xl.j<T>> f71364b;

        public z(dm.g<? super xl.j<T>> gVar) {
            this.f71364b = gVar;
        }

        @Override // dm.a
        public void run() throws Exception {
            this.f71364b.accept(xl.j.a());
        }
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> dm.o<Object[], R> A(dm.l<T1, T2, T3, T4, T5, T6, T7, R> lVar) {
        fm.a.e(lVar, "f is null");
        return new g(lVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> dm.o<Object[], R> B(dm.m<T1, T2, T3, T4, T5, T6, T7, T8, R> mVar) {
        fm.a.e(mVar, "f is null");
        return new h(mVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> dm.o<Object[], R> C(dm.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> nVar) {
        fm.a.e(nVar, "f is null");
        return new i(nVar);
    }

    public static <T, K> dm.b<Map<K, T>, T> D(dm.o<? super T, ? extends K> oVar) {
        return new f0(oVar);
    }

    public static <T, K, V> dm.b<Map<K, V>, T> E(dm.o<? super T, ? extends K> oVar, dm.o<? super T, ? extends V> oVar2) {
        return new g0(oVar2, oVar);
    }

    public static <T, K, V> dm.b<Map<K, Collection<V>>, T> F(dm.o<? super T, ? extends K> oVar, dm.o<? super T, ? extends V> oVar2, dm.o<? super K, ? extends Collection<? super V>> oVar3) {
        return new h0(oVar3, oVar2, oVar);
    }

    public static <T> dm.g<T> a(dm.a aVar) {
        return new a(aVar);
    }

    public static <T> dm.q<T> b() {
        return (dm.q<T>) f71332i;
    }

    public static <T> dm.q<T> c() {
        return (dm.q<T>) f71331h;
    }

    public static <T, U> dm.o<T, U> d(Class<U> cls) {
        return new l(cls);
    }

    public static <T> Callable<List<T>> e(int i10) {
        return new j(i10);
    }

    public static <T> Callable<Set<T>> f() {
        return HashSetCallable.INSTANCE;
    }

    public static <T> dm.g<T> g() {
        return (dm.g<T>) f71327d;
    }

    public static <T> dm.q<T> h(T t10) {
        return new r(t10);
    }

    public static <T> dm.o<T, T> i() {
        return (dm.o<T, T>) f71324a;
    }

    public static <T, U> dm.q<T> j(Class<U> cls) {
        return new m(cls);
    }

    public static <T> Callable<T> k(T t10) {
        return new v(t10);
    }

    public static <T, U> dm.o<T, U> l(U u10) {
        return new v(u10);
    }

    public static <T> dm.o<List<T>, List<T>> m(Comparator<? super T> comparator) {
        return new w(comparator);
    }

    public static <T> Comparator<T> n() {
        return NaturalComparator.INSTANCE;
    }

    public static <T> Comparator<T> o() {
        return (Comparator<T>) f71334k;
    }

    public static <T> dm.a p(dm.g<? super xl.j<T>> gVar) {
        return new z(gVar);
    }

    public static <T> dm.g<Throwable> q(dm.g<? super xl.j<T>> gVar) {
        return new a0(gVar);
    }

    public static <T> dm.g<T> r(dm.g<? super xl.j<T>> gVar) {
        return new b0(gVar);
    }

    public static <T> Callable<T> s() {
        return (Callable<T>) f71333j;
    }

    public static <T> dm.q<T> t(dm.e eVar) {
        return new k(eVar);
    }

    public static <T> dm.o<T, vm.b<T>> u(TimeUnit timeUnit, xl.s sVar) {
        return new e0(timeUnit, sVar);
    }

    public static <T1, T2, R> dm.o<Object[], R> v(dm.c<? super T1, ? super T2, ? extends R> cVar) {
        fm.a.e(cVar, "f is null");
        return new b(cVar);
    }

    public static <T1, T2, T3, R> dm.o<Object[], R> w(dm.h<T1, T2, T3, R> hVar) {
        fm.a.e(hVar, "f is null");
        return new c(hVar);
    }

    public static <T1, T2, T3, T4, R> dm.o<Object[], R> x(dm.i<T1, T2, T3, T4, R> iVar) {
        fm.a.e(iVar, "f is null");
        return new d(iVar);
    }

    public static <T1, T2, T3, T4, T5, R> dm.o<Object[], R> y(dm.j<T1, T2, T3, T4, T5, R> jVar) {
        fm.a.e(jVar, "f is null");
        return new e(jVar);
    }

    public static <T1, T2, T3, T4, T5, T6, R> dm.o<Object[], R> z(dm.k<T1, T2, T3, T4, T5, T6, R> kVar) {
        fm.a.e(kVar, "f is null");
        return new f(kVar);
    }
}
