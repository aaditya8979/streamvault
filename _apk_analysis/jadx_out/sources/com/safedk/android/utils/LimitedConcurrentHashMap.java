package com.safedk.android.utils;

import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class LimitedConcurrentHashMap<K, V> extends ConcurrentHashMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f53050a = 15;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f53051b = "LimitedConcurrentHashMap";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayDeque<K> f53053d;

    public LimitedConcurrentHashMap() {
        this(15);
    }

    public LimitedConcurrentHashMap(int i10) {
        this.f53052c = -1;
        this.f53053d = new ArrayDeque<>();
        if (i10 > 0) {
            this.f53052c = i10;
        }
    }

    @Override // java.util.AbstractMap
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LimitedConcurrentHashMap<K, V> clone() {
        LimitedConcurrentHashMap<K, V> limitedConcurrentHashMap = new LimitedConcurrentHashMap<>(this.f53052c);
        limitedConcurrentHashMap.putAll(this);
        return limitedConcurrentHashMap;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized V put(K k10, V v10) {
        if (containsKey(k10)) {
            this.f53053d.remove(k10);
            this.f53053d.addLast(k10);
            super.put(k10, v10);
        } else {
            if (this.f53052c > 0 && this.f53053d.size() > 0 && size() == this.f53052c) {
                super.remove(this.f53053d.removeFirst());
            }
            this.f53053d.addLast(k10);
            super.put(k10, v10);
        }
        return v10;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized V remove(Object obj) {
        this.f53053d.remove(obj);
        return (V) super.remove(obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public synchronized boolean remove(Object obj, Object obj2) {
        this.f53053d.remove(obj);
        return super.remove(obj, obj2);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap
    public String toString() {
        return "LimitedConcurrentHashMap size=" + size() + " map is: " + super.toString();
    }
}
