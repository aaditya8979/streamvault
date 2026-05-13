package jh;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import bp.r0;
import com.safedk.android.utils.Logger;
import com.yk.e.activity.MainInterstitialActivity;
import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.object.SendLoader;
import com.yk.e.pl.OktVideoView;
import com.yk.e.pl.PreloadManager;
import com.yk.e.util.AdLog;
import com.yk.e.util.AdPlayer;
import com.yk.e.util.Constant;
import com.yk.e.util.ImageHandler;
import com.yk.e.util.MainPreloadService;
import com.yk.e.util.StringUtil;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX INFO: loaded from: classes10.dex */
public final class u extends i0 {
    public Activity C;
    public MainInterstitialAdCallBack D;
    public int E = 0;
    public AdPlayer F;
    public View G;
    public OktVideoView H;

    public static void D(u uVar) {
        synchronized (uVar) {
            uVar.E++;
        }
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity activity, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        activity.startActivity(intent);
    }

    @Override // jh.i0
    public final void B(Activity activity, j.p pVar) {
        this.C = activity;
        this.D = pVar;
        try {
            if (StringUtil.isAppInstalled(activity, this.f71961j.packageName)) {
                j(AdSdkStateCode.MAIN_OWN_FAILED, e("main_app_exist"));
                return;
            }
            if (TextUtils.isEmpty(this.f71961j.videoUrl)) {
                String str = this.f71961j.imgUrl;
                String.valueOf(System.currentTimeMillis());
                new ImageHandler().preloadImg(activity, str, new k0(this, activity));
            } else {
                PreloadManager.getInstance(activity.getApplicationContext()).addPlayLoadTask(this.f71961j.videoUrl, (int) System.currentTimeMillis(), false, new j0(this, activity));
                new Handler().postDelayed(new a(this), 60000L);
            }
        } catch (Exception e10) {
            AdLog.e("MainInterstitial loadAd error, msg = " + e10.getMessage(), e10);
            n(e10);
        }
    }

    @Override // jh.i0
    public final void C() {
        SendLoader sendLoader;
        try {
            Activity activity = this.C;
            if (activity != null && !activity.isFinishing()) {
                boolean z10 = true;
                if (TextUtils.isEmpty(this.f71961j.videoUrl)) {
                    sendLoader = new SendLoader(this.f71961j, this.f71957f, 1, this.D);
                } else {
                    sendLoader = new SendLoader(this.f71961j, this.f71957f, 1, this.D);
                    sendLoader.setAdPlayer(this.F);
                    sendLoader.setOktVideoView(this.H);
                    sendLoader.setRootView(this.G);
                }
                Constant.interstitialVideoAdMap.put(this.f71961j.adID, sendLoader);
                Intent intent = new Intent();
                intent.setClass(this.C, MainInterstitialActivity.class);
                intent.putExtra(VastAttributes.AD_ID, this.f71961j.adID);
                intent.putExtra("adType", this.f71960i);
                if (this.f71961j.forceClick != 1) {
                    z10 = false;
                }
                intent.putExtra("forceClick", z10);
                safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(this.C, intent);
                o(new n0(this));
                return;
            }
            a("Ad activity is finish!");
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            n(e10);
        }
    }

    @Override // j.n0
    public final void z() {
        if (this.D == null) {
            s("adCallBack 为空！");
            return;
        }
        f(r0.a(this.f71961j.webPrice));
        this.D.onAdLoaded();
        MainPreloadService.IL1Iii(this.C);
    }
}
