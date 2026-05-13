package com.yandex.mobile.ads.common;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class AdapterIdentity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f59159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f59160b;

    public AdapterIdentity(@NotNull String str, @NotNull String str2) {
        this.f59159a = str;
        this.f59160b = str2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdapterIdentity)) {
            return false;
        }
        AdapterIdentity adapterIdentity = (AdapterIdentity) obj;
        return p.f(this.f59159a, adapterIdentity.f59159a) && p.f(this.f59160b, adapterIdentity.f59160b);
    }

    public int hashCode() {
        return this.f59160b.hashCode() + (this.f59159a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AdapterIdentity(adapterNetworkName=" + this.f59159a + ", adapterVersion=" + this.f59160b + ")";
    }
}
