package com.applovin.impl;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f9804c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9802a = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f9805d = System.currentTimeMillis();

    public s1(String str, Map map) {
        this.f9803b = str;
        this.f9804c = map;
    }

    public long a() {
        return this.f9805d;
    }

    public String b() {
        return this.f9802a;
    }

    public String c() {
        return this.f9803b;
    }

    public Map d() {
        return this.f9804c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s1 s1Var = (s1) obj;
        if (this.f9805d == s1Var.f9805d && Objects.equals(this.f9803b, s1Var.f9803b) && Objects.equals(this.f9804c, s1Var.f9804c)) {
            return Objects.equals(this.f9802a, s1Var.f9802a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f9803b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f9804c;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j10 = this.f9805d;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str2 = this.f9802a;
        return i10 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Event{name='" + this.f9803b + "', id='" + this.f9802a + "', creationTimestampMillis=" + this.f9805d + ", parameters=" + this.f9804c + '}';
    }
}
