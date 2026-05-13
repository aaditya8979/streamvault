package b;

import android.app.Activity;
import android.view.View;
import com.yk.e.activity.MainInterstitialActivity;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f5311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainInterstitialActivity f5312c;

    public c0(MainInterstitialActivity mainInterstitialActivity, Activity activity) {
        this.f5312c = mainInterstitialActivity;
        this.f5311b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainInterstitialActivity mainInterstitialActivity = this.f5312c;
        Activity activity = this.f5311b;
        int i10 = MainInterstitialActivity.I11L;
        if (bp.c.f5737b == null) {
            mainInterstitialActivity.getClass();
            bp.c.f5737b = new bp.c();
        }
        bp.c.f5737b.a(activity, 6, mainInterstitialActivity.ILil, mainInterstitialActivity.f3319ILl.adPlcID, false);
        this.f5312c.f59311Lil.onAdClick();
        this.f5312c.f59311Lil.onAdClose();
        this.f5312c.IL1Iii(this.f5311b);
    }
}
