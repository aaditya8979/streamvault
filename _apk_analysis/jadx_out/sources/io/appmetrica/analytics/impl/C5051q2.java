package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5051q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xe f67554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f67555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f67556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f67557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f67558e;

    public C5051q2(R4 r42, Xe xe2) {
        this.f67554a = xe2;
        r42.b();
        this.f67555b = TimeUnit.MINUTES.toMillis(1L);
        this.f67556c = TimeUnit.DAYS.toMillis(7L);
        this.f67557d = new SystemTimeProvider();
        Map<String, Long> mapF = xe2.f();
        a(mapF);
        this.f67558e = mapF;
    }

    public final void a(Map map) {
        long jCurrentTimeMillis = this.f67557d.currentTimeMillis();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (((Number) entry.getValue()).longValue() < jCurrentTimeMillis - this.f67556c) {
                linkedHashSet.add(str);
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }
}
