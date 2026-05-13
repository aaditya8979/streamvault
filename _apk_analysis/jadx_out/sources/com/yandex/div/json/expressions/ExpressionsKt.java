package com.yandex.div.json.expressions;

import com.yandex.div.json.expressions.Expression;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: compiled from: Expressions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ExpressionsKt {
    public static final <T> boolean equalsToConstant(@Nullable Expression<T> expression, @Nullable Expression<T> expression2) {
        if (expression == null && expression2 == null) {
            return true;
        }
        if (expression == null || !isConstant(expression) || expression2 == null || !isConstant(expression2)) {
            return false;
        }
        return ((expression.getRawValue() instanceof JSONObject) || (expression.getRawValue() instanceof JSONArray)) ? p.f(expression.getRawValue().toString(), expression2.getRawValue().toString()) : p.f(expression.getRawValue(), expression2.getRawValue());
    }

    public static final <T> boolean equalsToConstant(@Nullable ExpressionList<T> expressionList, @Nullable ExpressionList<T> expressionList2) {
        if (expressionList == null && expressionList2 == null) {
            return true;
        }
        return expressionList != null && (expressionList instanceof ConstantExpressionList) && expressionList2 != null && (expressionList2 instanceof ConstantExpressionList) && p.f(((ConstantExpressionList) expressionList).getValues$div_data_release(), ((ConstantExpressionList) expressionList2).getValues$div_data_release());
    }

    public static final <T> boolean isConstant(@NotNull Expression<T> expression) {
        return expression instanceof Expression.ConstantExpression;
    }

    public static final <T> boolean isConstant(@NotNull ExpressionList<T> expressionList) {
        return expressionList instanceof ConstantExpressionList;
    }

    public static final <T> boolean isConstantOrNull(@Nullable Expression<T> expression) {
        return expression == null || isConstant(expression);
    }

    public static final <T> boolean isConstantOrNull(@Nullable ExpressionList<T> expressionList) {
        return expressionList == null || isConstant(expressionList);
    }
}
