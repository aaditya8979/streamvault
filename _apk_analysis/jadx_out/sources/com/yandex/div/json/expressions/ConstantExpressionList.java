package com.yandex.div.json.expressions;

import bn.r;
import com.yandex.div.core.Disposable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: ExpressionList.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConstantExpressionList<T> implements ExpressionList<T> {

    @NotNull
    private final List<T> values;

    /* JADX WARN: Multi-variable type inference failed */
    public ConstantExpressionList(@NotNull List<? extends T> list) {
        this.values = list;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ConstantExpressionList) && p.f(this.values, ((ConstantExpressionList) obj).values);
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    @NotNull
    public List<T> evaluate(@NotNull ExpressionResolver expressionResolver) {
        return this.values;
    }

    @NotNull
    public final List<T> getValues$div_data_release() {
        return this.values;
    }

    public int hashCode() {
        return this.values.hashCode() * 16;
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    @NotNull
    public Disposable observe(@NotNull ExpressionResolver expressionResolver, @NotNull l<? super List<? extends T>, r> lVar) {
        return Disposable.NULL;
    }
}
