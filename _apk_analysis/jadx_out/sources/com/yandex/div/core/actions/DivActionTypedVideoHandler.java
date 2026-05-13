package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionTyped;
import com.yandex.div2.DivActionVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivActionTypedVideoHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivActionTypedVideoHandler implements DivActionTypedHandler {
    private final void handleVideoAction(DivActionVideo divActionVideo, Div2View div2View, ExpressionResolver expressionResolver) {
        div2View.applyVideoCommand(divActionVideo.f54560b.evaluate(expressionResolver), DivActionVideo.Action.Converter.b(divActionVideo.f54559a.evaluate(expressionResolver)), expressionResolver);
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull DivActionTyped divActionTyped, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver) {
        if (!(divActionTyped instanceof DivActionTyped.v)) {
            return false;
        }
        handleVideoAction(((DivActionTyped.v) divActionTyped).c(), div2View, expressionResolver);
        return true;
    }
}
