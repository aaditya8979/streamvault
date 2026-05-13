package com.yandex.div.core.expression.variables;

import bn.r;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;

/* JADX INFO: compiled from: VariableAndConstantController.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class VariableAndConstantController implements VariableController {

    @NotNull
    private final ConstantsProvider constants;

    @NotNull
    private final VariableController delegate;

    public VariableAndConstantController(@NotNull VariableController variableController, @NotNull ConstantsProvider constantsProvider) {
        this.delegate = variableController;
        this.constants = constantsProvider;
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void cleanupSubscriptions() {
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void declare(@NotNull Variable variable) {
        this.delegate.declare(variable);
    }

    @Override // com.yandex.div.evaluable.VariableProvider
    @Nullable
    public Object get(@NotNull String str) {
        Object objWrapVariableValue = VariableControllerKt.wrapVariableValue(this.constants.get(str));
        return objWrapVariableValue == null ? this.delegate.get(str) : objWrapVariableValue;
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @Nullable
    public Variable getMutableVariable(@NotNull String str) {
        return this.delegate.getMutableVariable(str);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void restoreSubscriptions() {
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void setOnAnyVariableChangeCallback(@NotNull ExpressionResolver expressionResolver, @NotNull l<? super Variable, r> lVar) {
        this.delegate.setOnAnyVariableChangeCallback(expressionResolver, lVar);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariableChange(@NotNull String str, @Nullable ErrorCollector errorCollector, boolean z10, @NotNull l<? super Variable, r> lVar) {
        return this.delegate.subscribeToVariableChange(str, errorCollector, z10, lVar);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariablesChange(@NotNull List<String> list, boolean z10, @NotNull l<? super Variable, r> lVar) {
        return this.delegate.subscribeToVariablesChange(list, z10, lVar);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariablesUndeclared(@NotNull List<String> list, @NotNull l<? super Variable, r> lVar) {
        return Disposable.NULL;
    }
}
