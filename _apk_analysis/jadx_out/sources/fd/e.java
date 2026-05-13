package fd;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.wangxiong.sdk.callBack.BannerCallBack;
import com.wangxiong.sdk.view.BannerAd;
import com.yk.e.object.AdInfo;
import zp.q;

/* JADX INFO: compiled from: WxHome3BannerAD.java */
/* JADX INFO: loaded from: classes11.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f61643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BannerAd f61644b;

    /* JADX INFO: compiled from: WxHome3BannerAD.java */
    public class a implements BannerCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f61645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f61646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f61647c;

        public a(FrameLayout frameLayout, AdInfoDetailEntry adInfoDetailEntry, int i10) {
            this.f61645a = frameLayout;
            this.f61646b = adInfoDetailEntry;
            this.f61647c = i10;
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdClick() {
            Log.i("TAG", "banner广告-被点击");
            ed.c.e(3, this.f61646b.getAd_type(), this.f61646b.getAd_source_id(), this.f61647c, this.f61646b.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainBannerCallBack
        public void onAdClose() {
            Log.i("TAG", "banner广告-关闭");
            FrameLayout frameLayout = this.f61645a;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdFail(int i10, String str) {
            Log.i("TAG", "banner广告-error = " + str);
            ed.c.e(1, this.f61646b.getAd_type(), this.f61646b.getAd_source_id(), this.f61647c, this.f61646b.getAd_id(), 0, 0, 0);
            ed.c.d("adposition:" + this.f61647c + " Ad_source_id:" + this.f61646b.getAd_source_id() + " +s:" + i10 + " s1:" + str);
        }

        @Override // com.yk.e.callBack.MainBannerCallBack
        public void onAdLoaded(View view) {
            Log.i("TAG", "banner广告-缓存成功");
            this.f61645a.removeAllViews();
            this.f61645a.addView(view);
            ed.c.e(4, this.f61646b.getAd_type(), this.f61646b.getAd_source_id(), this.f61647c, this.f61646b.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainBannerCallBack
        public void onAdShow(AdInfo adInfo) {
            Log.i("TAG", "banner广告-展示");
            ed.c.e(2, this.f61646b.getAd_type(), this.f61646b.getAd_source_id(), this.f61647c, this.f61646b.getAd_id(), 1, 0, 0);
        }
    }

    public e(Activity activity) {
        this.f61643a = activity;
    }

    public void a(FrameLayout frameLayout, AdInfoDetailEntry adInfoDetailEntry, int i10) {
        try {
            this.f61644b = new BannerAd(this.f61643a, adInfoDetailEntry.getSdk_ad_id(), new a(frameLayout, adInfoDetailEntry, i10));
            this.f61644b.setExpressWH(q.getResources().getDisplayMetrics().widthPixels - zp.c.a(25.0f), 0);
            this.f61644b.loadAd();
            ed.c.e(7, adInfoDetailEntry.getAd_type(), adInfoDetailEntry.getAd_source_id(), i10, adInfoDetailEntry.getAd_id(), 0, 0, 0);
        } catch (Exception unused) {
        }
    }
}
