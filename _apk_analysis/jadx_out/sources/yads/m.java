package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f92184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f92185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f92186d;

    public m(n nVar) {
        this.f92186d = nVar;
        this.f92184b = nVar.f92668d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f92184b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f92184b.next();
        this.f92185c = (Collection) entry.getValue();
        return this.f92186d.a(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!(this.f92185c != null)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f92184b.remove();
        this.f92186d.f92669e.f87526g -= this.f92185c.size();
        this.f92185c.clear();
        this.f92185c = null;
    }
}
