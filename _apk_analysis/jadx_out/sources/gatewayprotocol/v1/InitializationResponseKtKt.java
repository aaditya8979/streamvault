package gatewayprotocol.v1;

import bn.r;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseKt;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: InitializationResponseKt.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class InitializationResponseKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializeinitializationResponse, reason: not valid java name */
    public static final InitializationResponseOuterClass.InitializationResponse m7500initializeinitializationResponse(@NotNull l<? super InitializationResponseKt.Dsl, r> lVar) {
        p.k(lVar, "block");
        InitializationResponseKt.Dsl.Companion companion = InitializationResponseKt.Dsl.Companion;
        InitializationResponseOuterClass.InitializationResponse.Builder builderNewBuilder = InitializationResponseOuterClass.InitializationResponse.newBuilder();
        p.j(builderNewBuilder, "newBuilder()");
        InitializationResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final InitializationResponseOuterClass.InitializationResponse copy(@NotNull InitializationResponseOuterClass.InitializationResponse initializationResponse, @NotNull l<? super InitializationResponseKt.Dsl, r> lVar) {
        p.k(initializationResponse, "<this>");
        p.k(lVar, "block");
        InitializationResponseKt.Dsl.Companion companion = InitializationResponseKt.Dsl.Companion;
        InitializationResponseOuterClass.InitializationResponse.Builder builder = initializationResponse.toBuilder();
        p.j(builder, "this.toBuilder()");
        InitializationResponseKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final ErrorOuterClass.Error getErrorOrNull(@NotNull InitializationResponseOuterClass.InitializationResponseOrBuilder initializationResponseOrBuilder) {
        p.k(initializationResponseOrBuilder, "<this>");
        if (initializationResponseOrBuilder.hasError()) {
            return initializationResponseOrBuilder.getError();
        }
        return null;
    }

    @Nullable
    public static final NativeConfigurationOuterClass.NativeConfiguration getNativeConfigurationOrNull(@NotNull InitializationResponseOuterClass.InitializationResponseOrBuilder initializationResponseOrBuilder) {
        p.k(initializationResponseOrBuilder, "<this>");
        if (initializationResponseOrBuilder.hasNativeConfiguration()) {
            return initializationResponseOrBuilder.getNativeConfiguration();
        }
        return null;
    }
}
