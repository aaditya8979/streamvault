package io.ktor.client.plugins;

import cl.d;
import cl.e;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.b0;
import tn.i;
import tn.p;
import zk.f0;
import zk.g0;

/* JADX INFO: compiled from: HttpTimeout.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HttpRequestTimeoutException extends IOException implements b0<HttpRequestTimeoutException> {

    @Nullable
    private final Long timeoutMillis;

    @NotNull
    private final String url;

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpRequestTimeoutException(@NotNull d dVar) {
        p.k(dVar, AdActivity.REQUEST_KEY_EXTRA);
        String strC = dVar.i().c();
        g0 g0Var = (g0) dVar.f(f0.f98297a);
        this(strC, g0Var != null ? g0Var.c() : null, null, 4, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpRequestTimeoutException(@NotNull e eVar) {
        p.k(eVar, AdActivity.REQUEST_KEY_EXTRA);
        String string = eVar.h().toString();
        g0 g0Var = (g0) eVar.c(f0.f98297a);
        this(string, g0Var != null ? g0Var.c() : null, null, 4, null);
    }

    public HttpRequestTimeoutException(@NotNull String str, @Nullable Long l10, @Nullable Throwable th2) {
        p.k(str, "url");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request timeout has expired [url=");
        sb2.append(str);
        sb2.append(", request_timeout=");
        sb2.append(l10 == null ? "unknown" : l10);
        sb2.append(" ms]");
        super(sb2.toString(), th2);
        this.url = str;
        this.timeoutMillis = l10;
    }

    public /* synthetic */ HttpRequestTimeoutException(String str, Long l10, Throwable th2, int i10, i iVar) {
        this(str, l10, (i10 & 4) != 0 ? null : th2);
    }

    @Override // p000do.b0
    @NotNull
    public HttpRequestTimeoutException createCopy() {
        return new HttpRequestTimeoutException(this.url, this.timeoutMillis, getCause());
    }
}
