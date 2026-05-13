package com.yandex.div.core.actions;

import android.view.View;
import cn.f0;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.ViewLocator;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionTyped;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivAnimatorTypedActionHandler.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivAnimatorTypedActionHandler implements DivActionTypedHandler {
    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull DivActionTyped divActionTyped, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver) {
        if (!(divActionTyped instanceof DivActionTyped.a)) {
            if (!(divActionTyped instanceof DivActionTyped.b)) {
                return false;
            }
            if (str == null) {
                return true;
            }
            div2View.getViewComponent$div_release().getAnimatorController().stopAnimator(str, ((DivActionTyped.b) divActionTyped).c().f54225a);
            return true;
        }
        if (str == null) {
            return true;
        }
        List<View> listFindViewsWithTag = ViewLocator.findViewsWithTag(div2View, str);
        if (listFindViewsWithTag.size() != 1) {
            return true;
        }
        div2View.getViewComponent$div_release().getAnimatorController().startAnimator(str, (View) f0.t0(listFindViewsWithTag), ((DivActionTyped.a) divActionTyped).c(), expressionResolver);
        return true;
    }
}
