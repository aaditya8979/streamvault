package com.google.protobuf;

import com.google.protobuf.Duration;
import com.google.protobuf.DurationKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DurationKt.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DurationKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializeduration, reason: not valid java name */
    public static final Duration m4295initializeduration(@NotNull sn.l<? super DurationKt.Dsl, bn.r> lVar) {
        tn.p.k(lVar, "block");
        DurationKt.Dsl.Companion companion = DurationKt.Dsl.Companion;
        Duration.Builder builderNewBuilder = Duration.newBuilder();
        tn.p.j(builderNewBuilder, "newBuilder()");
        DurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final Duration copy(@NotNull Duration duration, @NotNull sn.l<? super DurationKt.Dsl, bn.r> lVar) {
        tn.p.k(duration, "<this>");
        tn.p.k(lVar, "block");
        DurationKt.Dsl.Companion companion = DurationKt.Dsl.Companion;
        Duration.Builder builder = duration.toBuilder();
        tn.p.j(builder, "this.toBuilder()");
        DurationKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
