package com.mbridge.msdk.tracker.network;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: NetworkResponse.java */
/* JADX INFO: loaded from: classes8.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f41022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f41023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<g> f41024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f41025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f41026f;

    private q(int i10, byte[] bArr, Map<String, String> map, List<g> list, boolean z10, long j10) {
        this.f41021a = i10;
        this.f41022b = bArr;
        this.f41023c = map;
        if (list == null) {
            this.f41024d = null;
        } else {
            this.f41024d = Collections.unmodifiableList(list);
        }
        this.f41025e = z10;
        this.f41026f = j10;
    }

    public q(int i10, byte[] bArr, boolean z10, long j10, List<g> list) {
        this(i10, bArr, a(list), list, z10, j10);
    }

    private static Map<String, String> a(List<g> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (g gVar : list) {
            treeMap.put(gVar.a(), gVar.b());
        }
        return treeMap;
    }
}
