package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: LimitedSessionTokenKt.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class LimitedSessionTokenKt {

    @NotNull
    public static final LimitedSessionTokenKt INSTANCE = new LimitedSessionTokenKt();

    /* JADX INFO: compiled from: LimitedSessionTokenKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final UniversalRequestOuterClass.LimitedSessionToken.Builder _builder;

        /* JADX INFO: compiled from: LimitedSessionTokenKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.LimitedSessionToken.Builder builder) {
                p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(UniversalRequestOuterClass.LimitedSessionToken.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(UniversalRequestOuterClass.LimitedSessionToken.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ UniversalRequestOuterClass.LimitedSessionToken _build() {
            UniversalRequestOuterClass.LimitedSessionToken limitedSessionTokenBuild = this._builder.build();
            p.j(limitedSessionTokenBuild, "_builder.build()");
            return limitedSessionTokenBuild;
        }

        public final void clearCustomMediationName() {
            this._builder.clearCustomMediationName();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearGameId() {
            this._builder.clearGameId();
        }

        public final void clearIdfi() {
            this._builder.clearIdfi();
        }

        public final void clearMediationProvider() {
            this._builder.clearMediationProvider();
        }

        public final void clearMediationVersion() {
            this._builder.clearMediationVersion();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearPlatform() {
            this._builder.clearPlatform();
        }

        public final void clearSdkVersion() {
            this._builder.clearSdkVersion();
        }

        public final void clearSdkVersionName() {
            this._builder.clearSdkVersionName();
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        @NotNull
        public final String getCustomMediationName() {
            String customMediationName = this._builder.getCustomMediationName();
            p.j(customMediationName, "_builder.getCustomMediationName()");
            return customMediationName;
        }

        @NotNull
        public final String getDeviceMake() {
            String deviceMake = this._builder.getDeviceMake();
            p.j(deviceMake, "_builder.getDeviceMake()");
            return deviceMake;
        }

        @NotNull
        public final String getDeviceModel() {
            String deviceModel = this._builder.getDeviceModel();
            p.j(deviceModel, "_builder.getDeviceModel()");
            return deviceModel;
        }

        @NotNull
        public final String getGameId() {
            String gameId = this._builder.getGameId();
            p.j(gameId, "_builder.getGameId()");
            return gameId;
        }

        @NotNull
        public final String getIdfi() {
            String idfi = this._builder.getIdfi();
            p.j(idfi, "_builder.getIdfi()");
            return idfi;
        }

        @NotNull
        public final ClientInfoOuterClass.MediationProvider getMediationProvider() {
            ClientInfoOuterClass.MediationProvider mediationProvider = this._builder.getMediationProvider();
            p.j(mediationProvider, "_builder.getMediationProvider()");
            return mediationProvider;
        }

        public final int getMediationProviderValue() {
            return this._builder.getMediationProviderValue();
        }

        @NotNull
        public final String getMediationVersion() {
            String mediationVersion = this._builder.getMediationVersion();
            p.j(mediationVersion, "_builder.getMediationVersion()");
            return mediationVersion;
        }

        @NotNull
        public final String getOsVersion() {
            String osVersion = this._builder.getOsVersion();
            p.j(osVersion, "_builder.getOsVersion()");
            return osVersion;
        }

        @NotNull
        public final ClientInfoOuterClass.Platform getPlatform() {
            ClientInfoOuterClass.Platform platform = this._builder.getPlatform();
            p.j(platform, "_builder.getPlatform()");
            return platform;
        }

        public final int getPlatformValue() {
            return this._builder.getPlatformValue();
        }

        public final int getSdkVersion() {
            return this._builder.getSdkVersion();
        }

        @NotNull
        public final String getSdkVersionName() {
            String sdkVersionName = this._builder.getSdkVersionName();
            p.j(sdkVersionName, "_builder.getSdkVersionName()");
            return sdkVersionName;
        }

        @NotNull
        public final ByteString getSessionId() {
            ByteString sessionId = this._builder.getSessionId();
            p.j(sessionId, "_builder.getSessionId()");
            return sessionId;
        }

        public final boolean hasCustomMediationName() {
            return this._builder.hasCustomMediationName();
        }

        public final boolean hasMediationVersion() {
            return this._builder.hasMediationVersion();
        }

        public final boolean hasSessionId() {
            return this._builder.hasSessionId();
        }

        public final void setCustomMediationName(@NotNull String str) {
            p.k(str, "value");
            this._builder.setCustomMediationName(str);
        }

        public final void setDeviceMake(@NotNull String str) {
            p.k(str, "value");
            this._builder.setDeviceMake(str);
        }

        public final void setDeviceModel(@NotNull String str) {
            p.k(str, "value");
            this._builder.setDeviceModel(str);
        }

        public final void setGameId(@NotNull String str) {
            p.k(str, "value");
            this._builder.setGameId(str);
        }

        public final void setIdfi(@NotNull String str) {
            p.k(str, "value");
            this._builder.setIdfi(str);
        }

        public final void setMediationProvider(@NotNull ClientInfoOuterClass.MediationProvider mediationProvider) {
            p.k(mediationProvider, "value");
            this._builder.setMediationProvider(mediationProvider);
        }

        public final void setMediationProviderValue(int i10) {
            this._builder.setMediationProviderValue(i10);
        }

        public final void setMediationVersion(@NotNull String str) {
            p.k(str, "value");
            this._builder.setMediationVersion(str);
        }

        public final void setOsVersion(@NotNull String str) {
            p.k(str, "value");
            this._builder.setOsVersion(str);
        }

        public final void setPlatform(@NotNull ClientInfoOuterClass.Platform platform) {
            p.k(platform, "value");
            this._builder.setPlatform(platform);
        }

        public final void setPlatformValue(int i10) {
            this._builder.setPlatformValue(i10);
        }

        public final void setSdkVersion(int i10) {
            this._builder.setSdkVersion(i10);
        }

        public final void setSdkVersionName(@NotNull String str) {
            p.k(str, "value");
            this._builder.setSdkVersionName(str);
        }

        public final void setSessionId(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setSessionId(byteString);
        }
    }

    private LimitedSessionTokenKt() {
    }
}
