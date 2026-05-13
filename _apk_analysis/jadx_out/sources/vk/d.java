package vk;

import androidx.core.app.NotificationCompat;
import gl.a0;
import gl.m;
import gl.z;
import io.ktor.client.call.HttpClientCall;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: DelegatedCall.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d extends dl.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HttpClientCall f86096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final dl.c f86097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final l<dl.c, io.ktor.utils.io.a> f86098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final m f86099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.d f86100f;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull HttpClientCall httpClientCall, @NotNull dl.c cVar, @NotNull l<? super dl.c, ? extends io.ktor.utils.io.a> lVar, @NotNull m mVar) {
        p.k(httpClientCall, NotificationCompat.CATEGORY_CALL);
        p.k(cVar, "origin");
        p.k(lVar, "content");
        p.k(mVar, "headers");
        this.f86096b = httpClientCall;
        this.f86097c = cVar;
        this.f86098d = lVar;
        this.f86099e = mVar;
        this.f86100f = cVar.getCoroutineContext();
    }

    @Override // dl.c
    @NotNull
    public HttpClientCall L() {
        return this.f86096b;
    }

    @Override // dl.c
    @NotNull
    public io.ktor.utils.io.a a() {
        return this.f86098d.invoke(this.f86097c);
    }

    @Override // dl.c
    @NotNull
    public nl.c b() {
        return this.f86097c.b();
    }

    @Override // dl.c
    @NotNull
    public nl.c c() {
        return this.f86097c.c();
    }

    @Override // dl.c
    @NotNull
    public a0 d() {
        return this.f86097c.d();
    }

    @Override // dl.c
    @NotNull
    public z e() {
        return this.f86097c.e();
    }

    @Override // p000do.l0
    @NotNull
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f86100f;
    }

    @Override // gl.u
    @NotNull
    public m getHeaders() {
        return this.f86099e;
    }
}
