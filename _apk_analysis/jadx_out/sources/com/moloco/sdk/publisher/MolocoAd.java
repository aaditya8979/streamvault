package com.moloco.sdk.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
public final class MolocoAd {
    public static final int $stable = 0;

    @NotNull
    private final String adUnitId;

    @Nullable
    private final String creativeId;

    @NotNull
    private final String networkName;

    @Nullable
    private final Float revenue;

    public MolocoAd(@NotNull String str, @NotNull String str2, @Nullable Float f10, @Nullable String str3) {
        p.k(str, "networkName");
        p.k(str2, "adUnitId");
        this.networkName = str;
        this.adUnitId = str2;
        this.revenue = f10;
        this.creativeId = str3;
    }

    public /* synthetic */ MolocoAd(String str, String str2, Float f10, String str3, int i10, tn.i iVar) {
        this(str, str2, (i10 & 4) != 0 ? null : f10, (i10 & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ MolocoAd copy$default(MolocoAd molocoAd, String str, String str2, Float f10, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = molocoAd.networkName;
        }
        if ((i10 & 2) != 0) {
            str2 = molocoAd.adUnitId;
        }
        if ((i10 & 4) != 0) {
            f10 = molocoAd.revenue;
        }
        if ((i10 & 8) != 0) {
            str3 = molocoAd.creativeId;
        }
        return molocoAd.copy(str, str2, f10, str3);
    }

    @NotNull
    public final String component1() {
        return this.networkName;
    }

    @NotNull
    public final String component2() {
        return this.adUnitId;
    }

    @Nullable
    public final Float component3() {
        return this.revenue;
    }

    @Nullable
    public final String component4() {
        return this.creativeId;
    }

    @NotNull
    public final MolocoAd copy(@NotNull String str, @NotNull String str2, @Nullable Float f10, @Nullable String str3) {
        p.k(str, "networkName");
        p.k(str2, "adUnitId");
        return new MolocoAd(str, str2, f10, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MolocoAd)) {
            return false;
        }
        MolocoAd molocoAd = (MolocoAd) obj;
        return p.f(this.networkName, molocoAd.networkName) && p.f(this.adUnitId, molocoAd.adUnitId) && p.f(this.revenue, molocoAd.revenue) && p.f(this.creativeId, molocoAd.creativeId);
    }

    @NotNull
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @Nullable
    public final String getCreativeId() {
        return this.creativeId;
    }

    @NotNull
    public final String getNetworkName() {
        return this.networkName;
    }

    @Nullable
    public final Float getRevenue() {
        return this.revenue;
    }

    public int hashCode() {
        int iHashCode = ((this.networkName.hashCode() * 31) + this.adUnitId.hashCode()) * 31;
        Float f10 = this.revenue;
        int iHashCode2 = (iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str = this.creativeId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MolocoAd(networkName=" + this.networkName + ", adUnitId=" + this.adUnitId + ", revenue=" + this.revenue + ", creativeId=" + this.creativeId + ')';
    }
}
