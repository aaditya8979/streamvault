package com.google.protobuf;

import com.google.protobuf.StringValue;
import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StringValueKt.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class StringValueKt {

    @NotNull
    public static final StringValueKt INSTANCE = new StringValueKt();

    /* JADX INFO: compiled from: StringValueKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final StringValue.Builder _builder;

        /* JADX INFO: compiled from: StringValueKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(tn.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(StringValue.Builder builder) {
                tn.p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(StringValue.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(StringValue.Builder builder, tn.i iVar) {
            this(builder);
        }

        public final /* synthetic */ StringValue _build() {
            StringValue stringValueBuild = this._builder.build();
            tn.p.j(stringValueBuild, "_builder.build()");
            return stringValueBuild;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        @NotNull
        public final String getValue() {
            String value = this._builder.getValue();
            tn.p.j(value, "_builder.getValue()");
            return value;
        }

        public final void setValue(@NotNull String str) {
            tn.p.k(str, "value");
            this._builder.setValue(str);
        }
    }

    private StringValueKt() {
    }
}
