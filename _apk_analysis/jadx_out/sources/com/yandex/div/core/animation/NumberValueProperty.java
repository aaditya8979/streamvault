package com.yandex.div.core.animation;

import android.util.Log;
import com.yandex.div.data.Variable;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: VariableProperties.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class NumberValueProperty extends FloatProperty<Variable.DoubleVariable> {

    @NotNull
    public static final NumberValueProperty INSTANCE = new NumberValueProperty();

    private NumberValueProperty() {
        super("value");
    }

    @Override // android.util.Property
    @NotNull
    public Float get(@NotNull Variable.DoubleVariable doubleVariable) {
        Object value = doubleVariable.getValue();
        p.i(value, "null cannot be cast to non-null type kotlin.Double");
        return Float.valueOf((float) ((Double) value).doubleValue());
    }

    @Override // com.yandex.div.core.animation.FloatProperty
    public void setValue(@NotNull Variable.DoubleVariable doubleVariable, float f10) {
        Log.i("NumberValueProperty", "set variable value: " + f10);
        doubleVariable.setValueDirectly(Double.valueOf((double) f10));
    }
}
