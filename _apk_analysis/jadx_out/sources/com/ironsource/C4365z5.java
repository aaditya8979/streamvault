package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.unified.UnifiedMediationParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.z5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4365z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4365z5 f34494a = new C4365z5();

    private C4365z5() {
    }

    private final IronSourceError a(EnumC4000e8 enumC4000e8, IronSourceError ironSourceError) {
        String strC;
        if (ironSourceError != null) {
            strC = enumC4000e8.c() + " Underlying network error: '" + ironSourceError.getErrorCode() + StringUtils.PROCESS_POSTFIX_DELIMITER + ironSourceError.getErrorMessage() + "'";
        } else {
            strC = enumC4000e8.c();
        }
        return new IronSourceError(enumC4000e8.b(), strC);
    }

    private final IronSourceError a(EnumC4000e8 enumC4000e8, String str) {
        if (str == null || str.length() == 0) {
            str = enumC4000e8.c();
        }
        return new IronSourceError(enumC4000e8.b(), str);
    }

    public static /* synthetic */ IronSourceError a(C4365z5 c4365z5, EnumC4000e8 enumC4000e8, IronSourceError ironSourceError, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            ironSourceError = null;
        }
        return c4365z5.a(enumC4000e8, ironSourceError);
    }

    public static /* synthetic */ IronSourceError a(C4365z5 c4365z5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return c4365z5.a(str);
    }

    public static /* synthetic */ IronSourceError b(C4365z5 c4365z5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return c4365z5.b(str);
    }

    public static /* synthetic */ IronSourceError c(C4365z5 c4365z5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return c4365z5.d(str);
    }

    @NotNull
    public final IronSourceError a() {
        return a(this, EnumC4000e8.ISErrorInitDecryptionFailure, null, 2, null);
    }

    @NotNull
    public final IronSourceError a(@NotNull IronSourceError ironSourceError) {
        tn.p.k(ironSourceError, "networkError");
        return a(EnumC4000e8.ISErrorInitNetworkFailed, ironSourceError);
    }

    @NotNull
    public final IronSourceError a(@Nullable String str) {
        return a(EnumC4000e8.ISErrorBannerLoadNoConfig, str);
    }

    @NotNull
    public final IronSourceError b() {
        return a(this, EnumC4000e8.ISErrorInitHttpRequestFailed, null, 2, null);
    }

    @NotNull
    public final IronSourceError b(@NotNull IronSourceError ironSourceError) {
        tn.p.k(ironSourceError, "error");
        return a(EnumC4000e8.ISErrorLoadNetworkFailed, ironSourceError);
    }

    @NotNull
    public final IronSourceError b(@Nullable String str) {
        return a(EnumC4000e8.ISErrorInterstitialLoadNoConfig, str);
    }

    @NotNull
    public final IronSourceError c() {
        return a(this, EnumC4000e8.ISErrorInitInvalidResponse, null, 2, null);
    }

    @NotNull
    public final IronSourceError c(@NotNull IronSourceError ironSourceError) {
        tn.p.k(ironSourceError, "networkError");
        return a(EnumC4000e8.ISErrorShowNetworkFailed, ironSourceError);
    }

    @NotNull
    public final IronSourceError c(@NotNull String str) {
        tn.p.k(str, UnifiedMediationParams.KEY_DESCRIPTION);
        return a(EnumC4000e8.ISErrorLoadNetworkFailed, str);
    }

    @NotNull
    public final IronSourceError d() {
        return a(this, EnumC4000e8.ISErrorLoadADMDecryptionFailure, null, 2, null);
    }

    @NotNull
    public final IronSourceError d(@Nullable String str) {
        return a(EnumC4000e8.ISErrorRewardedLoadNoConfig, str);
    }

    @NotNull
    public final IronSourceError e() {
        return a(this, EnumC4000e8.ISErrorLoadADMEmptyServerData, null, 2, null);
    }

    @NotNull
    public final IronSourceError f() {
        return a(this, EnumC4000e8.ISErrorLoadADMEmptyWaterfall, null, 2, null);
    }

    @NotNull
    public final IronSourceError g() {
        return a(this, EnumC4000e8.ISErrorLoadADMInvalidConfigurationForRequestedNetwork, null, 2, null);
    }

    @NotNull
    public final IronSourceError h() {
        return a(this, EnumC4000e8.ISErrorLoadADMInvalidJSON, null, 2, null);
    }

    @NotNull
    public final IronSourceError i() {
        return a(this, EnumC4000e8.ISErrorLoadADMNoAuctionID, null, 2, null);
    }

    @NotNull
    public final IronSourceError j() {
        return a(this, EnumC4000e8.ISErrorLoadADMNoConfigurationForRequestedNetwork, null, 2, null);
    }

    @NotNull
    public final IronSourceError k() {
        return a(this, EnumC4000e8.ISErrorLoadBannerNetworkViewIsNull, null, 2, null);
    }

    @NotNull
    public final IronSourceError l() {
        return a(this, EnumC4000e8.ISErrorLoadBannerNotSupportedSize, null, 2, null);
    }

    @NotNull
    public final IronSourceError m() {
        return a(this, EnumC4000e8.ISErrorLoadBannerSizeIsNull, null, 2, null);
    }

    @NotNull
    public final IronSourceError n() {
        return a(this, EnumC4000e8.ISErrorLoadBiddingInNonBidding, null, 2, null);
    }

    @NotNull
    public final IronSourceError o() {
        return a(this, EnumC4000e8.ISErrorLoadInstanceNotInInitResponse, null, 2, null);
    }

    @NotNull
    public final IronSourceError p() {
        return a(this, EnumC4000e8.ISErrorLoadNoAdFormatConfigurations, null, 2, null);
    }

    @NotNull
    public final IronSourceError q() {
        return a(this, EnumC4000e8.ISErrorLoadNullADM, null, 2, null);
    }

    @NotNull
    public final IronSourceError r() {
        return a(this, EnumC4000e8.ISErrorLoadSDKNotInitialized, null, 2, null);
    }

    @NotNull
    public final IronSourceError s() {
        return a(this, EnumC4000e8.ISErrorLoadTimedOut, null, 2, null);
    }

    @NotNull
    public final IronSourceError t() {
        return a(this, EnumC4000e8.ISErrorShowNotReadyToShowAd, null, 2, null);
    }
}
