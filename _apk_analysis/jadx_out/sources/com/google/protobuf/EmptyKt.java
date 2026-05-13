package com.google.protobuf;

import com.google.protobuf.Empty;
import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EmptyKt.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class EmptyKt {

    @NotNull
    public static final EmptyKt INSTANCE = new EmptyKt();

    /* JADX INFO: compiled from: EmptyKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final Empty.Builder _builder;

        /* JADX INFO: compiled from: EmptyKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(tn.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Empty.Builder builder) {
                tn.p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Empty.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Empty.Builder builder, tn.i iVar) {
            this(builder);
        }

        public final /* synthetic */ Empty _build() {
            Empty emptyBuild = this._builder.build();
            tn.p.j(emptyBuild, "_builder.build()");
            return emptyBuild;
        }
    }

    private EmptyKt() {
    }
}
