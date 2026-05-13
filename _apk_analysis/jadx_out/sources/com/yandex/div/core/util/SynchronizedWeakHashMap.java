package com.yandex.div.core.util;

import androidx.annotation.RequiresApi;
import bn.h;
import bn.r;
import cn.p0;
import cn.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zn.n;

/* JADX INFO: compiled from: SynchronizedWeakHashMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SynchronizedWeakHashMap<K, N> extends WeakHashMap<K, N> {

    @NotNull
    private final Object lock = new Object();

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        synchronized (this.lock) {
            super.clear();
            r rVar = r.f5635a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Map<K, N> createMap() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            Set<Map.Entry<K, N>> setEntrySet = entrySet();
            linkedHashMap = new LinkedHashMap(n.e(p0.f(x.x(setEntrySet, 10)), 16));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Pair pairA = h.a(entry.getKey(), entry.getValue());
                linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
            }
        }
        return linkedHashMap;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, N>> entrySet() {
        return getEntries();
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public N get(@Nullable Object obj) {
        N n10;
        synchronized (this.lock) {
            n10 = (N) super.get(obj);
        }
        return n10;
    }

    @NotNull
    public Set<Map.Entry<K, N>> getEntries() {
        Set<Map.Entry<K, N>> setEntrySet;
        synchronized (this.lock) {
            setEntrySet = super.entrySet();
        }
        return setEntrySet;
    }

    @NotNull
    public Set<K> getKeys() {
        Set<K> setKeySet;
        synchronized (this.lock) {
            setKeySet = super.keySet();
        }
        return setKeySet;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @NotNull
    public Collection<N> getValues() {
        Collection<N> collectionValues;
        synchronized (this.lock) {
            collectionValues = super.values();
        }
        return collectionValues;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public N put(@NotNull K k10, @NotNull N n10) {
        N n11;
        synchronized (this.lock) {
            n11 = (N) super.put(k10, n10);
        }
        return n11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends N> map) {
        synchronized (this.lock) {
            super.putAll(map);
            r rVar = r.f5635a;
        }
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public N remove(@Nullable Object obj) {
        N n10;
        synchronized (this.lock) {
            n10 = (N) super.remove(obj);
        }
        return n10;
    }

    @Override // java.util.Map
    @RequiresApi(24)
    public boolean remove(@Nullable Object obj, @Nullable Object obj2) {
        boolean zRemove;
        if (obj == null || obj2 == null) {
            return false;
        }
        synchronized (this.lock) {
            zRemove = super.remove(obj, obj2);
        }
        return zRemove;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<N> values() {
        return getValues();
    }
}
