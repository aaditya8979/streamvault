package com.yandex.div.core.view2.reuse;

import cn.v;
import cn.w;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivState;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NewToken.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class NewToken extends Token {

    @Nullable
    private ExistingToken lastExistingParent;

    public NewToken(@NotNull DivItemBuilderResult divItemBuilderResult, int i10, @Nullable ExistingToken existingToken) {
        super(divItemBuilderResult, i10);
        this.lastExistingParent = existingToken;
    }

    private final List<NewToken> itemsToNewTokenList(List<DivItemBuilderResult> list) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.w();
            }
            arrayList.add(new NewToken((DivItemBuilderResult) obj, i10, this.lastExistingParent));
            i10 = i11;
        }
        return arrayList;
    }

    @NotNull
    public final List<NewToken> getChildrenTokens() {
        Div div;
        ExpressionResolver expressionResolver = getItem().getExpressionResolver();
        Div div2 = getItem().getDiv();
        if (!(div2 instanceof Div.q) && !(div2 instanceof Div.g) && !(div2 instanceof Div.e) && !(div2 instanceof Div.l) && !(div2 instanceof Div.h) && !(div2 instanceof Div.m) && !(div2 instanceof Div.i) && !(div2 instanceof Div.k) && !(div2 instanceof Div.r) && !(div2 instanceof Div.o)) {
            if (div2 instanceof Div.b) {
                return itemsToNewTokenList(DivCollectionExtensionsKt.buildItems(((Div.b) div2).c(), expressionResolver));
            }
            if (div2 instanceof Div.c) {
                return itemsToNewTokenList(DivCollectionExtensionsKt.toDivItemBuilderResult(DivCollectionExtensionsKt.getNonNullItems(((Div.c) div2).c()), expressionResolver));
            }
            if (div2 instanceof Div.f) {
                return itemsToNewTokenList(DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((Div.f) div2).c(), expressionResolver));
            }
            if (div2 instanceof Div.d) {
                return itemsToNewTokenList(DivCollectionExtensionsKt.buildItems(((Div.d) div2).c(), expressionResolver));
            }
            if (div2 instanceof Div.j) {
                return itemsToNewTokenList(DivCollectionExtensionsKt.buildItems(((Div.j) div2).c(), expressionResolver));
            }
            if (div2 instanceof Div.p) {
                return itemsToNewTokenList(DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((Div.p) div2).c(), expressionResolver));
            }
            if (!(div2 instanceof Div.n)) {
                throw new NoWhenBranchMatchedException();
            }
            DivState.State defaultState = DivUtilKt.getDefaultState(((Div.n) div2).c(), expressionResolver);
            return (defaultState == null || (div = defaultState.f57194c) == null) ? w.m() : itemsToNewTokenList(v.e(DivCollectionExtensionsKt.toItemBuilderResult(div, expressionResolver)));
        }
        return w.m();
    }

    @Nullable
    public final ExistingToken getLastExistingParent() {
        return this.lastExistingParent;
    }

    public final void setLastExistingParent(@Nullable ExistingToken existingToken) {
        this.lastExistingParent = existingToken;
    }
}
