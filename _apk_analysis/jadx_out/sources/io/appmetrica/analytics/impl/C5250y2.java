package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5250y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC5225x2 f68002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f68003b;

    public C5250y2(EnumC5225x2 enumC5225x2, Boolean bool) {
        this.f68002a = enumC5225x2;
        this.f68003b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5250y2.class != obj.getClass()) {
            return false;
        }
        C5250y2 c5250y2 = (C5250y2) obj;
        if (this.f68002a != c5250y2.f68002a) {
            return false;
        }
        Boolean bool = this.f68003b;
        return bool != null ? bool.equals(c5250y2.f68003b) : c5250y2.f68003b == null;
    }

    public final int hashCode() {
        EnumC5225x2 enumC5225x2 = this.f68002a;
        int iHashCode = (enumC5225x2 != null ? enumC5225x2.hashCode() : 0) * 31;
        Boolean bool = this.f68003b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundRestrictionsState{mAppStandByBucket=" + this.f68002a + ", mBackgroundRestricted=" + this.f68003b + '}';
    }
}
