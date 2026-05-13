package com.yandex.div.json.expressions;

import bn.r;
import com.yandex.div.core.Disposable;
import com.yandex.div.json.ParsingException;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import sn.l;

/* JADX INFO: compiled from: ExpressionList.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface ExpressionList<T> {
    @NotNull
    List<T> evaluate(@NotNull ExpressionResolver expressionResolver) throws ParsingException;

    @NotNull
    Disposable observe(@NotNull ExpressionResolver expressionResolver, @NotNull l<? super List<? extends T>, r> lVar);
}
