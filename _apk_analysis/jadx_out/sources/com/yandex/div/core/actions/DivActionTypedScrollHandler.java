package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.items.DivViewWithItemsController;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionScrollBy;
import com.yandex.div2.DivActionScrollDestination;
import com.yandex.div2.DivActionScrollTo;
import com.yandex.div2.DivActionTyped;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivActionTypedScrollHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DivActionTypedScrollHandler implements DivActionTypedHandler {
    private final void handleAction(DivActionScrollBy divActionScrollBy, Div2View div2View, ExpressionResolver expressionResolver) {
        String strEvaluate = divActionScrollBy.f54331b.evaluate(expressionResolver);
        int iLongValue = (int) divActionScrollBy.f54333d.evaluate(expressionResolver).longValue();
        int iLongValue2 = (int) divActionScrollBy.f54332c.evaluate(expressionResolver).longValue();
        String strB = DivActionScrollBy.Overflow.Converter.b(divActionScrollBy.f54334e.evaluate(expressionResolver));
        boolean zBooleanValue = divActionScrollBy.f54330a.evaluate(expressionResolver).booleanValue();
        DivViewWithItemsController divViewWithItemsControllerCreate$default = DivViewWithItemsController.Companion.create$default(DivViewWithItemsController.Companion, strEvaluate, div2View, expressionResolver, null, 8, null);
        if (divViewWithItemsControllerCreate$default == null) {
            return;
        }
        divViewWithItemsControllerCreate$default.changeCurrentItemByStep(strB, iLongValue2, zBooleanValue);
        divViewWithItemsControllerCreate$default.scrollByOffset(strB, iLongValue, zBooleanValue);
    }

    private final void handleAction(DivActionScrollTo divActionScrollTo, Div2View div2View, ExpressionResolver expressionResolver) {
        String strEvaluate = divActionScrollTo.f54375c.evaluate(expressionResolver);
        boolean zBooleanValue = divActionScrollTo.f54373a.evaluate(expressionResolver).booleanValue();
        DivViewWithItemsController divViewWithItemsControllerCreate$default = DivViewWithItemsController.Companion.create$default(DivViewWithItemsController.Companion, strEvaluate, div2View, expressionResolver, null, 8, null);
        if (divViewWithItemsControllerCreate$default == null) {
            return;
        }
        DivActionScrollDestination divActionScrollDestination = divActionScrollTo.f54374b;
        if (divActionScrollDestination instanceof DivActionScrollDestination.d) {
            divViewWithItemsControllerCreate$default.scrollTo((int) ((DivActionScrollDestination.d) divActionScrollDestination).c().f58630a.evaluate(expressionResolver).longValue(), zBooleanValue);
            return;
        }
        if (divActionScrollDestination instanceof DivActionScrollDestination.c) {
            divViewWithItemsControllerCreate$default.setCurrentItem((int) ((DivActionScrollDestination.c) divActionScrollDestination).c().f58286a.evaluate(expressionResolver).longValue(), zBooleanValue);
        } else if (divActionScrollDestination instanceof DivActionScrollDestination.b) {
            divViewWithItemsControllerCreate$default.scrollToEnd(zBooleanValue);
        } else if (divActionScrollDestination instanceof DivActionScrollDestination.e) {
            divViewWithItemsControllerCreate$default.scrollToStart(zBooleanValue);
        }
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull DivActionTyped divActionTyped, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver) {
        if (divActionTyped instanceof DivActionTyped.m) {
            handleAction(((DivActionTyped.m) divActionTyped).c(), div2View, expressionResolver);
            return true;
        }
        if (!(divActionTyped instanceof DivActionTyped.n)) {
            return false;
        }
        handleAction(((DivActionTyped.n) divActionTyped).c(), div2View, expressionResolver);
        return true;
    }
}
