package gatewayprotocol.v1;

import bn.r;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.PlacementKt;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: PlacementKt.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PlacementKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializeplacement, reason: not valid java name */
    public static final InitializationResponseOuterClass.Placement m7509initializeplacement(@NotNull l<? super PlacementKt.Dsl, r> lVar) {
        p.k(lVar, "block");
        PlacementKt.Dsl.Companion companion = PlacementKt.Dsl.Companion;
        InitializationResponseOuterClass.Placement.Builder builderNewBuilder = InitializationResponseOuterClass.Placement.newBuilder();
        p.j(builderNewBuilder, "newBuilder()");
        PlacementKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final InitializationResponseOuterClass.Placement copy(@NotNull InitializationResponseOuterClass.Placement placement, @NotNull l<? super PlacementKt.Dsl, r> lVar) {
        p.k(placement, "<this>");
        p.k(lVar, "block");
        PlacementKt.Dsl.Companion companion = PlacementKt.Dsl.Companion;
        InitializationResponseOuterClass.Placement.Builder builder = placement.toBuilder();
        p.j(builder, "this.toBuilder()");
        PlacementKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
