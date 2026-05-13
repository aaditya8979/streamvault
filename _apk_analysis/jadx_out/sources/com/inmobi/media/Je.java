package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class Je extends Me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f25726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3666pk f25727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f25728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ai f25729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25730f;

    public Je(String str, HashMap map, C3666pk c3666pk, Map map2, Ai ai2, boolean z10, int i10) {
        map = (i10 & 2) != 0 ? null : map;
        c3666pk = (i10 & 4) != 0 ? null : c3666pk;
        map2 = (i10 & 8) != 0 ? null : map2;
        ai2 = (i10 & 16) != 0 ? null : ai2;
        z10 = (i10 & 32) != 0 ? true : z10;
        tn.p.k(str, "url");
        this.f25725a = str;
        this.f25726b = map;
        this.f25727c = c3666pk;
        this.f25728d = map2;
        this.f25729e = ai2;
        this.f25730f = z10;
        String strA = Se.a(str, map2);
        tn.p.k(strA, "<set-?>");
        this.f25725a = strA;
    }

    @Override // com.inmobi.media.Me
    public final Map a() {
        return this.f25726b;
    }

    @Override // com.inmobi.media.Me
    public final Ai b() {
        return this.f25729e;
    }

    @Override // com.inmobi.media.Me
    public final String c() {
        return this.f25725a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Je)) {
            return false;
        }
        Je je2 = (Je) obj;
        return tn.p.f(this.f25725a, je2.f25725a) && tn.p.f(this.f25726b, je2.f25726b) && tn.p.f(this.f25727c, je2.f25727c) && tn.p.f(this.f25728d, je2.f25728d) && tn.p.f(this.f25729e, je2.f25729e) && this.f25730f == je2.f25730f;
    }

    public final int hashCode() {
        int iHashCode = this.f25725a.hashCode() * 31;
        Map map = this.f25726b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        C3666pk c3666pk = this.f25727c;
        int iHashCode3 = (iHashCode2 + (c3666pk == null ? 0 : c3666pk.hashCode())) * 31;
        Map map2 = this.f25728d;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Ai ai2 = this.f25729e;
        return Boolean.hashCode(this.f25730f) + ((iHashCode4 + (ai2 != null ? ai2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "GetRequest(url='" + this.f25725a + "', headers=" + this.f25726b + ", queryParams=" + this.f25728d + ", retryPolicy=" + this.f25729e + ", timeouts=" + this.f25727c + ", followRedirects=" + this.f25730f + ")";
    }
}
