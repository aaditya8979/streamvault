package com.moloco.sdk.acm.recorder;

import com.ironsource.C3978d4;
import com.moloco.sdk.acm.AndroidClientMetrics;
import com.moloco.sdk.acm.e;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes6.dex */
public interface a {

    @NotNull
    public static final C0554a Companion = C0554a.f45877a;

    /* JADX INFO: renamed from: com.moloco.sdk.acm.recorder.a$a, reason: collision with other inner class name */
    public static final class C0554a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C0554a f45877a = new C0554a();

        @NotNull
        public final a a(@NotNull String str) {
            p.k(str, "mediation");
            return new com.moloco.sdk.acm.recorder.b(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final a b() {
            return new com.moloco.sdk.acm.recorder.b(null, 1, 0 == true ? 1 : 0);
        }
    }

    public static final class b {
        @NotNull
        public static e a(@NotNull a aVar, @NotNull String str) {
            p.k(str, C3978d4.i.f31344j0);
            return AndroidClientMetrics.f45708a.w(str);
        }
    }

    void a(@NotNull e eVar);

    void b(@NotNull com.moloco.sdk.acm.b bVar);

    @NotNull
    e c(@NotNull String str);
}
