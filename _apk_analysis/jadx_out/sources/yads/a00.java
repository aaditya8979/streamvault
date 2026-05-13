package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class a00 implements Iterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f87527b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f87528c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f87529d = Collections.emptySet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f87530e = Collections.emptyList();

    public final int a(Object obj) {
        int iIntValue;
        synchronized (this.f87527b) {
            iIntValue = this.f87528c.containsKey(obj) ? ((Integer) this.f87528c.get(obj)).intValue() : 0;
        }
        return iIntValue;
    }

    public final void b(Object obj) {
        synchronized (this.f87527b) {
            Integer num = (Integer) this.f87528c.get(obj);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f87530e);
            arrayList.remove(obj);
            this.f87530e = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f87528c.remove(obj);
                HashSet hashSet = new HashSet(this.f87529d);
                hashSet.remove(obj);
                this.f87529d = Collections.unmodifiableSet(hashSet);
            } else {
                this.f87528c.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f87527b) {
            it = this.f87530e.iterator();
        }
        return it;
    }
}
