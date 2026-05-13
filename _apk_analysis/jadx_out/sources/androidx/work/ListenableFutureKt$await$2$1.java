package androidx.work;

import c8.i;
import hn.c;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import p000do.k;

/* JADX INFO: compiled from: ListenableFuture.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lbn/r;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class ListenableFutureKt$await$2$1 implements Runnable {
    public final /* synthetic */ k<R> $cancellableContinuation;
    public final /* synthetic */ i<R> $this_await;

    /* JADX WARN: Multi-variable type inference failed */
    public ListenableFutureKt$await$2$1(k<? super R> kVar, i<R> iVar) {
        this.$cancellableContinuation = kVar;
        this.$this_await = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            c cVar = this.$cancellableContinuation;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m7534constructorimpl(this.$this_await.get()));
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                cause = th2;
            }
            if (th2 instanceof CancellationException) {
                this.$cancellableContinuation.a(cause);
                return;
            }
            c cVar2 = this.$cancellableContinuation;
            Result.a aVar2 = Result.Companion;
            cVar2.resumeWith(Result.m7534constructorimpl(kotlin.c.a(cause)));
        }
    }
}
