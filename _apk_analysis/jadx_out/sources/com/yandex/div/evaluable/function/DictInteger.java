package com.yandex.div.evaluable.function;

import cn.w;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import kotlin.KotlinNothingValueException;
import org.jetbrains.annotations.NotNull;
import tn.p;
import vn.c;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class DictInteger extends Function {
    private final boolean isMethod;
    private final boolean isPure;

    @NotNull
    private final List<FunctionArgument> declaredArgs = w.p(new FunctionArgument(EvaluableType.DICT, false, 2, null), new FunctionArgument(EvaluableType.STRING, true));

    @NotNull
    private final EvaluableType resultType = EvaluableType.INTEGER;

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) {
        long jLongValue;
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        Object objEvaluate = DictFunctionsKt.evaluate(getName(), list, isMethod());
        if (objEvaluate instanceof Integer) {
            jLongValue = ((Number) objEvaluate).intValue();
        } else {
            if (!(objEvaluate instanceof Long)) {
                if (objEvaluate instanceof BigInteger) {
                    DictFunctionsKt.throwException(getName(), list, "Integer overflow.", isMethod());
                    throw new KotlinNothingValueException();
                }
                if (objEvaluate instanceof BigDecimal) {
                    DictFunctionsKt.throwException(getName(), list, "Cannot convert value to integer.", isMethod());
                    throw new KotlinNothingValueException();
                }
                if (!(objEvaluate instanceof Double)) {
                    DictFunctionsKt.throwWrongTypeException(getName(), list, getResultType(), objEvaluate, isMethod());
                    throw new KotlinNothingValueException();
                }
                Number number = (Number) objEvaluate;
                if (number.doubleValue() < -9.223372036854776E18d || number.doubleValue() > 9.223372036854776E18d) {
                    DictFunctionsKt.throwException(getName(), list, "Integer overflow.", isMethod());
                    throw new KotlinNothingValueException();
                }
                long jE = c.e(number.doubleValue());
                if (number.doubleValue() - ((double) jE) == 0.0d) {
                    return Long.valueOf(jE);
                }
                DictFunctionsKt.throwException(getName(), list, "Cannot convert value to integer.", isMethod());
                throw new KotlinNothingValueException();
            }
            jLongValue = ((Number) objEvaluate).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public EvaluableType getResultType() {
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
