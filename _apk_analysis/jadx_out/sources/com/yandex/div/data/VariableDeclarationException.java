package com.yandex.div.data;

import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: VariableDeclarationException.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class VariableDeclarationException extends RuntimeException {
    /* JADX WARN: Multi-variable type inference failed */
    public VariableDeclarationException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public VariableDeclarationException(@Nullable String str, @Nullable Throwable th2) {
        super(str, th2);
    }

    public /* synthetic */ VariableDeclarationException(String str, Throwable th2, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th2);
    }
}
