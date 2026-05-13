package yads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ox0 implements Map {
    @Override // java.util.Map
    public final void clear() {
        ((rd0) this).f94380b.clear();
    }

    @Override // java.util.Map
    public Set entrySet() {
        return ((rd0) this).f94380b.entrySet();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return ((rd0) this).f94380b.isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return ((rd0) this).f94380b.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return ((rd0) this).f94380b.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        ((rd0) this).f94380b.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return ((rd0) this).f94380b.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return ((rd0) this).f94380b.size();
    }

    public final String toString() {
        return ((rd0) this).f94380b.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return ((rd0) this).f94380b.values();
    }
}
