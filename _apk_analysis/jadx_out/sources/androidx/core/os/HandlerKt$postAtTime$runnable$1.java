package androidx.core.os;

import bn.r;

/* JADX INFO: compiled from: Handler.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class HandlerKt$postAtTime$runnable$1 implements Runnable {
    public final /* synthetic */ sn.a<r> $action;

    public HandlerKt$postAtTime$runnable$1(sn.a<r> aVar) {
        this.$action = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.$action.invoke();
    }
}
