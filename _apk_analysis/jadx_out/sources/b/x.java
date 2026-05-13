package b;

import android.os.Handler;
import android.os.Message;
import com.yk.e.activity.RewardWebActivity;
import com.yk.e.callBack.MainRewardVideoAdCallBack;
import java.util.Timer;

/* JADX INFO: loaded from: classes8.dex */
public final class x implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RewardWebActivity f5342b;

    public x(RewardWebActivity rewardWebActivity) {
        this.f5342b = rewardWebActivity;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        RewardWebActivity rewardWebActivity = this.f5342b;
        if (rewardWebActivity.f3337lIiI) {
            return false;
        }
        int i10 = rewardWebActivity.LlLI1;
        if (i10 >= 0) {
            if (i10 <= 0) {
                if (!rewardWebActivity.f59312Lil) {
                    rewardWebActivity.f59312Lil = true;
                    ((MainRewardVideoAdCallBack) rewardWebActivity.f3334Ll1).onReward("");
                }
                rewardWebActivity.ILil.setVisibility(0);
            }
            this.f5342b.I1I.setText(this.f5342b.LlLI1 + "秒之后获得奖励");
            RewardWebActivity rewardWebActivity2 = this.f5342b;
            rewardWebActivity2.LlLI1 = rewardWebActivity2.LlLI1 - 1;
        } else {
            Timer timer = rewardWebActivity.f3335L11I;
            if (timer != null) {
                timer.cancel();
                this.f5342b.f3335L11I = null;
            }
            this.f5342b.I1I.setText("恭喜获得奖励！");
            RewardWebActivity rewardWebActivity3 = this.f5342b;
            if (!rewardWebActivity3.f3331ILl) {
                rewardWebActivity3.f3331ILl = true;
                rewardWebActivity3.f3334Ll1.onAdVideoComplete();
            }
        }
        return false;
    }
}
