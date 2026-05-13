package com.yandex.div.core.expression.variables;

import com.yandex.div.data.Variable;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivVariable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivVariablesParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivVariablesParserKt {
    @NotNull
    public static final Variable toVariable(@NotNull DivVariable divVariable, @NotNull ExpressionResolver expressionResolver) {
        if (divVariable instanceof DivVariable.b) {
            DivVariable.b bVar = (DivVariable.b) divVariable;
            return new Variable.BooleanVariable(bVar.c().f54042a, bVar.c().f54043b.evaluate(expressionResolver).booleanValue());
        }
        if (divVariable instanceof DivVariable.f) {
            DivVariable.f fVar = (DivVariable.f) divVariable;
            return new Variable.IntegerVariable(fVar.c().f58300a, fVar.c().f58301b.evaluate(expressionResolver).longValue());
        }
        if (divVariable instanceof DivVariable.g) {
            DivVariable.g gVar = (DivVariable.g) divVariable;
            return new Variable.DoubleVariable(gVar.c().f58621a, gVar.c().f58622b.evaluate(expressionResolver).doubleValue());
        }
        if (divVariable instanceof DivVariable.i) {
            DivVariable.i iVar = (DivVariable.i) divVariable;
            return new Variable.StringVariable(iVar.c().f58672a, iVar.c().f58673b.evaluate(expressionResolver));
        }
        if (divVariable instanceof DivVariable.c) {
            DivVariable.c cVar = (DivVariable.c) divVariable;
            return new Variable.ColorVariable(cVar.c().f54058a, cVar.c().f54059b.evaluate(expressionResolver).intValue());
        }
        if (divVariable instanceof DivVariable.j) {
            DivVariable.j jVar = (DivVariable.j) divVariable;
            return new Variable.UrlVariable(jVar.c().f58688a, jVar.c().f58689b.evaluate(expressionResolver));
        }
        if (divVariable instanceof DivVariable.e) {
            DivVariable.e eVar = (DivVariable.e) divVariable;
            return new Variable.DictVariable(eVar.c().f54088a, eVar.c().f54089b.evaluate(expressionResolver));
        }
        if (divVariable instanceof DivVariable.a) {
            DivVariable.a aVar = (DivVariable.a) divVariable;
            return new Variable.ArrayVariable(aVar.c().f54026a, aVar.c().f54027b.evaluate(expressionResolver));
        }
        if (!(divVariable instanceof DivVariable.h)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new NotImplementedError("An operation is not implemented: Support property variables");
    }
}
