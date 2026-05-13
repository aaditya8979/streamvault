package com.fyber.inneractive.sdk.cache.session;

import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends PriorityQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15908a;

    public k(int i10) {
        super(1, new l());
        this.f15908a = i10;
    }

    @Override // java.util.PriorityQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(g gVar) {
        boolean zAdd = super.add(gVar);
        if (super.size() > this.f15908a) {
            poll();
        }
        return zAdd;
    }
}
