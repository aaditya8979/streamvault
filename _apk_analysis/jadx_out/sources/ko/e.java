package ko;

import java.util.concurrent.Executor;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import org.jetbrains.annotations.NotNull;
import p000do.j1;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes4.dex */
public class e extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f73180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f73181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f73182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f73183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public CoroutineScheduler f73184g = L();

    public e(int i10, int i11, long j10, @NotNull String str) {
        this.f73180c = i10;
        this.f73181d = i11;
        this.f73182e = j10;
        this.f73183f = str;
    }

    @Override // p000do.j1
    @NotNull
    public Executor I() {
        return this.f73184g;
    }

    public final CoroutineScheduler L() {
        return new CoroutineScheduler(this.f73180c, this.f73181d, this.f73182e, this.f73183f);
    }

    public final void M(@NotNull Runnable runnable, boolean z10, boolean z11) {
        this.f73184g.m(runnable, z10, z11);
    }

    @Override // p000do.h0
    public void dispatch(@NotNull kotlin.coroutines.d dVar, @NotNull Runnable runnable) {
        CoroutineScheduler.n(this.f73184g, runnable, false, false, 6, null);
    }

    @Override // p000do.h0
    public void dispatchYield(@NotNull kotlin.coroutines.d dVar, @NotNull Runnable runnable) {
        CoroutineScheduler.n(this.f73184g, runnable, false, true, 2, null);
    }
}
