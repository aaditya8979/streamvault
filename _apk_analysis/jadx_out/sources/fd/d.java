package fd;

import android.app.Activity;
import android.util.Log;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.wangxiong.sdk.view.FloatViewAdLoader;
import com.yk.e.callBack.MainFloatViewCallback;
import com.yk.e.object.AdInfo;

/* JADX INFO: compiled from: WxFloatViewAd.java */
/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f61638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FloatViewAdLoader f61639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AdInfoDetailEntry f61640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MainFloatViewCallback f61641d = new a();

    /* JADX INFO: compiled from: WxFloatViewAd.java */
    public class a implements MainFloatViewCallback {
        public a() {
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdClick() {
            Log.i("TAG", "floatViewAd广告-onAdClick");
            ed.c.e(3, d.this.f61640c.getAd_type(), d.this.f61640c.getAd_source_id(), 18, d.this.f61640c.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainFloatViewCallback
        public void onAdClose() {
            Log.i("TAG", "floatViewAd广告-onAdClose");
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdFail(int i10, String str) {
            ed.c.e(1, d.this.f61640c.getAd_type(), d.this.f61640c.getAd_source_id(), 18, d.this.f61640c.getAd_id(), 0, 0, 0);
            ed.c.d("adposition:18 Ad_source_id:" + d.this.f61640c.getAd_source_id() + " +s:" + i10 + " s1:" + str);
        }

        @Override // com.yk.e.callBack.MainFloatViewCallback
        public void onAdHide() {
            Log.i("TAG", "floatViewAd广告-onAdHide");
        }

        @Override // com.yk.e.callBack.MainFloatViewCallback
        public void onAdLoaded() {
            d dVar = d.this;
            if (dVar.f61641d != null) {
                dVar.f61639b.show();
            }
            Log.i("TAG", "floatViewAd广告-缓存成功");
            ed.c.e(4, d.this.f61640c.getAd_type(), d.this.f61640c.getAd_source_id(), 18, d.this.f61640c.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainFloatViewCallback
        public void onAdShow(AdInfo adInfo) {
            Log.i("TAG", "floatViewAd广告-onAdShow");
            ed.c.e(2, d.this.f61640c.getAd_type(), d.this.f61640c.getAd_source_id(), 18, d.this.f61640c.getAd_id(), 1, 0, 0);
        }
    }

    public d(Activity activity) {
        this.f61638a = activity;
    }

    public void c(AdInfoDetailEntry adInfoDetailEntry) {
        try {
            this.f61640c = adInfoDetailEntry;
            FloatViewAdLoader floatViewAdLoader = this.f61639b;
            if (floatViewAdLoader != null) {
                floatViewAdLoader.destroyFloatView();
            }
            this.f61639b = new FloatViewAdLoader(this.f61638a, adInfoDetailEntry.getSdk_ad_id(), this.f61641d);
            ed.c.e(7, adInfoDetailEntry.getAd_type(), adInfoDetailEntry.getAd_source_id(), 18, adInfoDetailEntry.getAd_id(), 0, 0, 0);
            this.f61639b.setExpressSize(se.b.c(80.0f));
            this.f61639b.setLocationY(0.8f);
            this.f61639b.setLocationX(1.0f);
            this.f61639b.loadAd();
        } catch (Exception unused) {
        }
    }

    public void d() {
        FloatViewAdLoader floatViewAdLoader = this.f61639b;
        if (floatViewAdLoader != null) {
            floatViewAdLoader.destroyFloatView();
            this.f61641d = null;
        }
    }
}
