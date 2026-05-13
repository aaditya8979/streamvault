package com.yandex.div.core.expression.variables;

import bn.r;
import com.yandex.div.data.Variable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;

/* JADX INFO: compiled from: VariableSource.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface VariableSource {
    @Nullable
    Variable getMutableVariable(@NotNull String str);

    void observeDeclaration(@NotNull DeclarationObserver declarationObserver);

    void observeVariables(@NotNull l<? super Variable, r> lVar);

    void receiveVariablesUpdates(@NotNull l<? super Variable, r> lVar);

    void removeDeclarationObserver(@NotNull DeclarationObserver declarationObserver);

    void removeVariablesObserver(@NotNull l<? super Variable, r> lVar);
}
