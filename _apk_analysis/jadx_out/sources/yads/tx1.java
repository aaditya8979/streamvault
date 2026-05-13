package yads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tx1 extends AbstractCollection {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        a0 a0Var = (a0) ((c0) this).f88254b;
        Iterator it = a0Var.f87525f.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        a0Var.f87525f.clear();
        a0Var.f87526g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        e0 e0Var = ((c0) this).f88254b;
        Object key = entry.getKey();
        Object value = entry.getValue();
        Collection collection = (Collection) e0Var.a().get(key);
        return collection != null && collection.contains(value);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        e0 e0Var = ((c0) this).f88254b;
        Object key = entry.getKey();
        Object value = entry.getValue();
        Collection collection = (Collection) e0Var.a().get(key);
        return collection != null && collection.remove(value);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return ((a0) ((c0) this).f88254b).f87526g;
    }
}
