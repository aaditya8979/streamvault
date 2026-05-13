package com.fyber.inneractive.sdk.metrics;

import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16810a = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16811b;

    public h(String str) {
        this.f16811b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return this.f16810a.equals(((h) obj).f16810a);
    }

    public final int hashCode() {
        return this.f16810a.hashCode();
    }
}
