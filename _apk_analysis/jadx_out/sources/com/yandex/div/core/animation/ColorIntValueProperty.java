package com.yandex.div.core.animation;

import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.types.Color;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: VariableProperties.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ColorIntValueProperty extends IntegerProperty<Variable.ColorVariable> {

    @NotNull
    public static final ColorIntValueProperty INSTANCE = new ColorIntValueProperty();

    private ColorIntValueProperty() {
        super("value");
    }

    @Override // android.util.Property
    @NotNull
    public Integer get(@NotNull Variable.ColorVariable colorVariable) {
        Object value = colorVariable.getValue();
        p.i(value, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Color");
        return Integer.valueOf(((Color) value).m7452unboximpl());
    }

    @Override // com.yandex.div.core.animation.IntegerProperty
    public void setValue(@NotNull Variable.ColorVariable colorVariable, int i10) {
        colorVariable.setValueDirectly(Color.m7444boximpl(Color.m7445constructorimpl(i10)));
    }
}
