package com.ironsource;

import com.ironsource.Wf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface Uf {

    public interface a {
        void a();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f30557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f30558b;

        public final long a() {
            return this.f30558b;
        }

        public final void a(long j10) {
            this.f30558b = j10;
        }

        public final long b() {
            return this.f30557a;
        }

        public final void b(long j10) {
            this.f30557a = j10;
        }
    }

    public interface c {
        @NotNull
        Uf a(@NotNull b bVar);
    }

    public static final class d implements c {
        @Override // com.ironsource.Uf.c
        @NotNull
        public Uf a(@NotNull b bVar) {
            tn.p.k(bVar, "timerConfig");
            return new e(new Wf(bVar.b()));
        }
    }

    public static final class e implements Uf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Wf f30559a;

        public static final class a implements Wf.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f30560a;

            public a(a aVar) {
                this.f30560a = aVar;
            }

            @Override // com.ironsource.Wf.a
            public void a() {
                this.f30560a.a();
            }
        }

        public e(@NotNull Wf wf2) {
            tn.p.k(wf2, "timer");
            this.f30559a = wf2;
        }

        @Override // com.ironsource.Uf
        public void a(@NotNull a aVar) {
            tn.p.k(aVar, "callback");
            this.f30559a.a((Wf.a) new a(aVar));
        }

        @Override // com.ironsource.Uf
        public void cancel() {
            this.f30559a.e();
        }
    }

    void a(@NotNull a aVar);

    void cancel();
}
