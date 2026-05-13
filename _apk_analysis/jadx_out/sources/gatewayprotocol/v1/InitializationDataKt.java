package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: InitializationDataKt.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class InitializationDataKt {

    @NotNull
    public static final InitializationDataKt INSTANCE = new InitializationDataKt();

    /* JADX INFO: compiled from: InitializationDataKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final InitializationDataOuterClass.InitializationData.Builder _builder;

        /* JADX INFO: compiled from: InitializationDataKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationDataOuterClass.InitializationData.Builder builder) {
                p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(InitializationDataOuterClass.InitializationData.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(InitializationDataOuterClass.InitializationData.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationDataOuterClass.InitializationData _build() {
            InitializationDataOuterClass.InitializationData initializationDataBuild = this._builder.build();
            p.j(initializationDataBuild, "_builder.build()");
            return initializationDataBuild;
        }

        public final void clearInitializationRequest() {
            this._builder.clearInitializationRequest();
        }

        public final void clearSharedData() {
            this._builder.clearSharedData();
        }

        @NotNull
        public final InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
            InitializationRequestOuterClass.InitializationRequest initializationRequest = this._builder.getInitializationRequest();
            p.j(initializationRequest, "_builder.getInitializationRequest()");
            return initializationRequest;
        }

        @Nullable
        public final InitializationRequestOuterClass.InitializationRequest getInitializationRequestOrNull(@NotNull Dsl dsl) {
            p.k(dsl, "<this>");
            return InitializationDataKtKt.getInitializationRequestOrNull(dsl._builder);
        }

        @NotNull
        public final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
            UniversalRequestOuterClass.UniversalRequest.SharedData sharedData = this._builder.getSharedData();
            p.j(sharedData, "_builder.getSharedData()");
            return sharedData;
        }

        @Nullable
        public final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedDataOrNull(@NotNull Dsl dsl) {
            p.k(dsl, "<this>");
            return InitializationDataKtKt.getSharedDataOrNull(dsl._builder);
        }

        public final boolean hasInitializationRequest() {
            return this._builder.hasInitializationRequest();
        }

        public final boolean hasSharedData() {
            return this._builder.hasSharedData();
        }

        public final void setInitializationRequest(@NotNull InitializationRequestOuterClass.InitializationRequest initializationRequest) {
            p.k(initializationRequest, "value");
            this._builder.setInitializationRequest(initializationRequest);
        }

        public final void setSharedData(@NotNull UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
            p.k(sharedData, "value");
            this._builder.setSharedData(sharedData);
        }
    }

    private InitializationDataKt() {
    }
}
