package com.yandex.div.core.view2;

import com.yandex.div.json.expressions.ExpressionResolver;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: BindingContext.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class BindingContext {

    @NotNull
    private final Div2View divView;

    @NotNull
    private final ExpressionResolver expressionResolver;

    public BindingContext(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver) {
        this.divView = div2View;
        this.expressionResolver = expressionResolver;
    }

    @NotNull
    public final Div2View getDivView() {
        return this.divView;
    }

    @NotNull
    public final ExpressionResolver getExpressionResolver() {
        return this.expressionResolver;
    }

    @NotNull
    public final BindingContext getFor(@NotNull ExpressionResolver expressionResolver) {
        return p.f(this.expressionResolver, expressionResolver) ? this : new BindingContext(this.divView, expressionResolver);
    }
}
