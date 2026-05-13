package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.AbstractC4244s3;
import com.ironsource.B7;
import com.ironsource.Be;
import com.ironsource.Bf;
import com.ironsource.C3925a5;
import com.ironsource.C3936ag;
import com.ironsource.C3942b4;
import com.ironsource.C3950bc;
import com.ironsource.C3952be;
import com.ironsource.C3966ca;
import com.ironsource.C3987dd;
import com.ironsource.C4002ea;
import com.ironsource.C4005ed;
import com.ironsource.C4037g9;
import com.ironsource.C4041gd;
import com.ironsource.C4049h3;
import com.ironsource.C4054h8;
import com.ironsource.C4064i0;
import com.ironsource.C4071i7;
import com.ironsource.C4073i9;
import com.ironsource.C4099k0;
import com.ironsource.C4112kd;
import com.ironsource.C4178o5;
import com.ironsource.C4196p5;
import com.ironsource.C4201pa;
import com.ironsource.C4228r4;
import com.ironsource.C4290uf;
import com.ironsource.C4371zb;
import com.ironsource.C5;
import com.ironsource.C9;
import com.ironsource.Ce;
import com.ironsource.Cf;
import com.ironsource.D5;
import com.ironsource.Dc;
import com.ironsource.Dd;
import com.ironsource.E3;
import com.ironsource.G2;
import com.ironsource.H1;
import com.ironsource.H9;
import com.ironsource.InterfaceC3946b8;
import com.ironsource.InterfaceC4057hb;
import com.ironsource.InterfaceC4180o7;
import com.ironsource.InterfaceC4252sb;
import com.ironsource.J9;
import com.ironsource.K1;
import com.ironsource.Lb;
import com.ironsource.Lc;
import com.ironsource.M8;
import com.ironsource.M9;
import com.ironsource.Mb;
import com.ironsource.N9;
import com.ironsource.Ne;
import com.ironsource.O6;
import com.ironsource.P7;
import com.ironsource.Pe;
import com.ironsource.Qb;
import com.ironsource.R7;
import com.ironsource.S3;
import com.ironsource.S5;
import com.ironsource.T3;
import com.ironsource.T4;
import com.ironsource.T7;
import com.ironsource.U2;
import com.ironsource.U4;
import com.ironsource.V6;
import com.ironsource.W9;
import com.ironsource.Wd;
import com.ironsource.X9;
import com.ironsource.Zb;
import com.ironsource.Zd;
import com.ironsource.Zf;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.u;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.controller.FeaturesManager;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.mediation.LevelPlay;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class r implements W9, Lc, T4, T4.b, T4.c, T4.a {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static boolean f32725m0;
    private C4002ea A;
    private final String B;
    private int C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private Boolean J;
    private q K;
    private String L;
    private Boolean M;
    private R7 N;
    private y O;
    private C9 P;
    private Wd Q;
    private G2 R;
    private Dc S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private final ConcurrentHashMap<String, h.d> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32726a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final ConcurrentHashMap<String, h.b> f32727a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32728b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final ConcurrentHashMap<String, h.d> f32729b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B7 f32730c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private com.ironsource.mediationsdk.demandOnly.f f32731c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B7.a f32732d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private com.ironsource.mediationsdk.demandOnly.k f32733d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final P7 f32734e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private com.ironsource.mediationsdk.demandOnly.c f32735e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC4180o7 f32736f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private S5 f32737f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final M8.a f32738g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private X9 f32739g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private IronSourceLoggerManager f32740h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private V6 f32741h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C4371zb f32742i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f32743i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AtomicBoolean f32744j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private AdQualityBridge f32745j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f32746k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public InterfaceC3946b8<ISDemandOnlyInterstitialListener> f32747k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Ne f32748l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public InterfaceC3946b8<ISDemandOnlyRewardedVideoListener> f32749l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f32750m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f32751n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f32752o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Map<String, String> f32753p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f32754q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AtomicBoolean f32755r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f32756s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<IronSource.a> f32757t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f32758u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Context f32759v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Boolean f32760w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Set<IronSource.a> f32761x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Set<IronSource.a> f32762y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f32763z;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f32765b;

        static {
            int[] iArr = new int[u.d.values().length];
            f32765b = iArr;
            try {
                iArr[u.d.NOT_INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32765b[u.d.INIT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32765b[u.d.INIT_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32765b[u.d.INITIATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IronSource.a.values().length];
            f32764a = iArr2;
            try {
                iArr2[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32764a[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32764a[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32764a[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface b {
        void a(String str);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static volatile r f32766a = new r();

        private c() {
        }
    }

    private r() {
        this(Lb.U().i(), Lb.O().b(), Lb.U().w(), Lb.U().k(), Lb.O().C());
    }

    public r(B7 b72, B7.a aVar, P7 p72, InterfaceC4180o7 interfaceC4180o7, M8.a aVar2) {
        this.f32726a = getClass().getName();
        this.f32728b = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:\u200b9.2.0";
        this.f32746k = new Object();
        this.f32748l = null;
        this.f32750m = null;
        this.f32751n = "";
        this.f32752o = null;
        this.f32753p = null;
        this.f32754q = null;
        this.f32756s = false;
        this.f32760w = null;
        this.f32763z = true;
        this.B = "sessionDepth";
        this.M = null;
        this.f32743i0 = false;
        this.f32730c = b72;
        this.f32732d = aVar;
        this.f32734e = p72;
        this.f32736f = interfaceC4180o7;
        this.f32738g = aVar2;
        v();
        this.f32744j = new AtomicBoolean();
        this.f32761x = new HashSet();
        this.f32762y = new HashSet();
        this.E = false;
        this.D = false;
        this.F = false;
        this.f32755r = new AtomicBoolean(true);
        this.C = 0;
        this.G = false;
        this.H = false;
        this.I = false;
        this.f32758u = IronSourceUtils.d();
        this.J = Boolean.FALSE;
        this.W = false;
        this.L = null;
        this.N = null;
        this.S = null;
        this.O = null;
        this.T = false;
        this.Z = new ConcurrentHashMap<>();
        this.f32729b0 = new ConcurrentHashMap<>();
        this.f32727a0 = new ConcurrentHashMap<>();
        this.f32731c0 = null;
        this.f32733d0 = null;
        this.f32735e0 = null;
        this.Y = 1;
        this.f32737f0 = new S5();
        X9 x92 = new X9();
        this.f32739g0 = x92;
        this.f32741h0 = new V6(x92);
        this.f32745j0 = null;
        this.f32747k0 = new InterfaceC3946b8.a();
        this.f32749l0 = new InterfaceC3946b8.b();
    }

    private boolean A() {
        Ne ne2 = this.f32748l;
        return (ne2 == null || ne2.k() == null || this.f32748l.k().a() == null || this.f32748l.k().a().size() <= 0) ? false : true;
    }

    private synchronized boolean C() {
        return this.f32756s;
    }

    private boolean D() {
        Ne ne2 = this.f32748l;
        return (ne2 == null || ne2.c() == null || this.f32748l.c().d() == null) ? false : true;
    }

    private boolean E() {
        return D() && G();
    }

    private boolean G() {
        Ne ne2 = this.f32748l;
        return (ne2 == null || ne2.k() == null || this.f32748l.k().b() == null || this.f32748l.k().b().size() <= 0) ? false : true;
    }

    private boolean H() {
        Ne ne2 = this.f32748l;
        return (ne2 == null || ne2.c() == null || this.f32748l.c().e() == null) ? false : true;
    }

    private boolean I() {
        return H() && J();
    }

    private boolean J() {
        Ne ne2 = this.f32748l;
        return (ne2 == null || ne2.k() == null || this.f32748l.k().c() == null || this.f32748l.k().c().isEmpty()) ? false : true;
    }

    private boolean L() {
        Ne ne2 = this.f32748l;
        return (ne2 == null || ne2.c() == null || this.f32748l.c().f() == null) ? false : true;
    }

    private boolean M() {
        return L() && N();
    }

    private boolean N() {
        Ne ne2 = this.f32748l;
        return (ne2 == null || ne2.k() == null || this.f32748l.k().d() == null || this.f32748l.k().d().size() <= 0) ? false : true;
    }

    private void T() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = C4201pa.b().c();
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f32678c)) {
            if (TextUtils.isEmpty(concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f32678c).get(0))) {
                return;
            }
            C3925a5.f30911a.b(!MetaDataUtils.getMetaDataBooleanValue(r0));
        }
    }

    private void U() {
        if (this.F) {
            W();
            return;
        }
        boolean zH = this.f32748l.c().c().d().h();
        this.X = zH;
        if (zH) {
            V();
        } else {
            c0();
        }
    }

    private void V() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.f32748l.k().a());
        if (listA.size() > 0) {
            this.R = new G2(listA, this.f32748l.c().c(), IronSourceUtils.f(), C4201pa.b(), this.A);
            u();
        } else {
            JSONObject jSONObjectA = IronSourceUtils.a(false, true, 1);
            a(jSONObjectA, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(D5.TROUBLESHOOTING_BN_INIT_FAILED, jSONObjectA);
            a(IronSource.a.BANNER, false);
        }
    }

    private void W() {
        this.f32740h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f32748l.k().a().size(); i10++) {
            String str = this.f32748l.k().a().get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f32748l.l().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject jSONObjectA = IronSourceUtils.a(false, false, 1);
            a(jSONObjectA, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(D5.TROUBLESHOOTING_BN_INIT_FAILED, jSONObjectA);
            a(IronSource.a.BANNER, false);
            return;
        }
        synchronized (this.f32727a0) {
            U2 u2C = this.f32748l.c().c();
            U4.a aVar = new U4.a("Mediation");
            if (u2C.k()) {
                aVar.a("isOneFlow", 1);
            }
            this.f32735e0 = new com.ironsource.mediationsdk.demandOnly.c(arrayList, u2C, n(), o(), new U4.b(J9.i(), aVar));
        }
        for (h.b bVar : this.f32727a0.values()) {
            this.f32735e0.a(bVar.g(), bVar.e());
        }
        this.f32727a0.clear();
    }

    private void X() {
        this.f32740h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f32748l.k().b().size(); i10++) {
            String str = this.f32748l.k().b().get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f32748l.l().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject jSONObjectA = IronSourceUtils.a(false, false, 1);
            a(jSONObjectA, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(D5.TROUBLESHOOTING_IS_INIT_FAILED, jSONObjectA);
            a(IronSource.a.INTERSTITIAL, false);
            return;
        }
        synchronized (this.Z) {
            this.f32731c0 = a((List<NetworkSettings>) arrayList);
        }
        Iterator<h.d> it = this.Z.values().iterator();
        while (it.hasNext()) {
            this.f32731c0.a(it.next());
        }
        this.Z.clear();
    }

    private void Y() {
        this.f32740h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f32748l.k().d().size(); i10++) {
            String str = this.f32748l.k().d().get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f32748l.l().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            a(IronSource.a.REWARDED_VIDEO, false);
            return;
        }
        synchronized (this.f32729b0) {
            this.f32733d0 = b(arrayList);
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            a(IronSource.a.REWARDED_VIDEO, false);
            return;
        }
        Iterator<h.d> it = this.f32729b0.values().iterator();
        while (it.hasNext()) {
            this.f32733d0.a(it.next());
        }
        this.f32729b0.clear();
    }

    private void Z() {
        if (this.E) {
            X();
        } else {
            a0();
        }
    }

    private int a(Zd zd2) {
        return (this.V || this.T || !zd2.k().e()) ? 1 : 2;
    }

    private Ne a(Context context, String str, b bVar) {
        Ne ne2 = null;
        if (!IronSourceUtils.g(context)) {
            return null;
        }
        try {
            String strB = b(context);
            if (TextUtils.isEmpty(strB)) {
                strB = this.f32730c.M(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str2 = strB;
            C4002ea c4002ea = this.A;
            String strA = C4071i7.a(Pe.a(context, n(), str, str2, p(), this.T, c4002ea != null ? c4002ea.f() : null, B()), C4037g9.a().toString(), bVar);
            if (strA == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.g()) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(strA);
                String strOptString = jSONObjectJsonObjectInit.optString("response", null);
                if (TextUtils.isEmpty(strOptString)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return null;
                }
                strA = a(strOptString, Boolean.valueOf(jSONObjectJsonObjectInit.optBoolean("compression", false)));
                if (TextUtils.isEmpty(strA)) {
                    ironLog.warning("encoded response invalid - return null");
                    S();
                    return null;
                }
            }
            Ne ne3 = new Ne(context, n(), str, strA);
            try {
                ne3.a(Ne.a.SERVER);
                if (ne3.q()) {
                    return ne3;
                }
                IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (Exception e10) {
                e = e10;
                ne2 = ne3;
                C4228r4.d().a(e);
                IronLog.INTERNAL.warning("exception = " + e);
                return ne2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private com.ironsource.mediationsdk.demandOnly.f a(List<NetworkSettings> list) {
        H9 h9D = this.f32748l.c().d();
        U4.a aVar = new U4.a("Mediation");
        if (h9D.j()) {
            aVar.a("isOneFlow", 1);
        }
        return new com.ironsource.mediationsdk.demandOnly.f(list, h9D, com.ironsource.mediationsdk.c.b(), this.f32747k0, n(), o(), new U4.b(J9.i(), aVar));
    }

    @Nullable
    private IronSourceError a(u.d dVar) {
        if (!this.I) {
            return new IronSourceError(510, "ironSource SDK was not initialized");
        }
        if (!this.F) {
            return new IronSourceError(510, "ironSource SDK was not initialized using Demand Only mode");
        }
        if (dVar == u.d.INIT_FAILED) {
            return new IronSourceError(510, "ironSource initialization failed");
        }
        if (dVar == u.d.INIT_IN_PROGRESS && u.c().d()) {
            return new IronSourceError(510, "ironSource initialization in progress");
        }
        return null;
    }

    private String a(String str, Boolean bool) {
        return bool.booleanValue() ? N9.d(C4196p5.b().c(), str) : N9.b(C4196p5.b().c(), str);
    }

    private List<NetworkSettings> a(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            String str = arrayList.get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList2.add(this.f32748l.l().b(str));
            }
        }
        return arrayList2;
    }

    private void a(D5 d52, JSONObject jSONObject) {
        J9.i().a(new C5(d52, jSONObject));
    }

    private synchronized void a(Dc dc2) {
        this.S = dc2;
    }

    private void a(K1 k12) {
        C3925a5 c3925a5 = C3925a5.f30911a;
        c3925a5.c(k12.g());
        c3925a5.a(k12.f());
        c3925a5.a(k12.j());
        this.f32736f.a(k12);
    }

    private void a(Ne ne2) {
        if (w() && d(ne2)) {
            AdQualityBridge adQualityBridge = new AdQualityBridge(ContextProvider.getInstance().getApplicationContext(), n(), o(), new C4064i0(), ne2.c().b().h().a());
            this.f32745j0 = adQualityBridge;
            C4002ea c4002ea = this.A;
            if (c4002ea != null) {
                adQualityBridge.setSegment(c4002ea);
            }
        }
    }

    private void a(Ne ne2, Context context) {
        boolean zL = x() ? ne2.c().b().b().l() : false;
        boolean zL2 = L() ? ne2.c().f().m().l() : false;
        boolean zL3 = D() ? ne2.c().d().i().l() : false;
        boolean zL4 = y() ? ne2.c().c().g().l() : false;
        boolean zL5 = H() ? ne2.c().e().g().l() : false;
        C4005ed c4005edI = ne2.c().b().i();
        boolean zI = c4005edI.i();
        if (zL) {
            a((AbstractC4244s3) Lb.U().q(), ne2.c().b().b(), context, ne2, true);
        }
        if (zL2) {
            a((AbstractC4244s3) C3952be.i(), ne2.c().f().m(), context, ne2, true);
        } else {
            C3952be.i().a(false);
        }
        if (zL3) {
            a((AbstractC4244s3) J9.i(), ne2.c().d().i(), context, ne2, true);
        } else if (zL4) {
            a((AbstractC4244s3) J9.i(), ne2.c().c().g(), context, ne2, true);
        } else if (zL5) {
            a((AbstractC4244s3) J9.i(), ne2.c().e().g(), context, ne2, true);
        } else {
            J9.i().a(false);
        }
        C3987dd c3987dd = C3987dd.P;
        c3987dd.a(zI);
        if (zI) {
            c3987dd.b(c4005edI.j(), context);
            c3987dd.b(c4005edI.l(), context);
            c3987dd.c(c4005edI.k(), context);
            c3987dd.b(c4005edI.g());
            c3987dd.c(c4005edI.h());
        }
    }

    private void a(IronSource.a aVar) {
        String str = aVar + " ad unit has already been initialized";
        this.f32740h.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.i(str);
    }

    private void a(IronSource.a aVar, boolean z10) {
        int i10 = a.f32764a[aVar.ordinal()];
        if (i10 == 1) {
            if (this.D) {
                Iterator<h.d> it = this.f32729b0.values().iterator();
                while (it.hasNext()) {
                    String strE = it.next().e();
                    this.f32749l0.a(strE).onRewardedVideoAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.f32729b0.clear();
                return;
            }
            if (this.T) {
                if (this.U) {
                    this.U = false;
                    n.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
                return;
            }
            if (z10 || L() || this.f32762y.contains(aVar)) {
                Dd.a().a(false, (AdInfo) null);
                return;
            }
            return;
        }
        if (i10 == 2) {
            if (!this.E) {
                if (this.W) {
                    this.W = false;
                    n.a().b(IronSource.a.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                    return;
                }
                return;
            }
            Iterator<h.d> it2 = this.Z.values().iterator();
            while (it2.hasNext()) {
                String strE2 = it2.next().e();
                this.f32747k0.a(strE2).onInterstitialAdLoadFailed(strE2, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Interstitial"));
            }
            this.Z.clear();
            return;
        }
        if (i10 != 3) {
            return;
        }
        if (!this.F) {
            if (this.J.booleanValue()) {
                this.J = Boolean.FALSE;
                n.a().b(IronSource.a.BANNER, new IronSourceError(602, "init() had failed"));
                this.K = null;
                this.L = null;
                return;
            }
            return;
        }
        for (h.b bVar : this.f32727a0.values()) {
            ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutG = bVar.g();
            if (iSDemandOnlyBannerLayoutG != null) {
                iSDemandOnlyBannerLayoutG.getListener().a(bVar.e(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Banner"));
            }
        }
        this.f32727a0.clear();
    }

    private synchronized void a(h.d dVar, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        String strE = dVar.e();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + strE);
        try {
            if (!this.H) {
                ironLog.error("initISDemandOnly() must be called before loadISDemandOnlyInterstitial()");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, new IronSourceError(510, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"));
                return;
            }
            if (!this.E) {
                ironLog.error("Interstitial was initialized in mediation mode. Use loadInterstitial instead");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, new IronSourceError(510, "Interstitial was initialized in mediation mode. Use loadInterstitial instead"));
                return;
            }
            u.d dVarA = u.c().a();
            if (dVarA == u.d.INIT_FAILED) {
                ironLog.error("init() had failed");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                return;
            }
            IronSourceError ironSourceErrorA = dVar.a();
            if (ironSourceErrorA != null) {
                if (ironSourceErrorA.getErrorCode() == 1060) {
                    b(D5.TROUBLESHOOTING_DO_CALLED_IS_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
                }
                ironLog.error(ironSourceErrorA.toString());
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, ironSourceErrorA);
                return;
            }
            e(dVar.d());
            if (dVarA == u.d.INIT_IN_PROGRESS) {
                if (u.c().d()) {
                    ironLog.error("init() had failed");
                    iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                } else {
                    synchronized (this.Z) {
                        this.Z.put(dVar.e(), dVar);
                    }
                    if (!TextUtils.isEmpty(dVar.e())) {
                        a(D5.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
                    }
                }
                return;
            }
            if (!E()) {
                ironLog.error("No interstitial configurations found");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
                return;
            }
            synchronized (this.Z) {
                com.ironsource.mediationsdk.demandOnly.f fVar = this.f32731c0;
                if (fVar == null) {
                    this.Z.put(dVar.e(), dVar);
                    if (!TextUtils.isEmpty(dVar.b())) {
                        a(D5.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
                    }
                    return;
                }
                fVar.a(dVar);
            }
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            IronLog.API.error(th2.getMessage());
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(strE, new IronSourceError(510, th2.getMessage()));
        }
    }

    private void a(AbstractC4244s3 abstractC4244s3, H1 h12, Context context, Ne ne2, boolean z10) {
        abstractC4244s3.a(z10);
        abstractC4244s3.a(h12.c(), context);
        abstractC4244s3.b(h12.d(), context);
        abstractC4244s3.a(h12.f());
        abstractC4244s3.d(h12.e());
        abstractC4244s3.b(h12.a());
        abstractC4244s3.b(h12.i(), context);
        abstractC4244s3.c(h12.h(), context);
        abstractC4244s3.a(h12.j(), context);
        abstractC4244s3.d(h12.g(), context);
        abstractC4244s3.a(ne2.c().b().j());
        abstractC4244s3.b(h12.k());
        abstractC4244s3.c(h12.b());
    }

    private void a(String str, S3 s32) {
        if (a(str, 1, 128)) {
            return;
        }
        s32.a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, "dynamicUserId is invalid, should be between 1-128 chars in length."));
    }

    private void a(JSONObject jSONObject, Object[][] objArr) {
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    jSONObject.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e10), 3);
            }
        }
    }

    private void a(boolean z10, boolean z11, int i10, JSONObject jSONObject, boolean z12) {
        try {
            StringBuilder sb2 = new StringBuilder();
            if (z11) {
                sb2.append(String.format(",Activity=%s", Boolean.valueOf(ContextProvider.getInstance().getCurrentActiveActivity() != null)));
            } else if (!z10) {
                sb2.append(StringUtils.COMMA);
                sb2.append(IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW);
            }
            sb2.append(String.format(",cachedUserAgent=%s", Boolean.valueOf(this.f32730c.n())));
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, sb2.toString());
            jSONObject.put("sessionDepth", i10);
            if (z12) {
                if (z11) {
                    jSONObject.put("isMultipleAdObjects", 1);
                } else {
                    jSONObject.put("isMultipleAdUnits", 1);
                }
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Lb.U().q().a(new C5(D5.FIRST_INSTANCE, jSONObject));
    }

    private synchronized void a(boolean z10, boolean z11, boolean z12, IronSource.a... aVarArr) {
        int i10 = 0;
        for (IronSource.a aVar : aVarArr) {
            if (aVar.equals(IronSource.a.INTERSTITIAL)) {
                this.H = true;
            } else if (aVar.equals(IronSource.a.BANNER)) {
                this.I = true;
            } else if (aVar.equals(IronSource.a.REWARDED_VIDEO)) {
                this.G = true;
            }
        }
        if (u.c().a() == u.d.INIT_FAILED) {
            try {
                if (this.f32742i != null) {
                    int length = aVarArr.length;
                    while (i10 < length) {
                        IronSource.a aVar2 = aVarArr[i10];
                        if (!this.f32761x.contains(aVar2)) {
                            a(aVar2, true);
                        }
                        i10++;
                    }
                }
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
        if (!C()) {
            JSONObject jSONObjectB = IronSourceUtils.b(z11);
            int length2 = aVarArr.length;
            while (i10 < length2) {
                IronSource.a aVar3 = aVarArr[i10];
                if (this.f32761x.contains(aVar3)) {
                    this.f32740h.log(IronSourceLogger.IronSourceTag.API, aVar3 + " ad unit has started initializing.", 3);
                } else {
                    this.f32761x.add(aVar3);
                    this.f32762y.add(aVar3);
                    try {
                        jSONObjectB.put(aVar3.toString(), true);
                    } catch (Exception e11) {
                        C4228r4.d().a(e11);
                        IronLog.INTERNAL.error(e11.toString());
                    }
                }
                i10++;
            }
            int i11 = this.C + 1;
            this.C = i11;
            a(z10, z11, i11, jSONObjectB, z12);
        }
        if (this.f32757t == null) {
            return;
        }
        try {
            new Mb().a(this.f32748l.c().b().e().b(), B());
        } catch (Exception e12) {
            C4228r4.d().a(e12);
            IronLog.INTERNAL.error(e12.toString());
        }
        JSONObject jSONObjectB2 = IronSourceUtils.b(z11);
        for (IronSource.a aVar4 : aVarArr) {
            if (this.f32761x.contains(aVar4)) {
                a(aVar4);
            } else {
                this.f32761x.add(aVar4);
                this.f32762y.add(aVar4);
                try {
                    jSONObjectB2.put(aVar4.toString(), true);
                } catch (Exception e13) {
                    C4228r4.d().a(e13);
                    IronLog.INTERNAL.error(e13.toString());
                }
                List<IronSource.a> list = this.f32757t;
                if (list == null || !list.contains(aVar4)) {
                    a(aVar4, false);
                } else {
                    b(aVar4);
                }
            }
        }
        int i12 = this.C + 1;
        this.C = i12;
        a(z10, z11, i12, jSONObjectB2, z12);
    }

    private boolean a(h.b bVar) {
        if (u.c().a() != u.d.INIT_IN_PROGRESS) {
            return false;
        }
        synchronized (this.f32727a0) {
            this.f32727a0.put(bVar.e(), bVar);
        }
        return true;
    }

    private boolean a(String str, int i10, int i11) {
        return str != null && str.length() >= i10 && str.length() <= i11;
    }

    private void a0() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.f32748l.k().b());
        if (listA.size() <= 0) {
            JSONObject jSONObjectA = IronSourceUtils.a(false, true, 1);
            a(jSONObjectA, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(D5.TROUBLESHOOTING_IS_INIT_FAILED, jSONObjectA);
            a(IronSource.a.INTERSTITIAL, false);
            return;
        }
        C9 c92 = new C9(listA, this.f32748l.c().d(), IronSourceUtils.f(), C4201pa.b(), this.A);
        this.P = c92;
        Boolean bool = this.f32760w;
        if (bool != null) {
            c92.a(this.f32759v, bool.booleanValue());
        }
        if (this.W) {
            this.W = false;
            this.P.A();
        }
    }

    private com.ironsource.mediationsdk.demandOnly.k b(List<NetworkSettings> list) {
        Zd zdF = this.f32748l.c().f();
        U4.a aVar = new U4.a("Mediation");
        if (zdF.d()) {
            aVar.a("isOneFlow", 1);
        }
        return new com.ironsource.mediationsdk.demandOnly.k(list, zdF, com.ironsource.mediationsdk.c.b(), this.f32749l0, n(), o(), new U4.b(C3952be.i(), aVar));
    }

    private void b(D5 d52, JSONObject jSONObject) {
        C3952be.i().a(new C5(d52, jSONObject));
    }

    private void b(Ne ne2) {
        this.f32740h.setLoggerDebugLevel("console", ne2.c().b().h().a());
    }

    private void b(IronSource.a aVar) {
        int i10 = a.f32764a[aVar.ordinal()];
        if (i10 == 1) {
            d0();
        } else if (i10 == 2) {
            Z();
        } else {
            if (i10 != 3) {
                return;
            }
            U();
        }
    }

    private boolean b(h.b bVar) {
        synchronized (this.f32727a0) {
            if (this.f32735e0 != null) {
                return false;
            }
            this.f32727a0.put(bVar.e(), bVar);
            return true;
        }
    }

    private boolean b(List<IronSource.a> list, boolean z10, T3 t32) {
        IronLog.INTERNAL.verbose();
        try {
            this.f32757t = list;
            c(true);
            this.f32740h.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.i("init success");
            if (z10) {
                JSONObject jSONObjectB = IronSourceUtils.b(false);
                try {
                    jSONObjectB.put("revived", true);
                } catch (JSONException e10) {
                    C4228r4.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
                Lb.U().q().a(new C5(D5.FIRST_INSTANCE_RESULT, jSONObjectB));
            }
            int iB = t32.b().f().b();
            if (iB >= 0) {
                C3942b4 c3942b4 = new C3942b4();
                c3942b4.a(iB);
                c3942b4.a(iB, this.f32748l.l().d());
            }
            J9.i().h();
            C3952be.i().h();
            Lb.U().q().h();
            com.ironsource.mediationsdk.c.b().b(n(), o());
            for (IronSource.a aVar : IronSource.a.values()) {
                if (this.f32761x.contains(aVar)) {
                    if (list.contains(aVar)) {
                        b(aVar);
                    } else {
                        a(aVar, false);
                    }
                }
            }
            Dc dcQ = q();
            if (dcQ != null) {
                dcQ.a(this.f32748l);
            }
            return true;
        } catch (Exception e11) {
            C4228r4.d().a(e11);
            IronLog.INTERNAL.error(e11.toString());
            Dc dcQ2 = q();
            if (dcQ2 != null) {
                dcQ2.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "onInitSuccess() had failed"));
            }
            return false;
        }
    }

    private void b0() {
        this.f32740h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in programmatic mode", 0);
        List<NetworkSettings> listA = a(this.f32748l.k().d());
        if (listA.size() <= 0) {
            JSONObject jSONObjectA = IronSourceUtils.a(false, true, this.Y);
            a(jSONObjectA, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            b(D5.TROUBLESHOOTING_RV_INIT_FAILED, jSONObjectA);
            a(IronSource.a.REWARDED_VIDEO, false);
            return;
        }
        s sVar = new s(listA, this.f32748l.c().f(), n(), IronSourceUtils.f(), C4201pa.b().a(), this.A);
        this.N = sVar;
        Boolean bool = this.f32760w;
        if (bool != null) {
            sVar.a(this.f32759v, bool.booleanValue());
        }
    }

    private synchronized void c(boolean z10) {
        this.f32756s = z10;
    }

    private boolean c(Ne ne2) {
        return ne2 != null && ne2.p();
    }

    private void c0() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.f32748l.k().a());
        if (listA.size() > 0) {
            this.f32740h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in programmatic mode", 0);
            this.O = new y(listA, new k(n(), IronSourceUtils.f(), this.f32748l.c().c()), C4201pa.b().a(), this.A);
            u();
        } else {
            JSONObject jSONObjectA = IronSourceUtils.a(false, true, 1);
            a(jSONObjectA, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(D5.TROUBLESHOOTING_BN_INIT_FAILED, jSONObjectA);
            a(IronSource.a.BANNER, false);
        }
    }

    private void d(Activity activity, String str) {
        try {
            M9 m9L = l(str);
            if (m9L == null) {
                m9L = i();
            }
            if (m9L == null) {
                this.f32740h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showProgrammaticInterstitial error: empty default placement in response", 3);
                C4054h8.a().a(new IronSourceError(1020, "showProgrammaticInterstitial error: empty default placement in response"), (AdInfo) null);
                return;
            }
            if (activity != null) {
                e(activity);
            } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                this.f32740h.log(IronSourceLogger.IronSourceTag.API, "Activity must be provided in showInterstitial when initializing SDK with context", 3);
                C4054h8.a().a(new IronSourceError(510, "Activity must be provided in showInterstitial when initializing SDK with context"), (AdInfo) null);
                return;
            }
            this.P.a(activity, new C4041gd(m9L));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            this.f32740h.logException(IronSourceLogger.IronSourceTag.API, "showProgrammaticInterstitial()", e10);
        }
    }

    private void d(Context context) {
        AtomicBoolean atomicBoolean = this.f32744j;
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        C4290uf.a().a(new O6(context));
        Lb.U().q().a(context, this.A);
        J9.i().a(context, this.A);
        C3952be.i().a(context, this.A);
        C3987dd.P.a(context, this.A);
    }

    private boolean d(Ne ne2) {
        com.ironsource.mediationsdk.adquality.a aVarA = ne2.c().a();
        return this.f32745j0 == null && aVarA != null && aVarA.b() && AdQualityBridge.adQualityAvailable();
    }

    private void d0() {
        if (this.D) {
            Y();
            return;
        }
        Zd zdF = this.f32748l.c().f();
        this.V = zdF.k().h();
        this.Y = a(zdF);
        if (this.T || this.V) {
            e0();
        } else {
            b0();
        }
    }

    private void e(Activity activity) {
        ContextProvider.getInstance().updateActivity(activity);
        IronLog.INTERNAL.verbose("activity is updated to: " + activity.hashCode());
    }

    private void e(Activity activity, String str) {
        C4041gd c4041gdN;
        try {
            c4041gdN = n(str);
            if (c4041gdN == null) {
                try {
                    c4041gdN = j();
                } catch (Exception e10) {
                    e = e10;
                    C4228r4.d().a(e);
                    this.f32740h.logException(IronSourceLogger.IronSourceTag.API, "showProgrammaticRewardedVideo()", e);
                }
            }
            if (c4041gdN == null) {
                this.f32740h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showProgrammaticRewardedVideo error: empty default placement in response", 3);
                Dd.a().a(new IronSourceError(1021, "showProgrammaticRewardedVideo error: empty default placement in response"), (AdInfo) null);
                return;
            }
        } catch (Exception e11) {
            e = e11;
            c4041gdN = null;
        }
        if (activity != null) {
            e(activity);
        } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            this.f32740h.log(IronSourceLogger.IronSourceTag.API, "Activity must be provided in showRewardedVideo when initializing SDK with context", 3);
            Dd.a().a(ErrorBuilder.buildInitFailedError("Activity must be provided in showRewardedVideo when initializing SDK with context", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            return;
        }
        Wd wd2 = this.Q;
        if (wd2 != null && (this.T || this.V)) {
            wd2.a(activity, c4041gdN);
            return;
        }
        R7 r72 = this.N;
        if (r72 != null) {
            r72.a(activity, c4041gdN);
            return;
        }
        this.f32740h.log(IronSourceLogger.IronSourceTag.API, "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet", 3);
        Dd.a().a(new IronSourceError(1023, "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet"), (AdInfo) null);
    }

    private void e0() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.f32748l.k().d());
        if (listA.size() <= 0) {
            JSONObject jSONObjectA = IronSourceUtils.a(false, true, this.Y);
            a(jSONObjectA, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            b(D5.TROUBLESHOOTING_RV_INIT_FAILED, jSONObjectA);
            a(IronSource.a.REWARDED_VIDEO, false);
            return;
        }
        Wd wd2 = new Wd(listA, this.f32748l.c().f(), IronSourceUtils.f(), this.T, C4201pa.b(), this.A);
        this.Q = wd2;
        Boolean bool = this.f32760w;
        if (bool != null) {
            wd2.a(this.f32759v, bool.booleanValue());
        }
        if (this.U && this.T) {
            this.U = false;
            this.Q.A();
        }
    }

    private M9 i() {
        H9 h9D = this.f32748l.c().d();
        if (h9D != null) {
            return h9D.a();
        }
        return null;
    }

    private C4041gd j() {
        Zd zdF = this.f32748l.c().f();
        if (zdF != null) {
            return zdF.a();
        }
        return null;
    }

    private U4 k() {
        return new U4.b(Lb.U().q(), new U4.a("IronSource"));
    }

    private C4049h3 k(String str) {
        C4049h3 c4049h3A;
        U2 u2C = this.f32748l.c().c();
        return u2C == null ? new C4178o5() : (TextUtils.isEmpty(str) || (c4049h3A = u2C.a(str)) == null) ? u2C.i() : c4049h3A;
    }

    private M9 l(String str) {
        H9 h9D = this.f32748l.c().d();
        if (h9D != null) {
            return h9D.a(str);
        }
        return null;
    }

    public static r m() {
        return c.f32766a;
    }

    private C4041gd n(String str) {
        Zd zdF = this.f32748l.c().f();
        if (zdF != null) {
            return zdF.a(str);
        }
        return null;
    }

    private boolean p(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    private synchronized Dc q() {
        return this.S;
    }

    private S3 q(String str) {
        S3 s32 = new S3();
        if (str == null) {
            s32.a(new IronSourceError(506, "Init Fail - appKey is missing"));
        } else if (!a(str, 5, 10)) {
            s32.a(ErrorBuilder.buildInvalidCredentialsError("appKey", str, "length should be between 5-10 characters"));
        } else if (!p(str)) {
            s32.a(ErrorBuilder.buildInvalidCredentialsError("appKey", str, "should contain only english characters and numbers"));
        }
        return s32;
    }

    private void u() {
        if (this.J.booleanValue()) {
            IronLog.INTERNAL.verbose("load banner after init");
            this.J = Boolean.FALSE;
            a(this.K, this.L);
            this.K = null;
            this.L = null;
        }
    }

    private void v() {
        this.f32740h = IronSourceLoggerManager.getLogger(0);
        this.f32742i = new C4371zb();
    }

    private boolean w() {
        try {
            IronLog.INTERNAL.verbose("AdQuality SDK exist: " + IronSourceAdQuality.class.getName());
            return true;
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            IronLog.INTERNAL.verbose("No AdQuality SDK found");
            return false;
        }
    }

    private boolean x() {
        Ne ne2 = this.f32748l;
        return (ne2 == null || ne2.c() == null || this.f32748l.c().b() == null || this.f32748l.c().b().b() == null) ? false : true;
    }

    private boolean y() {
        Ne ne2 = this.f32748l;
        return (ne2 == null || ne2.c() == null || this.f32748l.c().c() == null) ? false : true;
    }

    private boolean z() {
        return y() && A();
    }

    public boolean B() {
        return this.D || this.E || this.F;
    }

    public boolean F() {
        boolean z10;
        try {
            if (this.E) {
                this.f32740h.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use isISDemandOnlyInterstitialReady instead", 3);
                return false;
            }
            C9 c92 = this.P;
            boolean z11 = c92 != null && c92.u();
            try {
                J9.i().a(new C5(z11 ? D5.IS_CHECK_READY_TRUE : D5.IS_CHECK_READY_FALSE, IronSourceUtils.a(false, true, 1)));
                this.f32740h.log(IronSourceLogger.IronSourceTag.API, "isInterstitialReady():" + z11, 1);
                return z11;
            } catch (Throwable th2) {
                z10 = z11;
                th = th2;
                C4228r4.d().a(th);
                IronSourceLoggerManager ironSourceLoggerManager = this.f32740h;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.log(ironSourceTag, "isInterstitialReady():" + z10, 1);
                this.f32740h.logException(ironSourceTag, "isInterstitialReady()", th);
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            z10 = false;
        }
    }

    public boolean K() {
        boolean z10;
        boolean z11;
        try {
            if (this.D) {
                this.f32740h.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video was initialized in demand only mode. Use isISDemandOnlyRewardedVideoAvailable instead", 3);
                return false;
            }
            if (this.T || this.V) {
                Wd wd2 = this.Q;
                z11 = wd2 != null && wd2.u();
            } else {
                R7 r72 = this.N;
                if (r72 != null && r72.d()) {
                }
            }
            try {
                JSONObject jSONObjectB = IronSourceUtils.b(false);
                a(jSONObjectB, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.Y)}});
                C3952be.i().a(new C5(z11 ? D5.RV_API_HAS_AVAILABILITY_TRUE : D5.RV_API_HAS_AVAILABILITY_FALSE, jSONObjectB));
                this.f32740h.log(IronSourceLogger.IronSourceTag.API, "isRewardedVideoAvailable():" + z11, 1);
                return z11;
            } catch (Throwable th2) {
                z10 = z11;
                th = th2;
                C4228r4.d().a(th);
                IronSourceLoggerManager ironSourceLoggerManager = this.f32740h;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.log(ironSourceTag, "isRewardedVideoAvailable():" + z10, 1);
                this.f32740h.logException(ironSourceTag, "isRewardedVideoAvailable()", th);
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            z10 = false;
        }
    }

    public boolean O() {
        return C();
    }

    public void P() {
        IronSourceLoggerManager ironSourceLoggerManager = this.f32740h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadInterstitial()", 1);
        try {
            if (this.E) {
                this.f32740h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", 3);
                n.a().b(IronSource.a.INTERSTITIAL, ErrorBuilder.buildInitFailedError("Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", "Interstitial"));
                return;
            }
            if (!this.H) {
                this.f32740h.log(ironSourceTag, "init() must be called before loadInterstitial()", 3);
                n.a().b(IronSource.a.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() must be called before loadInterstitial()", "Interstitial"));
                return;
            }
            u.d dVarA = u.c().a();
            if (dVarA == u.d.INIT_FAILED) {
                this.f32740h.log(ironSourceTag, "init() had failed", 3);
                n.a().b(IronSource.a.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                return;
            }
            if (dVarA == u.d.INIT_IN_PROGRESS) {
                if (!u.c().d()) {
                    this.W = true;
                    return;
                } else {
                    this.f32740h.log(ironSourceTag, "init() had failed", 3);
                    n.a().b(IronSource.a.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                    return;
                }
            }
            if (!E()) {
                this.f32740h.log(ironSourceTag, "No interstitial configurations found", 3);
                n.a().b(IronSource.a.INTERSTITIAL, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
                return;
            }
            C9 c92 = this.P;
            if (c92 == null) {
                this.W = true;
            } else {
                c92.A();
            }
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            this.f32740h.logException(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", th2);
            n.a().b(IronSource.a.INTERSTITIAL, new IronSourceError(510, th2.getMessage()));
        }
    }

    public void Q() {
        IronSourceLoggerManager ironSourceLoggerManager = this.f32740h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadRewardedVideo()", 1);
        try {
            if (this.D) {
                this.f32740h.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", 3);
                n.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            if (!this.T && !this.f32743i0) {
                this.f32740h.log(ironSourceTag, "Rewarded Video is not initiated with manual load", 3);
                return;
            }
            if (!this.G) {
                this.f32740h.log(ironSourceTag, "init() must be called before loadRewardedVideo()", 3);
                n.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() must be called before loadRewardedVideo()", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            u.d dVarA = u.c().a();
            if (dVarA == u.d.INIT_FAILED) {
                this.f32740h.log(ironSourceTag, "init() had failed", 3);
                n.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            if (dVarA == u.d.INIT_IN_PROGRESS) {
                if (!u.c().d()) {
                    this.U = true;
                    return;
                } else {
                    this.f32740h.log(ironSourceTag, "init() had failed", 3);
                    n.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
            }
            if (!M()) {
                this.f32740h.log(ironSourceTag, "No rewarded video configurations found", 3);
                n.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            Wd wd2 = this.Q;
            if (wd2 == null) {
                this.U = true;
            } else {
                wd2.A();
            }
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            this.f32740h.logException(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", th2);
            n.a().b(IronSource.a.REWARDED_VIDEO, new IronSourceError(510, th2.getMessage()));
        }
    }

    public void R() {
        this.f32743i0 = false;
    }

    public void S() {
        if (f32725m0) {
            return;
        }
        f32725m0 = true;
        JSONObject jSONObjectB = IronSourceUtils.b(false);
        try {
            jSONObjectB.put("status", com.ironsource.mediationsdk.metadata.a.f32683h);
            jSONObjectB.put(IronSourceConstants.EVENTS_ERROR_CODE, 1);
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Lb.U().q().a(new C5(D5.FIRST_INSTANCE_RESULT, jSONObjectB));
    }

    public Ne a(Context context, String str) {
        if (C4073i9.a(context)) {
            E3 e3C = C4073i9.c(context);
            String strD = e3C.d();
            String strF = e3C.f();
            String strE = e3C.e();
            if (strD.equals(str)) {
                Ne ne2 = new Ne(context, strD, strF, strE);
                ne2.a(Ne.a.CACHE);
                return ne2;
            }
        }
        return null;
    }

    public C4112kd.b a(C4041gd c4041gd) {
        return this.f32734e.a(ContextProvider.getInstance().getApplicationContext(), c4041gd, IronSource.a.REWARDED_VIDEO);
    }

    @Override // com.ironsource.T4.a
    public ISDemandOnlyBannerLayout a(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f32740h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBannerForDemandOnly()", 1);
        if (activity == null) {
            this.f32740h.log(ironSourceTag, "createBannerForDemandOnly() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new ISDemandOnlyBannerLayout(activity, iSBannerSize);
    }

    public synchronized IronSourceError a(Context context, String str, boolean z10, Dc dc2, IronSource.a... aVarArr) {
        IronLog.INTERNAL.verbose("GitHash: deeec36");
        if (!C3966ca.a((Object) context, "Init Failed - provided context is null")) {
            h("Provided context is null");
            return new IronSourceError(2000, "Provided context is null");
        }
        this.f32738g.a(context);
        boolean z11 = context instanceof Activity;
        if (z11) {
            e((Activity) context);
        }
        AtomicBoolean atomicBoolean = this.f32755r;
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(true, false)) {
            if (aVarArr != null) {
                a(z11, z10, dc2 != null, aVarArr);
            } else {
                this.f32740h.log(IronSourceLogger.IronSourceTag.API, "Multiple calls to init without ad units are not allowed", 3);
            }
            Be beB = Ce.f28890a.b();
            if (C()) {
                a(this.f32748l);
                return new IronSourceError(IronSourceError.ERROR_INIT_ALREADY_FINISHED, "Already finished init");
            }
            if (beB == Be.INIT_FAILED) {
                return new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed");
            }
            if (beB == Be.NOT_INIT) {
                return new IronSourceError(IronSourceError.ERROR_NEW_INIT_API_ALREADY_CALLED, "Already called new init");
            }
            if (dc2 != null) {
                a(dc2);
            }
            return new IronSourceError(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, "Old Api init in progress");
        }
        Ce.f28890a.a(dc2 == null);
        if ((aVarArr == null || aVarArr.length == 0) && dc2 == null) {
            for (IronSource.a aVar : IronSource.a.values()) {
                this.f32761x.add(aVar);
            }
            this.G = true;
            this.H = true;
            this.I = true;
        } else {
            for (IronSource.a aVar2 : aVarArr) {
                this.f32761x.add(aVar2);
                this.f32762y.add(aVar2);
                if (aVar2.equals(IronSource.a.INTERSTITIAL)) {
                    this.H = true;
                }
                if (aVar2.equals(IronSource.a.BANNER)) {
                    this.I = true;
                }
                if (aVar2.equals(IronSource.a.REWARDED_VIDEO)) {
                    this.G = true;
                }
            }
        }
        IronLog.API.info("init(appKey:" + str + ")");
        S3 s3Q = q(str);
        if (s3Q.b()) {
            this.f32750m = str;
        }
        Ne neA = a(context, this.f32750m);
        if (neA != null) {
            IronLog.INTERNAL.verbose("init cache exists");
            a(neA.c().b().f());
        } else {
            IronLog.INTERNAL.verbose("init cache does not exist");
        }
        ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
        this.f32732d.a(context.getApplicationContext(), TimeUnit.HOURS.toMillis(C3925a5.f30911a.d()));
        this.f32739g0.g(LevelPlay.getSdkVersion());
        this.f32739g0.a(T7.a());
        this.f32739g0.b(IronSourceUtils.f(context));
        this.f32739g0.a(C4099k0.a());
        T();
        d(context);
        if (this.f32750m == null) {
            u.c().f();
            if (this.f32761x.contains(IronSource.a.REWARDED_VIDEO)) {
                Dd.a().a(false, (AdInfo) null);
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, s3Q.a().toString(), 1);
            return new IronSourceError(2010, "App key is null");
        }
        this.f32739g0.a(context);
        this.f32739g0.c(this.f32750m);
        this.f32739g0.h(this.f32758u);
        if (this.f32763z) {
            JSONObject jSONObjectB = IronSourceUtils.b(z10);
            if (aVarArr != null) {
                for (IronSource.a aVar3 : aVarArr) {
                    try {
                        jSONObjectB.put(aVar3.toString(), true);
                    } catch (Exception e10) {
                        C4228r4.d().a(e10);
                    }
                }
            }
            int i10 = this.C + 1;
            this.C = i10;
            a(z11, z10, i10, jSONObjectB, dc2 != null);
            this.f32763z = false;
        }
        return null;
    }

    @Override // com.ironsource.T4
    @Nullable
    public String a(@NotNull Context context) {
        String str;
        Be beA;
        String strA;
        C3936ag c3936agK;
        U4 u4K = k();
        Be be2 = null;
        try {
            beA = Ce.f28890a.a();
            try {
                u4K.a(D5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_IN_INIT_STATUS, beA);
            } catch (Exception unused) {
                str = null;
                be2 = beA;
                u4K.a(D5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, be2);
                beA = be2;
                strA = str;
            }
        } catch (Exception unused2) {
            str = null;
        }
        if (context == null) {
            IronLog.API.error("bidding data cannot be retrieved, context required");
            u4K.a(D5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_WITHOUT_CONTEXT, (Be) null);
            return null;
        }
        if (beA == Be.NOT_INIT) {
            IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
            u4K.a(D5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_NO_INIT_RETURNED_NULL, (Be) null);
            return null;
        }
        u.c().g();
        Ne ne2 = this.f32748l;
        boolean zE = (ne2 == null || (c3936agK = ne2.c().b().k()) == null) ? true : c3936agK.e();
        this.f32739g0.b(context);
        JSONObject jSONObjectA = new Zf().a(context);
        d.b().a(jSONObjectA, true);
        strA = zE ? N9.a(jSONObjectA.toString()) : N9.c(jSONObjectA.toString());
        if (beA == Be.INITIATED) {
            IronLog.INTERNAL.verbose("external token parameters: " + jSONObjectA);
        }
        if (TextUtils.isEmpty(strA)) {
            u4K.a(D5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, beA);
        }
        u4K.a(D5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_TOKEN_RETURNED, beA);
        return strA;
    }

    public synchronized List<IronSource.a> a(Context context, String str, boolean z10, IronSource.a... aVarArr) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if ((aVarArr == null || aVarArr.length == 0) && z10) {
            if (this.G) {
                a(IronSource.a.REWARDED_VIDEO);
            } else {
                this.D = true;
                arrayList.add(IronSource.a.REWARDED_VIDEO);
            }
            if (this.H) {
                a(IronSource.a.INTERSTITIAL);
            } else {
                this.E = true;
                arrayList.add(IronSource.a.INTERSTITIAL);
            }
            if (this.I) {
                a(IronSource.a.BANNER);
            } else {
                this.F = true;
                arrayList.add(IronSource.a.BANNER);
            }
        } else {
            for (IronSource.a aVar : aVarArr) {
                if (aVar.equals(IronSource.a.INTERSTITIAL)) {
                    if (this.H) {
                        a(aVar);
                    } else {
                        this.E = true;
                        if (!arrayList.contains(aVar)) {
                            arrayList.add(aVar);
                        }
                    }
                }
                if (aVar.equals(IronSource.a.REWARDED_VIDEO)) {
                    if (this.G) {
                        a(aVar);
                    } else {
                        this.D = true;
                        if (!arrayList.contains(aVar)) {
                            arrayList.add(aVar);
                        }
                    }
                }
                if (aVar.equals(IronSource.a.BANNER)) {
                    if (this.I) {
                        a(aVar);
                    } else {
                        this.F = true;
                        if (!arrayList.contains(aVar)) {
                            arrayList.add(aVar);
                        }
                    }
                }
            }
        }
        if (context != null) {
            if (context instanceof Activity) {
                e((Activity) context);
            }
            ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
        }
        return arrayList;
    }

    @Override // com.ironsource.Lc
    public void a() {
        if (this.J.booleanValue()) {
            this.J = Boolean.FALSE;
            n.a().b(IronSource.a.BANNER, new IronSourceError(603, "init() had failed"));
            this.K = null;
            this.L = null;
        }
        if (this.W) {
            this.W = false;
            n.a().b(IronSource.a.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
        }
        if (this.U) {
            this.U = false;
            n.a().b(IronSource.a.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.Z) {
            Iterator<h.d> it = this.Z.values().iterator();
            while (it.hasNext()) {
                String strE = it.next().e();
                this.f32747k0.a(strE).onInterstitialAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            }
            this.Z.clear();
        }
        synchronized (this.f32729b0) {
            Iterator<h.d> it2 = this.f32729b0.values().iterator();
            while (it2.hasNext()) {
                String strE2 = it2.next().e();
                this.f32749l0.a(strE2).onRewardedVideoAdLoadFailed(strE2, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.f32729b0.clear();
        }
        synchronized (this.f32727a0) {
            for (h.b bVar : this.f32727a0.values()) {
                ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutG = bVar.g();
                if (iSDemandOnlyBannerLayoutG != null) {
                    iSDemandOnlyBannerLayoutG.getListener().a(bVar.e(), ErrorBuilder.buildInitFailedError("init() had failed", "Banner"));
                }
            }
            this.f32727a0.clear();
        }
    }

    public void a(long j10, Ne.a aVar) {
        JSONObject jSONObjectB = IronSourceUtils.b(B());
        try {
            jSONObjectB.put("duration", j10);
            jSONObjectB.put("sessionDepth", this.C);
            jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, aVar.b());
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Lb.U().q().a(new C5(D5.INIT_COMPLETE, jSONObjectB));
    }

    public void a(Activity activity) {
        try {
            if (FeaturesManager.getInstance().getStopUseOnResumeAndPause()) {
                return;
            }
            this.f32740h.log(IronSourceLogger.IronSourceTag.API, "onPause()", 1);
            ContextProvider.getInstance().onPause(activity);
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            this.f32740h.logException(IronSourceLogger.IronSourceTag.API, "onPause()", th2);
        }
    }

    @Override // com.ironsource.T4.a
    public synchronized void a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        h.b bVarA = new h.c().b(str).a(activity).a(iSDemandOnlyBannerLayout).a(IronSource.a.BANNER).a();
        IronSourceError ironSourceErrorA = bVarA.a();
        if (ironSourceErrorA != null) {
            this.f32740h.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorA.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorA);
            }
            return;
        }
        IronSourceError ironSourceErrorA2 = a(u.c().a());
        if (ironSourceErrorA2 != null) {
            this.f32740h.log(IronSourceLogger.IronSourceTag.API, ironSourceErrorA2.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ironSourceErrorA2);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (a(bVarA)) {
            return;
        }
        if (!z()) {
            this.f32740h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else {
            if (b(bVarA)) {
                return;
            }
            this.f32735e0.a(iSDemandOnlyBannerLayout, str);
        }
    }

    @Override // com.ironsource.T4.b
    public synchronized void a(Activity activity, String str) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.a.INTERSTITIAL).b(), this.f32747k0.a(str));
    }

    @Override // com.ironsource.T4.c
    public synchronized void a(Activity activity, String str, String str2) {
        a(new h.c().b(str).a(str2).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(true).a(IronSource.a.REWARDED_VIDEO).b(), this.f32749l0.a(str));
    }

    @Override // com.ironsource.W9
    public void a(Context context, boolean z10) {
        this.f32759v = context;
        this.f32760w = Boolean.valueOf(z10);
        C9 c92 = this.P;
        if (c92 != null) {
            c92.a(context, z10);
        }
        if (this.V) {
            Wd wd2 = this.Q;
            if (wd2 != null) {
                wd2.a(context, z10);
            }
        } else {
            R7 r72 = this.N;
            if (r72 != null) {
                r72.a(context, z10);
            }
        }
        Lb.U().q().a(new C5(D5.SHOULD_TRACK_NETWORK_STATE, IronSourceUtils.b(false)));
    }

    public void a(C4002ea c4002ea) {
        this.A = c4002ea;
        Wd wd2 = this.Q;
        if (wd2 != null) {
            wd2.a(c4002ea);
        }
        R7 r72 = this.N;
        if (r72 != null) {
            r72.a(c4002ea);
        }
        C9 c92 = this.P;
        if (c92 != null) {
            c92.a(c4002ea);
        }
        y yVar = this.O;
        if (yVar != null) {
            yVar.a(c4002ea);
        }
        G2 g22 = this.R;
        if (g22 != null) {
            g22.a(c4002ea);
        }
        AdQualityBridge adQualityBridge = this.f32745j0;
        if (adQualityBridge != null) {
            adQualityBridge.setSegment(c4002ea);
        }
        J9.i().a(this.A);
        C3952be.i().a(this.A);
        C3987dd.P.a(this.A);
        Lb.U().q().a(this.A);
    }

    @Override // com.ironsource.T4.b
    public void a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        this.f32747k0.a(iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.T4.c
    public void a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        this.f32749l0.a(iSDemandOnlyRewardedVideoListener);
    }

    public void a(h.d dVar, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        String strE = dVar.e();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + strE);
        try {
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            IronLog.API.error(th2.getMessage());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, new IronSourceError(510, th2.getMessage()));
        }
        if (!this.G) {
            ironLog.error("initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, new IronSourceError(510, "initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()"));
            return;
        }
        if (!this.D) {
            ironLog.error("Rewarded video was initialized in mediation mode");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, new IronSourceError(510, "Rewarded video was initialized in mediation mode"));
            return;
        }
        u.d dVarA = u.c().a();
        if (dVarA == u.d.INIT_FAILED) {
            ironLog.error("init() had failed");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        IronSourceError ironSourceErrorA = dVar.a();
        if (ironSourceErrorA != null) {
            if (ironSourceErrorA.getErrorCode() == 1060) {
                b(D5.TROUBLESHOOTING_DO_CALLED_RV_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
            }
            ironLog.error(ironSourceErrorA.toString());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, ironSourceErrorA);
            return;
        }
        e(dVar.d());
        if (dVarA == u.d.INIT_IN_PROGRESS) {
            if (u.c().d()) {
                ironLog.error("init() had failed");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            synchronized (this.f32729b0) {
                this.f32729b0.put(strE, dVar);
            }
            if (TextUtils.isEmpty(dVar.b())) {
                return;
            }
            b(D5.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
            return;
        }
        if (!M()) {
            ironLog.error("No rewarded video configurations found");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        synchronized (this.f32729b0) {
            com.ironsource.mediationsdk.demandOnly.k kVar = this.f32733d0;
            if (kVar != null) {
                kVar.a(dVar);
                return;
            }
            this.f32729b0.put(strE, dVar);
            if (!TextUtils.isEmpty(dVar.b())) {
                b(D5.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.a(true, !TextUtils.isEmpty(dVar.b()), 1));
            }
            return;
        }
        C4228r4.d().a(th2);
        IronLog.API.error(th2.getMessage());
        iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(strE, new IronSourceError(510, th2.getMessage()));
    }

    @Override // com.ironsource.Y8
    public void a(@NotNull ImpressionDataListener impressionDataListener) {
        if (C3966ca.a((Object) impressionDataListener, "removeImpressionDataListener - listener is null")) {
            C4201pa.b().b(impressionDataListener);
            R7 r72 = this.N;
            if (r72 != null) {
                r72.a(impressionDataListener);
            }
            y yVar = this.O;
            if (yVar != null) {
                yVar.a(impressionDataListener);
            }
        }
    }

    public void a(q qVar) {
        G2 g22;
        this.f32740h.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (!this.X || (g22 = this.R) == null) {
                y yVar = this.O;
                if (yVar != null) {
                    yVar.a(qVar);
                }
            } else {
                g22.a(qVar);
            }
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            this.f32740h.logException(IronSourceLogger.IronSourceTag.API, "destroyBanner()", th2);
        }
    }

    public void a(q qVar, String str) {
        IronLog.INTERNAL.verbose("placementName = " + str);
        if (this.F) {
            this.f32740h.log(IronSourceLogger.IronSourceTag.API, "Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", 3);
            n.a().b(IronSource.a.BANNER, ErrorBuilder.buildInitFailedError("Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", "Banner"));
            return;
        }
        if (qVar == null || qVar.b()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("loadBanner can't be called - ");
            sb2.append(qVar == null ? "banner layout is null " : "banner layout is destroyed");
            String string = sb2.toString();
            this.f32740h.log(IronSourceLogger.IronSourceTag.API, string, 3);
            n.a().b(IronSource.a.BANNER, ErrorBuilder.buildLoadFailedError(string));
            return;
        }
        if (!this.I) {
            this.f32740h.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadBanner()", 3);
            n.a().b(IronSource.a.BANNER, ErrorBuilder.buildLoadFailedError("init() must be called before loadBanner()"));
            return;
        }
        if (qVar.getSize().getDescription().equals("CUSTOM") && (qVar.getSize().getWidth() <= 0 || qVar.getSize().getHeight() <= 0)) {
            this.f32740h.log(IronSourceLogger.IronSourceTag.API, "loadBanner: Unsupported banner size. Height and width must be bigger than 0", 3);
            n.a().b(IronSource.a.BANNER, ErrorBuilder.unsupportedBannerSize(""));
            return;
        }
        u.d dVarA = u.c().a();
        if (dVarA == u.d.INIT_FAILED) {
            this.f32740h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
            n.a().b(IronSource.a.BANNER, new IronSourceError(600, "Init() had failed"));
            return;
        }
        if (dVarA == u.d.INIT_IN_PROGRESS) {
            if (u.c().d()) {
                this.f32740h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                n.a().b(IronSource.a.BANNER, new IronSourceError(601, "Init() had failed"));
                return;
            } else {
                this.K = qVar;
                this.J = Boolean.TRUE;
                this.L = str;
                return;
            }
        }
        if (!z()) {
            this.f32740h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            n.a().b(IronSource.a.BANNER, new IronSourceError(615, "the server response does not contain banner data"));
            return;
        }
        y yVar = this.O;
        if (yVar == null && this.R == null) {
            this.K = qVar;
            this.J = Boolean.TRUE;
            this.L = str;
        } else if (this.X) {
            this.R.a(qVar, new C4041gd(k(str)));
        } else {
            yVar.a(qVar, k(str));
        }
    }

    @Override // com.ironsource.T4.c
    public synchronized void a(String str) {
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + str);
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = this.f32749l0.a(str);
        try {
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.API.error(e10.getMessage());
            if (iSDemandOnlyRewardedVideoListenerA != null) {
                iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new IronSourceError(510, e10.getMessage()));
            }
        }
        if (!this.D) {
            ironLog.error("Rewarded video was initialized in mediation mode. Use showRewardedVideo instead");
            iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new IronSourceError(508, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
            return;
        }
        com.ironsource.mediationsdk.demandOnly.k kVar = this.f32733d0;
        if (kVar != null) {
            kVar.b(str);
        } else {
            ironLog.error("Rewarded video was not initiated");
            iSDemandOnlyRewardedVideoListenerA.onRewardedVideoAdShowFailed(str, new IronSourceError(508, "Rewarded video was not initiated"));
        }
    }

    public void a(String str, List<String> list) {
        String strCheckMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String strCheckMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (strCheckMetaDataKeyValidity.length() > 0) {
            IronLog.API.verbose(strCheckMetaDataKeyValidity);
            return;
        }
        if (strCheckMetaDataValueValidity.length() > 0) {
            IronLog.API.verbose(strCheckMetaDataValueValidity);
            return;
        }
        MetaData metaData = MetaDataUtils.formatMetaData(str, list);
        String metaDataKey = metaData.getMetaDataKey();
        List<String> metaDataValue = metaData.getMetaDataValue();
        if (!MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
            com.ironsource.mediationsdk.c.b().c(metaDataKey, metaDataValue);
        } else if (C() && MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
            IronLog.API.error("setMetaData with key = " + metaDataKey + " must to be called before init");
        } else {
            C4201pa.b().a(metaDataKey, metaDataValue);
        }
        try {
            ConcurrentHashMap<String, List<String>> concurrentHashMapD = com.ironsource.mediationsdk.c.b().d();
            concurrentHashMapD.putAll(C4201pa.b().c());
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            for (Map.Entry<String, List<String>> entry : concurrentHashMapD.entrySet()) {
                jSONObjectJsonObjectInit.put(entry.getKey(), entry.getValue());
            }
            this.f32741h0.a(jSONObjectJsonObjectInit);
            this.f32739g0.a(jSONObjectJsonObjectInit);
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error("got the following error " + e10.getMessage());
        }
        Lb.U().q().a(new C5(C() ? D5.SET_META_DATA_AFTER_INIT : D5.SET_META_DATA, IronSourceUtils.a(str, list, metaDataValue)));
    }

    public void a(String str, JSONObject jSONObject) {
        if (C3966ca.a((Object) jSONObject, "setAdRevenueData - impressionData is null") && C3966ca.a((Object) str, "setAdRevenueData - dataSource is null")) {
            this.f32737f0.a(str, jSONObject);
        }
    }

    @Override // com.ironsource.Lc
    public void a(List<IronSource.a> list, boolean z10, T3 t32) {
        a(this.f32748l);
        b(list, z10, t32);
    }

    @Override // com.ironsource.W9
    public void a(Map<String, String> map) {
        if (map != null) {
            try {
                if (map.size() == 0) {
                    return;
                }
                this.f32740h.log(IronSourceLogger.IronSourceTag.API, this.f32726a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", 1);
                this.f32753p = new HashMap(map);
                C5 c52 = new C5(D5.SET_RV_SERVER_PARAMS, IronSourceUtils.b(false));
                c52.a(IronSourceConstants.EVENTS_EXT1, map.toString());
                C3952be.i().a(c52);
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                this.f32740h.logException(IronSourceLogger.IronSourceTag.API, this.f32726a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", e10);
            }
        }
    }

    @Override // com.ironsource.W9
    public void a(boolean z10) {
        com.ironsource.mediationsdk.c.b().a(z10);
    }

    public boolean a(C4049h3 c4049h3) {
        return this.f32734e.c(ContextProvider.getInstance().getApplicationContext(), c4049h3, IronSource.a.BANNER);
    }

    public boolean a(boolean z10, Ne ne2) {
        a(ne2);
        if (C()) {
            return true;
        }
        synchronized (this.f32746k) {
            this.f32748l = ne2;
        }
        return b(ne2.h(), z10, ne2.c());
    }

    public Ne b(Context context, String str, b bVar) {
        synchronized (this.f32746k) {
            Ne ne2 = this.f32748l;
            if (ne2 != null) {
                return new Ne(ne2);
            }
            Ne neA = a(context, str, bVar);
            if (neA == null || !neA.q()) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
                neA = a(context, n());
                if (neA != null) {
                    IronSourceError ironSourceErrorBuildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(n(), str);
                    this.f32740h.log(ironSourceTag, ironSourceErrorBuildUsingCachedConfigurationError.toString() + ": " + neA.toString(), 1);
                    Lb.U().q().a(new C5(D5.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.b(false)));
                }
            }
            if (neA != null) {
                this.f32748l = neA;
                IronSourceUtils.e(context, neA.toString());
                b(this.f32748l, context);
                J9.i().c(true);
                C3952be.i().c(true);
                C3987dd.P.c(true);
                Lb.U().q().c(true);
            }
            return neA;
        }
    }

    public q b(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f32740h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBanner()", 1);
        if (activity == null) {
            this.f32740h.log(ironSourceTag, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new q(activity, iSBannerSize);
    }

    @Override // com.ironsource.W9
    public String b(Context context) {
        String strI = this.f32730c.I(context);
        Lb.U().q().a(new C5(D5.GET_ADVERTISING_ID, IronSourceUtils.b(false)));
        return !TextUtils.isEmpty(strI) ? strI : "";
    }

    @Override // com.ironsource.W9
    public void b() {
        this.f32740h.log(IronSourceLogger.IronSourceTag.API, "removeRewardedVideoListener()", 1);
        Dd.a().a((InterfaceC4252sb) null);
    }

    public void b(Activity activity) {
        IronLog ironLog = IronLog.API;
        ironLog.info("onResume()");
        try {
            if (!FeaturesManager.getInstance().getStopUseOnResumeAndPause()) {
                ContextProvider.getInstance().onResume(activity);
                return;
            }
            ironLog.info("onResume() is disabled");
        } catch (Throwable th2) {
            this.f32740h.logException(IronSourceLogger.IronSourceTag.API, "onResume()", th2);
            C4228r4.d().a(th2);
        }
    }

    @Override // com.ironsource.T4.c
    public synchronized void b(Activity activity, String str) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.a.REWARDED_VIDEO).b(), this.f32749l0.a(str));
    }

    @Override // com.ironsource.T4.b
    public synchronized void b(Activity activity, String str, String str2) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.a.INTERSTITIAL).a(true).a(str2).b(), this.f32747k0.a(str));
    }

    public void b(Ne ne2, Context context) {
        b(ne2);
        a(ne2, context);
    }

    @Override // com.ironsource.Y8
    public void b(@NotNull ImpressionDataListener impressionDataListener) {
        if (C3966ca.a((Object) impressionDataListener, "addImpressionDataListener - listener is null")) {
            C4201pa.b().a(impressionDataListener);
            R7 r72 = this.N;
            if (r72 != null) {
                r72.b(impressionDataListener);
            }
            y yVar = this.O;
            if (yVar != null) {
                yVar.b(impressionDataListener);
            }
            IronLog.API.info("add impression data listener to " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public void b(q qVar) {
        a(qVar, "");
    }

    public void b(@NotNull String str, @NotNull JSONObject jSONObject) {
        com.ironsource.mediationsdk.c.b().b(new x(str, jSONObject));
    }

    public void b(boolean z10) {
        this.M = Boolean.valueOf(z10);
        com.ironsource.mediationsdk.c.b().b(z10);
        this.f32739g0.a(z10);
        Lb.U().q().a(new C5(z10 ? D5.CONSENT_TRUE_CODE : D5.CONSENT_FALSE_CODE, IronSourceUtils.b(false)));
    }

    @Override // com.ironsource.W9
    public boolean b(String str) {
        try {
            S3 s32 = new S3();
            a(str, s32);
            if (!s32.b()) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, s32.a().toString(), 2);
                return false;
            }
            this.f32752o = str;
            Lb.U().q().a(new C5(D5.SET_USER_ID, IronSourceUtils.a(true)));
            return true;
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            this.f32740h.logException(IronSourceLogger.IronSourceTag.API, this.f32726a + ":setDynamicUserId(dynamicUserId:" + str + ")", e10);
            return false;
        }
    }

    @Override // com.ironsource.W9
    public void c() {
        this.f32753p = null;
    }

    public void c(Activity activity) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f32740h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showInterstitial()", 1);
        try {
            if (this.E) {
                this.f32740h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                C4054h8.a().a(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
            } else {
                if (!D()) {
                    C4054h8.a().a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"), (AdInfo) null);
                    return;
                }
                M9 m9I = i();
                if (m9I != null) {
                    c(activity, m9I.c());
                } else {
                    C4054h8.a().a(new IronSourceError(1020, "showInterstitial error: empty default placement in response"), (AdInfo) null);
                }
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            this.f32740h.logException(IronSourceLogger.IronSourceTag.API, "showInterstitial()", e10);
            C4054h8.a().a(new IronSourceError(510, e10.getMessage()), (AdInfo) null);
        }
    }

    public void c(Activity activity, String str) {
        String str2 = "showInterstitial(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.f32740h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (this.E) {
                this.f32740h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                C4054h8.a().a(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
            } else if (D()) {
                d(activity, str);
            } else {
                C4054h8.a().a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"), (AdInfo) null);
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            this.f32740h.logException(IronSourceLogger.IronSourceTag.API, str2, e10);
            C4054h8.a().a(new IronSourceError(510, e10.getMessage()), (AdInfo) null);
        }
    }

    public void c(@NotNull Context context) {
        Bf bf2 = Bf.f28863a;
        bf2.b();
        if (!C()) {
            bf2.a(IronSourceConstants.errorCode_TEST_SUITE_SDK_NOT_INITIALIZED);
            IronLog.API.error("TestSuite cannot be launched, SDK not initialized");
            return;
        }
        if (!c(this.f32748l)) {
            bf2.a(IronSourceConstants.errorCode_TEST_SUITE_DISABLED);
            IronLog.API.error("TestSuite cannot be launched, Please contact your account manager to enable it");
            return;
        }
        if (!IronSourceUtils.g(context)) {
            bf2.a(IronSourceConstants.errorCode_TEST_SUITE_NO_NETWORK_CONNECTIVITY);
            IronLog.API.error("TestSuite cannot be launched, No network connectivity");
            return;
        }
        C9 c92 = this.P;
        if (c92 != null) {
            c92.J();
        }
        Wd wd2 = this.Q;
        if (wd2 != null) {
            wd2.J();
        }
        G2 g22 = this.R;
        if (g22 != null) {
            g22.J();
            this.R.T();
        }
        new Cf().a(context, n(), this.f32748l.j(), LevelPlay.getSdkVersion(), this.f32748l.c().g().b(), g(), this.T);
        this.f32743i0 = true;
        bf2.c();
    }

    @Override // com.ironsource.T4.b
    public void c(String str) {
        this.f32740h.log(IronSourceLogger.IronSourceTag.API, "showDemandOnlyInterstitial() instanceId=" + str, 1);
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = this.f32747k0.a(str);
        try {
            if (!this.E) {
                IronLog.API.error("Interstitial was initialized in mediation mode. Use showInterstitial instead");
                iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, new IronSourceError(508, "Interstitial was initialized in mediation mode. Use showInterstitial instead"));
                return;
            }
            com.ironsource.mediationsdk.demandOnly.f fVar = this.f32731c0;
            if (fVar != null) {
                fVar.a(str);
            } else {
                IronLog.API.error("Interstitial was not initiated");
                iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, new IronSourceError(508, "Interstitial was not initiated"));
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.API.error(e10.getMessage());
            if (iSDemandOnlyInterstitialListenerA != null) {
                iSDemandOnlyInterstitialListenerA.onInterstitialAdShowFailed(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"));
            }
        }
    }

    @Override // com.ironsource.W9
    public void d() {
        this.f32740h.log(IronSourceLogger.IronSourceTag.API, "removeInterstitialListener()", 1);
        C4054h8.a().a((InterfaceC4057hb) null);
    }

    public void d(Activity activity) {
        if (!L()) {
            Dd.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            this.f32740h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", 3);
            return;
        }
        C4041gd c4041gdJ = j();
        if (c4041gdJ != null) {
            f(activity, c4041gdJ.c());
            return;
        }
        this.f32740h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo error: empty default placement in response", 3);
        Dd.a().a(new IronSourceError(1021, "showRewardedVideo error: empty default placement in response"), (AdInfo) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000d  */
    @Override // com.ironsource.T4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean d(java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.ironsource.mediationsdk.demandOnly.f r0 = r1.f32731c0     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Ld
            boolean r2 = r0.b(r2)     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            monitor-exit(r1)
            return r2
        L10:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.r.d(java.lang.String):boolean");
    }

    public String e() {
        u uVarC = u.c();
        int i10 = a.f32765b[uVarC.a().ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? (i10 == 4 && !I()) ? "No Native Ad configurations found" : "" : uVarC.d() ? "init() had failed" : "init() not finished yet" : "init() had failed" : "init() must be called first";
    }

    @Override // com.ironsource.T4.a
    public void e(String str) {
        this.f32740h.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            com.ironsource.mediationsdk.demandOnly.c cVar = this.f32735e0;
            if (cVar != null) {
                cVar.a(str);
            }
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            this.f32740h.logException(IronSourceLogger.IronSourceTag.API, "destroyISDemandOnlyBanner()", th2);
        }
    }

    @Override // com.ironsource.W9
    public M9 f(String str) {
        M9 m9L;
        try {
            m9L = l(str);
            if (m9L == null) {
                try {
                    this.f32740h.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    m9L = i();
                } catch (Exception e10) {
                    e = e10;
                    C4228r4.d().a(e);
                }
            }
            this.f32740h.log(IronSourceLogger.IronSourceTag.API, "getPlacementInfo(placement: " + str + "):" + m9L, 1);
        } catch (Exception e11) {
            e = e11;
            m9L = null;
        }
        return m9L;
    }

    public Zb f() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> listA = a(this.f32748l.k().c());
        if (listA.size() > 0) {
            return new Zb(listA, this.f32748l.c().e(), IronSourceUtils.f(), C4201pa.b(), this.A);
        }
        JSONObject jSONObjectA = IronSourceUtils.a(false, true, 1);
        a(jSONObjectA, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        a(D5.TROUBLESHOOTING_NT_INIT_FAILED, jSONObjectA);
        return null;
    }

    public void f(Activity activity, String str) {
        String str2 = "showRewardedVideo(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.f32740h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (this.D) {
                this.f32740h.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", 3);
                Dd.a().a(ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else if (L()) {
                e(activity, str);
            } else {
                Dd.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            this.f32740h.logException(IronSourceLogger.IronSourceTag.API, str2, e10);
            Dd.a().a(new IronSourceError(510, e10.getMessage()), (AdInfo) null);
        }
    }

    public Boolean g() {
        return this.M;
    }

    @Override // com.ironsource.W9
    public void g(String str) {
        try {
            String str2 = this.f32726a + ":setMediationType(mediationType:" + str + ")";
            IronSourceLoggerManager ironSourceLoggerManager = this.f32740h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, str2, 1);
            if (a(str, 1, 64) && p(str)) {
                this.f32754q = str;
                this.f32739g0.f(str);
            } else {
                this.f32740h.log(ironSourceTag, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            this.f32740h.logException(IronSourceLogger.IronSourceTag.API, this.f32726a + ":setMediationType(mediationType:" + str + ")", e10);
        }
    }

    public Ne h() {
        return this.f32748l;
    }

    @Override // com.ironsource.Lc
    public void h(String str) {
        try {
            this.f32740h.log(IronSourceLogger.IronSourceTag.API, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.i("Mediation init failed");
            if (this.f32742i != null) {
                Iterator<IronSource.a> it = this.f32761x.iterator();
                while (it.hasNext()) {
                    a(it.next(), true);
                }
            }
            Dc dcQ = q();
            if (dcQ != null) {
                dcQ.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed"));
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.W9
    public C4041gd i(String str) {
        C4041gd c4041gdN;
        try {
            c4041gdN = n(str);
            if (c4041gdN == null) {
                try {
                    this.f32740h.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    c4041gdN = j();
                } catch (Exception e10) {
                    e = e10;
                    C4228r4.d().a(e);
                }
            }
            this.f32740h.log(IronSourceLogger.IronSourceTag.API, "getPlacementInfo(placement: " + str + "):" + c4041gdN, 1);
        } catch (Exception e11) {
            e = e11;
            c4041gdN = null;
        }
        return c4041gdN;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000d  */
    @Override // com.ironsource.T4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean j(java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.ironsource.mediationsdk.demandOnly.k r0 = r1.f32733d0     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Ld
            boolean r2 = r0.a(r2)     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            monitor-exit(r1)
            return r2
        L10:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.r.j(java.lang.String):boolean");
    }

    public String l() {
        return this.f32752o;
    }

    public C3950bc m(String str) {
        C3950bc c3950bcA;
        Qb qbE = this.f32748l.c().e();
        if (qbE == null) {
            return null;
        }
        return (TextUtils.isEmpty(str) || (c3950bcA = qbE.a(str)) == null) ? qbE.e() : c3950bcA;
    }

    public String n() {
        return this.f32750m;
    }

    public String o() {
        return this.f32751n;
    }

    public void o(String str) {
        IronLog.API.verbose("userId = " + str);
        this.f32751n = str;
        Lb.U().q().a(new C5(D5.SET_USER_ID, IronSourceUtils.a(false)));
        AdQualityBridge adQualityBridge = this.f32745j0;
        if (adQualityBridge != null) {
            adQualityBridge.changeUserId(str);
        }
    }

    public String p() {
        return this.f32754q;
    }

    public Map<String, String> r() {
        return this.f32753p;
    }

    public C4002ea s() {
        return this.A;
    }

    public String t() {
        return this.f32758u;
    }
}
