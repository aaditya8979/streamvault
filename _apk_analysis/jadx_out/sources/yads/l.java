package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends oi1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f91815b;

    public l(n nVar) {
        this.f91815b = nVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set setEntrySet = this.f91815b.f92668d.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new m(this.f91815b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object objRemove;
        Set setEntrySet = this.f91815b.f92668d.entrySet();
        setEntrySet.getClass();
        try {
            if (!setEntrySet.contains(obj)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Objects.requireNonNull(entry);
            a0 a0Var = this.f91815b.f92669e;
            Object key = entry.getKey();
            Map map = a0Var.f87525f;
            map.getClass();
            try {
                objRemove = map.remove(key);
            } catch (ClassCastException | NullPointerException unused) {
                objRemove = null;
            }
            Collection collection = (Collection) objRemove;
            if (collection == null) {
                return true;
            }
            int size = collection.size();
            collection.clear();
            a0Var.f87526g -= size;
            return true;
        } catch (ClassCastException | NullPointerException unused2) {
            return false;
        }
    }
}
