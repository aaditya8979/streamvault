package com.yandex.div.core.expression.variables;

import com.yandex.div.core.view2.errors.ErrorCollectors;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TwoWayVariableBinder.kt */
/* JADX INFO: loaded from: classes4.dex */
public class TwoWayIntegerVariableBinder extends TwoWayVariableBinder<Long> {
    public TwoWayIntegerVariableBinder(@NotNull ErrorCollectors errorCollectors) {
        super(errorCollectors);
    }

    @NotNull
    public String toStringValue(long j10) {
        return String.valueOf(j10);
    }

    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder
    public /* bridge */ /* synthetic */ String toStringValue(Long l10) {
        return toStringValue(l10.longValue());
    }
}
