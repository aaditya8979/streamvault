package com.yandex.div.evaluable.function;

import cn.w;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.FunctionArgument;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: StringFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NumberDecimalFormat extends AbsDecimalFormat<Double> {

    @NotNull
    public static final NumberDecimalFormat INSTANCE = new NumberDecimalFormat();

    @NotNull
    private static final String name = "decimalFormat";

    @NotNull
    private static final List<FunctionArgument> declaredArgs = w.p(new FunctionArgument(EvaluableType.NUMBER, false, 2, null), new FunctionArgument(EvaluableType.STRING, false, 2, null));

    private NumberDecimalFormat() {
    }

    @NotNull
    public String format(@NotNull DecimalFormat decimalFormat, double d10) {
        p.k(decimalFormat, "formatter");
        String str = decimalFormat.format(Float.valueOf((float) d10));
        p.j(str, "formatter.format(value.toFloat())");
        return str;
    }

    @Override // com.yandex.div.evaluable.function.AbsDecimalFormat
    public /* bridge */ /* synthetic */ String format(DecimalFormat decimalFormat, Number number) {
        return format(decimalFormat, number.doubleValue());
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.function.AbsDecimalFormat
    @NotNull
    public Locale getLocale(@NotNull List<? extends Object> list) {
        p.k(list, "args");
        Locale locale = Locale.getDefault();
        p.j(locale, "getDefault()");
        return locale;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.AbsDecimalFormat
    @NotNull
    public Double getValue(@NotNull Object obj) {
        p.k(obj, "valueArgument");
        return (Double) obj;
    }
}
