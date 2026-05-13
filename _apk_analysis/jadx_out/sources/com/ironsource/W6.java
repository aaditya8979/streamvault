package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.InterfaceC4307vf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class W6 implements InterfaceC4307vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f30621a;

    public interface a {

        /* JADX INFO: renamed from: com.ironsource.W6$a$a, reason: collision with other inner class name */
        public interface InterfaceC0367a {
            void cancel();
        }

        @NotNull
        InterfaceC0367a a(@NotNull Runnable runnable, long j10);
    }

    public static final class b extends AbstractRunnableC4078ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f30622b;

        public b(Runnable runnable) {
            this.f30622b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            this.f30622b.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public W6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public W6(@NotNull a aVar) {
        tn.p.k(aVar, "handler");
        this.f30621a = aVar;
    }

    public /* synthetic */ W6(a aVar, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? X6.a(new Handler(Looper.getMainLooper())) : aVar);
    }

    private final AbstractRunnableC4078ie a(Runnable runnable) {
        return runnable instanceof AbstractRunnableC4078ie ? (AbstractRunnableC4078ie) runnable : new b(runnable);
    }

    @Override // com.ironsource.InterfaceC4307vf
    @NotNull
    public InterfaceC4307vf.a a(@NotNull InterfaceC4307vf.b bVar, long j10) {
        tn.p.k(bVar, "task");
        return a(bVar.a(), j10);
    }

    @Override // com.ironsource.InterfaceC4307vf
    @NotNull
    public InterfaceC4307vf.a a(@NotNull Runnable runnable, long j10) {
        tn.p.k(runnable, "task");
        return new InterfaceC4307vf.a(this.f30621a.a(a(runnable), co.b.q(j10)));
    }
}
