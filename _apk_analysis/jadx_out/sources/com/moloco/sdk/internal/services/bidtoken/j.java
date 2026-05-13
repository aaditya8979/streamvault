package com.moloco.sdk.internal.services.bidtoken;

import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.Q6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f47171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f47172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f47173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f47174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f47175e;

    public j(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        tn.p.k(str, "language");
        tn.p.k(str2, "osVersion");
        tn.p.k(str3, Q6.f30265t);
        tn.p.k(str4, "model");
        tn.p.k(str5, "hardwareVersion");
        this.f47171a = str;
        this.f47172b = str2;
        this.f47173c = str3;
        this.f47174d = str4;
        this.f47175e = str5;
    }

    @NotNull
    public final String a() {
        return this.f47172b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return tn.p.f(this.f47171a, jVar.f47171a) && tn.p.f(this.f47172b, jVar.f47172b) && tn.p.f(this.f47173c, jVar.f47173c) && tn.p.f(this.f47174d, jVar.f47174d) && tn.p.f(this.f47175e, jVar.f47175e);
    }

    public int hashCode() {
        return (((((((this.f47171a.hashCode() * 31) + this.f47172b.hashCode()) * 31) + this.f47173c.hashCode()) * 31) + this.f47174d.hashCode()) * 31) + this.f47175e.hashCode();
    }

    @NotNull
    public String toString() {
        return "BidTokenDeviceRequestInfo(language=" + this.f47171a + ", osVersion=" + this.f47172b + ", make=" + this.f47173c + ", model=" + this.f47174d + ", hardwareVersion=" + this.f47175e + ')';
    }
}
