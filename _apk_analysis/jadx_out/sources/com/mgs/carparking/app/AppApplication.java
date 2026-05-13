package com.mgs.carparking.app;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.Process;
import android.support.multidex.MultiDex;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.os.LocaleListCompat;
import com.dramarush.shortin.R;
import com.facebook.appevents.AppEventsLogger;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.jiagu.sdk.pp_hlsProtected;
import com.mgs.carparking.netbean.AdInfoEntry;
import com.mgs.carparking.netbean.ApiconfEntry;
import com.pp.hls;
import com.safedk.android.internal.DexBridge;
import com.safedk.android.utils.Logger;
import com.scwang.smart.refresh.footer.BallPulseFooter;
import com.scwang.smart.refresh.header.ClassicsHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.wangxiong.sdk.WxSDK;
import com.wangxiong.sdk.callBack.InitSdkCallback;
import ed.g;
import ed.l0;
import ed.x;
import ic.q;
import ic.t;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jd.a;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.crash.CaocConfig;
import me.jessyan.retrofiturlmanager.RetrofitUrlManager;
import oe.f;
import zp.k;
import zp.o;
import zp.r;

/* JADX INFO: loaded from: classes6.dex */
public class AppApplication extends BaseApplication {
    public static int port;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f42497c = System.currentTimeMillis();
    public static AdInfoEntry adInfoEntry = new AdInfoEntry();
    public static boolean AdsInit = false;
    public static List<ApiconfEntry> apiList = new ArrayList();
    public static String ex_tab_name = "Promotion";
    public static int bannerIndex = 0;
    public static String clipStr = "";

    public class a implements a.b {
        public a() {
        }

        @Override // jd.a.b
        public void a() {
            Log.i("wangyi", "应用处于前台");
            if (l0.a0() > 0) {
                if (System.currentTimeMillis() - AppApplication.this.f42497c > l0.a0() * 1000) {
                    op.a.a().b(new t());
                }
            } else if (System.currentTimeMillis() - AppApplication.this.f42497c > 60000) {
                op.a.a().b(new t());
            }
            if (g.a(l0.A())) {
                g.g();
                op.a.a().b(new q());
            }
        }

        @Override // jd.a.b
        public void b() {
            Log.i("wangyi", "应用处于后台");
            AppApplication.this.f42497c = System.currentTimeMillis();
            g.g();
        }
    }

    public class b extends Thread {
        public b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            AppApplication.this.getGAID();
        }
    }

    public class c implements InitSdkCallback {
        @Override // com.yk.e.callBack.MainInitSdkCallback
        public void onInitFailed(int i10, String str) {
            Log.e("OKT_SDK", "-------------WxSDK_initonError" + str);
            op.a.a().b(new ic.a(String.valueOf(i10)));
        }

        @Override // com.yk.e.callBack.MainInitSdkCallback
        public void onInitSuccess() {
            Log.e("OKT_SDK", "---------------WxSDK_onInitSuccess----------------------");
            op.a.a().b(new ic.a("0"));
        }
    }

    public class d implements qe.c {
        @Override // qe.c
        public oe.d a(Context context, f fVar) {
            fVar.a(R.color.colorPrimary, android.R.color.white);
            return new ClassicsHeader(context);
        }
    }

    public class e implements qe.b {
        @Override // qe.b
        public oe.c a(Context context, f fVar) {
            return new BallPulseFooter(context).r(r.b().getResources().getColor(R.color.color_commen));
        }
    }

    static {
        SmartRefreshLayout.setDefaultRefreshHeaderCreator(new d());
        SmartRefreshLayout.setDefaultRefreshFooterCreator(new e());
    }

    public static void loadAdConf(String str, String str2, String str3) {
        loadAdConf(str, str2, str3, false);
    }

    public static void loadAdConf(String str, String str2, String str3, boolean z10) {
        if (o.b(str)) {
            str = "AA5086F1E0EFD90B";
        }
        if (o.b(str2)) {
            str2 = "1182";
        }
        if (o.b(str3)) {
            str3 = "8f317dfc21fbbb0c2c656de3cdc10b47";
        }
        if (o.a(str, l0.b()) && o.a(str2, l0.c()) && o.a(str3, l0.a()) && !z10) {
            return;
        }
        WxSDK.initSdk(BaseApplication.getInstance().getApplicationContext(), new c());
        WxSDK.setDebugFlag(true);
    }

    public static void loadP2pSdk() {
        String absolutePath = BaseApplication.getInstance().getExternalFilesDir("").getAbsolutePath();
        if (Environment.getExternalStorageDirectory() != null) {
            absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        }
        port = new hls().load("c456f75b75d7a1b0b2e0fa85833292a6", "com.dramarush.shortin", "63", absolutePath, BaseApplication.getInstance().getExternalFilesDir("").getAbsolutePath(), l0.J(), "1");
        Log.i("wangyi", "端口号为：" + port);
    }

    public static void safedk_AppApplication_onCreate_bbdf4c402a780e2be10909c2ace6b7a9(AppApplication appApplication) {
        r.e(appApplication);
        if (l0.O() == 0) {
            l0.r0(r.d());
            AppCompatDelegate.setApplicationLocales(LocaleListCompat.forLanguageTags(l0.m()));
        } else {
            AppCompatDelegate.setApplicationLocales(LocaleListCompat.forLanguageTags(l0.m()));
            l0.r0(l0.m());
        }
        super.onCreate();
        v.f.a(appApplication);
        if (appApplication.c()) {
            ec.a.c(appApplication);
            if (!o.b(l0.p())) {
                RetrofitUrlManager.getInstance().setGlobalDomain(l0.p());
            }
            new jd.a().b(appApplication, appApplication.new a());
            if (k.i(appApplication).g(AdInfoEntry.class) != null) {
                adInfoEntry = (AdInfoEntry) k.i(appApplication).g(AdInfoEntry.class);
            }
            if (k.i(appApplication).b("CACHE_DOMAIN_LIST", ApiconfEntry.class).size() > 0) {
                apiList = k.i(appApplication).b("CACHE_DOMAIN_LIST", ApiconfEntry.class);
            }
            ed.c.k(true, true);
            zp.g.d(true);
            x.b();
            k9.a.e(appApplication);
            CaocConfig.a.c().b(0).d(false).g(true).h(true).i(true).f(2000).e(Integer.valueOf(R.mipmap.ic_launcher)).a();
            AppEventsLogger.a(appApplication);
            loadAdConf(l0.b(), l0.c(), l0.a(), true);
            appApplication.new b().start();
            AppMetrica.activate(appApplication, AppMetricaConfig.newConfigBuilder("5b6fae87-3d0c-44d0-8f06-afdb70f81029").build());
        }
    }

    @Override // me.goldze.mvvmhabit.base.BaseApplication, androidx.multidex.MultiDexApplication, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        pp_hlsProtected.b(this);
        MultiDex.install(this);
    }

    public final boolean c() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getRunningAppProcesses();
        String str = getApplicationInfo().processName;
        int iMyPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid && str.equals(runningAppProcessInfo.processName)) {
                return true;
            }
        }
        return false;
    }

    public String getGAID() {
        AdvertisingIdClient.Info advertisingIdInfo;
        Log.e("getGAID", ec.a.e(this));
        try {
            advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this);
        } catch (GooglePlayServicesNotAvailableException unused) {
            Log.e("getGAID", "GooglePlayServicesNotAvailableException");
            advertisingIdInfo = null;
        } catch (IOException unused2) {
            Log.e("getGAID", "IOException");
            advertisingIdInfo = null;
        } catch (Exception e10) {
            Log.e("getGAID", "Exception:" + e10.toString());
            advertisingIdInfo = null;
        }
        if (advertisingIdInfo == null) {
            return "";
        }
        Log.e("getGAID", "gaid用户禁止获取:" + advertisingIdInfo.isLimitAdTrackingEnabled());
        String id2 = advertisingIdInfo.getId();
        if (!TextUtils.isEmpty(id2)) {
            k.i(getApplicationContext()).o("key_gaid", id2);
        }
        Log.e("getGAID", "gaid:" + id2);
        return id2;
    }

    @Override // me.goldze.mvvmhabit.base.BaseApplication, android.app.Application
    public void onCreate() {
        Logger.d("SafeDK|SafeDK: App> Lcom/mgs/carparking/app/AppApplication;->onCreate()V");
        DexBridge.appClassOnCreateBefore(this);
        safedk_AppApplication_onCreate_bbdf4c402a780e2be10909c2ace6b7a9(this);
    }
}
