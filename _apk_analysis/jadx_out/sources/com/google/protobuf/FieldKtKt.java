package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.FieldKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FieldKt.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class FieldKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializefield, reason: not valid java name */
    public static final Field m4299initializefield(@NotNull sn.l<? super FieldKt.Dsl, bn.r> lVar) {
        tn.p.k(lVar, "block");
        FieldKt.Dsl.Companion companion = FieldKt.Dsl.Companion;
        Field.Builder builderNewBuilder = Field.newBuilder();
        tn.p.j(builderNewBuilder, "newBuilder()");
        FieldKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final Field copy(@NotNull Field field, @NotNull sn.l<? super FieldKt.Dsl, bn.r> lVar) {
        tn.p.k(field, "<this>");
        tn.p.k(lVar, "block");
        FieldKt.Dsl.Companion companion = FieldKt.Dsl.Companion;
        Field.Builder builder = field.toBuilder();
        tn.p.j(builder, "this.toBuilder()");
        FieldKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
