package androidx.lifecycle;

import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import p000do.h0;
import p000do.w0;
import tn.p;

/* JADX INFO: compiled from: PausingDispatcher.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class PausingDispatcher extends h0 {

    @NotNull
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // p000do.h0
    public void dispatch(@NotNull kotlin.coroutines.d dVar, @NotNull Runnable runnable) {
        p.k(dVar, GAMConfig.KEY_CONTEXT);
        p.k(runnable, "block");
        this.dispatchQueue.dispatchAndEnqueue(dVar, runnable);
    }

    @Override // p000do.h0
    public boolean isDispatchNeeded(@NotNull kotlin.coroutines.d dVar) {
        p.k(dVar, GAMConfig.KEY_CONTEXT);
        if (w0.c().M().isDispatchNeeded(dVar)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }
}
