package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionHideTooltip;
import com.yandex.div2.DivActionTyped;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivActionTypedHideTooltipHandler.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivActionTypedHideTooltipHandler implements DivActionTypedHandler {
    private final void handleHideTooltip(DivActionHideTooltip divActionHideTooltip, Div2View div2View, ExpressionResolver expressionResolver) {
        div2View.hideTooltip(divActionHideTooltip.f54313a.evaluate(expressionResolver));
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull DivActionTyped divActionTyped, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver) {
        if (!(divActionTyped instanceof DivActionTyped.l)) {
            return false;
        }
        handleHideTooltip(((DivActionTyped.l) divActionTyped).c(), div2View, expressionResolver);
        return true;
    }
}
