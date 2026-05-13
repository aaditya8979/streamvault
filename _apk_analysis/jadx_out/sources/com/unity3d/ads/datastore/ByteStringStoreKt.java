package com.unity3d.ads.datastore;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: ByteStringStoreKt.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ByteStringStoreKt {

    @NotNull
    public static final ByteStringStoreKt INSTANCE = new ByteStringStoreKt();

    /* JADX INFO: compiled from: ByteStringStoreKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final ByteStringStoreOuterClass.ByteStringStore.Builder _builder;

        /* JADX INFO: compiled from: ByteStringStoreKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(ByteStringStoreOuterClass.ByteStringStore.Builder builder) {
                p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(ByteStringStoreOuterClass.ByteStringStore.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(ByteStringStoreOuterClass.ByteStringStore.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ ByteStringStoreOuterClass.ByteStringStore _build() {
            ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = this._builder.build();
            p.j(byteStringStoreBuild, "_builder.build()");
            return byteStringStoreBuild;
        }

        public final void clearData() {
            this._builder.clearData();
        }

        @NotNull
        public final ByteString getData() {
            ByteString data = this._builder.getData();
            p.j(data, "_builder.getData()");
            return data;
        }

        public final void setData(@NotNull ByteString byteString) {
            p.k(byteString, "value");
            this._builder.setData(byteString);
        }
    }

    private ByteStringStoreKt() {
    }
}
