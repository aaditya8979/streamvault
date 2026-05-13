package com.google.protobuf;

import com.google.protobuf.Type;
import com.google.protobuf.TypeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TypeKt.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TypeKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializetype, reason: not valid java name */
    public static final Type m4313initializetype(@NotNull sn.l<? super TypeKt.Dsl, bn.r> lVar) {
        tn.p.k(lVar, "block");
        TypeKt.Dsl.Companion companion = TypeKt.Dsl.Companion;
        Type.Builder builderNewBuilder = Type.newBuilder();
        tn.p.j(builderNewBuilder, "newBuilder()");
        TypeKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final Type copy(@NotNull Type type, @NotNull sn.l<? super TypeKt.Dsl, bn.r> lVar) {
        tn.p.k(type, "<this>");
        tn.p.k(lVar, "block");
        TypeKt.Dsl.Companion companion = TypeKt.Dsl.Companion;
        Type.Builder builder = type.toBuilder();
        tn.p.j(builder, "this.toBuilder()");
        TypeKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final SourceContext getSourceContextOrNull(@NotNull TypeOrBuilder typeOrBuilder) {
        tn.p.k(typeOrBuilder, "<this>");
        if (typeOrBuilder.hasSourceContext()) {
            return typeOrBuilder.getSourceContext();
        }
        return null;
    }
}
