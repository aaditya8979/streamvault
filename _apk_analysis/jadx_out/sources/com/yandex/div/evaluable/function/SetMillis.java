package com.yandex.div.evaluable.function;

import cn.w;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.DateTime;
import java.util.Calendar;
import java.util.List;
import kotlin.KotlinNothingValueException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DateTimeFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SetMillis extends Function {

    @NotNull
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;

    @NotNull
    private static final EvaluableType resultType;

    @NotNull
    public static final SetMillis INSTANCE = new SetMillis();

    @NotNull
    private static final String name = "setMillis";

    static {
        EvaluableType evaluableType = EvaluableType.DATETIME;
        declaredArgs = w.p(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.INTEGER, false, 2, null));
        resultType = evaluableType;
        isPure = true;
    }

    private SetMillis() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) throws EvaluableException {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        Object obj = list.get(0);
        p.i(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.types.DateTime");
        DateTime dateTime = (DateTime) obj;
        Object obj2 = list.get(1);
        p.i(obj2, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) obj2).longValue();
        if (jLongValue <= 999 && jLongValue >= 0) {
            Calendar calendar = DateTimeFunctionsKt.toCalendar(dateTime);
            calendar.set(14, (int) jLongValue);
            return new DateTime(calendar.getTimeInMillis(), dateTime.getTimezone$div_evaluable());
        }
        EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), list, "Expecting millis in [0..999], instead got " + jLongValue + '.', null, 8, null);
        throw new KotlinNothingValueException();
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public EvaluableType getResultType() {
        return resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return isPure;
    }
}
