package com.google.protobuf;

import com.google.protobuf.StringValue;
import com.google.protobuf.StringValueKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StringValueKt.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class StringValueKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializestringValue, reason: not valid java name */
    public static final StringValue m4310initializestringValue(@NotNull sn.l<? super StringValueKt.Dsl, bn.r> lVar) {
        tn.p.k(lVar, "block");
        StringValueKt.Dsl.Companion companion = StringValueKt.Dsl.Companion;
        StringValue.Builder builderNewBuilder = StringValue.newBuilder();
        tn.p.j(builderNewBuilder, "newBuilder()");
        StringValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final StringValue copy(@NotNull StringValue stringValue, @NotNull sn.l<? super StringValueKt.Dsl, bn.r> lVar) {
        tn.p.k(stringValue, "<this>");
        tn.p.k(lVar, "block");
        StringValueKt.Dsl.Companion companion = StringValueKt.Dsl.Companion;
        StringValue.Builder builder = stringValue.toBuilder();
        tn.p.j(builder, "this.toBuilder()");
        StringValueKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
