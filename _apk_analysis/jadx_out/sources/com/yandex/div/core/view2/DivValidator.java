package com.yandex.div.core.view2;

import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivValidator.kt */
/* JADX INFO: loaded from: classes2.dex */
public class DivValidator extends DivVisitor<Boolean> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.core.DivVisitor
    @NotNull
    public Boolean defaultVisit(@NotNull Div div, @NotNull ExpressionResolver expressionResolver) {
        return Boolean.TRUE;
    }

    public boolean validate(@NotNull Div div, @NotNull ExpressionResolver expressionResolver) {
        return visit(div, expressionResolver).booleanValue();
    }
}
