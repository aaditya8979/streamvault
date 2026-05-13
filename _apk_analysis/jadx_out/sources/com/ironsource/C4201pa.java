package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.pa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4201pa {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C4201pa f33250c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet<ImpressionDataListener> f33251a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, List<String>> f33252b = new ConcurrentHashMap<>();

    public static synchronized C4201pa b() {
        if (f33250c == null) {
            f33250c = new C4201pa();
        }
        return f33250c;
    }

    public HashSet<ImpressionDataListener> a() {
        return this.f33251a;
    }

    public void a(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f33251a.add(impressionDataListener);
        }
    }

    public void a(String str, List<String> list) {
        this.f33252b.put(str, list);
    }

    public void b(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f33251a.remove(impressionDataListener);
        }
    }

    public ConcurrentHashMap<String, List<String>> c() {
        return this.f33252b;
    }

    public void d() {
        synchronized (this) {
            this.f33251a.clear();
        }
    }
}
