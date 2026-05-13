package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.A3;
import com.ironsource.B3;
import com.ironsource.C3952be;
import com.ironsource.C3988de;
import com.ironsource.C4002ea;
import com.ironsource.C4041gd;
import com.ironsource.C4157n2;
import com.ironsource.C4183oa;
import com.ironsource.C4193p2;
import com.ironsource.C4228r4;
import com.ironsource.C4370za;
import com.ironsource.C5;
import com.ironsource.CallableC4329x3;
import com.ironsource.Cc;
import com.ironsource.D5;
import com.ironsource.Dd;
import com.ironsource.InterfaceC4006ee;
import com.ironsource.InterfaceC4172o;
import com.ironsource.InterfaceC4353ya;
import com.ironsource.Lb;
import com.ironsource.P7;
import com.ironsource.R5;
import com.ironsource.R7;
import com.ironsource.S1;
import com.ironsource.Te;
import com.ironsource.Zd;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
class s extends m implements InterfaceC4353ya, InterfaceC4006ee, S1, R7, Cc, InterfaceC4172o {
    private e A;
    private long B;
    private Boolean C;
    private final Object D;
    private R5 E;
    private final long F;
    private final P7.a G;
    private final P7 H;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C4370za f32767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ConcurrentHashMap<String, C4157n2> f32768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap<String, h.a> f32769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C4157n2 f32770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private h f32771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f32772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private JSONObject f32773k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C3988de f32774l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f32775m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f32776n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f32777o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f32778p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f32779q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private NetworkStateReceiver f32780r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f32781s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ConcurrentHashMap<String, t> f32782t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Te f32783u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f32784v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f32785w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f32786x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f32787y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f32788z;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NetworkSettings f32789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Zd f32790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f32791c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f32792d;

        public a(NetworkSettings networkSettings, Zd zd2, String str, String str2) {
            this.f32789a = networkSettings;
            this.f32790b = zd2;
            this.f32791c = str;
            this.f32792d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.a(this.f32789a, this.f32790b, this.f32791c, this.f32792d);
        }
    }

    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            s.this.j();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.d("makeAuction()");
            s.this.f32777o = new Date().getTime();
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            s.this.b(map, arrayList, sb2, arrayList2);
            s.this.a(map, arrayList, sb2, arrayList2);
        }
    }

    public class d implements A3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f32796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f32797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f32798c;

        public d(Map map, StringBuilder sb2, List list) {
            this.f32796a = map;
            this.f32797b = sb2;
            this.f32798c = list;
        }

        @Override // com.ironsource.A3.b
        public void a(@NotNull List<B3> list, long j10, @NotNull List<String> list2) {
            s.this.c(D5.RV_COLLECT_TOKENS_COMPLETED, C4183oa.a(new Object[][]{new Object[]{"duration", Long.valueOf(j10)}}));
            for (B3 b32 : list) {
                t tVar = (t) s.this.f32782t.get(b32.c());
                if (b32.a() != null) {
                    this.f32796a.put(b32.c(), b32.a());
                    StringBuilder sb2 = this.f32797b;
                    sb2.append(b32.d());
                    sb2.append(b32.c());
                    sb2.append(StringUtils.COMMA);
                    if (tVar != null) {
                        tVar.a(D5.RV_INSTANCE_COLLECT_TOKEN_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(b32.e())}});
                    }
                } else if (tVar != null) {
                    tVar.a(D5.RV_INSTANCE_COLLECT_TOKEN_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(b32.e())}, new Object[]{"reason", b32.b()}});
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                t tVar2 = (t) s.this.f32782t.get(it.next());
                if (tVar2 != null) {
                    tVar2.a(D5.RV_INSTANCE_COLLECT_TOKEN_TIMED_OUT, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
                }
            }
            s.this.a((Map<String, Object>) this.f32796a, (List<String>) this.f32798c, this.f32797b.toString());
        }

        @Override // com.ironsource.A3.b
        public void onFailure(String str) {
            s.this.c(D5.RV_COLLECT_TOKENS_FAILED, C4183oa.a(new Object[][]{new Object[]{"reason", str}}));
            s.this.a((Map<String, Object>) this.f32796a, (List<String>) this.f32798c, this.f32797b.toString());
        }
    }

    public enum e {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    public s(List<NetworkSettings> list, Zd zd2, String str, String str2, HashSet<ImpressionDataListener> hashSet, C4002ea c4002ea) {
        super(hashSet, c4002ea);
        this.f32778p = "";
        this.f32781s = false;
        this.f32784v = 1;
        this.D = new Object();
        this.G = Lb.O().x();
        this.H = Lb.U().w();
        long time = new Date().getTime();
        c(D5.RV_MANAGER_INIT_STARTED, C4183oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.LWS_RV_MANAGER_NAME}}));
        a(e.RV_STATE_INITIATING);
        this.C = null;
        this.f32786x = zd2.g();
        this.f32787y = zd2.j();
        this.f32785w = "";
        this.f32773k = null;
        C4193p2 c4193p2K = zd2.k();
        this.f32788z = false;
        this.f32767e = new C4370za(zd2.k().f(), zd2.k().i());
        this.f32768f = new ConcurrentHashMap<>();
        this.f32769g = new ConcurrentHashMap<>();
        this.B = new Date().getTime();
        this.f32775m = c4193p2K.g() > 0;
        this.f32776n = c4193p2K.n();
        if (this.f32775m) {
            this.f32772j = new com.ironsource.mediationsdk.e(IronSource.a.REWARDED_VIDEO, c4193p2K, this);
        }
        this.f32774l = new C3988de(c4193p2K, this);
        ConcurrentHashMap<String, t> concurrentHashMap = new ConcurrentHashMap<>();
        this.f32782t = concurrentHashMap;
        a(list, zd2, str, str2);
        this.f32771i = new h(list, c4193p2K.c());
        Te te2 = new Te();
        this.f32783u = te2;
        te2.a(new ArrayList(concurrentHashMap.values()));
        this.E = new R5(zd2.c(), this);
        this.F = zd2.l();
        c(D5.RV_MANAGER_INIT_ENDED, C4183oa.a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}}));
        a(c4193p2K.k());
    }

    private String a(C4157n2 c4157n2) {
        t tVar = this.f32782t.get(c4157n2.c());
        return (tVar != null ? Integer.toString(tVar.g()) : TextUtils.isEmpty(c4157n2.k()) ? "1" : "2") + c4157n2.c();
    }

    private void a(long j10) {
        if (this.f32783u.a()) {
            d("all smashes are capped");
            a(D5.TROUBLESHOOTING_RV_LOAD_FAILED, C4183oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80001}, new Object[]{"reason", "all smashes are capped"}}));
            h();
            return;
        }
        a(IronSource.a.REWARDED_VIDEO);
        if (this.f32775m) {
            if (!this.f32769g.isEmpty()) {
                this.f32771i.a(this.f32769g);
                this.f32769g.clear();
            }
            new Timer().schedule(new b(), j10);
            return;
        }
        d("auction fallback flow starting");
        k();
        if (!this.f32767e.c().isEmpty()) {
            b(D5.RV_BUSINESS_MEDIATION_LOAD);
            i();
        } else {
            d("loadSmashes -  waterfall is empty");
            a(D5.TROUBLESHOOTING_RV_LOAD_FAILED, C4183oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{"reason", "waterfall is empty"}}));
            h();
        }
    }

    private void a(D5 d52) {
        a(d52, (Map<String, Object>) null, true, true);
    }

    private void a(D5 d52, Map<String, Object> map) {
        a(d52, map, false, true);
    }

    private void a(D5 d52, Map<String, Object> map, boolean z10, boolean z11) {
        HashMap map2 = new HashMap();
        map2.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        map2.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 2);
        if (z11 && !TextUtils.isEmpty(this.f32767e.d())) {
            map2.put("auctionId", this.f32767e.d());
        }
        JSONObject jSONObject = this.f32773k;
        if (jSONObject != null && jSONObject.length() > 0) {
            map2.put("genericParams", this.f32773k);
        }
        if (z10 && !TextUtils.isEmpty(this.f32785w)) {
            map2.put("placement", this.f32785w);
        }
        if (c(d52)) {
            C3952be.i().a(map2, this.f32779q, this.f32778p);
        }
        map2.put("sessionDepth", Integer.valueOf(this.f32784v));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    map2.putAll(map);
                }
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        C3952be.i().a(new C5(d52, new JSONObject(map2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetworkSettings networkSettings, Zd zd2, String str, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
        AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getRewardedVideoSettings(), false);
        if (abstractAdapterA != null) {
            t tVar = new t(str, str2, networkSettings, this, zd2.h(), abstractAdapterA, this.f32784v);
            this.f32782t.put(tVar.c(), tVar);
        }
        ironLog.verbose(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
    }

    private void a(e eVar) {
        d("current state=" + this.A + ", new state=" + eVar);
        this.A = eVar;
    }

    private void a(t tVar, String str) {
        String str2 = tVar.c() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "LWSProgRvManager: " + str2, 0);
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    private void a(List<NetworkSettings> list, Zd zd2, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkSettings> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(it.next(), zd2, str, str2));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(zd2.f(), zd2.o(), arrayList);
    }

    private void a(List<C4157n2> list, String str, JSONObject jSONObject) {
        this.f32768f.clear();
        this.f32769g.clear();
        CopyOnWriteArrayList<t> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        StringBuilder sb2 = new StringBuilder();
        for (C4157n2 c4157n2 : list) {
            sb2.append(a(c4157n2) + StringUtils.COMMA);
            t tVar = this.f32782t.get(c4157n2.c());
            if (tVar != null) {
                AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(tVar.f32310b.h());
                if (abstractAdapterA != null) {
                    t tVar2 = new t(tVar, this, abstractAdapterA, this.f32784v, str, jSONObject, this.f32779q, this.f32778p);
                    tVar2.a(true);
                    copyOnWriteArrayList.add(tVar2);
                    this.f32768f.put(tVar2.c(), c4157n2);
                    this.f32769g.put(c4157n2.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
                }
            } else {
                d("updateWaterfall() - could not find matching smash for auction response item " + c4157n2.c());
            }
        }
        this.f32767e.a(copyOnWriteArrayList, str);
        if (this.f32767e.a()) {
            a(D5.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, C4183oa.a(new Object[][]{new Object[]{"reason", "waterfalls hold too many with size=" + this.f32767e.e()}}));
        }
        d("updateWaterfall() - next waterfall is " + sb2.toString());
        if (sb2.length() == 0) {
            d("Updated waterfall is empty");
        }
        a(D5.RV_AUCTION_RESPONSE_WATERFALL, C4183oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        if (map.keySet().size() == 0 && list.size() == 0) {
            c(D5.RV_AUCTION_FAILED, C4183oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}}));
            d("makeAuction() failed - No candidates available for auctioning");
            h();
            return;
        }
        d("makeAuction() - request waterfall is: " + str);
        b(D5.RV_BUSINESS_MEDIATION_LOAD);
        b(D5.RV_AUCTION_REQUEST);
        c(D5.RV_AUCTION_REQUEST_WATERFALL, C4183oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, str.toString()}}));
        this.f32772j.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.f32771i, this.f32784v, this.f32670c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC4329x3> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb2.toString());
            return;
        }
        A3 a32 = new A3();
        d dVar = new d(map, sb2, list);
        b(D5.RV_COLLECT_TOKENS);
        a32.a(list2, dVar, this.F, TimeUnit.MILLISECONDS);
    }

    private void a(boolean z10, Map<String, Object> map) {
        synchronized (this.D) {
            Boolean bool = this.C;
            if (bool == null || bool.booleanValue() != z10) {
                this.C = Boolean.valueOf(z10);
                long time = new Date().getTime() - this.B;
                this.B = new Date().getTime();
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("duration", Long.valueOf(time));
                a(z10 ? D5.RV_CALLBACK_AVAILABILITY_TRUE : D5.RV_CALLBACK_AVAILABILITY_FALSE, map);
                Dd ddA = Dd.a();
                C4370za c4370za = this.f32767e;
                ddA.a(z10, c4370za.a(c4370za.d()));
            }
        }
    }

    private void b(D5 d52) {
        a(d52, (Map<String, Object>) null, false, false);
    }

    private void b(D5 d52, Map<String, Object> map) {
        a(d52, map, true, true);
    }

    private void b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC4329x3> list2) {
        for (t tVar : this.f32782t.values()) {
            if (!this.f32783u.b(tVar) && this.f32767e.b(tVar)) {
                if (tVar.p()) {
                    list2.add(new CallableC4329x3(tVar.g(), tVar.c(), null, tVar, null, null));
                } else {
                    list.add(tVar.c());
                    sb2.append(tVar.g() + tVar.c() + StringUtils.COMMA);
                }
            }
        }
    }

    private void b(boolean z10) {
        a(z10, (Map<String, Object>) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(D5 d52, Map<String, Object> map) {
        a(d52, map, false, false);
    }

    private void c(t tVar, C4041gd c4041gd) {
        d("showVideo()");
        this.f32783u.a(tVar);
        if (this.f32783u.b(tVar)) {
            tVar.B();
            IronSourceUtils.i(tVar.c() + " rewarded video is now session capped");
        }
        P7.a aVar = this.G;
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        String strC = c4041gd.c();
        IronSource.a aVar2 = IronSource.a.REWARDED_VIDEO;
        aVar.a(applicationContext, strC, aVar2);
        if (this.H.c(ContextProvider.getInstance().getApplicationContext(), c4041gd, aVar2)) {
            a(D5.RV_CAP_PLACEMENT);
        }
        this.E.a();
        tVar.a(c4041gd);
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + str, 3);
    }

    private boolean c(D5 d52) {
        return d52 == D5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS || d52 == D5.RV_AUCTION_SUCCESS || d52 == D5.RV_AUCTION_FAILED || d52 == D5.RV_AD_UNIT_CAPPED;
    }

    private boolean c(boolean z10) {
        Boolean bool = this.C;
        if (bool == null) {
            return false;
        }
        return (z10 && !bool.booleanValue() && d()) || (!z10 && this.C.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + str, 0);
    }

    private List<C4157n2> g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (t tVar : this.f32782t.values()) {
            if (!tVar.p() && !this.f32783u.b(tVar) && this.f32767e.b(tVar)) {
                copyOnWriteArrayList.add(new C4157n2(tVar.c()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void g(t tVar) {
        String strK = this.f32768f.get(tVar.c()).k();
        JSONObject jSONObjectA = this.f32768f.get(tVar.c()).a();
        tVar.c(strK);
        tVar.a(strK, jSONObjectA);
    }

    private void h() {
        a(e.RV_STATE_NOT_LOADED);
        if (!this.f32788z) {
            b(false);
        }
        this.f32774l.a();
    }

    private void i() {
        if (this.f32767e.c().isEmpty()) {
            d("loadSmashes -  waterfall is empty");
            a(D5.TROUBLESHOOTING_RV_LOAD_FAILED, C4183oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{"reason", "waterfall is empty"}}));
            h();
            return;
        }
        a(e.RV_STATE_LOADING_SMASHES);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f32767e.c().size() && i10 < this.f32786x; i11++) {
            t tVar = this.f32767e.c().get(i11);
            if (tVar.h()) {
                if (this.f32787y && tVar.p()) {
                    if (i10 != 0) {
                        String str = "Advanced Loading: Won't start loading bidder " + tVar.c() + " as a non bidder is being loaded";
                        d(str);
                        IronSourceUtils.i(str);
                        return;
                    }
                    String str2 = "Advanced Loading: Starting to load bidder " + tVar.c() + ". No other instances will be loaded at the same time.";
                    d(str2);
                    IronSourceUtils.i(str2);
                    g(tVar);
                    return;
                }
                g(tVar);
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        synchronized (this.D) {
            e eVar = this.A;
            e eVar2 = e.RV_STATE_AUCTION_IN_PROGRESS;
            if (eVar != eVar2) {
                a(eVar2);
                AsyncTask.execute(new c());
            }
        }
    }

    private void k() {
        a(g(), "fallback_" + System.currentTimeMillis(), this.f32773k);
    }

    @Override // com.ironsource.InterfaceC4172o
    public void a() {
        a(e.RV_STATE_NOT_LOADED);
        a(false, C4183oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{"reason", "loaded ads are expired"}}));
        a(0L);
    }

    @Override // com.ironsource.S1
    public void a(int i10, String str, int i11, String str2, long j10) {
        String str3 = "Auction failed (error " + i10 + " - " + str + ")";
        d(str3);
        IronSourceUtils.i("RV: " + str3);
        this.f32779q = i11;
        this.f32778p = str2;
        this.f32773k = null;
        if (this.f32776n) {
            d("Moving to fallback waterfall");
            k();
        }
        if (TextUtils.isEmpty(str)) {
            a(D5.RV_AUCTION_FAILED, C4183oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"duration", Long.valueOf(j10)}}));
        } else {
            a(D5.RV_AUCTION_FAILED, C4183oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j10)}}));
        }
        i();
    }

    @Override // com.ironsource.R7
    public void a(Activity activity, C4041gd c4041gd) {
        synchronized (this.D) {
            if (c4041gd == null) {
                a("showRewardedVideo error: empty default placement");
                IronSourceError ironSourceError = new IronSourceError(1021, "showRewardedVideo error: empty default placement");
                Dd ddA = Dd.a();
                C4370za c4370za = this.f32767e;
                ddA.a(ironSourceError, c4370za.a(c4370za.d()));
                a(D5.RV_CALLBACK_SHOW_FAILED, C4183oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1021}, new Object[]{"reason", "showRewardedVideo error: empty default placement"}}), false, true);
                return;
            }
            this.f32785w = c4041gd.c();
            b("showRewardedVideo(" + c4041gd + ")");
            t tVar = null;
            b(D5.RV_API_SHOW_CALLED, activity != null ? C4183oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW}}) : null);
            if (this.f32788z) {
                a("showRewardedVideo error: can't show ad while an ad is already showing");
                IronSourceError ironSourceError2 = new IronSourceError(1022, "showRewardedVideo error: can't show ad while an ad is already showing");
                Dd ddA2 = Dd.a();
                C4370za c4370za2 = this.f32767e;
                ddA2.a(ironSourceError2, c4370za2.a(c4370za2.d()));
                b(D5.RV_CALLBACK_SHOW_FAILED, C4183oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1022}, new Object[]{"reason", "showRewardedVideo error: can't show ad while an ad is already showing"}}));
                return;
            }
            if (this.A != e.RV_STATE_READY_TO_SHOW) {
                a("showRewardedVideo error: show called while no ads are available");
                IronSourceError ironSourceError3 = new IronSourceError(1023, "showRewardedVideo error: show called while no ads are available");
                Dd ddA3 = Dd.a();
                C4370za c4370za3 = this.f32767e;
                ddA3.a(ironSourceError3, c4370za3.a(c4370za3.d()));
                b(D5.RV_CALLBACK_SHOW_FAILED, C4183oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1023}, new Object[]{"reason", "showRewardedVideo error: show called while no ads are available"}}));
                return;
            }
            if (this.H.c(ContextProvider.getInstance().getApplicationContext(), c4041gd, IronSource.a.REWARDED_VIDEO)) {
                String str = "showRewardedVideo error: placement " + this.f32785w + " is capped";
                a(str);
                IronSourceError ironSourceError4 = new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, str);
                Dd ddA4 = Dd.a();
                C4370za c4370za4 = this.f32767e;
                ddA4.a(ironSourceError4, c4370za4.a(c4370za4.d()));
                b(D5.RV_CALLBACK_SHOW_FAILED, C4183oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_PLACEMENT_CAPPED)}, new Object[]{"reason", str}}));
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<t> it = this.f32767e.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                t next = it.next();
                if (next.A()) {
                    this.f32788z = true;
                    next.b(true);
                    a(e.RV_STATE_NOT_LOADED);
                    tVar = next;
                    break;
                }
                if (next.e() != null) {
                    stringBuffer.append(next.c() + StringUtils.PROCESS_POSTFIX_DELIMITER + next.e() + StringUtils.COMMA);
                }
                next.b(false);
            }
            if (tVar != null) {
                c(tVar, c4041gd);
                return;
            }
            d("showRewardedVideo(): No ads to show");
            Dd ddA5 = Dd.a();
            IronSourceError ironSourceErrorBuildNoAdsToShowError = ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
            C4370za c4370za5 = this.f32767e;
            ddA5.a(ironSourceErrorBuildNoAdsToShowError, c4370za5.a(c4370za5.d()));
            HashMap map = new HashMap();
            map.put(IronSourceConstants.EVENTS_ERROR_CODE, 509);
            map.put("reason", "showRewardedVideo(): No ads to show");
            if (stringBuffer.length() != 0) {
                map.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
            }
            b(D5.RV_CALLBACK_SHOW_FAILED, map);
            this.f32774l.b();
        }
    }

    @Override // com.ironsource.R7
    public void a(Context context, boolean z10) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager Should Track Network State: " + z10, 0);
        try {
            this.f32781s = z10;
            if (z10) {
                if (this.f32780r == null) {
                    this.f32780r = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f32780r, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f32780r != null) {
                context.getApplicationContext().unregisterReceiver(this.f32780r);
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e10.getMessage());
        }
    }

    @Override // com.ironsource.InterfaceC4353ya
    public void a(IronSourceError ironSourceError, t tVar) {
        C4157n2 c4157n2;
        if (this.f32775m && (c4157n2 = this.f32768f.get(tVar.c())) != null) {
            C4370za c4370za = this.f32767e;
            c4370za.a(c4370za.d(), c4157n2.a(this.f32785w), c4157n2.d());
        }
        a(tVar, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f32788z = false;
        b(D5.RV_CALLBACK_SHOW_FAILED, C4183oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}}));
        Dd.a().a(ironSourceError, this.f32767e.a(tVar.u()));
        this.f32769g.put(tVar.c(), h.a.ISAuctionPerformanceFailedToShow);
        if (this.A != e.RV_STATE_READY_TO_SHOW) {
            b(false);
        }
        this.f32774l.b();
    }

    @Override // com.ironsource.InterfaceC4353ya
    public void a(t tVar) {
        synchronized (this.D) {
            a(tVar, "onLoadSuccess mState=" + this.A);
            if (tVar.u() == this.f32767e.d() && this.A != e.RV_STATE_AUCTION_IN_PROGRESS) {
                this.f32769g.put(tVar.c(), h.a.ISAuctionPerformanceLoadedSuccessfully);
                e eVar = this.A;
                e eVar2 = e.RV_STATE_LOADING_SMASHES;
                if (eVar == eVar2) {
                    a(e.RV_STATE_READY_TO_SHOW);
                    a(D5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, C4183oa.a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - this.f32777o)}}));
                    this.E.a(0L);
                    if (this.f32775m) {
                        C4157n2 c4157n2 = this.f32768f.get(tVar.c());
                        if (c4157n2 != null) {
                            C4370za c4370za = this.f32767e;
                            c4370za.a(c4370za.d(), c4157n2.a(""), c4157n2.d());
                            this.f32772j.a(c4157n2, tVar.g(), this.f32770h);
                            this.f32772j.a(this.f32767e.c(), this.f32768f, tVar.g(), this.f32770h, c4157n2);
                        } else {
                            String strC = tVar.c();
                            c("onLoadSuccess winner instance " + strC + " missing from waterfall. auctionId: " + tVar.u() + " and the current id is " + this.f32767e.d());
                            D5 d52 = D5.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR;
                            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1010};
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Loaded missing ");
                            sb2.append(eVar2);
                            a(d52, C4183oa.a(new Object[][]{objArr, new Object[]{"reason", sb2.toString()}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}}));
                        }
                    }
                    b(true);
                }
                return;
            }
            d("onLoadSuccess was invoked with auctionId: " + tVar.u() + " and the current id is " + this.f32767e.d());
            tVar.a(D5.RV_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 2}, new Object[]{"reason", "onLoadSuccess wrong auction ID " + this.A}});
        }
    }

    @Override // com.ironsource.InterfaceC4353ya
    public void a(t tVar, C4041gd c4041gd) {
        a(tVar, "onRewardedVideoAdRewarded");
        Dd.a().b(c4041gd, this.f32767e.a(tVar.u()));
    }

    @Override // com.ironsource.S1
    public void a(List<C4157n2> list, String str, C4157n2 c4157n2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        d("makeAuction(): success");
        this.f32770h = c4157n2;
        this.f32779q = i10;
        this.f32773k = jSONObject;
        this.f32778p = "";
        if (!TextUtils.isEmpty(str2)) {
            a(D5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, C4183oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str2}}));
        }
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        a(jSONObject2, aVar);
        if (this.f32669b.a(aVar)) {
            a(D5.RV_AD_UNIT_CAPPED, C4183oa.a(new Object[][]{new Object[]{"auctionId", str}}));
            h();
        } else {
            a(list, str, this.f32773k);
            a(D5.RV_AUCTION_SUCCESS, C4183oa.a(new Object[][]{new Object[]{"duration", Long.valueOf(j10)}}));
            i();
        }
    }

    @Override // com.ironsource.Cc
    public void a(boolean z10) {
        if (this.f32781s) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z10, 0);
            if (c(z10)) {
                b(z10);
            }
        }
    }

    @Override // com.ironsource.InterfaceC4006ee
    public void b() {
        d("onLoadTriggered: RV load was triggered in " + this.A + " state");
        a(0L);
    }

    @Override // com.ironsource.InterfaceC4353ya
    public void b(t tVar) {
        a(tVar, "onRewardedVideoAdStarted");
        Dd.a().c();
    }

    @Override // com.ironsource.InterfaceC4353ya
    public void b(t tVar, C4041gd c4041gd) {
        a(tVar, "onRewardedVideoAdClicked");
        Dd.a().a(c4041gd, this.f32767e.a(tVar.u()));
    }

    @Override // com.ironsource.InterfaceC4353ya
    public void c(t tVar) {
        a(tVar, "onRewardedVideoAdClosed, mediation state: " + this.A.name());
        Dd.a().b(this.f32767e.a(tVar.u()));
        this.f32788z = false;
        boolean z10 = this.A == e.RV_STATE_READY_TO_SHOW;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            for (t tVar2 : this.f32767e.c()) {
                if (tVar2.y()) {
                    sb2.append(tVar2.c() + ";");
                }
            }
        }
        D5 d52 = D5.RV_INSTANCE_CLOSED;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("otherRVAvailable = ");
        sb3.append(sb2.length() > 0 ? "true|" + ((Object) sb2) : com.ironsource.mediationsdk.metadata.a.f32683h);
        tVar.b(d52, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb3.toString()}});
        if (tVar.equals(this.f32767e.f())) {
            this.f32767e.a((t) null);
            if (this.A != e.RV_STATE_READY_TO_SHOW) {
                b(false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0058 A[SYNTHETIC] */
    @Override // com.ironsource.InterfaceC4353ya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(com.ironsource.mediationsdk.t r12) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.s.d(com.ironsource.mediationsdk.t):void");
    }

    @Override // com.ironsource.R7
    public boolean d() {
        if ((!this.f32781s || IronSourceUtils.g(ContextProvider.getInstance().getApplicationContext())) && this.A == e.RV_STATE_READY_TO_SHOW && !this.f32788z) {
            Iterator<t> it = this.f32767e.c().iterator();
            while (it.hasNext()) {
                if (it.next().A()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC4353ya
    public void e(t tVar) {
        a(tVar, "onRewardedVideoAdEnded");
        Dd.a().b();
    }

    @Override // com.ironsource.InterfaceC4353ya
    public void f(t tVar) {
        this.f32767e.a(tVar);
        this.f32784v++;
        a(tVar, "onRewardedVideoAdOpened");
        if (this.f32775m) {
            C4157n2 c4157n2 = this.f32768f.get(tVar.c());
            if (c4157n2 != null) {
                C4370za c4370za = this.f32767e;
                c4370za.a(c4370za.d(), c4157n2.a(this.f32785w), c4157n2.d());
                this.f32772j.a(c4157n2, tVar.g(), this.f32770h, this.f32785w);
                this.f32769g.put(tVar.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
                a(c4157n2, this.f32785w);
            } else {
                String strC = tVar.c();
                c("onRewardedVideoAdOpened showing instance " + strC + " missing from waterfall");
                a(D5.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, C4183oa.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{"reason", "Showing missing " + this.A}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}}));
            }
        }
        Dd.a().c(this.f32767e.a(tVar.u()));
        b(false);
        this.f32774l.c();
    }
}
