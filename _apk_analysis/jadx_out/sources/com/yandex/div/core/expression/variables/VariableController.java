package com.yandex.div.core.expression.variables;

import bn.r;
import cn.w;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.VariableProvider;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;

/* JADX INFO: compiled from: VariableController.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface VariableController extends VariableProvider {
    static /* synthetic */ Disposable subscribeToVariablesChange$default(VariableController variableController, List list, boolean z10, l lVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeToVariablesChange");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return variableController.subscribeToVariablesChange(list, z10, lVar);
    }

    @NotNull
    default List<Variable> captureAll() {
        return w.m();
    }

    void cleanupSubscriptions();

    void declare(@NotNull Variable variable);

    @Nullable
    Variable getMutableVariable(@NotNull String str);

    void restoreSubscriptions();

    void setOnAnyVariableChangeCallback(@NotNull ExpressionResolver expressionResolver, @NotNull l<? super Variable, r> lVar);

    @NotNull
    Disposable subscribeToVariableChange(@NotNull String str, @Nullable ErrorCollector errorCollector, boolean z10, @NotNull l<? super Variable, r> lVar);

    @NotNull
    Disposable subscribeToVariablesChange(@NotNull List<String> list, boolean z10, @NotNull l<? super Variable, r> lVar);

    @NotNull
    Disposable subscribeToVariablesUndeclared(@NotNull List<String> list, @NotNull l<? super Variable, r> lVar);
}
