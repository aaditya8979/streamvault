package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map.Entry f93365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterator f93366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f93367d;

    public p(q qVar, Iterator it) {
        this.f93367d = qVar;
        this.f93366c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f93366c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f93366c.next();
        this.f93365b = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Map.Entry entry = this.f93365b;
        if (!(entry != null)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        Collection collection = (Collection) entry.getValue();
        this.f93366c.remove();
        this.f93367d.f93848c.f87526g -= collection.size();
        collection.clear();
        this.f93365b = null;
    }
}
