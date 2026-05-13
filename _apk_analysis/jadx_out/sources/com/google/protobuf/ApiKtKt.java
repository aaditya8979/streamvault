package com.google.protobuf;

import com.google.protobuf.Api;
import com.google.protobuf.ApiKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ApiKt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ApiKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializeapi, reason: not valid java name */
    public static final Api m4291initializeapi(@NotNull sn.l<? super ApiKt.Dsl, bn.r> lVar) {
        tn.p.k(lVar, "block");
        ApiKt.Dsl.Companion companion = ApiKt.Dsl.Companion;
        Api.Builder builderNewBuilder = Api.newBuilder();
        tn.p.j(builderNewBuilder, "newBuilder()");
        ApiKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final Api copy(@NotNull Api api, @NotNull sn.l<? super ApiKt.Dsl, bn.r> lVar) {
        tn.p.k(api, "<this>");
        tn.p.k(lVar, "block");
        ApiKt.Dsl.Companion companion = ApiKt.Dsl.Companion;
        Api.Builder builder = api.toBuilder();
        tn.p.j(builder, "this.toBuilder()");
        ApiKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final SourceContext getSourceContextOrNull(@NotNull ApiOrBuilder apiOrBuilder) {
        tn.p.k(apiOrBuilder, "<this>");
        if (apiOrBuilder.hasSourceContext()) {
            return apiOrBuilder.getSourceContext();
        }
        return null;
    }
}
