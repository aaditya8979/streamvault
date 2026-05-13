package com.google.protobuf;

import com.google.protobuf.Method;
import com.google.protobuf.MethodKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MethodKt.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class MethodKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializemethod, reason: not valid java name */
    public static final Method m4306initializemethod(@NotNull sn.l<? super MethodKt.Dsl, bn.r> lVar) {
        tn.p.k(lVar, "block");
        MethodKt.Dsl.Companion companion = MethodKt.Dsl.Companion;
        Method.Builder builderNewBuilder = Method.newBuilder();
        tn.p.j(builderNewBuilder, "newBuilder()");
        MethodKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final Method copy(@NotNull Method method, @NotNull sn.l<? super MethodKt.Dsl, bn.r> lVar) {
        tn.p.k(method, "<this>");
        tn.p.k(lVar, "block");
        MethodKt.Dsl.Companion companion = MethodKt.Dsl.Companion;
        Method.Builder builder = method.toBuilder();
        tn.p.j(builder, "this.toBuilder()");
        MethodKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
