package com.unity3d.ads.injection;

import bn.g;
import bn.h;
import cn.p0;
import com.ironsource.C4157n2;
import go.l;
import go.v;
import java.util.Map;
import kotlin.b;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: Registry.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class Registry {

    @NotNull
    private final l<Map<EntryKey, g<?>>> _services = v.a(a.j());

    public static /* synthetic */ EntryKey factory$default(Registry registry, String str, sn.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        p.k(str, "named");
        p.k(aVar, C4157n2.f33007p);
        p.q(4, "T");
        EntryKey entryKey = new EntryKey(str, t.b(Object.class));
        registry.add(entryKey, new Factory(aVar));
        return entryKey;
    }

    public static /* synthetic */ Object get$default(Registry registry, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        p.k(str, "named");
        p.q(4, "T");
        EntryKey entryKey = new EntryKey(str, t.b(Object.class));
        g<?> gVar = registry.getServices().get(entryKey);
        if (gVar != null) {
            Object value = gVar.getValue();
            p.q(1, "T");
            return value;
        }
        throw new IllegalStateException("No entry found for " + entryKey);
    }

    public static /* synthetic */ Object getOrNull$default(Registry registry, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        p.k(str, "named");
        p.q(4, "T");
        g<?> gVar = registry.getServices().get(new EntryKey(str, t.b(Object.class)));
        if (gVar == null) {
            return null;
        }
        Object value = gVar.getValue();
        p.q(1, "T");
        return value;
    }

    public static /* synthetic */ EntryKey single$default(Registry registry, String str, sn.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        p.k(str, "named");
        p.k(aVar, C4157n2.f33007p);
        p.q(4, "T");
        EntryKey entryKey = new EntryKey(str, t.b(Object.class));
        registry.add(entryKey, b.b(aVar));
        return entryKey;
    }

    public final <T> void add(@NotNull EntryKey entryKey, @NotNull g<? extends T> gVar) {
        Map<EntryKey, g<?>> value;
        p.k(entryKey, "key");
        p.k(gVar, C4157n2.f33007p);
        if (!(!getServices().containsKey(entryKey))) {
            throw new IllegalStateException("Cannot have identical entries.".toString());
        }
        l<Map<EntryKey, g<?>>> lVar = this._services;
        do {
            value = lVar.getValue();
        } while (!lVar.b(value, a.q(value, p0.g(h.a(entryKey, gVar)))));
    }

    public final /* synthetic */ <T> EntryKey factory(String str, sn.a<? extends T> aVar) {
        p.k(str, "named");
        p.k(aVar, C4157n2.f33007p);
        p.q(4, "T");
        EntryKey entryKey = new EntryKey(str, t.b(Object.class));
        add(entryKey, new Factory(aVar));
        return entryKey;
    }

    public final /* synthetic */ <T> T get(String str) {
        p.k(str, "named");
        p.q(4, "T");
        EntryKey entryKey = new EntryKey(str, t.b(Object.class));
        g<?> gVar = getServices().get(entryKey);
        if (gVar != null) {
            T t10 = (T) gVar.getValue();
            p.q(1, "T");
            return t10;
        }
        throw new IllegalStateException("No entry found for " + entryKey);
    }

    public final /* synthetic */ <T> T getOrNull(String str) {
        p.k(str, "named");
        p.q(4, "T");
        g<?> gVar = getServices().get(new EntryKey(str, t.b(Object.class)));
        if (gVar == null) {
            return null;
        }
        T t10 = (T) gVar.getValue();
        p.q(1, "T");
        return t10;
    }

    @NotNull
    public final Map<EntryKey, g<?>> getServices() {
        return this._services.getValue();
    }

    public final /* synthetic */ <T> EntryKey single(String str, sn.a<? extends T> aVar) {
        p.k(str, "named");
        p.k(aVar, C4157n2.f33007p);
        p.q(4, "T");
        EntryKey entryKey = new EntryKey(str, t.b(Object.class));
        add(entryKey, b.b(aVar));
        return entryKey;
    }
}
