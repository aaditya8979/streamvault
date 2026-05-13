package gatewayprotocol.v1;

import bn.r;
import gatewayprotocol.v1.MediationInfoKt;
import gatewayprotocol.v1.MediationInfoOuterClass;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: MediationInfoKt.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class MediationInfoKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializemediationInfo, reason: not valid java name */
    public static final MediationInfoOuterClass.MediationInfo m7502initializemediationInfo(@NotNull l<? super MediationInfoKt.Dsl, r> lVar) {
        p.k(lVar, "block");
        MediationInfoKt.Dsl.Companion companion = MediationInfoKt.Dsl.Companion;
        MediationInfoOuterClass.MediationInfo.Builder builderNewBuilder = MediationInfoOuterClass.MediationInfo.newBuilder();
        p.j(builderNewBuilder, "newBuilder()");
        MediationInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final MediationInfoOuterClass.MediationInfo copy(@NotNull MediationInfoOuterClass.MediationInfo mediationInfo, @NotNull l<? super MediationInfoKt.Dsl, r> lVar) {
        p.k(mediationInfo, "<this>");
        p.k(lVar, "block");
        MediationInfoKt.Dsl.Companion companion = MediationInfoKt.Dsl.Companion;
        MediationInfoOuterClass.MediationInfo.Builder builder = mediationInfo.toBuilder();
        p.j(builder, "this.toBuilder()");
        MediationInfoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
