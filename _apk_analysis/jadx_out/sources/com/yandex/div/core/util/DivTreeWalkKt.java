package com.yandex.div.core.util;

import cn.w;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivTreeWalk.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivTreeWalkKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<DivItemBuilderResult> getItems(Div div, ExpressionResolver expressionResolver) {
        if (!(div instanceof Div.q) && !(div instanceof Div.g) && !(div instanceof Div.e) && !(div instanceof Div.l) && !(div instanceof Div.h) && !(div instanceof Div.m) && !(div instanceof Div.i) && !(div instanceof Div.c) && !(div instanceof Div.k) && !(div instanceof Div.r) && !(div instanceof Div.o)) {
            if (div instanceof Div.b) {
                return DivCollectionExtensionsKt.buildItems(((Div.b) div).c(), expressionResolver);
            }
            if (div instanceof Div.f) {
                return DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((Div.f) div).c(), expressionResolver);
            }
            if (div instanceof Div.d) {
                return DivCollectionExtensionsKt.buildItems(((Div.d) div).c(), expressionResolver);
            }
            if (div instanceof Div.j) {
                return DivCollectionExtensionsKt.buildItems(((Div.j) div).c(), expressionResolver);
            }
            if (div instanceof Div.p) {
                return DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((Div.p) div).c(), expressionResolver);
            }
            if (div instanceof Div.n) {
                return DivCollectionExtensionsKt.statesToDivItemBuilderResult(((Div.n) div).c(), expressionResolver);
            }
            throw new NoWhenBranchMatchedException();
        }
        return w.m();
    }

    @NotNull
    public static final DivTreeWalk walk(@NotNull Div div, @NotNull ExpressionResolver expressionResolver) {
        return new DivTreeWalk(div, expressionResolver);
    }
}
