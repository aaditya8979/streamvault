package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;

/* JADX INFO: renamed from: com.inmobi.media.q4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3675q4 extends AbstractC3650p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Config f27935b;

    public C3675q4(int i10, Config config) {
        tn.p.k(config, "config");
        this.f27934a = i10;
        this.f27935b = config;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3675q4)) {
            return false;
        }
        C3675q4 c3675q4 = (C3675q4) obj;
        return this.f27934a == c3675q4.f27934a && tn.p.f(this.f27935b, c3675q4.f27935b);
    }

    public final int hashCode() {
        return this.f27935b.hashCode() + (Integer.hashCode(this.f27934a) * 31);
    }

    public final String toString() {
        return "ConfigSuccess(statusCode=" + this.f27934a + ", config=" + this.f27935b + ")";
    }
}
