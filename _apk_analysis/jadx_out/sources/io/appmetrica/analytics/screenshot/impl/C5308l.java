package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5308l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f68458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5309m f68459b;

    public C5308l(boolean z10, C5309m c5309m) {
        this.f68458a = z10;
        this.f68459b = c5309m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!tn.p.f(C5308l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideRemoteScreenshotConfig");
        }
        C5308l c5308l = (C5308l) obj;
        return this.f68458a == c5308l.f68458a && tn.p.f(this.f68459b, c5308l.f68459b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f68458a) * 31;
        C5309m c5309m = this.f68459b;
        return iHashCode + (c5309m != null ? c5309m.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideRemoteScreenshotConfig(enabled=" + this.f68458a + ", config=" + this.f68459b + ')';
    }
}
