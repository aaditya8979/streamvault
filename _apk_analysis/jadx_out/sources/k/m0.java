package k;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends TimerTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f72653b;

    public m0(x xVar) {
        this.f72653b = xVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f72653b.Q.sendEmptyMessage(1);
    }
}
