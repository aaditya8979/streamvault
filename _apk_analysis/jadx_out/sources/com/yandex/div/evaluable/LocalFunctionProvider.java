package com.yandex.div.evaluable;

import com.yandex.div.evaluable.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: LocalFunctionProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class LocalFunctionProvider implements FunctionProvider {

    @NotNull
    private final List<Function> functions;

    /* JADX WARN: Multi-variable type inference failed */
    public LocalFunctionProvider(@NotNull List<? extends Function> list) {
        p.k(list, "functions");
        this.functions = list;
    }

    private final Function findFunction(String str, l<? super Function, ? extends Function.MatchResult> lVar) {
        List<Function> list = this.functions;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Function function = (Function) next;
            if (p.f(function.getName(), str) && p.f(lVar.invoke(function), Function.MatchResult.Ok.INSTANCE)) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (Function) arrayList.get(0);
        }
        throw new EvaluableException("Function " + arrayList.get(0) + " declared multiple times.", null, 2, null);
    }

    @Override // com.yandex.div.evaluable.FunctionProvider
    @NotNull
    public Function get(@NotNull String str, @NotNull final List<? extends EvaluableType> list) {
        p.k(str, "name");
        p.k(list, "args");
        Function functionFindFunction = findFunction(str, new l<Function, Function.MatchResult>() { // from class: com.yandex.div.evaluable.LocalFunctionProvider.get.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final Function.MatchResult invoke(@NotNull Function function) {
                p.k(function, "$this$findFunction");
                return function.matchesArguments$div_evaluable(list);
            }
        });
        if (functionFindFunction != null) {
            return functionFindFunction;
        }
        Function functionFindFunction2 = findFunction(str, new l<Function, Function.MatchResult>() { // from class: com.yandex.div.evaluable.LocalFunctionProvider.get.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final Function.MatchResult invoke(@NotNull Function function) {
                p.k(function, "$this$findFunction");
                return function.matchesArgumentsWithCast$div_evaluable(list);
            }
        });
        if (functionFindFunction2 != null) {
            return functionFindFunction2;
        }
        throw new MissingLocalFunctionException(str, list);
    }

    @Override // com.yandex.div.evaluable.FunctionProvider
    @NotNull
    public Function getMethod(@NotNull String str, @NotNull final List<? extends EvaluableType> list) {
        p.k(str, "name");
        p.k(list, "args");
        Function functionFindFunction = findFunction(str, new l<Function, Function.MatchResult>() { // from class: com.yandex.div.evaluable.LocalFunctionProvider.getMethod.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final Function.MatchResult invoke(@NotNull Function function) {
                p.k(function, "$this$findFunction");
                return function.matchesArguments$div_evaluable(list);
            }
        });
        if (functionFindFunction != null) {
            return functionFindFunction;
        }
        Function functionFindFunction2 = findFunction(str, new l<Function, Function.MatchResult>() { // from class: com.yandex.div.evaluable.LocalFunctionProvider.getMethod.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final Function.MatchResult invoke(@NotNull Function function) {
                p.k(function, "$this$findFunction");
                return function.matchesArgumentsWithCast$div_evaluable(list);
            }
        });
        if (functionFindFunction2 != null) {
            return functionFindFunction2;
        }
        throw new MissingLocalFunctionException(str, list);
    }
}
