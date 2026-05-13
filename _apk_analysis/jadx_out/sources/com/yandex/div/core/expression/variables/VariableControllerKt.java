package com.yandex.div.core.expression.variables;

import android.net.Uri;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.VariableDeclarationException;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivVariable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VariableController.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class VariableControllerKt {
    public static final void declare(@NotNull VariableController variableController, @NotNull DivVariable divVariable, @NotNull ExpressionResolver expressionResolver, @NotNull ErrorCollector errorCollector) {
        try {
            variableController.declare(DivVariablesParserKt.toVariable(divVariable, expressionResolver));
        } catch (VariableDeclarationException e10) {
            errorCollector.logError(e10);
        }
    }

    @Nullable
    public static final Object wrapVariableValue(@Nullable Object obj) {
        return obj instanceof Uri ? Url.m7455boximpl(Url.m7456constructorimpl(obj.toString())) : obj;
    }
}
