package b;

import android.view.View;
import com.yk.e.activity.RewardWebActivity;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RewardWebActivity f5326b;

    public j0(RewardWebActivity rewardWebActivity) {
        this.f5326b = rewardWebActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RewardWebActivity rewardWebActivity = this.f5326b;
        rewardWebActivity.f3334Ll1.onAdClose();
        rewardWebActivity.finish();
    }
}
