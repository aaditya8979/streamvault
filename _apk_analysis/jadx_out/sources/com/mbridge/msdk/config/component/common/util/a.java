package com.mbridge.msdk.config.component.common.util;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ApiCallResultLatch.java */
/* JADX INFO: loaded from: classes9.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f35957a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<T> f35958b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f35959c = new AtomicBoolean(false);

    public T a(long j10) throws InterruptedException {
        if (this.f35957a.await(j10, TimeUnit.MILLISECONDS)) {
            return this.f35958b.get();
        }
        return null;
    }

    public boolean a(T t10) {
        if (!this.f35959c.compareAndSet(false, true)) {
            return false;
        }
        this.f35958b.set(t10);
        this.f35957a.countDown();
        return true;
    }
}
