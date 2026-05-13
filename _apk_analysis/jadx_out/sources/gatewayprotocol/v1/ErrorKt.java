package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.ErrorOuterClass;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: ErrorKt.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ErrorKt {

    @NotNull
    public static final ErrorKt INSTANCE = new ErrorKt();

    /* JADX INFO: compiled from: ErrorKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final ErrorOuterClass.Error.Builder _builder;

        /* JADX INFO: compiled from: ErrorKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(ErrorOuterClass.Error.Builder builder) {
                p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(ErrorOuterClass.Error.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(ErrorOuterClass.Error.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ ErrorOuterClass.Error _build() {
            ErrorOuterClass.Error errorBuild = this._builder.build();
            p.j(errorBuild, "_builder.build()");
            return errorBuild;
        }

        public final void clearErrorCode() {
            this._builder.clearErrorCode();
        }

        public final void clearErrorText() {
            this._builder.clearErrorText();
        }

        public final void clearErrorToken() {
            this._builder.clearErrorToken();
        }

        @NotNull
        public final ErrorOuterClass.PublicErrorCode getErrorCode() {
            ErrorOuterClass.PublicErrorCode errorCode = this._builder.getErrorCode();
            p.j(errorCode, "_builder.getErrorCode()");
            return errorCode;
        }

        public final int getErrorCodeValue() {
            return this._builder.getErrorCodeValue();
        }

        @NotNull
        public final String getErrorText() {
            String errorText = this._builder.getErrorText();
            p.j(errorText, "_builder.getErrorText()");
            return errorText;
        }

        @NotNull
        public final ByteString getErrorToken() {
            ByteString errorToken = this._builder.getErrorToken();
            p.j(errorToken, "_builder.getErrorToken()");
            return errorToken;
        }

        public final void setErrorCode(@NotNull ErrorOuterClass.PublicErrorCode publicErrorCode) {
            p.k(publicErrorCode, "value");
            this._builder.setErrorCode(publicErrorCode);
        }

        public final void setErrorCodeValue(int i10) {
            this._builder.setErrorCodeValue(i10);
        }

        public final void setErrorText(@NotNull String str) {
            p.k(str, "value");
            this._builder.setErrorText(str);
        }

        public final void setErrorToken(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setErrorToken(byteString);
        }
    }

    private ErrorKt() {
    }
}
