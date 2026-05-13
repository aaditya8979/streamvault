package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class Fc extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fc(@NotNull Exception exc) {
        super("Missing Headers", exc);
        tn.p.k(exc, "e");
    }
}
