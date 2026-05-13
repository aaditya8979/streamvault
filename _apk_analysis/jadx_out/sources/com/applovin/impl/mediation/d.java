package com.applovin.impl.mediation;

import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.a3;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.p5;
import com.applovin.impl.r3;
import com.applovin.impl.s3;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t3;
import com.applovin.impl.u3;
import com.applovin.impl.v5;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f9010b = new HashMap(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f9011c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f9012d = new HashMap(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f9013e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f9014f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f9015g = new Object();

    public class a implements p5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f9016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f9017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f9018c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a3 f9019d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f9020e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0148a f9021f;

        public a(long j10, Map map, String str, a3 a3Var, Context context, a.InterfaceC0148a interfaceC0148a) {
            this.f9016a = j10;
            this.f9017b = map;
            this.f9018c = str;
            this.f9019d = a3Var;
            this.f9020e = context;
            this.f9021f = interfaceC0148a;
        }

        @Override // com.applovin.impl.p5.b
        public void a(JSONArray jSONArray) {
            this.f9017b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f9016a));
            this.f9017b.put("calfc", Integer.valueOf(d.this.b(this.f9018c)));
            v5 v5Var = new v5(this.f9019d, jSONArray, this.f9020e, d.this.f9009a, this.f9021f);
            if (((Boolean) d.this.f9009a.a(r3.f9747o8)).booleanValue()) {
                d.this.f9009a.q0().a((i5) v5Var, d6.b.MEDIATION);
            } else {
                d.this.f9009a.q0().a(v5Var);
            }
        }
    }

    public static class b implements a.InterfaceC0148a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f9023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference f9024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f9025c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f9026d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f9027e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Map f9028f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Map f9029g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Map f9030h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f9031i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f9032j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f9033k;

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, d dVar, com.applovin.impl.sdk.k kVar, Context context) {
            this.f9023a = kVar;
            this.f9024b = new WeakReference(context);
            this.f9025c = dVar;
            this.f9026d = cVar;
            this.f9027e = maxAdFormat;
            this.f9029g = map2;
            this.f9028f = map;
            this.f9030h = map3;
            this.f9032j = j10;
            this.f9033k = j11;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f9031i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f9031i = Math.min(2, ((Integer) kVar.a(r3.f9737h8)).intValue());
            } else {
                this.f9031i = ((Integer) kVar.a(r3.f9737h8)).intValue();
            }
        }

        public /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, d dVar, com.applovin.impl.sdk.k kVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j10, j11, dVar, kVar, context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10, String str) {
            this.f9029g.put("retry_delay_sec", Integer.valueOf(i10));
            this.f9029g.put("retry_attempt", Integer.valueOf(this.f9026d.f9036c));
            Context contextO = (Context) this.f9024b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            this.f9030h.put("art", com.applovin.impl.i.EXPONENTIAL_RETRY.b());
            this.f9030h.put("era", Integer.valueOf(this.f9026d.f9036c));
            this.f9033k = System.currentTimeMillis();
            this.f9025c.a(str, this.f9027e, this.f9028f, this.f9029g, this.f9030h, contextO, this);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, MaxError maxError) {
            this.f9025c.c(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f9032j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f9023a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError, this.f9033k, jElapsedRealtime);
            }
            boolean z10 = maxError.getCode() == -5603 && n7.c(this.f9023a) && ((Boolean) this.f9023a.a(x4.A6)).booleanValue();
            if (this.f9023a.a(r3.f9738i8, this.f9027e) && this.f9026d.f9036c < this.f9031i && !z10) {
                c.e(this.f9026d);
                final int iPow = (int) Math.pow(2.0d, this.f9026d.f9036c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9255b.a(iPow, str);
                    }
                }, TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f9026d.f9036c = 0;
            this.f9026d.f9035b.set(false);
            if (this.f9026d.f9037d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError;
                maxErrorImpl.setLoadTag(this.f9026d.f9034a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                t2.a(this.f9026d.f9037d, str, maxError);
                this.f9026d.f9037d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            y2 y2Var = (y2) maxAd;
            y2Var.i(this.f9026d.f9034a);
            y2Var.a(SystemClock.elapsedRealtime() - this.f9032j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) y2Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f9023a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.f9033k, y2Var.getRequestLatencyMillis());
            }
            this.f9025c.a(maxAd.getAdUnitId());
            this.f9026d.f9036c = 0;
            if (this.f9026d.f9037d == null) {
                this.f9025c.a(y2Var);
                this.f9026d.f9035b.set(false);
                return;
            }
            y2Var.A().c().a(this.f9026d.f9037d);
            this.f9026d.f9037d.onAdLoaded(y2Var);
            if (y2Var.O().endsWith("load")) {
                this.f9026d.f9037d.onAdRevenuePaid(y2Var);
            }
            this.f9026d.f9037d = null;
            if (((Boolean) this.f9023a.a(r3.f9735f8)).booleanValue() || !this.f9025c.a(maxAd)) {
                this.f9026d.f9035b.set(false);
                return;
            }
            Context contextO = (Context) this.f9024b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            this.f9032j = SystemClock.elapsedRealtime();
            this.f9033k = System.currentTimeMillis();
            this.f9030h.put("art", com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE.b());
            this.f9025c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f9028f, this.f9029g, this.f9030h, contextO, this);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f9035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f9036c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile a.InterfaceC0148a f9037d;

        private c(String str) {
            this.f9035b = new AtomicBoolean();
            this.f9034a = str;
        }

        public /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        public static /* synthetic */ int e(c cVar) {
            int i10 = cVar.f9036c;
            cVar.f9036c = i10 + 1;
            return i10;
        }
    }

    public d(com.applovin.impl.sdk.k kVar) {
        this.f9009a = kVar;
    }

    private int a(Map map, s3.a aVar) {
        Long l10;
        if (map == null || (l10 = (Long) map.get(aVar.b())) == null) {
            return -1;
        }
        return l10.intValue();
    }

    private com.applovin.impl.h a(String str, MaxAdFormat maxAdFormat) {
        if (!((Boolean) this.f9009a.a(x4.M4)).booleanValue()) {
            return new com.applovin.impl.h(-1, -1, -1, -1);
        }
        u3 u3VarY = this.f9009a.Y();
        s3 s3Var = s3.f9812e;
        Map mapA = u3VarY.a(s3Var, t3.a(str));
        s3.a aVar = s3.a.SESSION;
        int iA = a(mapA, aVar);
        s3.a aVar2 = s3.a.INSTALL;
        int iA2 = a(mapA, aVar2);
        Map mapA2 = this.f9009a.Y().a(s3Var, t3.a(maxAdFormat));
        return new com.applovin.impl.h(iA, iA2, a(mapA2, aVar), a(mapA2, aVar2));
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.f9011c) {
            String strB = b(str, str2);
            cVar = (c) this.f9010b.get(strB);
            if (cVar == null) {
                cVar = new c(str2, null);
                this.f9010b.put(strB, cVar);
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(y2 y2Var) {
        synchronized (this.f9013e) {
            if (this.f9012d.containsKey(y2Var.getAdUnitId())) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "Ad in cache already: " + y2Var.getAdUnitId());
            }
            this.f9012d.put(y2Var.getAdUnitId(), y2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f9015g) {
            this.f9009a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f9009a.O().a("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
            }
            this.f9014f.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0148a interfaceC0148a) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a3 a3Var = new a3(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.f9009a.q0().a((i5) new p5(a3Var, context, this.f9009a, new a(jElapsedRealtime, map3, str, a3Var, context, interfaceC0148a)), d6.b.MEDIATION);
    }

    private String b(String str, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (str2 != null) {
            str3 = "-" + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        synchronized (this.f9015g) {
            this.f9009a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f9009a.O().a("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
            }
            Integer num = (Integer) this.f9014f.get(str);
            if (num == null) {
                num = 0;
            }
            this.f9014f.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    private y2 e(String str) {
        y2 y2Var;
        synchronized (this.f9013e) {
            y2Var = (y2) this.f9012d.get(str);
            this.f9012d.remove(str);
        }
        return y2Var;
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, com.applovin.impl.i iVar, Map map, Map map2, Context context, a.InterfaceC0148a interfaceC0148a) {
        y2 y2VarE = (this.f9009a.s0().d() || n7.h(com.applovin.impl.sdk.k.o())) ? null : e(str);
        if (y2VarE != null) {
            y2VarE.i(str2);
            y2VarE.A().c().a(interfaceC0148a);
            interfaceC0148a.onAdLoaded(y2VarE);
            if (y2VarE.O().endsWith("load")) {
                interfaceC0148a.onAdRevenuePaid(y2VarE);
            }
            if (((Boolean) this.f9009a.a(r3.f9735f8)).booleanValue() && a((MaxAd) y2VarE)) {
                return;
            }
        }
        c cVarA = a(str, str2);
        if (cVarA.f9035b.compareAndSet(false, true)) {
            if (y2VarE == null) {
                cVarA.f9037d = interfaceC0148a;
            }
            Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
            mapSynchronizedMap.put("art", iVar.b());
            if (StringUtils.isValidString(str2)) {
                mapSynchronizedMap.put("alt", str2);
            }
            a(str, maxAdFormat, map, map2, mapSynchronizedMap, context, new b(map, map2, mapSynchronizedMap, cVarA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f9009a, context, null));
            return;
        }
        if (cVarA.f9037d != null && cVarA.f9037d != interfaceC0148a) {
            com.applovin.impl.sdk.o.j("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
        }
        cVarA.f9037d = interfaceC0148a;
    }

    public boolean a(MaxAd maxAd) {
        return ((!this.f9009a.c(r3.f9733d8).contains(maxAd.getAdUnitId()) && !this.f9009a.a(r3.f9732c8, maxAd.getFormat())) || this.f9009a.s0().c() || this.f9009a.s0().d()) ? false : true;
    }

    public int b(String str) {
        int iIntValue;
        synchronized (this.f9015g) {
            Integer num = (Integer) this.f9014f.get(str);
            iIntValue = num != null ? num.intValue() : 0;
        }
        return iIntValue;
    }

    public void c(String str, String str2) {
        synchronized (this.f9011c) {
            this.f9010b.remove(b(str, str2));
        }
    }

    public boolean d(String str) {
        boolean z10;
        synchronized (this.f9013e) {
            z10 = this.f9012d.get(str) != null;
        }
        return z10;
    }
}
