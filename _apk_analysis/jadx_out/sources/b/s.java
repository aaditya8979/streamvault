package b;

import android.view.View;
import com.yk.e.activity.MainInterstitialActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainInterstitialActivity f5337b;

    public s(MainInterstitialActivity mainInterstitialActivity) {
        this.f5337b = mainInterstitialActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainInterstitialActivity mainInterstitialActivity = this.f5337b;
        mainInterstitialActivity.f59311Lil.onAdClick();
        mainInterstitialActivity.f59311Lil.onAdClose();
        MainInterstitialActivity mainInterstitialActivity2 = mainInterstitialActivity.IL1Iii;
        if (bp.c.f5737b == null) {
            bp.c.f5737b = new bp.c();
        }
        bp.c.f5737b.a(mainInterstitialActivity2, 6, mainInterstitialActivity.ILil, mainInterstitialActivity.f3319ILl.adPlcID, false);
        mainInterstitialActivity.IL1Iii(mainInterstitialActivity.IL1Iii);
    }
}
