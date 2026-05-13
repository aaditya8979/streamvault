package com.google.protobuf;

import com.google.protobuf.Option;
import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OptionKt.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class OptionKt {

    @NotNull
    public static final OptionKt INSTANCE = new OptionKt();

    /* JADX INFO: compiled from: OptionKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final Option.Builder _builder;

        /* JADX INFO: compiled from: OptionKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(tn.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Option.Builder builder) {
                tn.p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Option.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Option.Builder builder, tn.i iVar) {
            this(builder);
        }

        public final /* synthetic */ Option _build() {
            Option optionBuild = this._builder.build();
            tn.p.j(optionBuild, "_builder.build()");
            return optionBuild;
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        @NotNull
        public final String getName() {
            String name = this._builder.getName();
            tn.p.j(name, "_builder.getName()");
            return name;
        }

        @NotNull
        public final Any getValue() {
            Any value = this._builder.getValue();
            tn.p.j(value, "_builder.getValue()");
            return value;
        }

        public final boolean hasValue() {
            return this._builder.hasValue();
        }

        public final void setName(@NotNull String str) {
            tn.p.k(str, "value");
            this._builder.setName(str);
        }

        public final void setValue(@NotNull Any any) {
            tn.p.k(any, "value");
            this._builder.setValue(any);
        }
    }

    private OptionKt() {
    }
}
