package io.ktor.client.plugins;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DefaultResponseValidation.kt */
/* JADX INFO: loaded from: classes12.dex */
public class ResponseException extends IllegalStateException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final transient dl.c f71157b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseException(@NotNull dl.c cVar, @NotNull String str) {
        super("Bad response: " + cVar + ". Text: \"" + str + '\"');
        p.k(cVar, "response");
        p.k(str, "cachedResponseText");
        this.f71157b = cVar;
    }

    @NotNull
    public final dl.c getResponse() {
        return this.f71157b;
    }
}
