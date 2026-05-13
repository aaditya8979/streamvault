package com.yandex.div.core.animation;

import com.yandex.div.data.Variable;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: VariableProperties.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class IntegerValueProperty extends IntegerProperty<Variable.IntegerVariable> {

    @NotNull
    public static final IntegerValueProperty INSTANCE = new IntegerValueProperty();

    private IntegerValueProperty() {
        super("value");
    }

    @Override // android.util.Property
    @NotNull
    public Integer get(@NotNull Variable.IntegerVariable integerVariable) {
        Object value = integerVariable.getValue();
        p.i(value, "null cannot be cast to non-null type kotlin.Long");
        return Integer.valueOf((int) ((Long) value).longValue());
    }

    @Override // com.yandex.div.core.animation.IntegerProperty
    public void setValue(@NotNull Variable.IntegerVariable integerVariable, int i10) {
        integerVariable.setValueDirectly(Long.valueOf(i10));
    }
}
