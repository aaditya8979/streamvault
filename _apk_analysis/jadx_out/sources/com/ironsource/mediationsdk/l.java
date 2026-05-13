package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ironsource.C3;
import com.ironsource.C4049h3;
import com.ironsource.C4228r4;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.J9;
import com.ironsource.Y7;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f32635a = "BANNER";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f32636b = "LARGE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f32637c = "RECTANGLE";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f32638d = "LEADERBOARD";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f32639e = "SMART";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f32640f = "CUSTOM";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f32641g = "MEDIUM_RECTANGLE";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f32642h = "bannerAdSize";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f32643i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f32644j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f32645k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f32646l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f32647m = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f32648n = 5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f32649o = 6;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f32650p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f32651q = "Adaptive=true";

    public interface a {
        void a(Map<String, Object> map, List<String> list, StringBuilder sb2);
    }

    public interface b {
        void a();

        void a(String str);
    }

    public static int a(int i10) {
        int iA = -1;
        try {
            iA = a(a(c.b()), i10);
            a(i10, iA);
            IronLog.API.verbose("Maximal height - " + iA + " for width - " + i10);
            return iA;
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error("Failed to get adaptive height: " + e10.getMessage());
            return iA;
        }
    }

    private static int a(Object obj, int i10) {
        if (obj instanceof AbstractAdapter) {
            return ((AbstractAdapter) obj).getAdaptiveHeight(i10);
        }
        if (obj instanceof LevelPlayBaseAdapter) {
            return ((LevelPlayBaseAdapter) obj).getAdaptiveHeight(i10);
        }
        return -1;
    }

    private static int a(Map<String, Object> map, int i10) {
        int iMax = -1;
        for (Object obj : map.values()) {
            try {
                iMax = Math.max(iMax, a(obj, i10));
            } catch (Throwable th2) {
                a(obj, th2);
            }
        }
        return iMax;
    }

    public static long a(long j10, long j11) {
        return j11 - (new Date().getTime() - j10);
    }

    public static ISBannerSize a() {
        return new ISBannerSize(f32638d, 728, 90);
    }

    public static ISBannerSize a(String str, int i10, int i11) {
        return new ISBannerSize(str, i10, i11);
    }

    public static String a(ISBannerSize iSBannerSize) {
        return "Adaptive=true, size: " + iSBannerSize.f32321e.d() + VastAttributes.HORIZONTAL_POSITION + iSBannerSize.f32321e.c() + "; fallback: " + iSBannerSize.getDescription() + ", size: " + iSBannerSize.getWidth() + VastAttributes.HORIZONTAL_POSITION + iSBannerSize.getHeight() + ";";
    }

    private static Map<String, Object> a(c cVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(cVar.a());
        concurrentHashMap.putAll(cVar.c());
        return concurrentHashMap;
    }

    private static void a(int i10, int i11) {
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (i11 == -1) {
                jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_ERROR_CODE, 2);
                jSONObjectJsonObjectInit.put("reason", "No networks found supporting adaptive banners");
            } else {
                jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_EXT1, "w:" + i10 + ",h:" + i11);
            }
            J9.i().a(new C5(D5.BN_GET_MAXIMAL_ADAPTIVE_HEIGHT, jSONObjectJsonObjectInit));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public static void a(q qVar) {
        if (qVar != null) {
            qVar.a();
        }
    }

    private static void a(q qVar, View view, Context context, ISBannerSize iSBannerSize) {
        int iDpToPixels = AdapterUtils.dpToPixels(context, iSBannerSize.f32321e.d());
        int iDpToPixels2 = AdapterUtils.dpToPixels(context, iSBannerSize.f32321e.c());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iDpToPixels, iDpToPixels2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setGravity(17);
        relativeLayout.addView(view, 0);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) qVar.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iDpToPixels, iDpToPixels2);
        }
        layoutParams2.height = iDpToPixels2;
        layoutParams2.width = iDpToPixels;
        layoutParams2.gravity = 17;
        qVar.setLayoutParams(layoutParams2);
        IronLog.INTERNAL.verbose("containerParams height - " + iSBannerSize.f32321e.c() + " width - " + iSBannerSize.f32321e.d());
        qVar.addView(relativeLayout, 0, layoutParams2);
    }

    public static void a(q qVar, View view, FrameLayout.LayoutParams layoutParams) {
        a(qVar, view, layoutParams, (C3) null);
    }

    public static void a(final q qVar, final View view, final FrameLayout.LayoutParams layoutParams, final C3 c32) {
        if (qVar == null || view == null || layoutParams == null) {
            return;
        }
        final Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        final ISBannerSize size = qVar.getSize();
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new Runnable() { // from class: com.ironsource.mediationsdk.e0
            @Override // java.lang.Runnable
            public final void run() {
                l.a(qVar, view, size, applicationContext, layoutParams, c32);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(q qVar, View view, ISBannerSize iSBannerSize, Context context, FrameLayout.LayoutParams layoutParams, C3 c32) {
        try {
            qVar.removeAllViews();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            if (iSBannerSize != null) {
                if (iSBannerSize.isAdaptive()) {
                    a(qVar, view, context, iSBannerSize);
                } else {
                    qVar.addView(view, 0, layoutParams);
                }
            }
            if (c32 != null) {
                c32.a();
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error("Error while binding a banner - " + Log.getStackTraceString(e10));
        }
    }

    public static void a(q qVar, C4049h3 c4049h3, b bVar) {
        String str;
        if (c(qVar)) {
            str = null;
        } else {
            str = String.format("can't load banner - %s", qVar == null ? "banner is null" : "banner is destroyed");
        }
        if (c4049h3 == null || TextUtils.isEmpty(c4049h3.c())) {
            str = String.format("can't load banner - %s", c4049h3 == null ? "placement is null" : "placement name is empty");
        }
        if (TextUtils.isEmpty(str)) {
            bVar.a();
        } else {
            IronLog.INTERNAL.error(str);
            bVar.a(str);
        }
    }

    public static void a(q qVar, b bVar) {
        if (qVar == null || qVar.b()) {
            bVar.a(String.format("can't destroy banner - %s", qVar == null ? "banner is null" : "banner is destroyed"));
        } else {
            bVar.a();
        }
    }

    private static void a(Object obj, Throwable th2) {
        String simpleName = obj != null ? obj.getClass().getSimpleName() : "unknown";
        C4228r4.d().a(th2);
        IronLog.INTERNAL.error("Exception while calling getAdaptiveHeight for adapter - " + simpleName + ": " + th2.getMessage());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void a(Map<String, Object> map, ISBannerSize iSBannerSize) {
        if (iSBannerSize != null) {
            try {
                String description = iSBannerSize.getDescription();
                byte b10 = -1;
                switch (description.hashCode()) {
                    case -387072689:
                        if (description.equals(f32637c)) {
                            b10 = 2;
                        }
                        break;
                    case 72205083:
                        if (description.equals(f32636b)) {
                            b10 = 1;
                        }
                        break;
                    case 79011241:
                        if (description.equals(f32639e)) {
                            b10 = 4;
                        }
                        break;
                    case 446888797:
                        if (description.equals(f32638d)) {
                            b10 = 3;
                        }
                        break;
                    case 1951953708:
                        if (description.equals("BANNER")) {
                            b10 = 0;
                        }
                        break;
                    case 1999208305:
                        if (description.equals("CUSTOM")) {
                            b10 = 5;
                        }
                        break;
                }
                if (b10 == 0) {
                    map.put(f32642h, 1);
                } else if (b10 == 1) {
                    map.put(f32642h, 2);
                } else if (b10 == 2) {
                    map.put(f32642h, 3);
                } else if (b10 == 3) {
                    map.put(f32642h, 4);
                } else if (b10 == 4) {
                    map.put(f32642h, 5);
                } else if (b10 == 5) {
                    map.put(f32642h, 6);
                    map.put("custom_banner_size", iSBannerSize.getWidth() + VastAttributes.HORIZONTAL_POSITION + iSBannerSize.getHeight());
                }
                if (iSBannerSize.isAdaptive()) {
                    String strA = a(iSBannerSize);
                    if (map.containsKey(IronSourceConstants.EVENTS_EXT1)) {
                        strA = map.get(IronSourceConstants.EVENTS_EXT1) + " , " + a(iSBannerSize);
                    }
                    map.put(IronSourceConstants.EVENTS_EXT1, strA);
                }
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(Log.getStackTraceString(e10));
            }
        }
    }

    public static boolean a(Y7 y72, int i10, int i11) {
        if (y72 == null || y72.d() <= 0 || y72.c() <= 0) {
            IronLog.API.warning("Container size is invalid: Default banner size will be used.");
            return false;
        }
        if (y72.d() >= i10 && y72.c() >= i11) {
            return true;
        }
        IronLog.API.warning("Container size too small: Banner may not display correctly.");
        return true;
    }

    public static int b(int i10) {
        if (r.m().O()) {
            return a(i10);
        }
        IronLog.API.error("The mediation must be successfully initiated before calling this API");
        return -1;
    }

    public static ISBannerSize b() {
        if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
            a(f32639e, 728, 90);
        }
        return a(f32639e, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    }

    public static void b(q qVar) {
        ISBannerSize size;
        if (qVar == null || (size = qVar.getSize()) == null || !size.isSmart()) {
            return;
        }
        ISBannerSize iSBannerSizeB = b();
        o.f32720a.a(iSBannerSizeB, size.f32321e);
        iSBannerSizeB.setAdaptive(size.isAdaptive());
        qVar.setBannerSize(iSBannerSizeB);
    }

    public static boolean c(q qVar) {
        return (qVar == null || qVar.b()) ? false : true;
    }
}
