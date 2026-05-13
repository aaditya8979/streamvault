package io.ktor.client.plugins;

import cl.d;
import dl.e;
import gl.f;
import gl.s;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.ktor.client.HttpClient;
import java.io.InputStream;
import jl.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: DefaultTransformersJvm.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DefaultTransformersJvmKt {

    /* JADX INFO: compiled from: DefaultTransformersJvm.kt */
    public static final class a extends c.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f71102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f71103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f71104c;

        public a(d dVar, f fVar, Object obj) {
            this.f71104c = obj;
            String strJ = dVar.getHeaders().j(s.f62569a.g());
            this.f71102a = strJ != null ? Long.valueOf(Long.parseLong(strJ)) : null;
            this.f71103b = fVar == null ? f.a.f62501a.a() : fVar;
        }

        @Override // jl.c
        public Long a() {
            return this.f71102a;
        }

        @Override // jl.c
        public f b() {
            return this.f71103b;
        }

        @Override // jl.c.d
        public io.ktor.utils.io.a d() {
            return vl.a.c((InputStream) this.f71104c, null, null, 3, null);
        }
    }

    @Nullable
    public static final jl.c a(@Nullable f fVar, @NotNull d dVar, @NotNull Object obj) {
        p.k(dVar, GAMConfig.KEY_CONTEXT);
        p.k(obj, "body");
        if (obj instanceof InputStream) {
            return new a(dVar, fVar, obj);
        }
        return null;
    }

    public static final void b(@NotNull HttpClient httpClient) {
        p.k(httpClient, "<this>");
        httpClient.o().l(e.f59815h.a(), new DefaultTransformersJvmKt$platformResponseDefaultTransformers$1(null));
    }
}
