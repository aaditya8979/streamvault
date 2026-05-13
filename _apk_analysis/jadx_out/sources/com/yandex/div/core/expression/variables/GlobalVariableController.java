package com.yandex.div.core.expression.variables;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GlobalVariableController.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class GlobalVariableController {

    @NotNull
    private final DivVariableController delegate;

    public GlobalVariableController(@NotNull DivVariableController divVariableController) {
        this.delegate = divVariableController;
    }
}
