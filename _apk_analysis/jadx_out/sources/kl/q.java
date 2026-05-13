package kl;

import cn.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DelegatingMutableSet.kt */
/* JADX INFO: loaded from: classes12.dex */
public class q<From, To> implements Set<To>, un.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Set<From> f73161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final sn.l<From, To> f73162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final sn.l<To, From> f73163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f73164e;

    /* JADX INFO: compiled from: DelegatingMutableSet.kt */
    public static final class a implements Iterator<To>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<From> f73165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q<From, To> f73166c;

        public a(q<From, To> qVar) {
            this.f73166c = qVar;
            this.f73165b = qVar.f73161b.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f73165b.hasNext();
        }

        @Override // java.util.Iterator
        public To next() {
            return (To) this.f73166c.f73162c.invoke(this.f73165b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f73165b.remove();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(@NotNull Set<From> set, @NotNull sn.l<? super From, ? extends To> lVar, @NotNull sn.l<? super To, ? extends From> lVar2) {
        tn.p.k(set, "delegate");
        tn.p.k(lVar, "convertTo");
        tn.p.k(lVar2, "convert");
        this.f73161b = set;
        this.f73162c = lVar;
        this.f73163d = lVar2;
        this.f73164e = set.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(To to2) {
        return this.f73161b.add(this.f73163d.invoke(to2));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends To> collection) {
        tn.p.k(collection, "elements");
        return this.f73161b.addAll(g(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f73161b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f73161b.contains(this.f73163d.invoke(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        tn.p.k(collection, "elements");
        return this.f73161b.containsAll(g(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof Set)) {
            return false;
        }
        Collection<To> collectionH = h(this.f73161b);
        return ((Set) obj).containsAll(collectionH) && collectionH.containsAll((Collection) obj);
    }

    @NotNull
    public Collection<From> g(@NotNull Collection<? extends To> collection) {
        tn.p.k(collection, "<this>");
        ArrayList arrayList = new ArrayList(cn.x.x(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f73163d.invoke((To) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public Collection<To> h(@NotNull Collection<? extends From> collection) {
        tn.p.k(collection, "<this>");
        ArrayList arrayList = new ArrayList(cn.x.x(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f73162c.invoke((From) it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.f73161b.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f73161b.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<To> iterator() {
        return new a(this);
    }

    public int j() {
        return this.f73164e;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f73161b.remove(this.f73163d.invoke(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@NotNull Collection<?> collection) {
        tn.p.k(collection, "elements");
        return this.f73161b.removeAll(f0.l1(g(collection)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@NotNull Collection<?> collection) {
        tn.p.k(collection, "elements");
        return this.f73161b.retainAll(f0.l1(g(collection)));
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return j();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return tn.h.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        tn.p.k(tArr, "array");
        return (T[]) tn.h.b(this, tArr);
    }

    @NotNull
    public String toString() {
        return h(this.f73161b).toString();
    }
}
