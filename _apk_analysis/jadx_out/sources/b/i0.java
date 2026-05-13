package b;

import android.text.TextUtils;
import com.yk.e.activity.MainInterstitialActivity;
import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.pl.BaseAdPlayer;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes11.dex */
public final class i0 implements BaseAdPlayer.IPlayerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainInterstitialActivity f5324a;

    public i0(MainInterstitialActivity mainInterstitialActivity) {
        this.f5324a = mainInterstitialActivity;
    }

    @Override // com.yk.e.pl.BaseAdPlayer.IPlayerCallback
    public final void onPlayComplete() {
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f5324a.f59311Lil;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdVideoComplete();
        }
        if (this.f5324a.ILil.playable.equals("1")) {
            AdLog.d("playableUrlLoadFailed " + this.f5324a.LlLI1);
            MainInterstitialActivity mainInterstitialActivity = this.f5324a;
            if (mainInterstitialActivity.LlLI1) {
                mainInterstitialActivity.f59311Lil.onAdClick();
                mainInterstitialActivity.f59311Lil.onAdClose();
                MainInterstitialActivity mainInterstitialActivity2 = mainInterstitialActivity.IL1Iii;
                if (bp.c.f5737b == null) {
                    bp.c.f5737b = new bp.c();
                }
                bp.c.f5737b.a(mainInterstitialActivity2, 6, mainInterstitialActivity.ILil, mainInterstitialActivity.f3319ILl.adPlcID, false);
                mainInterstitialActivity.IL1Iii(mainInterstitialActivity.IL1Iii);
                return;
            }
            if (!TextUtils.isEmpty(mainInterstitialActivity.ILil.playableUrl)) {
                this.f5324a.f3324iILLL1.setVisibility(8);
                this.f5324a.f3329il.setVisibility(8);
                this.f5324a.Ilil.setVisibility(0);
                MainInterstitialActivity mainInterstitialActivity3 = this.f5324a;
                mainInterstitialActivity3.f3320IL.loadUrl(mainInterstitialActivity3.ILil.playableUrl);
                return;
            }
            AdLog.d("playableUrl is empty!");
            MainInterstitialActivity mainInterstitialActivity4 = this.f5324a;
            mainInterstitialActivity4.f59311Lil.onAdClick();
            mainInterstitialActivity4.f59311Lil.onAdClose();
            MainInterstitialActivity mainInterstitialActivity5 = mainInterstitialActivity4.IL1Iii;
            if (bp.c.f5737b == null) {
                bp.c.f5737b = new bp.c();
            }
            bp.c.f5737b.a(mainInterstitialActivity5, 6, mainInterstitialActivity4.ILil, mainInterstitialActivity4.f3319ILl.adPlcID, false);
            mainInterstitialActivity4.IL1Iii(mainInterstitialActivity4.IL1Iii);
        }
    }

    @Override // com.yk.e.pl.BaseAdPlayer.IPlayerCallback
    public final void onPlayFailed(String str) {
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f5324a.f59311Lil;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdFail(AdSdkStateCode.MAIN_RENDER_FAILED, str);
            return;
        }
        AdLog.e("mainAdCallBack is null, msg = " + str);
    }

    @Override // com.yk.e.pl.BaseAdPlayer.IPlayerCallback
    public final void onStartPlay() {
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f5324a.f59311Lil;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdVideoStart();
        }
    }
}
