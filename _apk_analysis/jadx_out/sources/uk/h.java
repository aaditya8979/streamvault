package uk;

import bn.r;
import com.ironsource.Q6;
import io.ktor.client.HttpClient;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import tn.p;
import xk.f;
import zk.m;

/* JADX INFO: compiled from: HttpClientConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class h<T extends xk.f> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f85722g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<kl.a<?>, sn.l<HttpClient, r>> f85716a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<kl.a<?>, sn.l<Object, r>> f85717b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<String, sn.l<HttpClient, r>> f85718c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public sn.l<? super T, r> f85719d = new sn.l() { // from class: uk.d
        @Override // sn.l
        public final Object invoke(Object obj) {
            return h.f((xk.f) obj);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f85720e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f85721f = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f85723h = io.ktor.util.a.f71213a.b();

    public static final r f(xk.f fVar) {
        p.k(fVar, "<this>");
        return r.f5635a;
    }

    public static /* synthetic */ void n(h hVar, zk.l lVar, sn.l lVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar2 = new sn.l() { // from class: uk.c
                @Override // sn.l
                public final Object invoke(Object obj2) {
                    return h.o(obj2);
                }
            };
        }
        hVar.m(lVar, lVar2);
    }

    public static final r o(Object obj) {
        p.k(obj, "<this>");
        return r.f5635a;
    }

    public static final r p(sn.l lVar, sn.l lVar2, Object obj) {
        p.k(obj, "<this>");
        if (lVar != null) {
            lVar.invoke(obj);
        }
        lVar2.invoke(obj);
        return r.f5635a;
    }

    public static final r q(zk.l lVar, HttpClient httpClient) {
        p.k(httpClient, "scope");
        kl.b bVar = (kl.b) httpClient.getAttributes().c(m.a(), new sn.a() { // from class: uk.g
            @Override // sn.a
            public final Object invoke() {
                return h.r();
            }
        });
        sn.l<Object, r> lVar2 = httpClient.k().f85717b.get(lVar.getKey());
        p.h(lVar2);
        Object objB = lVar.b(lVar2);
        lVar.a(objB, httpClient);
        bVar.f(lVar.getKey(), objB);
        return r.f5635a;
    }

    public static final kl.b r() {
        return kl.d.a(true);
    }

    @NotNull
    public final sn.l<T, r> g() {
        return this.f85719d;
    }

    public final boolean h() {
        return this.f85722g;
    }

    public final boolean i() {
        return this.f85720e;
    }

    public final boolean j() {
        return this.f85721f;
    }

    public final void k(@NotNull HttpClient httpClient) {
        p.k(httpClient, "client");
        Iterator<T> it = this.f85716a.values().iterator();
        while (it.hasNext()) {
            ((sn.l) it.next()).invoke(httpClient);
        }
        Iterator<T> it2 = this.f85718c.values().iterator();
        while (it2.hasNext()) {
            ((sn.l) it2.next()).invoke(httpClient);
        }
    }

    public final void l(@NotNull String str, @NotNull sn.l<? super HttpClient, r> lVar) {
        p.k(str, "key");
        p.k(lVar, "block");
        this.f85718c.put(str, lVar);
    }

    public final <TBuilder, TPlugin> void m(@NotNull final zk.l<? extends TBuilder, TPlugin> lVar, @NotNull final sn.l<? super TBuilder, r> lVar2) {
        p.k(lVar, Q6.L);
        p.k(lVar2, "configure");
        final sn.l<Object, r> lVar3 = this.f85717b.get(lVar.getKey());
        this.f85717b.put(lVar.getKey(), new sn.l() { // from class: uk.e
            @Override // sn.l
            public final Object invoke(Object obj) {
                return h.p(lVar3, lVar2, obj);
            }
        });
        if (this.f85716a.containsKey(lVar.getKey())) {
            return;
        }
        this.f85716a.put(lVar.getKey(), new sn.l() { // from class: uk.f
            @Override // sn.l
            public final Object invoke(Object obj) {
                return h.q(lVar, (HttpClient) obj);
            }
        });
    }

    public final void s(@NotNull h<? extends T> hVar) {
        p.k(hVar, "other");
        this.f85720e = hVar.f85720e;
        this.f85721f = hVar.f85721f;
        this.f85722g = hVar.f85722g;
        this.f85716a.putAll(hVar.f85716a);
        this.f85717b.putAll(hVar.f85717b);
        this.f85718c.putAll(hVar.f85718c);
    }
}
