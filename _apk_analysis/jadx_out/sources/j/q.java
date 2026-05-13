package j;

import com.yk.e.callBack.MainAdCallBack;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.util.AdLog;
import com.yk.e.util.IDUtil;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainAdCallBack f71995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y1 f71996c;

    public q(y1 y1Var, MainAdCallBack mainAdCallBack) {
        this.f71996c = y1Var;
        this.f71995b = mainAdCallBack;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdLog.e("Ad platform is null!!!");
        y1 y1Var = this.f71996c;
        this.f71996c.IL1Iii(AdSdkStateCode.MAIN_LOGIC_ERROR, "platform:" + y1Var.platform + ", msg:" + IDUtil.getString(y1Var.IL1Iii, "main_ad_load_err"), this.f71995b);
    }
}
