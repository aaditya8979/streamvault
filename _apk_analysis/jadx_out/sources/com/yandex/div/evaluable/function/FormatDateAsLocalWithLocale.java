package com.yandex.div.evaluable.function;

import cn.w;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.DateTime;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DateTimeFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class FormatDateAsLocalWithLocale extends Function {

    @NotNull
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;

    @NotNull
    private static final EvaluableType resultType;

    @NotNull
    public static final FormatDateAsLocalWithLocale INSTANCE = new FormatDateAsLocalWithLocale();

    @NotNull
    private static final String name = "formatDateAsLocalWithLocale";

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        declaredArgs = w.p(new FunctionArgument(EvaluableType.DATETIME, false, 2, null), new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null));
        resultType = evaluableType;
        isPure = true;
    }

    private FormatDateAsLocalWithLocale() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        Object obj = list.get(0);
        p.i(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.types.DateTime");
        Object obj2 = list.get(1);
        p.i(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(2);
        p.i(obj3, "null cannot be cast to non-null type kotlin.String");
        Date date = DateTimeFunctionsKt.toDate((DateTime) obj);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String) obj2, new Locale.Builder().setLanguageTag((String) obj3).build());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String str = simpleDateFormat.format(date);
        p.j(str, "sdf.format(date)");
        return str;
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
