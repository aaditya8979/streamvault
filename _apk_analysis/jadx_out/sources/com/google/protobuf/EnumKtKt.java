package com.google.protobuf;

import com.google.protobuf.Enum;
import com.google.protobuf.EnumKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EnumKt.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializeenum, reason: not valid java name */
    public static final Enum m4297initializeenum(@NotNull sn.l<? super EnumKt.Dsl, bn.r> lVar) {
        tn.p.k(lVar, "block");
        EnumKt.Dsl.Companion companion = EnumKt.Dsl.Companion;
        Enum.Builder builderNewBuilder = Enum.newBuilder();
        tn.p.j(builderNewBuilder, "newBuilder()");
        EnumKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final Enum copy(@NotNull Enum r22, @NotNull sn.l<? super EnumKt.Dsl, bn.r> lVar) {
        tn.p.k(r22, "<this>");
        tn.p.k(lVar, "block");
        EnumKt.Dsl.Companion companion = EnumKt.Dsl.Companion;
        Enum.Builder builder = r22.toBuilder();
        tn.p.j(builder, "this.toBuilder()");
        EnumKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final SourceContext getSourceContextOrNull(@NotNull EnumOrBuilder enumOrBuilder) {
        tn.p.k(enumOrBuilder, "<this>");
        if (enumOrBuilder.hasSourceContext()) {
            return enumOrBuilder.getSourceContext();
        }
        return null;
    }
}
