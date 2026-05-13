package os;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: Iterators.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class b<E> implements Iterator<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator<E> f76926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f76927c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f76928d = false;

    public b(Collection<E> collection) {
        this.f76926b = new CopyOnWriteArrayList(collection).iterator();
    }

    public abstract void a(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76926b.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        this.f76928d = false;
        this.f76927c++;
        return this.f76926b.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i10 = this.f76927c;
        if (i10 == 0) {
            throw new IllegalStateException("Call next() first");
        }
        if (this.f76928d) {
            throw new IllegalStateException("Already removed current, call next()");
        }
        a(i10 - 1);
        this.f76928d = true;
    }
}
