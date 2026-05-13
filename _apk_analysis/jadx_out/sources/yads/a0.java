package yads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a0 extends e0 implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient Map f87525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient int f87526g;

    public a0(Map map) {
        ng2.a(map.isEmpty());
        this.f87525f = map;
    }

    public static Iterator a(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public final n b() {
        Map map = this.f87525f;
        return map instanceof NavigableMap ? new r(this, (NavigableMap) this.f87525f) : map instanceof SortedMap ? new u(this, (SortedMap) this.f87525f) : new n(this, this.f87525f);
    }

    public final q c() {
        Map map = this.f87525f;
        return map instanceof NavigableMap ? new s(this, (NavigableMap) this.f87525f) : map instanceof SortedMap ? new v(this, (SortedMap) this.f87525f) : new q(this, this.f87525f);
    }
}
