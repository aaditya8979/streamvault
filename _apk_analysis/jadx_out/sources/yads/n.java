package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class n extends ri1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Map f92668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f92669e;

    public n(a0 a0Var, Map map) {
        this.f92669e = a0Var;
        this.f92668d = map;
    }

    public final k51 a(Map.Entry entry) {
        Object key = entry.getKey();
        a0 a0Var = this.f92669e;
        Collection collection = (Collection) entry.getValue();
        i iVar = (i) a0Var;
        iVar.getClass();
        List list = (List) collection;
        return new k51(key, list instanceof RandomAccess ? new t(iVar, key, list, null) : new z(iVar, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.f92668d;
        a0 a0Var = this.f92669e;
        Map map2 = a0Var.f87525f;
        if (map != map2) {
            m mVar = new m(this);
            while (mVar.hasNext()) {
                mVar.next();
                mVar.remove();
            }
            return;
        }
        Iterator it = map2.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        a0Var.f87525f.clear();
        a0Var.f87526g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f92668d;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f92668d.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f92668d;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        i iVar = (i) this.f92669e;
        iVar.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new t(iVar, obj, list, null) : new z(iVar, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f92668d.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        a0 a0Var = this.f92669e;
        q qVar = a0Var.f89036c;
        if (qVar != null) {
            return qVar;
        }
        q qVarC = ((sx1) a0Var).c();
        a0Var.f89036c = qVarC;
        return qVarC;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f92668d.remove(obj);
        if (collection == null) {
            return null;
        }
        List list = (List) ((sx1) this.f92669e).f95006h.get();
        list.addAll(collection);
        this.f92669e.f87526g -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f92668d.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f92668d.toString();
    }
}
