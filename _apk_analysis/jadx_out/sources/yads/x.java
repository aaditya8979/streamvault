package yads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x extends AbstractCollection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f96570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f96571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f96572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Collection f96573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f96574f;

    public x(a0 a0Var, Object obj, Collection collection, x xVar) {
        this.f96574f = a0Var;
        this.f96570b = obj;
        this.f96571c = collection;
        this.f96572d = xVar;
        this.f96573e = xVar == null ? null : xVar.b();
    }

    public final void a() {
        x xVar = this.f96572d;
        if (xVar != null) {
            xVar.a();
        } else {
            this.f96574f.f87525f.put(this.f96570b, this.f96571c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        c();
        boolean zIsEmpty = this.f96571c.isEmpty();
        boolean zAdd = this.f96571c.add(obj);
        if (zAdd) {
            this.f96574f.f87526g++;
            if (zIsEmpty) {
                a();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        c();
        int size = this.f96571c.size();
        boolean zAddAll = this.f96571c.addAll(collection);
        if (zAddAll) {
            int size2 = this.f96571c.size();
            a0 a0Var = this.f96574f;
            a0Var.f87526g = (size2 - size) + a0Var.f87526g;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    public final Collection b() {
        return this.f96571c;
    }

    public final void c() {
        Collection collection;
        x xVar = this.f96572d;
        if (xVar != null) {
            xVar.c();
            if (this.f96572d.f96571c != this.f96573e) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f96571c.isEmpty() || (collection = (Collection) this.f96574f.f87525f.get(this.f96570b)) == null) {
                return;
            }
            this.f96571c = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        c();
        int size = this.f96571c.size();
        if (size == 0) {
            return;
        }
        this.f96571c.clear();
        this.f96574f.f87526g -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        c();
        return this.f96571c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        c();
        return this.f96571c.containsAll(collection);
    }

    public final void d() {
        x xVar = this.f96572d;
        if (xVar != null) {
            xVar.d();
        } else if (this.f96571c.isEmpty()) {
            this.f96574f.f87525f.remove(this.f96570b);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.f96571c.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        c();
        return this.f96571c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        c();
        return new w(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        c();
        boolean zRemove = this.f96571c.remove(obj);
        if (zRemove) {
            a0 a0Var = this.f96574f;
            a0Var.f87526g--;
            d();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        c();
        int size = this.f96571c.size();
        boolean zRemoveAll = this.f96571c.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f96571c.size();
            a0 a0Var = this.f96574f;
            a0Var.f87526g = (size2 - size) + a0Var.f87526g;
            d();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        c();
        int size = this.f96571c.size();
        boolean zRetainAll = this.f96571c.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f96571c.size();
            a0 a0Var = this.f96574f;
            a0Var.f87526g = (size2 - size) + a0Var.f87526g;
            d();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        c();
        return this.f96571c.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        c();
        return this.f96571c.toString();
    }
}
