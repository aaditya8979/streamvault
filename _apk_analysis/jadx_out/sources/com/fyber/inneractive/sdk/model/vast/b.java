package com.fyber.inneractive.sdk.model.vast;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements com.fyber.inneractive.sdk.response.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16822b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PriorityQueue f16824d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f16826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PriorityQueue f16827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Comparator f16828h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.endcard.k f16835o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v f16836p;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f16825e = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16829i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16830j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f16831k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f16832l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f16833m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f16834n = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f16823c = new HashMap();

    public b(com.fyber.inneractive.sdk.flow.vast.g gVar, com.fyber.inneractive.sdk.flow.vast.d dVar) {
        this.f16824d = new PriorityQueue(1, gVar);
        this.f16828h = dVar;
        this.f16827g = new PriorityQueue(1, dVar);
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        HashMap map;
        if (xVar == null || (map = this.f16823c) == null) {
            return null;
        }
        return (List) map.get(xVar);
    }

    public final void a(x xVar, String str) {
        List arrayList = (List) this.f16823c.get(xVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f16823c.put(xVar, arrayList);
        }
        arrayList.add(str);
    }
}
