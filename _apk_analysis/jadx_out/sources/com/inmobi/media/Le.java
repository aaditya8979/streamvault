package com.inmobi.media;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class Le extends Me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f25879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3666pk f25880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC3788ui f25881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ai f25882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25883f;

    public Le(String str, Map map, C3666pk c3666pk, AbstractC3788ui abstractC3788ui, Ai ai2, int i10) {
        map = (i10 & 2) != 0 ? null : map;
        c3666pk = (i10 & 4) != 0 ? null : c3666pk;
        ai2 = (i10 & 16) != 0 ? null : ai2;
        tn.p.k(str, "url");
        this.f25878a = str;
        this.f25879b = map;
        this.f25880c = c3666pk;
        this.f25881d = abstractC3788ui;
        this.f25882e = ai2;
        this.f25883f = true;
    }

    @Override // com.inmobi.media.Me
    public final Map a() {
        return this.f25879b;
    }

    @Override // com.inmobi.media.Me
    public final Ai b() {
        return this.f25882e;
    }

    @Override // com.inmobi.media.Me
    public final String c() {
        return this.f25878a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Le)) {
            return false;
        }
        Le le2 = (Le) obj;
        return tn.p.f(this.f25878a, le2.f25878a) && tn.p.f(this.f25879b, le2.f25879b) && tn.p.f(this.f25880c, le2.f25880c) && tn.p.f(this.f25881d, le2.f25881d) && tn.p.f(this.f25882e, le2.f25882e) && this.f25883f == le2.f25883f;
    }

    public final int hashCode() {
        int iHashCode = this.f25878a.hashCode() * 31;
        Map map = this.f25879b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        C3666pk c3666pk = this.f25880c;
        int iHashCode3 = (iHashCode2 + (c3666pk == null ? 0 : c3666pk.hashCode())) * 31;
        AbstractC3788ui abstractC3788ui = this.f25881d;
        int iHashCode4 = (iHashCode3 + (abstractC3788ui == null ? 0 : abstractC3788ui.hashCode())) * 31;
        Ai ai2 = this.f25882e;
        return Boolean.hashCode(this.f25883f) + ((iHashCode4 + (ai2 != null ? ai2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PostRequest(url='" + this.f25878a + "', headers=" + this.f25879b + ", body=" + this.f25881d + ", retryPolicy=" + this.f25882e + ", timeouts=" + this.f25880c + ", followRedirects=" + this.f25883f + ")";
    }
}
