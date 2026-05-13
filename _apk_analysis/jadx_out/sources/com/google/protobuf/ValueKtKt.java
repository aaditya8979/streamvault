package com.google.protobuf;

import com.google.protobuf.Value;
import com.google.protobuf.ValueKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ValueKt.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ValueKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializevalue, reason: not valid java name */
    public static final Value m4316initializevalue(@NotNull sn.l<? super ValueKt.Dsl, bn.r> lVar) {
        tn.p.k(lVar, "block");
        ValueKt.Dsl.Companion companion = ValueKt.Dsl.Companion;
        Value.Builder builderNewBuilder = Value.newBuilder();
        tn.p.j(builderNewBuilder, "newBuilder()");
        ValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final Value copy(@NotNull Value value, @NotNull sn.l<? super ValueKt.Dsl, bn.r> lVar) {
        tn.p.k(value, "<this>");
        tn.p.k(lVar, "block");
        ValueKt.Dsl.Companion companion = ValueKt.Dsl.Companion;
        Value.Builder builder = value.toBuilder();
        tn.p.j(builder, "this.toBuilder()");
        ValueKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final ListValue getListValueOrNull(@NotNull ValueOrBuilder valueOrBuilder) {
        tn.p.k(valueOrBuilder, "<this>");
        if (valueOrBuilder.hasListValue()) {
            return valueOrBuilder.getListValue();
        }
        return null;
    }

    @Nullable
    public static final Struct getStructValueOrNull(@NotNull ValueOrBuilder valueOrBuilder) {
        tn.p.k(valueOrBuilder, "<this>");
        if (valueOrBuilder.hasStructValue()) {
            return valueOrBuilder.getStructValue();
        }
        return null;
    }
}
