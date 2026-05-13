package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FieldKt.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class FieldKt {

    @NotNull
    public static final FieldKt INSTANCE = new FieldKt();

    /* JADX INFO: compiled from: FieldKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final Field.Builder _builder;

        /* JADX INFO: compiled from: FieldKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(tn.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Field.Builder builder) {
                tn.p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        /* JADX INFO: compiled from: FieldKt.kt */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        private Dsl(Field.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Field.Builder builder, tn.i iVar) {
            this(builder);
        }

        public final /* synthetic */ Field _build() {
            Field fieldBuild = this._builder.build();
            tn.p.j(fieldBuild, "_builder.build()");
            return fieldBuild;
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable iterable) {
            tn.p.k(dslList, "<this>");
            tn.p.k(iterable, "values");
            this._builder.addAllOptions(iterable);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option option) {
            tn.p.k(dslList, "<this>");
            tn.p.k(option, "value");
            this._builder.addOptions(option);
        }

        public final void clearCardinality() {
            this._builder.clearCardinality();
        }

        public final void clearDefaultValue() {
            this._builder.clearDefaultValue();
        }

        public final void clearJsonName() {
            this._builder.clearJsonName();
        }

        public final void clearKind() {
            this._builder.clearKind();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearNumber() {
            this._builder.clearNumber();
        }

        public final void clearOneofIndex() {
            this._builder.clearOneofIndex();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            tn.p.k(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final void clearPacked() {
            this._builder.clearPacked();
        }

        public final void clearTypeUrl() {
            this._builder.clearTypeUrl();
        }

        @NotNull
        public final Field.Cardinality getCardinality() {
            Field.Cardinality cardinality = this._builder.getCardinality();
            tn.p.j(cardinality, "_builder.getCardinality()");
            return cardinality;
        }

        public final int getCardinalityValue() {
            return this._builder.getCardinalityValue();
        }

        @NotNull
        public final String getDefaultValue() {
            String defaultValue = this._builder.getDefaultValue();
            tn.p.j(defaultValue, "_builder.getDefaultValue()");
            return defaultValue;
        }

        @NotNull
        public final String getJsonName() {
            String jsonName = this._builder.getJsonName();
            tn.p.j(jsonName, "_builder.getJsonName()");
            return jsonName;
        }

        @NotNull
        public final Field.Kind getKind() {
            Field.Kind kind = this._builder.getKind();
            tn.p.j(kind, "_builder.getKind()");
            return kind;
        }

        public final int getKindValue() {
            return this._builder.getKindValue();
        }

        @NotNull
        public final String getName() {
            String name = this._builder.getName();
            tn.p.j(name, "_builder.getName()");
            return name;
        }

        public final int getNumber() {
            return this._builder.getNumber();
        }

        public final int getOneofIndex() {
            return this._builder.getOneofIndex();
        }

        public final /* synthetic */ DslList getOptions() {
            List<Option> optionsList = this._builder.getOptionsList();
            tn.p.j(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
        }

        public final boolean getPacked() {
            return this._builder.getPacked();
        }

        @NotNull
        public final String getTypeUrl() {
            String typeUrl = this._builder.getTypeUrl();
            tn.p.j(typeUrl, "_builder.getTypeUrl()");
            return typeUrl;
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> iterable) {
            tn.p.k(dslList, "<this>");
            tn.p.k(iterable, "values");
            addAllOptions(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignOptions(DslList<Option, OptionsProxy> dslList, Option option) {
            tn.p.k(dslList, "<this>");
            tn.p.k(option, "value");
            addOptions(dslList, option);
        }

        public final void setCardinality(@NotNull Field.Cardinality cardinality) {
            tn.p.k(cardinality, "value");
            this._builder.setCardinality(cardinality);
        }

        public final void setCardinalityValue(int i10) {
            this._builder.setCardinalityValue(i10);
        }

        public final void setDefaultValue(@NotNull String str) {
            tn.p.k(str, "value");
            this._builder.setDefaultValue(str);
        }

        public final void setJsonName(@NotNull String str) {
            tn.p.k(str, "value");
            this._builder.setJsonName(str);
        }

        public final void setKind(@NotNull Field.Kind kind) {
            tn.p.k(kind, "value");
            this._builder.setKind(kind);
        }

        public final void setKindValue(int i10) {
            this._builder.setKindValue(i10);
        }

        public final void setName(@NotNull String str) {
            tn.p.k(str, "value");
            this._builder.setName(str);
        }

        public final void setNumber(int i10) {
            this._builder.setNumber(i10);
        }

        public final void setOneofIndex(int i10) {
            this._builder.setOneofIndex(i10);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i10, Option option) {
            tn.p.k(dslList, "<this>");
            tn.p.k(option, "value");
            this._builder.setOptions(i10, option);
        }

        public final void setPacked(boolean z10) {
            this._builder.setPacked(z10);
        }

        public final void setTypeUrl(@NotNull String str) {
            tn.p.k(str, "value");
            this._builder.setTypeUrl(str);
        }
    }

    private FieldKt() {
    }
}
