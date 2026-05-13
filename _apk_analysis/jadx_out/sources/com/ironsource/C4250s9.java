package com.ironsource;

import android.os.Handler;
import com.ironsource.environment.thread.IronSourceThreadManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.s9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4250s9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f33521a;

    /* JADX INFO: renamed from: com.ironsource.s9$a */
    public static final class a extends AbstractRunnableC4078ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f33522b;

        public a(Runnable runnable) {
            this.f33522b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            this.f33522b.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4250s9() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C4250s9(@NotNull Handler handler) {
        tn.p.k(handler, "handler");
        this.f33521a = handler;
    }

    public /* synthetic */ C4250s9(Handler handler, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? new Handler(IronSourceThreadManager.INSTANCE.getSharedManagersThread().getLooper()) : handler);
    }

    public static /* synthetic */ void a(C4250s9 c4250s9, AbstractRunnableC4078ie abstractRunnableC4078ie, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c4250s9.a(abstractRunnableC4078ie, j10);
    }

    private final void c(Runnable runnable) {
        AbstractRunnableC4078ie aVar = runnable instanceof AbstractRunnableC4078ie ? (AbstractRunnableC4078ie) runnable : new a(runnable);
        if (Thread.currentThread().getId() == this.f33521a.getLooper().getThread().getId()) {
            aVar.run();
        } else {
            a(this, aVar, 0L, 2, null);
        }
    }

    @NotNull
    public final Handler a() {
        return this.f33521a;
    }

    public final void a(@NotNull AbstractRunnableC4078ie abstractRunnableC4078ie) {
        tn.p.k(abstractRunnableC4078ie, "task");
        this.f33521a.removeCallbacks(abstractRunnableC4078ie);
    }

    public final void a(@NotNull AbstractRunnableC4078ie abstractRunnableC4078ie, long j10) {
        tn.p.k(abstractRunnableC4078ie, "task");
        this.f33521a.postDelayed(abstractRunnableC4078ie, j10);
    }

    public final void a(@NotNull Runnable runnable) {
        tn.p.k(runnable, "callback");
        c(runnable);
    }

    public final void b(@NotNull Runnable runnable) {
        tn.p.k(runnable, "runnable");
        c(runnable);
    }
}
