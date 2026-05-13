package io.bidmachine.utils.task;

import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CancelableTask implements Runnable {

    @NonNull
    private final AtomicBoolean isCanceled = new AtomicBoolean(false);

    public boolean isCanceled() {
        return this.isCanceled.get();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (isCanceled()) {
            return;
        }
        runTask();
    }

    public abstract void runTask();

    public void setCancel(boolean z10) {
        this.isCanceled.set(z10);
    }
}
