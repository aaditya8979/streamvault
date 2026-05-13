package fd;

import android.app.Activity;
import android.util.Log;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.wangxiong.sdk.callBack.InterstitialAdCallBack;
import com.wangxiong.sdk.view.InterstitialAdLoader;
import com.yk.e.object.AdInfo;
import ic.e0;

/* JADX INFO: compiled from: WxPauseInterstitialAD.java */
/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f61653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterstitialAdLoader f61654b;

    /* JADX INFO: compiled from: WxPauseInterstitialAD.java */
    public class a implements InterstitialAdCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f61655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f61656b;

        public a(AdInfoDetailEntry adInfoDetailEntry, int i10) {
            this.f61655a = adInfoDetailEntry;
            this.f61656b = i10;
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdClick() {
            Log.i("TAG", "banner广告-被点击");
            ed.c.e(3, this.f61655a.getAd_type(), this.f61655a.getAd_source_id(), this.f61656b, this.f61655a.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainInterstitialAdCallBack
        public void onAdClose() {
            Log.i("aaaaaaaaaaa", "banner广告-关闭");
            op.a.a().b(new e0(true));
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdFail(int i10, String str) {
            Log.i("TAG", "banner广告-error = " + str);
            ed.c.e(1, this.f61655a.getAd_type(), this.f61655a.getAd_source_id(), this.f61656b, this.f61655a.getAd_id(), 0, 0, 0);
            ed.c.d("adposition:" + this.f61656b + " Ad_source_id:" + this.f61655a.getAd_source_id() + " +s:" + i10 + " s1:" + str);
        }

        @Override // com.yk.e.callBack.MainInterstitialAdCallBack
        public void onAdLoaded() {
            Log.i("TAG", "banner广告-缓存成功");
            if (g.this.f61654b != null) {
                g.this.f61654b.showAd();
            }
            ed.c.e(4, this.f61655a.getAd_type(), this.f61655a.getAd_source_id(), this.f61656b, this.f61655a.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainInterstitialAdCallBack
        public void onAdShow(AdInfo adInfo) {
            Log.i("aaaaaaaaaaa", "banner广告-展示");
            op.a.a().b(new e0(true));
            ed.c.e(2, this.f61655a.getAd_type(), this.f61655a.getAd_source_id(), this.f61656b, this.f61655a.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainInterstitialAdCallBack
        public void onAdVideoComplete() {
        }

        @Override // com.yk.e.callBack.MainInterstitialAdCallBack
        public void onAdVideoStart() {
        }
    }

    public g(Activity activity) {
        this.f61653a = activity;
    }

    public void b(AdInfoDetailEntry adInfoDetailEntry, int i10) {
        try {
            InterstitialAdLoader interstitialAdLoader = new InterstitialAdLoader(this.f61653a, adInfoDetailEntry.getSdk_ad_id(), new a(adInfoDetailEntry, i10));
            this.f61654b = interstitialAdLoader;
            interstitialAdLoader.loadAd();
            ed.c.e(7, adInfoDetailEntry.getAd_type(), adInfoDetailEntry.getAd_source_id(), i10, adInfoDetailEntry.getAd_id(), 0, 0, 0);
        } catch (Exception unused) {
        }
    }

    public void c() {
        if (this.f61654b != null) {
            this.f61654b = null;
        }
    }
}
