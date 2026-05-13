package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5307k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f68452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f68453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f68454c;

    public C5307k(B b10) {
        this(b10.b(), b10.c(), b10.a());
    }

    public C5307k(boolean z10, List list, long j10) {
        this.f68452a = z10;
        this.f68453b = list;
        this.f68454c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!tn.p.f(C5307k.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideContentObserverCaptorConfig");
        }
        C5307k c5307k = (C5307k) obj;
        return this.f68452a == c5307k.f68452a && tn.p.f(this.f68453b, c5307k.f68453b) && this.f68454c == c5307k.f68454c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f68454c) + ((this.f68453b.hashCode() + (Boolean.hashCode(this.f68452a) * 31)) * 31);
    }

    public final String toString() {
        return "ClientSideContentObserverCaptorConfig(enabled=" + this.f68452a + ", mediaStoreColumnNames=" + this.f68453b + ", detectWindowSeconds=" + this.f68454c + ')';
    }
}
