package j;

import Lil.I1I;
import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.Mf;
import com.ironsource.Z7;
import com.yk.e.callBack.MainAdCallBack;
import com.yk.e.callBack.MainRefreshCallback;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.util.AdLog;
import com.yk.e.util.CoreUtils;
import com.yk.e.util.IDUtil;
import com.yk.e.util.ScreenUtil;
import com.yk.e.util.UsLocalSaveHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f71907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MainAdCallBack f71909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f71910d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MainRefreshCallback f71917k;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public i.b f71932z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f71911e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f71912f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f71913g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f71914h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f71915i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f71916j = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f71918l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f71919m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f71920n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f71921o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f71922p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f71923q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f71924r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f71925s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f71926t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f71927u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f71928v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f71929w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f71930x = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public y1 f71931y = null;
    public i.b A = null;
    public final ArrayList B = new ArrayList();
    public int C = -2;
    public final k D = new k(this, Looper.getMainLooper());

    public l0(Activity activity, String str, String str2, MainAdCallBack mainAdCallBack) {
        this.f71908b = "";
        this.f71910d = "";
        this.f71907a = activity;
        this.f71910d = str;
        this.f71908b = str2;
        this.f71909c = mainAdCallBack;
    }

    public static void d(l0 l0Var, i.a aVar) {
        if (l0Var.f71922p == ((JSONArray) l0Var.f71914h.get(l0Var.f71920n)).length()) {
            synchronized (l0Var) {
                l0Var.f71923q++;
            }
            i.b bVarA = l0Var.f71918l ? l0Var.a().a(l0Var.f71908b) : null;
            AdLog.i("BaseSliceLoader", "is read cache list, state = " + l0Var.f71918l);
            i.b bVar = l0Var.f71932z;
            if (bVarA == null && bVar == null) {
                bVarA = null;
            } else if (bVarA == null || (bVar != null && bVarA.f63636b <= bVar.f63636b)) {
                bVarA = bVar;
            }
            if (bVarA == null && l0Var.C == 0) {
                l0Var.C = -1;
                AdLog.i("BaseSliceLoader", "wait backstop ad callback");
                return;
            }
            if (bVarA == null) {
                bVarA = l0Var.A;
                AdLog.i("BaseSliceLoader", "set backstopCacheData");
            } else {
                l0Var.A = null;
                AdLog.i("BaseSliceLoader", "destroy backstopCacheData");
            }
            if (bVarA != null) {
                l0Var.m(bVarA, "finish");
                return;
            }
            int i10 = aVar.f63634e;
            if (i10 == 0) {
                i10 = AdSdkStateCode.THIRD_LOGIC_ERROR;
            }
            l0Var.b(i10, TextUtils.isEmpty(aVar.f63635f) ? "load bidding ad error!" : aVar.f63635f);
        }
    }

    public static i.b h(i.a aVar) {
        i.b bVar = new i.b();
        bVar.f63636b = aVar.f63630a;
        bVar.f63637c = aVar.f63631b;
        bVar.f63638d = aVar.f63632c;
        bVar.f63639e = aVar.f63633d;
        return bVar;
    }

    public static void n(l0 l0Var, i.a aVar) {
        l0Var.getClass();
        i.b bVarH = h(aVar);
        l0Var.B.add(bVarH);
        if (aVar.f63631b.isSupportAdCache()) {
            l0Var.a().c(l0Var.f71907a, l0Var.f71908b, bVarH);
            return;
        }
        if (l0Var.s()) {
            return;
        }
        i.b bVar = l0Var.f71932z;
        if (bVar == null || bVar.f63636b < aVar.f63630a) {
            l0Var.f71932z = bVarH;
        }
        AdLog.i("BaseSliceLoader", "no support adCache, platform = " + aVar.f63631b.platform + ", revenue = " + aVar.f63631b.getRevenue() + Z7.f30794r + aVar.f63631b);
    }

    public static boolean x(l0 l0Var, i.a aVar) {
        if (l0Var.s()) {
            return false;
        }
        int i10 = aVar.f63634e;
        try {
            int i11 = l0Var.f71921o + 1;
            l0Var.f71921o = i11;
            if (i11 >= l0Var.f71911e) {
                l0Var.f71921o = 0;
            } else {
                if (l0Var.f71920n != l0Var.f71914h.size() - 1) {
                    return false;
                }
                if (l0Var.f71921o != ((JSONArray) l0Var.f71914h.get(l0Var.f71920n)).length()) {
                    return false;
                }
            }
            if (l0Var.f71920n >= l0Var.f71914h.size() - 1) {
                AdLog.i("BaseSliceLoader", "onLoadSubAdFailed, onAllAdFailed");
                return false;
            }
            l0Var.f71920n++;
            AdLog.i("BaseSliceLoader", "onLoadNextSubSliceAd");
            l0Var.f71922p = 0;
            l0Var.k(l0Var.f71912f, (JSONArray) l0Var.f71914h.get(l0Var.f71920n));
            AdLog.i("BaseSliceLoader", "load sub ad 4 bid");
            return true;
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            l0Var.p(e10);
            return false;
        }
    }

    public final void A(int i10, String str) {
        u(i10, str);
    }

    public final synchronized void B(i.a aVar) {
        Message message = new Message();
        message.obj = aVar;
        message.what = 1;
        this.D.sendMessage(message);
    }

    public final void C(String str) {
        int i10 = AdSdkStateCode.MAIN_RENDER_FAILED;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("platform:" + this.f71913g + ", msg:" + IDUtil.getString(this.f71907a, "main_ad_render_fail"));
        sb2.append(", ");
        sb2.append(str);
        u(i10, sb2.toString());
    }

    public final boolean D() {
        y1 y1Var = this.f71931y;
        if (y1Var == null) {
            AdLog.d("BaseSliceLoader", "isExpired, adLoader is null!");
            return true;
        }
        boolean zIsExpired = y1Var.isExpired();
        AdLog.i("BaseSliceLoader", this.f71910d + " adPlcID = " + this.f71908b + ", adIsExpired = " + zIsExpired);
        return zIsExpired;
    }

    public abstract a.a a();

    public void b(int i10, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f71927u = jCurrentTimeMillis;
        w("加载sdk内容耗时：" + (jCurrentTimeMillis - this.f71926t) + "ms");
        w("onAdFail, code = " + i10 + ", msg = " + str);
    }

    public final synchronized void c(i.a aVar) {
        AdLog.i("BaseSliceLoader", "onBackstopTaskLoadSuccess");
        if (this.A == null) {
            this.A = h(aVar);
        }
        int i10 = this.C;
        if (i10 != -1) {
            this.C = i10 + 1;
        } else {
            m(h(aVar), "finish");
            AdLog.i("bid success callback from backstop");
        }
    }

    public final void e(String str) {
        if (this.f71916j) {
            return;
        }
        AdLog.ad(str);
    }

    public abstract I1I f(int i10, Object... objArr);

    public final View g(Activity activity, View view, int i10, int i11, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        try {
            i.e eVar = this.f71931y.thirdParams;
            if (!z10 && eVar != null && (i14 = eVar.f63662d) != 0) {
                i10 = i14;
            }
            if (!z10 && eVar != null && (i15 = eVar.f63663e) != 0) {
                i11 = i15;
            }
            if (i12 == 0) {
                i12 = (i10 * i13) / i11;
            } else if (i13 == 0) {
                i13 = (i11 * i12) / i10;
            } else {
                i12 = (int) (i10 * (i13 / i11));
            }
            int screenWidth = ScreenUtil.getScreenWidth(activity);
            if (i12 == 0 && i13 == 0) {
                i13 = (i11 * screenWidth) / i10;
                i12 = screenWidth;
            }
            if (i12 >= screenWidth) {
                i13 = (i11 * screenWidth) / i10;
            } else {
                screenWidth = i12;
            }
            int screenHeight = ScreenUtil.getScreenHeight(activity);
            if (i13 >= screenHeight) {
                screenWidth = (i10 * screenHeight) / i11;
                i13 = screenHeight;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = screenWidth;
                layoutParams.height = i13;
                view.setLayoutParams(layoutParams);
            } else {
                AdLog.w("resetNativeViewWH, contentParams is null");
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        return view;
    }

    public final void i(int i10) {
        try {
            AdLog.i("BaseSliceLoader", "setBidCountDown, time = " + i10);
            bp.a aVar = new bp.a(i10, new j2(this));
            aVar.f5712c.post(aVar.f5713d);
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("setBidCountDown, errMsg = "), e10);
        }
    }

    public final void j(int i10, String str) {
        this.f71925s = System.currentTimeMillis();
        e(this.f71910d + " sdk获取数据失败, msg = " + str);
        long j10 = this.f71924r;
        w("连接服务器耗时：" + (this.f71925s - j10) + "ms");
        UsLocalSaveHelper.getInstance().putAdApiCostTimeMap(this.f71908b, this.f71925s - this.f71924r);
        MainAdCallBack mainAdCallBack = this.f71909c;
        if (mainAdCallBack != null) {
            mainAdCallBack.onAdFail(i10, str);
        }
    }

    public final void k(int i10, JSONArray jSONArray) {
        if (this.f71926t == 0) {
            this.f71926t = System.currentTimeMillis();
            e("开始加载广告");
        }
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObjectOptJSONObject);
            this.f71915i.put(Integer.valueOf(this.f71919m), f(this.f71919m, Integer.valueOf(i10), jSONArray2));
            this.f71919m++;
        }
    }

    public final void l(int i10, JSONArray jSONArray, int i11, int i12, JSONArray jSONArray2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        try {
        } catch (Exception e10) {
            e = e10;
        }
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    str4 = ", ";
                    str5 = "main_ad_load_err";
                    str6 = "AdData slice failed，msg = ";
                    w("onAdFail, code = " + AdSdkStateCode.MAIN_RENDER_FAILED + ", msg = AdList is empty!");
                    int i13 = AdSdkStateCode.MAIN_RENDER_FAILED;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("platform:" + this.f71913g + ", msg:" + IDUtil.getString(this.f71907a, "main_ad_render_fail"));
                    sb2.append(", AdList is empty!");
                    u(i13, sb2.toString());
                    str2 = str5;
                    str3 = str4;
                    str = str6;
                } else {
                    this.f71925s = System.currentTimeMillis();
                    e("FloorSize = " + jSONArray.length() + ", SliceSize = " + i12);
                    long j10 = this.f71924r;
                    str5 = "main_ad_load_err";
                    try {
                        str4 = ", ";
                    } catch (Exception e11) {
                        e = e11;
                        str4 = ", ";
                    }
                    try {
                        str6 = "AdData slice failed，msg = ";
                        w("连接服务器耗时：" + (this.f71925s - j10) + "ms");
                        long j11 = this.f71924r;
                        UsLocalSaveHelper.getInstance().putAdApiCostTimeMap(this.f71908b, j11 != 0 ? this.f71925s - j11 : 0L);
                        jSONArray.length();
                        this.f71912f = i10;
                        this.f71911e = i12;
                        this.f71918l = bp.r0.f(jSONArray).length() > 0;
                        List<JSONArray> listSliceJsonArray = CoreUtils.sliceJsonArray(jSONArray, i12);
                        this.f71914h = listSliceJsonArray;
                        if (listSliceJsonArray.size() == 0) {
                            w("onAdFail, code = " + AdSdkStateCode.MAIN_RENDER_FAILED + ", msg = SliceJsonArrays is empty!");
                            int i14 = AdSdkStateCode.MAIN_RENDER_FAILED;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("platform:" + this.f71913g + ", msg:" + IDUtil.getString(this.f71907a, "main_ad_render_fail"));
                            sb3.append(", SliceJsonArrays is empty!");
                            u(i14, sb3.toString());
                        } else {
                            k(i10, (JSONArray) this.f71914h.get(0));
                        }
                        str2 = str5;
                        str3 = str4;
                        str = str6;
                    } catch (Exception e12) {
                        e = e12;
                        AdLog.e(e.getMessage(), e);
                        str = "AdData slice failed，msg = ";
                        String str7 = str + e.getMessage();
                        int i15 = AdSdkStateCode.THIRD_LOGIC_ERROR;
                        StringBuilder sb4 = new StringBuilder();
                        str2 = str5;
                        sb4.append("platform:" + this.f71913g + ", msg:" + IDUtil.getString(this.f71907a, str2));
                        str3 = str4;
                        sb4.append(str3);
                        sb4.append(str7);
                        u(i15, sb4.toString());
                    }
                }
            } catch (Exception e13) {
                e = e13;
                str4 = ", ";
                str5 = "main_ad_load_err";
            }
            AdLog.e(e.getMessage(), e);
            str = "AdData slice failed，msg = ";
            String str72 = str + e.getMessage();
            int i152 = AdSdkStateCode.THIRD_LOGIC_ERROR;
            StringBuilder sb42 = new StringBuilder();
            str2 = str5;
            sb42.append("platform:" + this.f71913g + ", msg:" + IDUtil.getString(this.f71907a, str2));
            str3 = str4;
            sb42.append(str3);
            sb42.append(str72);
            u(i152, sb42.toString());
        } else {
            str4 = ", ";
            str5 = "main_ad_load_err";
            str6 = "AdData slice failed，msg = ";
            w("onAdFail, code = " + AdSdkStateCode.MAIN_RENDER_FAILED + ", msg = AdList is empty!");
            int i132 = AdSdkStateCode.MAIN_RENDER_FAILED;
            StringBuilder sb22 = new StringBuilder();
            sb22.append("platform:" + this.f71913g + ", msg:" + IDUtil.getString(this.f71907a, "main_ad_render_fail"));
            sb22.append(", AdList is empty!");
            u(i132, sb22.toString());
            str2 = str5;
            str3 = str4;
            str = str6;
        }
        try {
            int i16 = this.f71929w;
            if (i16 == 0) {
                i16 = i11;
            }
            AdLog.i("BaseSliceLoader", "bid, isUseClientBid = true, realBidTime = " + i16);
            if (i16 > 0) {
                i(i16);
            }
            r(jSONArray2);
        } catch (Exception e14) {
            AdLog.e(e14.getMessage(), e14);
            String str8 = str + e14.getMessage();
            int i17 = AdSdkStateCode.THIRD_LOGIC_ERROR;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("platform:" + this.f71913g + ", msg:" + IDUtil.getString(this.f71907a, str2));
            sb5.append(str3);
            sb5.append(str8);
            u(i17, sb5.toString());
        }
    }

    public final void m(i.b bVar, String str) {
        y1 y1Var = bVar.f63637c;
        this.f71931y = y1Var;
        bVar.f63638d.f71913g = y1Var.platform;
        o(y1Var, bVar);
        AdLog.i("BaseSliceLoader", "bid " + str + ", type = " + this.f71910d + ", win platform = " + this.f71913g + ", revenue = " + this.f71931y.getRevenue());
    }

    public void o(y1 y1Var, i.b bVar) {
        this.f71927u = System.currentTimeMillis();
        y1 y1Var2 = this.f71931y;
        if (y1Var2 != null) {
            this.f71913g = y1Var2.platform;
        }
        e("AdLoaderIndex = forAdCache");
        long j10 = this.f71926t;
        q("加载sdk内容耗时：" + (this.f71927u - j10) + "ms");
        q(Mf.f29856j);
        try {
            bVar.f63637c.onAdBidWin();
            if (this.B.size() > 0) {
                this.B.remove(bVar);
                Iterator it = this.B.iterator();
                while (it.hasNext()) {
                    ((i.b) it.next()).f63637c.onAdBidLose();
                }
                this.B.clear();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        if (!this.f71916j && y1Var.isSupportAdCache()) {
            a().d(bVar, this.f71908b);
            AdLog.i("BaseSliceLoader", "loadNextAd, adPlcID = " + this.f71908b);
            a.d.c().i(t(), this.f71908b);
        }
        if (this.f71932z != null) {
            this.f71932z = null;
        }
    }

    public final void p(Exception exc) {
        int i10 = AdSdkStateCode.MAIN_LOGIC_ERROR;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("platform:" + this.f71913g + ", msg:" + IDUtil.getString(this.f71907a, "main_ad_load_err"));
        sb2.append(", ");
        sb2.append(Log.getStackTraceString(exc));
        u(i10, sb2.toString());
    }

    public final void q(String str) {
        if (this.f71916j) {
            return;
        }
        AdLog.ad(this.f71910d + " platform = " + this.f71913g + " , " + str);
    }

    public final void r(JSONArray jSONArray) {
        AdLog.i("BaseSliceLoader", "createAdLoader4Backstop, size = " + jSONArray.length());
        this.C = -2;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObjectOptJSONObject);
            this.C = 0;
            f(0, 1, jSONArray2, Boolean.TRUE);
        }
    }

    public final synchronized boolean s() {
        return this.f71923q > 0;
    }

    public abstract int t();

    public final void u(int i10, String str) {
        Activity activity = this.f71907a;
        String str2 = i10 + ", " + str;
        AdLog.w("errMsg " + str2);
        String str3 = this.f71908b;
        String str4 = this.f71913g;
        if (UsLocalSaveHelper.getInstance().isWriteLog()) {
            bp.a1.a().f(activity, str3, str4, str2, "0", "0", new bp.o0(str3, str4));
        } else {
            AdLog.d("do not report err log, adPlcID = " + str3);
        }
        MainAdCallBack mainAdCallBack = this.f71909c;
        if (mainAdCallBack != null) {
            mainAdCallBack.onAdFail(i10, str);
            return;
        }
        e("Ad callback is null, msg = " + str);
    }

    public final synchronized void v(i.a aVar) {
        AdLog.i("BaseSliceLoader", "onBackstopTaskLoadFailed");
        int i10 = this.C;
        if (i10 != -1) {
            this.C = i10 + 1;
        } else {
            int i11 = aVar.f63634e;
            if (i11 == 0) {
                i11 = AdSdkStateCode.THIRD_LOGIC_ERROR;
            }
            b(i11, TextUtils.isEmpty(aVar.f63635f) ? "load bidding ad error!" : aVar.f63635f);
            AdLog.i("bid failed callback from backstop");
        }
    }

    public final void w(String str) {
        if (this.f71916j) {
            return;
        }
        AdLog.ad(this.f71910d + Z7.f30794r + str);
    }

    public void y() {
        this.f71924r = System.currentTimeMillis();
        e(this.f71910d + " 连接sdk获取数据");
        this.f71919m = 0;
        this.f71920n = 0;
        this.f71921o = 0;
        this.f71926t = 0L;
        this.f71922p = 0;
        this.f71923q = 0;
        this.f71928v = false;
    }

    public final synchronized void z(i.a aVar) {
        Message message = new Message();
        message.obj = aVar;
        message.what = 0;
        this.D.sendMessage(message);
    }
}
