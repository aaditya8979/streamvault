package io.ktor.client.plugins;

import al.d;
import al.i;
import bn.r;
import io.ktor.client.plugins.UserAgentKt;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;
import zk.m0;

/* JADX INFO: compiled from: UserAgent.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class UserAgentKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final rs.c f71159a = pl.a.a("io.ktor.client.plugins.UserAgent");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final al.b<m0> f71160b = i.b("UserAgent", UserAgentKt$UserAgent$2.INSTANCE, new l() { // from class: zk.n0
        @Override // sn.l
        public final Object invoke(Object obj) {
            return UserAgentKt.b((al.d) obj);
        }
    });

    public static final r b(d dVar) {
        p.k(dVar, "$this$createClientPlugin");
        dVar.h(new UserAgentKt$UserAgent$3$1(((m0) dVar.e()).a(), null));
        return r.f5635a;
    }

    @NotNull
    public static final al.b<m0> d() {
        return f71160b;
    }
}
