package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class Fo extends C2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f25486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f25487b;

    public /* synthetic */ Fo(Map map, ArrayList arrayList, int i10) {
        this((i10 & 1) != 0 ? kotlin.collections.a.j() : map, (i10 & 2) != 0 ? cn.w.m() : arrayList);
    }

    public Fo(Map map, List list) {
        tn.p.k(map, "macros");
        tn.p.k(list, "trackers");
        this.f25486a = map;
        this.f25487b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fo)) {
            return false;
        }
        Fo fo2 = (Fo) obj;
        return tn.p.f(this.f25486a, fo2.f25486a) && tn.p.f(this.f25487b, fo2.f25487b);
    }

    public final int hashCode() {
        return this.f25487b.hashCode() + (this.f25486a.hashCode() * 31);
    }

    public final String toString() {
        return "WithExtras(macros=" + this.f25486a + ", trackers=" + this.f25487b + ")";
    }
}
