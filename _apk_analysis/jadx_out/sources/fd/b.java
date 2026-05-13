package fd;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.wangxiong.sdk.callBack.BannerCallBack;
import com.wangxiong.sdk.view.BannerAd;
import com.yk.e.object.AdInfo;

/* JADX INFO: compiled from: WxBannerAD.java */
/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f61627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BannerAd f61628b;

    /* JADX INFO: compiled from: WxBannerAD.java */
    public class a implements BannerCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f61629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f61630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f61631c;

        public a(FrameLayout frameLayout, AdInfoDetailEntry adInfoDetailEntry, int i10) {
            this.f61629a = frameLayout;
            this.f61630b = adInfoDetailEntry;
            this.f61631c = i10;
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdClick() {
            Log.i("TAG", "banner广告-被点击");
            ed.c.e(3, this.f61630b.getAd_type(), this.f61630b.getAd_source_id(), this.f61631c, this.f61630b.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainBannerCallBack
        public void onAdClose() {
            Log.i("TAG", "banner广告-关闭");
            FrameLayout frameLayout = this.f61629a;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdFail(int i10, String str) {
            Log.i("TAG", "banner广告-error = " + str);
            ed.c.e(1, this.f61630b.getAd_type(), this.f61630b.getAd_source_id(), this.f61631c, this.f61630b.getAd_id(), 0, 0, 0);
            ed.c.d("adposition:" + this.f61631c + " Ad_source_id:" + this.f61630b.getAd_source_id() + " +s:" + i10 + " s1:" + str);
        }

        @Override // com.yk.e.callBack.MainBannerCallBack
        public void onAdLoaded(View view) {
            Log.i("TAG", "banner广告-缓存成功");
            this.f61629a.removeAllViews();
            this.f61629a.addView(view);
            ed.c.e(4, this.f61630b.getAd_type(), this.f61630b.getAd_source_id(), this.f61631c, this.f61630b.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainBannerCallBack
        public void onAdShow(AdInfo adInfo) {
            Log.i("TAG", "banner广告-展示");
            ed.c.e(2, this.f61630b.getAd_type(), this.f61630b.getAd_source_id(), this.f61631c, this.f61630b.getAd_id(), 1, 0, 0);
        }
    }

    public b(Activity activity) {
        this.f61627a = activity;
    }

    public void a(FrameLayout frameLayout, AdInfoDetailEntry adInfoDetailEntry, int i10) {
        try {
            BannerAd bannerAd = new BannerAd(this.f61627a, adInfoDetailEntry.getSdk_ad_id(), new a(frameLayout, adInfoDetailEntry, i10));
            this.f61628b = bannerAd;
            bannerAd.loadAd();
            ed.c.e(7, adInfoDetailEntry.getAd_type(), adInfoDetailEntry.getAd_source_id(), i10, adInfoDetailEntry.getAd_id(), 0, 0, 0);
        } catch (Exception unused) {
        }
    }
}
