package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: loaded from: classes12.dex */
class AsyncPoster implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f37135a = new PendingPostQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EventBus f37136b;

    public AsyncPoster(EventBus eventBus) {
        this.f37136b = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        this.f37135a.a(PendingPost.a(subscription, obj));
        EventBus.f37140n.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost pendingPostA = this.f37135a.a();
        if (pendingPostA == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f37136b.a(pendingPostA);
    }
}
