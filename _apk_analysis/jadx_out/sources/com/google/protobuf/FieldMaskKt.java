package com.google.protobuf;

import com.google.protobuf.FieldMask;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FieldMaskKt.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class FieldMaskKt {

    @NotNull
    public static final FieldMaskKt INSTANCE = new FieldMaskKt();

    /* JADX INFO: compiled from: FieldMaskKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final FieldMask.Builder _builder;

        /* JADX INFO: compiled from: FieldMaskKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(tn.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(FieldMask.Builder builder) {
                tn.p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        /* JADX INFO: compiled from: FieldMaskKt.kt */
        public static final class PathsProxy extends DslProxy {
            private PathsProxy() {
            }
        }

        private Dsl(FieldMask.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(FieldMask.Builder builder, tn.i iVar) {
            this(builder);
        }

        public final /* synthetic */ FieldMask _build() {
            FieldMask fieldMaskBuild = this._builder.build();
            tn.p.j(fieldMaskBuild, "_builder.build()");
            return fieldMaskBuild;
        }

        public final /* synthetic */ void addAllPaths(DslList dslList, Iterable iterable) {
            tn.p.k(dslList, "<this>");
            tn.p.k(iterable, "values");
            this._builder.addAllPaths(iterable);
        }

        public final /* synthetic */ void addPaths(DslList dslList, String str) {
            tn.p.k(dslList, "<this>");
            tn.p.k(str, "value");
            this._builder.addPaths(str);
        }

        public final /* synthetic */ void clearPaths(DslList dslList) {
            tn.p.k(dslList, "<this>");
            this._builder.clearPaths();
        }

        @NotNull
        public final DslList<String, PathsProxy> getPaths() {
            List<String> pathsList = this._builder.getPathsList();
            tn.p.j(pathsList, "_builder.getPathsList()");
            return new DslList<>(pathsList);
        }

        public final /* synthetic */ void plusAssignAllPaths(DslList<String, PathsProxy> dslList, Iterable<String> iterable) {
            tn.p.k(dslList, "<this>");
            tn.p.k(iterable, "values");
            addAllPaths(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignPaths(DslList<String, PathsProxy> dslList, String str) {
            tn.p.k(dslList, "<this>");
            tn.p.k(str, "value");
            addPaths(dslList, str);
        }

        public final /* synthetic */ void setPaths(DslList dslList, int i10, String str) {
            tn.p.k(dslList, "<this>");
            tn.p.k(str, "value");
            this._builder.setPaths(i10, str);
        }
    }

    private FieldMaskKt() {
    }
}
