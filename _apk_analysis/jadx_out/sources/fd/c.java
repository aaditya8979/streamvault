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

/* JADX INFO: compiled from: WxDetailBannerAD.java */
/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f61633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BannerAd f61634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fd.a f61635c;

    /* JADX INFO: compiled from: WxDetailBannerAD.java */
    public class a implements BannerCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f61636a;

        public a(FrameLayout frameLayout) {
            this.f61636a = frameLayout;
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdClick() {
            Log.i("TAG", "banner广告-被点击");
            fd.a aVar = c.this.f61635c;
            if (aVar != null) {
                aVar.b();
            }
        }

        @Override // com.yk.e.callBack.MainBannerCallBack
        public void onAdClose() {
            Log.i("TAG", "banner广告-关闭");
            fd.a aVar = c.this.f61635c;
            if (aVar != null) {
                aVar.c();
            }
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdFail(int i10, String str) {
            Log.i("TAG", "banner广告-error = " + str);
            fd.a aVar = c.this.f61635c;
            if (aVar != null) {
                aVar.a(String.valueOf(i10), str);
            }
        }

        @Override // com.yk.e.callBack.MainBannerCallBack
        public void onAdLoaded(View view) {
            Log.i("TAG", "banner广告-缓存成功");
            FrameLayout frameLayout = this.f61636a;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
                this.f61636a.addView(view);
            }
            fd.a aVar = c.this.f61635c;
            if (aVar != null) {
                aVar.onSuccess();
            }
        }

        @Override // com.yk.e.callBack.MainBannerCallBack
        public void onAdShow(AdInfo adInfo) {
            Log.i("TAG", "banner广告-展示");
            fd.a aVar = c.this.f61635c;
            if (aVar != null) {
                aVar.onAdShow();
            }
        }
    }

    public c(Activity activity) {
        this.f61633a = activity;
    }

    public void a(FrameLayout frameLayout, AdInfoDetailEntry adInfoDetailEntry) {
        try {
            this.f61634b = new BannerAd(this.f61633a, adInfoDetailEntry.getSdk_ad_id(), new a(frameLayout));
            this.f61634b.setExpressWH(q.getResources().getDisplayMetrics().widthPixels - zp.c.a(25.0f), 0);
            this.f61634b.loadAd();
        } catch (Exception unused) {
        }
    }

    public void b() {
        if (this.f61634b != null) {
            this.f61634b = null;
        }
        if (this.f61635c != null) {
            this.f61635c = null;
        }
    }

    public void c(fd.a aVar) {
        this.f61635c = aVar;
    }
}
