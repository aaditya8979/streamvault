package io.ktor.client.plugins;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DefaultResponseValidation.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class RedirectResponseException extends ResponseException {

    @NotNull
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedirectResponseException(@NotNull dl.c cVar, @NotNull String str) {
        super(cVar, str);
        p.k(cVar, "response");
        p.k(str, "cachedResponseText");
        this.message = "Unhandled redirect: " + cVar.L().d().getMethod().f() + ' ' + cVar.L().d().getUrl() + ". Status: " + cVar.d() + ". Text: \"" + str + '\"';
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }
}
