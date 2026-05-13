package cn;

import java.util.Map;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MapWithDefault.kt */
/* JADX INFO: loaded from: classes6.dex */
public class o0 {
    public static final <K, V> V a(@NotNull Map<K, ? extends V> map, K k10) {
        tn.p.k(map, "<this>");
        if (map instanceof m0) {
            return (V) ((m0) map).e(k10);
        }
        V v10 = map.get(k10);
        if (v10 != null || map.containsKey(k10)) {
            return v10;
        }
        throw new NoSuchElementException("Key " + k10 + " is missing in the map.");
    }

    @NotNull
    public static final <K, V> Map<K, V> b(@NotNull Map<K, ? extends V> map, @NotNull sn.l<? super K, ? extends V> lVar) {
        tn.p.k(map, "<this>");
        tn.p.k(lVar, "defaultValue");
        return map instanceof m0 ? b(((m0) map).i(), lVar) : new n0(map, lVar);
    }
}
