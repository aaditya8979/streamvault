package b;

import android.app.Activity;
import android.view.View;
import com.yk.e.activity.MainInterstitialActivity;
import com.yk.e.callBack.MainInterstitialAdCallBack;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f5307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainInterstitialActivity f5308c;

    public b(MainInterstitialActivity mainInterstitialActivity, Activity activity) {
        this.f5308c = mainInterstitialActivity;
        this.f5307b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f5308c.f59311Lil;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdClose();
        }
        this.f5308c.IL1Iii(this.f5307b);
    }
}
