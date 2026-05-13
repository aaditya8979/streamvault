package com.google.protobuf;

import com.google.protobuf.Enum;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EnumKt.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumKt {

    @NotNull
    public static final EnumKt INSTANCE = new EnumKt();

    /* JADX INFO: compiled from: EnumKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final Enum.Builder _builder;

        /* JADX INFO: compiled from: EnumKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(tn.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Enum.Builder builder) {
                tn.p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        /* JADX INFO: compiled from: EnumKt.kt */
        public static final class EnumvalueProxy extends DslProxy {
            private EnumvalueProxy() {
            }
        }

        /* JADX INFO: compiled from: EnumKt.kt */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        private Dsl(Enum.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Enum.Builder builder, tn.i iVar) {
            this(builder);
        }

        public final /* synthetic */ Enum _build() {
            Enum enumBuild = this._builder.build();
            tn.p.j(enumBuild, "_builder.build()");
            return enumBuild;
        }

        public final /* synthetic */ void addAllEnumvalue(DslList dslList, Iterable iterable) {
            tn.p.k(dslList, "<this>");
            tn.p.k(iterable, "values");
            this._builder.addAllEnumvalue(iterable);
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable iterable) {
            tn.p.k(dslList, "<this>");
            tn.p.k(iterable, "values");
            this._builder.addAllOptions(iterable);
        }

        public final /* synthetic */ void addEnumvalue(DslList dslList, EnumValue enumValue) {
            tn.p.k(dslList, "<this>");
            tn.p.k(enumValue, "value");
            this._builder.addEnumvalue(enumValue);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option option) {
            tn.p.k(dslList, "<this>");
            tn.p.k(option, "value");
            this._builder.addOptions(option);
        }

        public final void clearEdition() {
            this._builder.clearEdition();
        }

        public final /* synthetic */ void clearEnumvalue(DslList dslList) {
            tn.p.k(dslList, "<this>");
            this._builder.clearEnumvalue();
        }

        public final void clearName() {
            this._builder.clearName();
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

        public final /* synthetic */ DslList getEnumvalue() {
            List<EnumValue> enumvalueList = this._builder.getEnumvalueList();
            tn.p.j(enumvalueList, "_builder.getEnumvalueList()");
            return new DslList(enumvalueList);
        }

        @NotNull
        public final String getName() {
            String name = this._builder.getName();
            tn.p.j(name, "_builder.getName()");
            return name;
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

        public final /* synthetic */ void plusAssignAllEnumvalue(DslList<EnumValue, EnumvalueProxy> dslList, Iterable<EnumValue> iterable) {
            tn.p.k(dslList, "<this>");
            tn.p.k(iterable, "values");
            addAllEnumvalue(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> iterable) {
            tn.p.k(dslList, "<this>");
            tn.p.k(iterable, "values");
            addAllOptions(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignEnumvalue(DslList<EnumValue, EnumvalueProxy> dslList, EnumValue enumValue) {
            tn.p.k(dslList, "<this>");
            tn.p.k(enumValue, "value");
            addEnumvalue(dslList, enumValue);
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

        public final /* synthetic */ void setEnumvalue(DslList dslList, int i10, EnumValue enumValue) {
            tn.p.k(dslList, "<this>");
            tn.p.k(enumValue, "value");
            this._builder.setEnumvalue(i10, enumValue);
        }

        public final void setName(@NotNull String str) {
            tn.p.k(str, "value");
            this._builder.setName(str);
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

    private EnumKt() {
    }
}
