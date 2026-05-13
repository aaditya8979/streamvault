package com.google.protobuf;

import com.google.protobuf.ListValue;
import com.google.protobuf.ListValueKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ListValueKt.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ListValueKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializelistValue, reason: not valid java name */
    public static final ListValue m4305initializelistValue(@NotNull sn.l<? super ListValueKt.Dsl, bn.r> lVar) {
        tn.p.k(lVar, "block");
        ListValueKt.Dsl.Companion companion = ListValueKt.Dsl.Companion;
        ListValue.Builder builderNewBuilder = ListValue.newBuilder();
        tn.p.j(builderNewBuilder, "newBuilder()");
        ListValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final ListValue copy(@NotNull ListValue listValue, @NotNull sn.l<? super ListValueKt.Dsl, bn.r> lVar) {
        tn.p.k(listValue, "<this>");
        tn.p.k(lVar, "block");
        ListValueKt.Dsl.Companion companion = ListValueKt.Dsl.Companion;
        ListValue.Builder builder = listValue.toBuilder();
        tn.p.j(builder, "this.toBuilder()");
        ListValueKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
