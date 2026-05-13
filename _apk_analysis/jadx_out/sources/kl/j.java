package kl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CaseInsensitiveMap.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class j<Value> implements Map<String, Value>, un.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<k, Value> f73157b = new LinkedHashMap();

    public static final Map.Entry f(Map.Entry entry) {
        tn.p.k(entry, "$this$DelegatingMutableSet");
        return new r(((k) entry.getKey()).a(), entry.getValue());
    }

    public static final Map.Entry g(Map.Entry entry) {
        tn.p.k(entry, "$this$DelegatingMutableSet");
        return new r(z.a((String) entry.getKey()), entry.getValue());
    }

    public static final String h(k kVar) {
        tn.p.k(kVar, "$this$DelegatingMutableSet");
        return kVar.a();
    }

    public static final k j(String str) {
        tn.p.k(str, "$this$DelegatingMutableSet");
        return z.a(str);
    }

    @Override // java.util.Map
    public void clear() {
        this.f73157b.clear();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return k((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f73157b.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Value>> entrySet() {
        return m();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        return tn.p.f(((j) obj).f73157b, this.f73157b);
    }

    @Override // java.util.Map
    public final /* bridge */ Value get(Object obj) {
        if (obj instanceof String) {
            return l((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f73157b.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f73157b.isEmpty();
    }

    public boolean k(@NotNull String str) {
        tn.p.k(str, "key");
        return this.f73157b.containsKey(new k(str));
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return n();
    }

    @Nullable
    public Value l(@NotNull String str) {
        tn.p.k(str, "key");
        return this.f73157b.get(z.a(str));
    }

    @NotNull
    public Set<Map.Entry<String, Value>> m() {
        return new q(this.f73157b.entrySet(), new sn.l() { // from class: kl.h
            @Override // sn.l
            public final Object invoke(Object obj) {
                return j.f((Map.Entry) obj);
            }
        }, new sn.l() { // from class: kl.i
            @Override // sn.l
            public final Object invoke(Object obj) {
                return j.g((Map.Entry) obj);
            }
        });
    }

    @NotNull
    public Set<String> n() {
        return new q(this.f73157b.keySet(), new sn.l() { // from class: kl.f
            @Override // sn.l
            public final Object invoke(Object obj) {
                return j.h((k) obj);
            }
        }, new sn.l() { // from class: kl.g
            @Override // sn.l
            public final Object invoke(Object obj) {
                return j.j((String) obj);
            }
        });
    }

    public int o() {
        return this.f73157b.size();
    }

    @NotNull
    public Collection<Value> p() {
        return this.f73157b.values();
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends String, ? extends Value> map) {
        tn.p.k(map, TypedValues.TransitionType.S_FROM);
        for (Map.Entry<? extends String, ? extends Value> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    @Nullable
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Value put(@NotNull String str, @NotNull Value value) {
        tn.p.k(str, "key");
        tn.p.k(value, "value");
        return this.f73157b.put(z.a(str), value);
    }

    @Nullable
    public Value r(@NotNull String str) {
        tn.p.k(str, "key");
        return this.f73157b.remove(z.a(str));
    }

    @Override // java.util.Map
    public final /* bridge */ Value remove(Object obj) {
        if (obj instanceof String) {
            return r((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return o();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Value> values() {
        return p();
    }
}
