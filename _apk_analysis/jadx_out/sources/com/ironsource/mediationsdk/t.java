package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3952be;
import com.ironsource.C3957c1;
import com.ironsource.C4041gd;
import com.ironsource.C4127la;
import com.ironsource.C4228r4;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.InterfaceC4353ya;
import com.ironsource.InterfaceC4363z3;
import com.ironsource.Lb;
import com.ironsource.P8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class t extends A implements RewardedVideoSmashListener, InterfaceC4363z3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f32806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC4353ya f32807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Timer f32808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f32809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f32810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f32811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C4041gd f32812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f32813o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f32814p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private JSONObject f32815q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f32816r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f32817s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f32818t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Object f32819u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f32820v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final P8.a f32821w;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            boolean z10;
            t tVar = t.this;
            b bVar = tVar.f32806h;
            b bVar2 = b.LOAD_IN_PROGRESS;
            String str = "Rewarded Video - load instance time out";
            if (bVar == bVar2 || bVar == b.INIT_IN_PROGRESS) {
                if (bVar == bVar2) {
                    i10 = 1025;
                } else {
                    i10 = 1032;
                    str = "Rewarded Video - init instance time out";
                }
                tVar.a(b.NOT_LOADED);
                i11 = i10;
                z10 = true;
            } else {
                i11 = 510;
                z10 = false;
            }
            t.this.a(str);
            if (!z10) {
                t.this.a(D5.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{"duration", Long.valueOf(t.this.v())}, new Object[]{IronSourceConstants.EVENTS_EXT1, t.this.f32806h.name()}});
                return;
            }
            t.this.a(D5.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"duration", Long.valueOf(t.this.v())}});
            t.this.a(D5.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(t.this.v())}});
            t tVar2 = t.this;
            tVar2.f32807i.d(tVar2);
        }
    }

    public enum b {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS,
        ENDED
    }

    public t(t tVar, InterfaceC4353ya interfaceC4353ya, AbstractAdapter abstractAdapter, int i10, String str, JSONObject jSONObject, int i11, String str2) {
        this(tVar.f32810l, tVar.f32811m, tVar.f32310b.h(), interfaceC4353ya, tVar.f32809k, abstractAdapter, i10);
        this.f32814p = str;
        this.f32815q = jSONObject;
        this.f32816r = i11;
        this.f32817s = str2;
    }

    public t(String str, String str2, NetworkSettings networkSettings, InterfaceC4353ya interfaceC4353ya, int i10, AbstractAdapter abstractAdapter, int i11) {
        super(new C3957c1(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.a.REWARDED_VIDEO), abstractAdapter);
        this.f32818t = new Object();
        this.f32819u = new Object();
        this.f32821w = Lb.O().h();
        this.f32810l = str;
        this.f32811m = str2;
        this.f32807i = interfaceC4353ya;
        this.f32808j = null;
        this.f32809k = i10;
        this.f32314f = i11;
        this.f32806h = b.NO_INIT;
        this.f32820v = 0L;
        if (r()) {
            t();
        }
    }

    private void C() {
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.f32309a.setPluginData(pluginType);
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            a("setCustomParams() " + th2.getMessage());
        }
    }

    private void D() {
        synchronized (this.f32819u) {
            Timer timer = new Timer();
            this.f32808j = timer;
            timer.schedule(new a(), this.f32809k * 1000);
        }
    }

    private void E() {
        synchronized (this.f32819u) {
            Timer timer = this.f32808j;
            if (timer != null) {
                timer.cancel();
                this.f32808j = null;
            }
        }
    }

    private void a(D5 d52, Object[][] objArr, boolean z10) {
        C4041gd c4041gd;
        Map<String, Object> mapM = m();
        if (!TextUtils.isEmpty(this.f32814p)) {
            mapM.put("auctionId", this.f32814p);
        }
        JSONObject jSONObject = this.f32815q;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.f32815q);
        }
        if (z10 && (c4041gd = this.f32812n) != null && !TextUtils.isEmpty(c4041gd.c())) {
            mapM.put("placement", this.f32812n.c());
        }
        if (c(d52)) {
            C3952be.i().a(mapM, this.f32816r, this.f32817s);
        }
        mapM.put("sessionDepth", Integer.valueOf(this.f32314f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapM.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, c() + " smash: RV sendProviderEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        C3952be.i().a(new C5(d52, new JSONObject(mapM)));
        if (d52 == D5.RV_INSTANCE_CLOSED) {
            this.f32821w.b(IronSource.a.REWARDED_VIDEO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar) {
        a("current state=" + this.f32806h + ", new state=" + bVar);
        synchronized (this.f32818t) {
            this.f32806h = bVar;
        }
    }

    private void b(D5 d52) {
        b(d52, null);
    }

    private boolean c(D5 d52) {
        return d52 == D5.RV_BUSINESS_INSTANCE_LOAD || d52 == D5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS || d52 == D5.RV_INSTANCE_LOAD_FAILED || d52 == D5.RV_INSTANCE_LOAD_FAILED_REASON || d52 == D5.RV_INSTANCE_LOAD_NO_FILL || d52 == D5.RV_BUSINESS_INSTANCE_OPENED || d52 == D5.RV_INSTANCE_CLOSED || d52 == D5.RV_INSTANCE_SHOW || d52 == D5.RV_INSTANCE_SHOW_FAILED || d52 == D5.RV_BUSINESS_INSTANCE_CLICKED || d52 == D5.RV_BUSINESS_INSTANCE_REWARDED;
    }

    private void t() {
        a("isBidder = " + p() + ", shouldEarlyInit = " + s());
        a(b.INIT_IN_PROGRESS);
        C();
        try {
            this.f32309a.initRewardedVideoWithCallback(this.f32810l, this.f32811m, this.f32312d, this);
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            b("initForBidding exception: " + th2.getLocalizedMessage());
            onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, th2.getLocalizedMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long v() {
        return new Date().getTime() - this.f32813o;
    }

    public boolean A() {
        if (this.f32806h != b.LOADED) {
            return false;
        }
        try {
            return this.f32309a.isRewardedVideoAvailable(this.f32312d);
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            b("isReadyToShow exception: " + th2.getLocalizedMessage());
            a(D5.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 5002}, new Object[]{"reason", th2.getLocalizedMessage()}});
            return false;
        }
    }

    public void B() {
        a(D5.RV_CAP_SESSION);
    }

    public void a(D5 d52) {
        a(d52, null, false);
    }

    public void a(D5 d52, Object[][] objArr) {
        a(d52, objArr, false);
    }

    public void a(C4041gd c4041gd) {
        E();
        a("showVideo()");
        this.f32812n = c4041gd;
        a(b.SHOW_IN_PROGRESS);
        b(D5.RV_INSTANCE_SHOW);
        try {
            this.f32309a.showRewardedVideo(this.f32312d, this);
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            b("showVideo exception: " + th2.getLocalizedMessage());
            onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, th2.getLocalizedMessage()));
        }
    }

    public void a(String str, JSONObject jSONObject) {
        b bVar;
        b bVar2;
        a("loadVideo() auctionId: " + this.f32814p + " state: " + this.f32806h);
        this.f32315g = null;
        a(false);
        synchronized (this.f32818t) {
            bVar = this.f32806h;
            bVar2 = b.LOAD_IN_PROGRESS;
            if (bVar != bVar2 && bVar != b.SHOW_IN_PROGRESS) {
                a(bVar2);
            }
        }
        if (bVar == bVar2) {
            a(D5.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 5003}, new Object[]{"reason", "load during load"}});
            return;
        }
        if (bVar == b.SHOW_IN_PROGRESS) {
            a(D5.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 5004}, new Object[]{"reason", "load during show"}});
            return;
        }
        D();
        this.f32813o = new Date().getTime();
        a(D5.RV_BUSINESS_INSTANCE_LOAD);
        try {
            if (p()) {
                this.f32309a.loadRewardedVideoForBidding(this.f32312d, jSONObject, str, this);
            } else {
                C();
                this.f32309a.initAndLoadRewardedVideo(this.f32810l, this.f32811m, this.f32312d, jSONObject, this);
            }
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            b("loadVideo exception: " + th2.getLocalizedMessage());
            a(D5.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(p() ? IronSourceConstants.errorCode_loadException : IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", th2.getLocalizedMessage()}});
        }
    }

    public void b(D5 d52, Object[][] objArr) {
        a(d52, objArr, true);
    }

    public void b(boolean z10) {
        b(D5.RV_INSTANCE_SHOW_CHANCE, new Object[][]{new Object[]{"status", z10 ? "true" : com.ironsource.mediationsdk.metadata.a.f32683h}});
    }

    @Override // com.ironsource.InterfaceC4363z3
    public void collectBiddingData(AdData adData, @NotNull Context context, @NotNull BiddingDataCallback biddingDataCallback) {
        a(D5.RV_INSTANCE_COLLECT_TOKEN);
        try {
            this.f32309a.collectRewardedVideoBiddingData(this.f32312d, adData != null ? C4127la.a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            b("collectBiddingData exception: " + th2.getLocalizedMessage());
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    @Override // com.ironsource.mediationsdk.A
    public IronSource.a d() {
        return IronSource.a.REWARDED_VIDEO;
    }

    @Override // com.ironsource.mediationsdk.A
    public String k() {
        return "LWSProgRvSmash";
    }

    @Override // com.ironsource.mediationsdk.A
    public int l() {
        return 2;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        a("onRewardedVideoAdClicked");
        this.f32807i.b(this, this.f32812n);
        b(D5.RV_BUSINESS_INSTANCE_CLICKED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        a("onRewardedVideoAdClosed");
        synchronized (this.f32818t) {
            if (this.f32806h == b.SHOW_IN_PROGRESS) {
                a(b.ENDED);
                this.f32820v = new Date().getTime();
                this.f32807i.c(this);
                return;
            }
            b(D5.RV_INSTANCE_CLOSED);
            a(D5.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_adClosed)}, new Object[]{"reason", "adClosed: " + this.f32806h}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
        a("onRewardedVideoAdEnded");
        this.f32807i.e(this);
        b(D5.RV_INSTANCE_ENDED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        a("onRewardedVideoAdOpened");
        this.f32807i.f(this);
        b(D5.RV_BUSINESS_INSTANCE_OPENED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        a("onRewardedVideoAdRewarded");
        long time = new Date().getTime();
        this.f32807i.a(this, this.f32812n);
        Map<String, Object> mapM = m();
        C4041gd c4041gd = this.f32812n;
        if (c4041gd != null) {
            mapM.put("placement", c4041gd.c());
            mapM.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f32812n.f());
            mapM.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f32812n.e()));
        }
        if (!TextUtils.isEmpty(r.m().l())) {
            mapM.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, r.m().l());
        }
        if (r.m().r() != null) {
            for (String str : r.m().r().keySet()) {
                mapM.put("custom_" + str, r.m().r().get(str));
            }
        }
        if (!TextUtils.isEmpty(this.f32814p)) {
            mapM.put("auctionId", this.f32814p);
        }
        JSONObject jSONObject = this.f32815q;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.f32815q);
        }
        D5 d52 = D5.RV_BUSINESS_INSTANCE_REWARDED;
        if (c(d52)) {
            C3952be.i().a(mapM, this.f32816r, this.f32817s);
        }
        mapM.put("sessionDepth", Integer.valueOf(this.f32314f));
        C5 c52 = new C5(d52, new JSONObject(mapM));
        c52.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.a(c52.d(), c()));
        long j10 = this.f32820v;
        if (j10 != 0) {
            long j11 = time - j10;
            a("onRewardedVideoAdRewarded timeAfterClosed=" + j11);
            c52.a("duration", Long.valueOf(j11));
        }
        C3952be.i().a(c52);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        a("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        b(D5.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        synchronized (this.f32818t) {
            if (this.f32806h == b.SHOW_IN_PROGRESS) {
                a(b.ENDED);
                this.f32807i.a(ironSourceError, this);
                return;
            }
            a(D5.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showFailed)}, new Object[]{"reason", "showFailed: " + this.f32806h}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
        a("onRewardedVideoAdStarted");
        this.f32807i.b(this);
        b(D5.RV_INSTANCE_STARTED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        a("onRewardedVideoAdVisible");
        b(D5.RV_INSTANCE_VISIBLE);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z10) {
        boolean z11;
        a("onRewardedVideoAvailabilityChanged available=" + z10 + " state=" + this.f32806h.name());
        synchronized (this.f32818t) {
            if (this.f32806h == b.LOAD_IN_PROGRESS) {
                a(z10 ? b.LOADED : b.NOT_LOADED);
                z11 = false;
            } else {
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                a(D5.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f32806h.name()}});
                return;
            } else {
                a(D5.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)}, new Object[]{"duration", Long.valueOf(v())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f32806h.name()}});
                return;
            }
        }
        E();
        a(z10 ? D5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS : D5.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(v())}});
        if (z10) {
            this.f32807i.a(this);
        } else {
            this.f32807i.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        a("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        E();
        a(D5.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT)}, new Object[]{"duration", Long.valueOf(v())}});
        a(D5.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(v())}});
        synchronized (this.f32818t) {
            if (this.f32806h == b.INIT_IN_PROGRESS) {
                a(b.NO_INIT);
                this.f32807i.d(this);
                return;
            }
            a(D5.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", "initFailed: " + this.f32806h}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
        a("onRewardedVideoInitSuccess");
        synchronized (this.f32818t) {
            if (this.f32806h == b.INIT_IN_PROGRESS) {
                a(b.NOT_LOADED);
                return;
            }
            a(D5.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initSuccess)}, new Object[]{"reason", "initSuccess: " + this.f32806h}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            a(D5.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(v())}});
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f32315g = Long.valueOf(System.currentTimeMillis());
        }
        a(D5.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(v())}});
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
    }

    public String u() {
        return this.f32814p;
    }

    public LoadWhileShowSupportState w() {
        try {
            return this.f32309a.getLoadWhileShowSupportState(this.f32312d);
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            b("Exception while calling adapter.getLoadWhileShowSupportState() - " + th2.getLocalizedMessage());
            return LoadWhileShowSupportState.NONE;
        }
    }

    public C4041gd x() {
        return this.f32812n;
    }

    public boolean y() {
        return this.f32806h == b.LOADED;
    }

    public boolean z() {
        b bVar = this.f32806h;
        return bVar == b.INIT_IN_PROGRESS || bVar == b.LOAD_IN_PROGRESS;
    }
}
