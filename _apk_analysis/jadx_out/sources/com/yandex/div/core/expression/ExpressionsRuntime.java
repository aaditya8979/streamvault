package com.yandex.div.core.expression;

import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.expression.triggers.TriggersController;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExpressionsRuntime.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ExpressionsRuntime {

    @NotNull
    private final ExpressionResolverImpl expressionResolver;

    @Nullable
    private final TriggersController triggersController;
    private boolean unsubscribed = true;

    public ExpressionsRuntime(@NotNull ExpressionResolverImpl expressionResolverImpl, @Nullable TriggersController triggersController) {
        this.expressionResolver = expressionResolverImpl;
        this.triggersController = triggersController;
    }

    public final void cleanup$div_release(@Nullable DivViewFacade divViewFacade) {
        if (this.unsubscribed) {
            return;
        }
        this.unsubscribed = true;
        TriggersController triggersController = this.triggersController;
        if (triggersController != null) {
            triggersController.clearBinding(divViewFacade);
        }
        this.expressionResolver.getVariableController().cleanupSubscriptions();
    }

    public final void clearBinding(@NotNull DivViewFacade divViewFacade) {
        TriggersController triggersController = this.triggersController;
        if (triggersController != null) {
            triggersController.clearBinding(divViewFacade);
        }
    }

    @NotNull
    public final ExpressionResolverImpl getExpressionResolver() {
        return this.expressionResolver;
    }

    @Nullable
    public final TriggersController getTriggersController() {
        return this.triggersController;
    }

    public final void onAttachedToWindow(@NotNull DivViewFacade divViewFacade) {
        TriggersController triggersController = this.triggersController;
        if (triggersController != null) {
            triggersController.onAttachedToWindow(divViewFacade);
        }
    }

    public final void onDetachedFromWindow(@NotNull DivViewFacade divViewFacade) {
        TriggersController triggersController = this.triggersController;
        if (triggersController != null) {
            triggersController.onDetachedFromWindow(divViewFacade);
        }
    }

    public final void updateSubscriptions() {
        if (this.unsubscribed) {
            this.unsubscribed = false;
            this.expressionResolver.subscribeOnVariables$div_release();
        }
    }
}
