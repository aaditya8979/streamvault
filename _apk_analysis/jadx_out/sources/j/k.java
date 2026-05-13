package j;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.yk.e.callBack.MainRefreshCallback;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f71899a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l0 l0Var, Looper looper) {
        super(looper);
        this.f71899a = l0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        i.a aVar;
        synchronized (this.f71899a.f71930x) {
            try {
                l0 l0Var = this.f71899a;
                l0Var.f71922p++;
                aVar = (i.a) message.obj;
                if (message.what == AdSdkStateCode.SUCCESS) {
                    l0.n(l0Var, aVar);
                } else if (l0.x(l0Var, aVar)) {
                    return;
                }
            } catch (Exception e10) {
                AdLog.e(e10.getMessage(), e10);
                this.f71899a.p(e10);
            }
            if (this.f71899a.s()) {
                AdLog.i("BaseSliceLoader", "bid finish has callback");
                return;
            }
            l0 l0Var2 = this.f71899a;
            if (!l0Var2.f71916j) {
                l0.d(l0Var2, aVar);
                return;
            }
            AdLog.i("BaseSliceLoader", "bid finish from refresh");
            MainRefreshCallback mainRefreshCallback = this.f71899a.f71917k;
            if (mainRefreshCallback != null) {
                mainRefreshCallback.onFinish();
            }
        }
    }
}
