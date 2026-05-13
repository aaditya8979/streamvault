package io.ktor.client.plugins;

import bn.r;
import cl.g;
import cn.f0;
import cn.v;
import com.ironsource.Q6;
import gl.c0;
import gl.i0;
import gl.n;
import io.ktor.client.HttpClient;
import io.ktor.http.Url;
import io.ktor.http.e;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kl.d;
import kl.y;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.i;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: DefaultRequest.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DefaultRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Plugin f71087b = new Plugin(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final kl.a<DefaultRequest> f71088c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final l<a, r> f71089a;

    /* JADX INFO: compiled from: DefaultRequest.kt */
    public static final class Plugin implements zk.l<a, DefaultRequest> {
        public Plugin() {
        }

        public /* synthetic */ Plugin(i iVar) {
            this();
        }

        public final List<String> d(List<String> list, List<String> list2) {
            if (list2.isEmpty()) {
                return list;
            }
            if (list.isEmpty()) {
                return list2;
            }
            if (((CharSequence) f0.t0(list2)).length() == 0) {
                return list2;
            }
            List listD = v.d((list.size() + list2.size()) - 1);
            int size = list.size() - 1;
            for (int i10 = 0; i10 < size; i10++) {
                listD.add(list.get(i10));
            }
            listD.addAll(list2);
            return v.a(listD);
        }

        @Override // zk.l
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(@NotNull DefaultRequest defaultRequest, @NotNull HttpClient httpClient) {
            p.k(defaultRequest, Q6.L);
            p.k(httpClient, "scope");
            httpClient.n().l(g.f6705h.a(), new DefaultRequest$Plugin$install$1(defaultRequest, null));
        }

        public final void f(Url url, e eVar) {
            if (eVar.p() == null) {
                eVar.A(url.getProtocolOrNull());
            }
            if (eVar.j().length() > 0) {
                return;
            }
            e eVarB = i0.b(url);
            eVarB.A(eVar.p());
            if (eVar.n() != 0) {
                eVarB.y(eVar.n());
            }
            eVarB.v(DefaultRequest.f71087b.d(eVarB.g(), eVar.g()));
            if (eVar.d().length() > 0) {
                eVarB.s(eVar.d());
            }
            c0 c0VarB = io.ktor.http.c.b(0, 1, null);
            y.c(c0VarB, eVarB.e());
            eVarB.t(eVar.e());
            Iterator<T> it = c0VarB.entries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (!eVarB.e().contains(str)) {
                    eVarB.e().c(str, list);
                }
            }
            i0.j(eVar, eVarB);
        }

        @Override // zk.l
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public DefaultRequest b(@NotNull l<? super a, r> lVar) {
            p.k(lVar, "block");
            return new DefaultRequest(lVar, null);
        }

        @Override // zk.l
        @NotNull
        public kl.a<DefaultRequest> getKey() {
            return DefaultRequest.f71088c;
        }
    }

    /* JADX INFO: compiled from: DefaultRequest.kt */
    public static final class a implements gl.v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final n f71090a = new n(0, 1, null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final e f71091b = new e(null, null, 0, null, null, null, null, null, false, 511, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final kl.b f71092c = d.a(true);

        @NotNull
        public final kl.b a() {
            return this.f71092c;
        }

        @NotNull
        public final e b() {
            return this.f71091b;
        }

        @Override // gl.v
        @NotNull
        public n getHeaders() {
            return this.f71090a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        KType kTypeM = null;
        KClass kClassB = t.b(DefaultRequest.class);
        try {
            kTypeM = t.m(DefaultRequest.class);
        } catch (Throwable unused) {
        }
        f71088c = new kl.a<>("DefaultRequest", new rl.a(kClassB, kTypeM));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultRequest(l<? super a, r> lVar) {
        this.f71089a = lVar;
    }

    public /* synthetic */ DefaultRequest(l lVar, i iVar) {
        this(lVar);
    }
}
