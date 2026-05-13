package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: InitializationRequestKt.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class InitializationRequestKt {

    @NotNull
    public static final InitializationRequestKt INSTANCE = new InitializationRequestKt();

    /* JADX INFO: compiled from: InitializationRequestKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final InitializationRequestOuterClass.InitializationRequest.Builder _builder;

        /* JADX INFO: compiled from: InitializationRequestKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
                p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        /* JADX INFO: compiled from: InitializationRequestKt.kt */
        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        private Dsl(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(InitializationRequestOuterClass.InitializationRequest.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationRequestOuterClass.InitializationRequest _build() {
            InitializationRequestOuterClass.InitializationRequest initializationRequestBuild = this._builder.build();
            p.j(initializationRequestBuild, "_builder.build()");
            return initializationRequestBuild;
        }

        public final void clearAnalyticsUserId() {
            this._builder.clearAnalyticsUserId();
        }

        public final void clearAuid() {
            this._builder.clearAuid();
        }

        public final void clearAuidString() {
            this._builder.clearAuidString();
        }

        public final void clearCache() {
            this._builder.clearCache();
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final void clearDeviceInfo() {
            this._builder.clearDeviceInfo();
        }

        public final void clearExternalUserIdentifier() {
            this._builder.clearExternalUserIdentifier();
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            p.k(dslMap, "<this>");
            this._builder.clearExtras();
        }

        public final void clearIdfi() {
            this._builder.clearIdfi();
        }

        public final void clearIsFirstInit() {
            this._builder.clearIsFirstInit();
        }

        public final void clearLegacyFlowUserConsent() {
            this._builder.clearLegacyFlowUserConsent();
        }

        public final void clearPrivacy() {
            this._builder.clearPrivacy();
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        public final void clearUadsInitBlob() {
            this._builder.clearUadsInitBlob();
        }

        public final void clearUnityBuildGuid() {
            this._builder.clearUnityBuildGuid();
        }

        public final void clearUnityInstallationId() {
            this._builder.clearUnityInstallationId();
        }

        public final void clearUnityMegaSessionId() {
            this._builder.clearUnityMegaSessionId();
        }

        @NotNull
        public final String getAnalyticsUserId() {
            String analyticsUserId = this._builder.getAnalyticsUserId();
            p.j(analyticsUserId, "_builder.getAnalyticsUserId()");
            return analyticsUserId;
        }

        @NotNull
        public final ByteString getAuid() {
            ByteString auid = this._builder.getAuid();
            p.j(auid, "_builder.getAuid()");
            return auid;
        }

        @NotNull
        public final String getAuidString() {
            String auidString = this._builder.getAuidString();
            p.j(auidString, "_builder.getAuidString()");
            return auidString;
        }

        @NotNull
        public final ByteString getCache() {
            ByteString cache = this._builder.getCache();
            p.j(cache, "_builder.getCache()");
            return cache;
        }

        @NotNull
        public final ClientInfoOuterClass.ClientInfo getClientInfo() {
            ClientInfoOuterClass.ClientInfo clientInfo = this._builder.getClientInfo();
            p.j(clientInfo, "_builder.getClientInfo()");
            return clientInfo;
        }

        @NotNull
        public final InitializationRequestOuterClass.InitializationDeviceInfo getDeviceInfo() {
            InitializationRequestOuterClass.InitializationDeviceInfo deviceInfo = this._builder.getDeviceInfo();
            p.j(deviceInfo, "_builder.getDeviceInfo()");
            return deviceInfo;
        }

        @NotNull
        public final String getExternalUserIdentifier() {
            String externalUserIdentifier = this._builder.getExternalUserIdentifier();
            p.j(externalUserIdentifier, "_builder.getExternalUserIdentifier()");
            return externalUserIdentifier;
        }

        public final /* synthetic */ DslMap getExtrasMap() {
            Map<String, String> extrasMap = this._builder.getExtrasMap();
            p.j(extrasMap, "_builder.getExtrasMap()");
            return new DslMap(extrasMap);
        }

        @NotNull
        public final String getIdfi() {
            String idfi = this._builder.getIdfi();
            p.j(idfi, "_builder.getIdfi()");
            return idfi;
        }

        public final boolean getIsFirstInit() {
            return this._builder.getIsFirstInit();
        }

        @NotNull
        public final String getLegacyFlowUserConsent() {
            String legacyFlowUserConsent = this._builder.getLegacyFlowUserConsent();
            p.j(legacyFlowUserConsent, "_builder.getLegacyFlowUserConsent()");
            return legacyFlowUserConsent;
        }

        @NotNull
        public final ByteString getPrivacy() {
            ByteString privacy = this._builder.getPrivacy();
            p.j(privacy, "_builder.getPrivacy()");
            return privacy;
        }

        @NotNull
        public final ByteString getSessionId() {
            ByteString sessionId = this._builder.getSessionId();
            p.j(sessionId, "_builder.getSessionId()");
            return sessionId;
        }

        @NotNull
        public final ByteString getUadsInitBlob() {
            ByteString uadsInitBlob = this._builder.getUadsInitBlob();
            p.j(uadsInitBlob, "_builder.getUadsInitBlob()");
            return uadsInitBlob;
        }

        @NotNull
        public final String getUnityBuildGuid() {
            String unityBuildGuid = this._builder.getUnityBuildGuid();
            p.j(unityBuildGuid, "_builder.getUnityBuildGuid()");
            return unityBuildGuid;
        }

        @NotNull
        public final ByteString getUnityInstallationId() {
            ByteString unityInstallationId = this._builder.getUnityInstallationId();
            p.j(unityInstallationId, "_builder.getUnityInstallationId()");
            return unityInstallationId;
        }

        @NotNull
        public final ByteString getUnityMegaSessionId() {
            ByteString unityMegaSessionId = this._builder.getUnityMegaSessionId();
            p.j(unityMegaSessionId, "_builder.getUnityMegaSessionId()");
            return unityMegaSessionId;
        }

        public final boolean hasAnalyticsUserId() {
            return this._builder.hasAnalyticsUserId();
        }

        public final boolean hasAuid() {
            return this._builder.hasAuid();
        }

        public final boolean hasAuidString() {
            return this._builder.hasAuidString();
        }

        public final boolean hasCache() {
            return this._builder.hasCache();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        public final boolean hasDeviceInfo() {
            return this._builder.hasDeviceInfo();
        }

        public final boolean hasExternalUserIdentifier() {
            return this._builder.hasExternalUserIdentifier();
        }

        public final boolean hasLegacyFlowUserConsent() {
            return this._builder.hasLegacyFlowUserConsent();
        }

        public final boolean hasPrivacy() {
            return this._builder.hasPrivacy();
        }

        public final boolean hasUadsInitBlob() {
            return this._builder.hasUadsInitBlob();
        }

        public final boolean hasUnityBuildGuid() {
            return this._builder.hasUnityBuildGuid();
        }

        public final boolean hasUnityInstallationId() {
            return this._builder.hasUnityInstallationId();
        }

        public final boolean hasUnityMegaSessionId() {
            return this._builder.hasUnityMegaSessionId();
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

        public final void setAnalyticsUserId(@NotNull String str) {
            p.k(str, "value");
            this._builder.setAnalyticsUserId(str);
        }

        public final void setAuid(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setAuid(byteString);
        }

        public final void setAuidString(@NotNull String str) {
            p.k(str, "value");
            this._builder.setAuidString(str);
        }

        public final void setCache(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setCache(byteString);
        }

        public final void setClientInfo(@NotNull ClientInfoOuterClass.ClientInfo clientInfo) {
            p.k(clientInfo, "value");
            this._builder.setClientInfo(clientInfo);
        }

        public final void setDeviceInfo(@NotNull InitializationRequestOuterClass.InitializationDeviceInfo initializationDeviceInfo) {
            p.k(initializationDeviceInfo, "value");
            this._builder.setDeviceInfo(initializationDeviceInfo);
        }

        public final void setExternalUserIdentifier(@NotNull String str) {
            p.k(str, "value");
            this._builder.setExternalUserIdentifier(str);
        }

        public final /* synthetic */ void setExtras(DslMap<String, String, ExtrasProxy> dslMap, String str, String str2) {
            p.k(dslMap, "<this>");
            p.k(str, "key");
            p.k(str2, "value");
            putExtras(dslMap, str, str2);
        }

        public final void setIdfi(@NotNull String str) {
            p.k(str, "value");
            this._builder.setIdfi(str);
        }

        public final void setIsFirstInit(boolean z10) {
            this._builder.setIsFirstInit(z10);
        }

        public final void setLegacyFlowUserConsent(@NotNull String str) {
            p.k(str, "value");
            this._builder.setLegacyFlowUserConsent(str);
        }

        public final void setPrivacy(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setPrivacy(byteString);
        }

        public final void setSessionId(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setSessionId(byteString);
        }

        public final void setUadsInitBlob(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setUadsInitBlob(byteString);
        }

        public final void setUnityBuildGuid(@NotNull String str) {
            p.k(str, "value");
            this._builder.setUnityBuildGuid(str);
        }

        public final void setUnityInstallationId(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setUnityInstallationId(byteString);
        }

        public final void setUnityMegaSessionId(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setUnityMegaSessionId(byteString);
        }
    }

    private InitializationRequestKt() {
    }
}
