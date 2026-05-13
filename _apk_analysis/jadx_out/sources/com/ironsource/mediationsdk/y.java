package com.ironsource.mediationsdk;

import android.content.Context;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.A3;
import com.ironsource.B3;
import com.ironsource.C3;
import com.ironsource.C4002ea;
import com.ironsource.C4049h3;
import com.ironsource.C4122l5;
import com.ironsource.C4157n2;
import com.ironsource.C4228r4;
import com.ironsource.C4277u2;
import com.ironsource.C4337xb;
import com.ironsource.C5;
import com.ironsource.CallableC4329x3;
import com.ironsource.D5;
import com.ironsource.InterfaceC4237rd;
import com.ironsource.J9;
import com.ironsource.K7;
import com.ironsource.L7;
import com.ironsource.Lb;
import com.ironsource.P7;
import com.ironsource.P8;
import com.ironsource.S1;
import com.ironsource.Vf;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.l;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
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

/* JADX INFO: loaded from: classes3.dex */
public class y extends m implements InterfaceC4237rd, S1 {
    private ConcurrentHashMap<String, h.a> A;
    private long B;
    private final Object C;
    private C4122l5 D;
    private boolean E;
    private final long F;
    private final Runnable G;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final P8 f32914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final P8.a f32915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final P7 f32916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final P7.a f32917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private k f32918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i f32919j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C4337xb f32920k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private q f32921l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C4049h3 f32922m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f32923n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private z f32924o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f32925p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ConcurrentHashMap<String, z> f32926q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CopyOnWriteArrayList<z> f32927r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f32928s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private JSONObject f32929t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f32930u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f32931v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f32932w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private C4157n2 f32933x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private com.ironsource.mediationsdk.h f32934y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ConcurrentHashMap<String, C4157n2> f32935z;

    public class a implements l.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C4049h3 f32936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f32937b;

        public a(C4049h3 c4049h3, q qVar) {
            this.f32936a = c4049h3;
            this.f32937b = qVar;
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a() {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("placement = " + this.f32936a.c());
            l.b(this.f32937b);
            y yVar = y.this;
            yVar.f32921l = this.f32937b;
            yVar.f32922m = this.f32936a;
            P7 p72 = yVar.f32916g;
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            C4049h3 c4049h3 = this.f32936a;
            IronSource.a aVar = IronSource.a.BANNER;
            if (!p72.c(applicationContext, c4049h3, aVar)) {
                y.this.b(false);
                return;
            }
            ironLog.verbose("placement is capped");
            n.a().b(aVar, new IronSourceError(604, "placement " + this.f32936a.c() + " is capped"));
            y.this.a(D5.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 604}});
            y.this.a(i.READY_TO_LOAD);
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a(String str) {
            IronLog.API.error("can't load banner - errorMessage = " + str);
        }
    }

    public class b implements l.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f32939a;

        public b(q qVar) {
            this.f32939a = qVar;
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a() {
            IronLog.INTERNAL.verbose("destroying banner");
            y.this.f32920k.b();
            y yVar = y.this;
            z zVar = yVar.f32924o;
            y.this.a(D5.BN_DESTROY, (Object[][]) null, zVar != null ? zVar.n() : yVar.f32925p);
            y.this.h();
            this.f32939a.a();
            y yVar2 = y.this;
            yVar2.f32921l = null;
            yVar2.f32922m = null;
            yVar2.a(i.READY_TO_LOAD);
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a(String str) {
            IronLog.API.error("destroy banner failed - errorMessage = " + str);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                y yVar = y.this;
                if (yVar.f32921l == null) {
                    IronLog.INTERNAL.verbose("mIronSourceBanner is null");
                    y.this.a(D5.BN_SKIP_RELOAD, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL)}});
                } else {
                    if (yVar.o()) {
                        y.this.v();
                        return;
                    }
                    IronLog.INTERNAL.verbose("banner is not visible, reload skipped");
                    y.this.a(D5.BN_SKIP_RELOAD, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 613}});
                    y.this.f32920k.a(TimeUnit.SECONDS.toMillis(r3.f32918i.f()));
                }
            } catch (Throwable th2) {
                C4228r4.d().a(th2);
                y.this.a(D5.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, new Object[][]{new Object[]{"reason", th2.getMessage()}});
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.w();
            if (y.this.y()) {
                return;
            }
            y.this.a(D5.BN_AUCTION_REQUEST);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            y.this.b(map, arrayList, sb2, arrayList2);
            y.this.a(map, arrayList, sb2, arrayList2);
        }
    }

    public class e implements A3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f32943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f32944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f32945c;

        public e(Map map, StringBuilder sb2, List list) {
            this.f32943a = map;
            this.f32944b = sb2;
            this.f32945c = list;
        }

        @Override // com.ironsource.A3.b
        public void a(@NotNull List<B3> list, long j10, @NotNull List<String> list2) {
            y.this.a(D5.BN_COLLECT_TOKENS_COMPLETED, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
            for (B3 b32 : list) {
                if (b32.a() != null) {
                    this.f32943a.put(b32.c(), b32.a());
                    StringBuilder sb2 = this.f32944b;
                    sb2.append(b32.d());
                    sb2.append(b32.c());
                    sb2.append(StringUtils.COMMA);
                    ((z) y.this.f32926q.get(b32.c())).a(D5.BN_INSTANCE_COLLECT_TOKEN_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(b32.e())}});
                } else {
                    ((z) y.this.f32926q.get(b32.c())).a(D5.BN_INSTANCE_COLLECT_TOKEN_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(b32.e())}, new Object[]{"reason", b32.b()}});
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                ((z) y.this.f32926q.get(it.next())).a(D5.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
            }
            y.this.a((Map<String, Object>) this.f32943a, (List<String>) this.f32945c, this.f32944b);
        }

        @Override // com.ironsource.A3.b
        public void onFailure(String str) {
            y.this.a(D5.BN_COLLECT_TOKENS_FAILED, new Object[][]{new Object[]{"duration", str}});
            y.this.a((Map<String, Object>) this.f32943a, (List<String>) this.f32945c, this.f32944b);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NetworkSettings f32947a;

        public f(NetworkSettings networkSettings) {
            this.f32947a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.a(this.f32947a);
        }
    }

    public class g implements C3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z f32949a;

        public g(z zVar) {
            this.f32949a = zVar;
        }

        @Override // com.ironsource.C3
        public void a() {
            this.f32949a.D();
        }
    }

    public class h extends TimerTask {
        public h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            y.this.u();
        }
    }

    public enum i {
        NONE,
        READY_TO_LOAD,
        STARTED_LOADING,
        FIRST_AUCTION,
        AUCTION,
        LOADING,
        RELOADING,
        LOADED
    }

    public y(L7 l72, K7 k72, List<NetworkSettings> list, k kVar, HashSet<ImpressionDataListener> hashSet, C4002ea c4002ea) {
        super(hashSet, c4002ea);
        this.f32919j = i.NONE;
        this.f32930u = "";
        this.C = new Object();
        this.E = false;
        c cVar = new c();
        this.G = cVar;
        P8 p8S = l72.s();
        this.f32914e = p8S;
        this.f32915f = k72.h();
        this.f32916g = l72.w();
        this.f32917h = k72.x();
        long time = new Date().getTime();
        a(D5.BN_MANAGER_INIT_STARTED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.PROG_BN_MANAGER_NAME}});
        IronLog.INTERNAL.verbose("isAuctionEnabled = " + kVar.j());
        this.f32918i = kVar;
        this.f32926q = new ConcurrentHashMap<>();
        this.f32927r = new CopyOnWriteArrayList<>();
        this.f32935z = new ConcurrentHashMap<>();
        this.A = new ConcurrentHashMap<>();
        IronSource.a aVar = IronSource.a.BANNER;
        this.f32925p = p8S.a(aVar);
        n.a().a(aVar, this.f32918i.d());
        if (this.f32918i.j()) {
            this.f32932w = new com.ironsource.mediationsdk.e(aVar, this.f32918i.b(), this);
        }
        this.f32934y = new com.ironsource.mediationsdk.h(list, this.f32918i.b().c());
        a(list, kVar);
        this.B = new Date().getTime();
        a(i.READY_TO_LOAD);
        this.F = kVar.g();
        this.f32920k = new C4337xb(cVar, com.ironsource.lifecycle.b.d(), new Vf());
        a(D5.BN_MANAGER_INIT_ENDED, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}});
    }

    public y(List<NetworkSettings> list, k kVar, HashSet<ImpressionDataListener> hashSet, C4002ea c4002ea) {
        this(Lb.U(), Lb.O(), list, kVar, hashSet, c4002ea);
    }

    private String a(List<C4157n2> list) {
        IronLog.INTERNAL.verbose("waterfall.size() = " + list.size());
        this.f32927r.clear();
        this.f32935z.clear();
        this.A.clear();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C4157n2 c4157n2 = list.get(i10);
            a(c4157n2);
            sb2.append(b(c4157n2));
            if (i10 != list.size() - 1) {
                sb2.append(StringUtils.COMMA);
            }
        }
        IronLog.INTERNAL.verbose("updateWaterfall() - next waterfall is " + sb2.toString());
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(D5 d52) {
        a(d52, (Object[][]) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(D5 d52, Object[][] objArr) {
        a(d52, objArr, this.f32925p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(D5 d52, Object[][] objArr, int i10) {
        JSONObject jSONObjectA = IronSourceUtils.a(false, true, 1);
        try {
            ISBannerSize iSBannerSizeK = k();
            if (iSBannerSizeK != null) {
                a(jSONObjectA, iSBannerSizeK);
            }
            if (this.f32922m != null) {
                jSONObjectA.put("placement", l());
            }
            jSONObjectA.put("sessionDepth", i10);
            if (!TextUtils.isEmpty(this.f32928s)) {
                jSONObjectA.put("auctionId", this.f32928s);
            }
            JSONObject jSONObject = this.f32929t;
            if (jSONObject != null && jSONObject.length() > 0) {
                jSONObjectA.put("genericParams", this.f32929t);
            }
            if (b(d52)) {
                jSONObjectA.put("auctionTrials", this.f32931v);
                if (!TextUtils.isEmpty(this.f32930u)) {
                    jSONObjectA.put(IronSourceConstants.AUCTION_FALLBACK, this.f32930u);
                }
            }
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    jSONObjectA.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(Log.getStackTraceString(e10));
        }
        J9.i().a(new C5(d52, jSONObjectA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetworkSettings networkSettings) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
        AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getBannerSettings(), false);
        if (abstractAdapterA != null) {
            z zVar = new z(this.f32918i, this, networkSettings, abstractAdapterA, this.f32925p, p());
            this.f32926q.put(zVar.c(), zVar);
        } else {
            ironLog.verbose(networkSettings.getProviderInstanceName() + " can't load adapter");
        }
        ironLog.verbose(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(i iVar) {
        IronLog.INTERNAL.verbose("from '" + this.f32919j + "' to '" + iVar + "'");
        synchronized (this.C) {
            this.f32919j = iVar;
        }
    }

    private void a(z zVar, C4157n2 c4157n2) {
        this.f32932w.a(c4157n2, zVar.g(), this.f32933x, l());
        a(this.f32935z.get(zVar.c()), l());
    }

    private void a(C4157n2 c4157n2) {
        z zVar = this.f32926q.get(c4157n2.c());
        if (zVar == null) {
            IronLog.INTERNAL.error("could not find matching smash for auction response item - item = " + c4157n2.c());
            return;
        }
        AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(zVar.f32310b.h());
        if (abstractAdapterA != null) {
            z zVar2 = new z(this.f32918i, this, zVar.f32310b.h(), abstractAdapterA, this.f32925p, this.f32928s, this.f32929t, this.f32931v, this.f32930u, p());
            zVar2.a(true);
            this.f32927r.add(zVar2);
            this.f32935z.put(zVar2.c(), c4157n2);
            this.A.put(c4157n2.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
        }
    }

    private void a(List<NetworkSettings> list, k kVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkSettings> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new f(it.next()));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(kVar.c().l(), kVar.c().n(), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auction waterfallString = " + ((Object) sb2));
        if (map.size() != 0 || list.size() != 0) {
            a(D5.BN_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}});
            com.ironsource.mediationsdk.e eVar = this.f32932w;
            if (eVar != null) {
                eVar.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.f32934y, this.f32925p, this.f32670c, j());
                return;
            } else {
                ironLog.error("mAuctionHandler is null");
                return;
            }
        }
        a(D5.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}});
        if (a(i.AUCTION, i.LOADED)) {
            this.f32920k.a(TimeUnit.SECONDS.toMillis(this.f32918i.f()));
            return;
        }
        n.a().b(IronSource.a.BANNER, new IronSourceError(1005, "No candidates available for auctioning"));
        a(D5.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}});
        a(i.READY_TO_LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC4329x3> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb2);
            return;
        }
        A3 a32 = new A3();
        e eVar = new e(map, sb2, list);
        a(D5.BN_COLLECT_TOKENS);
        a32.a(list2, eVar, this.F, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void a(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        try {
            String description = iSBannerSize.getDescription();
            byte b10 = -1;
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals(l.f32637c)) {
                        b10 = 2;
                    }
                    break;
                case 72205083:
                    if (description.equals(l.f32636b)) {
                        b10 = 1;
                    }
                    break;
                case 79011241:
                    if (description.equals(l.f32639e)) {
                        b10 = 3;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        b10 = 0;
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        b10 = 4;
                    }
                    break;
            }
            if (b10 == 0) {
                jSONObject.put(l.f32642h, 1);
            } else if (b10 == 1) {
                jSONObject.put(l.f32642h, 2);
            } else if (b10 == 2) {
                jSONObject.put(l.f32642h, 3);
            } else if (b10 == 3) {
                jSONObject.put(l.f32642h, 5);
            } else if (b10 == 4) {
                jSONObject.put(l.f32642h, 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + VastAttributes.HORIZONTAL_POSITION + iSBannerSize.getHeight());
            }
            if (iSBannerSize.isAdaptive()) {
                boolean zHas = jSONObject.has(IronSourceConstants.EVENTS_EXT1);
                String str = l.f32651q;
                if (zHas) {
                    str = jSONObject.optString(IronSourceConstants.EVENTS_EXT1) + " , " + l.f32651q;
                }
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(Log.getStackTraceString(e10));
        }
    }

    private boolean a(i iVar, i iVar2) {
        boolean z10;
        synchronized (this.C) {
            if (this.f32919j == iVar) {
                IronLog.INTERNAL.verbose("set state from '" + this.f32919j + "' to '" + iVar2 + "'");
                z10 = true;
                this.f32919j = iVar2;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    private String b(C4157n2 c4157n2) {
        z zVar = this.f32926q.get(c4157n2.c());
        String str = "1";
        if (zVar == null ? !TextUtils.isEmpty(c4157n2.k()) : zVar.p()) {
            str = "2";
        }
        return str + c4157n2.c();
    }

    private void b(z zVar, View view, FrameLayout.LayoutParams layoutParams) {
        if (this.f32921l != null) {
            zVar.E();
            l.a(this.f32921l, view, layoutParams, new g(zVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC4329x3> list2) {
        if (this.f32916g.c(ContextProvider.getInstance().getApplicationContext(), this.f32922m, IronSource.a.BANNER)) {
            return;
        }
        for (z zVar : this.f32926q.values()) {
            AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(zVar.f32312d, IronSource.a.BANNER, null, this.f32921l);
            if (zVar.p()) {
                list2.add(new CallableC4329x3(zVar.g(), zVar.c(), adDataCreateAdDataForNetworkAdapter, zVar, null, null));
            } else if (!zVar.p()) {
                list.add(zVar.c());
                sb2.append(zVar.g() + zVar.c() + StringUtils.COMMA);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("current state = " + this.f32919j);
        if (!a(i.STARTED_LOADING, this.f32918i.j() ? z10 ? i.AUCTION : i.FIRST_AUCTION : z10 ? i.RELOADING : i.LOADING)) {
            ironLog.error("wrong state - " + this.f32919j);
            return;
        }
        this.D = new C4122l5();
        this.f32928s = "";
        this.f32929t = null;
        this.f32923n = 0;
        this.f32925p = this.f32914e.a(IronSource.a.BANNER);
        if (z10) {
            a(D5.BN_RELOAD);
        } else {
            a(D5.BN_LOAD);
        }
        if (this.f32918i.j()) {
            u();
        } else {
            x();
            t();
        }
    }

    private boolean b(D5 d52) {
        return d52 == D5.BN_CALLBACK_RELOAD_ERROR || d52 == D5.BN_CALLBACK_LOAD_SUCCESS || d52 == D5.BN_CALLBACK_LOAD_ERROR || d52 == D5.BN_CALLBACK_RELOAD_SUCCESS || d52 == D5.BN_CALLBACK_SHOW || d52 == D5.BN_CALLBACK_CLICK || d52 == D5.BN_CALLBACK_LEAVE_APP || d52 == D5.BN_AUCTION_FAILED || d52 == D5.BN_AUCTION_SUCCESS || d52 == D5.BN_AD_UNIT_CAPPED;
    }

    private void f(z zVar) {
        String strK;
        q qVar = this.f32921l;
        if (qVar == null || qVar.b()) {
            return;
        }
        q qVarC = null;
        if (zVar.p()) {
            strK = this.f32935z.get(zVar.c()).k();
            zVar.c(strK);
        } else {
            strK = null;
        }
        JSONObject jSONObjectA = this.f32935z.get(zVar.c()).a();
        try {
            qVarC = this.f32921l.c();
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.verbose("Failed to make copy of banner layout: " + e10.getMessage());
        }
        zVar.a(qVarC, this.f32922m, strK, jSONObjectA);
    }

    private boolean g() {
        q qVar = this.f32921l;
        return (qVar == null || qVar.b()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f32924o != null) {
            IronLog.INTERNAL.verbose("mActiveSmash = " + this.f32924o.f());
            this.f32924o.t();
            this.f32924o = null;
        }
    }

    private List<C4157n2> i() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (z zVar : this.f32926q.values()) {
            if (!zVar.p() && !this.f32916g.c(ContextProvider.getInstance().getApplicationContext(), this.f32922m, IronSource.a.BANNER)) {
                copyOnWriteArrayList.add(new C4157n2(zVar.c()));
            }
        }
        return copyOnWriteArrayList;
    }

    private ISBannerSize j() {
        q qVar = this.f32921l;
        if (qVar == null || qVar.getSize() == null) {
            return null;
        }
        return this.f32921l.getSize().isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? ISBannerSize.f32316f : ISBannerSize.BANNER : this.f32921l.getSize();
    }

    private ISBannerSize k() {
        q qVar = this.f32921l;
        if (qVar != null) {
            return qVar.getSize();
        }
        return null;
    }

    private String l() {
        C4049h3 c4049h3 = this.f32922m;
        return c4049h3 != null ? c4049h3.c() : "";
    }

    private void m() {
        String str = this.f32927r.isEmpty() ? "Empty waterfall" : "Mediation No fill";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("errorReason = " + str);
        g((z) null);
        i iVar = i.LOADING;
        i iVar2 = i.READY_TO_LOAD;
        if (a(iVar, iVar2)) {
            a(D5.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 606}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(C4122l5.a(this.D))}});
            n.a().b(IronSource.a.BANNER, new IronSourceError(606, str));
        } else if (a(i.RELOADING, i.LOADED)) {
            a(D5.BN_CALLBACK_RELOAD_ERROR, new Object[][]{new Object[]{"duration", Long.valueOf(C4122l5.a(this.D))}});
            n.a().b(IronSource.a.BANNER, new IronSourceError(606, str));
            this.f32920k.a(TimeUnit.SECONDS.toMillis(this.f32918i.f()));
        } else {
            a(iVar2);
            ironLog.error("wrong state = " + this.f32919j);
        }
    }

    private void n() {
        String strL = l();
        P7.a aVar = this.f32917h;
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        IronSource.a aVar2 = IronSource.a.BANNER;
        aVar.a(applicationContext, strL, aVar2);
        if (this.f32916g.c(ContextProvider.getInstance().getApplicationContext(), this.f32922m, aVar2)) {
            a(D5.BN_PLACEMENT_CAPPED);
        }
    }

    private boolean p() {
        i iVar = this.f32919j;
        return iVar == i.RELOADING || iVar == i.AUCTION;
    }

    private boolean q() {
        boolean z10;
        synchronized (this.C) {
            z10 = this.f32919j == i.LOADED;
        }
        return z10;
    }

    private boolean r() {
        boolean z10;
        synchronized (this.C) {
            i iVar = this.f32919j;
            z10 = iVar == i.FIRST_AUCTION || iVar == i.AUCTION;
        }
        return z10;
    }

    private boolean s() {
        boolean z10;
        synchronized (this.C) {
            i iVar = this.f32919j;
            z10 = iVar == i.LOADING || iVar == i.RELOADING;
        }
        return z10;
    }

    private void t() {
        try {
            for (int i10 = this.f32923n; i10 < this.f32927r.size(); i10++) {
                z zVar = this.f32927r.get(i10);
                if (zVar.h()) {
                    IronLog.INTERNAL.verbose("loading smash - " + zVar.f());
                    this.f32923n = i10 + 1;
                    f(zVar);
                    return;
                }
            }
            m();
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            a(D5.TROUBLESHOOTING_BN_INTERNAL_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, "loadNextSmash"}, new Object[]{"reason", Log.getStackTraceString(e10)}});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        IronLog.INTERNAL.verbose();
        AsyncTask.execute(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("");
        if (a(i.LOADED, i.STARTED_LOADING)) {
            b(true);
            return;
        }
        ironLog.error("wrong state = " + this.f32919j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (this.A.isEmpty()) {
            return;
        }
        this.f32934y.a(this.A);
        this.A.clear();
    }

    private void x() {
        List<C4157n2> listI = i();
        this.f32928s = e();
        a(listI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y() {
        long jA = l.a(this.B, this.f32918i.h());
        if (jA <= 0) {
            return false;
        }
        IronLog.INTERNAL.verbose("waiting before auction - timeToWaitBeforeAuction = " + jA);
        new Timer().schedule(new h(), jA);
        return true;
    }

    @Override // com.ironsource.S1
    public void a(int i10, String str, int i11, String str2, long j10) {
        String str3 = "Auction failed (error " + i10 + " - " + str + ")";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(str3);
        IronSourceUtils.i("BN: " + str3);
        if (!r()) {
            ironLog.warning("wrong state - mCurrentState = " + this.f32919j);
            return;
        }
        this.f32930u = str2;
        this.f32931v = i11;
        this.f32929t = null;
        if (this.f32918i.b().n()) {
            ironLog.verbose("Moving to fallback waterfall");
            x();
        }
        a(D5.BN_AUCTION_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}});
        a(this.f32919j == i.FIRST_AUCTION ? i.LOADING : i.RELOADING);
        t();
    }

    @Override // com.ironsource.InterfaceC4237rd
    public void a(IronSourceError ironSourceError, z zVar, boolean z10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError);
        if (zVar.x() == this.f32928s) {
            if (s()) {
                this.A.put(zVar.c(), h.a.ISAuctionPerformanceFailedToLoad);
                t();
                return;
            } else {
                ironLog.warning("wrong state - mCurrentState = " + this.f32919j);
                return;
            }
        }
        ironLog.error("invoked with auctionId: " + zVar.x() + " and the current id is " + this.f32928s);
        zVar.a(D5.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 3}, new Object[]{"reason", "Wrong auction " + zVar.x() + " State - " + this.f32919j}, new Object[]{IronSourceConstants.EVENTS_EXT1, zVar.c()}});
    }

    public void a(q qVar) {
        IronLog.INTERNAL.verbose();
        l.a(qVar, new b(qVar));
    }

    public void a(q qVar, C4049h3 c4049h3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        IronSource.a aVar = IronSource.a.BANNER;
        a(aVar);
        f();
        if (!a(i.READY_TO_LOAD, i.STARTED_LOADING)) {
            IronLog.API.error("can't load banner - loadBanner already called and still in progress");
        } else if (n.a().b(aVar)) {
            ironLog.verbose("can't load banner - already has pending invocation");
        } else {
            l.a(qVar, c4049h3, new a(c4049h3, qVar));
        }
    }

    @Override // com.ironsource.InterfaceC4237rd
    public void a(z zVar) {
        C4157n2 c4157n2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(zVar.f());
        if (q()) {
            if (this.f32918i.j() && this.f32918i.b().r() && (c4157n2 = this.f32935z.get(zVar.c())) != null) {
                a(zVar, c4157n2);
            }
            a(D5.BN_CALLBACK_SHOW);
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.f32919j);
        String strC = zVar.c();
        a(D5.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1}, new Object[]{"reason", "Wrong State - " + this.f32919j}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}});
    }

    @Override // com.ironsource.InterfaceC4237rd
    public void a(z zVar, View view, FrameLayout.LayoutParams layoutParams) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + zVar.f());
        if (zVar.x() != this.f32928s) {
            ironLog.error("invoked with auctionId: " + zVar.x() + " and the current id is " + this.f32928s);
            zVar.a(D5.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 2}, new Object[]{"reason", "Wrong auction id " + zVar.x() + " State - " + this.f32919j}, new Object[]{IronSourceConstants.EVENTS_EXT1, zVar.c()}});
            return;
        }
        if (!s()) {
            ironLog.warning("wrong state - mCurrentState = " + this.f32919j);
            return;
        }
        z zVar2 = this.f32924o;
        if (zVar2 != null) {
            zVar2.q();
        }
        g(zVar);
        this.f32924o = zVar;
        b(zVar, view, layoutParams);
        this.A.put(zVar.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
        if (this.f32918i.j()) {
            C4157n2 c4157n2 = this.f32935z.get(zVar.c());
            if (c4157n2 != null) {
                a(c4157n2.a(l()), c4157n2.d());
                this.f32932w.a(c4157n2, zVar.g(), this.f32933x);
                this.f32932w.a(this.f32927r, this.f32935z, zVar.g(), this.f32933x, c4157n2);
                if (!this.f32918i.b().r()) {
                    a(zVar, c4157n2);
                }
            } else {
                String strC = zVar.c();
                ironLog.error("onLoadSuccess winner instance " + strC + " missing from waterfall. auctionId = " + this.f32928s);
                a(D5.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{"reason", "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}});
            }
        }
        if (this.f32919j == i.LOADING) {
            if (g()) {
                C4277u2.a().d(this.f32671d);
                objArr = new Object[][]{new Object[]{"duration", Long.valueOf(C4122l5.a(this.D))}};
            } else {
                objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}, new Object[]{"duration", Long.valueOf(C4122l5.a(this.D))}};
            }
            a(D5.BN_CALLBACK_LOAD_SUCCESS, objArr);
        } else {
            if (g()) {
                C4277u2.a().d(this.f32671d);
            }
            IronSourceUtils.i("bannerReloadSucceeded");
            a(D5.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C4122l5.a(this.D))}});
        }
        n();
        this.f32915f.b(IronSource.a.BANNER);
        a(i.LOADED);
        this.f32920k.a(TimeUnit.SECONDS.toMillis(this.f32918i.f()));
    }

    @Override // com.ironsource.S1
    public void a(List<C4157n2> list, String str, C4157n2 c4157n2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auctionId = " + str);
        if (!r()) {
            ironLog.warning("wrong state - mCurrentState = " + this.f32919j);
            return;
        }
        this.f32930u = "";
        this.f32928s = str;
        this.f32931v = i10;
        this.f32933x = c4157n2;
        this.f32929t = jSONObject;
        if (!TextUtils.isEmpty(str2)) {
            a(D5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str2}});
        }
        IronSource.a aVar = IronSource.a.BANNER;
        a(jSONObject2, aVar);
        if (!this.f32669b.a(aVar)) {
            a(D5.BN_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
            a(this.f32919j == i.FIRST_AUCTION ? i.LOADING : i.RELOADING);
            a(D5.BN_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, a(list)}});
            t();
            return;
        }
        a(D5.BN_AD_UNIT_CAPPED, new Object[][]{new Object[]{"auctionId", str}});
        i iVar = this.f32919j;
        a(i.READY_TO_LOAD);
        if (iVar == i.FIRST_AUCTION) {
            n.a().b(aVar, new IronSourceError(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped"));
        }
    }

    @Override // com.ironsource.InterfaceC4237rd
    public void b(z zVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(zVar.f());
        if (g()) {
            C4277u2.a().c(this.f32671d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(D5.BN_CALLBACK_LEAVE_APP, objArr, zVar.n());
    }

    @Override // com.ironsource.InterfaceC4237rd
    public void c(z zVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(zVar.f());
        if (g()) {
            C4277u2.a().f(this.f32671d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(D5.BN_CALLBACK_PRESENT_SCREEN, objArr, zVar.n());
    }

    @Override // com.ironsource.InterfaceC4237rd
    public void d(z zVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(zVar.f());
        if (g()) {
            C4277u2.a().b(this.f32671d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(D5.BN_CALLBACK_CLICK, objArr, zVar.n());
    }

    @Override // com.ironsource.InterfaceC4237rd
    public void e(z zVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(zVar.f());
        if (g()) {
            C4277u2.a().e(this.f32671d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(D5.BN_CALLBACK_DISMISS_SCREEN, objArr, zVar.n());
    }

    public void g(z zVar) {
        for (z zVar2 : this.f32927r) {
            if (!zVar2.equals(zVar)) {
                zVar2.q();
            }
        }
    }

    public boolean o() {
        if (!this.f32921l.isShown()) {
            IronLog.INTERNAL.verbose("banner or one of its parents are INVISIBLE or GONE");
            return false;
        }
        if (!this.f32921l.hasWindowFocus()) {
            IronLog.INTERNAL.verbose("banner has no window focus");
            return false;
        }
        boolean globalVisibleRect = this.f32921l.getGlobalVisibleRect(new Rect());
        IronLog.INTERNAL.verbose("visible = " + globalVisibleRect);
        return globalVisibleRect;
    }
}
