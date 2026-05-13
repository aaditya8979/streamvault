package e8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: JsonArray.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends h implements Iterable<h> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<h> f60934b = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof e) && ((e) obj).f60934b.equals(this.f60934b));
    }

    public int hashCode() {
        return this.f60934b.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<h> iterator() {
        return this.f60934b.iterator();
    }

    public void m(h hVar) {
        if (hVar == null) {
            hVar = i.f60935b;
        }
        this.f60934b.add(hVar);
    }
}
