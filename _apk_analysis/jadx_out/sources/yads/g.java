package yads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends ja3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f89741b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f89742c;

    public abstract Object a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f89741b;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int iA = hg0.a(i10);
        if (iA == 0) {
            return true;
        }
        if (iA == 2) {
            return false;
        }
        this.f89741b = 4;
        this.f89742c = a();
        if (this.f89741b == 3) {
            return false;
        }
        this.f89741b = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f89741b = 2;
        Object obj = this.f89742c;
        this.f89742c = null;
        return obj;
    }
}
