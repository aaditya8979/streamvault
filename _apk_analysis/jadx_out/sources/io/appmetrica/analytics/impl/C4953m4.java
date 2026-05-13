package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4953m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f67256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f67257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f67258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f67259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f67260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f67261f;

    public C4953m4(C4902k4 c4902k4) {
        this.f67256a = c4902k4.f67086a;
        this.f67257b = c4902k4.f67087b;
        this.f67258c = c4902k4.f67088c;
        this.f67259d = c4902k4.f67089d;
        this.f67260e = c4902k4.f67090e;
        this.f67261f = c4902k4.f67091f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4953m4.class != obj.getClass()) {
            return false;
        }
        C4953m4 c4953m4 = (C4953m4) obj;
        if (this.f67256a != c4953m4.f67256a || this.f67257b != c4953m4.f67257b || this.f67258c != c4953m4.f67258c || this.f67259d != c4953m4.f67259d || this.f67260e != c4953m4.f67260e) {
            return false;
        }
        Boolean bool = this.f67261f;
        Boolean bool2 = c4953m4.f67261f;
        return bool != null ? bool.equals(bool2) : bool2 == null;
    }

    public final int hashCode() {
        int i10 = (((((((((this.f67256a ? 1 : 0) * 31) + (this.f67257b ? 1 : 0)) * 31) + (this.f67258c ? 1 : 0)) * 31) + (this.f67259d ? 1 : 0)) * 31) + (this.f67260e ? 1 : 0)) * 31;
        Boolean bool = this.f67261f;
        return i10 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CollectingFlags{permissionsCollectingEnabled=" + this.f67256a + ", featuresCollectingEnabled=" + this.f67257b + ", googleAid=" + this.f67258c + ", simInfo=" + this.f67259d + ", huaweiOaid=" + this.f67260e + ", sslPinning=" + this.f67261f + '}';
    }
}
