package com.google.protobuf;

import com.google.protobuf.BoolValue;
import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BoolValueKt.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class BoolValueKt {

    @NotNull
    public static final BoolValueKt INSTANCE = new BoolValueKt();

    /* JADX INFO: compiled from: BoolValueKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final BoolValue.Builder _builder;

        /* JADX INFO: compiled from: BoolValueKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(tn.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(BoolValue.Builder builder) {
                tn.p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(BoolValue.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(BoolValue.Builder builder, tn.i iVar) {
            this(builder);
        }

        public final /* synthetic */ BoolValue _build() {
            BoolValue boolValueBuild = this._builder.build();
            tn.p.j(boolValueBuild, "_builder.build()");
            return boolValueBuild;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final boolean getValue() {
            return this._builder.getValue();
        }

        public final void setValue(boolean z10) {
            this._builder.setValue(z10);
        }
    }

    private BoolValueKt() {
    }
}
