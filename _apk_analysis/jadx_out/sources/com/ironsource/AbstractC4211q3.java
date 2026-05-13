package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C4256sf;
import com.ironsource.E0;
import com.ironsource.O8;
import com.ironsource.R0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC4211q3<Listener extends R0> implements NetworkInitializationListener, C4256sf.a, D0, AdapterAdListener, O8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4135m0 f33298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Listener f33299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseAdAdapter<?, AdapterAdListener> f33300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public E0 f33301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f33302e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C4041gd f33304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C3957c1 f33305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public JSONObject f33306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f33307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AdData f33308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Long f33309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C4122l5 f33310m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C4157n2 f33312o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final InterfaceC4204pd f33313p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AtomicBoolean f33303f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C4256sf f33311n = new C4256sf(TimeUnit.SECONDS.toMillis(s()));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f33314q = new Object();

    /* JADX INFO: renamed from: com.ironsource.q3$a */
    public class a extends AbstractRunnableC4078ie {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            AbstractC4211q3.this.L();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.q3$b */
    public class b extends AbstractRunnableC4078ie {
        public b() {
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            AbstractC4211q3.this.K();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.q3$c */
    public class c extends AbstractRunnableC4078ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f33317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f33318c;

        public c(int i10, String str) {
            this.f33317b = i10;
            this.f33318c = str;
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            AbstractC4211q3.this.a(this.f33317b, this.f33318c);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.q3$d */
    public class d extends AbstractRunnableC4078ie {
        public d() {
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            AbstractC4211q3.this.I();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.q3$e */
    public class e extends AbstractRunnableC4078ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdapterErrorType f33321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f33322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f33323d;

        public e(AdapterErrorType adapterErrorType, int i10, String str) {
            this.f33321b = adapterErrorType;
            this.f33322c = i10;
            this.f33323d = str;
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            AbstractC4211q3.this.a(this.f33321b, this.f33322c, this.f33323d);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.q3$f */
    public class f extends AbstractRunnableC4078ie {
        public f() {
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            AbstractC4211q3.this.J();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.q3$g */
    public class g extends AbstractRunnableC4078ie {
        public g() {
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            AbstractC4211q3.this.H();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.q3$h */
    public enum h {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC4211q3(InterfaceC4204pd interfaceC4204pd, C4135m0 c4135m0, BaseAdAdapter<?, ?> baseAdAdapter, C3957c1 c3957c1, C4157n2 c4157n2, Listener listener) {
        this.f33298a = c4135m0;
        this.f33299b = listener;
        this.f33301d = new E0(c4135m0.a(), E0.b.PROVIDER, this);
        this.f33305h = c3957c1;
        this.f33306i = c3957c1.c();
        this.f33300c = baseAdAdapter;
        this.f33312o = c4157n2;
        this.f33313p = interfaceC4204pd;
        a(h.NONE);
    }

    private boolean D() {
        return this.f33302e == h.INIT_IN_PROGRESS;
    }

    private void F() {
        IronLog.INTERNAL.verbose(d());
        a(h.LOADING);
        a(false);
        try {
            this.f33311n.a((C4256sf.a) this);
            G();
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            String str = "unexpected error while calling adapter.loadAd() - " + th2.getMessage() + " - state = " + this.f33302e;
            IronLog.INTERNAL.error(a(str));
            E0 e02 = this.f33301d;
            if (e02 != null) {
                e02.f29209j.g(str);
            }
            onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        IronLog.INTERNAL.verbose(d());
        E0 e02 = this.f33301d;
        if (e02 != null) {
            e02.f29208i.a(j());
        }
        this.f33299b.e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        boolean zO;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        C4256sf c4256sf = this.f33311n;
        if (c4256sf != null) {
            c4256sf.e();
        }
        synchronized (this.f33314q) {
            h hVar = this.f33302e;
            zO = false;
            if (hVar == h.LOADING) {
                long jA = C4122l5.a(this.f33310m);
                ironLog.verbose(a("Load duration = " + jA));
                if (this.f33301d != null) {
                    if (v()) {
                        this.f33301d.f29205f.a(jA);
                    } else {
                        this.f33301d.f29205f.a(jA, false);
                    }
                }
                a(h.LOADED);
                zO = O();
            } else if (hVar != h.FAILED) {
                ironLog.error(a(String.format("unexpected load success for %s, state - %s", k(), this.f33302e)));
                String str = String.format("unexpected load success, state - %s", this.f33302e);
                if (this.f33301d != null) {
                    if (v()) {
                        this.f33301d.f29209j.s(str);
                    } else {
                        this.f33301d.f29209j.p(str);
                    }
                }
            }
        }
        if (zO) {
            this.f33299b.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog.INTERNAL.verbose(d());
        a(h.SHOWING);
        E0 e02 = this.f33301d;
        if (e02 != null) {
            e02.f29208i.g(j());
        }
        this.f33299b.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (D()) {
            C4256sf c4256sf = this.f33311n;
            if (c4256sf != null) {
                c4256sf.e();
            }
            a(h.READY_TO_LOAD);
            F();
            return;
        }
        if (this.f33302e == h.FAILED) {
            return;
        }
        ironLog.error(a(String.format("unexpected init success for %s, state - %s", k(), this.f33302e)));
        if (this.f33301d != null) {
            this.f33301d.f29209j.n(String.format("unexpected init success, state - %s", this.f33302e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        long jA = C4122l5.a(this.f33310m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + jA + ", state = " + this.f33302e + ", isBidder = " + w()));
        synchronized (this.f33314q) {
            if (!z()) {
                ironLog.error(a(String.format("unexpected timeout for %s, state - %s, error - %s", k(), this.f33302e, 1025)));
                if (this.f33301d != null) {
                    this.f33301d.f29209j.u(String.format("unexpected timeout, state - %s, error - %s", this.f33302e, 1025));
                }
            } else {
                a(h.FAILED);
                E0 e02 = this.f33301d;
                if (e02 != null) {
                    e02.f29205f.a(jA, 1025, false);
                    this.f33301d.f29205f.a(jA, 1025, "time out", false);
                }
                this.f33299b.a(ErrorBuilder.buildLoadFailedError("time out"), this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i10 + ", " + str));
        if (D()) {
            C4256sf c4256sf = this.f33311n;
            if (c4256sf != null) {
                c4256sf.e();
            }
            a(h.FAILED);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i10, str, C4122l5.a(this.f33310m));
            this.f33299b.a(new IronSourceError(i10, str), this);
            return;
        }
        if (this.f33302e == h.FAILED) {
            return;
        }
        ironLog.error(a(String.format("unexpected init failed for %s, state - %s, error - %s, %s", k(), this.f33302e, Integer.valueOf(i10), str)));
        if (this.f33301d != null) {
            this.f33301d.f29209j.m(String.format("unexpected init failed, state - %s, error - %s, %s", this.f33302e, Integer.valueOf(i10), str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NotNull AdapterErrorType adapterErrorType, int i10, String str) {
        long jA = C4122l5.a(this.f33310m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + jA + ", error = " + i10 + ", " + str));
        C4256sf c4256sf = this.f33311n;
        if (c4256sf != null) {
            c4256sf.e();
        }
        synchronized (this.f33314q) {
            h hVar = this.f33302e;
            if (hVar == h.LOADING) {
                a(adapterErrorType, i10, str, jA);
                a(h.FAILED);
                this.f33299b.a(new IronSourceError(i10, str), this);
                return;
            }
            if (hVar == h.FAILED) {
                a(adapterErrorType, i10, str, jA);
                return;
            }
            if (hVar == h.LOADED && adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                this.f33309l = Long.valueOf(System.currentTimeMillis());
                ironLog.error(a(String.format("ad expired for %s, state = %s", this.f33305h.f(), this.f33302e)));
                E0 e02 = this.f33301d;
                if (e02 != null) {
                    e02.f29209j.a(String.format("ad expired, state = %s", this.f33302e));
                }
                return;
            }
            ironLog.error(a(String.format("unexpected load failed for %s, state - %s, error - %s, %s", k(), this.f33302e, Integer.valueOf(i10), str)));
            String str2 = String.format("unexpected load failed, state - %s, error - %s, %s", this.f33302e, Integer.valueOf(i10), str);
            if (this.f33301d != null) {
                if (v()) {
                    this.f33301d.f29209j.r(str2);
                } else if (this.f33298a.a() != IronSource.a.REWARDED_VIDEO || this.f33302e != h.SHOWING) {
                    this.f33301d.f29209j.o(str2);
                }
            }
        }
    }

    private void a(AdapterErrorType adapterErrorType, int i10, String str, long j10) {
        if (this.f33301d != null) {
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                if (v()) {
                    this.f33301d.f29205f.b(j10, i10);
                    return;
                } else {
                    this.f33301d.f29205f.a(j10, i10);
                    return;
                }
            }
            if (TextUtils.isEmpty(str)) {
                this.f33301d.f29205f.a(j10, i10, false);
            } else if (v()) {
                this.f33301d.f29205f.a(j10, i10, str);
            } else {
                this.f33301d.f29205f.a(j10, i10, str, false);
            }
        }
    }

    private boolean b(B0 b02) {
        return new ArrayList(Arrays.asList(B0.LOAD_AD, B0.LOAD_AD_SUCCESS, B0.LOAD_AD_FAILED, B0.LOAD_AD_FAILED_WITH_REASON, B0.LOAD_AD_NO_FILL, B0.RELOAD_AD, B0.RELOAD_AD_SUCCESS, B0.RELOAD_AD_FAILED_WITH_REASON, B0.RELOAD_AD_NO_FILL, B0.DESTROY_AD, B0.AD_PRESENT_SCREEN, B0.AD_DISMISS_SCREEN, B0.AD_LEFT_APPLICATION, B0.AD_OPENED, B0.AD_CLOSED, B0.SHOW_AD, B0.SHOW_AD_FAILED, B0.AD_CLICKED, B0.AD_REWARDED)).contains(b02);
    }

    private int o() {
        return 1;
    }

    private int s() {
        C4157n2 c4157n2 = this.f33312o;
        if (c4157n2 == null) {
            return this.f33298a.f();
        }
        Integer numF = c4157n2.f();
        int iF = (numF == null || numF.intValue() <= 0) ? this.f33298a.f() : numF.intValue();
        IronLog.INTERNAL.verbose(a("Load timeout for " + this.f33312o.c() + " - " + iF + " seconds"));
        return iF;
    }

    public AtomicBoolean A() {
        return this.f33303f;
    }

    public boolean B() {
        return y();
    }

    public boolean C() {
        return this.f33302e == h.SHOWING;
    }

    public void E() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        C4157n2 c4157n2I = i();
        String strK = c4157n2I.k();
        Map<String, Object> mapA = C4127la.a(c4157n2I.a());
        mapA.put("adUnit", this.f33298a.a());
        b(strK);
        try {
            boolean z10 = false;
            if (v()) {
                this.f33301d.f29205f.a();
            } else {
                this.f33301d.f29205f.a(false);
            }
            this.f33309l = null;
            this.f33310m = new C4122l5();
            this.f33308k = a(strK, mapA);
            synchronized (this.f33314q) {
                if (this.f33302e != h.NONE) {
                    z10 = true;
                } else {
                    a(h.INIT_IN_PROGRESS);
                }
            }
            if (z10) {
                String str = "loadAd - incorrect state while loading, state = " + this.f33302e;
                ironLog.error(a(str));
                this.f33301d.f29209j.g(str);
                onInitFailed(A0.c(this.f33298a.a()), str);
                return;
            }
            this.f33311n.a((C4256sf.a) this);
            AdapterBaseInterface networkAdapter = this.f33300c.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.f33308k, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str2 = "loadAd - network adapter not available " + k();
            ironLog.error(a(str2));
            onInitFailed(A0.c(this.f33298a.a()), str2);
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            String str3 = "loadAd - exception = " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str3));
            E0 e02 = this.f33301d;
            if (e02 != null) {
                e02.f29209j.g(str3);
            }
            onInitFailed(A0.c(this.f33298a.a()), str3);
        }
    }

    public void G() {
        Object obj = this.f33300c;
        if (obj instanceof AdapterAdFullScreenInterface) {
            ((AdapterAdFullScreenInterface) obj).loadAd(this.f33308k, ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[Catch: all -> 0x0066, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0006, B:12:0x0052, B:14:0x0056, B:15:0x005b, B:17:0x005f, B:18:0x0064, B:9:0x000a, B:11:0x004b), top: B:23:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f A[Catch: all -> 0x0066, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0006, B:12:0x0052, B:14:0x0056, B:15:0x005b, B:17:0x005f, B:18:0x0064, B:9:0x000a, B:11:0x004b), top: B:23:0x0001, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> r0 = r4.f33300c     // Catch: java.lang.Throwable -> L66
            r1 = 0
            if (r0 == 0) goto L52
            r4.f33300c = r1     // Catch: java.lang.Exception -> L9 java.lang.Throwable -> L66
            goto L52
        L9:
            r0 = move-exception
            com.ironsource.r4 r2 = com.ironsource.C4228r4.d()     // Catch: java.lang.Throwable -> L66
            r2.a(r0)     // Catch: java.lang.Throwable -> L66
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            r2.<init>()     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = "Exception while calling adapter.releaseMemory() from "
            r2.append(r3)     // Catch: java.lang.Throwable -> L66
            com.ironsource.c1 r3 = r4.f33305h     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = r3.f()     // Catch: java.lang.Throwable -> L66
            r2.append(r3)     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = " - "
            r2.append(r3)     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L66
            r2.append(r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = " - state = "
            r2.append(r0)     // Catch: java.lang.Throwable -> L66
            com.ironsource.q3$h r0 = r4.f33302e     // Catch: java.lang.Throwable -> L66
            r2.append(r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L66
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = r4.a(r0)     // Catch: java.lang.Throwable -> L66
            r2.error(r3)     // Catch: java.lang.Throwable -> L66
            com.ironsource.E0 r2 = r4.f33301d     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L52
            com.ironsource.E0 r2 = r4.f33301d     // Catch: java.lang.Throwable -> L66
            com.ironsource.bg r2 = r2.f29209j     // Catch: java.lang.Throwable -> L66
            r2.g(r0)     // Catch: java.lang.Throwable -> L66
        L52:
            com.ironsource.E0 r0 = r4.f33301d     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L5b
            r0.f()     // Catch: java.lang.Throwable -> L66
            r4.f33301d = r1     // Catch: java.lang.Throwable -> L66
        L5b:
            com.ironsource.sf r0 = r4.f33311n     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L64
            r0.d()     // Catch: java.lang.Throwable -> L66
            r4.f33311n = r1     // Catch: java.lang.Throwable -> L66
        L64:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L66
            return
        L66:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L66
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.AbstractC4211q3.M():void");
    }

    public void N() {
        IronLog.INTERNAL.verbose(d());
        E0 e02 = this.f33301d;
        if (e02 != null) {
            e02.f29208i.a();
        }
    }

    public boolean O() {
        return true;
    }

    public AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    public String a(String str) {
        String str2 = this.f33298a.a().name() + " - " + k() + " - state = " + this.f33302e;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    public Map<String, Object> a(B0 b02) {
        HashMap map = new HashMap();
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f33300c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter2 = this.f33300c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(a("could not get adapter version for event data" + k()));
        }
        map.put("spId", this.f33305h.i());
        map.put(IronSourceConstants.EVENTS_PROVIDER, this.f33305h.a());
        map.put("instanceType", Integer.valueOf(l()));
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(o()));
        if (!TextUtils.isEmpty(this.f33307j)) {
            map.put("dynamicDemandSource", this.f33307j);
        }
        map.put("sessionDepth", r());
        if (this.f33298a.e() != null && this.f33298a.e().length() > 0) {
            map.put("genericParams", this.f33298a.e());
        }
        if (!TextUtils.isEmpty(this.f33298a.c())) {
            map.put("auctionId", this.f33298a.c());
        }
        if (b(b02)) {
            map.put("auctionTrials", Integer.valueOf(this.f33298a.d()));
            if (!TextUtils.isEmpty(this.f33298a.b())) {
                map.put(IronSourceConstants.AUCTION_FALLBACK, this.f33298a.b());
            }
        }
        if (!TextUtils.isEmpty(this.f33298a.g().getCustomNetwork())) {
            map.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f33298a.g().getCustomNetwork());
        }
        return map;
    }

    public Map<String, Object> a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("userId", this.f33298a.i());
        return map;
    }

    @Override // com.ironsource.C4256sf.a
    public void a() {
        if (this.f33313p.e()) {
            this.f33313p.a(new a());
        } else {
            L();
        }
    }

    public void a(h hVar) {
        IronLog.INTERNAL.verbose(d());
        this.f33302e = hVar;
    }

    public void a(boolean z10) {
        this.f33303f.set(z10);
    }

    @Override // com.ironsource.O8.b
    public int b() {
        return this.f33305h.e();
    }

    public void b(String str) {
        this.f33307j = com.ironsource.mediationsdk.d.b().c(str);
    }

    @Override // com.ironsource.O8.b
    public String c() {
        return this.f33305h.f();
    }

    public String d() {
        return a((String) null);
    }

    public Long e() {
        return this.f33309l;
    }

    public AdInfo f() {
        return new AdInfo(this.f33312o.a(j()), this.f33312o.d());
    }

    public IronSource.a g() {
        return this.f33298a.a();
    }

    public String h() {
        return this.f33298a.c();
    }

    public C4157n2 i() {
        return this.f33312o;
    }

    public String j() {
        C4041gd c4041gd = this.f33304g;
        return c4041gd == null ? "" : c4041gd.c();
    }

    public String k() {
        return String.format("%s %s", c(), Integer.valueOf(hashCode()));
    }

    public int l() {
        return this.f33305h.d();
    }

    public String m() {
        return this.f33305h.h().isMultipleInstances() ? this.f33305h.h().getProviderTypeForReflection() : this.f33305h.f();
    }

    public String n() {
        return this.f33305h.g();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        if (this.f33313p.e()) {
            this.f33313p.a(new g());
        } else {
            H();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(@NotNull AdapterErrorType adapterErrorType, int i10, String str) {
        if (this.f33313p.e()) {
            this.f33313p.a(new e(adapterErrorType, i10, str));
        } else {
            a(adapterErrorType, i10, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        if (this.f33313p.e()) {
            this.f33313p.a(new d());
        } else {
            I();
        }
    }

    public void onAdOpened() {
        if (this.f33313p.e()) {
            this.f33313p.a(new f());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i10, String str) {
        if (this.f33313p.e()) {
            this.f33313p.a(new c(i10, str));
        } else {
            a(i10, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        if (this.f33313p.e()) {
            this.f33313p.a(new b());
        } else {
            K();
        }
    }

    public NetworkSettings p() {
        return this.f33298a.g();
    }

    public Map<String, Object> q() {
        HashMap map = new HashMap();
        map.putAll(C4127la.a(this.f33306i));
        return map;
    }

    public Integer r() {
        C4135m0 c4135m0 = this.f33298a;
        if (c4135m0 != null) {
            return Integer.valueOf(c4135m0.h());
        }
        return null;
    }

    public h t() {
        return this.f33302e;
    }

    public InterfaceC4204pd u() {
        return this.f33313p;
    }

    public boolean v() {
        return false;
    }

    public boolean w() {
        return this.f33305h.j();
    }

    public boolean x() {
        return this.f33302e == h.FAILED;
    }

    public boolean y() {
        return this.f33302e == h.LOADED;
    }

    public boolean z() {
        h hVar = this.f33302e;
        return hVar == h.INIT_IN_PROGRESS || hVar == h.LOADING;
    }
}
