package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionTyped;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivActionTypedHandler.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface DivActionTypedHandler {
    boolean handleAction(@Nullable String str, @NotNull DivActionTyped divActionTyped, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver);
}
