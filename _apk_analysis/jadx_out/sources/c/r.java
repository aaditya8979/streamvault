package c;

import android.app.Activity;
import com.facebook.ads.RewardedVideoAd;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes11.dex */
public final class r implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f6486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f6487b;

    public r(w wVar, Activity activity) {
        this.f6487b = wVar;
        this.f6486a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f6487b.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        this.f6487b.C = new RewardedVideoAd(this.f6486a.getApplicationContext(), this.f6487b.D);
        RewardedVideoAd rewardedVideoAd = this.f6487b.C;
        rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(this.f6487b.E).build());
    }
}
