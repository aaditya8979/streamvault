package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionTyped;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivActionTypedClearFocusHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivActionTypedClearFocusHandler implements DivActionTypedHandler {
    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull DivActionTyped divActionTyped, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver) {
        if (!(divActionTyped instanceof DivActionTyped.f)) {
            return false;
        }
        div2View.clearFocus();
        DivActionTypedUtilsKt.closeKeyboard(div2View);
        return true;
    }
}
