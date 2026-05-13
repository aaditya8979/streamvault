package com.google.protobuf;

import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TimestampKt.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class TimestampKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializetimestamp, reason: not valid java name */
    public static final Timestamp m4312initializetimestamp(@NotNull sn.l<? super TimestampKt.Dsl, bn.r> lVar) {
        tn.p.k(lVar, "block");
        TimestampKt.Dsl.Companion companion = TimestampKt.Dsl.Companion;
        Timestamp.Builder builderNewBuilder = Timestamp.newBuilder();
        tn.p.j(builderNewBuilder, "newBuilder()");
        TimestampKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final Timestamp copy(@NotNull Timestamp timestamp, @NotNull sn.l<? super TimestampKt.Dsl, bn.r> lVar) {
        tn.p.k(timestamp, "<this>");
        tn.p.k(lVar, "block");
        TimestampKt.Dsl.Companion companion = TimestampKt.Dsl.Companion;
        Timestamp.Builder builder = timestamp.toBuilder();
        tn.p.j(builder, "this.toBuilder()");
        TimestampKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
