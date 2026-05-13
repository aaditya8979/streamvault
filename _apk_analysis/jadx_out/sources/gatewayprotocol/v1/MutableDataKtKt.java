package gatewayprotocol.v1;

import bn.r;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.MutableDataKt;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: MutableDataKt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MutableDataKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializemutableData, reason: not valid java name */
    public static final MutableDataOuterClass.MutableData m7503initializemutableData(@NotNull l<? super MutableDataKt.Dsl, r> lVar) {
        p.k(lVar, "block");
        MutableDataKt.Dsl.Companion companion = MutableDataKt.Dsl.Companion;
        MutableDataOuterClass.MutableData.Builder builderNewBuilder = MutableDataOuterClass.MutableData.newBuilder();
        p.j(builderNewBuilder, "newBuilder()");
        MutableDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final MutableDataOuterClass.MutableData copy(@NotNull MutableDataOuterClass.MutableData mutableData, @NotNull l<? super MutableDataKt.Dsl, r> lVar) {
        p.k(mutableData, "<this>");
        p.k(lVar, "block");
        MutableDataKt.Dsl.Companion companion = MutableDataKt.Dsl.Companion;
        MutableDataOuterClass.MutableData.Builder builder = mutableData.toBuilder();
        p.j(builder, "this.toBuilder()");
        MutableDataKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final AllowedPiiOuterClass.AllowedPii getAllowedPiiOrNull(@NotNull MutableDataOuterClass.MutableDataOrBuilder mutableDataOrBuilder) {
        p.k(mutableDataOrBuilder, "<this>");
        if (mutableDataOrBuilder.hasAllowedPii()) {
            return mutableDataOrBuilder.getAllowedPii();
        }
        return null;
    }

    @Nullable
    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(@NotNull MutableDataOuterClass.MutableDataOrBuilder mutableDataOrBuilder) {
        p.k(mutableDataOrBuilder, "<this>");
        if (mutableDataOrBuilder.hasSessionCounters()) {
            return mutableDataOrBuilder.getSessionCounters();
        }
        return null;
    }
}
