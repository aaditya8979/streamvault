package io.ktor.utils.io.charsets;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Encoding.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class TooLongLineException extends MalformedInputException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooLongLineException(@NotNull String str) {
        super(str);
        p.k(str, "message");
    }
}
