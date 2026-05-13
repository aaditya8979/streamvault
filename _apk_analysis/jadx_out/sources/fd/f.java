package fd;

import android.app.Activity;
import android.util.Log;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.wangxiong.sdk.callBack.InterstitialAdCallBack;
import com.wangxiong.sdk.view.InterstitialAdLoader;
import com.yk.e.object.AdInfo;

/* JADX INFO: compiled from: WxInterstitialAD.java */
/* JADX INFO: loaded from: classes8.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f61649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterstitialAdLoader f61650b;

    /* JADX INFO: compiled from: WxInterstitialAD.java */
    public class a implements InterstitialAdCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f61651a;

        public a(AdInfoDetailEntry adInfoDetailEntry) {
            this.f61651a = adInfoDetailEntry;
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdClick() {
            Log.i("TAG", "插屏广告-被点击");
            ed.c.e(3, this.f61651a.getAd_type(), this.f61651a.getAd_source_id(), 9, this.f61651a.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainInterstitialAdCallBack
        public void onAdClose() {
            Log.i("TAG", "插屏广告-关闭");
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdFail(int i10, String str) {
            Log.i("TAG", "插屏广告-error = " + str);
            ed.c.e(1, this.f61651a.getAd_type(), this.f61651a.getAd_source_id(), 9, this.f61651a.getAd_id(), 0, 0, 0);
            ed.c.d("adposition:9 Ad_source_id:" + this.f61651a.getAd_source_id() + " +s:" + i10 + " s1:" + str);
        }

        @Override // com.yk.e.callBack.MainInterstitialAdCallBack
        public void onAdLoaded() {
            Log.i("TAG", "插屏广告-缓存完成");
            if (f.this.f61649a != null) {
                f.this.f61650b.showAd();
                ed.c.e(4, this.f61651a.getAd_type(), this.f61651a.getAd_source_id(), 9, this.f61651a.getAd_id(), 1, 0, 0);
            }
        }

        @Override // com.yk.e.callBack.MainInterstitialAdCallBack
        public void onAdShow(AdInfo adInfo) {
            Log.i("TAG", "插屏广告-展示");
            ed.c.e(2, this.f61651a.getAd_type(), this.f61651a.getAd_source_id(), 9, this.f61651a.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainInterstitialAdCallBack
        public void onAdVideoComplete() {
            Log.i("TAG", "插屏广告-视频播放完成");
        }

        @Override // com.yk.e.callBack.MainInterstitialAdCallBack
        public void onAdVideoStart() {
            Log.i("TAG", "插屏广告-视频开始播放");
        }
    }

    public f(Activity activity) {
        this.f61649a = activity;
    }

    public void b(AdInfoDetailEntry adInfoDetailEntry) {
        try {
            InterstitialAdLoader interstitialAdLoader = new InterstitialAdLoader(this.f61649a, adInfoDetailEntry.getSdk_ad_id(), new a(adInfoDetailEntry));
            this.f61650b = interstitialAdLoader;
            interstitialAdLoader.loadAd();
            ed.c.e(7, adInfoDetailEntry.getAd_type(), adInfoDetailEntry.getAd_source_id(), 9, adInfoDetailEntry.getAd_id(), 0, 0, 0);
            this.f61650b.setVideoHasVoice(false);
        } catch (Exception unused) {
        }
    }
}
