package com.google.protobuf;

import com.google.protobuf.BytesValue;
import com.google.protobuf.BytesValueKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BytesValueKt.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class BytesValueKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializebytesValue, reason: not valid java name */
    public static final BytesValue m4293initializebytesValue(@NotNull sn.l<? super BytesValueKt.Dsl, bn.r> lVar) {
        tn.p.k(lVar, "block");
        BytesValueKt.Dsl.Companion companion = BytesValueKt.Dsl.Companion;
        BytesValue.Builder builderNewBuilder = BytesValue.newBuilder();
        tn.p.j(builderNewBuilder, "newBuilder()");
        BytesValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final BytesValue copy(@NotNull BytesValue bytesValue, @NotNull sn.l<? super BytesValueKt.Dsl, bn.r> lVar) {
        tn.p.k(bytesValue, "<this>");
        tn.p.k(lVar, "block");
        BytesValueKt.Dsl.Companion companion = BytesValueKt.Dsl.Companion;
        BytesValue.Builder builder = bytesValue.toBuilder();
        tn.p.j(builder, "this.toBuilder()");
        BytesValueKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
