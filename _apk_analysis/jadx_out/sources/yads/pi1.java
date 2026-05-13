package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pi1 extends ky2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f93600b;

    public pi1(Map map) {
        this.f93600b = (Map) ng2.a(map);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f93600b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f93600b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f93600b.size();
    }
}
