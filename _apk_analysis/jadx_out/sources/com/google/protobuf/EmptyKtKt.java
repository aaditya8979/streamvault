package com.google.protobuf;

import com.google.protobuf.Empty;
import com.google.protobuf.EmptyKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EmptyKt.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class EmptyKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializeempty, reason: not valid java name */
    public static final Empty m4296initializeempty(@NotNull sn.l<? super EmptyKt.Dsl, bn.r> lVar) {
        tn.p.k(lVar, "block");
        EmptyKt.Dsl.Companion companion = EmptyKt.Dsl.Companion;
        Empty.Builder builderNewBuilder = Empty.newBuilder();
        tn.p.j(builderNewBuilder, "newBuilder()");
        EmptyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final Empty copy(@NotNull Empty empty, @NotNull sn.l<? super EmptyKt.Dsl, bn.r> lVar) {
        tn.p.k(empty, "<this>");
        tn.p.k(lVar, "block");
        EmptyKt.Dsl.Companion companion = EmptyKt.Dsl.Companion;
        Empty.Builder builder = empty.toBuilder();
        tn.p.j(builder, "this.toBuilder()");
        EmptyKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
