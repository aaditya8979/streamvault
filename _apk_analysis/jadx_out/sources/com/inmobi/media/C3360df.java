package com.inmobi.media;

import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.df, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3360df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f27036a;

    public C3360df(Map map) {
        tn.p.k(map, "requestParams");
        this.f27036a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3360df) && tn.p.f(this.f27036a, ((C3360df) obj).f27036a);
    }

    public final int hashCode() {
        return this.f27036a.hashCode();
    }

    public final String toString() {
        return "NovatiqAdData(requestParams=" + this.f27036a + ")";
    }
}
