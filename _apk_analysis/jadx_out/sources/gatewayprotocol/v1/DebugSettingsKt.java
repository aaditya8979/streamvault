package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: DebugSettingsKt.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DebugSettingsKt {

    @NotNull
    public static final DebugSettingsKt INSTANCE = new DebugSettingsKt();

    /* JADX INFO: compiled from: DebugSettingsKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final NativeConfigurationOuterClass.DebugSettings.Builder _builder;

        /* JADX INFO: compiled from: DebugSettingsKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.DebugSettings.Builder builder) {
                p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(NativeConfigurationOuterClass.DebugSettings.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.DebugSettings.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.DebugSettings _build() {
            NativeConfigurationOuterClass.DebugSettings debugSettingsBuild = this._builder.build();
            p.j(debugSettingsBuild, "_builder.build()");
            return debugSettingsBuild;
        }

        public final void clearCleanCache() {
            this._builder.clearCleanCache();
        }

        public final void clearEnableTracing() {
            this._builder.clearEnableTracing();
        }

        public final void clearWebviewInspectable() {
            this._builder.clearWebviewInspectable();
        }

        public final boolean getCleanCache() {
            return this._builder.getCleanCache();
        }

        public final boolean getEnableTracing() {
            return this._builder.getEnableTracing();
        }

        public final boolean getWebviewInspectable() {
            return this._builder.getWebviewInspectable();
        }

        public final void setCleanCache(boolean z10) {
            this._builder.setCleanCache(z10);
        }

        public final void setEnableTracing(boolean z10) {
            this._builder.setEnableTracing(z10);
        }

        public final void setWebviewInspectable(boolean z10) {
            this._builder.setWebviewInspectable(z10);
        }
    }

    private DebugSettingsKt() {
    }
}
