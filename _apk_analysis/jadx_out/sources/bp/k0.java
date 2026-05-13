package bp;

import android.os.Handler;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f5801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f5802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w1 f5803d;

    public k0(w1 w1Var, Handler handler, j1 j1Var) {
        this.f5803d = w1Var;
        this.f5801b = handler;
        this.f5802c = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5801b.removeCallbacks(this);
        AdLog.d("getGoogleADID time out");
        this.f5803d.a("", this.f5802c);
    }
}
