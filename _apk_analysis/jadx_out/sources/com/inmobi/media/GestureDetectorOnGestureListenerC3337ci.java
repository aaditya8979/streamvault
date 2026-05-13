package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.webkit.CookieManager;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.webkit.Profile;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C3539ki;
import com.inmobi.media.GestureDetectorOnGestureListenerC3337ci;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.partials.InMobiNetworkBridge;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class GestureDetectorOnGestureListenerC3337ci extends AbstractC3872y2 implements C, F2, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, Gf, InterfaceC3613nh {

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final Mh f26935e1 = new Mh();

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final Lh f26936f1 = new Lh();

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final String f26937g1 = GestureDetectorOnGestureListenerC3337ci.class.getSimpleName();

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final I1 f26938h1 = new I1(Boolean.FALSE, new sn.a() { // from class: n9.e6
        @Override // sn.a
        public final Object invoke() {
            return Boolean.valueOf(GestureDetectorOnGestureListenerC3337ci.y());
        }
    }, false, true);
    public C3832wc A;
    public final C3815vk A0;
    public boolean B;
    public boolean B0;
    public JSONObject C;
    public boolean C0;
    public JSONObject D;
    public U5 D0;
    public boolean E;
    public S5 E0;
    public boolean F;
    public String F0;
    public boolean G;
    public Ff G0;
    public boolean H;
    public L0 H0;
    public Hn I;
    public final AtomicBoolean I0;
    public boolean J;
    public boolean J0;
    public boolean K;
    public U K0;
    public String L;
    public String L0;
    public final AtomicBoolean M;
    public boolean M0;
    public final Object N;
    public xo N0;
    public final Object O;
    public boolean O0;
    public boolean P;
    public Map P0;
    public final boolean Q;
    public final Qh Q0;
    public View R;
    public final C3311bi R0;
    public WebChromeClient.CustomViewCallback S;
    public String S0;
    public int T;
    public final Th T0;
    public boolean U;
    public final Rh U0;
    public boolean V;
    public final Oh V0;
    public long W;
    public boolean W0;
    public D4 X0;
    public C3803v8 Y0;
    public boolean Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public String f26939a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public C3285ai f26940a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f26941b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final AtomicBoolean f26942b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final Vh f26943b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f26944c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f26945c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final Kh f26946c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26947d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public C3589mi f26948d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public vo f26949d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26950e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final bn.g f26951e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26952f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public C3386eg f26953f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f26954g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final bn.g f26955g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3440gi f26956h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public String f26957h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC3580m9 f26958i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Map f26959i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Di f26960j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public E2 f26961j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ko f26962k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public C f26963k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C3621o0 f26964l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f26965l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AdConfig f26966m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public InterfaceC3820w0 f26967m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f26968n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Fn f26969n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f26970o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final boolean f26971o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile boolean f26972p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f26973p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InterfaceC3309bg f26974q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f26975q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte f26976r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int[] f26977r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C3441gj f26978s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public long f26979s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final bn.g f26980t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f26981t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public WeakReference f26982u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Ph f26983u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public WeakReference f26984v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Sh f26985v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public WeakReference f26986w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f26987w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AbstractC3388ei f26988x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f26989x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final mo.a f26990y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public C3633oc f26991y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f26992z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final GestureDetector f26993z0;

    public /* synthetic */ GestureDetectorOnGestureListenerC3337ci(Context context, byte b10, LinkedHashSet linkedHashSet, String str, String str2, long j10, C3440gi c3440gi, InterfaceC3580m9 interfaceC3580m9, Di di2, ko koVar, C3621o0 c3621o0, AdConfig adConfig, int i10) {
        this(context, b10, (i10 & 4) != 0 ? null : linkedHashSet, (i10 & 8) != 0 ? null : str, (i10 & 16) == 0, (i10 & 32) != 0 ? "DEFAULT" : str2, (i10 & 64) != 0 ? -1L : j10, (i10 & 128) != 0 ? null : c3440gi, interfaceC3580m9, di2, koVar, c3621o0, adConfig);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GestureDetectorOnGestureListenerC3337ci(Context context, byte b10, Set set, String str, boolean z10, String str2, long j10, C3440gi c3440gi, InterfaceC3580m9 interfaceC3580m9, Di di2, ko koVar, C3621o0 c3621o0, AdConfig adConfig) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str2, "landingScheme");
        tn.p.k(di2, "route");
        tn.p.k(koVar, "webViewFactory");
        tn.p.k(adConfig, "adConfig");
        Context applicationContext = context.getApplicationContext();
        tn.p.j(applicationContext, "getApplicationContext(...)");
        super(applicationContext);
        this.f26941b = b10;
        this.f26944c = set;
        this.f26947d = str;
        this.f26950e = z10;
        this.f26952f = str2;
        this.f26954g = j10;
        this.f26956h = c3440gi;
        this.f26958i = interfaceC3580m9;
        this.f26960j = di2;
        this.f26962k = koVar;
        this.f26964l = c3621o0;
        this.f26966m = adConfig;
        this.f26972p = true;
        this.f26974q = new Yh(this);
        this.f26978s = new C3441gj(interfaceC3580m9);
        this.f26980t = kotlin.b.b(new sn.a() { // from class: n9.g6
            @Override // sn.a
            public final Object invoke() {
                return GestureDetectorOnGestureListenerC3337ci.c(this.f75386b);
            }
        });
        this.f26982u = new WeakReference(null);
        this.f26984v = new WeakReference(null);
        this.f26990y = mo.g.b(false, 1, null);
        this.f26992z = Profile.DEFAULT_PROFILE_NAME;
        this.E = true;
        this.F = true;
        this.H = true;
        this.I = Hn.f25624a;
        this.M = new AtomicBoolean(false);
        this.N = new Object();
        this.O = new Object();
        this.Q = true;
        this.T = -1;
        this.W = Long.MIN_VALUE;
        this.f26942b0 = new AtomicBoolean(false);
        this.f26951e0 = kotlin.b.a(LazyThreadSafetyMode.PUBLICATION, new sn.a() { // from class: n9.h6
            @Override // sn.a
            public final Object invoke() {
                return GestureDetectorOnGestureListenerC3337ci.b(this.f75400b);
            }
        });
        this.f26955g0 = kotlin.b.b(new sn.a() { // from class: n9.i6
            @Override // sn.a
            public final Object invoke() {
                return GestureDetectorOnGestureListenerC3337ci.A();
            }
        });
        this.f26983u0 = new Ph(this);
        this.f26985v0 = new Sh(this);
        this.f26987w0 = Integer.MIN_VALUE;
        this.f26989x0 = Integer.MIN_VALUE;
        this.I0 = new AtomicBoolean(true);
        this.Q0 = new Qh(this);
        this.R0 = new C3311bi(this);
        this.S0 = CreativeInfo.f52467al;
        this.T0 = new Th(this, context);
        this.U0 = new Rh(this);
        this.V0 = new Oh(this);
        tn.p.j(f26937g1, "TAG");
        toString();
        f26935e1.getClass();
        f26938h1.a();
        this.f26963k0 = this;
        this.f26971o0 = true;
        this.G0 = new Ff();
        GestureDetector gestureDetector = new GestureDetector(context, this);
        gestureDetector.setOnDoubleTapListener(this);
        gestureDetector.setIsLongpressEnabled(b10 == 1);
        this.f26993z0 = gestureDetector;
        this.A0 = new C3815vk(this);
        if (this.f26968n && this.f26991y0 == null) {
            this.f26991y0 = new C3633oc(this);
        }
        if (c3440gi != null) {
            this.f26948d0 = new C3589mi(c3440gi);
        }
        Jh.a(this, interfaceC3580m9);
        if (c3621o0 != null) {
            setAdType(c3621o0.f27713a);
            this.W0 = c3621o0.f27714b;
            this.W = c3621o0.f27715c;
            this.f26965l0 = c3621o0.f27716d;
            setCreativeId(c3621o0.f27717e);
            this.f26967m0 = c3621o0.f27721i;
            this.f26975q0 = c3621o0.f27722j;
            this.S0 = c3621o0.f27719g;
            String str3 = c3621o0.f27720h;
            if (str3 != null) {
                setAdSize(str3);
            }
            setTelemetryManagerMap(c3621o0.f27723k);
            b(c3621o0.f27718f);
        }
        this.f26940a1 = new C3285ai(this);
        this.f26943b1 = new Vh(this);
        this.f26946c1 = getAdConfig().getRendering().getDisableShowCustomView() ? new Kh(this) : new Nh(this);
        this.f26949d1 = (this.W0 || F3.a(context)) ? new vo(0, 44, 44, 0) : new vo(0, 0, 0, 0);
    }

    public static final TelemetryConfig.LandingPageConfig A() {
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(TelemetryConfig.class, "clazz");
        return ((TelemetryConfig) Y3.f26611a.a(TelemetryConfig.class)).getLpConfig();
    }

    public static final bn.r a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = gestureDetectorOnGestureListenerC3337ci.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).c(str, "onRenderProcessGone");
        }
        gestureDetectorOnGestureListenerC3337ci.getListener().a(gestureDetectorOnGestureListenerC3337ci, z10);
        return bn.r.f5635a;
    }

    public static final bn.r a(C3539ki c3539ki) {
        tn.p.k(c3539ki, "it");
        c3539ki.b();
        return bn.r.f5635a;
    }

    public static final bn.r a(String str, Map map) {
        tn.p.k(str, "trackerName");
        tn.p.k(map, "macros");
        SparseArray sparseArray = InMobiAdActivity.f25113k;
        tn.p.k(str, "trackerName");
        tn.p.k(map, "macros");
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = InMobiAdActivity.f25114l;
        if (gestureDetectorOnGestureListenerC3337ci != null) {
            gestureDetectorOnGestureListenerC3337ci.b(str, map);
        }
        return bn.r.f5635a;
    }

    public static final bn.r a(JSONObject jSONObject) {
        tn.p.k(jSONObject, "it");
        SparseArray sparseArray = InMobiAdActivity.f25113k;
        tn.p.k(jSONObject, "jsonObject");
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = InMobiAdActivity.f25114l;
        if (gestureDetectorOnGestureListenerC3337ci != null) {
            gestureDetectorOnGestureListenerC3337ci.c(jSONObject);
        }
        return bn.r.f5635a;
    }

    public static final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        gestureDetectorOnGestureListenerC3337ci.getListener().k(gestureDetectorOnGestureListenerC3337ci);
    }

    public static final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, byte[] bArr, WatermarkData watermarkData) {
        InterfaceC3580m9 interfaceC3580m9 = gestureDetectorOnGestureListenerC3337ci.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).c(str, "adding overlay to renderview");
        }
        Context context = gestureDetectorOnGestureListenerC3337ci.getContext();
        tn.p.j(context, "getContext(...)");
        FrameLayout frameLayoutA = Zn.a(context, bArr, watermarkData.getAlpha());
        tn.p.k(frameLayoutA, "overlayLayout");
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        if (gestureDetectorOnGestureListenerC3337ci.getParent() != null) {
            ViewParent parent = gestureDetectorOnGestureListenerC3337ci.getParent();
            tn.p.i(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).addView(frameLayoutA, 0);
        }
        gestureDetectorOnGestureListenerC3337ci.getViewableAd().a(frameLayoutA, FriendlyObstructionPurpose.NOT_VISIBLE);
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = gestureDetectorOnGestureListenerC3337ci.f26945c0;
        if (onGlobalLayoutListener != null) {
            gestureDetectorOnGestureListenerC3337ci.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            gestureDetectorOnGestureListenerC3337ci.f26945c0 = null;
        }
    }

    public static final bn.r b(C3539ki c3539ki) {
        tn.p.k(c3539ki, "it");
        c3539ki.m();
        return bn.r.f5635a;
    }

    public static final C3566lk b(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        return new C3566lk(gestureDetectorOnGestureListenerC3337ci.getAdConfig().getRendering().getScrollThrottleInterval());
    }

    public static final bn.r c(C3539ki c3539ki) {
        tn.p.k(c3539ki, "it");
        c3539ki.m();
        return bn.r.f5635a;
    }

    public static final Ti c(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        return new Ti(gestureDetectorOnGestureListenerC3337ci.f26962k, gestureDetectorOnGestureListenerC3337ci.f26958i);
    }

    public static final void d(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, String str) {
        try {
            if (gestureDetectorOnGestureListenerC3337ci.M.get()) {
                return;
            }
            String str2 = "javascript:try{" + str + "}catch(e){}";
            InterfaceC3580m9 interfaceC3580m9 = gestureDetectorOnGestureListenerC3337ci.f26958i;
            if (interfaceC3580m9 != null) {
                String str3 = f26937g1;
                tn.p.j(str3, "TAG");
                ((C3605n9) interfaceC3580m9).a(str3, "Injecting javascript");
            }
            gestureDetectorOnGestureListenerC3337ci.c(str2);
        } catch (Exception e10) {
            InterfaceC3580m9 interfaceC3580m92 = gestureDetectorOnGestureListenerC3337ci.f26958i;
            if (interfaceC3580m92 != null) {
                String str4 = f26937g1;
                tn.p.j(str4, "TAG");
                ((C3605n9) interfaceC3580m92).b(str4, "SDK encountered an unexpected error injecting JavaScript in the Ad container; " + e10.getMessage());
            }
        }
    }

    public static final bn.r f() {
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = InMobiAdActivity.f25114l;
        if (gestureDetectorOnGestureListenerC3337ci != null) {
            gestureDetectorOnGestureListenerC3337ci.D();
        }
        return bn.r.f5635a;
    }

    public static /* synthetic */ void getAdType$annotations() {
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getCloseAssetArea$annotations() {
    }

    public static /* synthetic */ void getImpressionType$annotations() {
    }

    private final TelemetryConfig.LandingPageConfig getLandingPageConfig() {
        return (TelemetryConfig.LandingPageConfig) this.f26955g0.getValue();
    }

    public static /* synthetic */ void getMarkupType$annotations() {
    }

    public static /* synthetic */ void getMarkupTypeAdUnit$annotations() {
    }

    private final AdConfig.MraidConfig getMraidConfig() {
        return getAdConfig().getMraidConfig();
    }

    public static /* synthetic */ void getPlacementType$annotations() {
    }

    private final C3566lk getScrollThrottler() {
        return (C3566lk) this.f26951e0.getValue();
    }

    public static /* synthetic */ void getViewState$annotations() {
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getWindowInsetListener$annotations() {
    }

    public static final short l(String str) {
        tn.p.h(str);
        return Short.parseShort(str);
    }

    private final void setAdSize(String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m9).a(str2, "setAdSize " + this);
        }
        L5 l52 = J5.f25689a;
        this.f26973p0 = (int) (J5.b() * Integer.parseInt(((String[]) new Regex(VastAttributes.HORIZONTAL_POSITION).split(str, 0).toArray(new String[0]))[0]));
        this.f26979s0 = ((int) (J5.b() * Integer.parseInt(((String[]) new Regex(VastAttributes.HORIZONTAL_POSITION).split(str, 0).toArray(new String[0]))[1]))) * this.f26973p0;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setOmidViewableAd(com.inmobi.media.C3840wk r18) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.GestureDetectorOnGestureListenerC3337ci.setOmidViewableAd(com.inmobi.media.wk):void");
    }

    public static final boolean y() {
        ConcurrentHashMap concurrentHashMap = Ea.f25372b;
        Context context = Ji.f25747a;
        tn.p.h(context);
        Ea eaA = Da.a(context, "default");
        tn.p.k("enableImraidLogs", "key");
        return eaA.f25373a.getBoolean("enableImraidLogs", false);
    }

    public final void B() {
        Activity activity;
        if (getPlacementType() == 0) {
            tn.p.j(f26937g1, "TAG");
            toString();
            if (((Activity) this.f26984v.get()) == null) {
                int upperBoundForActivityContext = getAdConfig().getRendering().getUpperBoundForActivityContext();
                tn.p.k(this, "<this>");
                int i10 = 0;
                View view = this;
                loop0: while (true) {
                    activity = null;
                    if (view == null || i10 >= upperBoundForActivityContext) {
                        break;
                    }
                    Context context = view.getContext();
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    while (context instanceof ContextWrapper) {
                        if (context instanceof Activity) {
                            activity = (Activity) context;
                            break loop0;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    Object parent = view.getParent();
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                    i10++;
                }
                if (activity != null) {
                    this.f26984v = new WeakReference(activity);
                    bn.r rVar = bn.r.f5635a;
                }
            }
        }
    }

    public void C() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "onImpressionFired " + this);
        }
        F();
        C3803v8 c3803v8 = this.Y0;
        if (c3803v8 != null) {
            HtmlVideoPlayerConfig htmlVideoPlayerConfig = c3803v8.f28344j;
            C3885yf c3885yf = c3803v8.f28350p;
            if (c3885yf != null) {
                boolean skippable = htmlVideoPlayerConfig.getSkippable();
                float skipOffset = htmlVideoPlayerConfig.getSkipOffset();
                boolean autoplay = htmlVideoPlayerConfig.getAutoplay();
                if (skippable) {
                    Ae ae2 = c3885yf.f28591e;
                    if (ae2 != null) {
                        ae2.a(skipOffset, autoplay);
                    }
                } else {
                    Ae ae3 = c3885yf.f28591e;
                    if (ae3 != null) {
                        ae3.a(autoplay);
                    }
                }
                Ae ae4 = c3885yf.f28591e;
                if (ae4 != null) {
                    if (ae4.f27077e == null) {
                        InterfaceC3580m9 interfaceC3580m92 = ae4.f27074b;
                        if (interfaceC3580m92 != null) {
                            ((C3605n9) interfaceC3580m92).a(AbstractC3371e1.f27072f, "Failed to registerImpression: AdEvent is null");
                        }
                    } else {
                        InterfaceC3580m9 interfaceC3580m93 = ae4.f27074b;
                        if (interfaceC3580m93 != null) {
                            ((C3605n9) interfaceC3580m93).a(AbstractC3371e1.f27072f, "registerImpression");
                        }
                        P4.a(ae4.f27073a, new Z0(ae4, null));
                    }
                }
            }
        }
        getListener().a(getTelemetryOnAdImpression());
    }

    public final void D() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "onUserLandingCompleted " + this);
        }
        g("window.imraid.broadcastEvent('onUserLandingCompleted');");
    }

    public final void E() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "processUnload " + this);
        }
        if (this.M.get()) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
            if (interfaceC3580m92 != null) {
                String str2 = f26937g1;
                tn.p.j(str2, "TAG");
                ((C3605n9) interfaceC3580m92).b(str2, "unload called on destroyed view");
                return;
            }
            return;
        }
        if (!z()) {
            InterfaceC3580m9 interfaceC3580m93 = this.f26958i;
            if (interfaceC3580m93 != null) {
                String str3 = f26937g1;
                tn.p.j(str3, "TAG");
                ((C3605n9) interfaceC3580m93).b(str3, "mraid 3.0 is not enabled");
                return;
            }
            return;
        }
        if (this.C0) {
            InterfaceC3580m9 interfaceC3580m94 = this.f26958i;
            if (interfaceC3580m94 != null) {
                String str4 = f26937g1;
                tn.p.j(str4, "TAG");
                ((C3605n9) interfaceC3580m94).b(str4, "unload called on failed view");
                return;
            }
            return;
        }
        if (this.O0) {
            return;
        }
        this.O0 = true;
        Wb wb2 = (Wb) AbstractC3627o6.f27756e.getValue();
        Runnable runnable = new Runnable() { // from class: n9.d6
            @Override // java.lang.Runnable
            public final void run() {
                GestureDetectorOnGestureListenerC3337ci.a(this.f75331b);
            }
        };
        wb2.getClass();
        tn.p.k(runnable, "runnable");
        wb2.f26536a.post(runnable);
    }

    public final void F() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "recordContextualData " + this);
        }
        D4 d42 = this.X0;
        if (d42 != null) {
            d42.a();
        }
    }

    public final void G() {
        String str;
        C3795v0 c3795v0;
        String str2;
        String str3;
        String str4;
        C3795v0 c3795v02;
        String str5;
        C3672q1 c3672q1;
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str6 = f26937g1;
            tn.p.j(str6, "TAG");
            ((C3605n9) interfaceC3580m9).a(str6, "sendTelemetryEventForNetworkLoad " + this);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String creativeId = getCreativeId();
        if (creativeId != null) {
            linkedHashMap.put("creativeId", creativeId);
        }
        String impressionId = getImpressionId();
        if (impressionId != null) {
            linkedHashMap.put("impressionId", impressionId);
        }
        linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(this.B0 ? (short) 2212 : (short) 2211));
        C3440gi c3440gi = this.f26956h;
        if (c3440gi != null && (c3672q1 = c3440gi.f27239j) != null) {
            linkedHashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - c3672q1.f27925a.f28015c));
        }
        C3440gi c3440gi2 = this.f26956h;
        if (c3440gi2 != null && (c3795v02 = c3440gi2.f27230a) != null && (str5 = c3795v02.f28306f) != null) {
            linkedHashMap.put("plType", str5);
        }
        C3440gi c3440gi3 = this.f26956h;
        if (c3440gi3 != null && (str4 = c3440gi3.f27235f) != null) {
            linkedHashMap.put("creativeType", str4);
        }
        C3440gi c3440gi4 = this.f26956h;
        if (c3440gi4 != null && (str3 = c3440gi4.f27231b) != null) {
            linkedHashMap.put("markupType", str3);
        }
        C3440gi c3440gi5 = this.f26956h;
        if (c3440gi5 != null && (c3795v0 = c3440gi5.f27230a) != null && (str2 = c3795v0.f28305e) != null) {
            linkedHashMap.put("adType", str2);
        }
        C3440gi c3440gi6 = this.f26956h;
        if (c3440gi6 != null && (str = c3440gi6.f27233d) != null) {
            linkedHashMap.put("metadataBlob", str);
        }
        C3440gi c3440gi7 = this.f26956h;
        if (c3440gi7 != null) {
            linkedHashMap.put("isRewarded", Boolean.valueOf(c3440gi7.f27237h));
        }
        a("NetworkLoadLimitExceeded", (HashMap) linkedHashMap);
    }

    public final void H() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).c(str, "setCurrentPosition " + this);
        }
        this.D = new JSONObject();
        getLocationOnScreen(new int[2]);
        try {
            JSONObject jSONObject = this.D;
            if (jSONObject != null) {
                jSONObject.put(VastAttributes.HORIZONTAL_POSITION, F3.b(r0[0] / J5.b()));
            }
            JSONObject jSONObject2 = this.D;
            if (jSONObject2 != null) {
                jSONObject2.put(VastAttributes.VERTICAL_POSITION, F3.b(r0[1] / J5.b()));
            }
            int iB = F3.b(getWidth() / J5.b());
            int iB2 = F3.b(getHeight() / J5.b());
            JSONObject jSONObject3 = this.D;
            if (jSONObject3 != null) {
                jSONObject3.put("width", iB);
            }
            JSONObject jSONObject4 = this.D;
            if (jSONObject4 != null) {
                jSONObject4.put("height", iB2);
            }
        } catch (JSONException unused) {
        }
        synchronized (this.O) {
            this.F = false;
            this.O.notifyAll();
            bn.r rVar = bn.r.f5635a;
        }
    }

    public final void I() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).c(str, "setDefaultPosition " + this);
        }
        int[] iArr = new int[2];
        this.C = new JSONObject();
        if (this.f26986w == null) {
            ViewParent parent = getParent();
            this.f26986w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        }
        WeakReference weakReference = this.f26986w;
        if ((weakReference != null ? (ViewGroup) weakReference.get() : null) != null) {
            WeakReference weakReference2 = this.f26986w;
            if (weakReference2 != null && (viewGroup3 = (ViewGroup) weakReference2.get()) != null) {
                viewGroup3.getLocationOnScreen(iArr);
            }
            try {
                JSONObject jSONObject = this.C;
                if (jSONObject != null) {
                    jSONObject.put(VastAttributes.HORIZONTAL_POSITION, F3.b(iArr[0] / J5.b()));
                }
                JSONObject jSONObject2 = this.C;
                if (jSONObject2 != null) {
                    jSONObject2.put(VastAttributes.VERTICAL_POSITION, F3.b(iArr[1] / J5.b()));
                }
                WeakReference weakReference3 = this.f26986w;
                int iB = F3.b(((weakReference3 == null || (viewGroup2 = (ViewGroup) weakReference3.get()) == null) ? 0 : viewGroup2.getWidth()) / J5.b());
                WeakReference weakReference4 = this.f26986w;
                int iB2 = F3.b(((weakReference4 == null || (viewGroup = (ViewGroup) weakReference4.get()) == null) ? 0 : viewGroup.getHeight()) / J5.b());
                JSONObject jSONObject3 = this.C;
                if (jSONObject3 != null) {
                    jSONObject3.put("width", iB);
                }
                JSONObject jSONObject4 = this.C;
                if (jSONObject4 != null) {
                    jSONObject4.put("height", iB2);
                }
            } catch (JSONException unused) {
                bn.r rVar = bn.r.f5635a;
            }
        } else {
            try {
                JSONObject jSONObject5 = this.C;
                if (jSONObject5 != null) {
                    jSONObject5.put(VastAttributes.HORIZONTAL_POSITION, 0);
                }
                JSONObject jSONObject6 = this.C;
                if (jSONObject6 != null) {
                    jSONObject6.put(VastAttributes.VERTICAL_POSITION, 0);
                }
                JSONObject jSONObject7 = this.C;
                if (jSONObject7 != null) {
                    jSONObject7.put("width", 0);
                }
                JSONObject jSONObject8 = this.C;
                if (jSONObject8 != null) {
                    jSONObject8.put("height", 0);
                }
            } catch (JSONException unused2) {
                bn.r rVar2 = bn.r.f5635a;
            }
        }
        synchronized (this.N) {
            this.E = false;
            this.N.notifyAll();
            bn.r rVar3 = bn.r.f5635a;
        }
    }

    public final void J() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "setFallbackImpressionMinPercentageViewed " + this);
        }
        int webImpressionMinPercentageViewed = tn.p.f("video", this.F0) ? getAdConfig().getViewability().getVideoImpressionMinPercentageViewed() : (tn.p.f("audio", this.F0) && tn.p.f("audio", getAdType())) ? getAdConfig().getViewability().getAudioImpressionMinPercentageViewed() : getAdConfig().getViewability().getWebImpressionMinPercentageViewed();
        this.f26989x0 = webImpressionMinPercentageViewed;
    }

    public final void K() {
        int webImpressionMinTimeViewed = tn.p.f("video", this.F0) ? getAdConfig().getViewability().getVideoImpressionMinTimeViewed() : (tn.p.f("audio", this.F0) && tn.p.f("audio", getAdType())) ? getAdConfig().getViewability().getAudioImpressionMinTimeViewed() : getAdConfig().getViewability().getWebImpressionMinTimeViewed();
        this.f26987w0 = webImpressionMinTimeViewed;
    }

    public final void L() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "setFallbackImpressionParams " + this);
        }
        K();
        J();
        M();
    }

    public final void M() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "setFallbackImpressionType " + this);
        }
        String adType = getAdType();
        this.f26976r = tn.p.f(adType, "banner") ? getAdConfig().getViewability().getBannerImpressionType() : tn.p.f(adType, "audio") ? getAdConfig().getViewability().getAudioImpressionType() : getAdConfig().getViewability().getInterstitialImpressionType();
    }

    public final void N() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "setImpressionParams " + this);
        }
        if (this.f26944c == null) {
            L();
            return;
        }
        try {
            L();
            for (C3840wk c3840wk : this.f26944c) {
                if (c3840wk.f28462a == 2) {
                    if (c3840wk.f28463b.containsKey("type")) {
                        Object obj = c3840wk.f28463b.get("type");
                        tn.p.i(obj, "null cannot be cast to non-null type kotlin.Int");
                        this.f26976r = (byte) ((Integer) obj).intValue();
                    } else {
                        M();
                    }
                    if (c3840wk.f28463b.containsKey("time")) {
                        Object obj2 = c3840wk.f28463b.get("time");
                        tn.p.i(obj2, "null cannot be cast to non-null type kotlin.Int");
                        this.f26987w0 = ((Integer) obj2).intValue();
                    } else {
                        K();
                    }
                    if (c3840wk.f28463b.containsKey(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)) {
                        Object obj3 = c3840wk.f28463b.get(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                        tn.p.i(obj3, "null cannot be cast to non-null type kotlin.Int");
                        this.f26989x0 = ((Integer) obj3).intValue();
                    } else {
                        J();
                    }
                    if (this.f26976r == 2) {
                        if (c3840wk.f28463b.containsKey(com.ironsource.Ne.f29912a1)) {
                            Object obj4 = c3840wk.f28463b.get(com.ironsource.Ne.f29912a1);
                            tn.p.i(obj4, "null cannot be cast to non-null type kotlin.Int");
                            this.f26981t0 = ((Integer) obj4).intValue();
                        } else {
                            M();
                        }
                        if (c3840wk.f28463b.containsKey(TypedValues.AttributesType.S_FRAME)) {
                            Object obj5 = c3840wk.f28463b.get(TypedValues.AttributesType.S_FRAME);
                            this.f26977r0 = obj5 instanceof int[] ? (int[]) obj5 : null;
                        } else {
                            M();
                        }
                    }
                }
            }
        } catch (JSONException unused) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
            if (interfaceC3580m92 != null) {
                String str2 = f26937g1;
                tn.p.j(str2, "TAG");
                ((C3605n9) interfaceC3580m92).b(str2, "Exception in parsing the impressionType and pixel frame");
            }
            L();
        } catch (Exception unused2) {
            InterfaceC3580m9 interfaceC3580m93 = this.f26958i;
            if (interfaceC3580m93 != null) {
                String str3 = f26937g1;
                tn.p.j(str3, "TAG");
                ((C3605n9) interfaceC3580m93).b(str3, "SDK encountered an unexpected error in parsing impression parameters");
            }
            L();
        }
    }

    public final void O() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).c(str, "setIsViewHardwareAccelerated " + this);
        }
        this.B = isHardwareAccelerated();
    }

    public final void P() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).c(str, "skipFromInterActive " + this);
        }
        D4 d42 = this.X0;
        if (d42 != null) {
            d42.h();
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        if (interfaceC3580m92 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m92).a(str2, "skipFromInterActive");
        }
    }

    public final void Q() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "startTrackingAudioVolume " + this);
        }
        if (!z() || this.f26950e) {
            return;
        }
        C3670q c3670q = C3670q.f27913a;
        Ph ph2 = this.f26983u0;
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        tn.p.k(ph2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        p000do.i.d(C3670q.f27919g, null, null, new C3545l(interfaceC3580m92, ph2, null), 3, null);
    }

    public final void R() {
        Set linkedHashSet;
        Set<View> setKeySet;
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "startTrackingExposure " + this);
        }
        if (!z() || this.f26950e) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
            if (interfaceC3580m92 != null) {
                String str2 = f26937g1;
                tn.p.j(str2, "TAG");
                ((C3605n9) interfaceC3580m92).b(str2, "exposureTracker is already initialized");
            }
        } else {
            Map<View, FriendlyObstructionPurpose> friendlyViews = getFriendlyViews();
            if (friendlyViews == null || (setKeySet = friendlyViews.keySet()) == null || (linkedHashSet = cn.f0.k1(setKeySet)) == null) {
                linkedHashSet = new LinkedHashSet();
            }
            this.K0 = new U(this, linkedHashSet, getAdConfig().getMraid3Config().getExposureChangeInterval(), this.f26985v0, this.f26958i);
        }
        U u10 = this.K0;
        if (u10 != null) {
            u10.a();
        }
    }

    public final void S() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "stopTrackingAudioVolume " + this);
        }
        C3670q c3670q = C3670q.f27913a;
        Ph ph2 = this.f26983u0;
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        tn.p.k(ph2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        p000do.i.d(C3670q.f27919g, null, null, new C3595n(interfaceC3580m92, ph2, null), 3, null);
    }

    public final void T() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "stopTrackingExposure " + this);
        }
        U u10 = this.K0;
        if (u10 != null) {
            u10.b();
        }
    }

    public final void U() {
        new C3873y3(this, !this.G, !this.J, this.f26958i).a(this.f26949d1);
    }

    public final long V() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).c(str, "timeSincePodShow " + this);
        }
        InterfaceC3820w0 interfaceC3820w0 = this.f26967m0;
        if (interfaceC3820w0 != null) {
            return ((AbstractC3547l1) interfaceC3820w0).T();
        }
        return 0L;
    }

    public final void W() {
        getListener().e(this);
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "ad dismissed");
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        if (interfaceC3580m92 != null) {
            ((C3605n9) interfaceC3580m92).a();
        }
        L0 l02 = this.H0;
        if (l02 == null) {
            tn.p.C("adQualityManager");
            l02 = null;
        }
        if (l02.f25834d.get()) {
            l02.a("session end is already triggered");
            return;
        }
        if (!l02.f25831a.getEnabled()) {
            l02.a("config kill switch - false. ad quality will skip");
        } else if (l02.f25837g == null) {
            l02.a("setup not done. ignore trigger");
        } else {
            l02.f25834d.set(true);
            l02.a(false);
        }
    }

    public final void X() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "unregisterBackButtonPressedEventListener " + this);
        }
        this.L = null;
    }

    public final void Y() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "updateActivitiesOrientationProperties " + this);
        }
        Activity activity = (Activity) this.f26982u.get();
        if (activity == null || !(activity instanceof InMobiAdActivity)) {
            return;
        }
        Ff ff2 = this.G0;
        tn.p.k(ff2, "orientationProperties");
        O8 o82 = ((InMobiAdActivity) activity).f25115a;
        if (o82 == null) {
            tn.p.C("orientationHandler");
            o82 = null;
        }
        o82.a(ff2);
    }

    public final void a(float f10, float f11) {
        if (!this.f26972p) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
            if (interfaceC3580m9 != null) {
                String str = f26937g1;
                tn.p.j(str, "TAG");
                ((C3605n9) interfaceC3580m9).c(str, "Touch Begin is disabled via enableTouchBegin API");
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        if (interfaceC3580m92 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m92).a(str2, "onTouchBegin detected");
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(F3.c(f10));
            jSONArray.put(F3.c(f11));
        } catch (JSONException e10) {
            InterfaceC3580m9 interfaceC3580m93 = this.f26958i;
            if (interfaceC3580m93 != null) {
                String str3 = f26937g1;
                tn.p.j(str3, "TAG");
                ((C3605n9) interfaceC3580m93).a(str3, "Exception in onTouchBegin", e10);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        g("window.imraidview.onGestureDetected('9', '" + jSONArray2 + "');");
    }

    public final void a(int i10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "fireOrientationChange " + this + com.ironsource.Z7.f30794r + i10);
        }
        g("window.imraid.broadcastEvent('orientationChange','" + i10 + "');");
    }

    public final void a(int i10, int i11) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "fireSizeChanged " + this + " w-" + i10 + " h-" + i11);
        }
        g("window.mraidview.broadcastEvent('sizeChange'," + i10 + StringUtils.COMMA + i11 + ");");
    }

    public final void a(MotionEvent motionEvent) {
        C3633oc c3633oc;
        if (this.f26950e && !this.U) {
            this.U = true;
            SparseArray sparseArray = InMobiAdActivity.f25113k;
            f26935e1.getClass();
            JSONObject jSONObjectA = Mh.a("IN_CUSTOM_BROWSER", "onInteraction");
            tn.p.k(jSONObjectA, "jsonObject");
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = InMobiAdActivity.f25114l;
            if (gestureDetectorOnGestureListenerC3337ci != null) {
                gestureDetectorOnGestureListenerC3337ci.c(jSONObjectA);
            }
        }
        if (this.f26941b == 1 && (c3633oc = this.f26991y0) != null) {
            c3633oc.a(motionEvent);
        }
        this.f26993z0.onTouchEvent(motionEvent);
    }

    public final void a(RelativeLayout relativeLayout) {
        C3885yf c3885yf;
        tn.p.k(relativeLayout, "adBackgroundView");
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).b("HtmlVideoPlayer", "inflateVideoPlayer " + this);
        }
        C3803v8 c3803v8 = this.Y0;
        if (c3803v8 != null) {
            tn.p.k(relativeLayout, "parentView");
            if (c3803v8.f28341g.get()) {
                return;
            }
            InterfaceC3580m9 interfaceC3580m92 = c3803v8.f28337c;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).b("HybridVideoPlayerHandler", "Inflate called");
            }
            if (c3803v8.f28343i && (c3885yf = c3803v8.f28350p) != null) {
                tn.p.k(relativeLayout, "parentView");
                InterfaceC3580m9 interfaceC3580m93 = c3885yf.f28593g;
                if (interfaceC3580m93 != null) {
                    tn.p.j("yf", "TAG");
                    ((C3605n9) interfaceC3580m93).c("yf", "startOmidSession");
                }
                Ae ae2 = c3885yf.f28591e;
                if (ae2 != null) {
                    tn.p.k(relativeLayout, "adView");
                    if (ae2.f27075c == null) {
                        InterfaceC3580m9 interfaceC3580m94 = ae2.f27074b;
                        if (interfaceC3580m94 != null) {
                            ((C3605n9) interfaceC3580m94).a(AbstractC3371e1.f27072f, "Failed to registerAdView. adSession is null");
                        }
                    } else {
                        InterfaceC3580m9 interfaceC3580m95 = ae2.f27074b;
                        if (interfaceC3580m95 != null) {
                            ((C3605n9) interfaceC3580m95).a(AbstractC3371e1.f27072f, "registerAdView");
                        }
                        P4.a(ae2.f27073a, new Y0(ae2, relativeLayout, null));
                    }
                }
                Ae ae3 = c3885yf.f28591e;
                if (ae3 != null) {
                    if (ae3.f27075c == null) {
                        InterfaceC3580m9 interfaceC3580m96 = ae3.f27074b;
                        if (interfaceC3580m96 != null) {
                            ((C3605n9) interfaceC3580m96).a(AbstractC3371e1.f27072f, "Failed to startAdSession. adSession is null");
                        }
                    } else {
                        InterfaceC3580m9 interfaceC3580m97 = ae3.f27074b;
                        if (interfaceC3580m97 != null) {
                            ((C3605n9) interfaceC3580m97).a(AbstractC3371e1.f27072f, "startAdSession");
                        }
                        P4.a(ae3.f27073a, new C3294b1(ae3, null));
                    }
                }
            }
            c3803v8.f28345k.a(relativeLayout);
            c3803v8.f28345k.e();
            c3803v8.f28349o = true;
        }
    }

    @Override // com.inmobi.media.Gf
    public final void a(Df df2) {
        tn.p.k(df2, "orientation");
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "onOrientationUpdate " + this);
        }
    }

    public final void a(Df df2, wo woVar) {
        JSONObject jSONObjectA;
        vo voVar;
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).c(str, "fireOnSafeAreaChanged " + this);
        }
        tn.p.k(woVar, "<this>");
        tn.p.k(df2, "orientation");
        try {
            woVar.getClass();
            tn.p.k(df2, "orientation");
            voVar = (vo) woVar.f28471a.get(df2);
        } catch (Exception unused) {
        }
        if (voVar != null) {
            jSONObjectA = voVar.a();
            jSONObjectA.put("orientation", Ef.a(df2));
        } else {
            jSONObjectA = null;
        }
        g("window.imraid.broadcastEvent('onSafeAreaChange', " + jSONObjectA + ")");
    }

    public void a(Ff ff2) {
        tn.p.k(ff2, "orientationProperties");
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "setOrientationProperties " + this);
        }
        this.G0 = ff2;
        Y();
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad2) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).c(str, "initContextualData " + this);
        }
        this.X0 = new D4(ad2 != null ? ad2.getContextData() : null, this.W);
    }

    public final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, String str) throws JSONException {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "sourceView");
        tn.p.k(str, "targetId");
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m9).c(str2, "fireDestroyWebViewSuccess " + this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", str);
        gestureDetectorOnGestureListenerC3337ci.g("window.imraidview.broadcastEvent('destroyWebView'," + jSONObject + ");");
    }

    public final void a(AbstractC3388ei abstractC3388ei) {
        WatermarkData watermarkData;
        AdQualityControl adQualityControl;
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).c(str, "initialize " + this);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (tn.p.f(this.S0, "htmlUrl")) {
            getSettings().setMixedContentMode(2);
        }
        N();
        this.f26988x = abstractC3388ei;
        ViewParent parent = getParent();
        this.f26986w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        setBackgroundColor(getRenderingConfig().getWebviewBackgroundColor());
        String url = getMraidConfig().getUrl();
        int maxRetries = getMraidConfig().getMaxRetries();
        int retryInterval = getMraidConfig().getRetryInterval();
        long expiry = getMraidConfig().getExpiry();
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        C3683qc c3683qc = new C3683qc(url, maxRetries, retryInterval, expiry, interfaceC3580m92);
        if (url != null) {
            p000do.i.d(A9.f25147c, null, null, new C3658pc(c3683qc, null), 3, null);
        } else if (interfaceC3580m92 != null) {
            String str2 = c3683qc.f27968f;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m92).b(str2, "MRAID Js Url provided is invalid.");
        }
        setImportantForAccessibility(2);
        setScrollable(false);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(getAdConfig().getRendering().getEnableDomStorage());
        getSettings().setGeolocationEnabled(true);
        e();
        if (this.f26950e && getAdConfig().getEnableCookiesOnInAppBrowser()) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this, true);
        }
        setWebChromeClient(this.f26946c1);
        if (!this.f26950e) {
            C3805va c3805va = new C3805va(this.f26941b, this);
            InterfaceC3580m9 interfaceC3580m93 = this.f26958i;
            if (interfaceC3580m93 != null) {
                tn.p.k(interfaceC3580m93, "logger");
                c3805va.f28356c = interfaceC3580m93;
            }
            InMobiNetworkBridge.onAddedJavascriptInterface(this, c3805va, "sdkController");
        }
        this.A = new C3832wc(this, this.f26958i);
        this.H0 = new L0(getAdConfig().getAdQuality(), this.f26958i);
        if (i10 >= 29) {
            C3489ii c3489ii = new C3489ii(this.f26958i, this.f26948d0);
            Object value = AbstractC3627o6.f27754c.getValue();
            tn.p.j(value, "getValue(...)");
            setWebViewRenderProcessClient((ExecutorService) value, c3489ii);
        }
        C3621o0 c3621o0 = this.f26964l;
        if (c3621o0 != null && (adQualityControl = c3621o0.f27726n) != null) {
            L0 l02 = this.H0;
            if (l02 == null) {
                tn.p.C("adQualityManager");
                l02 = null;
            }
            l02.getClass();
            tn.p.k(adQualityControl, "adQualityControl");
            l02.a("adQuality session setup");
            if (!l02.f25831a.getEnabled()) {
                l02.a("config kill switch while setup - false. ad quality will skip");
            } else if (l02.f25833c.get()) {
                l02.a("session already started. skip");
            } else {
                l02.a("verifying control flags");
                String beacon = adQualityControl.getBeacon();
                if (beacon == null || beacon.length() != 0) {
                    l02.f25837g = adQualityControl;
                } else {
                    l02.a("no beacon received. aborting...");
                    p000do.l0 l0Var = E0.f25356e;
                    if (l0Var != null) {
                        kotlinx.coroutines.d.d(l0Var, new CancellationException("Shutdown"));
                    }
                    E0.f25356e = null;
                    l02.a("session end - cleanup");
                    l02.f25837g = null;
                    l02.f25836f.clear();
                    l02.f25833c.set(false);
                    l02.f25834d.set(false);
                    l02.a("ad quality session is already in progress. skipping...");
                }
            }
        }
        C3621o0 c3621o02 = this.f26964l;
        if (c3621o02 != null && (watermarkData = c3621o02.f27725m) != null) {
            setWatermark(watermarkData);
        }
        C3621o0 c3621o03 = this.f26964l;
        if (c3621o03 != null ? tn.p.f(c3621o03.f27724l, Boolean.TRUE) : false) {
            k();
        }
    }

    public final void a(C3633oc c3633oc) {
        tn.p.k(c3633oc, "movementGestureDetector");
        if (this.f26950e || !getRenderingConfig().getSupportedGestures().contains(2)) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
            if (interfaceC3580m9 != null) {
                String str = f26937g1;
                tn.p.j(str, "TAG");
                ((C3605n9) interfaceC3580m9).c(str, "Pan gesture is disabled from config");
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        if (interfaceC3580m92 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            JSONArray jSONArray = c3633oc.f27786j;
            Integer numValueOf = jSONArray != null ? Integer.valueOf(jSONArray.length()) : null;
            ((C3605n9) interfaceC3580m92).a(str2, bo.t.j("onPanDetected\n " + numValueOf + " \n " + c3633oc.f27786j));
        }
        g("window.imraidview.onGestureDetected('2', '" + c3633oc.f27786j + "');");
    }

    public final void a(C3633oc c3633oc, MotionEvent motionEvent, MotionEvent motionEvent2) {
        tn.p.k(c3633oc, "movementGestureDetector");
        tn.p.k(motionEvent, "initialEvent");
        tn.p.k(motionEvent2, "endEvent");
        if (this.f26950e || !getRenderingConfig().getSupportedGestures().contains(4)) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
            if (interfaceC3580m9 != null) {
                String str = f26937g1;
                tn.p.j(str, "TAG");
                ((C3605n9) interfaceC3580m9).c(str, "Pinch gesture is disabled from config");
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        if (interfaceC3580m92 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m92).a(str2, bo.t.j(" onScaleDetected\n " + motionEvent + " \n " + motionEvent2));
        }
        JSONArray jSONArray = new JSONArray();
        float f10 = 2;
        jSONArray.put(new JSONArray((Collection) cn.w.p(Integer.valueOf(F3.c((motionEvent2.getX(1) + motionEvent2.getX()) / f10)), Integer.valueOf(F3.c((motionEvent2.getY(1) + motionEvent2.getY()) / f10)))));
        g("window.imraidview.onGestureDetected('4', '" + jSONArray + "');");
    }

    public final void a(EnumC3654p8 enumC3654p8, Object obj) {
        if (obj instanceof String) {
            obj = "'" + obj + "'";
        }
        String str = "window.imraid.broadcastEvent('" + enumC3654p8.f27856a + "', " + obj + ");";
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m9).b(str2, "fireHtmlVideoEvents: " + str);
        }
        g(str);
    }

    public final void a(Exception exc) {
        tn.p.k(exc, "e");
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "handlePingException " + this, exc);
        }
        InterfaceC3309bg interfaceC3309bg = this.f26974q;
        Z5[] z5Arr = Z5.f26686a;
        ((Yh) interfaceC3309bg).a("", -107, "Ping exception occurred", System.currentTimeMillis(), 0);
        bn.g gVar = P9.f26117a;
        AbstractC3481i9.a(exc);
    }

    @Override // com.inmobi.media.InterfaceC3613nh
    public final void a(String str) {
        tn.p.k(str, "mraidApi");
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m9).a(str2, "sendFraudBeaconAndTelemetryEvent " + this);
        }
        d(str);
        String adType = getAdType();
        if (adType == null) {
            adType = "banner";
        }
        c(str, adType);
    }

    public final void a(String str, String str2) {
        tn.p.k(str2, "callback");
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str3 = f26937g1;
            tn.p.j(str3, "TAG");
            ((C3605n9) interfaceC3580m9).a(str3, "fireJavaScriptCallback " + this);
        }
        if (str == null) {
            return;
        }
        g(str + "." + str2);
    }

    public final void a(String str, String str2, String str3) {
        tn.p.k(str2, "message");
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str4 = f26937g1;
            tn.p.j(str4, "TAG");
            ((C3605n9) interfaceC3580m9).a(str4, "fireError " + this + " - " + str2 + " - " + str3);
        }
        if (str == null || str3 == null) {
            return;
        }
        a(str, "broadcastEvent('error',\"" + str2 + "\", \"" + str3 + "\")");
    }

    public final void a(String str, String str2, boolean z10) {
        Activity activity;
        tn.p.k(str, "url");
        tn.p.k(str2, "templateInfoStr");
        try {
            JSONObject jSONObject = new JSONObject(str2);
            InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
            if (interfaceC3580m9 != null) {
                String str3 = f26937g1;
                tn.p.j(str3, "TAG");
                ((C3605n9) interfaceC3580m9).a(str3, "report - " + getAdType() + " type - sdk - " + Build.VERSION.SDK_INT);
            }
            if (!tn.p.f(getAdType(), ImpressionLog.f51753w) || Build.VERSION.SDK_INT < 29 || (activity = (Activity) this.f26982u.get()) == null) {
                bn.g gVar = E0.f25352a;
                E0.a(this, this, str, z10, jSONObject, this.Q0);
            } else {
                bn.g gVar2 = E0.f25352a;
                E0.a(activity, this, str, z10, jSONObject, this.Q0);
            }
        } catch (Exception e10) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
            if (interfaceC3580m92 != null) {
                String str4 = f26937g1;
                tn.p.j(str4, "TAG");
                ((C3605n9) interfaceC3580m92).a(str4, "issue wile reporting ad", e10);
            }
        }
    }

    public final void a(String str, HashMap map) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m9).a(str2, "processTelemetryEvent " + this);
        }
        getListener().a(str, map);
    }

    public final void a(String str, JSONObject jSONObject) {
        tn.p.k(jSONObject, "message");
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m9).a(str2, "fireError " + this + " - " + jSONObject);
        }
        g("window.imraidview.broadcastEvent('error','" + jSONObject + "', '" + str + "');");
        d(jSONObject);
    }

    public final void a(HashMap map) {
        C3885yf c3885yf;
        Ae ae2;
        tn.p.k(map, "params");
        getListener().a(map);
        C3803v8 c3803v8 = this.Y0;
        if (c3803v8 == null || (c3885yf = c3803v8.f28350p) == null || (ae2 = c3885yf.f28591e) == null) {
            return;
        }
        ae2.a(InteractionType.CLICK);
    }

    public final void a(boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "fireNextAdLoadComplete " + this);
        }
        String str2 = "window.imraidview.broadcastEvent('adLoadSuccess'," + z10 + ");";
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        if (interfaceC3580m92 != null) {
            String str3 = f26937g1;
            tn.p.j(str3, "TAG");
            ((C3605n9) interfaceC3580m92).c(str3, str2 + " Index: " + getCurrentRenderingPodAdIndex());
        }
        g(str2);
    }

    public final void a(boolean z10, short s10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).c(str, "fireRenderProcessGoneTelemetry");
        }
        C3589mi c3589mi = this.f26948d0;
        if (c3589mi != null) {
            c3589mi.a(z10, s10);
        }
    }

    @Override // com.inmobi.media.InterfaceC3613nh
    public final boolean a() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "hasUserInteracted " + getViewTouchTimestamp() + com.ironsource.Z7.f30794r + getRenderingConfig().getUserTouchResetTime());
        }
        if (!getRenderingConfig().getAutoRedirectionEnforcement() || this.f26965l0) {
            return true;
        }
        return getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime();
    }

    public final boolean a(JsResult jsResult) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "shouldRenderPopup " + this);
        }
        if (getRenderingConfig().shouldRenderPopup()) {
            return true;
        }
        jsResult.cancel();
        w();
        return false;
    }

    @Override // com.inmobi.media.C
    public void b() throws JSONException {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "destroyContainer " + this);
        }
        j();
        this.f26962k.b(new sn.l() { // from class: n9.z5
            @Override // sn.l
            public final Object invoke(Object obj) {
                return GestureDetectorOnGestureListenerC3337ci.a((C3539ki) obj);
            }
        });
        removeAllViews();
        AdConfig.OmidConfig omidConfig = getAdConfig().getViewability().getOmidConfig();
        if (this.f26971o0 && omidConfig.isOmidEnabled()) {
            Bf.f25219a.getClass();
            if (Omid.isActive()) {
                new C3465hi(this, omidConfig.getWebViewRetainTime()).a();
                return;
            }
        }
        super.destroy();
    }

    public final void b(float f10, float f11) {
        if (!this.f26970o) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
            if (interfaceC3580m9 != null) {
                String str = f26937g1;
                tn.p.j(str, "TAG");
                ((C3605n9) interfaceC3580m9).c(str, "Touch End is disabled via enableTouchEnd API");
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        if (interfaceC3580m92 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m92).a(str2, "onTouchEnd detected");
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(F3.c(f10));
            jSONArray.put(F3.c(f11));
        } catch (JSONException e10) {
            InterfaceC3580m9 interfaceC3580m93 = this.f26958i;
            if (interfaceC3580m93 != null) {
                String str3 = f26937g1;
                tn.p.j(str3, "TAG");
                ((C3605n9) interfaceC3580m93).a(str3, "Exception in onTouchEnd", e10);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        g("window.imraidview.onGestureDetected('10', '" + jSONArray2 + "');");
    }

    public final void b(int i10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "loadPodAd " + this);
        }
        if (this.I == Hn.f25626c && this.f26967m0 != null && !this.M.get()) {
            InterfaceC3820w0 interfaceC3820w0 = this.f26967m0;
            if (interfaceC3820w0 != null) {
                interfaceC3820w0.a(i10, this);
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        if (interfaceC3580m92 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m92).b(str2, "Cannot load index pod ad as the current ad is not viewable");
        }
        a(false);
    }

    public final void b(Df df2) {
        tn.p.k(df2, "orientation");
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "handle orientationChange " + this + com.ironsource.Z7.f30794r + df2);
        }
        a(Ef.a(df2));
    }

    public final void b(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, String str) throws JSONException {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "sourceView");
        tn.p.k(str, "targetId");
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m9).c(str2, "fireLoadWebViewSuccess " + this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", str);
        C3589mi c3589mi = this.f26948d0;
        jSONObject.put("latency", c3589mi != null ? c3589mi.f27638h : 0L);
        gestureDetectorOnGestureListenerC3337ci.g("window.imraidview.broadcastEvent('webViewLoaded', " + jSONObject + ");");
    }

    public final void b(C3633oc c3633oc, MotionEvent motionEvent, MotionEvent motionEvent2) {
        tn.p.k(c3633oc, "rotationDetector");
        tn.p.k(motionEvent, "initialEvent");
        tn.p.k(motionEvent2, "endEvent");
        if (this.f26950e || !getRenderingConfig().getSupportedGestures().contains(3)) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
            if (interfaceC3580m9 != null) {
                String str = f26937g1;
                tn.p.j(str, "TAG");
                ((C3605n9) interfaceC3580m9).c(str, "Rotation gesture is disabled from config");
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        if (interfaceC3580m92 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m92).a(str2, bo.t.j(" Rotation detected " + c3633oc.f27785i + " \n " + motionEvent + " \n " + motionEvent2));
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new JSONArray((Collection) cn.w.p(Integer.valueOf(F3.c(motionEvent.getX())), Integer.valueOf(F3.c(motionEvent.getY())))));
        jSONArray.put(new JSONArray((Collection) cn.w.p(Integer.valueOf(F3.c(motionEvent.getX(1))), Integer.valueOf(F3.c(motionEvent.getY(1))))));
        jSONArray.put(new JSONArray((Collection) cn.w.p(Integer.valueOf(F3.c(motionEvent2.getX())), Integer.valueOf(F3.c(motionEvent2.getY())))));
        jSONArray.put(new JSONArray((Collection) cn.w.p(Integer.valueOf(F3.c(motionEvent2.getX(1))), Integer.valueOf(F3.c(motionEvent2.getY(1))))));
        g("window.imraidview.onGestureDetected('3', '" + jSONArray + "');");
    }

    public final void b(String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m9).c(str2, "creativeType " + this + com.ironsource.Z7.f30794r + str);
        }
        this.F0 = str;
    }

    public final void b(String str, String str2) {
        tn.p.k(str2, "url");
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str3 = f26937g1;
            tn.p.j(str3, "TAG");
            ((C3605n9) interfaceC3580m9).a(str3, "processMediaPlaybackRequest " + this);
        }
        if (this.O0) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
            if (interfaceC3580m92 != null) {
                String str4 = f26937g1;
                tn.p.j(str4, "TAG");
                ((C3605n9) interfaceC3580m92).b(str4, "Media playback is not allowed after unload! Ignoring request ...");
                return;
            }
            return;
        }
        if (1 != this.f26941b) {
            InterfaceC3580m9 interfaceC3580m93 = this.f26958i;
            if (interfaceC3580m93 != null) {
                String str5 = f26937g1;
                tn.p.j(str5, "TAG");
                ((C3605n9) interfaceC3580m93).b(str5, "Media playback is only supported on full screen ads! Ignoring request ...");
                return;
            }
            return;
        }
        Activity activity = (Activity) this.f26982u.get();
        if (activity != null) {
            C3832wc c3832wc = this.A;
            if (c3832wc != null) {
                c3832wc.a(str2, activity);
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m94 = this.f26958i;
        if (interfaceC3580m94 != null) {
            String str6 = f26937g1;
            tn.p.j(str6, "TAG");
            ((C3605n9) interfaceC3580m94).b(str6, "Media playback is  not allowed before it is visible! Ignoring request ...");
        }
        a(str, "Media playback is  not allowed before it is visible! Ignoring request ...", "playVideo");
    }

    public final void b(String str, String str2, String str3) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str4 = f26937g1;
            tn.p.j(str4, "TAG");
            ((C3605n9) interfaceC3580m9).a(str4, "onUserLandingInitialized " + this + " isInAppBrowser: " + this.f26950e);
        }
        g("window.imraid.broadcastEvent('onUserLandingInitialized');");
        if (str2 == null) {
            return;
        }
        a(str2, "broadcastEvent('" + str + "Successful','" + str3 + "');");
    }

    public final void b(String str, Map map) {
        tn.p.k(str, "trackerName");
        tn.p.k(map, "macros");
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m9).a(str2, "fireLandingPageTracker " + this);
        }
        getListener().a(this, str, map);
    }

    public final void b(JSONObject jSONObject) {
        tn.p.k(jSONObject, "jsonObject");
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "onCTLifeCycleEvent " + this);
        }
        g("window.imraid.broadcastEvent('onCTLifeCycleEvent', " + jSONObject + ");");
    }

    public final void b(boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).c(str, "fireNextAdShowComplete " + this);
        }
        String str2 = "window.imraidview.broadcastEvent('adShowSuccess'," + z10 + ");";
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        if (interfaceC3580m92 != null) {
            String str3 = f26937g1;
            tn.p.j(str3, "TAG");
            ((C3605n9) interfaceC3580m92).a(str3, str2 + " Index: " + getCurrentRenderingPodAdIndex());
        }
        g(str2);
    }

    public final void c(int i10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "showPodAdAtIndex " + this + com.ironsource.Z7.f30794r + i10);
        }
        if (this.I == Hn.f25626c && this.f26967m0 != null && !this.M.get()) {
            InterfaceC3820w0 interfaceC3820w0 = this.f26967m0;
            if (interfaceC3820w0 != null) {
                interfaceC3820w0.a(i10, this, getFullScreenActivity());
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        if (interfaceC3580m92 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m92).b(str2, "Cannot show index pod ad as the current ad is not viewable");
        }
        b(false);
    }

    public final void c(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, String str) throws JSONException {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "sourceView");
        tn.p.k(str, "targetId");
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m9).c(str2, "fireShowWebViewSuccess " + this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", str);
        gestureDetectorOnGestureListenerC3337ci.g("window.imraidview.broadcastEvent('webViewShown'," + jSONObject + ");");
    }

    public final void c(String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m9).c(str2, "evaluateScript " + this);
        }
        evaluateJavascript(str, null);
    }

    public final void c(String str, String str2) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str3 = f26937g1;
            tn.p.j(str3, "TAG");
            ((C3605n9) interfaceC3580m9).c(str3, "sendTelemetryForAutoRedirectFraud " + this + com.ironsource.Z7.f30794r + str + com.ironsource.Z7.f30794r + str2);
        }
        HashMap map = new HashMap();
        String creativeId = getCreativeId();
        if (creativeId != null) {
            map.put("creativeId", creativeId);
        }
        map.put("trigger", str);
        String impressionId = getImpressionId();
        if (impressionId != null) {
            map.put("impressionId", impressionId);
        }
        map.put("adType", str2);
        a("BlockAutoRedirection", map);
    }

    public final void c(String str, String str2, String str3) {
        tn.p.k(str, "jsCallbackNamespace");
        tn.p.k(str2, "callback");
        tn.p.k(str3, "blob");
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str4 = f26937g1;
            tn.p.j(str4, "TAG");
            ((C3605n9) interfaceC3580m9).a(str4, "retrievedBlob");
        }
        a(str, str2 + "(" + str3 + ");");
    }

    public final void c(JSONObject jSONObject) {
        tn.p.k(jSONObject, "jsonObject");
        if (getLandingPageConfig().getEnableOnLpLifeCycleEvent()) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
            if (interfaceC3580m9 != null) {
                String str = f26937g1;
                tn.p.j(str, "TAG");
                ((C3605n9) interfaceC3580m9).a(str, "onLpLifeCycleEvent " + this);
            }
            g("window.imraid.broadcastEvent('onLpLifeCycleEvent', " + jSONObject + ");");
        }
    }

    public final void c(boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "fireViewableChange " + this + com.ironsource.Z7.f30794r + z10);
        }
        g("window.mraidview.broadcastEvent('viewableChange'," + z10 + ");");
    }

    @Override // com.inmobi.media.InterfaceC3613nh
    public final boolean c() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "canRedirectExternally Called");
        }
        if (getRenderingConfig().getAutoRedirectionEnforcement()) {
            return getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime();
        }
        return true;
    }

    @Override // com.inmobi.media.AbstractC3872y2
    public final Ua d() {
        Za za2;
        String str;
        String str2;
        String str3;
        C3795v0 c3795v0;
        String str4;
        C3795v0 c3795v02;
        String str5;
        C3795v0 c3795v03;
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str6 = f26937g1;
            tn.p.j(str6, "TAG");
            ((C3605n9) interfaceC3580m9).a(str6, "initLandingPageHandler " + this);
        }
        boolean z10 = this.f26950e;
        String str7 = this.f26952f;
        boolean zIsCCTEnabled = getAdConfig().isCCTEnabled();
        boolean partialTabsEnabled = getAdConfig().getPartialTabsEnabled();
        C3440gi c3440gi = this.f26956h;
        Va va2 = new Va(z10, str7, zIsCCTEnabled, partialTabsEnabled, c3440gi != null ? c3440gi.f27242m : null);
        Context context = getContext();
        tn.p.j(context, "getContext(...)");
        Rh rh2 = this.U0;
        Th th2 = this.T0;
        if (this.f26950e) {
            za2 = null;
        } else {
            C3440gi c3440gi2 = this.f26956h;
            long j10 = (c3440gi2 == null || (c3795v03 = c3440gi2.f27230a) == null) ? 0L : c3795v03.f28301a;
            String impressionId = getImpressionId();
            String str8 = impressionId == null ? "" : impressionId;
            C3440gi c3440gi3 = this.f26956h;
            za2 = new Za(j10, str8, (c3440gi3 == null || (c3795v02 = c3440gi3.f27230a) == null || (str5 = c3795v02.f28306f) == null) ? "" : str5, (c3440gi3 == null || (c3795v0 = c3440gi3.f27230a) == null || (str4 = c3795v0.f28305e) == null) ? "" : str4, (c3440gi3 == null || (str3 = c3440gi3.f27231b) == null) ? "" : str3, (c3440gi3 == null || (str2 = c3440gi3.f27235f) == null) ? "" : str2, (c3440gi3 == null || (str = c3440gi3.f27233d) == null) ? "" : str, c3440gi3 != null ? c3440gi3.f27237h : false, this.f26952f);
        }
        return new Ua(context, va2, rh2, th2, this, za2, this.f26958i, new WeakReference(this));
    }

    public final void d(String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m9).a(str2, "fireDetectAutoRedirectFraud " + this + com.ironsource.Z7.f30794r + str);
        }
        g("window.mraidview.fireRedirectFraudBeacon('" + str + "')");
    }

    public final void d(JSONObject jSONObject) {
        short s10;
        final String strOptString = jSONObject.optString(IronSourceConstants.EVENTS_ERROR_CODE);
        Object objA = H3.a(new sn.a() { // from class: n9.f6
            @Override // sn.a
            public final Object invoke() {
                return Short.valueOf(GestureDetectorOnGestureListenerC3337ci.l(strOptString));
            }
        });
        if (Result.m7540isSuccessimpl(objA)) {
            short sShortValue = ((Number) objA).shortValue();
            C3589mi c3589mi = this.f26948d0;
            if (c3589mi != null) {
                Map mapA = c3589mi.a();
                switch (sShortValue) {
                    case 101:
                        s10 = 2261;
                        break;
                    case 102:
                        s10 = 2262;
                        break;
                    case 103:
                        s10 = 2263;
                        break;
                    case 104:
                        s10 = 2267;
                        break;
                    case 105:
                        s10 = 2266;
                        break;
                    case 106:
                        s10 = 2265;
                        break;
                    case 107:
                        s10 = 2264;
                        break;
                    default:
                        switch (sShortValue) {
                            case 301:
                                s10 = 2268;
                                break;
                            case 302:
                                s10 = 2269;
                                break;
                            case 303:
                                s10 = 2270;
                                break;
                            case 304:
                                s10 = 2271;
                                break;
                            case 305:
                                s10 = 2272;
                                break;
                            case 306:
                                s10 = 2273;
                                break;
                            case 307:
                                s10 = 2274;
                                break;
                            case 308:
                                s10 = 2275;
                                break;
                            case 309:
                                s10 = 2276;
                                break;
                            case 310:
                                s10 = 2277;
                                break;
                            case 311:
                                s10 = 2278;
                                break;
                            case 312:
                                s10 = 2280;
                                break;
                            case 313:
                                s10 = 2281;
                                break;
                            default:
                                s10 = sShortValue;
                                break;
                        }
                        break;
                }
                mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
                long j10 = c3589mi.f27633c;
                p000do.l0 l0Var = AbstractC3492il.f27361a;
                mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
                Wj wj2 = Wj.f26549a;
                Wj.b("CompanionWebViewLoadFailed", mapA, EnumC3287ak.f26805a);
            }
        }
    }

    public final void d(boolean z10) {
        Hn hn2 = z10 ? Hn.f25626c : Hn.f25625b;
        if (this.I != hn2) {
            if (!this.P) {
                this.I = hn2;
                if (z10) {
                    getListener().j(this);
                }
                c(z10);
                L0 l02 = this.H0;
                if (l02 != null) {
                    Hn hn3 = this.I;
                    tn.p.k(hn3, "adViewableStatus");
                    l02.f25838h = hn3;
                }
                o();
            }
            C3803v8 c3803v8 = this.Y0;
            if (c3803v8 == null || c3803v8.f28341g.get() || !C3803v8.a(c3803v8, new EnumC3728s8[]{EnumC3728s8.f28099c, EnumC3728s8.f28101e, EnumC3728s8.f28102f}, null, null, null, 14) || c3803v8.f28346l == z10) {
                return;
            }
            c3803v8.f28346l = z10;
            if (!z10) {
                if (!c3803v8.f28341g.get() && c3803v8.f28345k.f26007p.isPlaying()) {
                    c3803v8.f28345k.f();
                    N7 n72 = c3803v8.f28345k;
                    EnumC3736sg enumC3736sg = EnumC3736sg.f28126e;
                    n72.getClass();
                    tn.p.k(enumC3736sg, "state");
                    n72.f26011t = enumC3736sg;
                    return;
                }
                return;
            }
            if (c3803v8.f28341g.get()) {
                return;
            }
            N7 n73 = c3803v8.f28345k;
            if (n73.f26011t == EnumC3736sg.f28126e) {
                n73.e();
                N7 n74 = c3803v8.f28345k;
                EnumC3736sg enumC3736sg2 = EnumC3736sg.f28125d;
                n74.getClass();
                tn.p.k(enumC3736sg2, "state");
                n74.f26011t = enumC3736sg2;
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3872y2, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/ci;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53135i, this, motionEvent);
        return safedk_ci_dispatchTouchEvent_57035176a7617922c0477832317fe02d(motionEvent);
    }

    public final void e() {
        WebViewClient webViewClient;
        if (this.f26950e) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
            if (interfaceC3580m9 != null) {
                String str = f26937g1;
                tn.p.j(str, "TAG");
                ((C3605n9) interfaceC3580m9).c(str, "view is in-app browser. Using EmbeddedBrowserViewClient.");
            }
            U5 u52 = new U5("IN_CUSTOM_BROWSER", new sn.a() { // from class: n9.j6
                @Override // sn.a
                public final Object invoke() {
                    return GestureDetectorOnGestureListenerC3337ci.f();
                }
            }, new sn.l() { // from class: n9.k6
                @Override // sn.l
                public final Object invoke(Object obj) {
                    return GestureDetectorOnGestureListenerC3337ci.a((JSONObject) obj);
                }
            }, new sn.p() { // from class: n9.l6
                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public final Object mo2invoke(Object obj, Object obj2) {
                    return GestureDetectorOnGestureListenerC3337ci.a((String) obj, (Map) obj2);
                }
            }, this.f26958i);
            this.D0 = u52;
            webViewClient = u52;
        } else {
            InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
            if (interfaceC3580m92 != null) {
                String str2 = f26937g1;
                tn.p.j(str2, "TAG");
                ((C3605n9) interfaceC3580m92).c(str2, "view is ad. Using RenderViewClient");
            }
            C3363di c3363di = new C3363di(this.f26948d0, this.f26958i, new sn.l() { // from class: n9.m6
                @Override // sn.l
                public final Object invoke(Object obj) {
                    return GestureDetectorOnGestureListenerC3337ci.a(this.f75500b, ((Boolean) obj).booleanValue());
                }
            });
            String adType = getAdType();
            c3363di.f28619b = tn.p.f(adType, "banner") ? getAdConfig().getRendering().getBannerNetworkLoadsLimit() : tn.p.f(adType, "audio") ? getAdConfig().getRendering().getAudioNetworkLoadsLimit() : getAdConfig().getRendering().getOtherNetworkLoadsLimit();
            webViewClient = c3363di;
        }
        setWebViewClient(webViewClient);
    }

    public final void e(String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m9).a(str2, "fireStateChange " + this + com.ironsource.Z7.f30794r + str);
        }
        g("window.mraidview.broadcastEvent('stateChange','" + str + "');");
    }

    public final void e(boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "processDisableCloseRegionRequest " + this + com.ironsource.Z7.f30794r + z10);
        }
        this.J = z10;
        U();
    }

    public final void f(String str) {
        tn.p.k(str, "json");
        if (getAdConfig().getPingsV2Config().getEnabled()) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
            if (interfaceC3580m9 != null) {
                String str2 = f26937g1;
                tn.p.j(str2, "TAG");
                ((C3605n9) interfaceC3580m9).a(str2, "handlePing " + this);
            }
            if (this.f26953f0 == null) {
                this.f26953f0 = new C3386eg(this.f26974q, this.f26948d0);
            }
            C3386eg c3386eg = this.f26953f0;
            tn.p.h(c3386eg);
            c3386eg.getClass();
            tn.p.k(str, "json");
            p000do.i.d(A9.f25148d, null, null, new C3335cg(c3386eg, str, null), 3, null);
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        if (interfaceC3580m92 != null) {
            String str3 = f26937g1;
            tn.p.j(str3, "TAG");
            ((C3605n9) interfaceC3580m92).a(str3, "pings v2 is disabled " + this);
        }
        C3589mi c3589mi = this.f26948d0;
        if (c3589mi != null) {
            tn.p.k("unknown", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Map mapA = c3589mi.a();
            mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2257);
            mapA.put("trigger", "unknown");
            mapA.put("retryCount", String.valueOf(0));
            AbstractC3512jg.a("PingFailed", mapA);
        }
        InterfaceC3309bg interfaceC3309bg = this.f26974q;
        Z5[] z5Arr = Z5.f26686a;
        ((Yh) interfaceC3309bg).a("", -100, "Ping V2 is disabled from SDK config", System.currentTimeMillis(), 0);
    }

    public final void f(boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "processUseCustomCloseRequest " + this + com.ironsource.Z7.f30794r + z10);
        }
        setUseCustomClose(z10);
        U();
    }

    public final void g() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "closeAll " + this);
        }
        InterfaceC3820w0 interfaceC3820w0 = this.f26967m0;
        if (interfaceC3820w0 != null) {
            interfaceC3820w0.b();
        }
        x();
    }

    public final void g(final String str) {
        tn.p.k(str, "js");
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m9).c(str2, "injectJavaScript " + this + " - " + str);
        }
        tn.p.k(str, "value");
        Wb wb2 = (Wb) AbstractC3627o6.f27756e.getValue();
        Runnable runnable = new Runnable() { // from class: n9.y5
            @Override // java.lang.Runnable
            public final void run() {
                GestureDetectorOnGestureListenerC3337ci.d(this.f75703b, str);
            }
        };
        wb2.getClass();
        tn.p.k(runnable, "runnable");
        wb2.f26536a.postAtFrontOfQueue(runnable);
    }

    @NotNull
    public AdConfig getAdConfig() {
        return this.f26966m;
    }

    @Nullable
    public final C3621o0 getAdMetaData() {
        return this.f26964l;
    }

    @Nullable
    public final InterfaceC3820w0 getAdPodHandler() {
        return this.f26967m0;
    }

    @NotNull
    public final L0 getAdQualityManager() {
        L0 l02 = this.H0;
        if (l02 != null) {
            return l02;
        }
        tn.p.C("adQualityManager");
        return null;
    }

    @Nullable
    public String getAdType() {
        return this.f26957h0;
    }

    public final boolean getAllowAutoRedirection() {
        return this.f26965l0;
    }

    public final int getArea() {
        return getHeight() * getWidth();
    }

    @NotNull
    public final WeakReference<Activity> getBannerHolderActivity() {
        return this.f26984v;
    }

    @Nullable
    public final String getBeaconUrl() {
        return this.L0;
    }

    @NotNull
    public final vo getCloseAssetArea() {
        return this.f26949d1;
    }

    public final long getConfiguredArea() {
        return this.f26979s0;
    }

    @NotNull
    public Context getContainerContext() {
        Activity activity = (Activity) this.f26982u.get();
        if (activity != null) {
            return activity;
        }
        Context context = getContext();
        tn.p.j(context, "getContext(...)");
        return context;
    }

    @Nullable
    public final String getContentURL() {
        return this.f26975q0;
    }

    @Nullable
    public final D4 getContextualDataHandler() {
        return this.X0;
    }

    @NotNull
    public final String getCreativeID() {
        String creativeId = getCreativeId();
        return creativeId == null ? "" : creativeId;
    }

    @Nullable
    public String getCreativeId() {
        return this.f26939a0;
    }

    @NotNull
    public final String getCurrentPosition() {
        String string;
        JSONObject jSONObject = this.D;
        return (jSONObject == null || (string = jSONObject.toString()) == null) ? "" : string;
    }

    @NotNull
    public final Object getCurrentPositionMonitor() {
        return this.O;
    }

    @WorkerThread
    public final int getCurrentRenderingPodAdIndex() {
        InterfaceC3820w0 interfaceC3820w0 = this.f26967m0;
        if (interfaceC3820w0 != null) {
            return ((AbstractC3547l1) interfaceC3820w0).n(this);
        }
        return 0;
    }

    @Nullable
    public Object getDataModel() {
        return null;
    }

    @NotNull
    public final String getDefaultPosition() {
        String string;
        JSONObject jSONObject = this.C;
        return (jSONObject == null || (string = jSONObject.toString()) == null) ? "" : string;
    }

    @NotNull
    public final Object getDefaultPositionMonitor() {
        return this.N;
    }

    @Nullable
    public final S5 getEmbeddedBrowserJsCallbacks() {
        return this.E0;
    }

    @Nullable
    public final U getExposureTracker() {
        return this.K0;
    }

    @Nullable
    public Map<View, FriendlyObstructionPurpose> getFriendlyViews() {
        return this.f26959i0;
    }

    @Nullable
    public final Activity getFullScreenActivity() {
        return (Activity) this.f26982u.get();
    }

    @NotNull
    public B getFullScreenEventsListener() {
        return this.f26943b1;
    }

    @Nullable
    public String getImpressionId() {
        return this.f26947d;
    }

    public final byte getImpressionType() {
        return this.f26976r;
    }

    @NotNull
    public final String getLandingScheme() {
        return this.f26952f;
    }

    @NotNull
    public final AbstractC3388ei getListener() {
        AbstractC3388ei abstractC3388ei = this.f26988x;
        if (abstractC3388ei != null) {
            return abstractC3388ei;
        }
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).c(str, "listener getter " + this);
        }
        Lh lh2 = f26936f1;
        this.f26988x = lh2;
        return lh2;
    }

    @Nullable
    public final String getMCreativeType() {
        return this.F0;
    }

    public final int getMImpressionMinPercentageViewed() {
        return this.f26989x0;
    }

    public final int getMImpressionMinTimeViewed() {
        return this.f26987w0;
    }

    @Nullable
    public final Fn getMViewableAd() {
        return this.f26969n0;
    }

    @NotNull
    public String getMarkupType() {
        return this.S0;
    }

    @NotNull
    public final String getMarkupTypeAdUnit() {
        return this.S0;
    }

    @Nullable
    public final C3832wc getMediaProcessor() {
        return this.A;
    }

    public final int getMinimumPixelsPainted() {
        return this.f26981t0;
    }

    @NotNull
    public final String getMraidJsString() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).c(str, "mraidJsString getter " + this);
        }
        Context context = getContext();
        tn.p.j(context, "getContext(...)");
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k("mraid_js_store", "sharePrefFile");
        ConcurrentHashMap concurrentHashMap = Ea.f25372b;
        Ea eaA = Da.a(context, "mraid_js_store");
        tn.p.k("mraid_js_string", "key");
        tn.p.k("mraid_js_string", "key");
        String string = eaA.f25373a.getString("mraid_js_string", null);
        if (string == null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
            if (interfaceC3580m92 != null) {
                String str2 = f26937g1;
                tn.p.j(str2, "TAG");
                ((C3605n9) interfaceC3580m92).a(str2, "Returning default Mraid Js string.");
            }
            return "var imIsObjValid=function(a){return\"undefined\"!=typeof a&&null!=a?!0:!1},EventListeners=function(a){if(\"undefined\"===typeof a)throw Error(\"EventListeners constructor requires an event name\");this.event=a;this.count=0;var b=[];this.shouldRemember=-1!==[\"exposureChange\"].indexOf(a);this.lastArgs=null;this.add=function(a){b.push(a);++this.count;if(this.shouldRemember&&this.lastArgs)try{a.apply({},this.lastArgs)}catch(d){}};this.remove=function(a){var d=!1,f=this;b=b.filter(function(b){if(b=b===a)--f.count,\nd=!0;return!b});return d};this.removeAll=function(){b=[];this.count=0};this.broadcast=function(a){this.shouldRemember&&(this.lastArgs=a);b.forEach(function(d){try{d.apply({},a)}catch(b){}})};this.toString=function(){var c=[a,\":\"];b.forEach(function(d){c.push(\"|\",String(d),\"|\")});return c.join(\"\")}},InmobiObj=function(){this.listeners=[];this.addEventListener=function(a,b){try{if(imIsObjValid(b)&&imIsObjValid(a)){var c=this.listeners;c[a]||(c[a]=new EventListeners(a));c[a].add(b);\"micIntensityChange\"==\na&&window.imraidview.startListeningMicIntensity();\"deviceMuted\"==a&&window.imraidview.startListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&window.imraidview.startListeningDeviceVolumeChange();\"volumeChange\"==a&&window.imraidview.startListeningVolumeChange();\"headphones\"==a&&window.imraidview.startListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&window.imraidview.startListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&window.imraidview.registerDownloaderCallbacks()}}catch(d){this.log(d)}};\nthis.removeEventListener=function(a,b){if(imIsObjValid(a)){var c=this.listeners;imIsObjValid(c[a])&&(imIsObjValid(b)?c[a].remove(b):c[a].removeAll());\"micIntensityChange\"==a&&0==c[a].count&&window.imraidview.stopListeningMicIntensity();\"deviceMuted\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceVolumeChange();\"volumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningVolumeChange();\"headphones\"==\na&&0==c[a].count&&window.imraidview.stopListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&0==c[a].count&&window.imraidview.stopListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&0==c[a].count&&window.imraidview.unregisterDownloaderCallbacks()}};this.broadcastEvent=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)b[c]=arguments[c];c=b.shift();try{var d=this.listeners;d[c]||(d[c]=new EventListeners(c));d[c].broadcast(b)}catch(f){}}};\nthis.sendSaveContentResult=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)if(2==c){var d=arguments[c],d=JSON.parse(d);b[c]=d}else b[c]=arguments[c];d=b[1];\"success\"!=d&&(c=b[0].substring(b[0].indexOf(\"_\")+1),imraid.saveContentIDMap[c]&&delete imraid.saveContentIDMap[c]);window.imraid.broadcastEvent(b[0],b[1],b[2])}}},__im__iosNativeMessageHandler=void 0;\nwindow.webkit&&(window.webkit.messageHandlers&&window.webkit.messageHandlers.nativeMessageHandler)&&(__im__iosNativeMessageHandler=window.webkit.messageHandlers.nativeMessageHandler);\nvar __im__iosNativeCall={nativeCallInFlight:!1,nativeCallQueue:[],executeNativeCall:function(a){this.nativeCallInFlight?this.nativeCallQueue.push(a):(this.nativeCallInFlight=!0,imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=a)},nativeCallComplete:function(a){0==this.nativeCallQueue.length?this.nativeCallInFlight=!1:(a=this.nativeCallQueue.shift(),imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=\na)}},IOSNativeCall=function(){this.urlScheme=\"\";this.executeNativeCall=function(a){if(imIsObjValid(__im__iosNativeMessageHandler)){d={};d.command=a;d.scheme=this.urlScheme;for(var b={},c=1;c<arguments.length;c+=2)f=arguments[c+1],null!=f&&(b[arguments[c]]=\"\"+f);d.params=b}else for(var d=this.urlScheme+\"://\"+a,f,b=!0,c=1;c<arguments.length;c+=2)f=arguments[c+1],null!=f&&(b?(d+=\"?\",b=!1):d+=\"&\",d+=arguments[c]+\"=\"+escape(f));__im__iosNativeCall.executeNativeCall(d);return\"OK\"};this.nativeCallComplete=\nfunction(a){__im__iosNativeCall.nativeCallComplete(a);return\"OK\"};this.updateKV=function(a,b){this[a]=b;var c=this.broadcastMap[a];c&&this.broadcastEvent(c,b)}};\n(function(){var a=window.mraidview={};a.orientationProperties={allowOrientationChange:!0,forceOrientation:\"none\",direction:\"right\"};var b=[],c=!1;a.detectAndBlockFraud=function(d){a.isPossibleFraud()&&a.fireRedirectFraudBeacon(d);return!1};a.popupBlocked=function(d){a.firePopupBlockedBeacon(d)};a.zeroPad=function(d){var a=\"\";10>d&&(a+=\"0\");return a+d};a.supports=function(d){console.log(\"bridge: supports (MRAID)\");if(\"string\"!=typeof d)window.mraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\n\"supports\");else return\"false\"!=sdkController.supports(\"window.mraidview\",d)};a.useCustomClose=function(d){try{sdkController.useCustomClose(\"window.mraidview\",d)}catch(a){imraidview.showAlert(\"use CustomClose: \"+a)}};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(d){imraidview.showAlert(\"close: \"+d)}};a.stackCommands=function(d,a){c?b.push(d):(eval(d),a&&(c=!0))};a.setOrientationProperties=function(d){try{d?(\"undefined\"!=typeof d.allowOrientationChange&&(a.orientationProperties.allowOrientationChange=\nd.allowOrientationChange),\"undefined\"!=typeof d.forceOrientation&&(a.orientationProperties.forceOrientation=d.forceOrientation)):d=null,sdkController.setOrientationProperties(\"window.mraidview\",a.stringify(a.orientationProperties))}catch(b){imraidview.showAlert(\"setOrientationProperties: \"+b+\", props = \"+d)}};a.getOrientationProperties=function(){return{forceOrientation:a.orientationProperties.forceOrientation,allowOrientationChange:a.orientationProperties.allowOrientationChange}};a.resizeProps=null;\na.open=function(d){\"undefined\"==typeof d&&(d=null);try{sdkController.open(\"window.mraidview\",d)}catch(a){imraidview.showAlert(\"open: \"+a)}};a.getScreenSize=function(){try{return eval(\"(\"+sdkController.getScreenSize(\"window.mraidview\")+\")\")}catch(d){imraidview.showAlert(\"getScreenSize: \"+d)}};a.getMaxSize=function(){try{return eval(\"(\"+sdkController.getMaxSize(\"window.mraidview\")+\")\")}catch(d){imraidview.showAlert(\"getMaxSize: \"+d)}};a.getCurrentPosition=function(){try{return eval(\"(\"+sdkController.getCurrentPosition(\"window.mraidview\")+\n\")\")}catch(d){imraidview.showAlert(\"getCurrentPosition: \"+d)}};a.getDefaultPosition=function(){try{return eval(\"(\"+sdkController.getDefaultPosition(\"window.mraidview\")+\")\")}catch(d){imraidview.showAlert(\"getDefaultPosition: \"+d)}};a.getState=function(){try{return String(sdkController.getState(\"window.mraidview\"))}catch(d){imraidview.showAlert(\"getState: \"+d)}};a.isViewable=function(){if(imraidview.fallbackViewabilityEnabled())return imraidview.checkFallbackViewable();try{return sdkController.isViewable(\"window.mraidview\")}catch(d){imraidview.showAlert(\"isViewable: \"+\nd)}};a.getPlacementType=function(){return sdkController.getPlacementType(\"window.mraidview\")};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(d){imraidview.showAlert(\"close: \"+d)}};\"function\"!=typeof String.prototype.startsWith&&(String.prototype.startsWith=function(d){return 0==this.indexOf(d)});a.playVideo=function(d){var a=\"\";null!=d&&(a=d);try{sdkController.playVideo(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"playVideo: \"+b)}};a.stringify=function(d){if(\"undefined\"===\ntypeof JSON){var b=\"\",c;if(\"undefined\"==typeof d.length)return a.stringifyArg(d);for(c=0;c<d.length;c++)0<c&&(b+=\",\"),b+=a.stringifyArg(d[c]);return b+\"]\"}return JSON.stringify(d)};a.stringifyArg=function(a){var b,c,e;c=typeof a;b=\"\";if(\"number\"===c||\"boolean\"===c)b+=args;else if(a instanceof Array)b=b+\"[\"+a+\"]\";else if(a instanceof Object){c=!0;b+=\"{\";for(e in a)null!==a[e]&&(c||(b+=\",\"),b=b+'\"'+e+'\":',c=typeof a[e],b=\"number\"===c||\"boolean\"===c?b+a[e]:\"function\"===typeof a[e]?b+'\"\"':a[e]instanceof\nObject?b+this.stringify(args[i][e]):b+'\"'+a[e]+'\"',c=!1);b+=\"}\"}else a=a.replace(/\\\\/g,\"\\\\\\\\\"),a=a.replace(/\"/g,'\\\\\"'),b=b+'\"'+a+'\"';imraidview.showAlert(\"json:\"+b);return b};getPID=function(a){var b=\"\";null!=a&&(\"undefined\"!=typeof a.id&&null!=a.id)&&(b=a.id);return b};a.storePicture=function(d){console.log(\"bridge: storePicture\");if(\"string\"!=typeof d)window.mraid.broadcastEvent(\"error\",\"storePicture method expects url as string parameter\",\"storePicture\");else{if(a.supports(\"storePicture\"))return!window.confirm(\"Do you want to download the file?\")?\n(window.mraid.broadcastEvent(\"error\",\"Store picture on \"+d+\" was cancelled by user.\",\"storePicture\"),!1):sdkController.storePicture(\"window.mraidview\",d);window.mraid.broadcastEvent(\"error\",\"Store picture on \"+d+\" was cancelled because it is unsupported in this device/app.\",\"storePicture\")}};a.fireMediaTrackingEvent=function(a,b){};a.fireMediaErrorEvent=function(a,b){};a.fireMediaTimeUpdateEvent=function(a,b,c){};a.fireMediaCloseEvent=function(a,b,c){};a.fireMediaVolumeChangeEvent=function(a,b,c){};\na.broadcastEvent=function(){window.mraid.broadcastEvent.apply(window.mraid,arguments)};a.unload=function(){try{sdkController.unload(\"window.mraidview\")}catch(a){}};a.getCurrentAppOrientation=function(){var d;switch(a.orientation){case 0:case 180:d=\"portrait\";break;case 90:case 270:d=\"landscape\";break;default:d=\"none\"}return{orientation:d,locked:!1}};a.expand=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.expand(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"executeNativeExpand: \"+\nb+\", URL = \"+a)}};a.setExpandProperties=function(d){try{d?this.props=d:d=null;if(\"undefined\"!=typeof d.lockOrientation&&null!=d.lockOrientation&&\"undefined\"!=typeof d.orientation&&null!=d.orientation){var b={};b.allowOrientationChange=!d.lockOrientation;b.forceOrientation=d.orientation;a.setOrientationProperties(b)}sdkController.setExpandProperties(\"window.mraidview\",a.stringify(d))}catch(c){imraidview.showAlert(\"executeNativesetExpandProperties: \"+c+\", props = \"+d)}};a.getExpandProperties=function(){try{return eval(\"(\"+\nsdkController.getExpandProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getExpandProperties: \"+a)}};a.resizeProps=null;a.setResizeProperties=function(d){var b,c;try{b=parseInt(d.width);c=parseInt(d.height);if(isNaN(b)||isNaN(c)||1>b||1>c)throw\"Invalid\";d.width=b;d.height=c;a.resizeProps=d;sdkController.setResizeProperties(\"window.mraidview\",a.stringify(d))}catch(e){window.mraid.broadcastEvent(\"error\",\"Invalid properties.\",\"setResizeProperties\")}};a.getResizeProperties=function(){try{return eval(\"(\"+\nsdkController.getResizeProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getResizeProperties: \"+a)}};a.resize=function(){if(null==a.resizeProps)window.mraid.broadcastEvent(\"error\",\"Valid resize dimensions must be provided before calling resize\",\"resize\");else try{sdkController.resize(\"window.mraidview\")}catch(d){imraidview.showAlert(\"resize called in bridge\")}}})();\n(function(){var a=window.mraid=new InmobiObj,b=window.mraidview,c=!1;b.isAdShownToUser=!1;b.onUserInteraction=function(){imraidview.onUserInteraction();c=!0};b.isPossibleFraud=function(){return a.supports(\"redirectFraudDetection\")&&(!b.isAdShownToUser||!c)};b.fireRedirectFraudBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var f={};f.trigger=a;f.isAdShown=b.isAdShownToUser.toString();inmobi.recordEvent(135,f)}};b.getSdkVersionInt=function(){for(var a=imraid.getSdkVersion().split(\".\"),\nb=a.length,c=\"\",e=0;e<b;e++)c+=a[e];return parseInt(c)};b.firePopupBlockedBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var b={};b.trigger=a;inmobi.recordEvent(136,b)}};window.onbeforeunload=function(){b.detectAndBlockFraud(\"redirect\")};a.addEventListener(\"viewableChange\",function(a){a&&!b.isAdShownToUser&&(b.isAdShownToUser=!0)});a.useCustomClose=b.useCustomClose;a.close=b.close;a.getExpandProperties=function(){if(1083<=b.getSdkVersionInt())return window.mraid.broadcastEvent(\"error\",\n\"Method not supported\",\"getExpandProperties\"),null;window.mraid.broadcastEvent(\"error\",\"MRAID getExpandProperties is deprecated\",\"getExpandProperties\");return b.getExpandProperties()};a.setExpandProperties=function(d){1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"setExpandProperties\"):(\"undefined\"!=typeof d&&(\"useCustomClose\"in d&&\"undefined\"!=typeof a.getState()&&\"expanded\"!=a.getState())&&a.useCustomClose(d.useCustomClose),window.mraid.broadcastEvent(\"error\",\n\"MRAID setExpandProperties is deprecated\",\"setExpandProperties\"),b.setExpandProperties(d))};a.getResizeProperties=function(){if(1083<=b.getSdkVersionInt())return window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"getResizeProperties\"),null;window.mraid.broadcastEvent(\"error\",\"MRAID getResizeProperties is deprecated\",\"getResizeProperties\");return b.getResizeProperties()};a.setResizeProperties=function(a){1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"Method not supported\",\n\"setResizeProperties\"):(window.mraid.broadcastEvent(\"error\",\"MRAID setResizeProperties is deprecated\",\"setResizeProperties\"),b.setResizeProperties(a))};a.getOrientationProperties=b.getOrientationProperties;a.setOrientationProperties=b.setOrientationProperties;a.expand=function(a){try{1083<=b.getSdkVersionInt()?\"string\"===typeof a&&\"\"!==a.trim()?b.open(a):window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"expand\"):(window.mraid.broadcastEvent(\"error\",\"MRAID expand is deprecated\",\"expand\"),\nb.expand(a))}catch(f){window.mraid.broadcastEvent(\"error\",\"error\",\"expand\")}};a.getMaxSize=b.getMaxSize;a.getState=b.getState;a.isViewable=b.isViewable;a.createCalendarEvent=function(a){window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"createCalendarEvent\")};a.open=function(d){b.detectAndBlockFraud(\"mraid.open\")||(\"string\"!=typeof d?a.broadcastEvent(\"error\",\"URL is required.\",\"open\"):b.open(d))};a.resize=function(){try{1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"MRAID resize not supported\",\n\"resize\"):(window.mraid.broadcastEvent(\"error\",\"MRAID resize is deprecated\",\"resize\"),b.expand())}catch(a){window.mraid.broadcastEvent(\"error\",\"error\",\"expand\")}};a.getVersion=function(){return\"3.0\"};a.getPlacementType=b.getPlacementType;a.playVideo=function(a){b.playVideo(a)};a.getScreenSize=b.getScreenSize;a.getCurrentPosition=b.getCurrentPosition;a.getDefaultPosition=b.getDefaultPosition;a.supports=function(a){return b.supports(a)};a.storePicture=function(d){\"string\"!=typeof d?a.broadcastEvent(\"error\",\n\"Request must specify a valid URL\",\"storePicture\"):b.storePicture(d)};a.unload=function(){b.unload()};a.getCurrentAppOrientation=b.getCurrentAppOrientation;a.getLocation=function(){return null};a.getAudioVolume=b.getAudioVolume})();\n(function(){var a=window.imraidview={},b=!1,c={RESUME:\"resume\",PAUSE:\"pause\",MUTE:\"mute\",UNMUTE:\"unmute\",SHOW:\"show\",HIDE:\"hide\",SKIP:\"skip\"};a.setOrientationProperties=function(d){try{d?(\"undefined\"!=typeof d.allowOrientationChange&&(mraidview.orientationProperties.allowOrientationChange=d.allowOrientationChange),\"undefined\"!=typeof d.forceOrientation&&(mraidview.orientationProperties.forceOrientation=d.forceOrientation),\"undefined\"!=typeof d.direction&&(mraidview.orientationProperties.direction=\nd.direction)):d=null,sdkController.setOrientationProperties(\"window.imraidview\",mraidview.stringify(mraidview.orientationProperties))}catch(b){a.showAlert(\"setOrientationProperties: \"+b+\", props = \"+d)}};a.getOrientationProperties=function(){return mraidview.orientationProperties};a.firePostStatusEvent=function(a){window.imraid.broadcastEvent(\"postStatus\",a)};a.fireMediaTrackingEvent=function(a,b){var c={};c.name=a;var e=\"inmobi_media_\"+a;\"undefined\"!=typeof b&&(null!=b&&\"\"!=b)&&(e=e+\"_\"+b);window.imraid.broadcastEvent(e,\nc)};a.fireMediaErrorEvent=function(a,b){var c={name:\"error\"};c.code=b;var e=\"inmobi_media_\"+c.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(e=e+\"_\"+a);window.imraid.broadcastEvent(e,c)};a.fireMediaTimeUpdateEvent=function(a,b,c){var e={name:\"timeupdate\",target:{}};e.target.currentTime=b;e.target.duration=c;b=\"inmobi_media_\"+e.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,e)};a.saveContent=function(a,b,c){window.imraid.addEventListener(\"saveContent_\"+a,c);\nsdkController.saveContent(\"window.imraidview\",a,b)};a.cancelSaveContent=function(a){sdkController.cancelSaveContent(\"window.imraidview\",a)};a.disableCloseRegion=function(a){sdkController.disableCloseRegion(\"window.imraidview\",a)};a.fireGalleryImageSelectedEvent=function(a,b,c){var e=new Image;e.src=\"data:image/jpeg;base64,\"+a;e.width=b;e.height=c;window.imraid.broadcastEvent(\"galleryImageSelected\",e)};a.fireCameraPictureCatpturedEvent=function(a,b,c){var e=new Image;e.src=\"data:image/jpeg;base64,\"+\na;e.width=b;e.height=c;window.imraid.broadcastEvent(\"cameraPictureCaptured\",e)};a.fireMediaCloseEvent=function(a,b,c){var e={name:\"close\"};e.viaUserInteraction=b;e.target={};e.target.currentTime=c;b=\"inmobi_media_\"+e.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,e)};a.fireMediaVolumeChangeEvent=function(a,b,c){var e={name:\"volumechange\",target:{}};e.target.volume=b;e.target.muted=c;b=\"inmobi_media_\"+e.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+\na);window.imraid.broadcastEvent(b,e)};a.fireDeviceMuteChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceMuted\",a)};a.fireDeviceVolumeChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceVolumeChange\",a)};a.fireHeadphonePluggedEvent=function(a){window.imraid.broadcastEvent(\"headphones\",a)};a.showAlert=function(a){sdkController.showAlert(\"window.imraidview\",a)};a.openExternal=function(d,b){try{600<=getSdkVersionInt()?sdkController.openExternal(\"window.imraidview\",d,b):sdkController.openExternal(\"window.imraidview\",\nd)}catch(c){a.showAlert(\"openExternal: \"+c)}};a.log=function(b){try{sdkController.log(\"window.imraidview\",b)}catch(c){a.showAlert(\"log: \"+c)}};a.getPlatform=function(){return\"android\"};a.asyncPing=function(b){try{sdkController.asyncPing(\"window.imraidview\",b)}catch(c){a.showAlert(\"asyncPing: \"+c)}};a.startListeningDeviceMuteEvents=function(){sdkController.registerDeviceMuteEventListener(\"window.imraidview\")};a.stopListeningDeviceMuteEvents=function(){sdkController.unregisterDeviceMuteEventListener(\"window.imraidview\")};\na.startListeningDeviceVolumeChange=function(){sdkController.registerDeviceVolumeChangeEventListener(\"window.imraidview\")};a.stopListeningDeviceVolumeChange=function(){sdkController.unregisterDeviceVolumeChangeEventListener(\"window.imraidview\")};a.startListeningHeadphonePluggedEvents=function(){sdkController.registerHeadphonePluggedEventListener(\"window.imraidview\")};a.stopListeningHeadphonePluggedEvents=function(){sdkController.unregisterHeadphonePluggedEventListener(\"window.imraidview\")};getSdkVersionInt=\nfunction(){for(var b=a.getSdkVersion().split(\".\"),c=b.length,g=\"\",e=0;e<c;e++)g+=b[e];return parseInt(g)};a.getSdkVersionInt=getSdkVersionInt;a.getSdkVersion=function(){return window._im_imaiview.getSdkVersion()};a.supports=function(a){console.log(\"bridge: supports (IMRAID)\");if(\"string\"!=typeof a)window.imraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\"supports\");else return\"false\"!=sdkController.supports(\"window.imraidview\",a)};a.postToSocial=function(b,c,g,e){window.imraid.broadcastEvent(\"error\",\n\"Method not supported\",\"postToSocial\");a.log(\"Method postToSocial not supported\")};a.incentCompleted=function(a){if(\"object\"!=typeof a||null==a)sdkController.incentCompleted(\"window.imraidview\",null);else try{sdkController.incentCompleted(\"window.imraidview\",JSON.stringify(a))}catch(b){sdkController.incentCompleted(\"window.imraidview\",null)}};a.getOrientation=function(){try{return String(sdkController.getOrientation(\"window.imraidview\"))}catch(b){a.showAlert(\"getOrientation: \"+b)}};a.acceptAction=\nfunction(b){try{sdkController.acceptAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"acceptAction: \"+c+\", params = \"+b)}};a.rejectAction=function(b){try{sdkController.rejectAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"rejectAction: \"+c+\", params = \"+b)}};a.updateToPassbook=function(b){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"updateToPassbook\");a.log(\"Method not supported\")};a.isDeviceMuted=function(){return\"false\"!=sdkController.isDeviceMuted(\"window.imraidview\")};\na.getDeviceVolume=function(){return 603>=getSdkVersionInt()?-1:sdkController.getDeviceVolume(\"window.imraidview\")};a.isHeadPhonesPlugged=function(){return\"false\"!=sdkController.isHeadphonePlugged(\"window.imraidview\")};a.sendSaveContentResult=function(){window.imraid.sendSaveContentResult.apply(window.imraid,arguments)};a.broadcastEvent=function(){window.imraid.broadcastEvent.apply(window.imraid,arguments)};a.disableBackButton=function(a){void 0==a||\"boolean\"!=typeof a?console.log(\"disableBackButton called with invalid params\"):\nsdkController.disableBackButton(\"window.imraidview\",a)};a.isBackButtonDisabled=function(){return sdkController.isBackButtonDisabled(\"window.imraidview\")};a.startListeningForBackButtonPressedEvent=function(){sdkController.registerBackButtonPressedEventListener(\"window.imraidview\")};a.stopListeningForBackButtonPressedEvent=function(){sdkController.unregisterBackButtonPressedEventListener(\"window.imraidview\")};a.hideStatusBar=function(){};a.setOpaqueBackground=function(){};a.startDownloader=function(a,\nb,c){682<=getSdkVersionInt()&&sdkController.startDownloader(\"window.imraidview\",a,b,c)};a.registerDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.registerDownloaderCallbacks(\"window.imraidview\")};a.unregisterDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.unregisterDownloaderCallbacks(\"window.imraidview\")};a.getDownloadProgress=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadProgress(\"window.imraidview\"):-1};a.getDownloadStatus=function(){return 682<=\ngetSdkVersionInt()?sdkController.getDownloadStatus(\"window.imraidview\"):-1};a.fireEvent=function(a){700<=getSdkVersionInt()&&(\"fireSkip\"===a?sdkController.fireSkip(\"window.imraidview\"):\"fireComplete\"===a?sdkController.fireComplete(\"window.imraidview\"):\"showEndCard\"===a&&sdkController.showEndCard(\"window.imraidview\"))};a.saveBlob=function(a){700<=getSdkVersionInt()&&sdkController.saveBlob(\"window.imraidview\",a)};a.getBlob=function(a,b){700<=getSdkVersionInt()&&sdkController.getBlob(a,b)};a.setCloseEndCardTracker=\nfunction(a){700<=getSdkVersionInt()&&sdkController.setCloseEndCardTracker(\"window.imraidview\",a)};a.getRenderableAdIndexes=function(){try{if(917<=getSdkVersionInt())return sdkController.getRenderableAdIndexes(\"window.imraidview\")}catch(a){}return\"[]\"};a.getCurrentRenderingIndex=function(){try{if(917<=getSdkVersionInt())return sdkController.getCurrentRenderingIndex(\"window.imraidview\")}catch(a){}return-1};a.showAd=function(a){try{917<=getSdkVersionInt()&&sdkController.showAd(\"window.imraidview\",a)}catch(b){}};\na.timeSinceShow=function(){try{if(917<=getSdkVersionInt())return sdkController.timeSinceShow(\"window.imraidview\")}catch(a){}return-1};a.getShowTimeStamp=function(){try{if(917<=getSdkVersionInt())return sdkController.getShowTimeStamp(\"window.imraidview\")}catch(a){}return-1};a.closeAll=function(){try{917<=getSdkVersionInt()&&sdkController.closeAll(\"window.imraidview\")}catch(a){}};a.loadAd=function(a){try{917<=getSdkVersionInt()&&sdkController.loadAd(\"window.imraidview\",a)}catch(b){}};a.setAdContext=\nfunction(a){try{917<=getSdkVersionInt()&&sdkController.setAdContext(\"window.imraidview\",a)}catch(b){}};a.getAdContext=function(){try{if(917<=getSdkVersionInt())return sdkController.getAdContext(\"window.imraidview\")}catch(a){}return\"\"};a.openWithoutTracker=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.openWithoutTracker(\"window.imraidview\",a)}catch(b){}};a.impressionRendered=function(){window.imraid.broadcastEvent(\"impressionRendered\")};a.customExpandInNative=function(a,b,c){try{void 0==\na||\"string\"!=typeof a?console.log(\"url called with invalid params\"):void 0==b||\"number\"!=typeof b?console.log(\"screenPercentage called with invalid params\"):void 0==c||\"boolean\"!=typeof c?console.log(\"hideCloseButton called with invalid params\"):sdkController.customExpandInNative(\"window.imraidview\",a,b,c)}catch(e){}};a.customExpand=function(b,c,g,e,h){try{void 0==g||\"number\"!=typeof g?console.log(\"screenPercentage called with invalid params\"):void 0==c||\"number\"!=typeof c?console.log(\"inputType called with invalid params\"):\nvoid 0==e||\"boolean\"!=typeof e?console.log(\"topNavBarVisible called with invalid params\"):void 0==h||\"boolean\"!=typeof h?console.log(\"bottomNavBarVisible called with invalid params\"):sdkController.customExpand(\"window.imraidview\",b,c,g,e,h)}catch(k){a.showAlert(\"executeNativeCustomExpand: \"+k+\", input = \"+b+\", inputType = \"+c+\", screenPercentage = \"+g+\", bottomNavBarVisible = \"+h+\", topNavBarVisible = \"+e)}};a.closeCustomExpand=function(){try{sdkController.closeCustomExpand(\"window.imraidview\")}catch(a){}};\na.onGestureDetected=function(a,b){window.imraid.broadcastEvent(\"onGestureDetected\",a,b)};a.onUserLandingCompleted=function(){window.imraid.broadcastEvent(\"onUserLandingCompleted\")};a.onUserInteraction=function(){window.imraid.broadcastEvent(\"onUserInteraction\")};a.impressionFired=function(){try{sdkController.impressionFired(\"window.imraidview\")}catch(a){}};a.getMaxDeviceVolume=function(){try{return sdkController.getMaxDeviceVolume(\"window.imraidview\")}catch(a){return 15}};a.zoom=function(a){try{sdkController.zoom(\"window.imraidview\",\na)}catch(b){}};a.onAudioStateChanged=function(a){try{sdkController.onAudioStateChanged(\"window.imraidview\",a)}catch(b){}};a.submitAdReport=function(a){try{sdkController.submitAdReport(\"window.imraidview\",void 0!=a.adQualityUrl?a.adQualityUrl:null,void 0!=a.enableUserAdReportScreenshot?a.enableUserAdReportScreenshot:null,void 0!=a.templateInfo?a.templateInfo:null)}catch(b){}};a.logTelemetryEvent=function(a){try{var b=void 0!=a.eventType?a.eventType:null,c=void 0!=a.payload?a.payload:null;a=null;null!=\nc&&(a=mraidview.stringify(c));sdkController.logTelemetryEvent(\"window.imraidview\",b,a)}catch(e){}};a.onUserAudioMuteInteraction=function(a){try{sdkController.onUserAudioMuteInteraction(\"window.imraidview\",a)}catch(b){}};a.enableFallbackViewabilityFunctionality=function(){b=!0;a.checkFallbackViewable()&&window.mraid.broadcastEvent(\"viewableChange\",!0);mraid.addEventListener(\"sizeChange\",function(){window.mraid.broadcastEvent(\"viewableChange\",a.checkFallbackViewable())})};a.checkFallbackViewable=function(){try{var b=\nmraidview.getCurrentPosition(),c=b.height;return 40<=b.width&&40<=c?!0:!1}catch(g){a.showAlert(\"checkFallbackViewable: \"+g)}};a.fallbackViewabilityEnabled=function(){return b};a.getSafeArea=function(){try{return JSON.parse(sdkController.getSafeArea(\"window.imraidview\"))}catch(a){return null}};a.loadWebView=function(b,c){try{\"string\"!==typeof b?a.showAlert(\"loadWebView: id parameter should be a string\"):\"string\"!==typeof c?a.showAlert(\"loadWebView: html parameter should be a string\"):sdkController.loadWebView(\"window.imraidview\",\nb,c)}catch(g){a.showAlert(\"loadWebView: \"+g)}};a.showWebView=function(b){try{\"string\"!==typeof b?a.showAlert(\"showWebView: id parameter should be a string\"):sdkController.showWebView(\"window.imraidview\",b)}catch(c){a.showAlert(\"showWebView: \"+c)}};a.sendMessage=function(b,c){try{\"string\"!==typeof b?a.showAlert(\"sendMessage: id parameter should be a string\"):\"string\"!==typeof c?a.showAlert(\"sendMessage: message parameter should be a string\"):sdkController.sendMessage(\"window.imraidview\",b,c)}catch(g){a.showAlert(\"sendMessage: \"+\ng)}};a.destroyWebView=function(b){try{\"string\"!==typeof b?a.showAlert(\"destroyWebView: id parameter should be a string\"):sdkController.destroyWebView(\"window.imraidview\",b)}catch(c){a.showAlert(\"destroyWebView: \"+c)}};a.pingV2=function(b){if(\"object\"===typeof b&&null!==b)try{sdkController.pingV2(\"window.imraidview\",JSON.stringify(b))}catch(c){a.showAlert(\"pingV2: \"+c)}else a.showAlert(\"pingV2: pingJson is not a valid JSON object\")};a.enableNativeGestures=function(b){try{\"boolean\"!==typeof b?a.log(\"enableNativeGestures: 'enabled' must be a boolean.\"):\nsdkController.enableNativeGestures(\"window.imraidview\",b)}catch(c){a.showAlert(\"enableNativeGestures: \"+c)}};a.enableTouchBeginCallback=function(b){try{\"boolean\"!==typeof b?a.log(\"enableTouchEndCallback: 'enabled' must be a boolean.\"):sdkController.enableTouchBeginCallback(\"window.imraidview\",b)}catch(c){a.showAlert(\"enableTouchBeginCallback: \"+c)}};a.enableTouchEndCallback=function(b){try{\"boolean\"!==typeof b?a.log(\"enableTouchEndCallback: 'enabled' must be a boolean.\"):sdkController.enableTouchEndCallback(\"window.imraidview\",\nb)}catch(c){a.showAlert(\"enableTouchEndCallback: \"+c)}};a.createVideoPlayer=function(b){try{sdkController.createVideoPlayer(\"window.imraidview\",JSON.stringify(b))}catch(c){a.showAlert(\"createVideoPlayer: \"+c)}};a.updateVideoPosition=function(b){try{sdkController.updateVideoPosition(\"window.imraidview\",JSON.stringify(b))}catch(c){a.showAlert(\"updateVideoPosition: \"+c)}};a.executeVideoPlayerActions=function(b,f){try{if(!Object.values(c).includes(b))throw Error(\"Invalid videoCommand\");sdkController.executeVideoPlayerActions(\"window.imraidview\",\nb,JSON.stringify(f))}catch(g){a.showAlert(\"executeVideoPlayerActions: \"+g)}};a.getPlaybackState=function(){try{return sdkController.getPlaybackState(\"window.imraidview\")}catch(b){return a.showAlert(\"getPlaybackState: \"+b),null}};a.destroyVideoPlayer=function(){try{sdkController.destroyVideoPlayer(\"window.imraidview\")}catch(b){a.showAlert(\"destroyVideoPlayer: \"+b)}}})();\n(function(){var a=window.imraid=new InmobiObj,b=window.imraidview;a.getOrientation=b.getOrientation;a.setOrientationProperties=b.setOrientationProperties;a.getOrientationProperties=b.getOrientationProperties;a.saveContentIDMap={};a.saveContent=function(c,f,g){var e=arguments.length,h,k=null;if(3>e){if(\"function\"===typeof arguments[e-1])h=arguments[e-1];else return;k={reason:1}}else a.saveContentIDMap[c]&&(h=arguments[2],k={reason:11,url:arguments[1]});\"function\"!==!h&&(k?(window.imraid.addEventListener(\"saveContent_failed_\"+\nc,h),window.imraid.sendSaveContentResult(\"saveContent_failed_\"+c,\"failed\",JSON.stringify(k))):(a.removeEventListener(\"saveContent_\"+c),a.saveContentIDMap[c]=!0,b.saveContent(c,f,g)))};a.cancelSaveContent=function(a){b.cancelSaveContent(a)};a.asyncPing=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"asyncPing\"):b.asyncPing(c)};a.disableCloseRegion=b.disableCloseRegion;a.getSdkVersion=b.getSdkVersion;a.log=function(c){\"undefined\"==typeof c?a.broadcastEvent(\"error\",\"message is required.\",\n\"log\"):\"string\"==typeof c?b.log(c):b.log(JSON.stringify(c))};a.getInMobiAIVersion=function(){return\"2.0\"};a.getVendorName=function(){return\"inmobi\"};a.openExternal=function(a,c){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imraid.openExternal\")||b.openExternal(a,c)};a.updateToPassbook=function(c){mraidview.detectAndBlockFraud(\"imraid.updateToPassbook\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"updateToPassbook\"):\nb.updateToPassbook(c))};a.postToSocial=function(a,c,g,e){mraidview.detectAndBlockFraud(\"imraid.postToSocial\")||b.postToSocial(a,c,g,e)};a.getPlatform=b.getPlatform;a.incentCompleted=b.incentCompleted;a.loadSKStore=b.loadSKStore;a.showSKStore=function(a){mraidview.detectAndBlockFraud(\"imraid.showSKStore\")||b.showSKStore(a)};a.pingV2=b.pingV2;a.enableHitTest=b.enableHitTest;a.enableNativeGestures=b.enableNativeGestures;a.enableTouchBeginCallback=b.enableTouchBeginCallback;a.enableTouchEndCallback=b.enableTouchEndCallback;\na.skoverlay=b.skoverlay;a.skoverlayWithSkan=b.skoverlayWithSkan;a.zoom=b.zoom;a.dismissSKOverlay=b.dismissSKOverlay;a.supports=function(a){return b.supports(a)};a.isDeviceMuted=function(){return!imIsObjValid(a.listeners.deviceMuted)?-1:b.isDeviceMuted()};a.isHeadPhonesPlugged=function(){return!imIsObjValid(a.listeners.headphones)?!1:b.isHeadPhonesPlugged()};a.getDeviceVolume=function(){return b.getDeviceVolume()};a.setDeviceVolume=function(a){b.setDeviceVolume(a)};a.hideStatusBar=function(){b.hideStatusBar()};\na.setOpaqueBackground=function(){b.setOpaqueBackground()};a.getRenderableAdIndexes=b.getRenderableAdIndexes;a.getCurrentRenderingIndex=b.getCurrentRenderingIndex;a.showAd=b.showAd;a.timeSinceShow=b.timeSinceShow;a.closeAll=b.closeAll;a.loadAd=b.loadAd;a.setAdContext=b.setAdContext;a.getAdContext=b.getAdContext;a.getShowTimeStamp=b.getShowTimeStamp;a.disableBackButton=b.disableBackButton;a.isBackButtonDisabled=b.isBackButtonDisabled;a.startDownloader=b.startDownloader;a.getDownloadProgress=b.getDownloadProgress;\na.getDownloadStatus=b.getDownloadStatus;a.fireEvent=b.fireEvent;a.saveBlob=b.saveBlob;a.getBlob=b.getBlob;a.setCloseEndCardTracker=b.setCloseEndCardTracker;a.openWithoutTracker=b.openWithoutTracker;a.impressionRendered=b.impressionRendered;a.onGestureDetected=b.onGestureDetected;a.onUserLandingCompleted=b.onUserLandingCompleted;a.customExpand=b.customExpand;a.closeCustomExpand=b.closeCustomExpand;a.customExpandInNative=b.customExpandInNative;a.impressionFired=b.impressionFired;a.getImraidVersion=\nb.getImraidVersion;a.getMaxDeviceVolume=b.getMaxDeviceVolume;a.onAudioStateChanged=b.onAudioStateChanged;a.onUserAudioMuteInteraction=b.onUserAudioMuteInteraction;a.submitAdReport=b.submitAdReport;a.enableFallbackViewabilityFunctionality=b.enableFallbackViewabilityFunctionality;a.logTelemetryEvent=b.logTelemetryEvent;a.getSafeArea=b.getSafeArea;a.onReceviedSKANCallback=b.onReceviedSKANCallback;a.getOpenMode=b.getOpenMode;a.loadWebView=b.loadWebView;a.showWebView=b.showWebView;a.sendMessage=b.sendMessage;\na.destroyWebView=b.destroyWebView;a.createVideoPlayer=function(a){b.createVideoPlayer(a)};a.updateVideoPosition=function(a){b.updateVideoPosition(a)};a.executeVideoPlayerActions=function(a,c){b.executeVideoPlayerActions(a,c)};a.getPlaybackState=function(){return b.getPlaybackState()};a.destroyVideoPlayer=function(){b.destroyVideoPlayer()};try{a.addEventListener(\"onUserLandingCompleted\",function(){1080>b.getSdkVersionInt()&&a.broadcastEvent(\"onUserLandingInitialized\")})}catch(c){}})();\n(function(){var a=window._im_imaiview={ios:{}};window.imaiview=a;a.broadcastEvent=function(){for(var a=Array(arguments.length),c=0;c<arguments.length;c++)a[c]=arguments[c];c=a.shift();try{window.mraid.broadcastEvent(c,a)}catch(d){}};a.getPlatform=function(){return\"android\"};a.getPlatformVersion=function(){return sdkController.getPlatformVersion(\"window.imaiview\")};a.log=function(a){sdkController.log(\"window.imaiview\",a)};a.openEmbedded=function(a){sdkController.openEmbedded(\"window.imaiview\",a)};\na.openExternal=function(a,c){600<=getSdkVersionInt()?sdkController.openExternal(\"window.imaiview\",a,c):sdkController.openExternal(\"window.imaiview\",a)};a.ping=function(a,c){sdkController.ping(\"window.imaiview\",a,c)};a.pingInWebView=function(a,c){sdkController.pingInWebView(\"window.imaiview\",a,c)};a.getSdkVersion=function(){try{var a=sdkController.getSdkVersion(\"window.imaiview\");if(\"string\"==typeof a&&null!=a)return a}catch(c){return\"3.7.0\"}};a.onUserInteraction=function(a){if(\"object\"!=typeof a||\nnull==a)sdkController.onUserInteraction(\"window.imaiview\",null);else try{sdkController.onUserInteraction(\"window.imaiview\",JSON.stringify(a))}catch(c){sdkController.onUserInteraction(\"window.imaiview\",null)}};a.fireAdReady=function(){sdkController.fireAdReady(\"window.imaiview\")};a.fireAdFailed=function(){sdkController.fireAdFailed(\"window.imaiview\")};a.broadcastEvent=function(){window.imai.broadcastEvent.apply(window.imai,arguments)}})();\n(function(){var a=window._im_imaiview;window._im_imai=new InmobiObj;window._im_imai.ios=new InmobiObj;var b=window._im_imai;window.imai=window._im_imai;b.matchString=function(a,b){if(\"string\"!=typeof a||null==a||null==b)return-1;var f=-1;try{f=a.indexOf(b)}catch(g){}return f};b.isHttpUrl=function(a){return\"string\"!=typeof a||null==a?!1:0==b.matchString(a,\"http://\")?!0:0==b.matchString(a,\"https://\")?!0:!1};b.appendTapParams=function(a,d,f){if(!imIsObjValid(d)||!imIsObjValid(f))return a;b.isHttpUrl(a)&&\n(a=-1==b.matchString(a,\"?\")?a+(\"?u-tap-o=\"+d+\",\"+f):a+(\"&u-tap-o=\"+d+\",\"+f));return a};b.performAdClick=function(a,d){d=d||event;if(imIsObjValid(a)){var f=a.clickConfig,g=a.landingConfig;if(!imIsObjValid(f)&&!imIsObjValid(g))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var e=null,h=null,k=null,m=null,n=null,l=null,q=null,p=null;if(imIsObjValid(d))try{m=d.changedTouches[0].pageX,n=d.changedTouches[0].pageY}catch(r){n=\nm=0}imIsObjValid(g)?imIsObjValid(f)?(l=g.url,q=g.fallbackUrl,p=g.urlType,e=f.url,h=f.pingWV,k=f.fr):(l=g.url,p=g.urlType):(l=f.url,p=f.urlType);f=b.getPlatform();try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=!0;if(0>h||1<h)h=!0;if(\"number\"!=typeof p||null==p)p=0;e=b.appendTapParams(e,m,n);imIsObjValid(e)?!0==h?b.pingInWebView(e,k):b.ping(e,k):b.log(\"clickurl provided is null.\");if(imIsObjValid(l))switch(imIsObjValid(e)||\n(l=b.appendTapParams(l,m,n)),p){case 1:b.openEmbedded(l);break;case 2:\"ios\"==f?b.ios.openItunesProductView(l):this.broadcastEvent(\"error\",\"Cannot process openItunesProductView for os\"+f);break;default:b.openExternal(l,q)}else b.log(\"Landing url provided is null.\")}catch(s){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.performActionClick=function(a,d){d=d||event;if(imIsObjValid(a)){var f=a.clickConfig,g=a.landingConfig;\nif(!imIsObjValid(f)&&!imIsObjValid(g))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var e=null,h=null,k=null,m=null,n=null;if(imIsObjValid(d))try{m=d.changedTouches[0].pageX,n=d.changedTouches[0].pageY}catch(l){n=m=0}imIsObjValid(f)&&(e=f.url,h=f.pingWV,k=f.fr);try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=\n!0;if(0>h||1<h)h=!0;e=b.appendTapParams(e,m,n);imIsObjValid(e)?!0==h?b.pingInWebView(e,k):b.ping(e,k):b.log(\"clickurl provided is null.\");b.onUserInteraction(g)}catch(q){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.getVersion=function(){return\"1.0\"};b.getPlatform=a.getPlatform;b.getPlatformVersion=a.getPlatformVersion;b.log=a.log;b.openEmbedded=function(b){console.log(\"openEmbedded is deprecated, will be removed in future version\");\nmraidview.detectAndBlockFraud(\"imai.openEmbedded\")||a.openEmbedded(b)};b.openExternal=function(b,d){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imai.openExternal\")||a.openExternal(b,d)};b.ping=a.ping;b.pingInWebView=a.pingInWebView;b.onUserInteraction=a.onUserInteraction;b.getSdkVersion=a.getSdkVersion;b.loadSKStore=a.loadSKStore;b.showSKStore=function(b){mraidview.detectAndBlockFraud(\"imai.showSKStore\")||a.showSKStore(b)};b.ios.openItunesProductView=\nfunction(b){mraidview.detectAndBlockFraud(\"imai.ios.openItunesProductView\")||a.ios.openItunesProductView(b)};b.fireAdReady=a.fireAdReady;b.fireAdFailed=a.fireAdFailed})();";
        }
        InterfaceC3580m9 interfaceC3580m93 = this.f26958i;
        if (interfaceC3580m93 != null) {
            String str3 = f26937g1;
            tn.p.j(str3, "TAG");
            ((C3605n9) interfaceC3580m93).a(str3, "Returning fetched Mraid Js string.");
        }
        return string;
    }

    @NotNull
    public final Ff getOrientationProperties() {
        return this.G0;
    }

    public final long getPlacementId() {
        return this.W;
    }

    public byte getPlacementType() {
        return this.f26941b;
    }

    @Nullable
    public final HtmlVideoPlaybackState getPlaybackState() {
        C3803v8 c3803v8 = this.Y0;
        if (c3803v8 == null) {
            return null;
        }
        if (c3803v8.f28341g.get()) {
            return new HtmlVideoPlaybackState();
        }
        if (c3803v8.f28351q.get() == EnumC3728s8.f28097a) {
            EnumC3275a8[] enumC3275a8Arr = EnumC3275a8.f26763a;
            c3803v8.a("getVideoPlayerState", "Playback state requested before load", (String) null);
        }
        return c3803v8.f28345k.a();
    }

    @Nullable
    public C getReferenceContainer() {
        return this.f26963k0;
    }

    @Nullable
    public final C3589mi getRenderViewTelemetry() {
        return this.f26948d0;
    }

    @WorkerThread
    @NotNull
    public final JSONArray getRenderableAdIndexes() {
        InterfaceC3820w0 interfaceC3820w0 = this.f26967m0;
        return interfaceC3820w0 != null ? ((AbstractC3547l1) interfaceC3820w0).v() : new JSONArray();
    }

    @NotNull
    public final AdConfig.RenderingConfig getRenderingConfig() {
        return getAdConfig().getRendering();
    }

    @NotNull
    public final Di getRoute() {
        return this.f26960j;
    }

    @Nullable
    public final JSONObject getSafeArea() {
        xo xoVar = this.N0;
        if (xoVar != null) {
            Integer numF = J5.f();
            wo woVar = (numF == null && (numF = J5.f25695g) == null) ? null : (wo) xoVar.f28547d.get(Integer.valueOf(numF.intValue()));
            if (woVar != null) {
                return woVar.a();
            }
        }
        return null;
    }

    public final boolean getShouldFireLandingPageBeacons() {
        return this.M0;
    }

    @WorkerThread
    public final long getShowTimeStamp() {
        InterfaceC3820w0 interfaceC3820w0 = this.f26967m0;
        if (interfaceC3820w0 != null) {
            return ((AbstractC3547l1) interfaceC3820w0).w();
        }
        return 0L;
    }

    @NotNull
    public final Ti getSiblingWebviewManager() {
        return (Ti) this.f26980t.getValue();
    }

    @Nullable
    public Map<String, C3696r1> getTelemetryManagerMap() {
        return this.P0;
    }

    @NotNull
    public C3442gk getTelemetryOnAdImpression() {
        Map<String, C3696r1> telemetryManagerMap = getTelemetryManagerMap();
        return new C3442gk(telemetryManagerMap != null ? telemetryManagerMap.get("AdImpressionSuccessful") : null, this.F0, getCreativeId(), getImpressionId(), getMarkupType());
    }

    @VisibleForTesting
    public final boolean getUnloaded() {
        return this.O0;
    }

    @NotNull
    public final Ln getVISIBILITY_CHANGE_LISTENER() {
        return this.V0;
    }

    @Nullable
    public View getVideoContainerView() {
        return null;
    }

    @NotNull
    public final String getViewState() {
        return this.f26992z;
    }

    @Override // com.inmobi.media.InterfaceC3613nh
    public long getViewTouchTimestamp() {
        return this.f26954g;
    }

    @Override // com.inmobi.media.C
    @NotNull
    public Fn getViewableAd() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "viewableAd getter " + this);
        }
        if (this.f26969n0 == null) {
            this.f26969n0 = new C9(this, new Gn(this), new C3678q7(this.f26976r, this.F0, this.f26987w0, this.f26989x0, getVisibilityTrackingMinPercentage(), this.f26958i), this.f26958i);
            Set<C3840wk> set = this.f26944c;
            if (set != null) {
                for (C3840wk c3840wk : set) {
                    try {
                        if (c3840wk.f28462a == 3) {
                            setOmidViewableAd(c3840wk);
                        }
                        bn.r rVar = bn.r.f5635a;
                    } catch (Exception e10) {
                        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
                        if (interfaceC3580m92 != null) {
                            String str2 = f26937g1;
                            tn.p.j(str2, "TAG");
                            ((C3605n9) interfaceC3580m92).b(str2, "Exception occurred while creating the HTML viewable ad : " + e10.getMessage());
                            bn.r rVar2 = bn.r.f5635a;
                        }
                    }
                }
            }
        }
        Fn fn2 = this.f26969n0;
        tn.p.h(fn2);
        return fn2;
    }

    @Nullable
    public final int[] getViewableFrameArray() {
        return this.f26977r0;
    }

    public final int getVisibilityTrackingMinPercentage() {
        return tn.p.f("audio", getAdType()) ? getAdConfig().getViewability().getAudioImpressionMinPercentageViewed() : getAdConfig().getViewability().getWebImpressionMinPercentageViewed();
    }

    @NotNull
    public final ko getWebViewFactory() {
        return this.f26962k;
    }

    @NotNull
    public final uo getWindowInsetListener() {
        return this.R0;
    }

    @NotNull
    public final C3441gj getWvStateMachine() {
        return this.f26978s;
    }

    public final void h() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).c(str, "completeFromInterActive " + this);
        }
        D4 d42 = this.X0;
        if (d42 != null) {
            d42.g();
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        if (interfaceC3580m92 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m92).a(str2, "completeFromInterActive");
        }
    }

    public final void h(String str) {
        tn.p.k(str, "content");
        C3589mi c3589mi = this.f26948d0;
        if (c3589mi != null) {
            c3589mi.b();
        }
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m9).a(str2, "loadDataInWebView " + this);
        }
        this.P = false;
        if (this.M.get()) {
            return;
        }
        InMobiNetworkBridge.webviewLoadDataWithBaseURL(this, "", str, "text/html", "UTF-8", null);
    }

    public final void i() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "deferredDestroy " + this);
        }
        super.destroy();
    }

    public final void i(String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m9).a(str2, "loadScript " + this);
        }
        InMobiNetworkBridge.webviewLoadUrl(this, str);
    }

    public final void j() throws JSONException {
        if (this.M.get()) {
            return;
        }
        if (!this.H) {
            this.H = true;
            return;
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f26945c0;
        if (onGlobalLayoutListener != null) {
            getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            this.f26945c0 = null;
        }
        this.M.set(true);
        this.f26962k.a(this.f26960j.f25331b);
        xo xoVar = this.N0;
        if (xoVar != null) {
            xoVar.a();
        }
        D4 d42 = this.X0;
        if (d42 != null) {
            d42.b();
        }
        this.P = true;
        this.T = -1;
        C3803v8 c3803v8 = this.Y0;
        if (c3803v8 != null) {
            InterfaceC3580m9 interfaceC3580m9 = c3803v8.f28337c;
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).a("HybridVideoPlayerHandler", "destroy");
            }
            c3803v8.a();
            C3885yf c3885yf = c3803v8.f28350p;
            if (c3885yf != null) {
                InterfaceC3580m9 interfaceC3580m92 = c3885yf.f28593g;
                if (interfaceC3580m92 != null) {
                    tn.p.j("yf", "TAG");
                    ((C3605n9) interfaceC3580m92).c("yf", "stopOmidSession");
                }
                Ae ae2 = c3885yf.f28591e;
                if (ae2 != null) {
                    if (ae2.f27075c == null) {
                        InterfaceC3580m9 interfaceC3580m93 = ae2.f27074b;
                        if (interfaceC3580m93 != null) {
                            ((C3605n9) interfaceC3580m93).a(AbstractC3371e1.f27072f, "Failed to stopAdSession. adSession is null");
                        }
                    } else {
                        InterfaceC3580m9 interfaceC3580m94 = ae2.f27074b;
                        if (interfaceC3580m94 != null) {
                            ((C3605n9) interfaceC3580m94).a(AbstractC3371e1.f27072f, "stopAdSession");
                        }
                        AdSession adSession = ae2.f27075c;
                        if (adSession != null) {
                            adSession.finish();
                        }
                        ae2.f27075c = null;
                    }
                }
            }
            c3803v8.f28350p = null;
            F3.a(c3803v8.f28338d);
        }
        this.Y0 = null;
        removeJavascriptInterface("sdkController");
        C3832wc c3832wc = this.A;
        if (c3832wc != null) {
            C3279ac c3279ac = c3832wc.f28432d;
            if (c3279ac != null) {
                c3279ac.a();
            }
            c3832wc.f28432d = null;
            C3279ac c3279ac2 = c3832wc.f28433e;
            if (c3279ac2 != null) {
                c3279ac2.a();
            }
            c3832wc.f28433e = null;
            C3279ac c3279ac3 = c3832wc.f28434f;
            if (c3279ac3 != null) {
                c3279ac3.a();
            }
            c3832wc.f28434f = null;
        }
        this.f26982u.clear();
        this.f26984v.clear();
        WeakReference weakReference = this.f26986w;
        if (weakReference != null) {
            weakReference.clear();
        }
        Fn fn2 = this.f26969n0;
        if (fn2 != null) {
            fn2.d();
        }
        Fn fn3 = this.f26969n0;
        if (fn3 != null) {
            fn3.a();
        }
        C3386eg c3386eg = this.f26953f0;
        if (c3386eg != null) {
            F8 f82 = Uf.f26443b;
            if (f82 != null) {
                String str = c3386eg.f27111c;
                tn.p.k(str, "id");
                f82.f27355b.remove(str);
                Iterator it = f82.f27355b.entrySet().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    tn.p.j(next, "next(...)");
                    if (((WeakReference) ((Map.Entry) next).getValue()).get() == null) {
                        it.remove();
                    }
                }
            }
            C3651p5 c3651p5 = Uf.f26444c;
            if (c3651p5 != null) {
                String str2 = c3386eg.f27111c;
                tn.p.k(str2, "id");
                c3651p5.f27355b.remove(str2);
                Iterator it2 = c3651p5.f27355b.entrySet().iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    tn.p.j(next2, "next(...)");
                    if (((WeakReference) ((Map.Entry) next2).getValue()).get() == null) {
                        it2.remove();
                    }
                }
            }
            c3386eg.f27112d.set(true);
        }
        this.f26953f0 = null;
        T();
        S();
        Map<View, FriendlyObstructionPurpose> friendlyViews = getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.clear();
        }
        setFriendlyViews(null);
        this.E0 = null;
        this.f26988x = null;
        this.f26963k0 = null;
        this.f26967m0 = null;
        this.B0 = false;
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    public final void j(String str) {
        tn.p.k(str, "url");
        C3589mi c3589mi = this.f26948d0;
        if (c3589mi != null) {
            c3589mi.b();
        }
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m9).a(str2, "loadUrlInWebView " + this);
        }
        this.P = false;
        if (this.M.get()) {
            return;
        }
        InMobiNetworkBridge.webviewLoadUrl(this, str);
    }

    public final void k() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).c(str, "disableHardwareAcceleration called. " + this);
        }
        try {
            setLayerType(1, null);
        } catch (Exception e10) {
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
        }
    }

    public final void k(String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m9).a(str2, "registerBackButtonPressedEventListener " + this);
        }
        this.L = str;
    }

    public final void l() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "dismissCurrentIntAdViewContainerInShowNextPodFlow " + this);
        }
        C3832wc c3832wc = this.A;
        if (c3832wc != null) {
            C3459hc c3459hc = c3832wc.f28431c;
            if (c3459hc != null) {
                c3459hc.b();
            }
            c3832wc.f28431c = null;
        }
        if (tn.p.f(Profile.DEFAULT_PROFILE_NAME, this.f26992z)) {
            setAndUpdateViewState("Hidden");
            if (getParent() instanceof ViewGroup) {
                this.f26962k.b(new sn.l() { // from class: n9.a6
                    @Override // sn.l
                    public final Object invoke(Object obj) {
                        return GestureDetectorOnGestureListenerC3337ci.b((C3539ki) obj);
                    }
                });
            }
            SparseArray sparseArray = InMobiAdActivity.f25113k;
            tn.p.k(this, "container");
            InMobiAdActivity.f25113k.remove(hashCode());
        }
    }

    public void m() {
        InterfaceC3820w0 interfaceC3820w0;
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "dismissCurrentViewContainer " + this);
        }
        C3832wc c3832wc = this.A;
        if (c3832wc != null) {
            C3459hc c3459hc = c3832wc.f28431c;
            if (c3459hc != null) {
                c3459hc.b();
            }
            c3832wc.f28431c = null;
        }
        if (tn.p.f(Profile.DEFAULT_PROFILE_NAME, this.f26992z)) {
            setAndUpdateViewState("Hidden");
            ViewParent parent = getParent();
            boolean z10 = parent instanceof ViewGroup;
            if (z10) {
                this.f26962k.b(new sn.l() { // from class: n9.c6
                    @Override // sn.l
                    public final Object invoke(Object obj) {
                        return GestureDetectorOnGestureListenerC3337ci.c((C3539ki) obj);
                    }
                });
            }
            if (1 == this.f26941b) {
                n();
            } else if (z10) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        if (this.I != Hn.f25626c || (interfaceC3820w0 = this.f26967m0) == null) {
            return;
        }
        interfaceC3820w0.a(this, getFullScreenActivity());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r6.equals("html5video") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011b, code lost:
    
        if (r6.equals(io.bidmachine.iab.mraid.MraidNativeFeature.FEATURE_INLINE_VIDEO) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0120, code lost:
    
        if (r5.B == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0124, code lost:
    
        if (r5.Q == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0126, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0127, code lost:
    
        r6 = r5.f26958i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0129, code lost:
    
        if (r6 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012b, code lost:
    
        r2 = com.inmobi.media.GestureDetectorOnGestureListenerC3337ci.f26937g1;
        tn.p.j(r2, "TAG");
        ((com.inmobi.media.C3605n9) r6).c(r2, "HTML5 video supported:" + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0146, code lost:
    
        return r0;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0150 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.GestureDetectorOnGestureListenerC3337ci.m(java.lang.String):boolean");
    }

    public final void n() {
        Activity fullScreenActivity;
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "finishFullScreenActivity " + this);
        }
        SparseArray sparseArray = InMobiAdActivity.f25113k;
        tn.p.k(this, "container");
        InMobiAdActivity.f25113k.remove(hashCode());
        if (getFullScreenActivity() == null) {
            if (tn.p.f(Profile.DEFAULT_PROFILE_NAME, this.f26992z)) {
                setAndUpdateViewState("Hidden");
            }
            W();
            return;
        }
        InterfaceC3820w0 interfaceC3820w0 = this.f26967m0;
        if (interfaceC3820w0 == null || !interfaceC3820w0.a(this)) {
            Activity fullScreenActivity2 = getFullScreenActivity();
            tn.p.i(fullScreenActivity2, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
            ((InMobiAdActivity) fullScreenActivity2).f25119e = true;
            Activity fullScreenActivity3 = getFullScreenActivity();
            if (fullScreenActivity3 != null) {
                fullScreenActivity3.finish();
            }
            if (this.T == -1 || (fullScreenActivity = getFullScreenActivity()) == null) {
                return;
            }
            fullScreenActivity.overridePendingTransition(0, this.T);
        }
    }

    public final void o() {
        L0 l02;
        AdQualityControl adQualityControl;
        Activity activity;
        L0 l03;
        AdQualityControl adQualityControl2;
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "fireAQSession - " + getAdType() + " type - sdk - " + Build.VERSION.SDK_INT);
        }
        if (!tn.p.f(getAdType(), ImpressionLog.f51753w) || Build.VERSION.SDK_INT < 29 || (activity = (Activity) this.f26982u.get()) == null) {
            L0 l04 = this.H0;
            if (l04 == null) {
                tn.p.C("adQualityManager");
                l02 = null;
            } else {
                l02 = l04;
            }
            l02.getClass();
            tn.p.k(this, "adView");
            if (!l02.a()) {
                l02.a("session state invalid");
                return;
            }
            l02.a("session start trigger...");
            l02.f25833c.set(true);
            AdQualityControl adQualityControl3 = l02.f25837g;
            if (adQualityControl3 == null || !adQualityControl3.getTakeScreenshot() || (adQualityControl = l02.f25837g) == null) {
                return;
            }
            l02.a(this, (long) (adQualityControl.getScreenshotDelayInSeconds() * 1000), false, (Qh) null);
            return;
        }
        L0 l05 = this.H0;
        if (l05 == null) {
            tn.p.C("adQualityManager");
            l03 = null;
        } else {
            l03 = l05;
        }
        l03.getClass();
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        if (!l03.a()) {
            l03.a("session state invalid");
            return;
        }
        l03.a("session start trigger...");
        l03.f25833c.set(true);
        AdQualityControl adQualityControl4 = l03.f25837g;
        if (adQualityControl4 == null || !adQualityControl4.getTakeScreenshot() || (adQualityControl2 = l03.f25837g) == null) {
            return;
        }
        l03.a(activity, (long) (adQualityControl2.getScreenshotDelayInSeconds() * 1000), false, (Qh) null);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Gh gh2;
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "onAttachedToWindow " + this);
        }
        super.onAttachedToWindow();
        if (!this.f26950e) {
            if (tn.p.f(this.f26960j.f25331b, "default")) {
                getListener().d(this);
            }
            if (getAdConfig().getRendering().getEnableActivityContextOnBannerAttach()) {
                B();
            }
        }
        C3832wc c3832wc = this.A;
        if (c3832wc != null) {
            C3279ac c3279ac = c3832wc.f28432d;
            if (c3279ac != null) {
                c3279ac.b();
            }
            C3279ac c3279ac2 = c3832wc.f28433e;
            if (c3279ac2 != null) {
                c3279ac2.b();
            }
            C3279ac c3279ac3 = c3832wc.f28434f;
            if (c3279ac3 != null) {
                c3279ac3.b();
            }
        }
        O();
        if (this.f26986w == null) {
            ViewParent parent = getParent();
            this.f26986w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        }
        U();
        R();
        Q();
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        if (interfaceC3580m92 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m92).a(str2, "==== CHECKPOINT REACHED - VISIBLE ====");
        }
        InterfaceC3580m9 interfaceC3580m93 = this.f26958i;
        if (interfaceC3580m93 == null || (gh2 = ((C3605n9) interfaceC3580m93).f27675a) == null) {
            return;
        }
        gh2.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "onDetachedFromWindow " + this);
        }
        U5 u52 = this.D0;
        if (u52 != null) {
            U5.a(u52, 8, true, null, 12);
        }
        C3832wc c3832wc = this.A;
        if (c3832wc != null) {
            C3279ac c3279ac = c3832wc.f28432d;
            if (c3279ac != null) {
                c3279ac.a();
            }
            C3279ac c3279ac2 = c3832wc.f28433e;
            if (c3279ac2 != null) {
                c3279ac2.a();
            }
            C3279ac c3279ac3 = c3832wc.f28434f;
            if (c3279ac3 != null) {
                c3279ac3.a();
            }
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        if (interfaceC3580m92 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m92).a(str2, "Detached from window");
        }
        L0 l02 = this.H0;
        if (l02 == null) {
            tn.p.C("adQualityManager");
            l02 = null;
        }
        if (l02.f25834d.get()) {
            l02.a("session end is already triggered");
        } else if (!l02.f25831a.getEnabled()) {
            l02.a("config kill switch - false. ad quality will skip");
        } else if (l02.f25837g == null) {
            l02.a("setup not done. ignore trigger");
        } else {
            l02.f25834d.set(true);
            l02.a(false);
        }
        if (this.I0.get()) {
            p000do.i.d(A9.f25147c, null, null, new Wh(this, null), 3, null);
        }
        U();
        T();
        S();
        try {
            super.onDetachedFromWindow();
        } catch (IllegalArgumentException e10) {
            InterfaceC3580m9 interfaceC3580m93 = this.f26958i;
            if (interfaceC3580m93 != null) {
                String str3 = f26937g1;
                tn.p.j(str3, "TAG");
                ((C3605n9) interfaceC3580m93).b(str3, "Detaching WebView from window encountered an error ( " + e10.getMessage() + " )");
            }
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        tn.p.k(motionEvent, "e");
        if (!this.f26968n) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
            if (interfaceC3580m9 != null) {
                String str = f26937g1;
                tn.p.j(str, "TAG");
                ((C3605n9) interfaceC3580m9).c(str, "DoubleTap gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.f26950e || !getRenderingConfig().getSupportedGestures().contains(1)) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
            if (interfaceC3580m92 != null) {
                String str2 = f26937g1;
                tn.p.j(str2, "TAG");
                ((C3605n9) interfaceC3580m92).c(str2, "Double tap gesture is disabled from config");
            }
            return false;
        }
        InterfaceC3580m9 interfaceC3580m93 = this.f26958i;
        if (interfaceC3580m93 != null) {
            String str3 = f26937g1;
            tn.p.j(str3, "TAG");
            ((C3605n9) interfaceC3580m93).a(str3, "onDoubleTapEvent detected \n " + motionEvent);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        if (motionEvent.getAction() == 0) {
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray.put(F3.c(motionEvent.getX()));
                jSONArray.put(F3.c(motionEvent.getY()));
            } catch (JSONException e10) {
                InterfaceC3580m9 interfaceC3580m94 = this.f26958i;
                if (interfaceC3580m94 != null) {
                    String str4 = f26937g1;
                    tn.p.j(str4, "TAG");
                    ((C3605n9) interfaceC3580m94).a(str4, "Exception in onDoubleTap", e10);
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONArray);
            g("window.imraidview.onGestureDetected('1', '" + jSONArray2 + "');");
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        tn.p.k(motionEvent, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        tn.p.k(motionEvent, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        tn.p.k(motionEvent2, "e2");
        if (!this.f26968n) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
            if (interfaceC3580m9 != null) {
                String str = f26937g1;
                tn.p.j(str, "TAG");
                ((C3605n9) interfaceC3580m9).c(str, "Fling gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.f26950e || !getRenderingConfig().getSupportedGestures().contains(6)) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
            if (interfaceC3580m92 != null) {
                String str2 = f26937g1;
                tn.p.j(str2, "TAG");
                ((C3605n9) interfaceC3580m92).c(str2, "fling gesture is disabled from config");
            }
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(motionEvent == null ? new JSONArray() : new JSONArray((Collection) cn.w.p(Integer.valueOf(F3.c(motionEvent.getX())), Integer.valueOf(F3.c(motionEvent.getY())))));
            jSONArray.put(new JSONArray((Collection) cn.w.p(Integer.valueOf(F3.c(motionEvent2.getX())), Integer.valueOf(F3.c(motionEvent2.getY())))));
            jSONArray.put(new JSONArray((Collection) cn.w.p(Float.valueOf(f10), Float.valueOf(f11))));
        } catch (Exception e10) {
            InterfaceC3580m9 interfaceC3580m93 = this.f26958i;
            if (interfaceC3580m93 != null) {
                String str3 = f26937g1;
                tn.p.j(str3, "TAG");
                ((C3605n9) interfaceC3580m93).a(str3, "Exception in onFling", e10);
            }
        }
        g("window.imraidview.onGestureDetected('6', '" + jSONArray + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        tn.p.k(motionEvent, "e");
        if (!this.f26968n) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
            if (interfaceC3580m9 != null) {
                String str = f26937g1;
                tn.p.j(str, "TAG");
                ((C3605n9) interfaceC3580m9).c(str, "Long Press gesture is disabled via enableNativeGestures API");
                return;
            }
            return;
        }
        if (this.f26950e || !getRenderingConfig().getSupportedGestures().contains(5)) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
            if (interfaceC3580m92 != null) {
                String str2 = f26937g1;
                tn.p.j(str2, "TAG");
                ((C3605n9) interfaceC3580m92).c(str2, "LongPress gesture is disabled from config");
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m93 = this.f26958i;
        if (interfaceC3580m93 != null) {
            String str3 = f26937g1;
            tn.p.j(str3, "TAG");
            ((C3605n9) interfaceC3580m93).a(str3, "onLongPress detected \n " + motionEvent);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(F3.c(motionEvent.getX()));
            jSONArray.put(F3.c(motionEvent.getY()));
        } catch (JSONException e10) {
            InterfaceC3580m9 interfaceC3580m94 = this.f26958i;
            if (interfaceC3580m94 != null) {
                String str4 = f26937g1;
                tn.p.j(str4, "TAG");
                ((C3605n9) interfaceC3580m94).a(str4, "Exception in onLongPress", e10);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        g("window.imraidview.onGestureDetected('5', '" + jSONArray2 + "');");
    }

    @Override // com.inmobi.media.AbstractC3872y2, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        tn.p.k(motionEvent2, "e2");
        if (this.f26950e && !this.V) {
            this.V = true;
            SparseArray sparseArray = InMobiAdActivity.f25113k;
            f26935e1.getClass();
            JSONObject jSONObjectA = Mh.a("IN_CUSTOM_BROWSER", "onScroll");
            tn.p.k(jSONObjectA, "jsonObject");
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = InMobiAdActivity.f25114l;
            if (gestureDetectorOnGestureListenerC3337ci != null) {
                gestureDetectorOnGestureListenerC3337ci.c(jSONObjectA);
            }
            return false;
        }
        if (!this.f26968n) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
            if (interfaceC3580m9 != null) {
                String str = f26937g1;
                tn.p.j(str, "TAG");
                ((C3605n9) interfaceC3580m9).c(str, "Scroll gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        if (interfaceC3580m92 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m92).a(str2, "onScroll detected \n " + motionEvent + " \n " + motionEvent2);
        }
        if (!this.f26950e) {
            C3566lk scrollThrottler = getScrollThrottler();
            scrollThrottler.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - scrollThrottler.f27582b < scrollThrottler.f27581a) {
                scrollThrottler.f27582b = jElapsedRealtime;
            } else {
                scrollThrottler.f27582b = jElapsedRealtime;
                if (getRenderingConfig().getSupportedGestures().contains(8)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        jSONArray.put(motionEvent == null ? new JSONArray() : new JSONArray((Collection) cn.w.p(Integer.valueOf(F3.c(motionEvent.getX())), Integer.valueOf(F3.c(motionEvent.getY())))));
                        jSONArray.put(new JSONArray((Collection) cn.w.p(Integer.valueOf(F3.c(motionEvent2.getX())), Integer.valueOf(F3.c(motionEvent2.getY())))));
                    } catch (Exception e10) {
                        InterfaceC3580m9 interfaceC3580m93 = this.f26958i;
                        if (interfaceC3580m93 != null) {
                            String str3 = f26937g1;
                            tn.p.j(str3, "TAG");
                            ((C3605n9) interfaceC3580m93).a(str3, "Exception in onScroll", e10);
                        }
                    }
                    g("window.imraidview.onGestureDetected('8', '" + jSONArray + "');");
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        tn.p.k(motionEvent, "e");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        tn.p.k(motionEvent, "e");
        if (!this.f26968n) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
            if (interfaceC3580m9 != null) {
                String str = f26937g1;
                tn.p.j(str, "TAG");
                ((C3605n9) interfaceC3580m9).c(str, "SingleTapConfirmed gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.f26950e || !getRenderingConfig().getSupportedGestures().contains(0)) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
            if (interfaceC3580m92 != null) {
                String str2 = f26937g1;
                tn.p.j(str2, "TAG");
                ((C3605n9) interfaceC3580m92).c(str2, "Click gesture is disabled from config");
            }
            return false;
        }
        InterfaceC3580m9 interfaceC3580m93 = this.f26958i;
        if (interfaceC3580m93 != null) {
            String str3 = f26937g1;
            tn.p.j(str3, "TAG");
            ((C3605n9) interfaceC3580m93).a(str3, "onSingleTapConfirmed detected \n " + motionEvent);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(F3.c(motionEvent.getX()));
            jSONArray.put(F3.c(motionEvent.getY()));
        } catch (JSONException e10) {
            InterfaceC3580m9 interfaceC3580m94 = this.f26958i;
            if (interfaceC3580m94 != null) {
                String str4 = f26937g1;
                tn.p.j(str4, "TAG");
                ((C3605n9) interfaceC3580m94).a(str4, "Exception in onSingleTapConfirmed", e10);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        g("window.imraidview.onGestureDetected('0', '" + jSONArray2 + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        tn.p.k(motionEvent, "e");
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "onSingleTapUp detected \n " + motionEvent);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).c(str, "onSizeChanged " + this);
        }
        super.onSizeChanged(i10, i11, i12, i13);
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        if (interfaceC3580m92 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m92).a(str2, "onSizeChanged (" + i10 + ", " + i11 + ")");
        }
        if (i10 == 0 || i11 == 0) {
            return;
        }
        a(F3.b(i10 / J5.b()), F3.b(i11 / J5.b()));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tn.p.k(motionEvent, "event");
        if (Float.isNaN(motionEvent.getX()) || Float.isNaN(motionEvent.getY())) {
            if (!this.J0) {
                InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
                if (interfaceC3580m9 != null) {
                    String str = f26937g1;
                    tn.p.j(str, "TAG");
                    ((C3605n9) interfaceC3580m9).b(str, "onTouchEvent Invalid Coordinates " + motionEvent);
                }
                this.J0 = true;
            }
            return super.onTouchEvent(motionEvent);
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        if (interfaceC3580m92 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m92).a(str2, "onTouchEvent " + this);
        }
        if (!getAdConfig().getRendering().getUseDispatchTouchEvent()) {
            a(motionEvent);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onWindowFocusChanged(boolean r5) {
        /*
            r4 = this;
            com.inmobi.media.m9 r0 = r4.f26958i
            if (r0 == 0) goto L29
            java.lang.String r1 = com.inmobi.media.GestureDetectorOnGestureListenerC3337ci.f26937g1
            java.lang.String r2 = "TAG"
            tn.p.j(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onWindowFocusChanged "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = " - "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.inmobi.media.n9 r0 = (com.inmobi.media.C3605n9) r0
            r0.a(r1, r2)
        L29:
            super.onWindowFocusChanged(r5)
            r0 = 1
            if (r5 == 0) goto L4a
            boolean r5 = r4.isShown()
            if (r5 == 0) goto L49
            com.inmobi.media.n7 r5 = com.inmobi.media.C3678q7.f27941k
            int r1 = r4.f26989x0
            boolean r1 = r5.b(r4, r4, r1)
            if (r1 == 0) goto L49
            int r1 = r4.f26989x0
            boolean r5 = r5.a(r4, r4, r1)
            if (r5 == 0) goto L49
            r5 = r0
            goto L4a
        L49:
            r5 = 0
        L4a:
            android.app.Activity r1 = r4.getFullScreenActivity()
            if (r1 == 0) goto L57
            boolean r1 = r1.isInMultiWindowMode()
            if (r1 != r0) goto L57
            return
        L57:
            r4.d(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.GestureDetectorOnGestureListenerC3337ci.onWindowFocusChanged(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onWindowVisibilityChanged(int r5) {
        /*
            r4 = this;
            com.inmobi.media.m9 r0 = r4.f26958i
            if (r0 == 0) goto L29
            java.lang.String r1 = com.inmobi.media.GestureDetectorOnGestureListenerC3337ci.f26937g1
            java.lang.String r2 = "TAG"
            tn.p.j(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onWindowVisibilityChanged "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = " "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.inmobi.media.n9 r0 = (com.inmobi.media.C3605n9) r0
            r0.c(r1, r2)
        L29:
            super.onWindowVisibilityChanged(r5)
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L32
            r5 = r0
            goto L33
        L32:
            r5 = r1
        L33:
            if (r5 == 0) goto L50
            int r5 = r4.getVisibilityTrackingMinPercentage()
            boolean r2 = r4.isShown()
            if (r2 == 0) goto L4e
            com.inmobi.media.n7 r2 = com.inmobi.media.C3678q7.f27941k
            boolean r3 = r2.b(r4, r4, r5)
            if (r3 == 0) goto L4e
            boolean r5 = r2.a(r4, r4, r5)
            if (r5 == 0) goto L4e
            goto L51
        L4e:
            r0 = r1
            goto L51
        L50:
            r0 = r5
        L51:
            r4.d(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.GestureDetectorOnGestureListenerC3337ci.onWindowVisibilityChanged(int):void");
    }

    public final void p() {
        if (this.O0) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
            if (interfaceC3580m9 != null) {
                String str = f26937g1;
                tn.p.j(str, "TAG");
                ((C3605n9) interfaceC3580m9).a(str, "fireAdFailed " + this + " - Ad is already unloaded");
                return;
            }
            return;
        }
        this.C0 = true;
        C3589mi c3589mi = this.f26948d0;
        if (c3589mi != null) {
            Map mapA = c3589mi.a();
            long j10 = c3589mi.f27633c;
            p000do.l0 l0Var = AbstractC3492il.f27361a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
            String strA = c3589mi.a("FireAdFailed");
            Wj wj2 = Wj.f26549a;
            Wj.b(strA, mapA, EnumC3287ak.f26805a);
        }
        getListener().h(this);
    }

    public final void q() {
        if (this.M.get()) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
            if (interfaceC3580m9 != null) {
                String str = f26937g1;
                tn.p.j(str, "TAG");
                ((C3605n9) interfaceC3580m9).b(str, "fireAdReady called on destroyed view");
                return;
            }
            return;
        }
        if (this.O0) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
            if (interfaceC3580m92 != null) {
                String str2 = f26937g1;
                tn.p.j(str2, "TAG");
                ((C3605n9) interfaceC3580m92).a(str2, "fireAdReady " + this + " - Ad is already unloaded");
                return;
            }
            return;
        }
        C3589mi c3589mi = this.f26948d0;
        if (c3589mi != null) {
            Map mapA = c3589mi.a();
            long j10 = c3589mi.f27633c;
            p000do.l0 l0Var = AbstractC3492il.f27361a;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
            mapA.put("latency", Long.valueOf(jElapsedRealtime));
            c3589mi.f27638h = jElapsedRealtime;
            String strA = c3589mi.a("FireAdReady");
            Wj wj2 = Wj.f26549a;
            Wj.b(strA, mapA, EnumC3287ak.f26805a);
        }
        InterfaceC3580m9 interfaceC3580m93 = this.f26958i;
        if (interfaceC3580m93 != null) {
            String str3 = f26937g1;
            tn.p.j(str3, "TAG");
            ((C3605n9) interfaceC3580m93).a(str3, "fireAdReady " + this);
        }
        this.B0 = true;
        if (this.f26976r == 0) {
            u();
        }
        p000do.i.d(A9.f25147c, null, null, new Zh(this, null), 3, null);
        getListener().i(this);
    }

    public final void r() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "fireBackButtonPressedEvent " + this);
        }
        String str2 = this.L;
        if (str2 != null) {
            a(str2, "broadcastEvent('backButtonPressed')");
        }
    }

    public final void s() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "fireClickTrackers " + this);
        }
        D4 d42 = this.X0;
        if (d42 != null) {
            d42.f();
        }
        v();
        getListener().b(this);
    }

    public boolean safedk_ci_dispatchTouchEvent_57035176a7617922c0477832317fe02d(MotionEvent motionEvent) {
        tn.p.k(motionEvent, "event");
        if (Float.isNaN(motionEvent.getX()) || Float.isNaN(motionEvent.getY())) {
            if (!this.J0) {
                InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
                if (interfaceC3580m9 != null) {
                    String str = f26937g1;
                    tn.p.j(str, "TAG");
                    ((C3605n9) interfaceC3580m9).b(str, "dispatchTouchEvent Invalid Coordinates " + motionEvent);
                }
                this.J0 = true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        if (interfaceC3580m92 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m92).a(str2, "dispatchTouchEvent " + this);
        }
        this.A0.a(motionEvent);
        if (getAdConfig().getRendering().getUseDispatchTouchEvent()) {
            a(motionEvent);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setAdPodHandler(@Nullable InterfaceC3820w0 interfaceC3820w0) {
        this.f26967m0 = interfaceC3820w0;
    }

    public void setAdType(@Nullable String str) {
        this.f26957h0 = str;
    }

    public final void setAllowAutoRedirection(boolean z10) {
        this.f26965l0 = z10;
    }

    public final void setAndUpdateViewState(@NotNull String str) {
        tn.p.k(str, "state");
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str2 = f26937g1;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m9).c(str2, "setAndUpdateViewState " + this);
        }
        this.f26992z = str;
        InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
        if (interfaceC3580m92 != null) {
            String str3 = f26937g1;
            tn.p.j(str3, "TAG");
            ((C3605n9) interfaceC3580m92).a(str3, "set state:" + this.f26992z);
        }
        Locale locale = Locale.ENGLISH;
        tn.p.j(locale, "ENGLISH");
        String lowerCase = str.toLowerCase(locale);
        tn.p.j(lowerCase, "toLowerCase(...)");
        e(lowerCase);
    }

    public final void setBackButtonDisabled(boolean z10) {
        this.K = z10;
    }

    public final void setBannerHolderActivity(@NotNull WeakReference<Activity> weakReference) {
        tn.p.k(weakReference, "<set-?>");
        this.f26984v = weakReference;
    }

    public final void setBeaconUrl(@Nullable String str) {
        this.L0 = str;
    }

    public final void setBlobProvider(@Nullable E2 e22) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).c(str, "setBlobProvider " + this);
        }
        this.f26961j0 = e22;
    }

    public final void setCloseAssetArea(@NotNull vo voVar) {
        tn.p.k(voVar, "value");
        if (!this.W0) {
            Context context = getContext();
            tn.p.j(context, "getContext(...)");
            if (!F3.a(context)) {
                return;
            }
        }
        this.f26949d1 = new vo(0, voVar.f28394b, voVar.f28395c, 0);
    }

    public final void setConfiguredArea(long j10) {
        this.f26979s0 = ((long) getWidth()) * ((long) getHeight());
    }

    public final void setContentURL(@Nullable String str) {
        this.f26975q0 = str;
    }

    public final void setContextualDataHandler(@Nullable D4 d42) {
        this.X0 = d42;
    }

    public void setCreativeId(@Nullable String str) {
        this.f26939a0 = str;
    }

    public final void setDisableBackButton(boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "setDisableBackButton " + this);
        }
        this.K = z10;
    }

    public final void setEmbeddedBrowserJsCallbacks(@Nullable S5 s52) {
        this.E0 = s52;
    }

    public final void setEnableNativeGestures(boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "enableNativeGestures " + this + com.ironsource.Z7.f30794r + z10);
        }
        boolean z11 = this.f26968n;
        this.f26968n = z10;
        if (z10 && !z11) {
            if (this.f26991y0 == null) {
                this.f26991y0 = new C3633oc(this);
            }
        } else {
            if (z10 || !z11) {
                return;
            }
            this.f26991y0 = null;
        }
    }

    public final void setEnableTouchBeginCallback(boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "setEnableTouchBeginCallback " + this + com.ironsource.Z7.f30794r + z10);
        }
        this.f26972p = z10;
    }

    public final void setEnableTouchEndCallback(boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "setEnableTouchEndCallback " + this + com.ironsource.Z7.f30794r + z10);
        }
        this.f26970o = z10;
    }

    public void setExitAnimation(int i10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).c(str, "setExitAnimation " + this);
        }
        this.T = i10;
    }

    public final void setExposureTracker(@Nullable U u10) {
        this.K0 = u10;
    }

    public void setFriendlyViews(@Nullable Map<View, FriendlyObstructionPurpose> map) {
        this.f26959i0 = map;
    }

    public void setFullScreenActivityContext(@Nullable Activity activity) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "setFullScreenActivityContext " + this);
        }
        this.f26982u = new WeakReference(activity);
        Y();
        if (this.f26950e || activity == null) {
            return;
        }
        xo xoVar = this.N0;
        if (xoVar != null) {
            xoVar.a();
        }
        this.N0 = new xo(activity, this.R0, this.f26958i);
    }

    public final void setImmersiveMode(boolean z10) {
        this.W0 = z10;
    }

    public void setImpressionId(@Nullable String str) {
        this.f26947d = str;
    }

    public final void setLandingPageTelemetryControlInfoOnWebViewClient(@Nullable Ya ya2) {
        U5 u52 = this.D0;
        if (u52 != null) {
            u52.f26415j = ya2;
            u52.f26416k = new Wa(ya2, u52);
        }
    }

    public final void setLandingScheme(@NotNull String str) {
        tn.p.k(str, "<set-?>");
        this.f26952f = str;
    }

    public final void setMCreativeType(@Nullable String str) {
        this.F0 = str;
    }

    public final void setMImpressionMinPercentageViewed(int i10) {
        this.f26989x0 = i10;
    }

    public final void setMImpressionMinTimeViewed(int i10) {
        this.f26987w0 = i10;
    }

    public final void setMViewableAd(@Nullable Fn fn2) {
        this.f26969n0 = fn2;
    }

    public final void setMarkupTypeAdUnit(@NotNull String str) {
        tn.p.k(str, "<set-?>");
        this.S0 = str;
    }

    public final void setOrientationProperties(@NotNull Ff ff2) {
        tn.p.k(ff2, "<set-?>");
        this.G0 = ff2;
    }

    @VisibleForTesting
    public final void setPingAckListener(@NotNull InterfaceC3309bg interfaceC3309bg) {
        tn.p.k(interfaceC3309bg, "pingAckListener");
        this.f26974q = interfaceC3309bg;
    }

    @VisibleForTesting
    public final void setPingManager(@NotNull C3386eg c3386eg) {
        tn.p.k(c3386eg, "pingManager");
        this.f26953f0 = c3386eg;
    }

    public final void setPlacementId(long j10) {
        this.W = j10;
    }

    public final void setPreloadView(boolean z10) {
    }

    public void setReferenceContainer(@Nullable C c10) {
        this.f26963k0 = c10;
    }

    public final void setRenderViewEventListener(@Nullable AbstractC3388ei abstractC3388ei) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).c(str, "setRenderViewEventListener " + this);
        }
        this.f26988x = abstractC3388ei;
    }

    public final void setRenderViewTelemetry(@Nullable C3589mi c3589mi) {
        this.f26948d0 = c3589mi;
    }

    public final void setScrollable(boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).c(str, "setScrollable " + this);
        }
        setScrollContainer(z10);
        setVerticalScrollBarEnabled(z10);
        setHorizontalScrollBarEnabled(z10);
    }

    public final void setShouldFireLandingPageBeacons(boolean z10) {
        this.M0 = z10;
    }

    public void setTelemetryManagerMap(@Nullable Map<String, C3696r1> map) {
        this.P0 = map;
    }

    @VisibleForTesting
    public final void setUnloaded(boolean z10) {
        this.O0 = z10;
    }

    public final void setUseCustomClose(boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "setUseCustomClose " + this + com.ironsource.Z7.f30794r + z10);
        }
        this.G = z10;
    }

    public void setViewTouchTimestamp(long j10) {
        this.f26954g = j10;
    }

    public final void setWatermark(@NotNull final WatermarkData watermarkData) {
        tn.p.k(watermarkData, "watermarkData");
        if (!getAdConfig().getWatermarkEnabled()) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
            if (interfaceC3580m9 != null) {
                String str = f26937g1;
                tn.p.j(str, "TAG");
                ((C3605n9) interfaceC3580m9).c(str, "Watermark disabled from config. ignoring...");
                return;
            }
            return;
        }
        final byte[] bArrDecode = Base64.decode(watermarkData.getWatermarkBase64EncodedString(), 0);
        tn.p.j(bArrDecode, "decode(...)");
        if (!this.f26942b0.get()) {
            this.f26942b0.set(true);
            this.f26945c0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: n9.b6
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    GestureDetectorOnGestureListenerC3337ci.a(this.f75299b, bArrDecode, watermarkData);
                }
            };
            getViewTreeObserver().addOnGlobalLayoutListener(this.f26945c0);
        } else {
            InterfaceC3580m9 interfaceC3580m92 = this.f26958i;
            if (interfaceC3580m92 != null) {
                String str2 = f26937g1;
                tn.p.j(str2, "TAG");
                ((C3605n9) interfaceC3580m92).c(str2, "Watermark layout listener already set; ignoring duplicate setWatermark call");
            }
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "stopLoading " + this);
        }
        if (this.M.get()) {
            return;
        }
        super.stopLoading();
    }

    public final void t() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "fireEvent " + this + com.ironsource.Z7.f30794r + 2);
        }
    }

    public void u() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "fireImpression " + this);
        }
        if (tn.p.f("video", this.F0) || tn.p.f("audio", this.F0)) {
            return;
        }
        F();
        g("window.imraidview.impressionRendered();");
        getListener().c(this);
    }

    public final void v() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "fireOnUserInteraction " + this);
        }
        g("window.imraidview.onUserInteraction();");
    }

    public final void w() {
        InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
        if (interfaceC3580m9 != null) {
            String str = f26937g1;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "firePopupBlockedEvent " + this);
        }
        g("window.mraidview.popupBlocked('popupBlocked')");
    }

    public final void x() {
        Activity fullScreenActivity = getFullScreenActivity();
        if (fullScreenActivity != null) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26958i;
            if (interfaceC3580m9 != null) {
                String str = f26937g1;
                tn.p.j(str, "TAG");
                ((C3605n9) interfaceC3580m9).c(str, "fullScreenActivity is not null and finishing");
            }
            InMobiAdActivity inMobiAdActivity = fullScreenActivity instanceof InMobiAdActivity ? (InMobiAdActivity) fullScreenActivity : null;
            if (inMobiAdActivity != null) {
                inMobiAdActivity.a();
            } else {
                fullScreenActivity.finish();
            }
        }
    }

    public final boolean z() {
        if (tn.p.f(getAdType(), "banner") && getAdConfig().getMraid3Config().getBannerEnabled()) {
            return true;
        }
        return tn.p.f(getAdType(), ImpressionLog.f51753w) && getAdConfig().getMraid3Config().getInterstitialEnabled();
    }
}
