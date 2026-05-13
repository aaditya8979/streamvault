package io.ktor.http;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ContentTypes.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BadContentTypeFormatException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadContentTypeFormatException(@NotNull String str) {
        super("Bad Content-Type format: " + str);
        p.k(str, "value");
    }
}
