package k;

import android.app.Activity;
import android.os.Handler;
import com.vungle.ads.AdConfig;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.VungleError;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements InitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f72640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f72641b;

    public e0(a0 a0Var, Activity activity) {
        this.f72641b = a0Var;
        this.f72640a = activity;
    }

    public final /* synthetic */ void a() {
        a0 a0Var = this.f72641b;
        if (a0Var.E) {
            return;
        }
        a0Var.v("load ad time out");
        this.f72641b.F = true;
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onError(VungleError vungleError) {
        this.f72641b.x("Vungle init failed, InitCallback - onError: " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onSuccess() {
        AdConfig adConfig = new AdConfig();
        adConfig.setAdOrientation(bp.r0.h(this.f72640a) ? 1 : 0);
        a0 a0Var = this.f72641b;
        a0Var.I = new InterstitialAd(this.f72640a, a0Var.H, adConfig);
        this.f72641b.I.setAdListener(new r0(this));
        this.f72641b.I.load(null);
        new Handler().postDelayed(new Runnable() { // from class: k.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f72638b.a();
            }
        }, this.f72641b.f71975x);
    }
}
