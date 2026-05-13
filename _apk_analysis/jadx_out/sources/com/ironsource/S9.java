package com.ironsource;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3978d4;
import com.ironsource.C4266t8;
import com.ironsource.P;
import com.ironsource.Q8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class S9 implements InterfaceC4060he, InterfaceC4347y4, InterfaceC4330x4, InterfaceC4296v4, InterfaceC4313w4, Y9, Nc {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f30372m = "IronSourceAdsPublisherAgent";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static S9 f30373n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.ironsource.sdk.controller.e f30374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Z4 f30377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C4185oc f30378e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C4032g4 f30380g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f30379f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FeaturesManager f30381h = FeaturesManager.getInstance();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Q8.a f30382i = Lb.O().j();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private P.a f30383j = Lb.O().E();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private P f30384k = Lb.U().G();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC4232r8 f30385l = Lb.U().t();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y4 f30388c;

        public a(String str, String str2, Y4 y42) {
            this.f30386a = str;
            this.f30387b = str2;
            this.f30388c = y42;
        }

        @Override // java.lang.Runnable
        public void run() {
            S9 s92 = S9.this;
            s92.f30374a.a(this.f30386a, this.f30387b, this.f30388c, (InterfaceC4347y4) s92);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f30390a;

        public b(JSONObject jSONObject) {
            this.f30390a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            S9 s92 = S9.this;
            s92.f30374a.a(this.f30390a, (InterfaceC4347y4) s92);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y4 f30394c;

        public c(String str, String str2, Y4 y42) {
            this.f30392a = str;
            this.f30393b = str2;
            this.f30394c = y42;
        }

        @Override // java.lang.Runnable
        public void run() {
            S9 s92 = S9.this;
            s92.f30374a.a(this.f30392a, this.f30393b, this.f30394c, (InterfaceC4330x4) s92);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30396a;

        public d(String str) {
            this.f30396a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            S9 s92 = S9.this;
            s92.f30374a.a(this.f30396a, s92);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f30398a;

        public e(JSONObject jSONObject) {
            this.f30398a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            S9 s92 = S9.this;
            s92.f30374a.a(this.f30398a, (InterfaceC4330x4) s92);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O9 f30400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f30401b;

        public f(O9 o92, Map map) {
            this.f30400a = o92;
            this.f30401b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4266t8.e eVar = this.f30400a.i() ? C4266t8.e.Banner : C4266t8.e.Interstitial;
            Y4 y4A = S9.this.f30377d.a(eVar, this.f30400a);
            C4300v8 c4300v8 = new C4300v8();
            c4300v8.a(G5.f29409x, Boolean.valueOf(this.f30400a.j())).a(G5.G, Boolean.valueOf(this.f30400a.m())).a(G5.f29407v, this.f30400a.g()).a("producttype", Z9.a(this.f30400a)).a(G5.I, Long.valueOf(M.f29819a.b(this.f30400a.e())));
            A8.a(C4024fe.f31713h, c4300v8.a());
            if (eVar == C4266t8.e.Banner) {
                S9 s92 = S9.this;
                s92.f30374a.a(s92.f30375b, s92.f30376c, y4A, (InterfaceC4313w4) s92);
                S9 s93 = S9.this;
                s93.f30374a.a(y4A, this.f30401b, (InterfaceC4313w4) s93);
                return;
            }
            S9 s94 = S9.this;
            s94.f30374a.a(s94.f30375b, s94.f30376c, y4A, (InterfaceC4330x4) s94);
            S9 s95 = S9.this;
            s95.f30374a.b(y4A, this.f30401b, s95);
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y4 f30403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f30404b;

        public g(Y4 y42, Map map) {
            this.f30403a = y42;
            this.f30404b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            S9 s92 = S9.this;
            s92.f30374a.a(this.f30403a, this.f30404b, (InterfaceC4330x4) s92);
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O9 f30406a;

        public h(O9 o92) {
            this.f30406a = o92;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4266t8.e eVar = this.f30406a.i() ? C4266t8.e.Banner : C4266t8.e.Interstitial;
            Y4 y4A = S9.this.f30377d.a(eVar, this.f30406a);
            C4300v8 c4300v8 = new C4300v8();
            c4300v8.a(G5.f29409x, Boolean.valueOf(this.f30406a.j())).a(G5.f29407v, this.f30406a.g()).a("producttype", Z9.a(this.f30406a)).a("isMultipleAdObjects", Boolean.valueOf(this.f30406a.l()));
            A8.a(C4024fe.f31718m, c4300v8.a());
            if (eVar == C4266t8.e.Banner) {
                S9.this.f30374a.a(y4A);
            } else {
                y4A.a(false);
                S9.this.f30374a.b(y4A);
            }
        }
    }

    private S9(Context context, int i10) {
        c(context);
    }

    public S9(String str, String str2, Context context) {
        this.f30375b = str;
        this.f30376c = str2;
        c(context);
    }

    private Ic a(Y4 y42) {
        if (y42 == null) {
            return null;
        }
        return (Ic) y42.i();
    }

    public static synchronized S9 a(Context context, int i10) throws Exception {
        Logger.i(f30372m, "getInstance()");
        if (f30373n == null) {
            f30373n = new S9(context, i10);
        }
        return f30373n;
    }

    public static Y9 a(Context context, String str, String str2) {
        return a(str, str2, context);
    }

    public static synchronized Y9 a(String str, String str2, Context context) {
        if (f30373n == null) {
            A8.a(C4024fe.f31706a);
            f30373n = new S9(str, str2, context);
        }
        return f30373n;
    }

    private Map<String, String> a(Map<String, String> map) {
        map.put("adm", SDKUtils.decodeString(map.get("adm")));
        return map;
    }

    private Kc b(Y4 y42) {
        if (y42 == null) {
            return null;
        }
        return (Kc) y42.i();
    }

    public static synchronized S9 b(Context context) throws Exception {
        return a(context, 0);
    }

    private void b(O9 o92, Map<String, String> map) {
        Logger.d(f30372m, "loadOnNewInstance " + o92.e());
        this.f30374a.a(new f(o92, map));
    }

    private Pc c(Y4 y42) {
        if (y42 == null) {
            return null;
        }
        return (Pc) y42.i();
    }

    private void c(Context context) {
        try {
            SDKUtils.getNetworkConfiguration();
            C4038ga.a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new C4273tf(SDKUtils.getNetworkConfiguration().optJSONObject(C3978d4.a.f31215k)));
            C4038ga.e().d(SDKUtils.getSDKVersion());
            this.f30377d = new Z4();
            C4032g4 c4032g4 = new C4032g4();
            this.f30380g = c4032g4;
            if (context instanceof Activity) {
                c4032g4.a((Activity) context);
            }
            int debugMode = this.f30381h.getDebugMode();
            this.f30378e = new C4185oc();
            this.f30374a = new com.ironsource.sdk.controller.e(context, this.f30380g, this.f30377d, V7.f30593a, debugMode, this.f30381h.getDataManagerConfig(), this.f30375b, this.f30376c, this.f30378e);
            Logger.enableLogging(debugMode);
            Logger.i(f30372m, "C'tor");
            a(context);
            this.f30378e.d();
            this.f30378e.e();
            this.f30378e.a(context);
            this.f30378e.b();
            this.f30378e.a();
            this.f30378e.b(context);
            this.f30378e.c();
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private void c(O9 o92, Map<String, String> map) {
        try {
            map = a(map);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            C4300v8 c4300v8A = new C4300v8().a(G5.A, e10.getMessage()).a(G5.f29409x, Boolean.valueOf(o92.j())).a(G5.G, Boolean.valueOf(o92.m())).a(G5.f29407v, o92.g()).a("producttype", Z9.a(o92)).a(G5.I, Long.valueOf(M.f29819a.b(o92.e())));
            M.f29819a.a(o92.e());
            A8.a(C4024fe.f31716k, c4300v8A.a());
            IronLog.INTERNAL.error(e10.toString());
            Logger.d(f30372m, "loadInAppBiddingAd failed decoding  ADM " + e10.getMessage());
        }
        b(o92, map);
    }

    private Y4 d(C4266t8.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f30377d.a(eVar, str);
    }

    @Override // com.ironsource.Y9
    public com.ironsource.sdk.controller.e a() {
        return this.f30374a;
    }

    @Override // com.ironsource.InterfaceC4060he, com.ironsource.Y9
    public void a(Activity activity) {
        try {
            Logger.i(f30372m, "release()");
            C3961c5.g();
            this.f30380g.b();
            this.f30374a.a((Context) activity);
            this.f30374a.a();
            this.f30374a = null;
        } catch (Exception e10) {
            C4228r4.d().a(e10);
        }
        f30373n = null;
    }

    @Override // com.ironsource.InterfaceC3930aa
    public void a(Activity activity, O9 o92, Map<String, String> map) {
        this.f30380g.a(activity);
        Logger.i(f30372m, "showAd " + o92.e());
        Y4 y4A = this.f30377d.a(C4266t8.e.Interstitial, o92.e());
        if (y4A == null) {
            return;
        }
        this.f30374a.a(new g(y4A, map));
    }

    public void a(Context context) {
        this.f30379f = false;
        Boolean boolC = this.f30385l.c(C3978d4.a.f31211g);
        if (boolC == null) {
            boolC = Boolean.FALSE;
        }
        boolean zBooleanValue = boolC.booleanValue();
        this.f30379f = zBooleanValue;
        if (zBooleanValue) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new C4063i(this));
            } catch (Throwable th2) {
                C4228r4.d().a(th2);
                C4300v8 c4300v8 = new C4300v8();
                c4300v8.a(G5.f29410y, th2.getMessage());
                A8.a(C4024fe.f31726u, c4300v8.a());
            }
        }
    }

    @Override // com.ironsource.InterfaceC3930aa
    public void a(O9 o92, Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        map.put(C3978d4.i.f31374y0, String.valueOf(jCurrentTimeMillis));
        M.f29819a.a(o92.e(), jCurrentTimeMillis);
        C4300v8 c4300v8 = new C4300v8();
        c4300v8.a(G5.f29409x, Boolean.valueOf(o92.j())).a(G5.G, Boolean.valueOf(o92.m())).a(G5.f29407v, o92.g()).a("producttype", Z9.a(o92)).a(G5.I, Long.valueOf(jCurrentTimeMillis));
        A8.a(C4024fe.f31711f, c4300v8.a());
        Logger.d(f30372m, "loadAd " + o92.e());
        O o10 = new O(o92);
        this.f30383j.a(o10);
        this.f30383j.a(new JSONObject(map), EnumC4155n0.LOAD_REQUEST, o10.c());
        if (c(o92)) {
            this.f30382i.a(new C3935af(o10));
        }
        if (o92.k()) {
            c(o92, map);
        } else {
            b(o92, map);
        }
    }

    @Override // com.ironsource.InterfaceC4296v4
    public void a(C4266t8.e eVar, String str) {
        Ic icA;
        Y4 y4D = d(eVar, str);
        if (y4D != null) {
            if (eVar == C4266t8.e.RewardedVideo) {
                Pc pcC = c(y4D);
                if (pcC != null) {
                    pcC.a();
                    return;
                }
                return;
            }
            if (eVar == C4266t8.e.Interstitial) {
                Kc kcB = b(y4D);
                if (kcB != null) {
                    kcB.onInterstitialClick();
                    return;
                }
                return;
            }
            if (eVar != C4266t8.e.Banner || (icA = a(y4D)) == null) {
                return;
            }
            icA.onBannerClick();
        }
    }

    @Override // com.ironsource.InterfaceC4296v4
    public void a(C4266t8.e eVar, String str, Z0 z02) {
        Ic icA;
        Y4 y4D = d(eVar, str);
        if (y4D != null) {
            y4D.b(2);
            if (eVar == C4266t8.e.RewardedVideo) {
                Pc pcC = c(y4D);
                if (pcC != null) {
                    pcC.a(z02);
                    return;
                }
                return;
            }
            if (eVar == C4266t8.e.Interstitial) {
                Kc kcB = b(y4D);
                if (kcB != null) {
                    kcB.onInterstitialInitSuccess();
                    return;
                }
                return;
            }
            if (eVar != C4266t8.e.Banner || (icA = a(y4D)) == null) {
                return;
            }
            icA.onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.InterfaceC4296v4
    public void a(C4266t8.e eVar, String str, String str2) {
        Ic icA;
        Y4 y4D = d(eVar, str);
        C4300v8 c4300v8A = new C4300v8().a(G5.f29407v, str).a("producttype", eVar).a(G5.A, str2);
        if (y4D != null) {
            M m10 = M.f29819a;
            c4300v8A.a(G5.I, Long.valueOf(m10.b(y4D.h())));
            c4300v8A.a(G5.f29409x, Boolean.valueOf(B8.a(y4D)));
            m10.a(y4D.h());
            y4D.b(3);
            if (eVar == C4266t8.e.RewardedVideo) {
                Pc pcC = c(y4D);
                if (pcC != null) {
                    pcC.b(str2);
                }
            } else if (eVar == C4266t8.e.Interstitial) {
                Kc kcB = b(y4D);
                if (kcB != null) {
                    kcB.onInterstitialInitFailed(str2);
                }
            } else if (eVar == C4266t8.e.Banner && (icA = a(y4D)) != null) {
                icA.onBannerLoadFail(str2);
            }
        }
        A8.a(C4024fe.f31714i, c4300v8A.a());
    }

    @Override // com.ironsource.InterfaceC4296v4
    public void a(C4266t8.e eVar, String str, String str2, JSONObject jSONObject) {
        Ic icA;
        Y4 y4D = d(eVar, str);
        if (y4D == null || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            Logger.i(f30372m, "Received Event Notification: " + str2 + " for demand source: " + y4D.f());
            if (eVar == C4266t8.e.Interstitial) {
                Kc kcB = b(y4D);
                if (kcB != null) {
                    jSONObject.put("demandSourceName", str);
                    kcB.onInterstitialEventNotificationReceived(str2, jSONObject);
                }
            } else if (eVar == C4266t8.e.RewardedVideo) {
                Pc pcC = c(y4D);
                if (pcC != null) {
                    jSONObject.put("demandSourceName", str);
                    pcC.a(str2, jSONObject);
                }
            } else if (eVar == C4266t8.e.Banner && (icA = a(y4D)) != null) {
                jSONObject.put("demandSourceName", str);
                if (str2.equalsIgnoreCase("impressions")) {
                    icA.onBannerShowSuccess();
                }
            }
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.InterfaceC4347y4
    public void a(String str, int i10) {
        Pc pcC;
        Y4 y4D = d(C4266t8.e.RewardedVideo, str);
        if (y4D == null || (pcC = c(y4D)) == null) {
            return;
        }
        pcC.a(i10);
    }

    @Override // com.ironsource.InterfaceC4313w4
    public void a(String str, C4107k8 c4107k8) {
        Ic icA;
        Y4 y4D = d(C4266t8.e.Banner, str);
        if (y4D == null || (icA = a(y4D)) == null) {
            return;
        }
        icA.onBannerLoadSuccess(y4D.c(), c4107k8);
    }

    @Override // com.ironsource.InterfaceC4330x4
    public void a(String str, String str2) {
        C4266t8.e eVar = C4266t8.e.Interstitial;
        Y4 y4D = d(eVar, str);
        C4300v8 c4300v8 = new C4300v8();
        c4300v8.a(G5.A, str2).a(G5.f29407v, str);
        if (y4D != null) {
            C4300v8 c4300v8A = c4300v8.a("producttype", B8.a(y4D, eVar)).a(G5.f29410y, y4D.e() == 2 ? G5.E : G5.F).a(G5.f29409x, Boolean.valueOf(B8.a(y4D)));
            M m10 = M.f29819a;
            c4300v8A.a(G5.I, Long.valueOf(m10.b(y4D.h())));
            m10.a(y4D.h());
            Kc kcB = b(y4D);
            if (kcB != null) {
                kcB.onInterstitialLoadFailed(str2);
            }
        }
        A8.a(C4024fe.f31712g, c4300v8.a());
    }

    @Override // com.ironsource.InterfaceC4060he
    public void a(String str, String str2, int i10) {
        C4266t8.e productType;
        Y4 y4A;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (productType = SDKUtils.getProductType(str)) == null || (y4A = this.f30377d.a(productType, str2)) == null) {
            return;
        }
        y4A.c(i10);
    }

    @Override // com.ironsource.InterfaceC4060he
    public void a(String str, String str2, String str3, Map<String, String> map, Kc kc2) {
        this.f30375b = str;
        this.f30376c = str2;
        this.f30374a.a(new c(str, str2, this.f30377d.a(C4266t8.e.Interstitial, str3, map, kc2)));
    }

    @Override // com.ironsource.InterfaceC4060he
    public void a(String str, String str2, String str3, Map<String, String> map, Pc pc2) {
        this.f30375b = str;
        this.f30376c = str2;
        this.f30374a.a(new a(str, str2, this.f30377d.a(C4266t8.e.RewardedVideo, str3, map, pc2)));
    }

    @Override // com.ironsource.InterfaceC4330x4
    public void a(String str, JSONObject jSONObject) {
        C4266t8.e eVar = C4266t8.e.Interstitial;
        Y4 y4D = d(eVar, str);
        C4300v8 c4300v8A = new C4300v8().a(G5.f29407v, str);
        if (y4D != null) {
            O9 o9C = y4D.c();
            this.f30383j.a(jSONObject, EnumC4155n0.LOAD_SUCCESS, o9C.e());
            if (c(o9C)) {
                this.f30382i.a(new C3953bf(this.f30384k.a(o9C.e())));
            }
            C4300v8 c4300v8A2 = c4300v8A.a("producttype", B8.a(y4D, eVar)).a(G5.f29409x, Boolean.valueOf(B8.a(y4D)));
            M m10 = M.f29819a;
            c4300v8A2.a(G5.I, Long.valueOf(m10.b(y4D.h())));
            m10.a(y4D.h());
            Kc kcB = b(y4D);
            if (kcB != null) {
                kcB.onInterstitialLoadSuccess(y4D.c());
            }
        }
        A8.a(C4024fe.f31717l, c4300v8A.a());
    }

    @Override // com.ironsource.InterfaceC4060he
    public void a(JSONObject jSONObject) {
        this.f30374a.a(new b(jSONObject));
    }

    @Override // com.ironsource.InterfaceC3930aa
    public boolean a(O9 o92) {
        Logger.d(f30372m, "isAdAvailable " + o92.e());
        Y4 y4A = this.f30377d.a(C4266t8.e.Interstitial, o92.e());
        if (y4A == null) {
            return false;
        }
        return y4A.d();
    }

    @Override // com.ironsource.InterfaceC4060he
    public boolean a(String str) {
        return this.f30374a.a(str);
    }

    @Override // com.ironsource.Nc
    public void b(Activity activity) {
        try {
            this.f30374a.e();
            this.f30374a.a((Context) activity);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.InterfaceC3930aa
    public void b(Activity activity, O9 o92, Map<String, String> map) {
        if (Lb.U().g().c()) {
            this.f30380g.a(activity);
        }
        a(o92, map);
    }

    @Override // com.ironsource.InterfaceC3930aa
    public void b(O9 o92) {
        Logger.d(f30372m, "destroyInstance " + o92.e());
        if (c(o92)) {
            this.f30383j.a(EnumC4155n0.DESTROYED, o92.e());
            this.f30382i.a(new Ze(this.f30384k.a(o92.e())));
        }
        this.f30374a.a(new h(o92));
    }

    @Override // com.ironsource.InterfaceC4296v4
    public void b(C4266t8.e eVar, String str) {
        Kc kcB;
        Y4 y4D = d(eVar, str);
        if (y4D != null) {
            if (eVar == C4266t8.e.RewardedVideo) {
                Pc pcC = c(y4D);
                if (pcC != null) {
                    pcC.d();
                    return;
                }
                return;
            }
            if (eVar != C4266t8.e.Interstitial || (kcB = b(y4D)) == null) {
                return;
            }
            kcB.onInterstitialClose();
        }
    }

    @Override // com.ironsource.InterfaceC4330x4
    public void b(String str) {
        Y4 y4D = d(C4266t8.e.Interstitial, str);
        if (y4D != null) {
            O9 o9C = y4D.c();
            this.f30383j.a(EnumC4155n0.SHOW_SUCCESS, o9C.e());
            if (c(o9C)) {
                this.f30382i.a(new C3989df(this.f30384k.a(o9C.e())));
            }
            Kc kcB = b(y4D);
            if (kcB != null) {
                kcB.onInterstitialShowSuccess();
            }
        }
    }

    @Override // com.ironsource.InterfaceC4347y4
    public void b(String str, String str2) {
        Pc pcC;
        Y4 y4D = d(C4266t8.e.RewardedVideo, str);
        if (y4D == null || (pcC = c(y4D)) == null) {
            return;
        }
        pcC.a(str2);
    }

    @Override // com.ironsource.InterfaceC4060he
    public void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("demandSourceName");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.f30374a.a(new d(strOptString));
    }

    @Override // com.ironsource.Nc
    public void c(Activity activity) {
        this.f30380g.a(activity);
        this.f30374a.g();
        this.f30374a.b(activity);
    }

    @Override // com.ironsource.InterfaceC4296v4
    public void c(C4266t8.e eVar, String str) {
        Pc pcC;
        Y4 y4D = d(eVar, str);
        if (y4D != null) {
            if (eVar == C4266t8.e.Interstitial) {
                Kc kcB = b(y4D);
                if (kcB != null) {
                    kcB.onInterstitialOpen();
                    return;
                }
                return;
            }
            if (eVar != C4266t8.e.RewardedVideo || (pcC = c(y4D)) == null) {
                return;
            }
            pcC.b();
        }
    }

    @Override // com.ironsource.InterfaceC4347y4
    public void c(String str) {
        Pc pcC;
        Y4 y4D = d(C4266t8.e.RewardedVideo, str);
        if (y4D == null || (pcC = c(y4D)) == null) {
            return;
        }
        pcC.c();
    }

    @Override // com.ironsource.InterfaceC4313w4
    public void c(String str, String str2) {
        Ic icA;
        Y4 y4D = d(C4266t8.e.Banner, str);
        if (y4D == null || (icA = a(y4D)) == null) {
            return;
        }
        icA.onBannerLoadFail(str2);
    }

    @Override // com.ironsource.InterfaceC4060he
    public void c(JSONObject jSONObject) {
        this.f30374a.a(new e(jSONObject));
    }

    public boolean c(O9 o92) {
        return o92.l() && !o92.i() && a(o92);
    }

    @Override // com.ironsource.InterfaceC4330x4
    public void d(String str, String str2) {
        Y4 y4D = d(C4266t8.e.Interstitial, str);
        if (y4D != null) {
            O9 o9C = y4D.c();
            this.f30383j.a(EnumC4155n0.SHOW_FAIL, o9C.e());
            if (c(o9C)) {
                this.f30382i.a(new C3971cf(this.f30384k.a(o9C.e())));
            }
            Kc kcB = b(y4D);
            if (kcB != null) {
                kcB.onInterstitialShowFailed(str2);
            }
        }
    }

    @Override // com.ironsource.InterfaceC4330x4
    public void onInterstitialAdRewarded(String str, int i10) {
        Y4 y4D = d(C4266t8.e.Interstitial, str);
        Kc kcB = b(y4D);
        if (y4D == null || kcB == null) {
            return;
        }
        kcB.onInterstitialAdRewarded(str, i10);
    }

    @Override // com.ironsource.InterfaceC4060he, com.ironsource.Y9
    public void onPause(Activity activity) {
        if (this.f30379f) {
            return;
        }
        b(activity);
    }

    @Override // com.ironsource.InterfaceC4060he, com.ironsource.Y9
    public void onResume(Activity activity) {
        if (this.f30379f) {
            return;
        }
        c(activity);
    }
}
