package com.google.protobuf;

import com.google.protobuf.Mixin;
import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MixinKt.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class MixinKt {

    @NotNull
    public static final MixinKt INSTANCE = new MixinKt();

    /* JADX INFO: compiled from: MixinKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final Mixin.Builder _builder;

        /* JADX INFO: compiled from: MixinKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(tn.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Mixin.Builder builder) {
                tn.p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Mixin.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Mixin.Builder builder, tn.i iVar) {
            this(builder);
        }

        public final /* synthetic */ Mixin _build() {
            Mixin mixinBuild = this._builder.build();
            tn.p.j(mixinBuild, "_builder.build()");
            return mixinBuild;
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearRoot() {
            this._builder.clearRoot();
        }

        @NotNull
        public final String getName() {
            String name = this._builder.getName();
            tn.p.j(name, "_builder.getName()");
            return name;
        }

        @NotNull
        public final String getRoot() {
            String root = this._builder.getRoot();
            tn.p.j(root, "_builder.getRoot()");
            return root;
        }

        public final void setName(@NotNull String str) {
            tn.p.k(str, "value");
            this._builder.setName(str);
        }

        public final void setRoot(@NotNull String str) {
            tn.p.k(str, "value");
            this._builder.setRoot(str);
        }
    }

    private MixinKt() {
    }
}
