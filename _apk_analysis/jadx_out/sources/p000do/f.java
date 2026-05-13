package p000do;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EventLoop.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class f extends d1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Thread f59852h;

    public f(@NotNull Thread thread) {
        this.f59852h = thread;
    }

    @Override // p000do.e1
    @NotNull
    public Thread X() {
        return this.f59852h;
    }
}
