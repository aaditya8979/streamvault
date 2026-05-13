package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: MediationInfoKt.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class MediationInfoKt {

    @NotNull
    public static final MediationInfoKt INSTANCE = new MediationInfoKt();

    /* JADX INFO: compiled from: MediationInfoKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final MediationInfoOuterClass.MediationInfo.Builder _builder;

        /* JADX INFO: compiled from: MediationInfoKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(MediationInfoOuterClass.MediationInfo.Builder builder) {
                p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(MediationInfoOuterClass.MediationInfo.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(MediationInfoOuterClass.MediationInfo.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ MediationInfoOuterClass.MediationInfo _build() {
            MediationInfoOuterClass.MediationInfo mediationInfoBuild = this._builder.build();
            p.j(mediationInfoBuild, "_builder.build()");
            return mediationInfoBuild;
        }

        public final void clearAdapterVersion() {
            this._builder.clearAdapterVersion();
        }

        public final void clearCustomName() {
            this._builder.clearCustomName();
        }

        public final void clearProvider() {
            this._builder.clearProvider();
        }

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        @NotNull
        public final String getAdapterVersion() {
            String adapterVersion = this._builder.getAdapterVersion();
            p.j(adapterVersion, "_builder.getAdapterVersion()");
            return adapterVersion;
        }

        @NotNull
        public final String getCustomName() {
            String customName = this._builder.getCustomName();
            p.j(customName, "_builder.getCustomName()");
            return customName;
        }

        @NotNull
        public final ClientInfoOuterClass.MediationProvider getProvider() {
            ClientInfoOuterClass.MediationProvider provider = this._builder.getProvider();
            p.j(provider, "_builder.getProvider()");
            return provider;
        }

        public final int getProviderValue() {
            return this._builder.getProviderValue();
        }

        @NotNull
        public final String getVersion() {
            String version = this._builder.getVersion();
            p.j(version, "_builder.getVersion()");
            return version;
        }

        public final boolean hasAdapterVersion() {
            return this._builder.hasAdapterVersion();
        }

        public final boolean hasCustomName() {
            return this._builder.hasCustomName();
        }

        public final boolean hasVersion() {
            return this._builder.hasVersion();
        }

        public final void setAdapterVersion(@NotNull String str) {
            p.k(str, "value");
            this._builder.setAdapterVersion(str);
        }

        public final void setCustomName(@NotNull String str) {
            p.k(str, "value");
            this._builder.setCustomName(str);
        }

        public final void setProvider(@NotNull ClientInfoOuterClass.MediationProvider mediationProvider) {
            p.k(mediationProvider, "value");
            this._builder.setProvider(mediationProvider);
        }

        public final void setProviderValue(int i10) {
            this._builder.setProviderValue(i10);
        }

        public final void setVersion(@NotNull String str) {
            p.k(str, "value");
            this._builder.setVersion(str);
        }
    }

    private MediationInfoKt() {
    }
}
