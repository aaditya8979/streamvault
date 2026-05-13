package yads;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class n43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile n43 f92737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f92738c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f92739a = new LinkedHashMap();

    public final void a(ie1 ie1Var, Object obj) {
        synchronized (f92738c) {
            Set set = (Set) this.f92739a.get(ie1Var);
            if (set != null) {
                set.remove(obj);
            }
        }
    }

    public final void b(ie1 ie1Var, Object obj) {
        synchronized (f92738c) {
            Set linkedHashSet = (Set) this.f92739a.get(ie1Var);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                this.f92739a.put(ie1Var, linkedHashSet);
            }
            linkedHashSet.add(obj);
        }
    }
}
