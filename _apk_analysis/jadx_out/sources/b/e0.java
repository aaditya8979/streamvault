package b;

import com.yk.e.activity.BaseVideoActivity;
import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.util.IDUtil;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseVideoActivity f5316c;

    public e0(BaseVideoActivity baseVideoActivity, int i10) {
        this.f5316c = baseVideoActivity;
        this.f5315b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f5315b;
        BaseVideoActivity baseVideoActivity = this.f5316c;
        if (i10 > baseVideoActivity.f3296LlLLL) {
            baseVideoActivity.IL1Iii.setText(String.valueOf(i10 - 1));
            BaseVideoActivity baseVideoActivity2 = this.f5316c;
            if (baseVideoActivity2.I11li1) {
                return;
            }
            baseVideoActivity2.IL1Iii(this.f5315b - 1);
            return;
        }
        baseVideoActivity.IL1Iii.setVisibility(8);
        this.f5316c.f3300lIII.setVisibility(0);
        BaseVideoActivity baseVideoActivity3 = this.f5316c;
        baseVideoActivity3.f3300lIII.setText(IDUtil.getString(baseVideoActivity3, "main_skip"));
        BaseVideoActivity baseVideoActivity4 = this.f5316c;
        if (baseVideoActivity4.LL1IL) {
            return;
        }
        baseVideoActivity4.LL1IL = true;
        ((MainRewardVideoAdCallBack) baseVideoActivity4.I1I).onReward("");
    }
}
