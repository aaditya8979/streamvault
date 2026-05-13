package io.bidmachine.rendering.utils.taskmanager;

import io.bidmachine.rendering.utils.Cancelable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public abstract class CancelableTask implements Runnable, Cancelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f70973a = new AtomicBoolean(false);

    @Override // io.bidmachine.rendering.utils.Cancelable
    public boolean isCanceled() {
        return this.f70973a.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isCanceled()) {
            return;
        }
        runTask();
    }

    public abstract void runTask();

    @Override // io.bidmachine.rendering.utils.Cancelable
    public void setCancel(boolean z10) {
        this.f70973a.set(z10);
    }
}
