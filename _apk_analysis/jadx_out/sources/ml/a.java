package ml;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import un.e;

/* JADX INFO: compiled from: ConcurrentMapJvm.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class a<Key, Value> implements Map<Key, Value>, e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<Key, Value> f74325b;

    public a(int i10) {
        this.f74325b = new ConcurrentHashMap<>(i10);
    }

    public /* synthetic */ a(int i10, int i11, i iVar) {
        this((i11 & 1) != 0 ? 32 : i10);
    }

    @NotNull
    public Set<Map.Entry<Key, Value>> a() {
        Set<Map.Entry<Key, Value>> setEntrySet = this.f74325b.entrySet();
        p.j(setEntrySet, "<get-entries>(...)");
        return setEntrySet;
    }

    @NotNull
    public Set<Key> b() {
        Set<Key> setKeySet = this.f74325b.keySet();
        p.j(setKeySet, "<get-keys>(...)");
        return setKeySet;
    }

    public int c() {
        return this.f74325b.size();
    }

    @Override // java.util.Map
    public void clear() {
        this.f74325b.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f74325b.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f74325b.containsValue(obj);
    }

    @NotNull
    public Collection<Value> d() {
        Collection<Value> collectionValues = this.f74325b.values();
        p.j(collectionValues, "<get-values>(...)");
        return collectionValues;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<Key, Value>> entrySet() {
        return a();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Map) {
            return p.f(obj, this.f74325b);
        }
        return false;
    }

    @Override // java.util.Map
    @Nullable
    public Value get(Object obj) {
        return this.f74325b.get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f74325b.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f74325b.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Key> keySet() {
        return b();
    }

    @Override // java.util.Map
    @Nullable
    public Value put(Key key, Value value) {
        return this.f74325b.put(key, value);
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends Key, ? extends Value> map) {
        p.k(map, TypedValues.TransitionType.S_FROM);
        this.f74325b.putAll(map);
    }

    @Override // java.util.Map
    @Nullable
    public Value remove(Object obj) {
        return this.f74325b.remove(obj);
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        return this.f74325b.remove(obj, obj2);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return c();
    }

    @NotNull
    public String toString() {
        return "ConcurrentMapJvm by " + this.f74325b;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Value> values() {
        return d();
    }
}
