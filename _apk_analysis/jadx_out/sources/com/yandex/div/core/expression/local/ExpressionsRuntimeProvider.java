package com.yandex.div.core.expression.local;

import ah.e2;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.FunctionProviderDecorator;
import com.yandex.div.core.expression.local.ExpressionsRuntimeProvider;
import com.yandex.div.core.expression.storedvalues.StoredValuesController;
import com.yandex.div.core.expression.triggers.TriggersController;
import com.yandex.div.core.expression.variables.DivVariableController;
import com.yandex.div.core.expression.variables.VariableControllerImpl;
import com.yandex.div.core.expression.variables.VariableControllerKt;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.FunctionMapperKt;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.StoredValue;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.FunctionProvider;
import com.yandex.div.evaluable.StoredValueProvider;
import com.yandex.div.evaluable.WarningSender;
import com.yandex.div.evaluable.function.GeneratedBuiltinFunctionProvider;
import com.yandex.div2.DivData;
import com.yandex.div2.DivFunction;
import com.yandex.div2.DivTrigger;
import com.yandex.div2.DivVariable;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ExpressionsRuntimeProvider.kt */
/* JADX INFO: loaded from: classes7.dex */
public class ExpressionsRuntimeProvider {

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final DivVariableController divVariableController;

    @NotNull
    private final Div2Logger logger;

    @NotNull
    private final StoredValuesController storedValuesController;

    public ExpressionsRuntimeProvider(@NotNull DivVariableController divVariableController, @NotNull DivActionBinder divActionBinder, @NotNull Div2Logger div2Logger, @NotNull StoredValuesController storedValuesController) {
        this.divVariableController = divVariableController;
        this.divActionBinder = divActionBinder;
        this.logger = div2Logger;
        this.storedValuesController = storedValuesController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object createRootRuntime$lambda$0(ExpressionsRuntimeProvider expressionsRuntimeProvider, ErrorCollector errorCollector, String str) {
        StoredValue storedValue = expressionsRuntimeProvider.storedValuesController.getStoredValue(str, errorCollector);
        if (storedValue != null) {
            return storedValue.getValue();
        }
        return null;
    }

    private TriggersController toTriggersController(List<DivTrigger> list, ExpressionResolverImpl expressionResolverImpl, ErrorCollector errorCollector) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        TriggersController triggersController = new TriggersController(expressionResolverImpl, errorCollector, this.logger, this.divActionBinder);
        triggersController.ensureTriggersSynced(list);
        return triggersController;
    }

    @NotNull
    public ExpressionsRuntime createChildRuntime(@NotNull DivStatePath divStatePath, @NotNull e2 e2Var, @NotNull ExpressionResolverImpl expressionResolverImpl, @NotNull ErrorCollector errorCollector) {
        VariableControllerImpl variableControllerImpl = new VariableControllerImpl(expressionResolverImpl.getVariableController());
        List<DivFunction> listU = e2Var.u();
        FunctionProvider functionProvider = expressionResolverImpl.getEvaluator().getEvaluationContext().getFunctionProvider();
        p.i(functionProvider, "null cannot be cast to non-null type com.yandex.div.core.expression.FunctionProviderDecorator");
        FunctionProviderDecorator functionProviderDecoratorPlus = (FunctionProviderDecorator) functionProvider;
        if (!(listU == null || listU.isEmpty())) {
            functionProviderDecoratorPlus = functionProviderDecoratorPlus.plus(FunctionMapperKt.toLocalFunctions(listU));
        }
        ExpressionResolverImpl expressionResolverImpl2 = new ExpressionResolverImpl(expressionResolverImpl.getPath() + '/' + divStatePath.getLastDivId$div_release(), expressionResolverImpl.getRuntimeStore(), variableControllerImpl, new Evaluator(new EvaluationContext(variableControllerImpl, expressionResolverImpl.getEvaluator().getEvaluationContext().getStoredValueProvider(), functionProviderDecoratorPlus, expressionResolverImpl.getEvaluator().getEvaluationContext().getWarningSender())), errorCollector, null, 32, null);
        List<DivVariable> listC = e2Var.c();
        if (listC != null) {
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                VariableControllerKt.declare(variableControllerImpl, (DivVariable) it.next(), expressionResolverImpl2, errorCollector);
            }
        }
        return new ExpressionsRuntime(expressionResolverImpl2, toTriggersController(e2Var.s(), expressionResolverImpl2, errorCollector));
    }

    @NotNull
    public ExpressionsRuntime createRootRuntime(@NotNull DivData divData, @NotNull final ErrorCollector errorCollector, @NotNull RuntimeStore runtimeStore) {
        boolean z10 = true;
        VariableControllerImpl variableControllerImpl = new VariableControllerImpl(null, 1, null);
        variableControllerImpl.addSource(this.divVariableController.getVariableSource$div_release());
        StoredValueProvider storedValueProvider = new StoredValueProvider() { // from class: dg.a
            @Override // com.yandex.div.evaluable.StoredValueProvider
            public final Object get(String str) {
                return ExpressionsRuntimeProvider.createRootRuntime$lambda$0(this.f59775a, errorCollector, str);
            }
        };
        FunctionProviderDecorator functionProviderDecorator = new FunctionProviderDecorator(GeneratedBuiltinFunctionProvider.INSTANCE);
        List<DivFunction> list = divData.f55080a;
        if (list != null && !list.isEmpty()) {
            z10 = false;
        }
        if (!z10) {
            functionProviderDecorator = functionProviderDecorator.plus(FunctionMapperKt.toLocalFunctions(list));
        }
        ExpressionResolverImpl expressionResolverImpl = new ExpressionResolverImpl("", runtimeStore, variableControllerImpl, new Evaluator(new EvaluationContext(variableControllerImpl, storedValueProvider, functionProviderDecorator, new WarningSender() { // from class: com.yandex.div.core.expression.local.ExpressionsRuntimeProvider$createRootRuntime$warningSender$1
            @Override // com.yandex.div.evaluable.WarningSender
            /* JADX INFO: renamed from: send-BIH1yYw, reason: not valid java name */
            public final void mo7373sendBIH1yYw(@NotNull Evaluable evaluable, @NotNull String str) {
                errorCollector.logWarning(new Throwable("Warning occurred while evaluating '" + evaluable.getRawExpr() + "':", new Throwable(str)));
            }
        })), errorCollector, null, 32, null);
        List<DivVariable> list2 = divData.f55086g;
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                VariableControllerKt.declare(variableControllerImpl, (DivVariable) it.next(), expressionResolverImpl, errorCollector);
            }
        }
        return new ExpressionsRuntime(expressionResolverImpl, toTriggersController(divData.f55085f, expressionResolverImpl, errorCollector));
    }
}
