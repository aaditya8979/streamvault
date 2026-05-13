package com.yandex.div.core.state;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: DivStatePath.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class PathFormatException extends Exception {
    public PathFormatException(@NotNull String str, @Nullable Throwable th2) {
        super(str, th2);
    }

    public /* synthetic */ PathFormatException(String str, Throwable th2, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }
}
