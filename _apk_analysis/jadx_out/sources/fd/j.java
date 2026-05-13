package fd;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.wangxiong.sdk.callBack.NativeAdCallBack;
import com.wangxiong.sdk.view.NativeLoader;
import com.yk.e.object.AdInfo;
import zp.q;

/* JADX INFO: compiled from: WxWorldNativeAD.java */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FrameLayout f61663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f61664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NativeLoader f61665c;

    /* JADX INFO: compiled from: WxWorldNativeAD.java */
    public class a implements NativeAdCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f61666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f61667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f61668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f61669d;

        public a(String str, AdInfoDetailEntry adInfoDetailEntry, int i10, FrameLayout frameLayout) {
            this.f61666a = str;
            this.f61667b = adInfoDetailEntry;
            this.f61668c = i10;
            this.f61669d = frameLayout;
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdClick() {
            Log.i(this.f61666a, "信息流广告-被点击");
            ed.c.e(3, this.f61667b.getAd_type(), this.f61667b.getAd_source_id(), this.f61668c, this.f61667b.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainNativeAdCallBack
        public void onAdClose() {
            Log.i(this.f61666a, "信息流广告-被关闭");
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdFail(int i10, String str) {
            Log.i(this.f61666a, "信息流广告-error = " + str);
            ed.c.e(1, this.f61667b.getAd_type(), this.f61667b.getAd_source_id(), this.f61668c, this.f61667b.getAd_id(), 0, 0, 0);
            ed.c.d("adposition:" + this.f61668c + " Ad_source_id:" + this.f61667b.getAd_source_id() + " +s:" + i10 + " s1:" + str);
        }

        @Override // com.yk.e.callBack.MainNativeAdCallBack
        public void onAdLoaded(View view) {
            Log.i(this.f61666a, "信息流广告-收到数据");
            FrameLayout frameLayout = this.f61669d;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            this.f61669d.addView(view);
            ed.c.e(4, this.f61667b.getAd_type(), this.f61667b.getAd_source_id(), this.f61668c, this.f61667b.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainNativeAdCallBack
        public void onAdShow(AdInfo adInfo) {
            Log.i(this.f61666a, "信息流广告-展示");
            ed.c.e(2, this.f61667b.getAd_type(), this.f61667b.getAd_source_id(), this.f61668c, this.f61667b.getAd_id(), 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainNativeAdCallBack
        public void onAdVideoComplete() {
            Log.i(this.f61666a, "信息流广告-视频播放完成");
        }

        @Override // com.yk.e.callBack.MainNativeAdCallBack
        public void onAdVideoStart() {
            Log.i(this.f61666a, "信息流广告-视频开始播放");
        }
    }

    public j(Activity activity) {
        this.f61664b = activity;
    }

    public void a(FrameLayout frameLayout, AdInfoDetailEntry adInfoDetailEntry, int i10) {
        try {
            this.f61663a = frameLayout;
            int iA = q.getResources().getDisplayMetrics().widthPixels - zp.c.a(24.0f);
            NativeLoader nativeLoader = new NativeLoader(this.f61664b, adInfoDetailEntry.getSdk_ad_id(), new a("test", adInfoDetailEntry, i10, frameLayout));
            this.f61665c = nativeLoader;
            nativeLoader.setExpressWH(iA, 0);
            ed.c.e(7, adInfoDetailEntry.getAd_type(), adInfoDetailEntry.getAd_source_id(), i10, adInfoDetailEntry.getAd_id(), 0, 0, 0);
            this.f61665c.loadAd();
        } catch (Exception unused) {
        }
    }
}
