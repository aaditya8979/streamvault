package wo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class o0<K, V> extends k1<K, V, Map<K, ? extends V>, HashMap<K, V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SerialDescriptor f86579c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(@NotNull KSerializer<K> kSerializer, @NotNull KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, null);
        tn.p.k(kSerializer, "kSerializer");
        tn.p.k(kSerializer2, "vSerializer");
        this.f86579c = new n0(kSerializer.getDescriptor(), kSerializer2.getDescriptor());
    }

    @Override // wo.k1, kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f86579c;
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public HashMap<K, V> b() {
        return new HashMap<>();
    }

    @Override // wo.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull HashMap<K, V> map) {
        tn.p.k(map, "<this>");
        return map.size() * 2;
    }

    @Override // wo.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void d(@NotNull HashMap<K, V> map, int i10) {
        tn.p.k(map, "<this>");
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Iterator<Map.Entry<K, V>> e(@NotNull Map<K, ? extends V> map) {
        tn.p.k(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // wo.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int f(@NotNull Map<K, ? extends V> map) {
        tn.p.k(map, "<this>");
        return map.size();
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public HashMap<K, V> l(@NotNull Map<K, ? extends V> map) {
        tn.p.k(map, "<this>");
        HashMap<K, V> map2 = map instanceof HashMap ? (HashMap) map : null;
        return map2 == null ? new HashMap<>(map) : map2;
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Map<K, V> m(@NotNull HashMap<K, V> map) {
        tn.p.k(map, "<this>");
        return map;
    }
}
