package com.unity3d.ads.core.data.model;

import co.b;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import go.l;
import go.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: AdObject.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AdObject {

    @Nullable
    private final AdPlayer adPlayer;

    @NotNull
    private final DiagnosticEventRequestOuterClass.DiagnosticAdType adType;
    private final boolean isHeaderBidding;
    private boolean isOfferwallAd;
    private boolean isScarAd;

    @NotNull
    private final UnityAdsLoadOptions loadOptions;

    @Nullable
    private String offerwallPlacementName;

    @NotNull
    private final ByteString opportunityId;

    @NotNull
    private final String placementId;

    @Nullable
    private String playerServerId;

    @Nullable
    private String scarAdString;

    @Nullable
    private String scarAdUnitId;

    @Nullable
    private String scarQueryId;

    @NotNull
    private l<AdObjectState> state;

    @NotNull
    private ByteString trackingToken;

    @NotNull
    private l<b> ttl;

    public AdObject(@NotNull ByteString byteString, @NotNull String str, @NotNull ByteString byteString2, boolean z10, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z11, @Nullable String str5, @Nullable AdPlayer adPlayer, @Nullable String str6, @NotNull UnityAdsLoadOptions unityAdsLoadOptions, boolean z12, @NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, @NotNull l<b> lVar, @NotNull l<AdObjectState> lVar2) {
        p.k(byteString, "opportunityId");
        p.k(str, "placementId");
        p.k(byteString2, HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
        p.k(unityAdsLoadOptions, HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        p.k(diagnosticAdType, "adType");
        p.k(lVar, "ttl");
        p.k(lVar2, "state");
        this.opportunityId = byteString;
        this.placementId = str;
        this.trackingToken = byteString2;
        this.isScarAd = z10;
        this.scarQueryId = str2;
        this.scarAdUnitId = str3;
        this.scarAdString = str4;
        this.isOfferwallAd = z11;
        this.offerwallPlacementName = str5;
        this.adPlayer = adPlayer;
        this.playerServerId = str6;
        this.loadOptions = unityAdsLoadOptions;
        this.isHeaderBidding = z12;
        this.adType = diagnosticAdType;
        this.ttl = lVar;
        this.state = lVar2;
    }

    public /* synthetic */ AdObject(ByteString byteString, String str, ByteString byteString2, boolean z10, String str2, String str3, String str4, boolean z11, String str5, AdPlayer adPlayer, String str6, UnityAdsLoadOptions unityAdsLoadOptions, boolean z12, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, l lVar, l lVar2, int i10, i iVar) {
        this(byteString, str, byteString2, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? false : z11, (i10 & 256) != 0 ? null : str5, (i10 & 512) != 0 ? null : adPlayer, (i10 & 1024) != 0 ? null : str6, unityAdsLoadOptions, z12, diagnosticAdType, (i10 & 16384) != 0 ? v.a(null) : lVar, (i10 & 32768) != 0 ? v.a(AdObjectState.INIT) : lVar2);
    }

    @NotNull
    public final ByteString component1() {
        return this.opportunityId;
    }

    @Nullable
    public final AdPlayer component10() {
        return this.adPlayer;
    }

    @Nullable
    public final String component11() {
        return this.playerServerId;
    }

    @NotNull
    public final UnityAdsLoadOptions component12() {
        return this.loadOptions;
    }

    public final boolean component13() {
        return this.isHeaderBidding;
    }

    @NotNull
    public final DiagnosticEventRequestOuterClass.DiagnosticAdType component14() {
        return this.adType;
    }

    @NotNull
    public final l<b> component15() {
        return this.ttl;
    }

    @NotNull
    public final l<AdObjectState> component16() {
        return this.state;
    }

    @NotNull
    public final String component2() {
        return this.placementId;
    }

    @NotNull
    public final ByteString component3() {
        return this.trackingToken;
    }

    public final boolean component4() {
        return this.isScarAd;
    }

    @Nullable
    public final String component5() {
        return this.scarQueryId;
    }

    @Nullable
    public final String component6() {
        return this.scarAdUnitId;
    }

    @Nullable
    public final String component7() {
        return this.scarAdString;
    }

    public final boolean component8() {
        return this.isOfferwallAd;
    }

    @Nullable
    public final String component9() {
        return this.offerwallPlacementName;
    }

    @NotNull
    public final AdObject copy(@NotNull ByteString byteString, @NotNull String str, @NotNull ByteString byteString2, boolean z10, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z11, @Nullable String str5, @Nullable AdPlayer adPlayer, @Nullable String str6, @NotNull UnityAdsLoadOptions unityAdsLoadOptions, boolean z12, @NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, @NotNull l<b> lVar, @NotNull l<AdObjectState> lVar2) {
        p.k(byteString, "opportunityId");
        p.k(str, "placementId");
        p.k(byteString2, HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
        p.k(unityAdsLoadOptions, HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        p.k(diagnosticAdType, "adType");
        p.k(lVar, "ttl");
        p.k(lVar2, "state");
        return new AdObject(byteString, str, byteString2, z10, str2, str3, str4, z11, str5, adPlayer, str6, unityAdsLoadOptions, z12, diagnosticAdType, lVar, lVar2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdObject)) {
            return false;
        }
        AdObject adObject = (AdObject) obj;
        return p.f(this.opportunityId, adObject.opportunityId) && p.f(this.placementId, adObject.placementId) && p.f(this.trackingToken, adObject.trackingToken) && this.isScarAd == adObject.isScarAd && p.f(this.scarQueryId, adObject.scarQueryId) && p.f(this.scarAdUnitId, adObject.scarAdUnitId) && p.f(this.scarAdString, adObject.scarAdString) && this.isOfferwallAd == adObject.isOfferwallAd && p.f(this.offerwallPlacementName, adObject.offerwallPlacementName) && p.f(this.adPlayer, adObject.adPlayer) && p.f(this.playerServerId, adObject.playerServerId) && p.f(this.loadOptions, adObject.loadOptions) && this.isHeaderBidding == adObject.isHeaderBidding && this.adType == adObject.adType && p.f(this.ttl, adObject.ttl) && p.f(this.state, adObject.state);
    }

    @Nullable
    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    @NotNull
    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    @NotNull
    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    @Nullable
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    @NotNull
    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    @Nullable
    public final String getScarAdString() {
        return this.scarAdString;
    }

    @Nullable
    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    @Nullable
    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    @NotNull
    public final l<AdObjectState> getState() {
        return this.state;
    }

    @NotNull
    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    @NotNull
    public final l<b> getTtl() {
        return this.ttl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.opportunityId.hashCode() * 31) + this.placementId.hashCode()) * 31) + this.trackingToken.hashCode()) * 31;
        boolean z10 = this.isScarAd;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        int i10 = (iHashCode + r12) * 31;
        String str = this.scarQueryId;
        int iHashCode2 = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scarAdUnitId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scarAdString;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z11 = this.isOfferwallAd;
        ?? r13 = z11;
        if (z11) {
            r13 = 1;
        }
        int i11 = (iHashCode4 + r13) * 31;
        String str4 = this.offerwallPlacementName;
        int iHashCode5 = (i11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AdPlayer adPlayer = this.adPlayer;
        int iHashCode6 = (iHashCode5 + (adPlayer == null ? 0 : adPlayer.hashCode())) * 31;
        String str5 = this.playerServerId;
        int iHashCode7 = (((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.loadOptions.hashCode()) * 31;
        boolean z12 = this.isHeaderBidding;
        return ((((((iHashCode7 + (z12 ? 1 : z12)) * 31) + this.adType.hashCode()) * 31) + this.ttl.hashCode()) * 31) + this.state.hashCode();
    }

    public final boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public final void setOfferwallAd(boolean z10) {
        this.isOfferwallAd = z10;
    }

    public final void setOfferwallPlacementName(@Nullable String str) {
        this.offerwallPlacementName = str;
    }

    public final void setPlayerServerId(@Nullable String str) {
        this.playerServerId = str;
    }

    public final void setScarAd(boolean z10) {
        this.isScarAd = z10;
    }

    public final void setScarAdString(@Nullable String str) {
        this.scarAdString = str;
    }

    public final void setScarAdUnitId(@Nullable String str) {
        this.scarAdUnitId = str;
    }

    public final void setScarQueryId(@Nullable String str) {
        this.scarQueryId = str;
    }

    public final void setState(@NotNull l<AdObjectState> lVar) {
        p.k(lVar, "<set-?>");
        this.state = lVar;
    }

    public final void setTrackingToken(@NotNull ByteString byteString) {
        p.k(byteString, "<set-?>");
        this.trackingToken = byteString;
    }

    public final void setTtl(@NotNull l<b> lVar) {
        p.k(lVar, "<set-?>");
        this.ttl = lVar;
    }

    @NotNull
    public String toString() {
        return "AdObject(opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", trackingToken=" + this.trackingToken + ", isScarAd=" + this.isScarAd + ", scarQueryId=" + this.scarQueryId + ", scarAdUnitId=" + this.scarAdUnitId + ", scarAdString=" + this.scarAdString + ", isOfferwallAd=" + this.isOfferwallAd + ", offerwallPlacementName=" + this.offerwallPlacementName + ", adPlayer=" + this.adPlayer + ", playerServerId=" + this.playerServerId + ", loadOptions=" + this.loadOptions + ", isHeaderBidding=" + this.isHeaderBidding + ", adType=" + this.adType + ", ttl=" + this.ttl + ", state=" + this.state + ')';
    }
}
