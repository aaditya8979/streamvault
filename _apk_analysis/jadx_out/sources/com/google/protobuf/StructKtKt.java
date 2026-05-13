package com.google.protobuf;

import com.google.protobuf.Struct;
import com.google.protobuf.StructKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StructKt.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class StructKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializestruct, reason: not valid java name */
    public static final Struct m4311initializestruct(@NotNull sn.l<? super StructKt.Dsl, bn.r> lVar) {
        tn.p.k(lVar, "block");
        StructKt.Dsl.Companion companion = StructKt.Dsl.Companion;
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        tn.p.j(builderNewBuilder, "newBuilder()");
        StructKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final Struct copy(@NotNull Struct struct, @NotNull sn.l<? super StructKt.Dsl, bn.r> lVar) {
        tn.p.k(struct, "<this>");
        tn.p.k(lVar, "block");
        StructKt.Dsl.Companion companion = StructKt.Dsl.Companion;
        Struct.Builder builder = struct.toBuilder();
        tn.p.j(builder, "this.toBuilder()");
        StructKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
