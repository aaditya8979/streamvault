package io.ktor.client.plugins;

import bn.r;
import io.ktor.client.plugins.DefaultRequest;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;
import uk.h;

/* JADX INFO: compiled from: DefaultRequest.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final rs.c f71161a = pl.a.a("io.ktor.client.plugins.DefaultRequest");

    public static final void c(@NotNull h<?> hVar, @NotNull final l<? super DefaultRequest.a, r> lVar) {
        p.k(hVar, "<this>");
        p.k(lVar, "block");
        hVar.m(DefaultRequest.f71087b, new l() { // from class: zk.c
            @Override // sn.l
            public final Object invoke(Object obj) {
                return io.ktor.client.plugins.a.d(lVar, (DefaultRequest.a) obj);
            }
        });
    }

    public static final r d(l lVar, DefaultRequest.a aVar) {
        p.k(aVar, "$this$install");
        lVar.invoke(aVar);
        return r.f5635a;
    }
}
