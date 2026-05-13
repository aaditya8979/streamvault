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
/* JADX INFO: loaded from: classes8.dex */
public final class LocalizedIntegerDecimalFormat extends AbsDecimalFormat<Long> {

    @NotNull
    private static final List<FunctionArgument> declaredArgs;

    @NotNull
    public static final LocalizedIntegerDecimalFormat INSTANCE = new LocalizedIntegerDecimalFormat();

    @NotNull
    private static final String name = "decimalFormat";

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        declaredArgs = w.p(new FunctionArgument(EvaluableType.INTEGER, false, 2, null), new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null));
    }

    private LocalizedIntegerDecimalFormat() {
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
        Object obj = list.get(2);
        p.i(obj, "null cannot be cast to non-null type kotlin.String");
        Locale localeForLanguageTag = Locale.forLanguageTag((String) obj);
        p.j(localeForLanguageTag, "forLanguageTag(args[2] as String)");
        return localeForLanguageTag;
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
