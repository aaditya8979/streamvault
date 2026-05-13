package cn;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MapsJVM.kt */
/* JADX INFO: loaded from: classes6.dex */
public class p0 extends o0 {
    @NotNull
    public static final <K, V> Map<K, V> c(@NotNull Map<K, V> map) {
        tn.p.k(map, "builder");
        return ((MapBuilder) map).build();
    }

    @NotNull
    public static final <K, V> Map<K, V> d() {
        return new MapBuilder();
    }

    @NotNull
    public static final <K, V> Map<K, V> e(int i10) {
        return new MapBuilder(i10);
    }

    public static final int f(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @NotNull
    public static final <K, V> Map<K, V> g(@NotNull Pair<? extends K, ? extends V> pair) {
        tn.p.k(pair, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        tn.p.j(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    @NotNull
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> h(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        tn.p.k(pairArr, "pairs");
        TreeMap treeMap = new TreeMap();
        kotlin.collections.a.u(treeMap, pairArr);
        return treeMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> i(@NotNull Map<? extends K, ? extends V> map) {
        tn.p.k(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        tn.p.j(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
