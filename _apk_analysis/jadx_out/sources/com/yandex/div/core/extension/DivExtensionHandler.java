package com.yandex.div.core.extension;

import ah.e2;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivExtensionHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface DivExtensionHandler {
    default void beforeBindView(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull e2 e2Var) {
    }

    void bindView(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull e2 e2Var);

    boolean matches(@NotNull e2 e2Var);

    default void preprocess(@NotNull e2 e2Var, @NotNull ExpressionResolver expressionResolver) {
    }

    void unbindView(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull e2 e2Var);
}
