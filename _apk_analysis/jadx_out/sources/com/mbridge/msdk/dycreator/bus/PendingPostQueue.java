package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: loaded from: classes11.dex */
final class PendingPostQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PendingPost f37168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PendingPost f37169b;

    public synchronized PendingPost a() {
        PendingPost pendingPost;
        pendingPost = this.f37168a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.f37167c;
            this.f37168a = pendingPost2;
            if (pendingPost2 == null) {
                this.f37169b = null;
            }
        }
        return pendingPost;
    }

    public synchronized PendingPost a(int i10) throws InterruptedException {
        if (this.f37168a == null) {
            wait(i10);
        }
        return a();
    }

    public synchronized void a(PendingPost pendingPost) {
        if (pendingPost == null) {
            throw new NullPointerException("null cannot be enqueued");
        }
        PendingPost pendingPost2 = this.f37169b;
        if (pendingPost2 != null) {
            pendingPost2.f37167c = pendingPost;
            this.f37169b = pendingPost;
        } else {
            if (this.f37168a != null) {
                throw new IllegalStateException("Head present, but no tail");
            }
            this.f37169b = pendingPost;
            this.f37168a = pendingPost;
        }
        notifyAll();
    }
}
