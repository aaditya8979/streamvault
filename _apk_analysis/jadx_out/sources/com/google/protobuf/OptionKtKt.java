package com.google.protobuf;

import com.google.protobuf.Option;
import com.google.protobuf.OptionKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OptionKt.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class OptionKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializeoption, reason: not valid java name */
    public static final Option m4308initializeoption(@NotNull sn.l<? super OptionKt.Dsl, bn.r> lVar) {
        tn.p.k(lVar, "block");
        OptionKt.Dsl.Companion companion = OptionKt.Dsl.Companion;
        Option.Builder builderNewBuilder = Option.newBuilder();
        tn.p.j(builderNewBuilder, "newBuilder()");
        OptionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final Option copy(@NotNull Option option, @NotNull sn.l<? super OptionKt.Dsl, bn.r> lVar) {
        tn.p.k(option, "<this>");
        tn.p.k(lVar, "block");
        OptionKt.Dsl.Companion companion = OptionKt.Dsl.Companion;
        Option.Builder builder = option.toBuilder();
        tn.p.j(builder, "this.toBuilder()");
        OptionKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @Nullable
    public static final Any getValueOrNull(@NotNull OptionOrBuilder optionOrBuilder) {
        tn.p.k(optionOrBuilder, "<this>");
        if (optionOrBuilder.hasValue()) {
            return optionOrBuilder.getValue();
        }
        return null;
    }
}
