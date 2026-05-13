package c;

import com.yk.e.inf.IComCallback;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.RewardVideoAd;
import sg.bigo.ads.api.RewardVideoAdLoader;
import sg.bigo.ads.api.RewardVideoAdRequest;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f6457a;

    public b0(p pVar) {
        this.f6457a = pVar;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f6457a.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        new RewardVideoAdLoader.Builder().withAdLoadListener((AdLoadListener<RewardVideoAd>) new s(this)).build().loadAd(new RewardVideoAdRequest.Builder().withSlotId(this.f6457a.D).build());
    }
}
