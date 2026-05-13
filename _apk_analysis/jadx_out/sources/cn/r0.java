package cn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: _Maps.kt */
/* JADX INFO: loaded from: classes12.dex */
public class r0 extends q0 {
    @NotNull
    public static final <K, V> ao.i<Map.Entry<K, V>> D(@NotNull Map<? extends K, ? extends V> map) {
        tn.p.k(map, "<this>");
        return f0.g0(map.entrySet());
    }

    @NotNull
    public static final <K, V> List<Pair<K, V>> E(@NotNull Map<? extends K, ? extends V> map) {
        tn.p.k(map, "<this>");
        if (map.size() == 0) {
            return w.m();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return w.m();
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return v.e(new Pair(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new Pair(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
