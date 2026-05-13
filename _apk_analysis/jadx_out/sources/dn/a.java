package dn;

import cn.j;
import java.util.Map;
import java.util.Map.Entry;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends j<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    public final boolean contains(@NotNull E e10) {
        p.k(e10, "element");
        return containsEntry(e10);
    }

    public abstract boolean containsEntry(@NotNull Map.Entry<? extends K, ? extends V> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return remove((Map.Entry<?, ?>) obj);
        }
        return false;
    }

    public abstract /* bridge */ boolean remove(Map.Entry<?, ?> entry);
}
