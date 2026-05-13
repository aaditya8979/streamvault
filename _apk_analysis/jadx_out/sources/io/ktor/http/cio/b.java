package io.ktor.http.cio;

import no.r;
import org.jetbrains.annotations.NotNull;
import p000do.p0;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Multipart.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b {

    /* JADX INFO: compiled from: Multipart.kt */
    public static final class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final r f71190a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull r rVar) {
            super(null);
            p.k(rVar, "body");
            this.f71190a = rVar;
        }
    }

    /* JADX INFO: renamed from: io.ktor.http.cio.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Multipart.kt */
    public static final class C0844b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final p0<hl.a> f71191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final io.ktor.utils.io.a f71192b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0844b(@NotNull p0<hl.a> p0Var, @NotNull io.ktor.utils.io.a aVar) {
            super(null);
            p.k(p0Var, "headers");
            p.k(aVar, "body");
            this.f71191a = p0Var;
            this.f71192b = aVar;
        }
    }

    /* JADX INFO: compiled from: Multipart.kt */
    public static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final r f71193a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull r rVar) {
            super(null);
            p.k(rVar, "body");
            this.f71193a = rVar;
        }
    }

    public b() {
    }

    public /* synthetic */ b(i iVar) {
        this();
    }
}
