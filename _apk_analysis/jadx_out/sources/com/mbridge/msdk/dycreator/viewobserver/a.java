package com.mbridge.msdk.dycreator.viewobserver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: BaseAbstractSubject.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends com.mbridge.msdk.dycreator.observable.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Object> f37280a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConcurrentHashMap<Integer, Object> f37281b = new ConcurrentHashMap<>();

    public synchronized void a() {
        this.f37281b.clear();
    }

    public synchronized void a(Object obj, int i10) {
        if (obj != null) {
            ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f37281b;
            if (concurrentHashMap != null && !concurrentHashMap.containsValue(obj)) {
                this.f37281b.put(Integer.valueOf(i10), obj);
            }
        }
    }
}
