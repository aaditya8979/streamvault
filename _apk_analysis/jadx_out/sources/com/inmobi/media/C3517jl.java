package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;

/* JADX INFO: renamed from: com.inmobi.media.jl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3517jl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Config f27427b;

    public C3517jl(int i10, Config config) {
        tn.p.k(config, "config");
        this.f27426a = i10;
        this.f27427b = config;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3517jl)) {
            return false;
        }
        C3517jl c3517jl = (C3517jl) obj;
        return this.f27426a == c3517jl.f27426a && tn.p.f(this.f27427b, c3517jl.f27427b);
    }

    public final int hashCode() {
        return this.f27427b.hashCode() + (Integer.hashCode(this.f27426a) * 31);
    }

    public final String toString() {
        return "ValidatedConfigResponseModel(configResponseCode=" + this.f27426a + ", config=" + this.f27427b + ")";
    }
}
