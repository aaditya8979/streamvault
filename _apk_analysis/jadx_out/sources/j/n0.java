package j;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.mediation.MaxAd;
import com.yk.e.callBack.MainAdCallBack;
import com.yk.e.object.AdInfo;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.object.MainParams;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.IDUtil;
import com.yk.e.util.LogUtil;
import com.yk.e.util.UsLocalSaveHelper;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f71953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f71954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f71955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f71956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f71957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f71958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f71959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f71960i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MainParams f71961j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i.e f71962k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public JSONObject f71963l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f71964m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f71965n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f71966o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f71967p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f71968q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Activity f71969r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f71972u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public MainAdCallBack f71974w;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f71970s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f71971t = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f71973v = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f71975x = 90000;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public double f71976y = 0.0d;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f71977z = "";
    public final z0 A = new z0(this, Looper.getMainLooper());

    public static String d(Object obj) {
        String str = "";
        if (obj == null) {
            return "";
        }
        try {
            if (obj instanceof MaxAd) {
                str = ((MaxAd) obj).getNetworkName() + ", " + ((MaxAd) obj).getNetworkPlacement();
            }
            return obj instanceof AdInfo ? ((AdInfo) obj).getNetworkName() : str;
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            return "";
        }
    }

    public final void A() {
        AdLog.d("BaseMainAd", "onLoadDataFinish");
        this.A.sendEmptyMessage(0);
    }

    public final void a(String str) {
        j(AdSdkStateCode.MAIN_RENDER_FAILED, e("main_ad_render_fail") + ", " + str);
    }

    public boolean b() {
        return this instanceof f.z;
    }

    public final String c() {
        return TextUtils.isEmpty(this.f71977z) ? this.f71959h : this.f71977z;
    }

    public final String e(String str) {
        return "platform:" + this.f71959h + ", msg:" + IDUtil.getString(this.f71969r, str);
    }

    public final void f(double d10) {
        AdLog.i("BaseMainAd", "setRevenue " + this.f71960i + ", platform = " + this.f71959h + ", revenue = " + d10);
        this.f71976y = d10;
    }

    public final void g(int i10) {
        this.f71956e = new Date().getTime();
        AdLog.subAd(this.f71960i + " platform = " + this.f71959h + ", " + (i10 == 1 ? "成功" : "失败") + "：加载sdk内容耗时 = " + this.f71965n + "ms");
    }

    public final void h(int i10, AdInfo adInfo, boolean z10, long j10, long j11, y0 y0Var) {
        if (this.f71966o.contains(Integer.valueOf(i10))) {
            return;
        }
        this.f71966o.add(Integer.valueOf(i10));
        i.d dVar = new i.d();
        dVar.f63643a = this.f71957f;
        dVar.f63647e = this.f71959h;
        dVar.f63646d = this.f71954c;
        dVar.f63644b = this.f71958g;
        dVar.f63645c = this.f71953b;
        dVar.f63648f = i10;
        dVar.f63649g = this.f71967p;
        dVar.f63650h = this.f71968q;
        dVar.f63651i = this.f71964m;
        dVar.f63652j = this.f71961j.materialId;
        dVar.f63657o = adInfo.getRevenue();
        dVar.f63656n = adInfo.getRevenuePrecision();
        dVar.f63658p = adInfo.getNetworkName();
        dVar.f63653k = z10 ? 1 : 0;
        dVar.f63654l = j10;
        dVar.f63655m = j11;
        bp.a1.a().h(dVar, new m(y0Var));
    }

    public final void i(int i10, y0 y0Var) {
        h(i10, new AdInfo(), false, 0L, 0L, y0Var);
    }

    public final void j(int i10, String str) {
        MainAdCallBack mainAdCallBack = this.f71974w;
        if (mainAdCallBack == null) {
            AdLog.e("onAdLoadFailed baseAdCallBack is null");
        } else {
            mainAdCallBack.onAdFail(i10, str);
        }
    }

    public final void k(int i10, boolean z10) {
        long adApiCostTime = UsLocalSaveHelper.getInstance().getAdApiCostTime(this.f71957f);
        h(i10, new AdInfo(), z10, this.f71965n, adApiCostTime, null);
    }

    public final void l(long j10) {
        if (j10 <= 0) {
            return;
        }
        this.f71975x = j10 * 1000;
    }

    public final void m(Activity activity, int i10) {
        if (bp.c.f5737b == null) {
            bp.c.f5737b = new bp.c();
        }
        bp.c.f5737b.a(activity, i10, this.f71961j, this.f71957f, false);
    }

    public final void n(Exception exc) {
        j(AdSdkStateCode.MAIN_LOGIC_ERROR, e("main_ad_load_err") + ", " + Log.getStackTraceString(exc));
    }

    public final void o(Runnable runnable) {
        Activity activity = this.f71969r;
        int i10 = this.f71958g;
        MainParams mainParams = this.f71961j;
        String str = this.f71957f;
        try {
            AdLog.d("强制点击广告 state " + mainParams.forceClick);
            if (mainParams.forceClick == 0) {
                return;
            }
            new Handler().postDelayed(new bp.g1(i10, activity, mainParams, str, runnable), ((long) mainParams.fcDelayTime) * 1000);
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("forceAdClick error, msg = "), e10);
        }
    }

    public final void p(JSONObject jSONObject, int i10, String str, String str2, String str3) {
        this.f71961j = new MainParams();
        this.f71958g = i10;
        this.f71960i = str;
        this.f71957f = str2;
        this.f71964m = str3;
        this.f71966o = new ArrayList();
        try {
            this.f71963l = jSONObject;
            this.f71959h = jSONObject.optString("platform");
            this.f71953b = this.f71963l.optString(VastAttributes.AD_ID);
            this.f71954c = this.f71963l.optString("sourceID");
            String strOptString = this.f71963l.optString("offline_adv");
            if (Constant.platform.equals(this.f71959h) || !TextUtils.isEmpty(strOptString)) {
                MainParams mainParams = this.f71961j;
                mainParams.platform = this.f71959h;
                mainParams.adID = this.f71953b;
                mainParams.sourceID = this.f71954c;
                mainParams.logoUrl = this.f71963l.optString("logoUrl");
                this.f71961j.title = this.f71963l.optString("title");
                this.f71961j.name = this.f71963l.optString("name");
                this.f71961j.summary = this.f71963l.optString("summary");
                this.f71961j.type = this.f71963l.optInt("type");
                this.f71961j.clickUrl = this.f71963l.optString("clickUrl");
                this.f71961j.webUrl = this.f71963l.optString("webUrl");
                this.f71961j.packageName = this.f71963l.optString("package");
                this.f71961j.imgUrl = this.f71963l.optString("imgUrl");
                this.f71961j.videoUrl = this.f71963l.optString(UnifiedMediationParams.KEY_VIDEO_URL);
                this.f71961j.countDownTime = this.f71963l.optInt("countDownTime");
                this.f71961j.skipTime = this.f71963l.optInt("skipTime");
                this.f71961j.adAreaType = this.f71963l.optInt("adAreaType");
                this.f71961j.materialId = this.f71963l.optString("materialId");
                this.f71961j.videoWidth = this.f71963l.optInt("videoWidth");
                this.f71961j.videoHeight = this.f71963l.optInt("videoHeight");
                this.f71961j.adTitle = this.f71963l.optString("adTitle");
                this.f71961j.adDes = this.f71963l.optString("adDes");
                this.f71961j.adContent = this.f71963l.optString("adContent");
                MainParams mainParams2 = this.f71961j;
                JSONArray jSONArrayOptJSONArray = this.f71963l.optJSONArray("adTags");
                ArrayList arrayList = new ArrayList();
                if (jSONArrayOptJSONArray != null) {
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                        String strOptString2 = jSONArrayOptJSONArray.optString(i11);
                        if (!TextUtils.isEmpty(strOptString2)) {
                            arrayList.add(strOptString2);
                        }
                    }
                }
                mainParams2.adTags = arrayList;
                this.f71961j.forceClick = this.f71963l.optInt("forceClick");
                this.f71961j.fcDelayTime = this.f71963l.optInt("fcDelayTime");
                this.f71961j.m3u8Url = this.f71963l.optString("m3u8Url");
                this.f71961j.playable = this.f71963l.optString("playable");
                this.f71961j.playableUrl = this.f71963l.optString("playable_url");
                this.f71961j.webPrice = this.f71963l.optString("webPrice", "0");
            } else {
                i.e eVar = new i.e();
                this.f71962k = eVar;
                eVar.f63659a = this.f71963l.optString("thirdAppID");
                this.f71962k.f63660b = this.f71963l.optString("thirdAppKey");
                this.f71962k.f63661c = this.f71963l.optString("thirdPosID");
                this.f71962k.f63662d = this.f71963l.optInt("gWidth", 0);
                this.f71962k.f63663e = this.f71963l.optInt("gHeight", 0);
                this.f71962k.f63664f = this.f71963l.optString("thirdUnitID", "");
                this.f71962k.f63665g = this.f71963l.optString("webPrice", "0");
                this.f71962k.f63666h = this.f71963l.optString("autoFlush", "0");
            }
            AdLog.subAd(this.f71960i + " platform = " + this.f71959h + " , 开始加载广告");
            this.f71955d = new Date().getTime();
            k(9, this.f71970s);
        } catch (Exception e10) {
            LogUtil.printException(e10);
        }
        Activity activity = this.f71969r;
        if (TextUtils.isEmpty(this.f71961j.webUrl)) {
            AdLog.d("BaseMainAd", "checkClickUrl 备用地址为空 不进行检测！");
            MainParams mainParams3 = this.f71961j;
            mainParams3.isUserWebUrl = false;
            mainParams3.realClickUlr = mainParams3.clickUrl;
            AdLog.d("BaseMainAd", "onCheckUrlFinish");
            this.A.sendEmptyMessage(0);
        } else {
            String str4 = this.f71961j.clickUrl;
            AdLog.d("isGpDetailsPage url = " + str4);
            String strTrim = str4.trim();
            if (!((strTrim.startsWith("https://play.google.com/store/apps/details?") || strTrim.startsWith("http://play.google.com/store/apps/details?")) ? Boolean.TRUE : Boolean.FALSE).booleanValue()) {
                AdLog.d("BaseMainAd", "checkClickUrl 地址非谷歌商店详情页 不进行检测！");
                MainParams mainParams4 = this.f71961j;
                mainParams4.isUserWebUrl = false;
                mainParams4.realClickUlr = mainParams4.clickUrl;
                AdLog.d("BaseMainAd", "onCheckUrlFinish");
                this.A.sendEmptyMessage(0);
            } else if (Constant.clickUrlHashMap.containsKey(this.f71961j.clickUrl)) {
                AdLog.d("BaseMainAd", "checkClickUrl 本地缓存中存在数据，无需再次检测！");
                boolean zEquals = Boolean.TRUE.equals(Constant.clickUrlHashMap.get(this.f71961j.clickUrl));
                MainParams mainParams5 = this.f71961j;
                mainParams5.realClickUlr = zEquals ? mainParams5.clickUrl : mainParams5.webUrl;
                mainParams5.isUserWebUrl = zEquals;
                AdLog.d("BaseMainAd", "onCheckUrlFinish");
                this.A.sendEmptyMessage(0);
            } else {
                new Thread(new bp.k1(activity, this.f71961j.clickUrl, new bp.a0(System.currentTimeMillis(), new r(this)))).start();
            }
        }
        i.e eVar2 = this.f71962k;
        if (eVar2 != null) {
            f(bp.r0.a(eVar2.f63665g));
        }
    }

    public final void q(Exception exc) {
        j(AdSdkStateCode.THIRD_LOGIC_ERROR, e("main_ad_load_err") + ", " + Log.getStackTraceString(exc));
    }

    public final void r(Object obj) {
        try {
            AdLog.i("FsAdInfo, platform = " + this.f71959h + ", adPlcID = " + this.f71957f + ", AdNetWork = " + d(obj));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public final void s(String str) {
        AdLog.subAd(this.f71960i + " platform = " + this.f71959h + " , " + str);
    }

    public boolean t() {
        return false;
    }

    public final void u() {
        AdLog.i("BaseMainAd", "adBidWin, " + this.f71960i + ", platform = " + this.f71959h + ", revenue = " + this.f71976y);
    }

    public void v(String str) {
        j(AdSdkStateCode.THIRD_RENDER_FAILED, e("main_ad_render_fail") + ", " + str);
    }

    public final void w() {
        AdLog.i("BaseMainAd", "adBidLose, " + this.f71960i + ", platform = " + this.f71959h + ", revenue = " + this.f71976y);
    }

    public final void x(String str) {
        j(AdSdkStateCode.THIRD_LOGIC_ERROR, e("main_ad_load_err") + ", " + str);
    }

    public final void y() {
        AdLog.d("setAdCostTime");
        if (this.f71956e == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f71956e = jCurrentTimeMillis;
            this.f71965n = jCurrentTimeMillis - this.f71955d;
        }
    }

    public void z() {
    }
}
