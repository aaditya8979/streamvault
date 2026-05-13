package com.yandex.div.core.view2.reuse;

import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div2.Div;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Token.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Token {
    private final int childIndex;

    @NotNull
    private final Div div;
    private final int divHash;

    @NotNull
    private final DivItemBuilderResult item;

    public Token(@NotNull DivItemBuilderResult divItemBuilderResult, int i10) {
        this.item = divItemBuilderResult;
        this.childIndex = i10;
        this.divHash = divItemBuilderResult.getDiv().propertiesHash();
        this.div = divItemBuilderResult.getDiv();
    }

    public final int getChildIndex() {
        return this.childIndex;
    }

    @NotNull
    public final Div getDiv() {
        return this.div;
    }

    public final int getDivHash() {
        return this.divHash;
    }

    @NotNull
    public final DivItemBuilderResult getItem() {
        return this.item;
    }

    public final boolean isCombinable(@NotNull Token token) {
        return this.divHash == token.divHash && p.f(DivUtilKt.getType(this.div), DivUtilKt.getType(token.div));
    }
}
