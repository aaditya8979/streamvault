package wo;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a1<K, V> extends k1<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SerialDescriptor f86474c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(@NotNull KSerializer<K> kSerializer, @NotNull KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, null);
        tn.p.k(kSerializer, "kSerializer");
        tn.p.k(kSerializer2, "vSerializer");
        this.f86474c = new z0(kSerializer.getDescriptor(), kSerializer2.getDescriptor());
    }

    @Override // wo.k1, kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f86474c;
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap<K, V> b() {
        return new LinkedHashMap<>();
    }

    @Override // wo.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull LinkedHashMap<K, V> linkedHashMap) {
        tn.p.k(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // wo.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void d(@NotNull LinkedHashMap<K, V> linkedHashMap, int i10) {
        tn.p.k(linkedHashMap, "<this>");
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
    public LinkedHashMap<K, V> l(@NotNull Map<K, ? extends V> map) {
        tn.p.k(map, "<this>");
        LinkedHashMap<K, V> linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap<>(map) : linkedHashMap;
    }

    @Override // wo.a
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Map<K, V> m(@NotNull LinkedHashMap<K, V> linkedHashMap) {
        tn.p.k(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
