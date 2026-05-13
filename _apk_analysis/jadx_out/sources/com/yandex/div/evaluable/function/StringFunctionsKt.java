package com.yandex.div.evaluable.function;

import cn.k0;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluationContext;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: StringFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class StringFunctionsKt {
    @NotNull
    /* JADX INFO: renamed from: buildRepeatableString-zb-MA7A, reason: not valid java name */
    public static final String m7414buildRepeatableStringzbMA7A(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable evaluable, int i10, @NotNull String str) {
        p.k(evaluationContext, "evaluationContext");
        p.k(evaluable, "expressionContext");
        p.k(str, "repeatable");
        if ((str.length() == 0) || i10 <= 0) {
            if (!(str.length() == 0)) {
                return "";
            }
            evaluationContext.getWarningSender().mo7373sendBIH1yYw(evaluable, "String for padding is empty.");
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i10);
        Iterator<Integer> it = n.v(0, i10).iterator();
        while (it.hasNext()) {
            sb2.append(str.charAt(((k0) it).nextInt() % str.length()));
        }
        String string = sb2.toString();
        p.j(string, "stringBuilder.toString()");
        return string;
    }
}
