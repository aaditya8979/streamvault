package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedMap;

/* JADX INFO: compiled from: ForwardingSortedMap.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class t1<K, V> extends q1<K, V> implements SortedMap<K, V> {
    public static int a(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator == null ? ((Comparable) obj).compareTo(obj2) : comparator.compare(obj, obj2);
    }
}
