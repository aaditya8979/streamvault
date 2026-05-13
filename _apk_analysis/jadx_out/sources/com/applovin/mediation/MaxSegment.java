package com.applovin.mediation;

import com.applovin.impl.sdk.o;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class MaxSegment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f11097b;

    public MaxSegment(int i10, List<Integer> list) {
        this.f11096a = i10;
        this.f11097b = list;
        a(i10);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            a(it.next().intValue());
        }
    }

    private void a(int i10) {
        if (i10 >= 0) {
            return;
        }
        o.h("MaxSegment", "Please ensure that the segment value entered is a non-negative number in the range of [0, 2147483647]: " + i10);
    }

    public int getKey() {
        return this.f11096a;
    }

    public List<Integer> getValues() {
        return this.f11097b;
    }

    public String toString() {
        return "MaxSegment{key=" + this.f11096a + ", values=" + this.f11097b + '}';
    }
}
