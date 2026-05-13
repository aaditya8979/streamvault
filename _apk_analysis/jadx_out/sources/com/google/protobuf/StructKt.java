package com.google.protobuf;

import com.google.protobuf.Struct;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StructKt.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class StructKt {

    @NotNull
    public static final StructKt INSTANCE = new StructKt();

    /* JADX INFO: compiled from: StructKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final Struct.Builder _builder;

        /* JADX INFO: compiled from: StructKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(tn.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Struct.Builder builder) {
                tn.p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        /* JADX INFO: compiled from: StructKt.kt */
        public static final class FieldsProxy extends DslProxy {
            private FieldsProxy() {
            }
        }

        private Dsl(Struct.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Struct.Builder builder, tn.i iVar) {
            this(builder);
        }

        public final /* synthetic */ Struct _build() {
            Struct structBuild = this._builder.build();
            tn.p.j(structBuild, "_builder.build()");
            return structBuild;
        }

        public final /* synthetic */ void clearFields(DslMap dslMap) {
            tn.p.k(dslMap, "<this>");
            this._builder.clearFields();
        }

        public final /* synthetic */ DslMap getFieldsMap() {
            Map<String, Value> fieldsMap = this._builder.getFieldsMap();
            tn.p.j(fieldsMap, "_builder.getFieldsMap()");
            return new DslMap(fieldsMap);
        }

        public final /* synthetic */ void putAllFields(DslMap dslMap, Map map) {
            tn.p.k(dslMap, "<this>");
            tn.p.k(map, "map");
            this._builder.putAllFields(map);
        }

        public final void putFields(@NotNull DslMap<String, Value, FieldsProxy> dslMap, @NotNull String str, @NotNull Value value) {
            tn.p.k(dslMap, "<this>");
            tn.p.k(str, "key");
            tn.p.k(value, "value");
            this._builder.putFields(str, value);
        }

        public final /* synthetic */ void removeFields(DslMap dslMap, String str) {
            tn.p.k(dslMap, "<this>");
            tn.p.k(str, "key");
            this._builder.removeFields(str);
        }

        public final /* synthetic */ void setFields(DslMap<String, Value, FieldsProxy> dslMap, String str, Value value) {
            tn.p.k(dslMap, "<this>");
            tn.p.k(str, "key");
            tn.p.k(value, "value");
            putFields(dslMap, str, value);
        }
    }

    private StructKt() {
    }
}
