package gatewayprotocol.v1;

import bn.r;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.RequestUrlOverrideKt;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: RequestUrlOverrideKt.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class RequestUrlOverrideKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializerequestUrlOverride, reason: not valid java name */
    public static final InitializationResponseOuterClass.RequestUrlOverride m7515initializerequestUrlOverride(@NotNull l<? super RequestUrlOverrideKt.Dsl, r> lVar) {
        p.k(lVar, "block");
        RequestUrlOverrideKt.Dsl.Companion companion = RequestUrlOverrideKt.Dsl.Companion;
        InitializationResponseOuterClass.RequestUrlOverride.Builder builderNewBuilder = InitializationResponseOuterClass.RequestUrlOverride.newBuilder();
        p.j(builderNewBuilder, "newBuilder()");
        RequestUrlOverrideKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final InitializationResponseOuterClass.RequestUrlOverride copy(@NotNull InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride, @NotNull l<? super RequestUrlOverrideKt.Dsl, r> lVar) {
        p.k(requestUrlOverride, "<this>");
        p.k(lVar, "block");
        RequestUrlOverrideKt.Dsl.Companion companion = RequestUrlOverrideKt.Dsl.Companion;
        InitializationResponseOuterClass.RequestUrlOverride.Builder builder = requestUrlOverride.toBuilder();
        p.j(builder, "this.toBuilder()");
        RequestUrlOverrideKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
