package com.yandex.div.evaluable.function;

import cn.w;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class ArrayFunction extends Function {

    @NotNull
    private final List<FunctionArgument> declaredArgs;
    private final boolean isMethod;
    private final boolean isPure;

    @NotNull
    private final EvaluableType resultType;

    public ArrayFunction(@NotNull EvaluableType evaluableType) {
        p.k(evaluableType, "resultType");
        this.resultType = evaluableType;
        this.declaredArgs = w.p(new FunctionArgument(EvaluableType.ARRAY, false, 2, null), new FunctionArgument(EvaluableType.INTEGER, false, 2, null));
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public final EvaluableType getResultType() {
        return this.resultType;
    }

    public boolean isMethod() {
        return this.isMethod;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
