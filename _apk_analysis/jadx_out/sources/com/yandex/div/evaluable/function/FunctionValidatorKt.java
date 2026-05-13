package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: FunctionValidator.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class FunctionValidatorKt {
    @NotNull
    public static final Exception getFunctionArgumentsException(@NotNull String str, @NotNull List<? extends EvaluableType> list, boolean z10) {
        p.k(str, "name");
        p.k(list, "args");
        if (z10) {
            return getMethodArgumentsException(str, list);
        }
        if (list.isEmpty()) {
            return new EvaluableException("Function requires non empty argument list.", null, 2, null);
        }
        return new EvaluableException("Function has no matching overload for given argument types: " + EvaluableExceptionKt.toMessageFormat((List<? extends Object>) list) + '.', null, 2, null);
    }

    public static /* synthetic */ Exception getFunctionArgumentsException$default(String str, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return getFunctionArgumentsException(str, list, z10);
    }

    @NotNull
    public static final Exception getMethodArgumentsException(@NotNull String str, @NotNull List<? extends EvaluableType> list) {
        p.k(str, "name");
        p.k(list, "args");
        if (list.size() == 1) {
            return new EvaluableException("Method requires non empty argument list.", null, 2, null);
        }
        return new EvaluableException("Method has no matching overload for given argument types: " + EvaluableExceptionKt.toMessageFormat((List<? extends Object>) list.subList(1, list.size())) + '.', null, 2, null);
    }

    @NotNull
    public static final Function withArgumentsValidation(@NotNull Function function, @NotNull List<? extends EvaluableType> list) {
        p.k(function, "<this>");
        p.k(list, "args");
        Function.MatchResult matchResultMatchesArguments$div_evaluable = function.matchesArguments$div_evaluable(list);
        if (matchResultMatchesArguments$div_evaluable instanceof Function.MatchResult.Ok) {
            return function;
        }
        if (matchResultMatchesArguments$div_evaluable instanceof Function.MatchResult.ArgCountMismatch) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(function.getHasVarArg$div_evaluable() ? "At least" : "Exactly");
            sb2.append(' ');
            sb2.append(((Function.MatchResult.ArgCountMismatch) matchResultMatchesArguments$div_evaluable).getExpected());
            sb2.append(" argument(s) expected.");
            throw new EvaluableException(sb2.toString(), null, 2, null);
        }
        if (!(matchResultMatchesArguments$div_evaluable instanceof Function.MatchResult.ArgTypeMismatch)) {
            throw new NoWhenBranchMatchedException();
        }
        if (p.f(function.matchesArgumentsWithCast$div_evaluable(list), Function.MatchResult.Ok.INSTANCE)) {
            return function;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Invalid argument type: expected ");
        Function.MatchResult.ArgTypeMismatch argTypeMismatch = (Function.MatchResult.ArgTypeMismatch) matchResultMatchesArguments$div_evaluable;
        sb3.append(argTypeMismatch.getExpected());
        sb3.append(", got ");
        sb3.append(argTypeMismatch.getActual());
        sb3.append('.');
        throw new EvaluableException(sb3.toString(), null, 2, null);
    }
}
