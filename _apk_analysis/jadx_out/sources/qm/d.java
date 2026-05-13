package qm;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: BlockingIgnoringReceiver.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d extends CountDownLatch implements dm.g<Throwable>, dm.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f78357b;

    public d() {
        super(1);
    }

    @Override // dm.g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable th2) {
        this.f78357b = th2;
        countDown();
    }

    @Override // dm.a
    public void run() {
        countDown();
    }
}
