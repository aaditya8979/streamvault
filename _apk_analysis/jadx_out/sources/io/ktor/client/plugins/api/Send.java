package io.ktor.client.plugins.api;

import cl.d;
import hn.c;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpSend;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.q;
import tn.p;
import zk.m;

/* JADX INFO: compiled from: CommonHooks.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class Send implements al.a<q<? super a, ? super d, ? super c<? super HttpClientCall>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Send f71163a = new Send();

    /* JADX INFO: compiled from: CommonHooks.kt */
    public static final class a implements l0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final zk.l0 f71164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final kotlin.coroutines.d f71165c;

        public a(@NotNull zk.l0 l0Var, @NotNull kotlin.coroutines.d dVar) {
            p.k(l0Var, "httpSendSender");
            p.k(dVar, "coroutineContext");
            this.f71164b = l0Var;
            this.f71165c = dVar;
        }

        @Nullable
        public final Object a(@NotNull d dVar, @NotNull c<? super HttpClientCall> cVar) {
            return this.f71164b.a(dVar, cVar);
        }

        @Override // p000do.l0
        @NotNull
        public kotlin.coroutines.d getCoroutineContext() {
            return this.f71165c;
        }
    }

    @Override // al.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull HttpClient httpClient, @NotNull q<? super a, ? super d, ? super c<? super HttpClientCall>, ? extends Object> qVar) {
        p.k(httpClient, "client");
        p.k(qVar, "handler");
        ((HttpSend) m.b(httpClient, HttpSend.f71141c)).d(new Send$install$1(qVar, httpClient, null));
    }
}
