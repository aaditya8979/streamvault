package com.google.protobuf;

import com.google.protobuf.Any;
import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AnyKt.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class AnyKt {

    @NotNull
    public static final AnyKt INSTANCE = new AnyKt();

    /* JADX INFO: compiled from: AnyKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final Any.Builder _builder;

        /* JADX INFO: compiled from: AnyKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(tn.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Any.Builder builder) {
                tn.p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Any.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Any.Builder builder, tn.i iVar) {
            this(builder);
        }

        public final /* synthetic */ Any _build() {
            Any anyBuild = this._builder.build();
            tn.p.j(anyBuild, "_builder.build()");
            return anyBuild;
        }

        public final void clearTypeUrl() {
            this._builder.clearTypeUrl();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        @NotNull
        public final String getTypeUrl() {
            String typeUrl = this._builder.getTypeUrl();
            tn.p.j(typeUrl, "_builder.getTypeUrl()");
            return typeUrl;
        }

        @NotNull
        public final ByteString getValue() {
            ByteString value = this._builder.getValue();
            tn.p.j(value, "_builder.getValue()");
            return value;
        }

        public final void setTypeUrl(@NotNull String str) {
            tn.p.k(str, "value");
            this._builder.setTypeUrl(str);
        }

        public final void setValue(@NotNull ByteString byteString) {
            tn.p.k(byteString, "value");
            this._builder.setValue(byteString);
        }
    }

    private AnyKt() {
    }
}
