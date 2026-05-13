package io.ktor.http.cio.internals;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Errors.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class UnsupportedMediaTypeExceptionCIO extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedMediaTypeExceptionCIO(@NotNull String str) {
        super(str);
        p.k(str, "message");
    }
}
