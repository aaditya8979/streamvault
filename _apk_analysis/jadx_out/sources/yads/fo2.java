package yads;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class fo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f89652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f89653b;

    public /* synthetic */ fo2(Map map, int i10) {
        this((i10 & 1) != 0 ? kotlin.collections.a.j() : map, (c) null);
    }

    public fo2(Map map, c cVar) {
        map = tn.y.m(map) ? map : null;
        this.f89652a = map == null ? new LinkedHashMap() : map;
        this.f89653b = cVar;
    }

    public final void a(Object obj, String str) {
        if (obj != null) {
            this.f89652a.put(str, obj);
        }
    }

    public final void b(Object obj, String str) {
        if (obj == null) {
            this.f89652a.put(str, "undefined");
        } else {
            this.f89652a.put(str, obj);
        }
    }
}
