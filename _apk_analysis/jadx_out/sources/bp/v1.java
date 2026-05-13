package bp;

import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes3.dex */
public final class v1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1 f5878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f5879c;

    public v1(b1 b1Var, i1 i1Var) {
        this.f5879c = b1Var;
        this.f5878b = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b1 b1Var = this.f5879c;
        b1Var.f5733c += 200;
        AdLog.d(b1Var.f5734d, "interval_time " + this.f5879c.f5733c);
        i1 i1Var = this.f5878b;
        if (i1Var != null) {
            i1Var.b();
        }
    }
}
