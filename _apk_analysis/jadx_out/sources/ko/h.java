package ko;

import org.jetbrains.annotations.NotNull;
import p000do.m0;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Runnable f73187d;

    public h(@NotNull Runnable runnable, long j10, boolean z10) {
        super(j10, z10);
        this.f73187d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f73187d.run();
    }

    @NotNull
    public String toString() {
        return "Task[" + m0.a(this.f73187d) + '@' + m0.b(this.f73187d) + ", " + this.f73185b + ", " + i.c(this.f73186c) + ']';
    }
}
