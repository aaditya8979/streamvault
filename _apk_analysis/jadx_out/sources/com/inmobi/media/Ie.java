package com.inmobi.media;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class Ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f25661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25663d;

    public Ie(long j10, Map map, int i10, String str) {
        tn.p.k(map, "headers");
        this.f25660a = j10;
        this.f25661b = map;
        this.f25662c = i10;
        this.f25663d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ie)) {
            return false;
        }
        Ie ie2 = (Ie) obj;
        return this.f25660a == ie2.f25660a && tn.p.f(this.f25661b, ie2.f25661b) && this.f25662c == ie2.f25662c && tn.p.f(this.f25663d, ie2.f25663d);
    }

    public final int hashCode() {
        int iA = AbstractC3414fi.a(this.f25662c, (this.f25661b.hashCode() + (Long.hashCode(this.f25660a) * 31)) * 31, 31);
        String str = this.f25663d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NetworkMetaData(timeTaken=" + this.f25660a + ", headers=" + this.f25661b + ", contentLength=" + this.f25662c + ", contentType=" + this.f25663d + ")";
    }
}
