package com.yandex.div.core.expression.variables;

import com.yandex.div.core.view2.errors.ErrorCollectors;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TwoWayVariableBinder.kt */
/* JADX INFO: loaded from: classes11.dex */
public class TwoWayStringVariableBinder extends TwoWayVariableBinder<String> {
    public TwoWayStringVariableBinder(@NotNull ErrorCollectors errorCollectors) {
        super(errorCollectors);
    }

    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder
    @NotNull
    public String toStringValue(@NotNull String str) {
        return str;
    }
}
