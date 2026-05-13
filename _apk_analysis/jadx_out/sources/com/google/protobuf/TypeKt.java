package com.google.protobuf;

import com.google.protobuf.Type;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TypeKt.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class TypeKt {

    @NotNull
    public static final TypeKt INSTANCE = new TypeKt();

    /* JADX INFO: compiled from: TypeKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final Type.Builder _builder;

        /* JADX INFO: compiled from: TypeKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(tn.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Type.Builder builder) {
                tn.p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        /* JADX INFO: compiled from: TypeKt.kt */
        public static final class FieldsProxy extends DslProxy {
            private FieldsProxy() {
            }
        }

        /* JADX INFO: compiled from: TypeKt.kt */
        public static final class OneofsProxy extends DslProxy {
            private OneofsProxy() {
            }
        }

        /* JADX INFO: compiled from: TypeKt.kt */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        private Dsl(Type.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Type.Builder builder, tn.i iVar) {
            this(builder);
        }

        public final /* synthetic */ Type _build() {
            Type typeBuild = this._builder.build();
            tn.p.j(typeBuild, "_builder.build()");
            return typeBuild;
        }

        public final /* synthetic */ void addAllFields(DslList dslList, Iterable iterable) {
            tn.p.k(dslList, "<this>");
            tn.p.k(iterable, "values");
            this._builder.addAllFields(iterable);
        }

        public final /* synthetic */ void addAllOneofs(DslList dslList, Iterable iterable) {
            tn.p.k(dslList, "<this>");
            tn.p.k(iterable, "values");
            this._builder.addAllOneofs(iterable);
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable iterable) {
            tn.p.k(dslList, "<this>");
            tn.p.k(iterable, "values");
            this._builder.addAllOptions(iterable);
        }

        public final /* synthetic */ void addFields(DslList dslList, Field field) {
            tn.p.k(dslList, "<this>");
            tn.p.k(field, "value");
            this._builder.addFields(field);
        }

        public final /* synthetic */ void addOneofs(DslList dslList, String str) {
            tn.p.k(dslList, "<this>");
            tn.p.k(str, "value");
            this._builder.addOneofs(str);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option option) {
            tn.p.k(dslList, "<this>");
            tn.p.k(option, "value");
            this._builder.addOptions(option);
        }

        public final void clearEdition() {
            this._builder.clearEdition();
        }

        public final /* synthetic */ void clearFields(DslList dslList) {
            tn.p.k(dslList, "<this>");
            this._builder.clearFields();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final /* synthetic */ void clearOneofs(DslList dslList) {
            tn.p.k(dslList, "<this>");
            this._builder.clearOneofs();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            tn.p.k(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final void clearSourceContext() {
            this._builder.clearSourceContext();
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
        }

        @NotNull
        public final String getEdition() {
            String edition = this._builder.getEdition();
            tn.p.j(edition, "_builder.getEdition()");
            return edition;
        }

        public final /* synthetic */ DslList getFields() {
            List<Field> fieldsList = this._builder.getFieldsList();
            tn.p.j(fieldsList, "_builder.getFieldsList()");
            return new DslList(fieldsList);
        }

        @NotNull
        public final String getName() {
            String name = this._builder.getName();
            tn.p.j(name, "_builder.getName()");
            return name;
        }

        @NotNull
        public final DslList<String, OneofsProxy> getOneofs() {
            List<String> oneofsList = this._builder.getOneofsList();
            tn.p.j(oneofsList, "_builder.getOneofsList()");
            return new DslList<>(oneofsList);
        }

        public final /* synthetic */ DslList getOptions() {
            List<Option> optionsList = this._builder.getOptionsList();
            tn.p.j(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
        }

        @NotNull
        public final SourceContext getSourceContext() {
            SourceContext sourceContext = this._builder.getSourceContext();
            tn.p.j(sourceContext, "_builder.getSourceContext()");
            return sourceContext;
        }

        @NotNull
        public final Syntax getSyntax() {
            Syntax syntax = this._builder.getSyntax();
            tn.p.j(syntax, "_builder.getSyntax()");
            return syntax;
        }

        public final int getSyntaxValue() {
            return this._builder.getSyntaxValue();
        }

        public final boolean hasSourceContext() {
            return this._builder.hasSourceContext();
        }

        public final /* synthetic */ void plusAssignAllFields(DslList<Field, FieldsProxy> dslList, Iterable<Field> iterable) {
            tn.p.k(dslList, "<this>");
            tn.p.k(iterable, "values");
            addAllFields(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllOneofs(DslList<String, OneofsProxy> dslList, Iterable<String> iterable) {
            tn.p.k(dslList, "<this>");
            tn.p.k(iterable, "values");
            addAllOneofs(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> iterable) {
            tn.p.k(dslList, "<this>");
            tn.p.k(iterable, "values");
            addAllOptions(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignFields(DslList<Field, FieldsProxy> dslList, Field field) {
            tn.p.k(dslList, "<this>");
            tn.p.k(field, "value");
            addFields(dslList, field);
        }

        public final /* synthetic */ void plusAssignOneofs(DslList<String, OneofsProxy> dslList, String str) {
            tn.p.k(dslList, "<this>");
            tn.p.k(str, "value");
            addOneofs(dslList, str);
        }

        public final /* synthetic */ void plusAssignOptions(DslList<Option, OptionsProxy> dslList, Option option) {
            tn.p.k(dslList, "<this>");
            tn.p.k(option, "value");
            addOptions(dslList, option);
        }

        public final void setEdition(@NotNull String str) {
            tn.p.k(str, "value");
            this._builder.setEdition(str);
        }

        public final /* synthetic */ void setFields(DslList dslList, int i10, Field field) {
            tn.p.k(dslList, "<this>");
            tn.p.k(field, "value");
            this._builder.setFields(i10, field);
        }

        public final void setName(@NotNull String str) {
            tn.p.k(str, "value");
            this._builder.setName(str);
        }

        public final /* synthetic */ void setOneofs(DslList dslList, int i10, String str) {
            tn.p.k(dslList, "<this>");
            tn.p.k(str, "value");
            this._builder.setOneofs(i10, str);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i10, Option option) {
            tn.p.k(dslList, "<this>");
            tn.p.k(option, "value");
            this._builder.setOptions(i10, option);
        }

        public final void setSourceContext(@NotNull SourceContext sourceContext) {
            tn.p.k(sourceContext, "value");
            this._builder.setSourceContext(sourceContext);
        }

        public final void setSyntax(@NotNull Syntax syntax) {
            tn.p.k(syntax, "value");
            this._builder.setSyntax(syntax);
        }

        public final void setSyntaxValue(int i10) {
            this._builder.setSyntaxValue(i10);
        }
    }

    private TypeKt() {
    }
}
