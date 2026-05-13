package com.yandex.div.evaluable.function;

import cn.f0;
import cn.v;
import com.google.android.material.datepicker.UtcDates;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.DateTime;
import java.util.List;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DateTimeFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ParseUnixTime extends Function {

    @NotNull
    public static final ParseUnixTime INSTANCE = new ParseUnixTime();

    @NotNull
    private static final String name = "parseUnixTime";

    @NotNull
    private static final List<FunctionArgument> declaredArgs = v.e(new FunctionArgument(EvaluableType.INTEGER, false, 2, null));

    @NotNull
    private static final EvaluableType resultType = EvaluableType.DATETIME;
    private static final boolean isPure = true;

    private ParseUnixTime() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        Object objT0 = f0.t0(list);
        p.i(objT0, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) objT0).longValue() * 1000;
        TimeZone timeZone = TimeZone.getTimeZone(UtcDates.UTC);
        p.j(timeZone, "getTimeZone(\"UTC\")");
        return new DateTime(jLongValue, timeZone);
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
