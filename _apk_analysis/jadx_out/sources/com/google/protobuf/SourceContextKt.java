package com.google.protobuf;

import com.google.protobuf.SourceContext;
import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SourceContextKt.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class SourceContextKt {

    @NotNull
    public static final SourceContextKt INSTANCE = new SourceContextKt();

    /* JADX INFO: compiled from: SourceContextKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final SourceContext.Builder _builder;

        /* JADX INFO: compiled from: SourceContextKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(tn.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(SourceContext.Builder builder) {
                tn.p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(SourceContext.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(SourceContext.Builder builder, tn.i iVar) {
            this(builder);
        }

        public final /* synthetic */ SourceContext _build() {
            SourceContext sourceContextBuild = this._builder.build();
            tn.p.j(sourceContextBuild, "_builder.build()");
            return sourceContextBuild;
        }

        public final void clearFileName() {
            this._builder.clearFileName();
        }

        @NotNull
        public final String getFileName() {
            String fileName = this._builder.getFileName();
            tn.p.j(fileName, "_builder.getFileName()");
            return fileName;
        }

        public final void setFileName(@NotNull String str) {
            tn.p.k(str, "value");
            this._builder.setFileName(str);
        }
    }

    private SourceContextKt() {
    }
}
