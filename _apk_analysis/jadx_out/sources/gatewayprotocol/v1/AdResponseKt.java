package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.WebviewConfiguration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: AdResponseKt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AdResponseKt {

    @NotNull
    public static final AdResponseKt INSTANCE = new AdResponseKt();

    /* JADX INFO: compiled from: AdResponseKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final AdResponseOuterClass.AdResponse.Builder _builder;

        /* JADX INFO: compiled from: AdResponseKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdResponseOuterClass.AdResponse.Builder builder) {
                p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(AdResponseOuterClass.AdResponse.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(AdResponseOuterClass.AdResponse.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ AdResponseOuterClass.AdResponse _build() {
            AdResponseOuterClass.AdResponse adResponseBuild = this._builder.build();
            p.j(adResponseBuild, "_builder.build()");
            return adResponseBuild;
        }

        public final void clearAdData() {
            this._builder.clearAdData();
        }

        public final void clearAdDataRefreshToken() {
            this._builder.clearAdDataRefreshToken();
        }

        public final void clearAdDataVersion() {
            this._builder.clearAdDataVersion();
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearImpressionConfiguration() {
            this._builder.clearImpressionConfiguration();
        }

        public final void clearImpressionConfigurationVersion() {
            this._builder.clearImpressionConfigurationVersion();
        }

        public final void clearTrackingToken() {
            this._builder.clearTrackingToken();
        }

        public final void clearWebviewConfiguration() {
            this._builder.clearWebviewConfiguration();
        }

        @NotNull
        public final ByteString getAdData() {
            ByteString adData = this._builder.getAdData();
            p.j(adData, "_builder.getAdData()");
            return adData;
        }

        @NotNull
        public final ByteString getAdDataRefreshToken() {
            ByteString adDataRefreshToken = this._builder.getAdDataRefreshToken();
            p.j(adDataRefreshToken, "_builder.getAdDataRefreshToken()");
            return adDataRefreshToken;
        }

        public final int getAdDataVersion() {
            return this._builder.getAdDataVersion();
        }

        @NotNull
        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            p.j(error, "_builder.getError()");
            return error;
        }

        @Nullable
        public final ErrorOuterClass.Error getErrorOrNull(@NotNull Dsl dsl) {
            p.k(dsl, "<this>");
            return AdResponseKtKt.getErrorOrNull(dsl._builder);
        }

        @NotNull
        public final ByteString getImpressionConfiguration() {
            ByteString impressionConfiguration = this._builder.getImpressionConfiguration();
            p.j(impressionConfiguration, "_builder.getImpressionConfiguration()");
            return impressionConfiguration;
        }

        public final int getImpressionConfigurationVersion() {
            return this._builder.getImpressionConfigurationVersion();
        }

        @NotNull
        public final ByteString getTrackingToken() {
            ByteString trackingToken = this._builder.getTrackingToken();
            p.j(trackingToken, "_builder.getTrackingToken()");
            return trackingToken;
        }

        @NotNull
        public final WebviewConfiguration.WebViewConfiguration getWebviewConfiguration() {
            WebviewConfiguration.WebViewConfiguration webviewConfiguration = this._builder.getWebviewConfiguration();
            p.j(webviewConfiguration, "_builder.getWebviewConfiguration()");
            return webviewConfiguration;
        }

        @Nullable
        public final WebviewConfiguration.WebViewConfiguration getWebviewConfigurationOrNull(@NotNull Dsl dsl) {
            p.k(dsl, "<this>");
            return AdResponseKtKt.getWebviewConfigurationOrNull(dsl._builder);
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final boolean hasWebviewConfiguration() {
            return this._builder.hasWebviewConfiguration();
        }

        public final void setAdData(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setAdData(byteString);
        }

        public final void setAdDataRefreshToken(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setAdDataRefreshToken(byteString);
        }

        public final void setAdDataVersion(int i10) {
            this._builder.setAdDataVersion(i10);
        }

        public final void setError(@NotNull ErrorOuterClass.Error error) {
            p.k(error, "value");
            this._builder.setError(error);
        }

        public final void setImpressionConfiguration(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setImpressionConfiguration(byteString);
        }

        public final void setImpressionConfigurationVersion(int i10) {
            this._builder.setImpressionConfigurationVersion(i10);
        }

        public final void setTrackingToken(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setTrackingToken(byteString);
        }

        public final void setWebviewConfiguration(@NotNull WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
            p.k(webViewConfiguration, "value");
            this._builder.setWebviewConfiguration(webViewConfiguration);
        }
    }

    private AdResponseKt() {
    }
}
