package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5310n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f68465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68466b;

    public C5310n(H h10) {
        this(h10.b(), h10.a());
    }

    public C5310n(boolean z10, long j10) {
        this.f68465a = z10;
        this.f68466b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!tn.p.f(C5310n.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideServiceCaptorConfig");
        }
        C5310n c5310n = (C5310n) obj;
        return this.f68465a == c5310n.f68465a && this.f68466b == c5310n.f68466b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f68466b) + (Boolean.hashCode(this.f68465a) * 31);
    }

    public final String toString() {
        return "ClientSideServiceCaptorConfig(enabled=" + this.f68465a + ", delaySeconds=" + this.f68466b + ')';
    }
}
