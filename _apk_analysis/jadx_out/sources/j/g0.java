package j;

import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.util.AdLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object[] f71869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0 f71870c;

    public g0(y0 y0Var, Object[] objArr) {
        this.f71870c = y0Var;
        this.f71869b = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = this.f71869b;
        String strOptString = "";
        if (objArr.length > 0) {
            j1 j1Var = this.f71870c.f72042a.f71824c;
            String str = (String) objArr[0];
            j1Var.getClass();
            try {
                strOptString = new JSONObject(str).optString("info", "");
            } catch (Exception e10) {
                AdLog.e(e10.getMessage(), e10);
            }
        }
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack = this.f71870c.f72042a.f71823b;
        if (mainRewardVideoAdCallBack != null) {
            mainRewardVideoAdCallBack.onReward(strOptString);
        }
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack2 = this.f71870c.f72042a.f71824c.f71897f;
        if (mainRewardVideoAdCallBack2 != null) {
            mainRewardVideoAdCallBack2.onReward(strOptString);
        }
    }
}
