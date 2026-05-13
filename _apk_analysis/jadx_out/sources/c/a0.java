package c;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f6456b;

    public a0(t tVar) {
        this.f6456b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar = this.f6456b;
        PAGRewardedAd pAGRewardedAd = tVar.D;
        if (pAGRewardedAd != null) {
            pAGRewardedAd.show(tVar.B);
        }
    }
}
