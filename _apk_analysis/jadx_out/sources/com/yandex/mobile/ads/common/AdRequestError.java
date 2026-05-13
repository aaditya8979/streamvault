package com.yandex.mobile.ads.common;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
public final class AdRequestError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f59149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f59150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f59151c;

    public AdRequestError(int i10, @NotNull String str, @Nullable String str2) {
        this.f59149a = i10;
        this.f59150b = str;
        this.f59151c = str2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p.f(AdRequestError.class, obj.getClass())) {
            return false;
        }
        AdRequestError adRequestError = (AdRequestError) obj;
        if (this.f59149a == adRequestError.f59149a && p.f(this.f59151c, adRequestError.f59151c)) {
            return p.f(this.f59150b, adRequestError.f59150b);
        }
        return false;
    }

    public final int getCode() {
        return this.f59149a;
    }

    @NotNull
    public final String getDescription() {
        return this.f59150b;
    }

    public int hashCode() {
        int iHashCode = ((this.f59150b.hashCode() * 31) + this.f59149a) * 31;
        String str = this.f59151c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i10 = this.f59149a;
        String str = this.f59150b;
        String str2 = this.f59151c;
        if (str2 == null) {
            str2 = "";
        }
        return "AdRequestError (code: " + i10 + ", description: " + str + ", adUnitId: " + str2 + ")";
    }
}
