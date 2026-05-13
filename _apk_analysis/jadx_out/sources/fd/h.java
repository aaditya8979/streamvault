package fd;

import android.app.Activity;
import android.util.Log;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.wangxiong.sdk.callBack.RewardVideoAdCallBack;
import com.wangxiong.sdk.view.RewardVideoLoader;
import com.yk.e.object.AdInfo;

/* JADX INFO: compiled from: WxRewardAd.java */
/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f61658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RewardVideoLoader f61659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f61660c = "Wxtest";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RewardVideoAdCallBack f61661d = new a();

    /* JADX INFO: compiled from: WxRewardAd.java */
    public class a implements RewardVideoAdCallBack {
        public a() {
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdClick() {
            Log.i(h.this.f61660c, "激励视频广告被点击");
            i iVar = h.this.f61658a;
            if (iVar != null) {
                iVar.b();
            }
        }

        @Override // com.yk.e.callBack.MainVideoAdCallBack
        public void onAdClose() {
            Log.i(h.this.f61660c, "激励视频广告关闭");
            i iVar = h.this.f61658a;
            if (iVar != null) {
                iVar.c();
            }
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdFail(int i10, String str) {
            Log.i(h.this.f61660c, "激励视频广告加载失败:" + str);
            i iVar = h.this.f61658a;
            if (iVar != null) {
                iVar.a(String.valueOf(i10), str);
            }
        }

        @Override // com.yk.e.callBack.MainVideoAdCallBack
        public void onAdShow(AdInfo adInfo) {
            Log.i(h.this.f61660c, "激励视频广告展示");
            i iVar = h.this.f61658a;
            if (iVar != null) {
                iVar.onAdShow();
            }
        }

        @Override // com.yk.e.callBack.MainVideoAdCallBack
        public void onAdVideoCache() {
            Log.i(h.this.f61660c, "激励视频广告收到数据");
            i iVar = h.this.f61658a;
            if (iVar != null) {
                iVar.d();
            }
        }

        @Override // com.yk.e.callBack.MainVideoAdCallBack
        public void onAdVideoComplete() {
            Log.i(h.this.f61660c, "激励视频广告播放完成");
        }

        @Override // com.yk.e.callBack.MainRewardVideoAdCallBack
        public void onReward(String str) {
            i iVar = h.this.f61658a;
            if (iVar != null) {
                iVar.onReward(str);
            }
            Log.i(h.this.f61660c, "可以发放奖励了,trans_id = " + str);
        }
    }

    public h(Activity activity, AdInfoDetailEntry adInfoDetailEntry) {
        this.f61659b = new RewardVideoLoader(activity, adInfoDetailEntry.getSdk_ad_id(), this.f61661d);
    }

    public void a() {
        if (this.f61661d != null) {
            this.f61661d = null;
        }
        if (this.f61659b != null) {
            this.f61659b = null;
        }
        if (this.f61658a != null) {
            this.f61658a = null;
        }
    }

    public void b(i iVar) {
        this.f61658a = iVar;
    }
}
