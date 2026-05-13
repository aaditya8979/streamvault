package io.ktor.http.cio;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: HttpParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ParserException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParserException(@NotNull String str) {
        super(str);
        p.k(str, "message");
    }
}
