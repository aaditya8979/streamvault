package com.yandex.div.internal.core;

import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div2.Div;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivTreeVisitor.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivTreeVisitorKt {
    @NotNull
    public static final BindingContext getChildContext(@NotNull BindingContext bindingContext, @NotNull Div div, @NotNull DivStatePath divStatePath) {
        return bindingContext.getFor(bindingContext.getDivView().getRuntimeStore$div_release().getOrCreateRuntime(divStatePath, div, bindingContext.getExpressionResolver()).getExpressionResolver());
    }
}
