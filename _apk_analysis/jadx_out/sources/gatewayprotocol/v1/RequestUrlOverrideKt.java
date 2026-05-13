package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: RequestUrlOverrideKt.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class RequestUrlOverrideKt {

    @NotNull
    public static final RequestUrlOverrideKt INSTANCE = new RequestUrlOverrideKt();

    /* JADX INFO: compiled from: RequestUrlOverrideKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final InitializationResponseOuterClass.RequestUrlOverride.Builder _builder;

        /* JADX INFO: compiled from: RequestUrlOverrideKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationResponseOuterClass.RequestUrlOverride.Builder builder) {
                p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(InitializationResponseOuterClass.RequestUrlOverride.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(InitializationResponseOuterClass.RequestUrlOverride.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationResponseOuterClass.RequestUrlOverride _build() {
            InitializationResponseOuterClass.RequestUrlOverride requestUrlOverrideBuild = this._builder.build();
            p.j(requestUrlOverrideBuild, "_builder.build()");
            return requestUrlOverrideBuild;
        }

        public final void clearRequestType() {
            this._builder.clearRequestType();
        }

        public final void clearUrl() {
            this._builder.clearUrl();
        }

        @NotNull
        public final InitializationResponseOuterClass.RequestType getRequestType() {
            InitializationResponseOuterClass.RequestType requestType = this._builder.getRequestType();
            p.j(requestType, "_builder.getRequestType()");
            return requestType;
        }

        public final int getRequestTypeValue() {
            return this._builder.getRequestTypeValue();
        }

        @NotNull
        public final String getUrl() {
            String url = this._builder.getUrl();
            p.j(url, "_builder.getUrl()");
            return url;
        }

        public final void setRequestType(@NotNull InitializationResponseOuterClass.RequestType requestType) {
            p.k(requestType, "value");
            this._builder.setRequestType(requestType);
        }

        public final void setRequestTypeValue(int i10) {
            this._builder.setRequestTypeValue(i10);
        }

        public final void setUrl(@NotNull String str) {
            p.k(str, "value");
            this._builder.setUrl(str);
        }
    }

    private RequestUrlOverrideKt() {
    }
}
