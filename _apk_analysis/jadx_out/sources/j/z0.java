package j;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
public final class z0 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f72047a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(n0 n0Var, Looper looper) {
        super(looper);
        this.f72047a = n0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        synchronized (this.f72047a.f71971t) {
            n0 n0Var = this.f72047a;
            int i10 = n0Var.f71972u + 1;
            n0Var.f71972u = i10;
            if (i10 == 2) {
                n0Var.f71973v = true;
                n0Var.z();
            }
        }
    }
}
