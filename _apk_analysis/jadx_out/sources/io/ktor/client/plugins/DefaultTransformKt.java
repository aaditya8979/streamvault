package io.ktor.client.plugins;

import cl.g;
import dl.e;
import io.ktor.client.HttpClient;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DefaultTransform.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DefaultTransformKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final rs.c f71095a = pl.a.a("io.ktor.client.plugins.defaultTransformers");

    public static final void b(@NotNull HttpClient httpClient) {
        p.k(httpClient, "<this>");
        httpClient.n().l(g.f6705h.b(), new DefaultTransformKt$defaultTransformers$1(null));
        httpClient.o().l(e.f59815h.a(), new DefaultTransformKt$defaultTransformers$2(httpClient, null));
        DefaultTransformersJvmKt.b(httpClient);
    }
}
