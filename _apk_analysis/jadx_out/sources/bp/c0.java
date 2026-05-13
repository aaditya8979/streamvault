package bp;

import com.yk.e.object.MainParams;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f5739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5740c;

    public c0(a0 a0Var, int i10) {
        this.f5739b = a0Var;
        this.f5740c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0 a0Var = this.f5739b;
        if (a0Var != null) {
            int i10 = this.f5740c;
            AdLog.d("checkGpDetailsUlr code = " + i10 + ", time = " + (System.currentTimeMillis() - a0Var.f5714a) + "ms");
            j.r rVar = a0Var.f5715b;
            if (rVar != null) {
                boolean z10 = i10 != 200;
                Constant.clickUrlHashMap.put(rVar.f72002a.f71961j.clickUrl, Boolean.valueOf(z10));
                String str = "checkClickUrl 是否使用备用地址：" + z10;
                AdLog.d("BaseMainAd", "TaskFinish, platform = " + rVar.f72002a.f71959h + ", task = " + str);
                j.n0 n0Var = rVar.f72002a;
                MainParams mainParams = n0Var.f71961j;
                mainParams.realClickUlr = z10 ? mainParams.webUrl : mainParams.clickUrl;
                mainParams.isUserWebUrl = z10;
                AdLog.d("BaseMainAd", "onCheckUrlFinish");
                n0Var.A.sendEmptyMessage(0);
            }
        }
    }
}
