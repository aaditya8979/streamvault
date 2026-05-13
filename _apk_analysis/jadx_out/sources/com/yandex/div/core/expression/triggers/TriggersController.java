package com.yandex.div.core.expression.triggers;

import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivTrigger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: TriggersController.kt */
/* JADX INFO: loaded from: classes6.dex */
public class TriggersController {

    @Nullable
    private List<DivTrigger> activeTriggers;

    @Nullable
    private DivViewFacade currentView;

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final ErrorCollector errorCollector;

    @NotNull
    private final Map<List<DivTrigger>, List<TriggerExecutor>> executors = new LinkedHashMap();

    @NotNull
    private final ExpressionResolverImpl expressionResolver;

    @NotNull
    private final Div2Logger logger;

    public TriggersController(@NotNull ExpressionResolverImpl expressionResolverImpl, @NotNull ErrorCollector errorCollector, @NotNull Div2Logger div2Logger, @NotNull DivActionBinder divActionBinder) {
        this.expressionResolver = expressionResolverImpl;
        this.errorCollector = errorCollector;
        this.logger = div2Logger;
        this.divActionBinder = divActionBinder;
    }

    private Throwable findErrors(List<String> list) {
        if (list.isEmpty()) {
            return new RuntimeException("No variables defined!");
        }
        return null;
    }

    public void clearBinding(@Nullable DivViewFacade divViewFacade) {
        this.currentView = null;
        Iterator<Map.Entry<List<DivTrigger>, List<TriggerExecutor>>> it = this.executors.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                ((TriggerExecutor) it2.next()).onDetach(divViewFacade);
            }
        }
    }

    public void ensureTriggersSynced(@NotNull List<DivTrigger> list) {
        if (this.activeTriggers == list) {
            return;
        }
        this.activeTriggers = list;
        DivViewFacade divViewFacade = this.currentView;
        Map<List<DivTrigger>, List<TriggerExecutor>> map = this.executors;
        List<TriggerExecutor> arrayList = map.get(list);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(list, arrayList);
        }
        List<TriggerExecutor> list2 = arrayList;
        if (divViewFacade != null) {
            clearBinding(divViewFacade);
        }
        for (DivTrigger divTrigger : list) {
            Expression<Boolean> expression = divTrigger.f58061b;
            Expression.MutableExpression mutableExpression = expression instanceof Expression.MutableExpression ? (Expression.MutableExpression) expression : null;
            if (mutableExpression == null) {
                this.errorCollector.logError(new IllegalStateException("Invalid condition: '" + divTrigger.f58061b + '\'', new RuntimeException("Condition is not mutable!")));
            } else {
                Throwable thFindErrors = findErrors(mutableExpression.getVariablesName(this.expressionResolver));
                if (thFindErrors != null) {
                    this.errorCollector.logError(new IllegalStateException("Invalid condition: '" + divTrigger.f58061b + '\'', thFindErrors));
                } else {
                    list2.add(new TriggerExecutor(mutableExpression, divTrigger.f58060a, divTrigger.f58062c, this.expressionResolver, this.errorCollector, this.logger, this.divActionBinder));
                }
            }
        }
        if (divViewFacade != null) {
            onAttachedToWindow(divViewFacade);
        }
    }

    public void onAttachedToWindow(@NotNull DivViewFacade divViewFacade) {
        List<TriggerExecutor> list;
        if (p.f(this.currentView, divViewFacade)) {
            return;
        }
        this.currentView = divViewFacade;
        List<DivTrigger> list2 = this.activeTriggers;
        if (list2 == null || (list = this.executors.get(list2)) == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((TriggerExecutor) it.next()).onAttach(divViewFacade);
        }
    }

    public void onDetachedFromWindow(@NotNull DivViewFacade divViewFacade) {
        if (p.f(this.currentView, divViewFacade)) {
            this.currentView = null;
        }
        Iterator<Map.Entry<List<DivTrigger>, List<TriggerExecutor>>> it = this.executors.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                ((TriggerExecutor) it2.next()).onDetach(divViewFacade);
            }
        }
    }
}
