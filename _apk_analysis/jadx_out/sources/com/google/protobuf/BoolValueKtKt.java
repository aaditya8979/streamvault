package com.google.protobuf;

import com.google.protobuf.BoolValue;
import com.google.protobuf.BoolValueKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BoolValueKt.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class BoolValueKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializeboolValue, reason: not valid java name */
    public static final BoolValue m4292initializeboolValue(@NotNull sn.l<? super BoolValueKt.Dsl, bn.r> lVar) {
        tn.p.k(lVar, "block");
        BoolValueKt.Dsl.Companion companion = BoolValueKt.Dsl.Companion;
        BoolValue.Builder builderNewBuilder = BoolValue.newBuilder();
        tn.p.j(builderNewBuilder, "newBuilder()");
        BoolValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final BoolValue copy(@NotNull BoolValue boolValue, @NotNull sn.l<? super BoolValueKt.Dsl, bn.r> lVar) {
        tn.p.k(boolValue, "<this>");
        tn.p.k(lVar, "block");
        BoolValueKt.Dsl.Companion companion = BoolValueKt.Dsl.Companion;
        BoolValue.Builder builder = boolValue.toBuilder();
        tn.p.j(builder, "this.toBuilder()");
        BoolValueKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
