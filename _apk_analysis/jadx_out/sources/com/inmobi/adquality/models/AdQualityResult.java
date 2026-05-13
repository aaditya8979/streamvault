package com.inmobi.adquality.models;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class AdQualityResult {

    @NotNull
    private final String beaconUrl;

    @Nullable
    private String extras;

    @NotNull
    private String imageLocation;

    @Nullable
    private String sdkModelResult;

    public AdQualityResult(@NotNull String str, @Nullable String str2, @NotNull String str3, @Nullable String str4) {
        p.k(str, "imageLocation");
        p.k(str3, "beaconUrl");
        this.imageLocation = str;
        this.sdkModelResult = str2;
        this.beaconUrl = str3;
        this.extras = str4;
    }

    public /* synthetic */ AdQualityResult(String str, String str2, String str3, String str4, int i10, i iVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : str4);
    }

    public static /* synthetic */ AdQualityResult copy$default(AdQualityResult adQualityResult, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = adQualityResult.imageLocation;
        }
        if ((i10 & 2) != 0) {
            str2 = adQualityResult.sdkModelResult;
        }
        if ((i10 & 4) != 0) {
            str3 = adQualityResult.beaconUrl;
        }
        if ((i10 & 8) != 0) {
            str4 = adQualityResult.extras;
        }
        return adQualityResult.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.imageLocation;
    }

    @Nullable
    public final String component2() {
        return this.sdkModelResult;
    }

    @NotNull
    public final String component3() {
        return this.beaconUrl;
    }

    @Nullable
    public final String component4() {
        return this.extras;
    }

    @NotNull
    public final AdQualityResult copy(@NotNull String str, @Nullable String str2, @NotNull String str3, @Nullable String str4) {
        p.k(str, "imageLocation");
        p.k(str3, "beaconUrl");
        return new AdQualityResult(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdQualityResult)) {
            return false;
        }
        AdQualityResult adQualityResult = (AdQualityResult) obj;
        return p.f(this.imageLocation, adQualityResult.imageLocation) && p.f(this.sdkModelResult, adQualityResult.sdkModelResult) && p.f(this.beaconUrl, adQualityResult.beaconUrl) && p.f(this.extras, adQualityResult.extras);
    }

    @NotNull
    public final String getBeaconUrl() {
        return this.beaconUrl;
    }

    @Nullable
    public final String getExtras() {
        return this.extras;
    }

    @NotNull
    public final String getImageLocation() {
        return this.imageLocation;
    }

    @Nullable
    public final String getSdkModelResult() {
        return this.sdkModelResult;
    }

    public int hashCode() {
        int iHashCode = this.imageLocation.hashCode() * 31;
        String str = this.sdkModelResult;
        int iHashCode2 = (this.beaconUrl.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.extras;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setExtras(@Nullable String str) {
        this.extras = str;
    }

    public final void setImageLocation(@NotNull String str) {
        p.k(str, "<set-?>");
        this.imageLocation = str;
    }

    public final void setSdkModelResult(@Nullable String str) {
        this.sdkModelResult = str;
    }

    @NotNull
    public String toString() {
        return "AdQualityResult(imageLocation=" + this.imageLocation + ", sdkModelResult=" + this.sdkModelResult + ", beaconUrl=" + this.beaconUrl + ", extras=" + this.extras + ")";
    }
}
