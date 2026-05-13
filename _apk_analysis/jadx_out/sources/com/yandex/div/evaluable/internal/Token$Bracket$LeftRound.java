package com.yandex.div.evaluable.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Token.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Token$Bracket$LeftRound implements Token {

    @NotNull
    public static final Token$Bracket$LeftRound INSTANCE = new Token$Bracket$LeftRound();

    private Token$Bracket$LeftRound() {
    }

    @NotNull
    public String toString() {
        return "(";
    }
}
