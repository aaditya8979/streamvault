package com.google.protobuf;

import com.google.protobuf.SourceContext;
import com.google.protobuf.SourceContextKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SourceContextKt.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class SourceContextKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializesourceContext, reason: not valid java name */
    public static final SourceContext m4309initializesourceContext(@NotNull sn.l<? super SourceContextKt.Dsl, bn.r> lVar) {
        tn.p.k(lVar, "block");
        SourceContextKt.Dsl.Companion companion = SourceContextKt.Dsl.Companion;
        SourceContext.Builder builderNewBuilder = SourceContext.newBuilder();
        tn.p.j(builderNewBuilder, "newBuilder()");
        SourceContextKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final SourceContext copy(@NotNull SourceContext sourceContext, @NotNull sn.l<? super SourceContextKt.Dsl, bn.r> lVar) {
        tn.p.k(sourceContext, "<this>");
        tn.p.k(lVar, "block");
        SourceContextKt.Dsl.Companion companion = SourceContextKt.Dsl.Companion;
        SourceContext.Builder builder = sourceContext.toBuilder();
        tn.p.j(builder, "this.toBuilder()");
        SourceContextKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
