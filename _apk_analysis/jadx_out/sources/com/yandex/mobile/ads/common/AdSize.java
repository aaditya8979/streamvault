package com.yandex.mobile.ads.common;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
public final class AdSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f59152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f59153b;

    public AdSize(int i10, int i11) {
        this.f59152a = i10;
        this.f59153b = i11;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p.f(AdSize.class, obj.getClass())) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.f59152a == adSize.f59152a && this.f59153b == adSize.f59153b;
    }

    public int hashCode() {
        return (this.f59152a * 31) + this.f59153b;
    }

    @NotNull
    public String toString() {
        return "AdSize (width=" + this.f59152a + ", height=" + this.f59153b + ")";
    }
}
