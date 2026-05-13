package com.bykv.vk.openvk.preload.geckox.statistic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: StatisticDataManager.java */
/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Long, a> f11514a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, com.bykv.vk.openvk.preload.geckox.statistic.model.a> f11515b = new HashMap();

    public static a a(long j10) {
        a aVar;
        Map<Long, a> map = f11514a;
        synchronized (map) {
            aVar = map.get(Long.valueOf(j10));
            if (aVar == null) {
                aVar = new a();
                map.put(Long.valueOf(j10), aVar);
            }
        }
        return aVar;
    }

    public final com.bykv.vk.openvk.preload.geckox.statistic.model.a a(String str) {
        com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar;
        synchronized (this.f11515b) {
            aVar = this.f11515b.get(str);
            if (aVar == null) {
                aVar = new com.bykv.vk.openvk.preload.geckox.statistic.model.a();
                this.f11515b.put(str, aVar);
            }
        }
        return aVar;
    }

    public final List<com.bykv.vk.openvk.preload.geckox.statistic.model.a> a() {
        ArrayList arrayList;
        synchronized (this.f11515b) {
            arrayList = new ArrayList(this.f11515b.values());
        }
        return arrayList;
    }
}
