package yads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public class w implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f96241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f96242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f96243d;

    public w(x xVar) {
        this.f96243d = xVar;
        Collection collection = xVar.f96571c;
        this.f96242c = collection;
        this.f96241b = a0.a(collection);
    }

    public w(x xVar, ListIterator listIterator) {
        this.f96243d = xVar;
        this.f96242c = xVar.f96571c;
        this.f96241b = listIterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        this.f96243d.c();
        if (this.f96243d.f96571c == this.f96242c) {
            return this.f96241b.hasNext();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f96243d.c();
        if (this.f96243d.f96571c == this.f96242c) {
            return this.f96241b.next();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f96241b.remove();
        x xVar = this.f96243d;
        a0 a0Var = xVar.f96574f;
        a0Var.f87526g--;
        xVar.d();
    }
}
