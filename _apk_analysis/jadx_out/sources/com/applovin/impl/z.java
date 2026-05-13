package com.applovin.impl;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f10991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f10992b;

    public z(Map map, List list) {
        this.f10991a = map;
        this.f10992b = list;
    }

    public Map a() {
        return this.f10991a;
    }

    public boolean a(Object obj) {
        return obj instanceof z;
    }

    public List b() {
        return this.f10992b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (!zVar.a(this)) {
            return false;
        }
        Map mapA = a();
        Map mapA2 = zVar.a();
        if (mapA != null ? !mapA.equals(mapA2) : mapA2 != null) {
            return false;
        }
        List listB = b();
        List listB2 = zVar.b();
        return listB != null ? listB.equals(listB2) : listB2 == null;
    }

    public int hashCode() {
        Map mapA = a();
        int iHashCode = mapA == null ? 43 : mapA.hashCode();
        List listB = b();
        return ((iHashCode + 59) * 59) + (listB != null ? listB.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxt(domainEntries=" + a() + ", invalidEntries=" + b() + ")";
    }
}
