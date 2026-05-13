package com.google.protobuf;

import com.google.protobuf.FloatValue;
import com.google.protobuf.FloatValueKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FloatValueKt.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class FloatValueKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializefloatValue, reason: not valid java name */
    public static final FloatValue m4302initializefloatValue(@NotNull sn.l<? super FloatValueKt.Dsl, bn.r> lVar) {
        tn.p.k(lVar, "block");
        FloatValueKt.Dsl.Companion companion = FloatValueKt.Dsl.Companion;
        FloatValue.Builder builderNewBuilder = FloatValue.newBuilder();
        tn.p.j(builderNewBuilder, "newBuilder()");
        FloatValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final FloatValue copy(@NotNull FloatValue floatValue, @NotNull sn.l<? super FloatValueKt.Dsl, bn.r> lVar) {
        tn.p.k(floatValue, "<this>");
        tn.p.k(lVar, "block");
        FloatValueKt.Dsl.Companion companion = FloatValueKt.Dsl.Companion;
        FloatValue.Builder builder = floatValue.toBuilder();
        tn.p.j(builder, "this.toBuilder()");
        FloatValueKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
