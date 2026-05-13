package yads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s83 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f94731b;

    public s83(Iterator it) {
        this.f94731b = (Iterator) ng2.a(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f94731b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.f94731b.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f94731b.remove();
    }
}
