package com.yandex.div.internal.core;

import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: DivItemBuilderResult.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivItemBuilderResult {

    @NotNull
    private final Div div;

    @NotNull
    private final ExpressionResolver expressionResolver;

    public DivItemBuilderResult(@NotNull Div div, @NotNull ExpressionResolver expressionResolver) {
        this.div = div;
        this.expressionResolver = expressionResolver;
    }

    @NotNull
    public final Div component1() {
        return this.div;
    }

    @NotNull
    public final ExpressionResolver component2() {
        return this.expressionResolver;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivItemBuilderResult)) {
            return false;
        }
        DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
        return p.f(this.div, divItemBuilderResult.div) && p.f(this.expressionResolver, divItemBuilderResult.expressionResolver);
    }

    @NotNull
    public final Div getDiv() {
        return this.div;
    }

    @NotNull
    public final ExpressionResolver getExpressionResolver() {
        return this.expressionResolver;
    }

    public int hashCode() {
        return (this.div.hashCode() * 31) + this.expressionResolver.hashCode();
    }

    @NotNull
    public String toString() {
        return "DivItemBuilderResult(div=" + this.div + ", expressionResolver=" + this.expressionResolver + ')';
    }
}
