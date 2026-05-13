package com.inmobi.media;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class Ke extends Me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3666pk f25812b;

    public Ke(String str, C3666pk c3666pk) {
        tn.p.k(str, "url");
        this.f25811a = str;
        this.f25812b = c3666pk;
    }

    @Override // com.inmobi.media.Me
    public final Map a() {
        return null;
    }

    @Override // com.inmobi.media.Me
    public final Ai b() {
        return null;
    }

    @Override // com.inmobi.media.Me
    public final String c() {
        return this.f25811a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ke)) {
            return false;
        }
        Ke ke2 = (Ke) obj;
        return tn.p.f(this.f25811a, ke2.f25811a) && tn.p.f(null, null) && tn.p.f(this.f25812b, ke2.f25812b) && tn.p.f(null, null);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f25812b.hashCode() + (this.f25811a.hashCode() * 961)) * 961);
    }

    public final String toString() {
        return "HeadRequest(url=" + this.f25811a + ", headers=" + ((Object) null) + ", timeouts=" + this.f25812b + ", retryPolicy=" + ((Object) null) + ", followRedirects=true)";
    }
}
