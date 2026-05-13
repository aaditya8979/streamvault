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
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f9083b = new HashMap(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f9084c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f9085d = new HashMap(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f9086e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f9087f = Collections.synchronizedMap(new HashMap(4));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f9088g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f9089h = new Object();

    public class a implements p5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f9090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f9091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f9092c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a3 f9093d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f9094e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0148a f9095f;

        public a(long j10, Map map, String str, a3 a3Var, Context context, a.InterfaceC0148a interfaceC0148a) {
            this.f9090a = j10;
            this.f9091b = map;
            this.f9092c = str;
            this.f9093d = a3Var;
            this.f9094e = context;
            this.f9095f = interfaceC0148a;
        }

        @Override // com.applovin.impl.p5.b
        public void a(JSONArray jSONArray) {
            this.f9091b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f9090a));
            this.f9091b.put("calfc", Integer.valueOf(e.this.b(this.f9092c)));
            v5 v5Var = new v5(this.f9093d, jSONArray, this.f9094e, e.this.f9082a, this.f9095f);
            if (((Boolean) e.this.f9082a.a(r3.f9747o8)).booleanValue()) {
                e.this.f9082a.q0().a((i5) v5Var, d6.b.MEDIATION);
            } else {
                e.this.f9082a.q0().a(v5Var);
            }
        }
    }

    public static class b implements a.InterfaceC0148a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f9097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference f9098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f9099c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f9100d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f9101e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Map f9102f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Map f9103g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Map f9104h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f9105i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f9106j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f9107k;

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, e eVar, com.applovin.impl.sdk.k kVar, Context context) {
            this.f9097a = kVar;
            this.f9098b = new WeakReference(context);
            this.f9099c = eVar;
            this.f9100d = cVar;
            this.f9101e = maxAdFormat;
            this.f9103g = map2;
            this.f9102f = map;
            this.f9104h = map3;
            this.f9106j = j10;
            this.f9107k = j11;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f9105i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f9105i = Math.min(2, ((Integer) kVar.a(r3.f9737h8)).intValue());
            } else {
                this.f9105i = ((Integer) kVar.a(r3.f9737h8)).intValue();
            }
        }

        public /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, e eVar, com.applovin.impl.sdk.k kVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j10, j11, eVar, kVar, context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10, String str) {
            this.f9103g.put("retry_delay_sec", Integer.valueOf(i10));
            this.f9103g.put("retry_attempt", Integer.valueOf(this.f9100d.f9110c));
            Context contextO = (Context) this.f9098b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            this.f9104h.put("art", com.applovin.impl.i.EXPONENTIAL_RETRY.b());
            this.f9104h.put("era", Integer.valueOf(this.f9100d.f9110c));
            this.f9107k = System.currentTimeMillis();
            this.f9099c.a(str, this.f9101e, this.f9102f, this.f9103g, this.f9104h, contextO, this);
        }

        private void a(MaxAd maxAd) {
            Context contextO = (Context) this.f9098b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            this.f9106j = SystemClock.elapsedRealtime();
            this.f9107k = System.currentTimeMillis();
            this.f9104h.put("art", com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE.b());
            this.f9099c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f9102f, this.f9103g, this.f9104h, contextO, this);
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
            this.f9099c.d(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f9106j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f9097a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError, this.f9107k, jElapsedRealtime);
            }
            boolean z10 = maxError.getCode() == -5603 && n7.c(this.f9097a) && ((Boolean) this.f9097a.a(x4.A6)).booleanValue();
            if (this.f9097a.a(r3.f9738i8, this.f9101e) && this.f9100d.f9110c < this.f9105i && !z10) {
                c.e(this.f9100d);
                final int iPow = (int) Math.pow(2.0d, this.f9100d.f9110c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9260b.a(iPow, str);
                    }
                }, TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f9100d.f9110c = 0;
            this.f9100d.f9109b.set(false);
            if (this.f9100d.f9111d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError;
                maxErrorImpl.setLoadTag(this.f9100d.f9108a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                t2.a(this.f9100d.f9111d, str, maxError);
                this.f9100d.f9111d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            int sizeSafely;
            y2 y2Var = (y2) maxAd;
            y2Var.i(this.f9100d.f9108a);
            y2Var.a(SystemClock.elapsedRealtime() - this.f9106j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) y2Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f9097a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.f9107k, y2Var.getRequestLatencyMillis());
            }
            this.f9099c.a(maxAd.getAdUnitId());
            this.f9100d.f9110c = 0;
            if (this.f9100d.f9111d == null) {
                this.f9099c.a(y2Var);
                this.f9100d.f9109b.set(false);
                int iL = y2Var.L();
                synchronized (this.f9099c.f9086e) {
                    sizeSafely = CollectionUtils.getSizeSafely((Queue) this.f9099c.f9085d.get(maxAd.getAdUnitId()));
                }
                if (sizeSafely < iL) {
                    int i10 = sizeSafely + 1;
                    this.f9097a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f9097a.O().a("MediationAdLoadManagerV2", "Preloading waterfall " + i10 + " of " + iL);
                    }
                    a(maxAd);
                    return;
                }
                return;
            }
            y2Var.A().c().a(this.f9100d.f9111d);
            this.f9100d.f9111d.onAdLoaded(y2Var);
            this.f9099c.f9087f.put(maxAd.getAdUnitId(), y2Var);
            if (y2Var.O().endsWith("load")) {
                this.f9100d.f9111d.onAdRevenuePaid(y2Var);
            }
            this.f9100d.f9111d = null;
            if ((!this.f9097a.c(r3.f9733d8).contains(maxAd.getAdUnitId()) && !this.f9097a.a(r3.f9732c8, maxAd.getFormat())) || this.f9097a.s0().c() || this.f9097a.s0().d()) {
                this.f9100d.f9109b.set(false);
                return;
            }
            int iL2 = y2Var.L();
            this.f9097a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f9097a.O().a("MediationAdLoadManagerV2", "Preloading waterfall 1 of " + iL2);
            }
            a(maxAd);
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
        private final String f9108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f9109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f9110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile a.InterfaceC0148a f9111d;

        private c(String str) {
            this.f9109b = new AtomicBoolean();
            this.f9108a = str;
        }

        public /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        public static /* synthetic */ int e(c cVar) {
            int i10 = cVar.f9110c;
            cVar.f9110c = i10 + 1;
            return i10;
        }
    }

    public e(com.applovin.impl.sdk.k kVar) {
        this.f9082a = kVar;
    }

    private int a(Map map, s3.a aVar) {
        Long l10;
        if (map == null || (l10 = (Long) map.get(aVar.b())) == null) {
            return -1;
        }
        return l10.intValue();
    }

    private com.applovin.impl.h a(String str, MaxAdFormat maxAdFormat) {
        if (!((Boolean) this.f9082a.a(x4.M4)).booleanValue()) {
            return new com.applovin.impl.h(-1, -1, -1, -1);
        }
        u3 u3VarY = this.f9082a.Y();
        s3 s3Var = s3.f9812e;
        Map mapA = u3VarY.a(s3Var, t3.a(str));
        s3.a aVar = s3.a.SESSION;
        int iA = a(mapA, aVar);
        s3.a aVar2 = s3.a.INSTALL;
        int iA2 = a(mapA, aVar2);
        Map mapA2 = this.f9082a.Y().a(s3Var, t3.a(maxAdFormat));
        return new com.applovin.impl.h(iA, iA2, a(mapA2, aVar), a(mapA2, aVar2));
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.f9084c) {
            String strB = b(str, str2);
            cVar = (c) this.f9083b.get(strB);
            if (cVar == null) {
                cVar = new c(str2, null);
                this.f9083b.put(strB, cVar);
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(y2 y2Var) {
        synchronized (this.f9086e) {
            Queue arrayDeque = (Queue) this.f9085d.get(y2Var.getAdUnitId());
            if (arrayDeque == null) {
                arrayDeque = new ArrayDeque();
                this.f9085d.put(y2Var.getAdUnitId(), arrayDeque);
            }
            arrayDeque.add(y2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f9089h) {
            this.f9082a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f9082a.O().a("MediationAdLoadManagerV2", "Clearing ad load failures count for ad unit ID: " + str);
            }
            this.f9088g.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0148a interfaceC0148a) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a3 a3Var = new a3(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.f9082a.q0().a((i5) new p5(a3Var, context, this.f9082a, new a(jElapsedRealtime, map3, str, a3Var, context, interfaceC0148a)), d6.b.MEDIATION);
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

    private y2 f(String str) {
        synchronized (this.f9086e) {
            Queue queue = (Queue) this.f9085d.get(str);
            if (CollectionUtils.isEmpty(queue)) {
                return null;
            }
            return (y2) queue.poll();
        }
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, com.applovin.impl.i iVar, Map map, Map map2, Context context, a.InterfaceC0148a interfaceC0148a) {
        y2 y2VarF = (this.f9082a.s0().d() || n7.h(com.applovin.impl.sdk.k.o())) ? null : f(str);
        if (y2VarF != null) {
            y2VarF.i(str2);
            y2VarF.A().c().a(interfaceC0148a);
            interfaceC0148a.onAdLoaded(y2VarF);
            this.f9087f.put(str, y2VarF);
            if (y2VarF.O().endsWith("load")) {
                interfaceC0148a.onAdRevenuePaid(y2VarF);
            }
        }
        c cVarA = a(str, str2);
        if (cVarA.f9109b.compareAndSet(false, true)) {
            if (y2VarF == null) {
                cVarA.f9111d = interfaceC0148a;
            }
            Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
            mapSynchronizedMap.put("art", iVar.b());
            if (StringUtils.isValidString(str2)) {
                mapSynchronizedMap.put("alt", str2);
            }
            a(str, maxAdFormat, map, map2, mapSynchronizedMap, context, new b(map, map2, mapSynchronizedMap, cVarA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f9082a, context, null));
            return;
        }
        if (cVarA.f9111d != null && cVarA.f9111d != interfaceC0148a) {
            com.applovin.impl.sdk.o.j("MediationAdLoadManagerV2", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
        }
        cVarA.f9111d = interfaceC0148a;
    }

    public int b(String str) {
        int iIntValue;
        synchronized (this.f9089h) {
            Integer num = (Integer) this.f9088g.get(str);
            iIntValue = num != null ? num.intValue() : 0;
        }
        return iIntValue;
    }

    public Queue c(String str) {
        ArrayDeque arrayDeque = new ArrayDeque();
        y2 y2Var = (y2) this.f9087f.get(str);
        if (y2Var != null) {
            arrayDeque.add(y2Var);
        }
        synchronized (this.f9084c) {
            Queue queue = (Queue) this.f9085d.get(str);
            if (queue != null) {
                arrayDeque.addAll(queue);
            }
        }
        return arrayDeque;
    }

    public void c(String str, String str2) {
        synchronized (this.f9084c) {
            this.f9083b.remove(b(str, str2));
        }
    }

    public void d(String str) {
        synchronized (this.f9089h) {
            this.f9082a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f9082a.O().a("MediationAdLoadManagerV2", "Incrementing ad load failures count for ad unit ID: " + str);
            }
            Integer num = (Integer) this.f9088g.get(str);
            if (num == null) {
                num = 0;
            }
            this.f9088g.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public boolean e(String str) {
        boolean z10;
        synchronized (this.f9086e) {
            z10 = !CollectionUtils.isEmpty((Queue) this.f9085d.get(str));
        }
        return z10;
    }
}
