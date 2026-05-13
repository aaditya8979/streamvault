package p000do;

import bn.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final h0 f59853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final k<r> f59854c;

    /* JADX WARN: Multi-variable type inference failed */
    public f2(@NotNull h0 h0Var, @NotNull k<? super r> kVar) {
        this.f59853b = h0Var;
        this.f59854c = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f59854c.s(this.f59853b, r.f5635a);
    }
}
