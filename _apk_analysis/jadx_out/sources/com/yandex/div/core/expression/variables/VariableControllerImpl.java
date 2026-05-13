package com.yandex.div.core.expression.variables;

import bn.r;
import cn.f0;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.expression.variables.VariableControllerImpl;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.data.VariableDeclarationException;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;

/* JADX INFO: compiled from: VariableControllerImpl.kt */
/* JADX INFO: loaded from: classes10.dex */
public class VariableControllerImpl implements VariableController {

    @NotNull
    private final VariableControllerImpl$declarationObserver$1 declarationObserver;

    @Nullable
    private final VariableController delegate;

    @NotNull
    private final List<VariableSource> extraVariablesSources;

    @NotNull
    private final l<Variable, r> notifyVariableChangedCallback;

    @NotNull
    private final Map<ExpressionResolver, l<Variable, r>> onAnyVariableChangeObservers;

    @NotNull
    private final Map<String, ObserverList<l<Variable, r>>> onChangeObservers;

    @NotNull
    private final Map<String, ObserverList<l<Variable, r>>> onRemoveObservers;

    @NotNull
    private final Map<String, Variable> variables;

    /* JADX WARN: Type inference failed for: r1v7, types: [com.yandex.div.core.expression.variables.VariableControllerImpl$declarationObserver$1] */
    public VariableControllerImpl(@Nullable VariableController variableController) {
        this.delegate = variableController;
        this.variables = new LinkedHashMap();
        this.extraVariablesSources = new ArrayList();
        this.onChangeObservers = new LinkedHashMap();
        this.onRemoveObservers = new LinkedHashMap();
        this.onAnyVariableChangeObservers = new LinkedHashMap();
        this.notifyVariableChangedCallback = new l<Variable, r>() { // from class: com.yandex.div.core.expression.variables.VariableControllerImpl$notifyVariableChangedCallback$1
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Variable variable) {
                invoke2(variable);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Variable variable) {
                this.this$0.notifyVariableChanged(variable);
            }
        };
        this.declarationObserver = new DeclarationObserver() { // from class: com.yandex.div.core.expression.variables.VariableControllerImpl$declarationObserver$1
        };
    }

    public /* synthetic */ VariableControllerImpl(VariableController variableController, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : variableController);
    }

    private void addObserver(String str, l<? super Variable, r> lVar) {
        Map<String, ObserverList<l<Variable, r>>> map = this.onChangeObservers;
        ObserverList<l<Variable, r>> observerList = map.get(str);
        if (observerList == null) {
            observerList = new ObserverList<>();
            map.put(str, observerList);
        }
        observerList.addObserver(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyVariableChanged(Variable variable) {
        Assert.assertMainThread();
        Iterator it = f0.g1(this.onAnyVariableChangeObservers.values()).iterator();
        while (it.hasNext()) {
            ((l) it.next()).invoke(variable);
        }
        ObserverList<l<Variable, r>> observerList = this.onChangeObservers.get(variable.getName());
        if (observerList != null) {
            Iterator<l<Variable, r>> it2 = observerList.iterator();
            while (it2.hasNext()) {
                it2.next().invoke(variable);
            }
        }
    }

    private void onVariableDeclared(Variable variable) {
        variable.addObserver(this.notifyVariableChangedCallback);
        notifyVariableChanged(variable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeChangeObserver(String str, l<? super Variable, r> lVar) {
        ObserverList<l<Variable, r>> observerList = this.onChangeObservers.get(str);
        if (observerList != null) {
            observerList.removeObserver(lVar);
        }
    }

    private void subscribeToVariableChangeImpl(String str, ErrorCollector errorCollector, boolean z10, l<? super Variable, r> lVar) {
        Variable mutableVariable = getMutableVariable(str);
        if (mutableVariable == null) {
            if (errorCollector != null) {
                errorCollector.logError(ParsingExceptionKt.missingVariable$default(str, null, 2, null));
            }
            addObserver(str, lVar);
        } else {
            if (z10) {
                Assert.assertMainThread();
                lVar.invoke(mutableVariable);
            }
            addObserver(str, lVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToVariablesChange$lambda$5(List list, List list2, VariableControllerImpl variableControllerImpl, l lVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            variableControllerImpl.removeChangeObserver((String) it.next(), lVar);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((Disposable) it2.next()).close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToVariablesUndeclared$lambda$10(List list, VariableControllerImpl variableControllerImpl, l lVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ObserverList<l<Variable, r>> observerList = variableControllerImpl.onRemoveObservers.get((String) it.next());
            if (observerList != null) {
                observerList.removeObserver(lVar);
            }
        }
    }

    public void addSource(@NotNull VariableSource variableSource) {
        variableSource.observeVariables(this.notifyVariableChangedCallback);
        variableSource.observeDeclaration(this.declarationObserver);
        this.extraVariablesSources.add(variableSource);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public List<Variable> captureAll() {
        return f0.g1(this.variables.values());
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void cleanupSubscriptions() {
        for (VariableSource variableSource : this.extraVariablesSources) {
            variableSource.removeVariablesObserver(this.notifyVariableChangedCallback);
            variableSource.removeDeclarationObserver(this.declarationObserver);
        }
        this.onAnyVariableChangeObservers.clear();
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void declare(@NotNull Variable variable) throws VariableDeclarationException {
        Variable variablePut = this.variables.put(variable.getName(), variable);
        if (variablePut == null) {
            onVariableDeclared(variable);
            return;
        }
        this.variables.put(variable.getName(), variablePut);
        throw new VariableDeclarationException("Variable '" + variable.getName() + "' already declared!", null, 2, null);
    }

    @Override // com.yandex.div.evaluable.VariableProvider
    @Nullable
    public Object get(@NotNull String str) {
        Variable mutableVariable = getMutableVariable(str);
        Object objWrapVariableValue = VariableControllerKt.wrapVariableValue(mutableVariable != null ? mutableVariable.getValue() : null);
        if (objWrapVariableValue != null) {
            return objWrapVariableValue;
        }
        VariableController variableController = this.delegate;
        if (variableController != null) {
            return variableController.get(str);
        }
        return null;
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @Nullable
    public Variable getMutableVariable(@NotNull String str) {
        Variable mutableVariable;
        Variable variable = this.variables.get(str);
        if (variable != null) {
            return variable;
        }
        VariableController variableController = this.delegate;
        if (variableController != null && (mutableVariable = variableController.getMutableVariable(str)) != null) {
            return mutableVariable;
        }
        Iterator<T> it = this.extraVariablesSources.iterator();
        while (it.hasNext()) {
            Variable mutableVariable2 = ((VariableSource) it.next()).getMutableVariable(str);
            if (mutableVariable2 != null) {
                return mutableVariable2;
            }
        }
        return null;
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void restoreSubscriptions() {
        for (VariableSource variableSource : this.extraVariablesSources) {
            variableSource.observeVariables(this.notifyVariableChangedCallback);
            variableSource.receiveVariablesUpdates(this.notifyVariableChangedCallback);
            variableSource.observeDeclaration(this.declarationObserver);
        }
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void setOnAnyVariableChangeCallback(@NotNull ExpressionResolver expressionResolver, @NotNull final l<? super Variable, r> lVar) {
        this.onAnyVariableChangeObservers.put(expressionResolver, lVar);
        VariableController variableController = this.delegate;
        if (variableController != null) {
            variableController.setOnAnyVariableChangeCallback(expressionResolver, new l<Variable, r>() { // from class: com.yandex.div.core.expression.variables.VariableControllerImpl.setOnAnyVariableChangeCallback.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(Variable variable) {
                    invoke2(variable);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Variable variable) {
                    if (VariableControllerImpl.this.variables.get(variable.getName()) == null) {
                        lVar.invoke(variable);
                    }
                }
            });
        }
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariableChange(@NotNull final String str, @Nullable ErrorCollector errorCollector, boolean z10, @NotNull final l<? super Variable, r> lVar) {
        if (!this.variables.containsKey(str)) {
            VariableController variableController = this.delegate;
            if ((variableController != null ? variableController.getMutableVariable(str) : null) != null) {
                return this.delegate.subscribeToVariableChange(str, errorCollector, z10, lVar);
            }
        }
        subscribeToVariableChangeImpl(str, errorCollector, z10, lVar);
        return new Disposable() { // from class: eg.b
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                this.f61132b.removeChangeObserver(str, lVar);
            }
        };
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariablesChange(@NotNull final List<String> list, boolean z10, @NotNull final l<? super Variable, r> lVar) {
        final ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!this.variables.containsKey(str)) {
                VariableController variableController = this.delegate;
                if ((variableController != null ? variableController.getMutableVariable(str) : null) != null) {
                    arrayList.add(this.delegate.subscribeToVariableChange(str, null, z10, lVar));
                }
            }
            subscribeToVariableChangeImpl(str, null, z10, lVar);
        }
        return new Disposable() { // from class: eg.a
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                VariableControllerImpl.subscribeToVariablesChange$lambda$5(list, arrayList, this, lVar);
            }
        };
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariablesUndeclared(@NotNull final List<String> list, @NotNull final l<? super Variable, r> lVar) {
        for (String str : list) {
            Map<String, ObserverList<l<Variable, r>>> map = this.onRemoveObservers;
            ObserverList<l<Variable, r>> observerList = map.get(str);
            if (observerList == null) {
                observerList = new ObserverList<>();
                map.put(str, observerList);
            }
            observerList.addObserver(lVar);
        }
        return new Disposable() { // from class: eg.c
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                VariableControllerImpl.subscribeToVariablesUndeclared$lambda$10(list, this, lVar);
            }
        };
    }
}
