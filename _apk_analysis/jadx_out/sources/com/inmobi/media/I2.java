package com.inmobi.media;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class I2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f25637c;

    public I2(int i10, int i11, String str) {
        str = (i11 & 2) != 0 ? null : str;
        this.f25635a = i10;
        this.f25636b = str;
        this.f25637c = null;
    }

    public I2(int i10, String str, Map map) {
        this.f25635a = i10;
        this.f25636b = str;
        this.f25637c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I2)) {
            return false;
        }
        I2 i22 = (I2) obj;
        return this.f25635a == i22.f25635a && tn.p.f(this.f25636b, i22.f25636b) && tn.p.f(this.f25637c, i22.f25637c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f25635a) * 31;
        String str = this.f25636b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f25637c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "BusEvent(eventId=" + this.f25635a + ", eventMessage=" + this.f25636b + ", eventData=" + this.f25637c + ")";
    }
}
