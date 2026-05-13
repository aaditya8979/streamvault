package com.inmobi.media;

import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.uk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3790uk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f28285b;

    public C3790uk(String str, Map map) {
        this.f28284a = str;
        this.f28285b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3790uk)) {
            return false;
        }
        C3790uk c3790uk = (C3790uk) obj;
        return tn.p.f(this.f28284a, c3790uk.f28284a) && tn.p.f(this.f28285b, c3790uk.f28285b);
    }

    public final int hashCode() {
        String str = this.f28284a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map map = this.f28285b;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "TokenMetaData(keywords=" + this.f28284a + ", extras=" + this.f28285b + ")";
    }
}
