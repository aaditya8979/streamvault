package androidx.work.impl.background.systemalarm;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelayMetCommandHandler f5148b;

    public /* synthetic */ a(DelayMetCommandHandler delayMetCommandHandler) {
        this.f5148b = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5148b.stopWork();
    }
}
