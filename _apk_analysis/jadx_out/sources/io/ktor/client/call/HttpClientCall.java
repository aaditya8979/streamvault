package io.ktor.client.call;

import cl.b;
import cl.e;
import cl.h;
import com.vungle.ads.internal.ui.AdActivity;
import dl.c;
import io.ktor.client.HttpClient;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.d;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import tn.i;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: HttpClientCall.kt */
/* JADX INFO: loaded from: classes7.dex */
public class HttpClientCall implements l0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f71061f = new a(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f71062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final kl.a<Object> f71063h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HttpClient f71064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f71065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f71066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f71067e;

    @NotNull
    private volatile /* synthetic */ int received;

    /* JADX INFO: compiled from: HttpClientCall.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        KType kTypeM = null;
        KClass kClassB = t.b(Object.class);
        try {
            kTypeM = t.m(Object.class);
        } catch (Throwable unused) {
        }
        f71063h = new kl.a<>("CustomResponse", new rl.a(kClassB, kTypeM));
        f71062g = AtomicIntegerFieldUpdater.newUpdater(HttpClientCall.class, "received");
    }

    public HttpClientCall(@NotNull HttpClient httpClient) {
        p.k(httpClient, "client");
        this.f71064b = httpClient;
        this.received = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpClientCall(@NotNull HttpClient httpClient, @NotNull e eVar, @NotNull h hVar) {
        this(httpClient);
        p.k(httpClient, "client");
        p.k(eVar, "requestData");
        p.k(hVar, "responseData");
        j(new cl.a(this, eVar));
        k(new dl.a(this, hVar));
        kl.b attributes = getAttributes();
        kl.a<Object> aVar = f71063h;
        attributes.b(aVar);
        if (hVar.a() instanceof io.ktor.utils.io.a) {
            return;
        }
        getAttributes().f(aVar, hVar.a());
    }

    public static /* synthetic */ Object i(HttpClientCall httpClientCall, hn.c<? super io.ktor.utils.io.a> cVar) {
        return httpClientCall.e().a();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull rl.a r6, @org.jetbrains.annotations.NotNull hn.c<java.lang.Object> r7) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.call.HttpClientCall.a(rl.a, hn.c):java.lang.Object");
    }

    public boolean b() {
        return this.f71067e;
    }

    @NotNull
    public final HttpClient c() {
        return this.f71064b;
    }

    @NotNull
    public final b d() {
        b bVar = this.f71065c;
        if (bVar != null) {
            return bVar;
        }
        p.C(AdActivity.REQUEST_KEY_EXTRA);
        return null;
    }

    @NotNull
    public final c e() {
        c cVar = this.f71066d;
        if (cVar != null) {
            return cVar;
        }
        p.C("response");
        return null;
    }

    @Nullable
    public Object f(@NotNull hn.c<? super io.ktor.utils.io.a> cVar) {
        return i(this, cVar);
    }

    @NotNull
    public final kl.b getAttributes() {
        return d().getAttributes();
    }

    @Override // p000do.l0
    @NotNull
    public d getCoroutineContext() {
        return e().getCoroutineContext();
    }

    public final void j(@NotNull b bVar) {
        p.k(bVar, "<set-?>");
        this.f71065c = bVar;
    }

    public final void k(@NotNull c cVar) {
        p.k(cVar, "<set-?>");
        this.f71066d = cVar;
    }

    public final void l(@NotNull c cVar) {
        p.k(cVar, "response");
        k(cVar);
    }

    @NotNull
    public String toString() {
        return "HttpClientCall[" + d().getUrl() + ", " + e().d() + ']';
    }
}
