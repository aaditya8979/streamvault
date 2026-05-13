package c;

import android.app.Activity;
import android.os.Handler;
import bp.r0;
import com.vungle.ads.AdConfig;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.VungleError;
import com.yk.e.callBack.MainRewardVideoAdCallBack;
import j.b2;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements InitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f6482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainRewardVideoAdCallBack f6483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f6484c;

    public q(d dVar, Activity activity, b2 b2Var) {
        this.f6484c = dVar;
        this.f6482a = activity;
        this.f6483b = b2Var;
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onError(VungleError vungleError) {
        this.f6484c.x("Vungle init failed, InitCallback - onError: " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onSuccess() {
        AdConfig adConfig = new AdConfig();
        adConfig.setAdOrientation(r0.h(this.f6482a) ? 1 : 0);
        d dVar = this.f6484c;
        dVar.G = new RewardedAd(this.f6482a, dVar.F, adConfig);
        this.f6484c.G.setAdListener(new q0(this));
        this.f6484c.G.load(null);
        new Handler().postDelayed(new l(this), this.f6484c.f71975x);
    }
}
