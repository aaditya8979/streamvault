package com.ironsource;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.A3;
import com.ironsource.AbstractC4211q3;
import com.ironsource.E0;
import com.ironsource.O0;
import com.ironsource.P7;
import com.ironsource.P8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC4158n3<Smash extends AbstractC4211q3<?>, Listener extends AdapterAdListener> implements R0, S1, D0, Gb, Cc, InterfaceC4172o, Ag, InterfaceC4346y3, InterfaceC4204pd {
    private AdInfo A;
    private C4201pa B;
    public final P8 C;
    public final P8.a D;
    public final P7 E;
    private final P7.a F;
    private boolean G;
    private Hf H;
    private AtomicBoolean I;

    @Nullable
    private V9 J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zg<Smash> f33032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConcurrentHashMap<String, h.a> f33033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.ironsource.mediationsdk.e f33034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.ironsource.mediationsdk.h f33035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f33037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public JSONObject f33038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C4157n2 f33039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C4041gd f33040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f33041j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private NetworkStateReceiver f33042k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Te f33043l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C4122l5 f33044m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C4122l5 f33045n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public V f33046o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f33047p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Q0 f33048q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public R5 f33049r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public E0 f33050s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public L0 f33051t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public r f33052u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C4002ea f33053v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public UUID f33054w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f33055x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f33056y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Boolean f33057z;

    /* JADX INFO: renamed from: com.ironsource.n3$a */
    public class a extends AbstractRunnableC4078ie {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            AbstractC4158n3.this.B();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n3$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NetworkSettings f33059a;

        public b(NetworkSettings networkSettings) {
            this.f33059a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4158n3.this.c(this.f33059a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n3$c */
    public class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC4158n3.this.D();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n3$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4158n3.this.f33038g = IronSourceVideoBridge.jsonObjectInit();
            AbstractC4158n3.this.f33050s.f29207h.a((Double) null);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            AbstractC4158n3.this.b(map, arrayList, sb2, arrayList2);
            AbstractC4158n3.this.a(map, arrayList, sb2, arrayList2);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n3$e */
    public class e implements A3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f33063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f33064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f33065c;

        public e(Map map, StringBuilder sb2, List list) {
            this.f33063a = map;
            this.f33064b = sb2;
            this.f33065c = list;
        }

        @Override // com.ironsource.A3.b
        public void a(@NotNull List<B3> list, long j10, @NotNull List<String> list2) {
            AbstractC4158n3.this.f33050s.f29206g.a(j10);
            for (B3 b32 : list) {
                NetworkSettings networkSettingsA = AbstractC4158n3.this.f33046o.a(b32.c());
                Map<String, Object> mapB = AbstractC4158n3.this.b(networkSettingsA, com.ironsource.mediationsdk.c.b().b(networkSettingsA, AbstractC4158n3.this.f33046o.b(), AbstractC4158n3.this.k()));
                if (b32.a() != null) {
                    this.f33063a.put(b32.c(), b32.a());
                    StringBuilder sb2 = this.f33064b;
                    sb2.append(b32.d());
                    sb2.append(b32.c());
                    sb2.append(StringUtils.COMMA);
                    AbstractC4158n3.this.f33050s.f29206g.a(mapB, b32.e());
                } else {
                    AbstractC4158n3.this.f33050s.f29206g.a(mapB, b32.e(), b32.b());
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                NetworkSettings networkSettingsA2 = AbstractC4158n3.this.f33046o.a(it.next());
                AbstractC4158n3.this.f33050s.f29206g.b(AbstractC4158n3.this.b(networkSettingsA2, com.ironsource.mediationsdk.c.b().b(networkSettingsA2, AbstractC4158n3.this.f33046o.b(), AbstractC4158n3.this.k())), j10);
            }
            AbstractC4158n3.this.a((Map<String, Object>) this.f33063a, (List<String>) this.f33065c, this.f33064b.toString());
        }

        @Override // com.ironsource.A3.b
        public void onFailure(String str) {
            AbstractC4158n3.this.f33050s.f29206g.a(str);
            AbstractC4158n3.this.a((Map<String, Object>) this.f33063a, (List<String>) this.f33065c, this.f33064b.toString());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n3$f */
    public enum f {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public AbstractC4158n3(L7 l72, K7 k72, V v10, C4201pa c4201pa, C4002ea c4002ea) {
        this.f33037f = "";
        this.f33041j = false;
        this.f33055x = new Object();
        this.f33056y = 0L;
        this.I = new AtomicBoolean(false);
        this.f33054w = UUID.randomUUID();
        this.C = l72.s();
        this.D = k72.h();
        this.E = l72.w();
        this.F = k72.x();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + v10.b() + ", loading mode = " + v10.h().a());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(v10.b());
        sb2.append(" initiated object per waterfall mode");
        IronSourceUtils.i(sb2.toString());
        C4122l5 c4122l5 = new C4122l5();
        this.J = a(v10);
        this.f33053v = c4002ea;
        this.f33046o = v10;
        this.f33050s = new E0(v10.b(), E0.b.MEDIATION, this);
        this.f33051t = g();
        this.f33048q = h();
        a(f.NONE);
        this.B = c4201pa;
        this.f33032a = new zg<>(this.f33046o.d().f(), this.f33046o.d().i(), this);
        this.f33050s.f29204e.a(o(), this.f33046o.h().a().toString());
        this.f33033b = new ConcurrentHashMap<>();
        this.f33040i = null;
        G();
        this.f33038g = IronSourceVideoBridge.jsonObjectInit();
        if (this.f33046o.q()) {
            this.f33034c = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(this.f33046o.d(), IronSourceUtils.d()));
        }
        this.f33035d = new com.ironsource.mediationsdk.h(this.f33046o.j(), this.f33046o.d().c());
        s();
        r();
        this.f33044m = new C4122l5();
        a(f.READY_TO_LOAD);
        this.f33049r = new R5(v10.a(), this);
        this.f33052u = new r();
        this.f33050s.f29204e.a(C4122l5.a(c4122l5));
        if (this.f33046o.h().e()) {
            ironLog.verbose("first automatic load");
            A();
        }
    }

    public AbstractC4158n3(V v10, C4201pa c4201pa, C4002ea c4002ea) {
        this(Lb.U(), Lb.O(), v10, c4201pa, c4002ea);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        f fVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        synchronized (this.f33055x) {
            if (this.f33046o.h().e() && this.f33043l.a()) {
                ironLog.verbose(b("all smashes are capped"));
                a(A0.a(this.f33046o.b()), "all smashes are capped", false);
                return;
            }
            if (!t() && this.f33047p == f.SHOWING) {
                IronLog.API.error(b("load cannot be invoked while showing an ad"));
                a(new IronSourceError(A0.d(this.f33046o.b()), "load cannot be invoked while showing an ad"));
                return;
            }
            if (this.f33046o.h().a() != O0.a.AUTOMATIC_LOAD_WHILE_SHOW && this.f33046o.h().a() != O0.a.MANUAL_WITH_LOAD_ON_SHOW && (((fVar = this.f33047p) != f.READY_TO_LOAD && fVar != f.READY_TO_SHOW) || com.ironsource.mediationsdk.n.a().b(this.f33046o.b()))) {
                IronLog.API.error(b("load is already in progress"));
                return;
            }
            this.f33038g = IronSourceVideoBridge.jsonObjectInit();
            F();
            if (v()) {
                this.f33050s.f29205f.a();
            } else {
                this.f33050s.f29205f.a(q());
            }
            this.f33045n = new C4122l5();
            if (this.f33046o.q()) {
                if (!this.f33033b.isEmpty()) {
                    this.f33035d.a(this.f33033b);
                    this.f33033b.clear();
                }
                K();
            } else {
                a(f.LOADING);
            }
            if (this.f33046o.q()) {
                return;
            }
            ironLog.verbose(b("auction disabled"));
            L();
            C();
        }
    }

    private void C() {
        Gg<Smash> ggE = E();
        if (ggE.c()) {
            a(509, "Mediation No fill", false);
        }
        Iterator<Smash> it = ggE.a().iterator();
        while (it.hasNext()) {
            it.next().E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        IronLog.INTERNAL.verbose(i());
        AsyncTask.execute(new d());
    }

    private Gg<Smash> E() {
        IronLog.INTERNAL.verbose();
        return new Fg(this.f33046o).d(this.f33032a.b());
    }

    private void F() {
        this.f33052u.a(this.f33046o.b(), false);
    }

    private void K() {
        IronLog.INTERNAL.verbose(i());
        synchronized (this.f33055x) {
            f fVar = this.f33047p;
            f fVar2 = f.AUCTION;
            if (fVar == fVar2) {
                return;
            }
            a(fVar2);
            this.I.set(false);
            long jK = this.f33046o.d().k() - C4122l5.a(this.f33044m);
            if (jK > 0) {
                new Timer().schedule(new c(), jK);
            } else {
                D();
            }
        }
    }

    private void L() {
        IronLog.INTERNAL.verbose(i());
        a(j(), m());
    }

    @Nullable
    private V9 a(V v10) {
        if (v10.l()) {
            return IronSourceThreadManager.INSTANCE.getSharedManagersThread();
        }
        return null;
    }

    private Smash a(C4157n2 c4157n2, String str) {
        NetworkSettings networkSettingsA = this.f33046o.a(c4157n2.c());
        if (networkSettingsA != null) {
            com.ironsource.mediationsdk.c.b().b(networkSettingsA, this.f33046o.b(), k());
            BaseAdAdapter<?, Listener> baseAdAdapterA = a(networkSettingsA, this.f33046o.b());
            if (baseAdAdapterA != null) {
                Smash smash = (Smash) a(networkSettingsA, baseAdAdapterA, this.C.a(this.f33046o.b()), str, c4157n2);
                this.f33033b.put(c4157n2.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
                return smash;
            }
            IronLog.INTERNAL.error(b("addSmashToWaterfall - could not load ad adapter for " + networkSettingsA.getProviderInstanceName()));
        } else {
            String str2 = "could not find matching provider settings for auction response item - item = " + c4157n2.c() + " state = " + this.f33047p;
            IronLog.INTERNAL.error(b(str2));
            this.f33050s.f29209j.i(str2);
        }
        return null;
    }

    private String a(List<C4157n2> list, String str) {
        IronLog.INTERNAL.verbose(b("waterfall.size() = " + list.size()));
        this.f33033b.clear();
        StringBuilder sb2 = new StringBuilder();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C4157n2 c4157n2 = list.get(i10);
            AbstractC4211q3 abstractC4211q3A = a(c4157n2, str);
            if (abstractC4211q3A != null) {
                copyOnWriteArrayList.add(abstractC4211q3A);
                sb2.append(a(c4157n2, abstractC4211q3A.l()));
            }
            if (i10 != list.size() - 1) {
                sb2.append(StringUtils.COMMA);
            }
        }
        this.f33032a.a(this.f33046o.h().a(), (CopyOnWriteArrayList<Smash>) copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(b("updateWaterfall() - next waterfall is " + ((Object) sb2)));
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b("auction waterfallString = " + str));
        boolean z10 = false;
        if (map.size() == 0 && list.size() == 0) {
            ironLog.verbose(b("auction failed - no candidates"));
            this.f33050s.f29207h.a(1005, "No candidates available for auctioning");
            a(A0.e(this.f33046o.b()), "no available ad to load", false);
            return;
        }
        this.f33050s.f29207h.b(str);
        if (this.f33034c == null) {
            ironLog.error(b("mAuctionHandler is null"));
            return;
        }
        int iA = this.C.a(this.f33046o.b());
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(this.f33046o.b());
        iVar.b(IronSourceUtils.g());
        iVar.a(map);
        iVar.a(list);
        iVar.a(this.f33035d);
        iVar.a(iA);
        iVar.a(this.f33053v);
        iVar.d(this.G);
        Hf hf2 = this.H;
        if (hf2 != null && hf2.b()) {
            z10 = true;
        }
        iVar.e(z10);
        a(ContextProvider.getInstance().getApplicationContext(), iVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC4329x3> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb2.toString());
            return;
        }
        A3 a32 = new A3();
        e eVar = new e(map, sb2, list);
        this.f33050s.f29206g.a();
        a32.a(list2, eVar, this.f33046o.e(), TimeUnit.MILLISECONDS);
    }

    private void a(JSONObject jSONObject) {
        this.f33052u.a(this.f33046o.b(), jSONObject != null ? jSONObject.optBoolean(com.ironsource.mediationsdk.d.f32391f, false) : false);
        b(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        HashMap map = new HashMap();
        try {
            map.put(IronSourceConstants.EVENTS_PROVIDER, networkSettings.getProviderDefaultInstance());
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface.getAdapterVersion());
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface.getNetworkSDKVersion());
            map.put("spId", networkSettings.getSubProviderId());
            map.put("instanceType", Integer.valueOf(networkSettings.getInstanceType(this.f33046o.b())));
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(p()));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + networkSettings.getProviderDefaultInstance(), e10);
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC4329x3> list2) {
        for (NetworkSettings networkSettings : this.f33046o.j()) {
            Hf hf2 = this.H;
            if (hf2 == null || hf2.a(networkSettings, this.f33046o.b())) {
                if (!this.f33043l.b(new Se(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f33046o.b()))) && d(networkSettings)) {
                    AdData adDataA = a(networkSettings, (String) null);
                    if (networkSettings.isBidder(this.f33046o.b())) {
                        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f33046o.b(), k());
                        if (adapterBaseInterfaceB instanceof InterfaceC4363z3) {
                            list2.add(new CallableC4329x3(networkSettings.getInstanceType(this.f33046o.b()), networkSettings.getProviderInstanceName(), adDataA, (InterfaceC4363z3) adapterBaseInterfaceB, this, networkSettings));
                        } else {
                            this.f33050s.f29209j.g(adapterBaseInterfaceB == null ? "prepareAuctionCandidates - could not load network adapter " + networkSettings.getProviderName() : "network adapter " + networkSettings.getProviderName() + " does not implementing BiddingDataInterface");
                        }
                    } else {
                        list.add(networkSettings.getProviderInstanceName());
                        sb2.append(networkSettings.getInstanceType(this.f33046o.b()));
                        sb2.append(networkSettings.getProviderInstanceName());
                        sb2.append(StringUtils.COMMA);
                    }
                }
            }
        }
    }

    private void b(JSONObject jSONObject) {
        int i10;
        try {
            if (jSONObject == null) {
                this.f33046o.b(false);
                IronLog.INTERNAL.verbose(b("loading configuration from auction response is null, using the following: " + this.f33046o.r()));
                return;
            }
            try {
                if (jSONObject.has("parallelLoad") && (i10 = jSONObject.getInt("parallelLoad")) > 0) {
                    this.f33046o.a(i10);
                }
                if (jSONObject.has("bidderExclusive")) {
                    this.f33046o.a(jSONObject.getBoolean("bidderExclusive"));
                }
                this.f33046o.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.f32411z, false));
            } catch (JSONException e10) {
                C4228r4.d().a(e10);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.f33046o.b() + " Error: " + e10.getMessage());
                ironLog.verbose(b(this.f33046o.r()));
            }
        } finally {
            IronLog.INTERNAL.verbose(b(this.f33046o.r()));
        }
    }

    private boolean b(B0 b02) {
        return !new ArrayList(Arrays.asList(B0.INIT_STARTED, B0.LOAD_AD, B0.AUCTION_REQUEST, B0.AUCTION_REQUEST_WATERFALL, B0.AUCTION_FAILED_NO_CANDIDATES, B0.COLLECT_TOKEN, B0.COLLECT_TOKENS_COMPLETED, B0.COLLECT_TOKENS_FAILED, B0.INSTANCE_COLLECT_TOKEN, B0.INSTANCE_COLLECT_TOKEN_SUCCESS, B0.INSTANCE_COLLECT_TOKEN_FAILED, B0.INSTANCE_COLLECT_TOKEN_TIMED_OUT)).contains(b02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(NetworkSettings networkSettings) {
        IronLog.INTERNAL.verbose(b(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName())));
        AdData adDataA = a(networkSettings, this.f33046o.o());
        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f33046o.b(), k());
        if (adapterBaseInterfaceB != null) {
            try {
                adapterBaseInterfaceB.init(adDataA, ContextProvider.getInstance().getApplicationContext(), null);
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                this.f33050s.f29209j.g("initProvider - exception while calling networkAdapter.init with " + networkSettings.getProviderName() + " - " + e10);
            }
        }
        IronLog.INTERNAL.verbose(b(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName())));
    }

    private boolean c(B0 b02) {
        return new ArrayList(Arrays.asList(B0.LOAD_AD_SUCCESS, B0.LOAD_AD_FAILED, B0.LOAD_AD_FAILED_WITH_REASON, B0.AUCTION_SUCCESS, B0.AUCTION_FAILED, B0.AUCTION_FAILED_NO_CANDIDATES, B0.AD_FORMAT_CAPPED, B0.AD_OPENED, B0.SHOW_AD, B0.SHOW_AD_FAILED, B0.AD_CLICKED, B0.RELOAD_AD_FAILED_WITH_REASON, B0.RELOAD_AD_SUCCESS, B0.AD_LEFT_APPLICATION)).contains(b02);
    }

    private boolean c(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (this.f33032a.a(adapterBaseInterface, this.f33046o.b(), networkSettings.getProviderInstanceName())) {
            return false;
        }
        return networkSettings.shouldEarlyInit() || networkSettings.isIronSource() || networkSettings.isBidder(this.f33046o.b());
    }

    private boolean c(boolean z10) {
        Boolean bool = this.f33057z;
        if (bool == null) {
            return false;
        }
        return (z10 && !bool.booleanValue() && u()) || (!z10 && this.f33057z.booleanValue());
    }

    private boolean d(NetworkSettings networkSettings) {
        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f33046o.b(), k());
        if (adapterBaseInterfaceB instanceof AdapterSettingsInterface) {
            return this.f33032a.a(this.f33046o.h().a(), networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), a(networkSettings, adapterBaseInterfaceB), adapterBaseInterfaceB, this.f33046o.b());
        }
        return false;
    }

    private List<C4157n2> j() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings networkSettings : this.f33046o.j()) {
            if (!networkSettings.isBidder(this.f33046o.b()) && d(networkSettings)) {
                Se se2 = new Se(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f33046o.b()));
                if (!this.f33043l.b(se2)) {
                    copyOnWriteArrayList.add(new C4157n2(se2.c()));
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private int p() {
        return 1;
    }

    private void r() {
        IronLog.INTERNAL.verbose(i());
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.f33046o.j()) {
            if (c(networkSettings, com.ironsource.mediationsdk.c.b().b(networkSettings, this.f33046o.b(), k()))) {
                arrayList.add(new b(networkSettings));
            }
        }
        IronSourceThreadManager.INSTANCE.executeTasks(this.f33046o.k(), this.f33046o.p(), arrayList);
    }

    private void s() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.f33046o.j()) {
            arrayList.add(new Se(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f33046o.b())));
        }
        Te te2 = new Te();
        this.f33043l = te2;
        te2.a(arrayList);
    }

    public void A() {
        if (e()) {
            a(new a());
        } else {
            B();
        }
    }

    public void G() {
        com.ironsource.mediationsdk.n.a().a(this.f33046o.b(), this.f33046o.f());
    }

    public boolean H() {
        return true;
    }

    public boolean I() {
        return true;
    }

    public void J() {
        Iterator<NetworkSettings> it = this.f33046o.j().iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.c.b().b(it.next(), this.f33046o.b(), k());
        }
    }

    public LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.NONE;
    }

    public BaseAdAdapter<?, Listener> a(NetworkSettings networkSettings, IronSource.a aVar) {
        BaseAdAdapter<?, Listener> baseAdAdapter = (BaseAdAdapter<?, Listener>) com.ironsource.mediationsdk.c.b().a(networkSettings, aVar, k());
        if (baseAdAdapter != null) {
            return baseAdAdapter;
        }
        return null;
    }

    public AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.f33046o.b(), str);
    }

    public abstract Smash a(NetworkSettings networkSettings, BaseAdAdapter<?, Listener> baseAdAdapter, int i10, String str, C4157n2 c4157n2);

    public String a(C4157n2 c4157n2, int i10) {
        return String.format("%s%s", Integer.valueOf(i10), c4157n2.c());
    }

    public Map<String, Object> a(B0 b02) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        JSONObject jSONObject = this.f33038g;
        if (jSONObject != null && jSONObject.length() > 0) {
            map.put("genericParams", this.f33038g);
        }
        map.put("sessionDepth", Integer.valueOf(this.C.a(this.f33046o.b())));
        if (c(b02)) {
            map.put("auctionTrials", Integer.valueOf(this.f33036e));
            if (!TextUtils.isEmpty(this.f33037f)) {
                map.put(IronSourceConstants.AUCTION_FALLBACK, this.f33037f);
            }
        }
        if (b(b02) && !TextUtils.isEmpty(this.f33032a.c())) {
            map.put("auctionId", this.f33032a.c());
        }
        return map;
    }

    @Override // com.ironsource.InterfaceC4172o
    public void a() {
        if (this.f33046o.h().e()) {
            a(f.READY_TO_LOAD);
            b(true);
            A();
        }
    }

    @Override // com.ironsource.Ag
    public void a(int i10) {
        this.f33050s.f29209j.v("waterfalls hold too many with size = " + i10);
    }

    @Override // com.ironsource.S1
    public void a(int i10, String str, int i11, String str2, long j10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        if (!y()) {
            String str3 = "unexpected auction fail - error = " + i10 + ", " + str + " state = " + this.f33047p;
            ironLog.error(b(str3));
            this.f33050s.f29209j.j(str3);
            return;
        }
        String str4 = "Auction failed (error " + i10 + " - " + str + ")";
        ironLog.verbose(b(str4));
        IronSourceUtils.i(l() + ": " + str4);
        this.f33036e = i11;
        this.f33037f = str2;
        this.f33038g = IronSourceVideoBridge.jsonObjectInit();
        if (this.f33046o.d().n()) {
            ironLog.verbose(b("Moving to fallback waterfall"));
            L();
        }
        this.f33050s.f29207h.a(j10, i10, str);
        a(f.LOADING);
        C();
    }

    public void a(int i10, String str, boolean z10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        a(f.READY_TO_LOAD);
        ironLog.verbose(b("errorCode = " + i10 + ", errorReason = " + str));
        if (this.f33046o.h().f()) {
            if (!z10) {
                this.f33050s.f29205f.a(C4122l5.a(this.f33045n), i10, str, q());
            }
            a(new IronSourceError(i10, str));
        } else {
            if (!z10) {
                this.f33050s.f29209j.b(i10, str);
            }
            b(false);
        }
        this.f33048q.e();
    }

    public void a(Context context, com.ironsource.mediationsdk.i iVar, S1 s12) {
        com.ironsource.mediationsdk.e eVar = this.f33034c;
        if (eVar != null) {
            eVar.a(context, iVar, s12);
        } else {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        }
    }

    public void a(Context context, boolean z10) {
        IronLog.INTERNAL.verbose(b("track = " + z10));
        try {
            this.f33041j = z10;
            if (z10) {
                if (this.f33042k == null) {
                    this.f33042k = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f33042k, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f33042k != null) {
                context.getApplicationContext().unregisterReceiver(this.f33042k);
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e10.getMessage());
        }
    }

    public void a(Hf hf2) {
        this.H = hf2;
        if (hf2 != null) {
            this.G = true;
        } else {
            this.G = false;
        }
        this.f33057z = null;
    }

    public void a(L0 l02) {
        this.f33051t = l02;
    }

    public void a(C4002ea c4002ea) {
        this.f33053v = c4002ea;
    }

    public void a(IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.n.a().b(this.f33046o.b(), ironSourceError);
    }

    @Override // com.ironsource.R0
    public void a(IronSourceError ironSourceError, AbstractC4211q3<?> abstractC4211q3) {
        Gg<Smash> ggE;
        AbstractC4211q3<?> abstractC4211q3C;
        synchronized (this.f33055x) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose(b(abstractC4211q3.k() + " - error = " + ironSourceError));
            if (abstractC4211q3.h().equals(this.f33032a.c()) && this.f33047p != f.AUCTION) {
                this.f33033b.put(abstractC4211q3.c(), h.a.ISAuctionPerformanceFailedToLoad);
                if (z() || x()) {
                    ggE = E();
                    if (ggE.c()) {
                        a(509, "Mediation No fill", false);
                        return;
                    }
                } else {
                    ggE = null;
                }
                if (ggE == null) {
                    return;
                }
                if (this.f33046o.m()) {
                    synchronized (this.f33055x) {
                        if (ggE.b() && w() && (abstractC4211q3C = new Fg(this.f33046o).c(this.f33032a.b())) != null) {
                            i(abstractC4211q3C);
                        }
                    }
                }
                Iterator<Smash> it = ggE.a().iterator();
                while (it.hasNext()) {
                    it.next().E();
                }
                return;
            }
            ironLog.error(b("onAdLoadFailed was invoked from " + abstractC4211q3.c() + " with state =" + this.f33047p + " auctionId: " + abstractC4211q3.h() + " and the current id is " + this.f33032a.c()));
            C3954bg c3954bg = this.f33050s.f29209j;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onAdLoadFailed was invoked with state =");
            sb2.append(this.f33047p);
            c3954bg.o(sb2.toString());
        }
    }

    @Override // com.ironsource.InterfaceC4346y3
    public void a(NetworkSettings networkSettings) {
        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f33046o.b(), k());
        if (adapterBaseInterfaceB != null) {
            this.f33050s.f29206g.a(b(networkSettings, adapterBaseInterfaceB));
        }
    }

    public void a(f fVar) {
        synchronized (this.f33055x) {
            IronLog.INTERNAL.verbose("set current state to = " + fVar);
            this.f33047p = fVar;
        }
    }

    @Override // com.ironsource.R0
    public void a(AbstractC4211q3<?> abstractC4211q3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(abstractC4211q3.k()));
        this.f33050s.f29208i.g(n());
        this.f33032a.a(abstractC4211q3);
        this.f33032a.b(abstractC4211q3);
        this.f33043l.a(abstractC4211q3);
        if (this.f33043l.b(abstractC4211q3)) {
            ironLog.verbose(b(abstractC4211q3.c() + " was session capped"));
            abstractC4211q3.N();
            IronSourceUtils.i(abstractC4211q3.c() + " was session capped");
        }
        this.F.a(ContextProvider.getInstance().getApplicationContext(), n(), this.f33046o.b());
        if (this.E.c(ContextProvider.getInstance().getApplicationContext(), this.f33040i, this.f33046o.b())) {
            ironLog.verbose(b("placement " + n() + " is capped"));
            this.f33050s.f29208i.b(n(), null);
        }
        this.D.b(this.f33046o.b());
        if (this.f33046o.q()) {
            C4157n2 c4157n2I = abstractC4211q3.i();
            this.f33034c.a(c4157n2I, abstractC4211q3.l(), this.f33039h, n());
            this.f33033b.put(abstractC4211q3.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
            if (H()) {
                b(c4157n2I, n());
            }
        }
        g(abstractC4211q3);
        if (this.f33046o.h().e()) {
            b(false);
        }
        this.f33048q.h();
    }

    public void a(AbstractC4211q3<?> abstractC4211q3, AdInfo adInfo) {
        this.f33051t.c(adInfo);
    }

    @Override // com.ironsource.InterfaceC4204pd
    public void a(Runnable runnable) {
        V9 v92 = this.J;
        if (v92 != null) {
            v92.a(runnable);
        }
    }

    @Override // com.ironsource.InterfaceC4346y3
    public void a(String str) {
        this.f33050s.f29209j.g(str);
    }

    @Override // com.ironsource.S1
    public void a(List<C4157n2> list, String str, C4157n2 c4157n2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        if (!y()) {
            ironLog.error(b("unexpected auction success for auctionId - " + str + " state = " + this.f33047p));
            C3954bg c3954bg = this.f33050s.f29209j;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("unexpected auction success, state = ");
            sb2.append(this.f33047p);
            c3954bg.k(sb2.toString());
            return;
        }
        this.f33037f = "";
        this.f33036e = i10;
        this.f33039h = c4157n2;
        this.f33038g = jSONObject;
        if (!TextUtils.isEmpty(str2)) {
            this.f33050s.f29209j.a(i11, str2);
        }
        a(jSONObject2);
        if (this.f33052u.a(this.f33046o.b())) {
            this.f33050s.f29207h.a(str);
            a(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped", true);
            return;
        }
        String strA = a(list, str);
        this.f33050s.f29207h.a(j10, this.f33046o.r() + ";wtf=" + list.size());
        this.f33050s.f29207h.c(strA);
        a(f.LOADING);
        C();
    }

    @Override // com.ironsource.Cc
    public void a(boolean z10) {
        if (!this.f33041j || this.f33046o.h().f()) {
            return;
        }
        IronLog.INTERNAL.verbose("network availability changed to - " + z10);
        if (c(z10)) {
            a(z10, false, (AbstractC4211q3<?>) null);
        }
    }

    public void a(boolean z10, boolean z11, AbstractC4211q3<?> abstractC4211q3) {
        synchronized (this.f33055x) {
            Boolean bool = this.f33057z;
            if (bool == null || bool.booleanValue() != z10) {
                this.f33057z = Boolean.valueOf(z10);
                long time = 0;
                if (this.f33056y != 0) {
                    time = new Date().getTime() - this.f33056y;
                }
                this.f33056y = new Date().getTime();
                this.f33050s.f29205f.a(z10, time, z11);
                AdInfo adInfoF = abstractC4211q3 != null ? abstractC4211q3.f() : this.A;
                this.A = adInfoF;
                L0 l02 = this.f33051t;
                if (!z10) {
                    adInfoF = null;
                }
                l02.a(z10, adInfoF);
            }
        }
    }

    public boolean a(f fVar, f fVar2) {
        boolean z10;
        synchronized (this.f33055x) {
            if (this.f33047p == fVar) {
                IronLog.INTERNAL.verbose("expected state = " + fVar + ", state to set = " + fVar2);
                z10 = true;
                this.f33047p = fVar2;
            } else {
                IronLog.INTERNAL.verbose("wrong state, current state = " + this.f33047p + ", expected state = " + fVar);
                z10 = false;
            }
        }
        return z10;
    }

    public String b(String str) {
        String str2 = this.f33046o.b().name() + " state:" + this.f33047p;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    public abstract JSONObject b(NetworkSettings networkSettings);

    public void b() {
        IronLog.INTERNAL.verbose(i());
        A();
    }

    public void b(C4157n2 c4157n2, String str) {
        if (c4157n2 == null) {
            IronLog.INTERNAL.error(b("reportImpressionDataToPublisher - no auctionResponseItem or listener"));
            E0 e02 = this.f33050s;
            if (e02 != null) {
                e02.f29209j.g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
                return;
            }
            return;
        }
        Z8 z8A = c4157n2.a(str);
        if (z8A != null) {
            for (ImpressionDataListener impressionDataListener : new HashSet(this.B.a())) {
                IronLog.CALLBACK.info(b("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + z8A));
                impressionDataListener.onImpressionSuccess(z8A);
            }
        }
    }

    public void b(boolean z10) {
        a(false, z10, (AbstractC4211q3<?>) null);
    }

    @Override // com.ironsource.R0
    public void d(AbstractC4211q3<?> abstractC4211q3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(abstractC4211q3.k()));
        if (!abstractC4211q3.h().equals(this.f33032a.c())) {
            ironLog.error(b("invoked from " + abstractC4211q3.c() + " with state = " + this.f33047p + " auctionId: " + abstractC4211q3.h() + " and the current id is " + this.f33032a.c()));
            C3954bg c3954bg = this.f33050s.f29209j;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onAdLoadSuccess invoked with state = ");
            sb2.append(this.f33047p);
            c3954bg.p(sb2.toString());
            return;
        }
        if (this.f33046o.m()) {
            List<Smash> listB = this.f33032a.b();
            Fg fg2 = new Fg(this.f33046o);
            boolean zA = fg2.a(abstractC4211q3, listB);
            synchronized (this.f33055x) {
                if (zA) {
                    if (w()) {
                        i(abstractC4211q3);
                    }
                }
                if (fg2.a(listB)) {
                    i(fg2.c(listB));
                }
            }
        }
        this.f33033b.put(abstractC4211q3.c(), h.a.ISAuctionPerformanceLoadedSuccessfully);
        if (a(f.LOADING, f.READY_TO_SHOW)) {
            long jA = C4122l5.a(this.f33045n);
            if (v()) {
                this.f33050s.f29205f.a(jA);
            } else {
                this.f33050s.f29205f.a(jA, q());
            }
            if (this.f33046o.h().e()) {
                this.f33049r.a(0L);
            }
            if (!this.f33046o.m()) {
                i(abstractC4211q3);
            }
            h(abstractC4211q3);
        }
    }

    @Override // com.ironsource.R0
    public void e(AbstractC4211q3<?> abstractC4211q3) {
        IronLog.INTERNAL.verbose(b(abstractC4211q3.k()));
        this.f33050s.f29208i.a(n());
        this.f33051t.a(this.f33040i, abstractC4211q3.f());
    }

    @Override // com.ironsource.InterfaceC4204pd
    public boolean e() {
        V9 v92 = this.J;
        if (v92 == null || v92 == Thread.currentThread()) {
            return false;
        }
        return this.f33046o.l();
    }

    public abstract L0 g();

    public void g(AbstractC4211q3<?> abstractC4211q3) {
        this.f33051t.d(abstractC4211q3.f());
    }

    public Q0 h() {
        return new Q0(this.f33046o.h(), this);
    }

    public void h(AbstractC4211q3<?> abstractC4211q3) {
        if (this.f33046o.h().f()) {
            a(abstractC4211q3, abstractC4211q3.f());
        } else {
            a(true, false, abstractC4211q3);
        }
    }

    public String i() {
        return b((String) null);
    }

    public void i(AbstractC4211q3<?> abstractC4211q3) {
        if (this.f33046o.q() && this.I.compareAndSet(false, true)) {
            C4157n2 c4157n2I = abstractC4211q3.i();
            this.f33034c.a(c4157n2I, abstractC4211q3.l(), this.f33039h);
            ArrayList<String> arrayList = new ArrayList<>();
            ConcurrentHashMap<String, C4157n2> concurrentHashMap = new ConcurrentHashMap<>();
            for (Smash smash : this.f33032a.b()) {
                arrayList.add(smash.c());
                concurrentHashMap.put(smash.c(), smash.i());
            }
            this.f33034c.a(arrayList, concurrentHashMap, abstractC4211q3.l(), this.f33039h, c4157n2I);
        }
    }

    public UUID k() {
        return this.f33054w;
    }

    public abstract String l();

    public String m() {
        return "fallback_" + System.currentTimeMillis();
    }

    public String n() {
        C4041gd c4041gd = this.f33040i;
        return c4041gd == null ? "" : c4041gd.c();
    }

    public abstract String o();

    public boolean q() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u() {
        return false;
    }

    public abstract boolean v();

    public boolean w() {
        boolean z10;
        synchronized (this.f33055x) {
            f fVar = this.f33047p;
            z10 = fVar == f.LOADING || fVar == f.READY_TO_SHOW;
        }
        return z10;
    }

    public boolean x() {
        boolean z10;
        synchronized (this.f33055x) {
            z10 = this.f33047p == f.READY_TO_SHOW;
        }
        return z10;
    }

    public boolean y() {
        boolean z10;
        synchronized (this.f33055x) {
            z10 = this.f33047p == f.AUCTION;
        }
        return z10;
    }

    public boolean z() {
        boolean z10;
        synchronized (this.f33055x) {
            z10 = this.f33047p == f.LOADING;
        }
        return z10;
    }
}
