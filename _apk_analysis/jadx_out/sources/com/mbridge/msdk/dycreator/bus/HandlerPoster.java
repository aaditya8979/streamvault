package com.mbridge.msdk.dycreator.bus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes9.dex */
final class HandlerPoster extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f37160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventBus f37162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f37163d;

    public HandlerPoster(EventBus eventBus, Looper looper, int i10) {
        super(looper);
        this.f37162c = eventBus;
        this.f37161b = i10;
        this.f37160a = new PendingPostQueue();
    }

    public void a(Subscription subscription, Object obj) {
        PendingPost pendingPostA = PendingPost.a(subscription, obj);
        synchronized (this) {
            this.f37160a.a(pendingPostA);
            if (!this.f37163d) {
                this.f37163d = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                PendingPost pendingPostA = this.f37160a.a();
                if (pendingPostA == null) {
                    synchronized (this) {
                        pendingPostA = this.f37160a.a();
                        if (pendingPostA == null) {
                            return;
                        }
                    }
                }
                this.f37162c.a(pendingPostA);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f37161b);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f37163d = true;
        } finally {
            this.f37163d = false;
        }
    }
}
