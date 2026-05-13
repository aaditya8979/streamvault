package dl;

import androidx.core.app.NotificationCompat;
import cl.h;
import gl.a0;
import gl.m;
import gl.z;
import io.ktor.client.call.HttpClientCall;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DefaultHttpResponse.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HttpClientCall f59800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.d f59801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a0 f59802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final z f59803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final nl.c f59804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final nl.c f59805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final io.ktor.utils.io.a f59806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final m f59807i;

    public a(@NotNull HttpClientCall httpClientCall, @NotNull h hVar) {
        p.k(httpClientCall, NotificationCompat.CATEGORY_CALL);
        p.k(hVar, "responseData");
        this.f59800b = httpClientCall;
        this.f59801c = hVar.b();
        this.f59802d = hVar.f();
        this.f59803e = hVar.g();
        this.f59804f = hVar.d();
        this.f59805g = hVar.e();
        Object objA = hVar.a();
        io.ktor.utils.io.a aVar = objA instanceof io.ktor.utils.io.a ? (io.ktor.utils.io.a) objA : null;
        this.f59806h = aVar == null ? io.ktor.utils.io.a.f71266a.a() : aVar;
        this.f59807i = hVar.c();
    }

    @Override // dl.c
    @NotNull
    public HttpClientCall L() {
        return this.f59800b;
    }

    @Override // dl.c
    @NotNull
    public io.ktor.utils.io.a a() {
        return this.f59806h;
    }

    @Override // dl.c
    @NotNull
    public nl.c b() {
        return this.f59804f;
    }

    @Override // dl.c
    @NotNull
    public nl.c c() {
        return this.f59805g;
    }

    @Override // dl.c
    @NotNull
    public a0 d() {
        return this.f59802d;
    }

    @Override // dl.c
    @NotNull
    public z e() {
        return this.f59803e;
    }

    @Override // p000do.l0
    @NotNull
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f59801c;
    }

    @Override // gl.u
    @NotNull
    public m getHeaders() {
        return this.f59807i;
    }
}
