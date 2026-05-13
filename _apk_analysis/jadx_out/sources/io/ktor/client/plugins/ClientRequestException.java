package io.ktor.client.plugins;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DefaultResponseValidation.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ClientRequestException extends ResponseException {

    @NotNull
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientRequestException(@NotNull dl.c cVar, @NotNull String str) {
        super(cVar, str);
        p.k(cVar, "response");
        p.k(str, "cachedResponseText");
        this.message = "Client request(" + cVar.L().d().getMethod().f() + ' ' + cVar.L().d().getUrl() + ") invalid: " + cVar.d() + ". Text: \"" + str + '\"';
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }
}
