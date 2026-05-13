package cl;

import gl.i0;
import gl.m;
import gl.n;
import gl.v;
import gl.x;
import io.ktor.http.Url;
import java.util.LinkedHashMap;
import java.util.Map;
import kl.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.j2;
import tn.p;

/* JADX INFO: compiled from: HttpRequest.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f6690g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final io.ktor.http.e f6691a = new io.ktor.http.e(null, null, 0, null, null, null, null, null, false, 511, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public x f6692b = x.f62623b.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final n f6693c = new n(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public Object f6694d = el.b.f61158a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public kotlinx.coroutines.g f6695e = j2.b(null, 1, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final kl.b f6696f = kl.d.a(true);

    /* JADX INFO: compiled from: HttpRequest.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public static final Map m() {
        return new LinkedHashMap();
    }

    @NotNull
    public final e b() {
        Url urlB = this.f6691a.b();
        x xVar = this.f6692b;
        m mVarP = getHeaders().p();
        Object obj = this.f6694d;
        jl.c cVar = obj instanceof jl.c ? (jl.c) obj : null;
        if (cVar != null) {
            return new e(urlB, xVar, mVarP, cVar, this.f6695e, this.f6696f);
        }
        throw new IllegalStateException(("No request transformation found: " + this.f6694d).toString());
    }

    @NotNull
    public final kl.b c() {
        return this.f6696f;
    }

    @NotNull
    public final Object d() {
        return this.f6694d;
    }

    @Nullable
    public final rl.a e() {
        return (rl.a) this.f6696f.e(j.a());
    }

    @Nullable
    public final <T> T f(@NotNull xk.d<T> dVar) {
        p.k(dVar, "key");
        Map map = (Map) this.f6696f.e(xk.e.a());
        if (map != null) {
            return (T) map.get(dVar);
        }
        return null;
    }

    @NotNull
    public final kotlinx.coroutines.g g() {
        return this.f6695e;
    }

    @Override // gl.v
    @NotNull
    public n getHeaders() {
        return this.f6693c;
    }

    @NotNull
    public final x h() {
        return this.f6692b;
    }

    @NotNull
    public final io.ktor.http.e i() {
        return this.f6691a;
    }

    public final void j(@NotNull Object obj) {
        p.k(obj, "<set-?>");
        this.f6694d = obj;
    }

    public final void k(@Nullable rl.a aVar) {
        if (aVar != null) {
            this.f6696f.f(j.a(), aVar);
        } else {
            this.f6696f.b(j.a());
        }
    }

    public final <T> void l(@NotNull xk.d<T> dVar, @NotNull T t10) {
        p.k(dVar, "key");
        p.k(t10, "capability");
        ((Map) this.f6696f.c(xk.e.a(), new sn.a() { // from class: cl.c
            @Override // sn.a
            public final Object invoke() {
                return d.m();
            }
        })).put(dVar, t10);
    }

    public final void n(@NotNull kotlinx.coroutines.g gVar) {
        p.k(gVar, "<set-?>");
        this.f6695e = gVar;
    }

    public final void o(@NotNull x xVar) {
        p.k(xVar, "<set-?>");
        this.f6692b = xVar;
    }

    @NotNull
    public final d p(@NotNull d dVar) {
        p.k(dVar, "builder");
        this.f6692b = dVar.f6692b;
        this.f6694d = dVar.f6694d;
        k(dVar.e());
        i0.j(this.f6691a, dVar.f6691a);
        io.ktor.http.e eVar = this.f6691a;
        eVar.v(eVar.g());
        y.c(getHeaders(), dVar.getHeaders());
        kl.e.a(this.f6696f, dVar.f6696f);
        return this;
    }

    @NotNull
    public final d q(@NotNull d dVar) {
        p.k(dVar, "builder");
        this.f6695e = dVar.f6695e;
        return p(dVar);
    }
}
