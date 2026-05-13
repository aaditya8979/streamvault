package com.unity3d.ads.core.data.model;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: OMData.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OMData {

    @NotNull
    private final String partnerName;

    @NotNull
    private final String partnerVersion;

    @NotNull
    private final String version;

    public OMData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        p.k(str, "version");
        p.k(str2, HandleInvocationsFromAdViewer.KEY_OM_PARTNER);
        p.k(str3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION);
        this.version = str;
        this.partnerName = str2;
        this.partnerVersion = str3;
    }

    public static /* synthetic */ OMData copy$default(OMData oMData, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = oMData.version;
        }
        if ((i10 & 2) != 0) {
            str2 = oMData.partnerName;
        }
        if ((i10 & 4) != 0) {
            str3 = oMData.partnerVersion;
        }
        return oMData.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.version;
    }

    @NotNull
    public final String component2() {
        return this.partnerName;
    }

    @NotNull
    public final String component3() {
        return this.partnerVersion;
    }

    @NotNull
    public final OMData copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        p.k(str, "version");
        p.k(str2, HandleInvocationsFromAdViewer.KEY_OM_PARTNER);
        p.k(str3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION);
        return new OMData(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OMData)) {
            return false;
        }
        OMData oMData = (OMData) obj;
        return p.f(this.version, oMData.version) && p.f(this.partnerName, oMData.partnerName) && p.f(this.partnerVersion, oMData.partnerVersion);
    }

    @NotNull
    public final String getPartnerName() {
        return this.partnerName;
    }

    @NotNull
    public final String getPartnerVersion() {
        return this.partnerVersion;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((this.version.hashCode() * 31) + this.partnerName.hashCode()) * 31) + this.partnerVersion.hashCode();
    }

    @NotNull
    public String toString() {
        return "OMData(version=" + this.version + ", partnerName=" + this.partnerName + ", partnerVersion=" + this.partnerVersion + ')';
    }
}
