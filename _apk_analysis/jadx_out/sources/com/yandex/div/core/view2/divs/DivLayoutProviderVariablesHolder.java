package com.yandex.div.core.view2.divs;

import ah.e2;
import bn.r;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.core.DivTreeVisitor;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivData;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivSize;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import sn.l;

/* JADX INFO: compiled from: DivLayoutProviderVariablesHolder.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivLayoutProviderVariablesHolder extends DivTreeVisitor<r> implements ExpressionSubscriber {

    @NotNull
    private final List<String> changedVariables;

    @NotNull
    private final List<Disposable> subscriptions;

    /* JADX WARN: Multi-variable type inference failed */
    public DivLayoutProviderVariablesHolder() {
        super(null, 1, 0 == true ? 1 : 0);
        this.changedVariables = new ArrayList();
        this.subscriptions = new ArrayList();
    }

    private final void observe(DivSize divSize, final ExpressionResolver expressionResolver) {
        Object objB = divSize.b();
        DivFixedSize divFixedSize = objB instanceof DivFixedSize ? (DivFixedSize) objB : null;
        if (divFixedSize == null) {
            return;
        }
        Expression<Long> expression = divFixedSize.f55333b;
        final Expression.MutableExpression mutableExpression = expression instanceof Expression.MutableExpression ? (Expression.MutableExpression) expression : null;
        if (mutableExpression == null) {
            return;
        }
        addSubscription(mutableExpression.observe(expressionResolver, new l<Long, r>() { // from class: com.yandex.div.core.view2.divs.DivLayoutProviderVariablesHolder.observe.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Long l10) {
                invoke(l10.longValue());
                return r.f5635a;
            }

            public final void invoke(long j10) {
                DivLayoutProviderVariablesHolder.this.changedVariables.addAll(mutableExpression.getVariablesName(expressionResolver));
            }
        }));
    }

    private final void observeSize(e2 e2Var, ExpressionResolver expressionResolver) {
        observe(e2Var.getWidth(), expressionResolver);
        observe(e2Var.getHeight(), expressionResolver);
    }

    public final void clear() {
        this.changedVariables.clear();
    }

    public final boolean contains(@NotNull String str) {
        return this.changedVariables.contains(str);
    }

    @Override // com.yandex.div.internal.core.DivTreeVisitor
    public /* bridge */ /* synthetic */ r defaultVisit(Div div, BindingContext bindingContext, DivStatePath divStatePath) {
        defaultVisit2(div, bindingContext, divStatePath);
        return r.f5635a;
    }

    /* JADX INFO: renamed from: defaultVisit, reason: avoid collision after fix types in other method */
    public void defaultVisit2(@NotNull Div div, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath) {
        observeSize(div.b(), bindingContext.getExpressionResolver());
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    public final void observeDivData(@NotNull DivData divData, @NotNull BindingContext bindingContext) {
        for (DivData.State state : divData.f55082c) {
            visit(state.f55091a, bindingContext, DivStatePath.Companion.fromState$div_release(state));
        }
    }
}
