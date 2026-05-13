package cl;

import cn.w0;
import gl.m;
import gl.x;
import io.ktor.http.Url;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: HttpRequest.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Url f6697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final x f6698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final m f6699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final jl.c f6700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.g f6701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final kl.b f6702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Set<xk.d<?>> f6703g;

    public e(@NotNull Url url, @NotNull x xVar, @NotNull m mVar, @NotNull jl.c cVar, @NotNull kotlinx.coroutines.g gVar, @NotNull kl.b bVar) {
        Set<xk.d<?>> setKeySet;
        p.k(url, "url");
        p.k(xVar, "method");
        p.k(mVar, "headers");
        p.k(cVar, "body");
        p.k(gVar, "executionContext");
        p.k(bVar, "attributes");
        this.f6697a = url;
        this.f6698b = xVar;
        this.f6699c = mVar;
        this.f6700d = cVar;
        this.f6701e = gVar;
        this.f6702f = bVar;
        Map map = (Map) bVar.e(xk.e.a());
        this.f6703g = (map == null || (setKeySet = map.keySet()) == null) ? w0.f() : setKeySet;
    }

    @NotNull
    public final kl.b a() {
        return this.f6702f;
    }

    @NotNull
    public final jl.c b() {
        return this.f6700d;
    }

    @Nullable
    public final <T> T c(@NotNull xk.d<T> dVar) {
        p.k(dVar, "key");
        Map map = (Map) this.f6702f.e(xk.e.a());
        if (map != null) {
            return (T) map.get(dVar);
        }
        return null;
    }

    @NotNull
    public final kotlinx.coroutines.g d() {
        return this.f6701e;
    }

    @NotNull
    public final m e() {
        return this.f6699c;
    }

    @NotNull
    public final x f() {
        return this.f6698b;
    }

    @NotNull
    public final Set<xk.d<?>> g() {
        return this.f6703g;
    }

    @NotNull
    public final Url h() {
        return this.f6697a;
    }

    @NotNull
    public String toString() {
        return "HttpRequestData(url=" + this.f6697a + ", method=" + this.f6698b + ')';
    }
}
