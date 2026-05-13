package com.yandex.div.core.view2;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CompositeLogId.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CompositeLogIdKt {
    @NotNull
    public static final CompositeLogId compositeLogIdOf(@NotNull Div2View div2View, @NotNull String str) {
        return new CompositeLogId(div2View.getDataTag().getId(), div2View.getLogId(), str);
    }
}
