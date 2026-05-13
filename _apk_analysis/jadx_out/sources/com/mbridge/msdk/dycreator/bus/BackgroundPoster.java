package com.mbridge.msdk.dycreator.bus;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
final class BackgroundPoster implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f37137a = new PendingPostQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f37138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventBus f37139c;

    public BackgroundPoster(EventBus eventBus) {
        this.f37139c = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        PendingPost pendingPostA = PendingPost.a(subscription, obj);
        synchronized (this) {
            this.f37137a.a(pendingPostA);
            if (!this.f37138b) {
                this.f37138b = true;
                EventBus.f37140n.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost pendingPostA;
        while (true) {
            try {
                pendingPostA = this.f37137a.a(1000);
            } catch (InterruptedException e10) {
                Log.w("Event", Thread.currentThread().getName() + " was interruppted", e10);
                return;
            } finally {
                this.f37138b = false;
            }
            if (pendingPostA == null) {
                synchronized (this) {
                    pendingPostA = this.f37137a.a();
                    if (pendingPostA == null) {
                        return;
                    }
                    this.f37138b = false;
                }
            }
            this.f37139c.a(pendingPostA);
        }
    }
}
