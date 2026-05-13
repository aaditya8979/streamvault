package io.ktor.http;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: URLParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class URLParserException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public URLParserException(@NotNull String str, @NotNull Throwable th2) {
        super("Fail to parse url: " + str, th2);
        p.k(str, "urlString");
        p.k(th2, "cause");
    }
}
