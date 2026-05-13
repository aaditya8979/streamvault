package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;

/* JADX INFO: renamed from: com.inmobi.media.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3575m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Config f27598b;

    public C3575m4(String str, Config config) {
        tn.p.k(str, "url");
        tn.p.k(config, "availableConfig");
        this.f27597a = str;
        this.f27598b = config;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3575m4) && tn.p.f(this.f27598b.getType(), ((C3575m4) obj).f27598b.getType());
    }

    public final int hashCode() {
        return this.f27598b.getType().hashCode();
    }
}
