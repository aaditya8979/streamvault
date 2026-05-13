package com.yandex.div.core.util.inputfilter;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ExpressionInputFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class ExpressionInputFilter implements BaseInputFilter {

    @NotNull
    private final Expression<Boolean> condition;

    @NotNull
    private final ExpressionResolver resolver;

    public ExpressionInputFilter(@NotNull Expression<Boolean> expression, @NotNull ExpressionResolver expressionResolver) {
        this.condition = expression;
        this.resolver = expressionResolver;
    }

    @Override // com.yandex.div.core.util.inputfilter.BaseInputFilter
    public boolean checkValue(@NotNull String str) {
        return this.condition.evaluate(this.resolver).booleanValue();
    }
}
