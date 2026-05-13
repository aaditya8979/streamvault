package io.ktor.utils.io.charsets;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: CharsetJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
public class MalformedInputException extends java.nio.charset.MalformedInputException {

    @NotNull
    private final String _message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MalformedInputException(@NotNull String str) {
        super(0);
        p.k(str, "message");
        this._message = str;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    @Nullable
    public String getMessage() {
        return this._message;
    }
}
