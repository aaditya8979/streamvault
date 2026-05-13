package com.unity3d.ads.datastore;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: UniversalRequestStoreKt.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class UniversalRequestStoreKt {

    @NotNull
    public static final UniversalRequestStoreKt INSTANCE = new UniversalRequestStoreKt();

    /* JADX INFO: compiled from: UniversalRequestStoreKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final UniversalRequestStoreOuterClass.UniversalRequestStore.Builder _builder;

        /* JADX INFO: compiled from: UniversalRequestStoreKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder) {
                p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        /* JADX INFO: compiled from: UniversalRequestStoreKt.kt */
        public static final class UniversalRequestMapProxy extends DslProxy {
            private UniversalRequestMapProxy() {
            }
        }

        private Dsl(UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ UniversalRequestStoreOuterClass.UniversalRequestStore _build() {
            UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStoreBuild = this._builder.build();
            p.j(universalRequestStoreBuild, "_builder.build()");
            return universalRequestStoreBuild;
        }

        public final /* synthetic */ void clearUniversalRequestMap(DslMap dslMap) {
            p.k(dslMap, "<this>");
            this._builder.clearUniversalRequestMap();
        }

        public final /* synthetic */ DslMap getUniversalRequestMapMap() {
            Map<String, ByteString> universalRequestMapMap = this._builder.getUniversalRequestMapMap();
            p.j(universalRequestMapMap, "_builder.getUniversalRequestMapMap()");
            return new DslMap(universalRequestMapMap);
        }

        public final /* synthetic */ void putAllUniversalRequestMap(DslMap dslMap, Map map) {
            p.k(dslMap, "<this>");
            p.k(map, "map");
            this._builder.putAllUniversalRequestMap(map);
        }

        public final void putUniversalRequestMap(@NotNull DslMap<String, ByteString, UniversalRequestMapProxy> dslMap, @NotNull String str, @NotNull ByteString byteString) {
            p.k(dslMap, "<this>");
            p.k(str, "key");
            p.k(byteString, "value");
            this._builder.putUniversalRequestMap(str, byteString);
        }

        public final /* synthetic */ void removeUniversalRequestMap(DslMap dslMap, String str) {
            p.k(dslMap, "<this>");
            p.k(str, "key");
            this._builder.removeUniversalRequestMap(str);
        }

        public final /* synthetic */ void setUniversalRequestMap(DslMap<String, ByteString, UniversalRequestMapProxy> dslMap, String str, ByteString byteString) {
            p.k(dslMap, "<this>");
            p.k(str, "key");
            p.k(byteString, "value");
            putUniversalRequestMap(dslMap, str, byteString);
        }
    }

    private UniversalRequestStoreKt() {
    }
}
