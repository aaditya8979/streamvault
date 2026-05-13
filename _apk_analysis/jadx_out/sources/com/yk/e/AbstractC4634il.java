package com.yk.e;

import android.content.Context;
import bp.e1;
import bp.j0;
import bp.o;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.MobileAds;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleAds;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.UsLocalSaveHelper;
import java.util.ArrayList;
import java.util.HashMap;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.api.AdConfig;

/* JADX INFO: renamed from: com.yk.e.丨il, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4634il {
    public static boolean I1I;
    public static boolean IL1Iii;
    public static boolean ILil;
    public static long Ilil;

    /* JADX INFO: renamed from: I丨L, reason: contains not printable characters */
    public static boolean f3392IL;

    /* JADX INFO: renamed from: iI丨LLL1, reason: contains not printable characters */
    public static final ArrayList f3393iILLL1;

    /* JADX INFO: renamed from: l丨Li1LL, reason: contains not printable characters */
    public static final HashMap f3394lLi1LL = new HashMap();

    static {
        ArrayList arrayList = new ArrayList();
        f3393iILLL1 = arrayList;
        arrayList.add("applovin");
        arrayList.add("admob");
    }

    public static void I1I(Context context, IComCallback iComCallback) {
        try {
            if (AudienceNetworkAds.isInitialized(context)) {
                AdLog.i("Facebook has init success");
                iComCallback.onSuccess();
            } else {
                if (Constant.debugFlag) {
                    AdSettings.turnOnSDKDebugger(context);
                }
                AudienceNetworkAds.buildInitSettings(context).withInitListener(new IiL(iComCallback)).initialize();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            iComCallback.onFailed(-1, e10.getMessage());
        }
    }

    public static void IL1Iii(Context context, PAGSdk.PAGInitCallback pAGInitCallback, String str) {
        if (!PAGSdk.isInitSuccess()) {
            new Thread(new ILil(context, pAGInitCallback, str)).start();
        } else {
            AdLog.i("pangle has success");
            pAGInitCallback.success();
        }
    }

    public static void IL1Iii(Context context, IComCallback iComCallback) {
        if (!UsLocalSaveHelper.getInstance().isStartCmp()) {
            try {
                if (!ILil) {
                    MobileAds.initialize(context, new lLi1LL(System.currentTimeMillis(), iComCallback, context));
                    return;
                }
                AdLog.i("Admob has success");
                if (iComCallback != null) {
                    iComCallback.onSuccess();
                }
                j0.a().d(context);
                return;
            } catch (Exception e10) {
                AdLog.e(e10.getMessage(), e10);
                if (iComCallback != null) {
                    iComCallback.onFailed(-1, e10.getMessage());
                    return;
                }
                return;
            }
        }
        j0 j0VarA = j0.a();
        synchronized (j0VarA) {
            try {
                AdLog.i("Admob initSdk");
                j0VarA.f5788b.offer(new o(j0VarA, iComCallback, context));
                if (!j0VarA.f5789c) {
                    ((Runnable) j0VarA.f5788b.poll()).run();
                }
            } catch (Exception e11) {
                AdLog.ad("init admob sdk failed, msg = " + e11.getMessage());
                AdLog.e(e11.getMessage(), e11);
                if (iComCallback != null) {
                    iComCallback.onFailed(-1, e11.getMessage());
                }
            }
        }
    }

    public static void IL1Iii(Context context, String str, InitializationListener initializationListener) {
        if (!VungleAds.isInitialized()) {
            VungleAds.init(context, str, new IL(initializationListener));
        } else {
            AdLog.i("Vungle has success");
            initializationListener.onSuccess();
        }
    }

    public static void IL1Iii(Context context, String str, IComCallback iComCallback) {
        try {
            if (!f3392IL) {
                BigoAdSdk.initialize(context, new AdConfig.Builder().setAppId(str).setDebug(Constant.debugFlag).build(), new L11I(iComCallback));
            } else {
                AdLog.i("Bigo has init success");
                iComCallback.onSuccess();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            iComCallback.onFailed(-1, e10.getMessage());
        }
    }

    public static void IL1Iii(Context context, String str, String str2, IComCallback iComCallback) {
        if (I1I) {
            AdLog.i("Mintegral has init success");
            iComCallback.onSuccess();
        } else {
            MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
            mBridgeSDK.init(mBridgeSDK.getMBConfigurationMap(str, str2), context, new iILLL1(iComCallback));
        }
    }

    public static void ILil(Context context, IComCallback iComCallback) {
        if (e1.f5756d == null) {
            synchronized (e1.class) {
                if (e1.f5756d == null) {
                    e1.f5756d = new e1();
                }
            }
        }
        e1.f5756d.a(context, iComCallback);
    }
}
