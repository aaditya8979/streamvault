package bp;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.yk.e.callBack.MainInitSdkCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.AppUtil;
import com.yk.e.util.Constant;
import com.yk.e.util.CoreUtils;
import com.yk.e.util.SignatureUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainInitSdkCallback f5866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f5867c;

    public s(a1 a1Var, Context context, MainInitSdkCallback mainInitSdkCallback) {
        this.f5867c = a1Var;
        this.f5865a = context;
        this.f5866b = mainInitSdkCallback;
    }

    @Override // bp.r
    public final void a(String str) {
        String lowerCase;
        a1.f5716i = r0.d(this.f5865a);
        a1.f5717j = r0.e(this.f5865a, "OKT_SDK_APP_KEY");
        a1 a1Var = this.f5867c;
        if (!TextUtils.isEmpty(a1Var.f5722d)) {
            str = this.f5867c.f5722d;
        }
        a1Var.f5722d = str;
        this.f5867c.f5723e = AppUtil.getAppName(this.f5865a);
        this.f5867c.f5720b = this.f5865a.getPackageName();
        this.f5867c.f5721c = SignatureUtils.getAppSHA1(this.f5865a);
        this.f5867c.f5724f = AppUtil.getAppVersionName(this.f5865a);
        a1 a1Var2 = this.f5867c;
        String str2 = "en-us";
        try {
            Configuration configuration = this.f5865a.getResources().getConfiguration();
            str2 = configuration.locale.getLanguage() + "-" + configuration.locale.getCountry();
            lowerCase = str2.toLowerCase(Locale.US);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            lowerCase = str2;
        }
        a1Var2.f5725g = lowerCase;
        AdLog.ad("initSdk appID = " + a1.f5716i);
        AdLog.ad("CommonApi " + Constant.commonApi);
        AdLog.ad("ApiVersion " + Constant.apiVersion);
        AdLog.ad("DebugFlag " + Constant.debugFlag);
        Context context = this.f5865a;
        AdLog.i("initAdShowCountData");
        String str3 = Constant.fileAdShowCount;
        HashMap<String, List<String>> map = Constant.adShowCountMap;
        g.e(context, str3, map);
        AdLog.d("initAdShowCountData " + map.toString());
        Context context2 = this.f5865a;
        AdLog.i("initAdAreaCountData");
        String str4 = Constant.fileAdAreaTypeCount;
        HashMap<String, List<String>> map2 = Constant.adAreaNumMap;
        g.e(context2, str4, map2);
        AdLog.d("initAdAreaCountData " + map2.toString());
        CoreUtils.initCacheAdsID(this.f5865a);
        a1.g(this.f5867c, this.f5865a, Constant.ReqInitPath, this.f5866b);
    }
}
