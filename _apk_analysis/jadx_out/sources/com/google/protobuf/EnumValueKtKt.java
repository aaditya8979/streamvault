package com.google.protobuf;

import com.google.protobuf.EnumValue;
import com.google.protobuf.EnumValueKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EnumValueKt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumValueKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializeenumValue, reason: not valid java name */
    public static final EnumValue m4298initializeenumValue(@NotNull sn.l<? super EnumValueKt.Dsl, bn.r> lVar) {
        tn.p.k(lVar, "block");
        EnumValueKt.Dsl.Companion companion = EnumValueKt.Dsl.Companion;
        EnumValue.Builder builderNewBuilder = EnumValue.newBuilder();
        tn.p.j(builderNewBuilder, "newBuilder()");
        EnumValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final EnumValue copy(@NotNull EnumValue enumValue, @NotNull sn.l<? super EnumValueKt.Dsl, bn.r> lVar) {
        tn.p.k(enumValue, "<this>");
        tn.p.k(lVar, "block");
        EnumValueKt.Dsl.Companion companion = EnumValueKt.Dsl.Companion;
        EnumValue.Builder builder = enumValue.toBuilder();
        tn.p.j(builder, "this.toBuilder()");
        EnumValueKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
