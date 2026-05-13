package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C3957c1;
import com.ironsource.C4049h3;
import com.ironsource.C4122l5;
import com.ironsource.C4127la;
import com.ironsource.C4228r4;
import com.ironsource.C4256sf;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.InterfaceC4237rd;
import com.ironsource.InterfaceC4363z3;
import com.ironsource.J9;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class z extends A implements BannerSmashListener, C4256sf.a, InterfaceC4363z3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k f32961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C4256sf f32962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f32963j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC4237rd f32964k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private q f32965l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f32966m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private JSONObject f32967n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f32968o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f32969p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C4049h3 f32970q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f32971r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private C4122l5 f32972s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f32973t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f32974u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private JSONObject f32975v;

    public enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    public z(k kVar, InterfaceC4237rd interfaceC4237rd, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i10, String str, JSONObject jSONObject, int i11, String str2, boolean z10) {
        super(new C3957c1(networkSettings, networkSettings.getBannerSettings(), IronSource.a.BANNER), abstractAdapter);
        this.f32971r = new Object();
        this.f32963j = a.NONE;
        this.f32961h = kVar;
        this.f32962i = new C4256sf(kVar.e());
        this.f32964k = interfaceC4237rd;
        this.f32314f = i10;
        this.f32966m = str;
        this.f32968o = i11;
        this.f32969p = str2;
        this.f32967n = jSONObject;
        this.f32973t = z10;
        this.f32975v = null;
        if (r()) {
            u();
        }
    }

    public z(k kVar, InterfaceC4237rd interfaceC4237rd, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i10, boolean z10) {
        this(kVar, interfaceC4237rd, networkSettings, abstractAdapter, i10, "", null, 0, "", z10);
    }

    private void A() {
        IronLog.INTERNAL.verbose();
        a(a.INIT_IN_PROGRESS);
        F();
        try {
            if (this.f32309a != null) {
                if (p()) {
                    this.f32309a.initBannerForBidding(this.f32961h.a(), this.f32961h.i(), this.f32312d, this);
                } else {
                    this.f32309a.initBanners(this.f32961h.a(), this.f32961h.i(), this.f32312d, this);
                }
            }
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            IronLog.INTERNAL.error("Exception while trying to init banner from " + this.f32309a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
            onBannerInitFailed(new IronSourceError(612, th2.getLocalizedMessage()));
            a(D5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", th2.getLocalizedMessage()}});
        }
    }

    private boolean B() {
        boolean z10;
        synchronized (this.f32971r) {
            z10 = this.f32963j == a.DESTROYED;
        }
        return z10;
    }

    private boolean C() {
        boolean z10;
        synchronized (this.f32971r) {
            z10 = this.f32963j == a.LOADED;
        }
        return z10;
    }

    private void F() {
        if (this.f32309a == null) {
            return;
        }
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.f32309a.setPluginData(pluginType);
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            IronLog.INTERNAL.error("Exception while trying to set custom params from " + this.f32309a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
            a(D5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_internal)}, new Object[]{"reason", th2.getLocalizedMessage()}});
        }
    }

    private void a(IronSourceError ironSourceError) {
        boolean z10 = ironSourceError.getErrorCode() == 606;
        if (z10) {
            a(this.f32973t ? D5.BN_INSTANCE_RELOAD_NO_FILL : D5.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"duration", Long.valueOf(C4122l5.a(this.f32972s))}});
        } else {
            a(this.f32973t ? D5.BN_INSTANCE_RELOAD_ERROR : D5.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C4122l5.a(this.f32972s))}});
        }
        InterfaceC4237rd interfaceC4237rd = this.f32964k;
        if (interfaceC4237rd != null) {
            interfaceC4237rd.a(ironSourceError, this, z10);
        }
    }

    private void a(a aVar) {
        IronLog.INTERNAL.verbose(y() + "state = " + aVar.name());
        synchronized (this.f32971r) {
            this.f32963j = aVar;
        }
    }

    private void a(String str, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (!a(a.READY_TO_LOAD, a.LOADING)) {
            ironLog.error("wrong state - state = " + this.f32963j);
            return;
        }
        this.f32972s = new C4122l5();
        a(this.f32973t ? D5.BN_INSTANCE_RELOAD : D5.BN_INSTANCE_LOAD);
        if (this.f32309a != null) {
            try {
                if (p()) {
                    this.f32309a.loadBannerForBidding(this.f32312d, this.f32975v, str, this.f32965l.getSize(), this);
                } else {
                    this.f32309a.loadBanner(this.f32312d, this.f32975v, this.f32965l.getSize(), this);
                }
            } catch (Throwable th2) {
                C4228r4.d().a(th2);
                IronLog.INTERNAL.error("Exception while trying to load banner from " + this.f32309a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
                onBannerAdLoadFailed(new IronSourceError(605, th2.getLocalizedMessage()));
                a(D5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{"reason", th2.getLocalizedMessage()}});
            }
        }
    }

    private boolean a(a aVar, a aVar2) {
        boolean z10;
        synchronized (this.f32971r) {
            if (this.f32963j == aVar) {
                IronLog.INTERNAL.verbose(y() + "set state from '" + this.f32963j + "' to '" + aVar2 + "'");
                z10 = true;
                this.f32963j = aVar2;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    private boolean b(D5 d52) {
        return d52 == D5.BN_INSTANCE_LOAD_SUCCESS || d52 == D5.BN_INSTANCE_LOAD || d52 == D5.BN_INSTANCE_RELOAD || d52 == D5.BN_INSTANCE_RELOAD_SUCCESS || d52 == D5.BN_INSTANCE_CLICK || d52 == D5.BN_INSTANCE_DESTROY || d52 == D5.BN_INSTANCE_LOAD_ERROR || d52 == D5.BN_INSTANCE_LOAD_NO_FILL || d52 == D5.BN_INSTANCE_RELOAD_NO_FILL || d52 == D5.BN_INSTANCE_PRESENT_SCREEN || d52 == D5.BN_INSTANCE_DISMISS_SCREEN || d52 == D5.BN_INSTANCE_LEAVE_APP || d52 == D5.BN_INSTANCE_SHOW;
    }

    private void u() {
        IronLog.INTERNAL.verbose("isBidder = " + p() + ", shouldEarlyInit = " + s());
        this.f32974u = true;
        A();
    }

    public void D() {
        this.f32309a.onBannerViewBound(this.f32310b.h().getBannerSettings());
    }

    public void E() {
        this.f32309a.onBannerViewWillBind(this.f32310b.h().getBannerSettings());
    }

    @Override // com.ironsource.C4256sf.a
    public void a() {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        a aVar = a.INIT_IN_PROGRESS;
        a aVar2 = a.LOAD_FAILED;
        if (a(aVar, aVar2)) {
            ironLog.verbose("init timed out");
            ironSourceError = new IronSourceError(607, "Timed out");
        } else {
            if (!a(a.LOADING, aVar2)) {
                ironLog.error("unexpected state - " + this.f32963j);
                return;
            }
            ironLog.verbose("load timed out");
            ironSourceError = new IronSourceError(608, "Timed out");
        }
        a(ironSourceError);
    }

    public void a(D5 d52) {
        a(d52, (Object[][]) null);
    }

    public void a(D5 d52, Object[][] objArr) {
        Map<String, Object> mapM = m();
        if (B()) {
            mapM.put("reason", "banner is destroyed");
        } else {
            q qVar = this.f32965l;
            if (qVar != null) {
                l.a(mapM, qVar.getSize());
            }
        }
        if (!TextUtils.isEmpty(this.f32966m)) {
            mapM.put("auctionId", this.f32966m);
        }
        JSONObject jSONObject = this.f32967n;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.f32967n);
        }
        C4049h3 c4049h3 = this.f32970q;
        if (c4049h3 != null) {
            mapM.put("placement", c4049h3.c());
        }
        if (b(d52)) {
            J9.i().a(mapM, this.f32968o, this.f32969p);
        }
        mapM.put("sessionDepth", Integer.valueOf(this.f32314f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapM.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(c() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e10));
            }
        }
        J9.i().a(new C5(d52, new JSONObject(mapM)));
    }

    public void a(q qVar, C4049h3 c4049h3, String str, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        this.f32970q = c4049h3;
        this.f32975v = jSONObject;
        if (!l.c(qVar)) {
            String str2 = qVar == null ? "banner is null" : "banner is destroyed";
            ironLog.verbose(str2);
            this.f32964k.a(new IronSourceError(610, str2), this, false);
            return;
        }
        if (this.f32309a == null) {
            ironLog.verbose("mAdapter is null");
            this.f32964k.a(new IronSourceError(611, "mAdapter is null"), this, false);
            return;
        }
        this.f32965l = qVar;
        this.f32962i.a((C4256sf.a) this);
        try {
            if (p()) {
                a(str, this.f32975v);
            } else {
                A();
            }
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            IronLog.INTERNAL.error("exception = " + th2.getLocalizedMessage());
            onBannerAdLoadFailed(new IronSourceError(605, th2.getLocalizedMessage()));
        }
    }

    @Override // com.ironsource.InterfaceC4363z3
    public void collectBiddingData(AdData adData, @NotNull Context context, @NotNull BiddingDataCallback biddingDataCallback) {
        a(D5.BN_INSTANCE_COLLECT_TOKEN);
        try {
            this.f32309a.collectBannerBiddingData(this.f32312d, adData != null ? C4127la.a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            IronLog.INTERNAL.error("Exception while trying to collectBannerBiddingData from " + this.f32309a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.A
    public IronSource.a d() {
        return IronSource.a.BANNER;
    }

    @Override // com.ironsource.mediationsdk.A
    public String k() {
        return "ProgBannerSmash";
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(f());
        a(D5.BN_INSTANCE_CLICK);
        InterfaceC4237rd interfaceC4237rd = this.f32964k;
        if (interfaceC4237rd != null) {
            interfaceC4237rd.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(f());
        a(D5.BN_INSTANCE_LEAVE_APP);
        InterfaceC4237rd interfaceC4237rd = this.f32964k;
        if (interfaceC4237rd != null) {
            interfaceC4237rd.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose(y() + "error = " + ironSourceError);
        this.f32962i.e();
        if (a(a.LOADING, a.LOAD_FAILED)) {
            a(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose(f());
        this.f32962i.e();
        if (!a(a.LOADING, a.LOADED)) {
            a(this.f32973t ? D5.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS : D5.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS);
            return;
        }
        a(this.f32973t ? D5.BN_INSTANCE_RELOAD_SUCCESS : D5.BN_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C4122l5.a(this.f32972s))}});
        InterfaceC4237rd interfaceC4237rd = this.f32964k;
        if (interfaceC4237rd != null) {
            interfaceC4237rd.a(this, view, layoutParams);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(f());
        a(D5.BN_INSTANCE_DISMISS_SCREEN);
        InterfaceC4237rd interfaceC4237rd = this.f32964k;
        if (interfaceC4237rd != null) {
            interfaceC4237rd.e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(f());
        a(D5.BN_INSTANCE_PRESENT_SCREEN);
        InterfaceC4237rd interfaceC4237rd = this.f32964k;
        if (interfaceC4237rd != null) {
            interfaceC4237rd.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (C()) {
            a(D5.BN_INSTANCE_SHOW);
            InterfaceC4237rd interfaceC4237rd = this.f32964k;
            if (interfaceC4237rd != null) {
                interfaceC4237rd.a(this);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f32963j);
        a(D5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1}, new Object[]{"reason", "Wrong State - " + this.f32963j}, new Object[]{IronSourceConstants.EVENTS_EXT1, c()}});
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(y() + "error = " + ironSourceError);
        this.f32962i.e();
        if (a(a.INIT_IN_PROGRESS, a.NONE)) {
            InterfaceC4237rd interfaceC4237rd = this.f32964k;
            if (interfaceC4237rd != null) {
                interfaceC4237rd.a(ironSourceError, this, false);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f32963j);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose(f());
        if (a(a.INIT_IN_PROGRESS, a.READY_TO_LOAD)) {
            if (this.f32974u) {
                this.f32974u = false;
            } else {
                if (p()) {
                    return;
                }
                if (l.c(this.f32965l)) {
                    a((String) null, this.f32975v);
                } else {
                    this.f32964k.a(new IronSourceError(605, this.f32965l == null ? "banner is null" : "banner is destroyed"), this, false);
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.A
    public void q() {
        this.f32962i.d();
        super.q();
    }

    public void t() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        a(D5.BN_INSTANCE_DESTROY);
        a(a.DESTROYED);
        AbstractAdapter abstractAdapter = this.f32309a;
        if (abstractAdapter == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            abstractAdapter.destroyBanner(this.f32310b.h().getBannerSettings());
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            IronLog.INTERNAL.error("Exception while trying to destroy banner from " + this.f32309a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
            a(D5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_destroy)}, new Object[]{"reason", th2.getLocalizedMessage()}});
        }
    }

    public String v() {
        return !TextUtils.isEmpty(this.f32310b.h().getAdSourceNameForEvents()) ? this.f32310b.h().getAdSourceNameForEvents() : i();
    }

    public AbstractAdapter w() {
        return this.f32309a;
    }

    public String x() {
        return this.f32966m;
    }

    public String y() {
        return String.format("%s - ", f());
    }

    public String z() {
        return this.f32310b.i();
    }
}
