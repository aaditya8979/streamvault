package com.unity3d.ads.core.data.repository;

import bn.r;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.TokenCounters;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import go.d;
import go.p;
import hn.c;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface SessionRepository {
    void addTimeToGlobalAdsFocusTime(int i10);

    @NotNull
    NativeConfigurationOuterClass.FeatureFlags getFeatureFlags();

    @Nullable
    String getGameId();

    @Nullable
    Object getGatewayCache(@NotNull c<? super ByteString> cVar);

    @NotNull
    ByteString getGatewayState();

    @NotNull
    String getGatewayUrl();

    int getHeaderBiddingTokenCounter();

    @NotNull
    InitializationState getInitializationState();

    @NotNull
    NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration();

    @NotNull
    d<InitializationState> getObserveInitializationState();

    @NotNull
    p<SessionChange> getOnChange();

    @Nullable
    Object getPrivacy(@NotNull c<? super ByteString> cVar);

    @Nullable
    Object getPrivacyFsm(@NotNull c<? super ByteString> cVar);

    @NotNull
    List<AdFormatOuterClass.AdFormat> getScarEligibleFormats();

    @NotNull
    SessionCountersOuterClass.SessionCounters getSessionCounters();

    @NotNull
    ByteString getSessionId();

    @NotNull
    ByteString getSessionToken();

    boolean getShouldInitialize();

    @NotNull
    TokenCounters getTokenCounters();

    @Nullable
    String getUnityInstallationId();

    @Nullable
    String getUnityMegaSessionId();

    void incrementBannerImpressionCount();

    void incrementBannerLoadRequestAdmCount();

    void incrementBannerLoadRequestCount();

    void incrementFocusChangeCount();

    void incrementGlobalAdsFocusChangeCount();

    void incrementLoadRequestAdmCount();

    void incrementLoadRequestCount();

    void incrementTokenSequenceNumber();

    void incrementTokenStartsCount();

    void incrementTokenWinsCount();

    boolean isDiagnosticsEnabled();

    boolean isFirstInitAttempt();

    boolean isOmEnabled();

    boolean isSdkInitialized();

    boolean isTestModeEnabled();

    @Nullable
    Object persistNativeConfiguration(@NotNull c<? super r> cVar);

    void resetTokenCounters();

    void setGameId(@Nullable String str);

    @Nullable
    Object setGatewayCache(@NotNull ByteString byteString, @NotNull c<? super r> cVar);

    void setGatewayState(@NotNull ByteString byteString);

    void setGatewayUrl(@NotNull String str);

    void setInitializationState(@NotNull InitializationState initializationState);

    void setNativeConfiguration(@NotNull NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration);

    @Nullable
    Object setPrivacy(@NotNull ByteString byteString, @NotNull c<? super r> cVar);

    @Nullable
    Object setPrivacyFsm(@NotNull ByteString byteString, @NotNull c<? super r> cVar);

    void setSessionCounters(@NotNull SessionCountersOuterClass.SessionCounters sessionCounters);

    void setSessionToken(@NotNull ByteString byteString);

    void setShouldInitialize(boolean z10);

    void setTokenCounters(@NotNull TokenCounters tokenCounters);
}
