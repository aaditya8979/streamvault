package com.yandex.div.core.expression.local;

import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.json.expressions.ExpressionResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class UtilsKt {
    @Nullable
    public static final ExpressionResolverImpl getAsImpl(@NotNull ExpressionResolver expressionResolver) {
        if (expressionResolver instanceof ExpressionResolverImpl) {
            return (ExpressionResolverImpl) expressionResolver;
        }
        return null;
    }

    @Nullable
    public static final VariableController getVariableController(@NotNull ExpressionResolver expressionResolver) {
        ExpressionResolverImpl asImpl = getAsImpl(expressionResolver);
        if (asImpl != null) {
            return asImpl.getVariableController();
        }
        return null;
    }
}
