package yads;

import android.os.ConditionVariable;

/* JADX INFO: loaded from: classes3.dex */
public final class uy2 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f95878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vy2 f95879c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy2(vy2 vy2Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f95879c = vy2Var;
        this.f95878b = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f95879c) {
            this.f95878b.open();
            this.f95879c.b();
            this.f95879c.f96229b.getClass();
        }
    }
}
