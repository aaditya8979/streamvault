package com.yandex.div.core.view2.errors;

import bn.h;
import bn.r;
import cn.f0;
import cn.x;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.data.Variable;
import com.yandex.div.data.VariableMutationException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: VariableMonitor.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class VariableMonitor {

    @NotNull
    private final l<Throwable, r> errorHandler;

    @Nullable
    private l<? super List<? extends Pair<String, ? extends Variable>>, r> variablesUpdatedCallback;

    @NotNull
    private final Map<Pair<String, String>, Variable> variables = new LinkedHashMap();

    @NotNull
    private Map<String, ? extends VariableController> controllerMap = kotlin.collections.a.j();

    /* JADX WARN: Multi-variable type inference failed */
    public VariableMonitor(@NotNull l<? super Throwable, r> lVar) {
        this.errorHandler = lVar;
    }

    private final l<Variable, r> createCallback(final String str) {
        return new l<Variable, r>() { // from class: com.yandex.div.core.view2.errors.VariableMonitor.createCallback.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                VariableMonitor.this.saveVariable(variable, str);
                VariableMonitor.this.notifyOnChange();
            }
        };
    }

    private final Pair<String, Variable> entriesToVariables(Map.Entry<Pair<String, String>, ? extends Variable> entry) {
        Pair<String, String> key = entry.getKey();
        return h.a(key.getFirst(), entry.getValue());
    }

    private final List<String> getAllNames(VariableController variableController) {
        List<Variable> listCaptureAll = variableController.captureAll();
        ArrayList arrayList = new ArrayList(x.x(listCaptureAll, 10));
        Iterator<T> it = listCaptureAll.iterator();
        while (it.hasNext()) {
            arrayList.add(((Variable) it.next()).getName());
        }
        return arrayList;
    }

    private final <K, V> boolean hasAllPairs(Map<K, ? extends V> map, Map<K, ? extends V> map2) {
        if (map2.isEmpty()) {
            return true;
        }
        for (Map.Entry<K, ? extends V> entry : map2.entrySet()) {
            K key = entry.getKey();
            if (!p.f(map.get(key), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyOnChange() {
        List<Pair<String, Variable>> listVariablesList = variablesList();
        l<? super List<? extends Pair<String, ? extends Variable>>, r> lVar = this.variablesUpdatedCallback;
        if (lVar != null) {
            lVar.invoke(listVariablesList);
        }
    }

    private final void onControllersChange(Set<? extends VariableController> set) {
        Map<String, ? extends VariableController> map = this.controllerMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends VariableController> entry : map.entrySet()) {
            if (!set.contains(entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            VariableController variableController = (VariableController) entry2.getValue();
            VariableController.subscribeToVariablesChange$default(variableController, getAllNames(variableController), false, createCallback(str), 2, null);
        }
        this.variables.clear();
        for (Map.Entry<String, ? extends VariableController> entry3 : this.controllerMap.entrySet()) {
            String key = entry3.getKey();
            Iterator<T> it = entry3.getValue().captureAll().iterator();
            while (it.hasNext()) {
                saveVariable((Variable) it.next(), key);
            }
        }
        notifyOnChange();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveVariable(Variable variable, String str) {
        this.variables.put(h.a(str, variable.getName()), variable);
    }

    private final List<Pair<String, Variable>> variablesList() {
        Map<Pair<String, String>, Variable> map = this.variables;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<Pair<String, String>, Variable>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(entriesToVariables(it.next()));
        }
        return f0.X0(arrayList, new Comparator() { // from class: com.yandex.div.core.view2.errors.VariableMonitor$variablesList$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                Pair pair = (Pair) t10;
                Pair pair2 = (Pair) t11;
                return fn.b.d(((String) pair.component1()) + ((Variable) pair.component2()).getName(), ((String) pair2.component1()) + ((Variable) pair2.component2()).getName());
            }
        });
    }

    public final void mutateVariable(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Variable variable = this.variables.get(h.a(str2, str));
        if (p.f(String.valueOf(variable != null ? variable.getValue() : null), str3) || variable == null) {
            return;
        }
        try {
            variable.set(str3);
        } catch (Exception unused) {
            this.errorHandler.invoke(new VariableMutationException("Unable to set '" + str3 + "' value to variable '" + str + "'.", null, 2, null));
        }
    }

    public final void setControllerMap(@NotNull Map<String, ? extends VariableController> map) {
        if (hasAllPairs(this.controllerMap, map)) {
            return;
        }
        Set<? extends VariableController> setL1 = f0.l1(this.controllerMap.values());
        this.controllerMap = map;
        onControllersChange(setL1);
    }

    public final void setVariablesUpdatedCallback(@NotNull l<? super List<? extends Pair<String, ? extends Variable>>, r> lVar) {
        this.variablesUpdatedCallback = lVar;
        notifyOnChange();
    }
}
