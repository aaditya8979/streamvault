package com.google.protobuf;

import com.google.protobuf.EnumValue;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EnumValueKt.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumValueKt {

    @NotNull
    public static final EnumValueKt INSTANCE = new EnumValueKt();

    /* JADX INFO: compiled from: EnumValueKt.kt */
    @ProtoDslMarker
    public static final class Dsl {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final EnumValue.Builder _builder;

        /* JADX INFO: compiled from: EnumValueKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(tn.i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(EnumValue.Builder builder) {
                tn.p.k(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        /* JADX INFO: compiled from: EnumValueKt.kt */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        private Dsl(EnumValue.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(EnumValue.Builder builder, tn.i iVar) {
            this(builder);
        }

        public final /* synthetic */ EnumValue _build() {
            EnumValue enumValueBuild = this._builder.build();
            tn.p.j(enumValueBuild, "_builder.build()");
            return enumValueBuild;
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

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearNumber() {
            this._builder.clearNumber();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            tn.p.k(dslList, "<this>");
            this._builder.clearOptions();
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

        public final /* synthetic */ DslList getOptions() {
            List<Option> optionsList = this._builder.getOptionsList();
            tn.p.j(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
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

        public final void setName(@NotNull String str) {
            tn.p.k(str, "value");
            this._builder.setName(str);
        }

        public final void setNumber(int i10) {
            this._builder.setNumber(i10);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i10, Option option) {
            tn.p.k(dslList, "<this>");
            tn.p.k(option, "value");
            this._builder.setOptions(i10, option);
        }
    }

    private EnumValueKt() {
    }
}
