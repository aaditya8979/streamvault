package kotlin.collections;

import ao.i;
import cn.o0;
import cn.p0;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Maps.kt */
/* JADX INFO: loaded from: classes3.dex */
public class a extends p0 {
    @NotNull
    public static final <K, V> Map<K, V> A(@NotNull Pair<? extends K, ? extends V>[] pairArr) {
        p.k(pairArr, "<this>");
        int length = pairArr.length;
        return length != 0 ? length != 1 ? B(pairArr, new LinkedHashMap(p0.f(pairArr.length))) : p0.g(pairArr[0]) : j();
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M B(@NotNull Pair<? extends K, ? extends V>[] pairArr, @NotNull M m10) {
        p.k(pairArr, "<this>");
        p.k(m10, "destination");
        u(m10, pairArr);
        return m10;
    }

    @NotNull
    public static final <K, V> Map<K, V> C(@NotNull Map<? extends K, ? extends V> map) {
        p.k(map, "<this>");
        return new LinkedHashMap(map);
    }

    @NotNull
    public static final <K, V> Map<K, V> j() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        p.i(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    public static final <K, V> V k(@NotNull Map<K, ? extends V> map, K k10) {
        p.k(map, "<this>");
        return (V) o0.a(map, k10);
    }

    @NotNull
    public static final <K, V> HashMap<K, V> l(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        p.k(pairArr, "pairs");
        HashMap<K, V> map = new HashMap<>(p0.f(pairArr.length));
        u(map, pairArr);
        return map;
    }

    @NotNull
    public static final <K, V> Map<K, V> m(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        p.k(pairArr, "pairs");
        return pairArr.length > 0 ? B(pairArr, new LinkedHashMap(p0.f(pairArr.length))) : j();
    }

    @NotNull
    public static final <K, V> Map<K, V> n(@NotNull Map<? extends K, ? extends V> map, K k10) {
        p.k(map, "<this>");
        Map mapC = C(map);
        mapC.remove(k10);
        return p(mapC);
    }

    @NotNull
    public static final <K, V> Map<K, V> o(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        p.k(pairArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(p0.f(pairArr.length));
        u(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> Map<K, V> p(@NotNull Map<K, ? extends V> map) {
        p.k(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : p0.i(map) : j();
    }

    @NotNull
    public static final <K, V> Map<K, V> q(@NotNull Map<? extends K, ? extends V> map, @NotNull Map<? extends K, ? extends V> map2) {
        p.k(map, "<this>");
        p.k(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> r(@NotNull Map<? extends K, ? extends V> map, @NotNull Pair<? extends K, ? extends V> pair) {
        p.k(map, "<this>");
        p.k(pair, "pair");
        if (map.isEmpty()) {
            return p0.g(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
        return linkedHashMap;
    }

    public static final <K, V> void s(@NotNull Map<? super K, ? super V> map, @NotNull i<? extends Pair<? extends K, ? extends V>> iVar) {
        p.k(map, "<this>");
        p.k(iVar, "pairs");
        for (Pair<? extends K, ? extends V> pair : iVar) {
            map.put(pair.component1(), pair.component2());
        }
    }

    public static final <K, V> void t(@NotNull Map<? super K, ? super V> map, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        p.k(map, "<this>");
        p.k(iterable, "pairs");
        for (Pair<? extends K, ? extends V> pair : iterable) {
            map.put(pair.component1(), pair.component2());
        }
    }

    public static final <K, V> void u(@NotNull Map<? super K, ? super V> map, @NotNull Pair<? extends K, ? extends V>[] pairArr) {
        p.k(map, "<this>");
        p.k(pairArr, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            map.put(pair.component1(), pair.component2());
        }
    }

    @NotNull
    public static final <K, V> Map<K, V> v(@NotNull i<? extends Pair<? extends K, ? extends V>> iVar) {
        p.k(iVar, "<this>");
        return p(w(iVar, new LinkedHashMap()));
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M w(@NotNull i<? extends Pair<? extends K, ? extends V>> iVar, @NotNull M m10) {
        p.k(iVar, "<this>");
        p.k(m10, "destination");
        s(m10, iVar);
        return m10;
    }

    @NotNull
    public static final <K, V> Map<K, V> x(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        p.k(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return p(y(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return j();
        }
        if (size != 1) {
            return y(iterable, new LinkedHashMap(p0.f(collection.size())));
        }
        return p0.g((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M y(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable, @NotNull M m10) {
        p.k(iterable, "<this>");
        p.k(m10, "destination");
        t(m10, iterable);
        return m10;
    }

    @NotNull
    public static final <K, V> Map<K, V> z(@NotNull Map<? extends K, ? extends V> map) {
        p.k(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? C(map) : p0.i(map) : j();
    }
}
