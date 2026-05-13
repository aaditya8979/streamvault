package yads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xx implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f96914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f96915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f96916d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cy f96917e;

    public xx(cy cyVar) {
        this.f96917e = cyVar;
        this.f96914b = cyVar.f88648f;
        this.f96915c = cyVar.b();
    }

    public abstract Object a(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f96915c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f96917e.f88648f != this.f96914b) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f96915c;
        this.f96916d = i10;
        Object objA = a(i10);
        cy cyVar = this.f96917e;
        int i11 = this.f96915c + 1;
        if (i11 >= cyVar.f88649g) {
            i11 = -1;
        }
        this.f96915c = i11;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        cy cyVar = this.f96917e;
        int i10 = cyVar.f88648f;
        int i11 = this.f96914b;
        if (i10 != i11) {
            throw new ConcurrentModificationException();
        }
        int i12 = this.f96916d;
        if (!(i12 >= 0)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f96914b = i11 + 32;
        cyVar.remove(cyVar.b(i12));
        cy cyVar2 = this.f96917e;
        int i13 = this.f96915c;
        cyVar2.getClass();
        this.f96915c = i13 - 1;
        this.f96916d = -1;
    }
}
