package io.ktor.client.plugins;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DefaultResponseValidation.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ServerResponseException extends ResponseException {

    @NotNull
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerResponseException(@NotNull dl.c cVar, @NotNull String str) {
        super(cVar, str);
        p.k(cVar, "response");
        p.k(str, "cachedResponseText");
        this.message = "Server error(" + cVar.L().d().getMethod().f() + ' ' + cVar.L().d().getUrl() + ": " + cVar.d() + ". Text: \"" + str + '\"';
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }
}
