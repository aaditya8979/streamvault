package io.bidmachine.rendering.utils;

import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class CountDownPostback implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f70933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f70934b;

    public CountDownPostback(int i10, @NonNull Runnable runnable) {
        this.f70933a = runnable;
        this.f70934b = new AtomicInteger(i10);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f70934b.decrementAndGet() > 0) {
            return;
        }
        this.f70933a.run();
    }
}
