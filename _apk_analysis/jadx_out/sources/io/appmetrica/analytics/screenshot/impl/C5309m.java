package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5309m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5306j f68462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5310n f68463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5307k f68464c;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5309m(F f10) {
        C5321z c5321zA = f10.a();
        C5306j c5306j = c5321zA != null ? new C5306j(c5321zA) : null;
        H hC = f10.c();
        C5310n c5310n = hC != null ? new C5310n(hC) : null;
        B b10 = f10.b();
        this(c5306j, c5310n, b10 != null ? new C5307k(b10) : null);
    }

    public C5309m(C5306j c5306j, C5310n c5310n, C5307k c5307k) {
        this.f68462a = c5306j;
        this.f68463b = c5310n;
        this.f68464c = c5307k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!tn.p.f(C5309m.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideScreenshotConfig");
        }
        C5309m c5309m = (C5309m) obj;
        return tn.p.f(this.f68462a, c5309m.f68462a) && tn.p.f(this.f68463b, c5309m.f68463b) && tn.p.f(this.f68464c, c5309m.f68464c);
    }

    public final int hashCode() {
        C5306j c5306j = this.f68462a;
        int iHashCode = (c5306j != null ? c5306j.hashCode() : 0) * 31;
        C5310n c5310n = this.f68463b;
        int iHashCode2 = (iHashCode + (c5310n != null ? c5310n.hashCode() : 0)) * 31;
        C5307k c5307k = this.f68464c;
        return iHashCode2 + (c5307k != null ? c5307k.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideScreenshotConfig(apiCaptorConfig=" + this.f68462a + ", serviceCaptorConfig=" + this.f68463b + ", contentObserverCaptorConfig=" + this.f68464c + ')';
    }
}
