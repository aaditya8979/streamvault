package com.ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4208q0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class A implements AdapterAdListener, NetworkInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final W0 f28687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final B f28688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final H f28689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private WeakReference<E> f28690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private F f28691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final BaseAdAdapter<?, ?> f28692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private C4122l5 f28693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private AbstractRunnableC4078ie f28694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f28695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f28696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f28697k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f28698l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f28699m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final AdData f28700n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final C4157n2 f28701o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private final C4157n2 f28702p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f28703q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final String f28704r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f28705s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final String f28706t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final IronSource.a f28707u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f28708v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final I f28709w;

    public static final class a extends AbstractRunnableC4078ie {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            long jA = C4122l5.a(A.this.f28693g);
            IronLog ironLog = IronLog.INTERNAL;
            A a10 = A.this;
            ironLog.verbose(a10.a("Load duration = " + jA + ", isBidder = " + a10.u()));
            A.this.f28699m = true;
            A.this.f().e().e().a(jA, 1025, false);
            A.this.f().e().e().a(jA, 1025, "time out", false);
            A a11 = A.this;
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("time out");
            tn.p.j(ironSourceErrorBuildLoadFailedError, "buildLoadFailedError(errorMessage)");
            a11.a(ironSourceErrorBuildLoadFailedError);
        }
    }

    public A(@NotNull W0 w02, @NotNull B b10, @NotNull H h10, @NotNull E e10) {
        tn.p.k(w02, "adTools");
        tn.p.k(b10, "instanceData");
        tn.p.k(h10, "adInstancePayload");
        tn.p.k(e10, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f28687a = w02;
        this.f28688b = b10;
        this.f28689c = h10;
        this.f28690d = new WeakReference<>(e10);
        this.f28695i = new LinkedHashMap();
        this.f28700n = b10.g();
        this.f28701o = b10.n();
        this.f28702p = b10.p();
        this.f28703q = b10.j().j();
        this.f28704r = b10.r();
        this.f28705s = b10.s();
        this.f28706t = b10.w();
        this.f28707u = b10.h();
        this.f28708v = b10.v();
        this.f28709w = b10.t();
        BaseAdAdapter<?, ?> baseAdAdapterA = a(b10);
        this.f28692f = baseAdAdapterA;
        w02.e().a(new C(w02, b10, baseAdAdapterA));
        w02.e().a(new U1(b10.k()));
    }

    private final void B() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        try {
            G();
            A();
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            String str = "unexpected error while calling adapter.loadAd() - " + th2.getMessage();
            IronLog.INTERNAL.error(a(str));
            this.f28687a.e().h().g(str);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    private final void C() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        this.f28687a.e().a().a(k());
        E e10 = this.f28690d.get();
        if (e10 != null) {
            e10.a(this);
        }
    }

    private final void D() {
        IronLog ironLog = IronLog.INTERNAL;
        F f10 = null;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        H();
        if (this.f28699m) {
            c();
            this.f28687a.e().h().f("instance load success after it was already failed");
            return;
        }
        if (this.f28697k) {
            this.f28687a.e().h().f("instance load success after it was already loaded");
            return;
        }
        this.f28697k = true;
        long jA = C4122l5.a(this.f28693g);
        ironLog.verbose(a("Load duration = " + jA));
        this.f28687a.e().e().a(jA, false);
        a(C4208q0.a.LoadedSuccessfully);
        F f11 = this.f28691e;
        if (f11 == null) {
            tn.p.C("loadListener");
        } else {
            f10 = f11;
        }
        f10.b(this);
    }

    private final void E() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        if (this.f28698l) {
            this.f28687a.e().h().f("instance opened after it was already opened");
            return;
        }
        this.f28698l = true;
        this.f28687a.e().a().g(k());
        a(C4208q0.a.ShowedSuccessfully);
        E e10 = this.f28690d.get();
        if (e10 != null) {
            e10.b(this);
        }
    }

    private final void F() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        H();
        if (this.f28699m) {
            return;
        }
        B();
    }

    private final void G() {
        H();
        a aVarA = a();
        this.f28694h = aVarA;
        if (aVarA != null) {
            this.f28687a.a((AbstractRunnableC4078ie) aVarA, TimeUnit.SECONDS.toMillis(o()));
        }
    }

    private final void H() {
        AbstractRunnableC4078ie abstractRunnableC4078ie = this.f28694h;
        if (abstractRunnableC4078ie != null) {
            this.f28687a.b(abstractRunnableC4078ie);
            this.f28694h = null;
        }
    }

    private final a a() {
        return new a();
    }

    private final BaseAdAdapter<?, ?> a(B b10) {
        return b10.i().e().q() ? this.f28689c.b() : this.f28687a.a(b10);
    }

    public static /* synthetic */ String a(A a10, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return a10.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(A a10, int i10, String str) {
        tn.p.k(a10, "this$0");
        tn.p.k(str, "$errorMessage");
        a10.a(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(A a10, AdapterErrorType adapterErrorType, int i10, String str) {
        tn.p.k(a10, "this$0");
        tn.p.k(adapterErrorType, "$adapterErrorType");
        tn.p.k(str, "$errorMessage");
        a10.a(adapterErrorType, i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(A a10, Map map) {
        tn.p.k(a10, "this$0");
        tn.p.k(map, "$extraData");
        a10.f28695i.putAll(map);
        a10.D();
    }

    private final void a(AdapterErrorType adapterErrorType) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
            this.f28687a.e().h().a("");
        } else {
            this.f28687a.e().h().f("instance load failed after it was already loaded");
        }
    }

    private final void a(AdapterErrorType adapterErrorType, int i10, String str) {
        long jA = C4122l5.a(this.f28693g);
        IronLog.INTERNAL.verbose(a("Load duration = " + jA + ", error = " + i10 + ", " + str));
        H();
        if (this.f28699m) {
            c();
            a(adapterErrorType, i10, str, jA);
        } else {
            if (this.f28697k) {
                a(adapterErrorType);
                return;
            }
            this.f28699m = true;
            c();
            a(adapterErrorType, i10, str, jA);
            a(new IronSourceError(i10, str));
        }
    }

    private final void a(AdapterErrorType adapterErrorType, int i10, String str, long j10) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
            this.f28687a.e().e().a(j10, i10);
        } else if (str == null || str.length() == 0) {
            this.f28687a.e().e().a(j10, i10, false);
        } else {
            this.f28687a.e().e().a(j10, i10, str, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(IronSourceError ironSourceError) {
        a(C4208q0.a.FailedToLoad);
        F f10 = this.f28691e;
        if (f10 == null) {
            tn.p.C("loadListener");
            f10 = null;
        }
        f10.a(ironSourceError, this);
    }

    private final void b(int i10, String str) {
        IronLog.INTERNAL.verbose(a("error = " + i10 + ", " + str));
        H();
        this.f28699m = true;
        a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i10, str, C4122l5.a(this.f28693g));
        a(new IronSourceError(i10, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(A a10) {
        tn.p.k(a10, "this$0");
        a10.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(A a10, int i10, String str) {
        tn.p.k(a10, "this$0");
        a10.b(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(A a10, Map map) {
        tn.p.k(a10, "this$0");
        tn.p.k(map, "$extraData");
        a10.f28695i.putAll(map);
        a10.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(A a10) {
        tn.p.k(a10, "this$0");
        a10.F();
    }

    private final int o() {
        Integer numF = this.f28688b.n().f();
        return (numF == null || numF.intValue() <= 0) ? this.f28688b.i().h() : numF.intValue();
    }

    public abstract void A();

    @NotNull
    public final String a(@Nullable String str) {
        return this.f28687a.a(str, this.f28706t);
    }

    public final void a(int i10, @NotNull String str) {
        tn.p.k(str, "errorMessage");
        IronLog.INTERNAL.verbose(a("Show error = " + i10 + ", " + str));
        this.f28699m = true;
        this.f28687a.e().a().a(k(), i10, str, null);
        a(C4208q0.a.FailedToShow);
        E e10 = this.f28690d.get();
        if (e10 != null) {
            e10.a(this, new IronSourceError(i10, str));
        }
        c();
    }

    public final void a(@NotNull F f10) {
        tn.p.k(f10, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        this.f28691e = f10;
        this.f28696j = true;
        try {
            this.f28687a.e().e().a(false);
            this.f28693g = new C4122l5();
            G();
            BaseAdAdapter<?, ?> baseAdAdapter = this.f28692f;
            tn.p.h(baseAdAdapter);
            AdapterBaseInterface networkAdapter = baseAdAdapter.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.f28688b.g(), ContextProvider.getInstance().getApplicationContext(), this);
            } else {
                String str = "loadAd - network adapter not available " + this.f28706t;
                ironLog.error(a(str));
                b(A0.c(this.f28688b.h()), str);
            }
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            String str2 = "loadAd - exception = " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str2));
            this.f28687a.e().h().g(str2);
            b(A0.c(this.f28688b.h()), str2);
        }
    }

    public abstract void a(@NotNull J j10);

    public final void a(@NotNull C4208q0.a aVar) {
        tn.p.k(aVar, "performance");
        this.f28688b.a(aVar);
    }

    public final void a(@NotNull Runnable runnable) {
        tn.p.k(runnable, "callback");
        this.f28687a.a(runnable);
    }

    public final void a(boolean z10) {
        this.f28687a.e().a().a(z10);
    }

    public void b() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        H();
        this.f28687a.e().e().a(this.f28708v);
    }

    public void c() {
    }

    @NotNull
    public final IronSource.a d() {
        return this.f28707u;
    }

    @NotNull
    public LevelPlayAdInfo e() {
        String string = this.f28688b.i().b().b().toString();
        tn.p.j(string, "instanceData.adUnitData.…roperties.adId.toString()");
        String strC = this.f28688b.i().b().c();
        String string2 = this.f28688b.h().toString();
        tn.p.j(string2, "instanceData.adFormat.toString()");
        return new LevelPlayAdInfo(string, strC, string2, this.f28688b.n(), null, this.f28688b.i().l(), kotlin.collections.a.z(this.f28695i));
    }

    @NotNull
    public final W0 f() {
        return this.f28687a;
    }

    @Nullable
    public final BaseAdAdapter<?, ?> g() {
        return this.f28692f;
    }

    @NotNull
    public final C4157n2 h() {
        return this.f28701o;
    }

    @NotNull
    public final AdData i() {
        return this.f28700n;
    }

    @Nullable
    public final C4041gd j() {
        return this.f28688b.i().b().f();
    }

    @NotNull
    public final String k() {
        return this.f28688b.i().l();
    }

    @NotNull
    public final Map<String, Object> l() {
        return this.f28695i;
    }

    @Nullable
    public final C4157n2 m() {
        return this.f28702p;
    }

    @NotNull
    public final B n() {
        return this.f28688b;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        a(new Runnable() { // from class: com.ironsource.ch
            @Override // java.lang.Runnable
            public final void run() {
                A.b(this.f31161b);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(@NotNull final AdapterErrorType adapterErrorType, final int i10, @NotNull final String str) {
        tn.p.k(adapterErrorType, "adapterErrorType");
        tn.p.k(str, "errorMessage");
        a(new Runnable() { // from class: com.ironsource.gh
            @Override // java.lang.Runnable
            public final void run() {
                A.a(this.f31818b, adapterErrorType, i10, str);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        onAdLoadSuccess(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess(@NotNull final Map<String, Object> map) {
        tn.p.k(map, "extraData");
        a(new Runnable() { // from class: com.ironsource.ah
            @Override // java.lang.Runnable
            public final void run() {
                A.a(this.f30997b, map);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(@NotNull final Map<String, Object> map) {
        tn.p.k(map, "extraData");
        a(new Runnable() { // from class: com.ironsource.eh
            @Override // java.lang.Runnable
            public final void run() {
                A.b(this.f31595b, map);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(final int i10, @NotNull final String str) {
        tn.p.k(str, "errorMessage");
        a(new Runnable() { // from class: com.ironsource.bh
            @Override // java.lang.Runnable
            public final void run() {
                A.a(this.f31068b, i10, str);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(final int i10, @Nullable final String str) {
        a(new Runnable() { // from class: com.ironsource.dh
            @Override // java.lang.Runnable
            public final void run() {
                A.b(this.f31493b, i10, str);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        a(new Runnable() { // from class: com.ironsource.fh
            @Override // java.lang.Runnable
            public final void run() {
                A.c(this.f31741b);
            }
        });
    }

    @NotNull
    public final String p() {
        return this.f28704r;
    }

    @NotNull
    public final String q() {
        return this.f28706t;
    }

    public final int r() {
        return this.f28705s;
    }

    @NotNull
    public final I s() {
        return this.f28709w;
    }

    public final int t() {
        return this.f28708v;
    }

    public final boolean u() {
        return this.f28703q;
    }

    public final boolean v() {
        return this.f28699m;
    }

    public final boolean w() {
        return this.f28697k;
    }

    public final boolean x() {
        return this.f28696j;
    }

    public final boolean y() {
        return this.f28698l;
    }

    public boolean z() {
        return this.f28697k;
    }
}
