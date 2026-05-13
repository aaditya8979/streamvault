package b;

import android.view.View;
import com.yk.e.activity.BaseVideoActivity;
import com.yk.e.activity.RewardVideoActivity;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseVideoActivity f5310b;

    public c(RewardVideoActivity rewardVideoActivity) {
        this.f5310b = rewardVideoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f5310b.closeAd();
    }
}
