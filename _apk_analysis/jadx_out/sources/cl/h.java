package cl;

import gl.a0;
import gl.m;
import gl.z;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: HttpRequest.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a0 f6712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final nl.c f6713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final m f6714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final z f6715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Object f6716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.d f6717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final nl.c f6718g;

    public h(@NotNull a0 a0Var, @NotNull nl.c cVar, @NotNull m mVar, @NotNull z zVar, @NotNull Object obj, @NotNull kotlin.coroutines.d dVar) {
        p.k(a0Var, "statusCode");
        p.k(cVar, "requestTime");
        p.k(mVar, "headers");
        p.k(zVar, "version");
        p.k(obj, "body");
        p.k(dVar, "callContext");
        this.f6712a = a0Var;
        this.f6713b = cVar;
        this.f6714c = mVar;
        this.f6715d = zVar;
        this.f6716e = obj;
        this.f6717f = dVar;
        this.f6718g = io.ktor.util.date.a.b(null, 1, null);
    }

    @NotNull
    public final Object a() {
        return this.f6716e;
    }

    @NotNull
    public final kotlin.coroutines.d b() {
        return this.f6717f;
    }

    @NotNull
    public final m c() {
        return this.f6714c;
    }

    @NotNull
    public final nl.c d() {
        return this.f6713b;
    }

    @NotNull
    public final nl.c e() {
        return this.f6718g;
    }

    @NotNull
    public final a0 f() {
        return this.f6712a;
    }

    @NotNull
    public final z g() {
        return this.f6715d;
    }

    @NotNull
    public String toString() {
        return "HttpResponseData=(statusCode=" + this.f6712a + ')';
    }
}
