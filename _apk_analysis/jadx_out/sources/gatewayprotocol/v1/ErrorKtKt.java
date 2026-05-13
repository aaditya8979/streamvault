package gatewayprotocol.v1;

import bn.r;
import gatewayprotocol.v1.ErrorKt;
import gatewayprotocol.v1.ErrorOuterClass;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: ErrorKt.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ErrorKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializeerror, reason: not valid java name */
    public static final ErrorOuterClass.Error m7491initializeerror(@NotNull l<? super ErrorKt.Dsl, r> lVar) {
        p.k(lVar, "block");
        ErrorKt.Dsl.Companion companion = ErrorKt.Dsl.Companion;
        ErrorOuterClass.Error.Builder builderNewBuilder = ErrorOuterClass.Error.newBuilder();
        p.j(builderNewBuilder, "newBuilder()");
        ErrorKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final ErrorOuterClass.Error copy(@NotNull ErrorOuterClass.Error error, @NotNull l<? super ErrorKt.Dsl, r> lVar) {
        p.k(error, "<this>");
        p.k(lVar, "block");
        ErrorKt.Dsl.Companion companion = ErrorKt.Dsl.Companion;
        ErrorOuterClass.Error.Builder builder = error.toBuilder();
        p.j(builder, "this.toBuilder()");
        ErrorKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
