package jh;

import android.app.Activity;
import android.os.Handler;
import bp.r0;
import com.vungle.ads.AdConfig;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.VungleError;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements InitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f72459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f72460b;

    public p0(l lVar, Activity activity) {
        this.f72460b = lVar;
        this.f72459a = activity;
    }

    public final /* synthetic */ void a() {
        l lVar = this.f72460b;
        if (lVar.E) {
            return;
        }
        lVar.v("load ad time out");
        this.f72460b.F = true;
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onError(VungleError vungleError) {
        this.f72460b.x("Vungle init failed, InitCallback - onError: " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onSuccess() {
        AdConfig adConfig = new AdConfig();
        adConfig.setAdOrientation(r0.h(this.f72459a) ? 1 : 0);
        l lVar = this.f72460b;
        lVar.G = new InterstitialAd(this.f72459a, lVar.I, adConfig);
        this.f72460b.G.setAdListener(new y(this));
        this.f72460b.G.load(null);
        new Handler().postDelayed(new Runnable() { // from class: jh.o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f72456b.a();
            }
        }, this.f72460b.f71975x);
    }
}
