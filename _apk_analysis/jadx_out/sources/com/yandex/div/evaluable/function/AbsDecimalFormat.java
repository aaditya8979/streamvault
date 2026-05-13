package com.yandex.div.evaluable.function;

import cn.f0;
import cn.w0;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import java.lang.Number;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: StringFunctions.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbsDecimalFormat<T extends Number> extends Function {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Set<Character> SUPPORTED_FORMAT_SYMBOLS = w0.j('#', '0', ',', '.');

    @NotNull
    private final EvaluableType resultType = EvaluableType.STRING;
    private final boolean isPure = true;

    /* JADX INFO: compiled from: StringFunctions.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    private final String formatCallReference(List<? extends Object> list, boolean z10) {
        return f0.D0(f0.l0(list, z10 ? 1 : 0), null, getName() + '(', ")", 0, null, new l<Object, CharSequence>() { // from class: com.yandex.div.evaluable.function.AbsDecimalFormat$formatCallReference$callReference$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final CharSequence invoke(@NotNull Object obj) {
                p.k(obj, "arg");
                return EvaluableExceptionKt.toMessageFormat(obj);
            }
        }, 25, null);
    }

    /* JADX INFO: renamed from: throwIllegalFormatException-ec-iVKA, reason: not valid java name */
    private final Void m7404throwIllegalFormatExceptioneciVKA(Evaluable evaluable, List<? extends Object> list, Exception exc) {
        throw new EvaluableException("Failed to evaluate [" + formatCallReference(list, evaluable instanceof Evaluable.MethodCall) + "]. Incorrect format pattern.", exc);
    }

    /* JADX INFO: renamed from: throwIllegalFormatException-ec-iVKA$default, reason: not valid java name */
    public static /* synthetic */ Void m7405throwIllegalFormatExceptioneciVKA$default(AbsDecimalFormat absDecimalFormat, Evaluable evaluable, List list, Exception exc, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: throwIllegalFormatException-ec-iVKA");
        }
        if ((i10 & 4) != 0) {
            exc = null;
        }
        return absDecimalFormat.m7404throwIllegalFormatExceptioneciVKA(evaluable, list, exc);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo7374evaluateex6DHhM(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, @NotNull List<? extends Object> list) {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(list, "args");
        boolean z10 = false;
        Number value = getValue(list.get(0));
        Object obj = list.get(1);
        p.i(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Locale locale = getLocale(list);
        if (str.length() == 0) {
            m7405throwIllegalFormatExceptioneciVKA$default(this, evaluable, list, null, 4, null);
            throw new KotlinNothingValueException();
        }
        int i10 = 0;
        while (true) {
            if (i10 >= str.length()) {
                break;
            }
            if (!SUPPORTED_FORMAT_SYMBOLS.contains(Character.valueOf(str.charAt(i10)))) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            m7405throwIllegalFormatExceptioneciVKA$default(this, evaluable, list, null, 4, null);
            throw new KotlinNothingValueException();
        }
        try {
            return format(new DecimalFormat(str, DecimalFormatSymbols.getInstance(locale)), value);
        } catch (Exception e10) {
            m7404throwIllegalFormatExceptioneciVKA(evaluable, list, e10);
            throw new KotlinNothingValueException();
        }
    }

    @NotNull
    public abstract String format(@NotNull DecimalFormat decimalFormat, @NotNull T t10);

    @NotNull
    public abstract Locale getLocale(@NotNull List<? extends Object> list);

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public EvaluableType getResultType() {
        return this.resultType;
    }

    @NotNull
    public abstract T getValue(@NotNull Object obj);

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
