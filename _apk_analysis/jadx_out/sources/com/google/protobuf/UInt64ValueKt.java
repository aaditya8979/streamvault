package com.google.protobuf;

import com.google.protobuf.UInt64Value;
import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UInt64ValueKt.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class UInt64ValueKt {

    @NotNull
    public static final UInt64ValueKt INSTANCE = new UInt64ValueKt();

    /* JADX INFO: compiled from: UInt64ValueKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final UInt64Value.Builder _builder;

        /* JADX INFO: compiled from: UInt64ValueKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(tn.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UInt64Value.Builder builder) {
                tn.p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(UInt64Value.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(UInt64Value.Builder builder, tn.i iVar) {
            this(builder);
        }

        public final /* synthetic */ UInt64Value _build() {
            UInt64Value uInt64ValueBuild = this._builder.build();
            tn.p.j(uInt64ValueBuild, "_builder.build()");
            return uInt64ValueBuild;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final long getValue() {
            return this._builder.getValue();
        }

        public final void setValue(long j10) {
            this._builder.setValue(j10);
        }
    }

    private UInt64ValueKt() {
    }
}
