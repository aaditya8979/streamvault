package com.yandex.div.internal.template;

import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Field.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class Field<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public final boolean overridable;
    public final int type;

    /* JADX INFO: compiled from: Field.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final <T> Field<T> nullField(boolean z10) {
            Field<T> field = z10 ? Placeholder.INSTANCE : Null.INSTANCE;
            p.i(field, "null cannot be cast to non-null type com.yandex.div.internal.template.Field<T of com.yandex.div.internal.template.Field.Companion.nullField>");
            return field;
        }
    }

    /* JADX INFO: compiled from: Field.kt */
    public static final class Null extends Field<Object> {

        @NotNull
        public static final Null INSTANCE = new Null();

        /* JADX WARN: Multi-variable type inference failed */
        private Null() {
            super(0, 0 == true ? 1 : 0, null);
        }
    }

    /* JADX INFO: compiled from: Field.kt */
    public static final class Placeholder extends Field<Object> {

        @NotNull
        public static final Placeholder INSTANCE = new Placeholder();

        private Placeholder() {
            super(1, 1 == true ? 1 : 0, null);
        }
    }

    /* JADX INFO: compiled from: Field.kt */
    public static final class Reference<T> extends Field<T> {

        @NotNull
        public final String reference;

        public Reference(boolean z10, @NotNull String str) {
            super(3, z10, null);
            this.reference = str;
        }
    }

    /* JADX INFO: compiled from: Field.kt */
    public static final class Value<T> extends Field<T> {
        public final T value;

        public Value(boolean z10, T t10) {
            super(2, z10, null);
            this.value = t10;
        }
    }

    private Field(int i10, boolean z10) {
        this.type = i10;
        this.overridable = z10;
    }

    public /* synthetic */ Field(int i10, boolean z10, i iVar) {
        this(i10, z10);
    }
}
