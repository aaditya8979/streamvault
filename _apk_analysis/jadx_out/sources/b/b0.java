package b;

import com.yk.e.activity.RewardWebActivity;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 extends TimerTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RewardWebActivity f5309b;

    public b0(RewardWebActivity rewardWebActivity) {
        this.f5309b = rewardWebActivity;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f5309b.iIi1.sendEmptyMessage(1);
    }
}
