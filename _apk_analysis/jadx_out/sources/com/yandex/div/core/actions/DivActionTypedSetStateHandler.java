package com.yandex.div.core.actions;

import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.PathFormatException;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionSetState;
import com.yandex.div2.DivActionTyped;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivActionTypedSetStateHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivActionTypedSetStateHandler implements DivActionTypedHandler {
    private final void handleSetState(DivActionSetState divActionSetState, Div2View div2View, ExpressionResolver expressionResolver) {
        String strEvaluate = divActionSetState.f54386a.evaluate(expressionResolver);
        try {
            div2View.switchToState(DivStatePath.Companion.parse(strEvaluate), divActionSetState.f54387b.evaluate(expressionResolver).booleanValue());
        } catch (PathFormatException e10) {
            DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Invalid format of " + strEvaluate, e10));
        }
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull DivActionTyped divActionTyped, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver) {
        if (!(divActionTyped instanceof DivActionTyped.o)) {
            return false;
        }
        handleSetState(((DivActionTyped.o) divActionTyped).c(), div2View, expressionResolver);
        return true;
    }
}
