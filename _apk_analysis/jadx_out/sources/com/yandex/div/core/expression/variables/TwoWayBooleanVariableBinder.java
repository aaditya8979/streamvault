package com.yandex.div.core.expression.variables;

import com.yandex.div.core.view2.errors.ErrorCollectors;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TwoWayVariableBinder.kt */
/* JADX INFO: loaded from: classes4.dex */
public class TwoWayBooleanVariableBinder extends TwoWayVariableBinder<Boolean> {
    public TwoWayBooleanVariableBinder(@NotNull ErrorCollectors errorCollectors) {
        super(errorCollectors);
    }

    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder
    public /* bridge */ /* synthetic */ String toStringValue(Boolean bool) {
        return toStringValue(bool.booleanValue());
    }

    @NotNull
    public String toStringValue(boolean z10) {
        return String.valueOf(z10);
    }
}
