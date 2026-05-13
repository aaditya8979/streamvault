package com.mbridge.msdk.config.component.nori.monitor;

import com.ironsource.C3978d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: MonitorNetworkRequestLink.java */
/* JADX INFO: loaded from: classes12.dex */
public class a {
    private static boolean H = MBridgeConstans.DEBUG;
    private static final AtomicInteger I = new AtomicInteger(0);
    private static final AtomicInteger J = new AtomicInteger(0);
    private Map<String, Object> F;
    private Map<String, Integer> G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f36292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f36294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f36295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f36296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f36297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f36298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f36299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f36300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f36301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f36302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f36303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f36304m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f36305n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f36306o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f36307p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f36308q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f36309r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f36310s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f36311t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f36312u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f36313v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f36314w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f36315x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f36316y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f36317z = 0;
    private long A = 0;
    private long B = 0;
    private long C = 0;
    private long D = 0;
    private long E = 0;

    public void a() {
        if (this.f36292a) {
            return;
        }
        k();
    }

    public void a(int i10, int i11, int i12) {
        if (this.f36292a) {
            return;
        }
        HashMap map = new HashMap();
        this.G = map;
        map.put("threadPoolSize", Integer.valueOf(i10));
        this.G.put("activeThreads", Integer.valueOf(i11));
        this.G.put("queuedTasks", Integer.valueOf(i12));
    }

    public void a(long j10) {
        if (this.f36292a) {
            return;
        }
        this.f36299h = (System.nanoTime() - this.f36312u) / 1000000;
        this.f36294c = j10;
    }

    public void a(IOException iOException) {
        if (this.f36292a) {
            return;
        }
        k();
    }

    public void a(String str) {
        if (H) {
            try {
                int iH = m0.h();
                int iV = m0.v();
                HashMap map = new HashMap();
                map.put("reason", str);
                map.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                map.put("available_memory_mb", Integer.valueOf(iH));
                map.put("total_memory_mb", Integer.valueOf(iV));
                j().put("task_rejection", map);
            } catch (Exception e10) {
                q0.b("NetworkRequestMonitor", "Failed to record task rejection: " + e10.getMessage());
            }
        }
    }

    public void a(boolean z10) {
        this.f36292a = z10;
        if (z10) {
            this.f36293b++;
        }
    }

    public void b() {
        if (this.f36292a) {
            return;
        }
        l();
    }

    public void b(long j10) {
        if (this.f36292a) {
            return;
        }
        this.f36301j = (System.nanoTime() - this.f36316y) / 1000000;
        this.f36295d = j10;
    }

    public void c() {
        if (this.f36292a) {
            return;
        }
        this.f36298g = (System.nanoTime() - this.f36308q) / 1000000;
    }

    public void d() {
    }

    public void e() {
        if (this.f36292a) {
            return;
        }
        this.f36308q = System.nanoTime();
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
        if (this.f36292a) {
            return;
        }
        this.f36297f = (System.nanoTime() - this.f36306o) / 1000000;
    }

    public void i() {
        if (this.f36292a) {
            return;
        }
        this.f36306o = System.nanoTime();
    }

    public Map<String, Object> j() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("isRetry", Boolean.valueOf(this.f36292a));
        map2.put("retryCount", Integer.valueOf(this.f36293b));
        map2.put("requestBodySize", Long.valueOf(this.f36294c));
        map2.put("responseBodySize", Long.valueOf(this.f36295d));
        map.put("basicInfo", map2);
        HashMap map3 = new HashMap();
        map3.put("totalTime", Long.valueOf(this.f36296e));
        map3.put("dnsTime", Long.valueOf(this.f36297f));
        map3.put("connectionTime", Long.valueOf(this.f36298g));
        map3.put("requestTime", Long.valueOf(this.f36299h));
        map3.put("serverTime", Long.valueOf(this.f36300i));
        map3.put("responseTime", Long.valueOf(this.f36301j));
        map3.put("queueTime", Long.valueOf(this.f36302k));
        map3.put("parsingTime", Long.valueOf(this.f36303l));
        map.put("timingInfo", map3);
        map.put(C3978d4.j.f31392h0, this.F);
        map.put("threadPoolInfo", this.G);
        return map;
    }

    public void k() {
        if (this.f36292a) {
            return;
        }
        this.f36296e = (System.nanoTime() - this.f36304m) / 1000000;
    }

    public void l() {
        if (this.f36292a) {
            return;
        }
        this.f36302k = (System.nanoTime() - this.f36304m) / 1000000;
    }

    public void m() {
        if (this.f36292a) {
            return;
        }
        this.f36304m = System.nanoTime();
    }

    public void n() {
        if (this.f36292a) {
            return;
        }
        this.f36314w = System.nanoTime();
    }

    public void o() {
        if (this.f36292a) {
            return;
        }
        this.f36313v = System.nanoTime();
    }

    public void p() {
        if (this.f36292a) {
            return;
        }
        this.f36312u = System.nanoTime();
    }

    public void q() {
        if (this.f36292a) {
            return;
        }
        this.A = System.nanoTime();
    }

    public void r() {
        if (this.f36292a) {
            return;
        }
        this.f36317z = System.nanoTime();
    }

    public void s() {
        if (this.f36292a) {
            return;
        }
        long jNanoTime = System.nanoTime();
        this.f36316y = jNanoTime;
        this.f36300i = (jNanoTime - this.f36315x) / 1000000;
    }

    public void t() {
        if (this.f36292a) {
            return;
        }
        this.f36310s = System.nanoTime();
    }

    public void u() {
        if (this.f36292a) {
            return;
        }
        this.f36309r = System.nanoTime();
    }
}
