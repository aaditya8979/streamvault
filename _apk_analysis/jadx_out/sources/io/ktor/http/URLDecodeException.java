package io.ktor.http;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Codecs.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class URLDecodeException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public URLDecodeException(@NotNull String str) {
        super(str);
        p.k(str, "message");
    }
}
