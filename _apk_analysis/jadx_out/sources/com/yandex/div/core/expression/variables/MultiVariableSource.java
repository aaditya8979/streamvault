package com.yandex.div.core.expression.variables;

import bn.r;
import com.yandex.div.data.Variable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;

/* JADX INFO: compiled from: MultiVariableSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public class MultiVariableSource implements VariableSource {

    @NotNull
    private final DivVariableController variableController;

    @NotNull
    private final l<String, r> variableRequestObserver;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiVariableSource(@NotNull DivVariableController divVariableController, @NotNull l<? super String, r> lVar) {
        this.variableController = divVariableController;
        this.variableRequestObserver = lVar;
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    @Nullable
    public Variable getMutableVariable(@NotNull String str) {
        this.variableRequestObserver.invoke(str);
        return this.variableController.get(str);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void observeDeclaration(@NotNull DeclarationObserver declarationObserver) {
        this.variableController.addDeclarationObserver$div_release(declarationObserver);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void observeVariables(@NotNull l<? super Variable, r> lVar) {
        this.variableController.addVariableObserver$div_release(lVar);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void receiveVariablesUpdates(@NotNull l<? super Variable, r> lVar) {
        this.variableController.receiveVariablesUpdates$div_release(lVar);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void removeDeclarationObserver(@NotNull DeclarationObserver declarationObserver) {
        this.variableController.removeDeclarationObserver$div_release(declarationObserver);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void removeVariablesObserver(@NotNull l<? super Variable, r> lVar) {
        this.variableController.removeVariablesObserver$div_release(lVar);
    }
}
