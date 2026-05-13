package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TestDataOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: HeaderBiddingTokenKt.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class HeaderBiddingTokenKt {

    @NotNull
    public static final HeaderBiddingTokenKt INSTANCE = new HeaderBiddingTokenKt();

    /* JADX INFO: compiled from: HeaderBiddingTokenKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder _builder;

        /* JADX INFO: compiled from: HeaderBiddingTokenKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder) {
                p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        /* JADX INFO: compiled from: HeaderBiddingTokenKt.kt */
        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        private Dsl(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ HeaderBiddingTokenOuterClass.HeaderBiddingToken _build() {
            HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingTokenBuild = this._builder.build();
            p.j(headerBiddingTokenBuild, "_builder.build()");
            return headerBiddingTokenBuild;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearBannerSize() {
            this._builder.clearBannerSize();
        }

        public final void clearCampaignState() {
            this._builder.clearCampaignState();
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            p.k(dslMap, "<this>");
            this._builder.clearExtras();
        }

        public final void clearInitializationData() {
            this._builder.clearInitializationData();
        }

        public final void clearLimitedSessionToken() {
            this._builder.clearLimitedSessionToken();
        }

        public final void clearMediationAdUnitId() {
            this._builder.clearMediationAdUnitId();
        }

        public final void clearMediationInfo() {
            this._builder.clearMediationInfo();
        }

        public final void clearOfferwallEnabled() {
            this._builder.clearOfferwallEnabled();
        }

        public final void clearPii() {
            this._builder.clearPii();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearScarSignalsCollected() {
            this._builder.clearScarSignalsCollected();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearSessionToken() {
            this._builder.clearSessionToken();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final void clearTcf() {
            this._builder.clearTcf();
        }

        public final void clearTestData() {
            this._builder.clearTestData();
        }

        public final void clearTimestamps() {
            this._builder.clearTimestamps();
        }

        public final void clearTokenCounters() {
            this._builder.clearTokenCounters();
        }

        public final void clearTokenId() {
            this._builder.clearTokenId();
        }

        public final void clearTokenNumber() {
            this._builder.clearTokenNumber();
        }

        @NotNull
        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            p.j(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        @NotNull
        public final AdRequestOuterClass.BannerSize getBannerSize() {
            AdRequestOuterClass.BannerSize bannerSize = this._builder.getBannerSize();
            p.j(bannerSize, "_builder.getBannerSize()");
            return bannerSize;
        }

        @Nullable
        public final AdRequestOuterClass.BannerSize getBannerSizeOrNull(@NotNull Dsl dsl) {
            p.k(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getBannerSizeOrNull(dsl._builder);
        }

        @NotNull
        public final CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this._builder.getCampaignState();
            p.j(campaignState, "_builder.getCampaignState()");
            return campaignState;
        }

        @NotNull
        public final ClientInfoOuterClass.ClientInfo getClientInfo() {
            ClientInfoOuterClass.ClientInfo clientInfo = this._builder.getClientInfo();
            p.j(clientInfo, "_builder.getClientInfo()");
            return clientInfo;
        }

        @NotNull
        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            p.j(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        public final /* synthetic */ DslMap getExtrasMap() {
            Map<String, String> extrasMap = this._builder.getExtrasMap();
            p.j(extrasMap, "_builder.getExtrasMap()");
            return new DslMap(extrasMap);
        }

        @NotNull
        public final InitializationDataOuterClass.InitializationData getInitializationData() {
            InitializationDataOuterClass.InitializationData initializationData = this._builder.getInitializationData();
            p.j(initializationData, "_builder.getInitializationData()");
            return initializationData;
        }

        @Nullable
        public final InitializationDataOuterClass.InitializationData getInitializationDataOrNull(@NotNull Dsl dsl) {
            p.k(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getInitializationDataOrNull(dsl._builder);
        }

        @NotNull
        public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
            UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken = this._builder.getLimitedSessionToken();
            p.j(limitedSessionToken, "_builder.getLimitedSessionToken()");
            return limitedSessionToken;
        }

        @Nullable
        public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(@NotNull Dsl dsl) {
            p.k(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getLimitedSessionTokenOrNull(dsl._builder);
        }

        @NotNull
        public final String getMediationAdUnitId() {
            String mediationAdUnitId = this._builder.getMediationAdUnitId();
            p.j(mediationAdUnitId, "_builder.getMediationAdUnitId()");
            return mediationAdUnitId;
        }

        @NotNull
        public final MediationInfoOuterClass.MediationInfo getMediationInfo() {
            MediationInfoOuterClass.MediationInfo mediationInfo = this._builder.getMediationInfo();
            p.j(mediationInfo, "_builder.getMediationInfo()");
            return mediationInfo;
        }

        @Nullable
        public final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(@NotNull Dsl dsl) {
            p.k(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getMediationInfoOrNull(dsl._builder);
        }

        public final boolean getOfferwallEnabled() {
            return this._builder.getOfferwallEnabled();
        }

        @NotNull
        public final PiiOuterClass.Pii getPii() {
            PiiOuterClass.Pii pii = this._builder.getPii();
            p.j(pii, "_builder.getPii()");
            return pii;
        }

        @Nullable
        public final PiiOuterClass.Pii getPiiOrNull(@NotNull Dsl dsl) {
            p.k(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getPiiOrNull(dsl._builder);
        }

        @NotNull
        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            p.j(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        public final boolean getScarSignalsCollected() {
            return this._builder.getScarSignalsCollected();
        }

        @NotNull
        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            p.j(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
        }

        @NotNull
        public final ByteString getSessionToken() {
            ByteString sessionToken = this._builder.getSessionToken();
            p.j(sessionToken, "_builder.getSessionToken()");
            return sessionToken;
        }

        @NotNull
        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            p.j(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        @NotNull
        public final ByteString getTcf() {
            ByteString tcf = this._builder.getTcf();
            p.j(tcf, "_builder.getTcf()");
            return tcf;
        }

        @NotNull
        public final TestDataOuterClass.TestData getTestData() {
            TestDataOuterClass.TestData testData = this._builder.getTestData();
            p.j(testData, "_builder.getTestData()");
            return testData;
        }

        @Nullable
        public final TestDataOuterClass.TestData getTestDataOrNull(@NotNull Dsl dsl) {
            p.k(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getTestDataOrNull(dsl._builder);
        }

        @NotNull
        public final TimestampsOuterClass.Timestamps getTimestamps() {
            TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
            p.j(timestamps, "_builder.getTimestamps()");
            return timestamps;
        }

        @NotNull
        public final HeaderBiddingTokenOuterClass.TokenCounters getTokenCounters() {
            HeaderBiddingTokenOuterClass.TokenCounters tokenCounters = this._builder.getTokenCounters();
            p.j(tokenCounters, "_builder.getTokenCounters()");
            return tokenCounters;
        }

        @Nullable
        public final HeaderBiddingTokenOuterClass.TokenCounters getTokenCountersOrNull(@NotNull Dsl dsl) {
            p.k(dsl, "<this>");
            return HeaderBiddingTokenKtKt.getTokenCountersOrNull(dsl._builder);
        }

        @NotNull
        public final ByteString getTokenId() {
            ByteString tokenId = this._builder.getTokenId();
            p.j(tokenId, "_builder.getTokenId()");
            return tokenId;
        }

        public final int getTokenNumber() {
            return this._builder.getTokenNumber();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasBannerSize() {
            return this._builder.hasBannerSize();
        }

        public final boolean hasCampaignState() {
            return this._builder.hasCampaignState();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasInitializationData() {
            return this._builder.hasInitializationData();
        }

        public final boolean hasLimitedSessionToken() {
            return this._builder.hasLimitedSessionToken();
        }

        public final boolean hasMediationAdUnitId() {
            return this._builder.hasMediationAdUnitId();
        }

        public final boolean hasMediationInfo() {
            return this._builder.hasMediationInfo();
        }

        public final boolean hasOfferwallEnabled() {
            return this._builder.hasOfferwallEnabled();
        }

        public final boolean hasPii() {
            return this._builder.hasPii();
        }

        public final boolean hasScarSignalsCollected() {
            return this._builder.hasScarSignalsCollected();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final boolean hasTcf() {
            return this._builder.hasTcf();
        }

        public final boolean hasTestData() {
            return this._builder.hasTestData();
        }

        public final boolean hasTimestamps() {
            return this._builder.hasTimestamps();
        }

        public final boolean hasTokenCounters() {
            return this._builder.hasTokenCounters();
        }

        public final /* synthetic */ void putAllExtras(DslMap dslMap, Map map) {
            p.k(dslMap, "<this>");
            p.k(map, "map");
            this._builder.putAllExtras(map);
        }

        public final void putExtras(@NotNull DslMap<String, String, ExtrasProxy> dslMap, @NotNull String str, @NotNull String str2) {
            p.k(dslMap, "<this>");
            p.k(str, "key");
            p.k(str2, "value");
            this._builder.putExtras(str, str2);
        }

        public final /* synthetic */ void removeExtras(DslMap dslMap, String str) {
            p.k(dslMap, "<this>");
            p.k(str, "key");
            this._builder.removeExtras(str);
        }

        public final void setAdFormat(@NotNull AdFormatOuterClass.AdFormat adFormat) {
            p.k(adFormat, "value");
            this._builder.setAdFormat(adFormat);
        }

        public final void setAdFormatValue(int i10) {
            this._builder.setAdFormatValue(i10);
        }

        public final void setBannerSize(@NotNull AdRequestOuterClass.BannerSize bannerSize) {
            p.k(bannerSize, "value");
            this._builder.setBannerSize(bannerSize);
        }

        public final void setCampaignState(@NotNull CampaignStateOuterClass.CampaignState campaignState) {
            p.k(campaignState, "value");
            this._builder.setCampaignState(campaignState);
        }

        public final void setClientInfo(@NotNull ClientInfoOuterClass.ClientInfo clientInfo) {
            p.k(clientInfo, "value");
            this._builder.setClientInfo(clientInfo);
        }

        public final void setDynamicDeviceInfo(@NotNull DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            p.k(dynamicDeviceInfo, "value");
            this._builder.setDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public final /* synthetic */ void setExtras(DslMap<String, String, ExtrasProxy> dslMap, String str, String str2) {
            p.k(dslMap, "<this>");
            p.k(str, "key");
            p.k(str2, "value");
            putExtras(dslMap, str, str2);
        }

        public final void setInitializationData(@NotNull InitializationDataOuterClass.InitializationData initializationData) {
            p.k(initializationData, "value");
            this._builder.setInitializationData(initializationData);
        }

        public final void setLimitedSessionToken(@NotNull UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
            p.k(limitedSessionToken, "value");
            this._builder.setLimitedSessionToken(limitedSessionToken);
        }

        public final void setMediationAdUnitId(@NotNull String str) {
            p.k(str, "value");
            this._builder.setMediationAdUnitId(str);
        }

        public final void setMediationInfo(@NotNull MediationInfoOuterClass.MediationInfo mediationInfo) {
            p.k(mediationInfo, "value");
            this._builder.setMediationInfo(mediationInfo);
        }

        public final void setOfferwallEnabled(boolean z10) {
            this._builder.setOfferwallEnabled(z10);
        }

        public final void setPii(@NotNull PiiOuterClass.Pii pii) {
            p.k(pii, "value");
            this._builder.setPii(pii);
        }

        public final void setPlacementId(@NotNull String str) {
            p.k(str, "value");
            this._builder.setPlacementId(str);
        }

        public final void setScarSignalsCollected(boolean z10) {
            this._builder.setScarSignalsCollected(z10);
        }

        public final void setSessionCounters(@NotNull SessionCountersOuterClass.SessionCounters sessionCounters) {
            p.k(sessionCounters, "value");
            this._builder.setSessionCounters(sessionCounters);
        }

        public final void setSessionToken(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setSessionToken(byteString);
        }

        public final void setStaticDeviceInfo(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            p.k(staticDeviceInfo, "value");
            this._builder.setStaticDeviceInfo(staticDeviceInfo);
        }

        public final void setTcf(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setTcf(byteString);
        }

        public final void setTestData(@NotNull TestDataOuterClass.TestData testData) {
            p.k(testData, "value");
            this._builder.setTestData(testData);
        }

        public final void setTimestamps(@NotNull TimestampsOuterClass.Timestamps timestamps) {
            p.k(timestamps, "value");
            this._builder.setTimestamps(timestamps);
        }

        public final void setTokenCounters(@NotNull HeaderBiddingTokenOuterClass.TokenCounters tokenCounters) {
            p.k(tokenCounters, "value");
            this._builder.setTokenCounters(tokenCounters);
        }

        public final void setTokenId(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setTokenId(byteString);
        }

        public final void setTokenNumber(int i10) {
            this._builder.setTokenNumber(i10);
        }
    }

    private HeaderBiddingTokenKt() {
    }
}
