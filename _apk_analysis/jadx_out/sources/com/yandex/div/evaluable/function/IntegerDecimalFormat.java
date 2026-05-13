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
/* JADX INFO: loaded from: classes4.dex */
public final class IntegerDecimalFormat extends AbsDecimalFormat<Long> {

    @NotNull
    public static final IntegerDecimalFormat INSTANCE = new IntegerDecimalFormat();

    @NotNull
    private static final String name = "decimalFormat";

    @NotNull
    private static final List<FunctionArgument> declaredArgs = w.p(new FunctionArgument(EvaluableType.INTEGER, false, 2, null), new FunctionArgument(EvaluableType.STRING, false, 2, null));

    private IntegerDecimalFormat() {
    }

    @NotNull
    public String format(@NotNull DecimalFormat decimalFormat, long j10) {
        p.k(decimalFormat, "formatter");
        String str = decimalFormat.format(j10);
        p.j(str, "formatter.format(value)");
        return str;
    }

    @Override // com.yandex.div.evaluable.function.AbsDecimalFormat
    public /* bridge */ /* synthetic */ String format(DecimalFormat decimalFormat, Number number) {
        return format(decimalFormat, number.longValue());
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
    public Long getValue(@NotNull Object obj) {
        p.k(obj, "valueArgument");
        return (Long) obj;
    }
}
