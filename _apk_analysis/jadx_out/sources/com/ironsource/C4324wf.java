package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4244s3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C4324wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<IronSource.a, C4208q0> f34348a = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.wf$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f34350b;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            f34350b = iArr;
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34350b[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34350b[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34350b[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IronSource.a.values().length];
            f34349a = iArr2;
            try {
                iArr2[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34349a[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34349a[IronSource.a.NATIVE_AD.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34349a[IronSource.a.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.wf$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IronSource.a f34351a;

        public b(IronSource.a aVar) {
            this.f34351a = aVar;
        }

        private String b() {
            IronSource.a aVar = this.f34351a;
            return aVar != null ? aVar.name() : "";
        }

        public String a() {
            return a(null);
        }

        public String a(String str) {
            return a(str, null);
        }

        public String a(String str, String str2) {
            String str3;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b());
            if (TextUtils.isEmpty(str2)) {
                str3 = "";
            } else {
                str3 = " - " + str2;
            }
            sb2.append(str3);
            String string = sb2.toString();
            if (TextUtils.isEmpty(str)) {
                return string;
            }
            return string + " - " + str;
        }
    }

    public static S0 a(AbstractC4309w0 abstractC4309w0, int i10) {
        return a(abstractC4309w0).a(abstractC4309w0.b().c(), abstractC4309w0.m(), i10);
    }

    public static C4002ea a() {
        return com.ironsource.mediationsdk.r.m().s();
    }

    private static C4208q0 a(AbstractC4309w0 abstractC4309w0) {
        Map<IronSource.a, C4208q0> map = f34348a;
        if (map.containsKey(abstractC4309w0.b().a())) {
            return map.get(abstractC4309w0.b().a());
        }
        C4208q0 c4208q0 = new C4208q0();
        map.put(abstractC4309w0.b().a(), c4208q0);
        return c4208q0;
    }

    public static LevelPlay.AdFormat a(IronSource.a aVar) {
        int i10 = a.f34349a[aVar.ordinal()];
        if (i10 == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i10 == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i10 == 3) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        if (i10 != 4) {
            return null;
        }
        return LevelPlay.AdFormat.BANNER;
    }

    public static String a(LevelPlay.AdFormat adFormat) {
        int i10 = a.f34350b[adFormat.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "" : "nativeAd" : "banner" : "interstitial" : "rewarded";
    }

    public static void a(D5 d52, JSONObject jSONObject) {
        Lb.U().q().a(new C5(d52, C4127la.a(IronSourceUtils.b(false), jSONObject)));
    }

    public static void a(Exception exc) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "Exception", exc);
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("reason", exc.getMessage());
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        a(D5.TROUBLESHOOTING_LOAD_ARM_DATA_PARSE_ERROR, jSONObjectJsonObjectInit);
    }

    public static void a(Throwable th2) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "SafeRunnable", th2);
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("reason", th2.getMessage());
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        a(D5.TROUBLESHOOTING_SDK_INTERNAL_ERROR, jSONObjectJsonObjectInit);
    }

    public static boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.a aVar, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(a(aVar))) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    public static IronSource.a b(LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return null;
        }
        int i10 = a.f34350b[adFormat.ordinal()];
        if (i10 == 1) {
            return IronSource.a.REWARDED_VIDEO;
        }
        if (i10 == 2) {
            return IronSource.a.INTERSTITIAL;
        }
        if (i10 == 3) {
            return IronSource.a.BANNER;
        }
        if (i10 != 4) {
            return null;
        }
        return IronSource.a.NATIVE_AD;
    }

    public static b b(IronSource.a aVar) {
        return new b(aVar);
    }

    public static int c(IronSource.a aVar) {
        int i10 = a.f34349a[aVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? AbstractC4244s3.e.NOT_SUPPORTED.b() : AbstractC4244s3.e.BANNER.b() : AbstractC4244s3.e.NATIVE_AD.b() : AbstractC4244s3.e.INTERSTITIAL.b() : AbstractC4244s3.e.REWARDED_VIDEO.b();
    }
}
