package io.ktor.http;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: HttpHeaders.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class UnsafeHeaderException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsafeHeaderException(@NotNull String str) {
        super("Header(s) " + str + " are controlled by the engine and cannot be set explicitly");
        p.k(str, "header");
    }
}
