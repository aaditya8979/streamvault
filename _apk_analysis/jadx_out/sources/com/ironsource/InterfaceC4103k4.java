package com.ironsource;

import com.ironsource.InterfaceC3945b7;
import com.ironsource.InterfaceC3999e7;
import com.ironsource.Uf;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.k4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC4103k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f32119a = c.f32126a;

    /* JADX INFO: renamed from: com.ironsource.k4$a */
    public static final class a implements InterfaceC4103k4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final InterfaceC3927a7 f32120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Uf f32121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final AtomicBoolean f32122d;

        /* JADX INFO: renamed from: com.ironsource.k4$a$a, reason: collision with other inner class name */
        public static final class C0391a implements Uf.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f32123a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f32124b;

            public C0391a(d dVar, a aVar) {
                this.f32123a = dVar;
                this.f32124b = aVar;
            }

            @Override // com.ironsource.Uf.a
            public void a() {
                this.f32123a.a(new InterfaceC3999e7.a(new InterfaceC3945b7.a(this.f32124b.f32120b.b())));
                this.f32124b.f32122d.set(false);
            }
        }

        public a(@NotNull InterfaceC3927a7 interfaceC3927a7, @NotNull Uf uf2) {
            tn.p.k(interfaceC3927a7, "config");
            tn.p.k(uf2, "timer");
            this.f32120b = interfaceC3927a7;
            this.f32121c = uf2;
            this.f32122d = new AtomicBoolean(false);
        }

        @Override // com.ironsource.InterfaceC4103k4
        public synchronized void a() {
            this.f32121c.cancel();
            this.f32122d.set(false);
        }

        @Override // com.ironsource.InterfaceC4103k4
        public synchronized void a(@NotNull d dVar) {
            tn.p.k(dVar, "callback");
            if (this.f32122d.compareAndSet(false, true)) {
                this.f32121c.a(new C0391a(dVar, this));
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.k4$b */
    public static final class b implements InterfaceC4103k4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f32125b = new b();

        private b() {
        }

        @Override // com.ironsource.InterfaceC4103k4
        public void a() {
        }

        @Override // com.ironsource.InterfaceC4103k4
        public void a(@NotNull d dVar) {
            tn.p.k(dVar, "callback");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.k4$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ c f32126a = new c();

        private c() {
        }

        @NotNull
        public final InterfaceC4103k4 a() {
            return b.f32125b;
        }

        @NotNull
        public final InterfaceC4103k4 a(@NotNull C3963c7 c3963c7) {
            tn.p.k(c3963c7, "featureFlag");
            if (!c3963c7.b()) {
                return b.f32125b;
            }
            Z6 z62 = new Z6(c3963c7);
            Uf.b bVar = new Uf.b();
            bVar.b(z62.a());
            bVar.a(z62.a());
            return new a(z62, new Uf.d().a(bVar));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.k4$d */
    public interface d {
        void a(@NotNull InterfaceC3999e7 interfaceC3999e7);
    }

    @NotNull
    static InterfaceC4103k4 a(@NotNull C3963c7 c3963c7) {
        return f32119a.a(c3963c7);
    }

    void a();

    void a(@NotNull d dVar);
}
