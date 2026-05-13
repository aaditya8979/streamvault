package androidx.lifecycle;

import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.Closeable;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import p000do.l0;
import tn.p;

/* JADX INFO: compiled from: ViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class CloseableCoroutineScope implements Closeable, l0 {

    @NotNull
    private final kotlin.coroutines.d coroutineContext;

    public CloseableCoroutineScope(@NotNull kotlin.coroutines.d dVar) {
        p.k(dVar, GAMConfig.KEY_CONTEXT);
        this.coroutineContext = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        JobKt__JobKt.e(getCoroutineContext(), null, 1, null);
    }

    @Override // p000do.l0
    @NotNull
    public kotlin.coroutines.d getCoroutineContext() {
        return this.coroutineContext;
    }
}
