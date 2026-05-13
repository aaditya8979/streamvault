package com.google.protobuf;

import com.google.protobuf.Mixin;
import com.google.protobuf.MixinKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MixinKt.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class MixinKtKt {
    @NotNull
    /* JADX INFO: renamed from: -initializemixin, reason: not valid java name */
    public static final Mixin m4307initializemixin(@NotNull sn.l<? super MixinKt.Dsl, bn.r> lVar) {
        tn.p.k(lVar, "block");
        MixinKt.Dsl.Companion companion = MixinKt.Dsl.Companion;
        Mixin.Builder builderNewBuilder = Mixin.newBuilder();
        tn.p.j(builderNewBuilder, "newBuilder()");
        MixinKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    @NotNull
    public static final Mixin copy(@NotNull Mixin mixin, @NotNull sn.l<? super MixinKt.Dsl, bn.r> lVar) {
        tn.p.k(mixin, "<this>");
        tn.p.k(lVar, "block");
        MixinKt.Dsl.Companion companion = MixinKt.Dsl.Companion;
        Mixin.Builder builder = mixin.toBuilder();
        tn.p.j(builder, "this.toBuilder()");
        MixinKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
