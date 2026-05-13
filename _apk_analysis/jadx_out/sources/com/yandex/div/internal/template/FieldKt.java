package com.yandex.div.internal.template;

import com.yandex.div.internal.template.Field;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: Field.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class FieldKt {
    @NotNull
    public static final <T> Field<T> clone(@Nullable Field<T> field, boolean z10) {
        if (field == null || p.f(field, Field.Null.INSTANCE) || p.f(field, Field.Placeholder.INSTANCE)) {
            return Field.Companion.nullField(z10);
        }
        if (field instanceof Field.Value) {
            return new Field.Value(z10, ((Field.Value) field).value);
        }
        if (field instanceof Field.Reference) {
            return new Field.Reference(z10, ((Field.Reference) field).reference);
        }
        throw new IllegalStateException("Unknown field type");
    }
}
