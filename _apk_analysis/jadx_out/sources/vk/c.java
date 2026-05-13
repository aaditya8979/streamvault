package vk;

import androidx.core.app.NotificationCompat;
import gl.m;
import gl.x;
import io.ktor.client.call.HttpClientCall;
import io.ktor.http.Url;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DelegatedCall.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c implements cl.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cl.b f86094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final HttpClientCall f86095c;

    public c(@NotNull HttpClientCall httpClientCall, @NotNull cl.b bVar) {
        p.k(httpClientCall, NotificationCompat.CATEGORY_CALL);
        p.k(bVar, "origin");
        this.f86094b = bVar;
        this.f86095c = httpClientCall;
    }

    @Override // cl.b
    @NotNull
    public HttpClientCall L() {
        return this.f86095c;
    }

    @Override // cl.b
    @NotNull
    public kl.b getAttributes() {
        return this.f86094b.getAttributes();
    }

    @Override // cl.b, p000do.l0
    @NotNull
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f86094b.getCoroutineContext();
    }

    @Override // gl.u
    @NotNull
    public m getHeaders() {
        return this.f86094b.getHeaders();
    }

    @Override // cl.b
    @NotNull
    public x getMethod() {
        return this.f86094b.getMethod();
    }

    @Override // cl.b
    @NotNull
    public Url getUrl() {
        return this.f86094b.getUrl();
    }
}
