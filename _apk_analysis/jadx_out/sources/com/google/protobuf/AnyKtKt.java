package com.google.protobuf;

import com.google.protobuf.Any;
import com.google.protobuf.AnyKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AnyKt.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AnyKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializeany, reason: not valid java name */
    public static final Any m4290initializeany(@NotNull sn.l<? super AnyKt.Dsl, bn.r> lVar) {
        tn.p.k(lVar, "block");
        AnyKt.Dsl.Companion companion = AnyKt.Dsl.Companion;
        Any.Builder builderNewBuilder = Any.newBuilder();
        tn.p.j(builderNewBuilder, "newBuilder()");
        AnyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final Any copy(@NotNull Any any, @NotNull sn.l<? super AnyKt.Dsl, bn.r> lVar) {
        tn.p.k(any, "<this>");
        tn.p.k(lVar, "block");
        AnyKt.Dsl.Companion companion = AnyKt.Dsl.Companion;
        Any.Builder builder = any.toBuilder();
        tn.p.j(builder, "this.toBuilder()");
        AnyKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
