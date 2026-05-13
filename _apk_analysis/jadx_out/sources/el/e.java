package el;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ClientEvents.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final dl.c f61160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Throwable f61161b;

    public e(@NotNull dl.c cVar, @NotNull Throwable th2) {
        p.k(cVar, "response");
        p.k(th2, "cause");
        this.f61160a = cVar;
        this.f61161b = th2;
    }
}
