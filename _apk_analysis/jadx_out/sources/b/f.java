package b;

import android.view.View;
import com.yk.e.activity.BaseVideoActivity;
import com.yk.e.activity.RewardVideoActivity;
import com.yk.e.util.AdPlayer;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseVideoActivity f5317b;

    public f(RewardVideoActivity rewardVideoActivity) {
        this.f5317b = rewardVideoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BaseVideoActivity baseVideoActivity = this.f5317b;
        baseVideoActivity.f3291L111 = true;
        baseVideoActivity.showDetail(true);
        AdPlayer adPlayer = this.f5317b.baseAdPlayer;
        if (adPlayer != null) {
            adPlayer.stop();
        }
    }
}
