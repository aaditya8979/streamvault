package cl;

import androidx.core.app.NotificationCompat;
import gl.m;
import gl.x;
import io.ktor.client.call.HttpClientCall;
import io.ktor.http.Url;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DefaultHttpRequest.kt */
/* JADX INFO: loaded from: classes4.dex */
public class a implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HttpClientCall f6684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final x f6685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Url f6686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final jl.c f6687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final m f6688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final kl.b f6689g;

    public a(@NotNull HttpClientCall httpClientCall, @NotNull e eVar) {
        p.k(httpClientCall, NotificationCompat.CATEGORY_CALL);
        p.k(eVar, "data");
        this.f6684b = httpClientCall;
        this.f6685c = eVar.f();
        this.f6686d = eVar.h();
        this.f6687e = eVar.b();
        this.f6688f = eVar.e();
        this.f6689g = eVar.a();
    }

    @Override // cl.b
    @NotNull
    public HttpClientCall L() {
        return this.f6684b;
    }

    @Override // cl.b
    @NotNull
    public kl.b getAttributes() {
        return this.f6689g;
    }

    @Override // cl.b, p000do.l0
    @NotNull
    public kotlin.coroutines.d getCoroutineContext() {
        return L().getCoroutineContext();
    }

    @Override // gl.u
    @NotNull
    public m getHeaders() {
        return this.f6688f;
    }

    @Override // cl.b
    @NotNull
    public x getMethod() {
        return this.f6685c;
    }

    @Override // cl.b
    @NotNull
    public Url getUrl() {
        return this.f6686d;
    }
}
