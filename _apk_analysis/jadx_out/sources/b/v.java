package b;

import android.view.View;
import com.yk.e.activity.BaseVideoActivity;
import com.yk.e.activity.RewardVideoActivity;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseVideoActivity f5340b;

    public v(RewardVideoActivity rewardVideoActivity) {
        this.f5340b = rewardVideoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f5340b.closeAd();
    }
}
