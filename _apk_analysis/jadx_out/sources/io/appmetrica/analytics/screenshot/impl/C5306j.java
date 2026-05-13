package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5306j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f68449a;

    public C5306j(C5321z c5321z) {
        this(c5321z.a());
    }

    public C5306j(boolean z10) {
        this.f68449a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!tn.p.f(C5306j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.f68449a == ((C5306j) obj).f68449a;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideApiCaptorConfig");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f68449a);
    }

    public final String toString() {
        return "ClientSideApiCaptorConfig(enabled=" + this.f68449a + ')';
    }
}
