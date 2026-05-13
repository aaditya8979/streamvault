package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 1)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Integer f47268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Integer f47269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Boolean f47270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final com.moloco.sdk.internal.services.a f47271d;

    public u() {
        this(null, null, null, null, 15, null);
    }

    public u(@Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable com.moloco.sdk.internal.services.a aVar) {
        this.f47268a = num;
        this.f47269b = num2;
        this.f47270c = bool;
        this.f47271d = aVar;
    }

    public /* synthetic */ u(Integer num, Integer num2, Boolean bool, com.moloco.sdk.internal.services.a aVar, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : aVar);
    }

    @Nullable
    public final Integer a() {
        return this.f47268a;
    }

    @Nullable
    public final Integer b() {
        return this.f47269b;
    }

    @Nullable
    public final Boolean c() {
        return this.f47270c;
    }

    @Nullable
    public final com.moloco.sdk.internal.services.a d() {
        return this.f47271d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return tn.p.f(this.f47268a, uVar.f47268a) && tn.p.f(this.f47269b, uVar.f47269b) && tn.p.f(this.f47270c, uVar.f47270c) && tn.p.f(this.f47271d, uVar.f47271d);
    }

    public int hashCode() {
        Integer num = this.f47268a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f47269b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f47270c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        com.moloco.sdk.internal.services.a aVar = this.f47271d;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NetworkInfoSignal(mobileCountryCode=" + this.f47268a + ", mobileNetworkCode=" + this.f47269b + ", networkRestricted=" + this.f47270c + ", networkType=" + this.f47271d + ')';
    }
}
