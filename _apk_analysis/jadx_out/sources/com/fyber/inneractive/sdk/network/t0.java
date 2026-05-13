package com.fyber.inneractive.sdk.network;

import android.util.Log;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f17034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f17035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f17036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p0 f17037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f17038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile i1 f17039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f17041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f17042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f17043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f17046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f17047n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17048o;

    public t0(f0 f0Var, h hVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f17034a = false;
        this.f17039f = i1.INITIAL;
        this.f17042i = 0L;
        this.f17043j = 0L;
        this.f17044k = 0;
        this.f17045l = false;
        this.f17046m = false;
        this.f17047n = new Object();
        this.f17048o = false;
        this.f17035b = f0Var;
        this.f17036c = hVar;
        this.f17040g = UUID.randomUUID().toString();
        this.f17041h = rVar;
    }

    public t0(t0 t0Var) {
        this.f17034a = false;
        this.f17039f = i1.INITIAL;
        this.f17042i = 0L;
        this.f17043j = 0L;
        this.f17044k = 0;
        this.f17045l = false;
        this.f17046m = false;
        this.f17047n = new Object();
        this.f17048o = false;
        this.f17035b = t0Var.f17035b;
        this.f17036c = t0Var.f17036c;
        this.f17040g = UUID.randomUUID().toString();
        this.f17041h = t0Var.f17041h;
        this.f17044k = t0Var.f17044k;
        this.f17042i = t0Var.f17042i;
        this.f17043j = t0Var.f17043j;
    }

    public static int a(Map map) {
        List list = map != null ? (List) map.get("Content-Length") : null;
        if (list != null) {
            return com.fyber.inneractive.sdk.util.v.a((String) list.get(0), -1);
        }
        return -1;
    }

    public l a(String str) throws Exception {
        try {
            p0 p0Var = this.f17037d;
            if (p0Var != null) {
                p0Var.a("sdkInitNetworkRequest");
            }
            this.f17038e = this.f17036c.a(this, com.fyber.inneractive.sdk.util.o.h(), str);
            p0 p0Var2 = this.f17037d;
            if (p0Var2 != null) {
                p0Var2.a("sdkGotServerResponse");
            }
            return this.f17038e;
        } catch (b e10) {
            IAlog.a("failed start network request for url: %s msg: %s", r(), e10.getMessage());
            throw e10;
        } catch (q1 e11) {
            IAlog.a("failed read network response for url: %s msg: %s", r(), e11.getMessage());
            throw e11;
        } catch (Exception e12) {
            IAlog.a("failed start network request for url: %s msg: %s", r(), e12.getMessage());
            throw e12;
        }
    }

    public abstract o0 a(l lVar, Map map, int i10);

    public final com.fyber.inneractive.sdk.response.e a(int i10, o oVar, com.fyber.inneractive.sdk.response.j jVar, com.fyber.inneractive.sdk.dv.j jVar2) throws n0 {
        try {
            com.fyber.inneractive.sdk.response.a aVarA = com.fyber.inneractive.sdk.response.a.a(i10);
            if (aVarA == null) {
                aVarA = com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MRAID;
            }
            com.fyber.inneractive.sdk.factories.f fVar = com.fyber.inneractive.sdk.factories.d.f16273a;
            com.fyber.inneractive.sdk.factories.e eVar = (com.fyber.inneractive.sdk.factories.e) fVar.f16274a.get(aVarA);
            com.fyber.inneractive.sdk.response.b bVarB = eVar != null ? eVar.b() : null;
            if (bVarB == null) {
                IAlog.f("Received ad type %s does not have an appropriate parser!", Integer.valueOf(i10));
                if (fVar.f16274a.size() == 0) {
                    Log.e("Inneractive_error", "Critical error raised while fetching an ad - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
                }
                throw new n0("Could not find parser for ad type " + i10);
            }
            IAlog.a("Received ad type %s - Got parser! %s", Integer.valueOf(i10), bVarB);
            if (jVar != null) {
                bVarB.f19372c = jVar;
            }
            bVarB.f19370a = bVarB.a();
            if (oVar != null) {
                bVarB.f19372c = new com.fyber.inneractive.sdk.response.k(oVar);
            }
            com.fyber.inneractive.sdk.response.e eVarA = bVarB.a(null);
            eVarA.K = j();
            if (jVar2 != null) {
                eVarA.f19401u = jVar2;
            }
            p0 p0Var = this.f17037d;
            if (p0Var != null) {
                p0Var.a("sdkParsedResponse");
            }
            return eVarA;
        } catch (Exception e10) {
            IAlog.a("failed parse ad network request url: %s msg: %s", r(), e10.getMessage());
            throw new n0(e10);
        }
    }

    public void a(long j10) {
        synchronized (this.f17047n) {
            if (this.f17045l) {
                this.f17044k = (int) ((j10 - this.f17043j) + ((long) this.f17044k));
                this.f17045l = false;
            }
        }
    }

    public void a(o0 o0Var, String str, String str2) {
    }

    public final void a(Object obj, Exception exc, boolean z10) {
        p0 p0Var;
        if (!z10) {
            i1 i1Var = i1.RESOLVED;
            this.f17039f = i1Var;
            if (i1Var == i1.QUEUED_FOR_RETRY && (p0Var = this.f17037d) != null) {
                p0Var.a("sdkRequestEndedButWillBeRetried");
            }
        }
        com.fyber.inneractive.sdk.util.r.f19556b.post(new s0(this, obj, exc, z10));
    }

    public void b(long j10) {
        synchronized (this.f17047n) {
            if (this.f17046m) {
                this.f17044k = (int) ((j10 - this.f17042i) + ((long) this.f17044k));
                this.f17046m = false;
            }
        }
    }

    public void c() {
        this.f17034a = true;
    }

    public void c(long j10) {
        synchronized (this.f17047n) {
            if (!this.f17045l) {
                this.f17045l = true;
                this.f17043j = j10;
            }
        }
    }

    public void d() {
        boolean z10;
        synchronized (this.f17047n) {
            z10 = this.f17045l;
        }
        if (z10) {
            a(System.currentTimeMillis());
        } else if (t()) {
            b(System.currentTimeMillis());
        }
    }

    public void d(long j10) {
        synchronized (this.f17047n) {
            if (!this.f17046m) {
                this.f17046m = true;
                this.f17042i = j10;
            }
        }
    }

    public void e() {
        try {
            l lVar = this.f17038e;
            if (lVar != null) {
                lVar.a();
            }
            this.f17036c.getClass();
        } catch (Exception unused) {
        }
    }

    public byte[] f() {
        return null;
    }

    public abstract int g();

    public String h() {
        return null;
    }

    public a i() {
        return null;
    }

    public int j() {
        return this.f17044k;
    }

    public com.fyber.inneractive.sdk.config.global.r k() {
        return this.f17041h;
    }

    public Map l() {
        return null;
    }

    public abstract m0 m();

    public String n() {
        return "application/json; charset=utf-8";
    }

    public abstract g1 o();

    public l1 p() {
        IAConfigManager iAConfigManager = IAConfigManager.O;
        return new l1(iAConfigManager.f15975u.f16144b.a("connect_timeout", 5000, 1), iAConfigManager.f15975u.f16144b.a("read_timeout", 5000, 1));
    }

    public int q() {
        int i10;
        synchronized (this.f17047n) {
            i10 = this.f17044k;
        }
        return i10;
    }

    public abstract String r();

    public int s() {
        Integer numA;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f17041h;
        if (rVar == null || (numA = ((com.fyber.inneractive.sdk.config.global.features.k) rVar.a(com.fyber.inneractive.sdk.config.global.features.k.class)).a("watchdog_buffer_time_ms")) == null) {
            return 500;
        }
        return numA.intValue();
    }

    public final boolean t() {
        boolean z10;
        synchronized (this.f17047n) {
            z10 = this.f17046m;
        }
        return z10;
    }

    public abstract boolean u();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v() {
        /*
            r4 = this;
            boolean r0 = r4.f17048o
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L39
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.O
            com.fyber.inneractive.sdk.config.global.r r0 = r0.M
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.k> r3 = com.fyber.inneractive.sdk.config.global.features.k.class
            com.fyber.inneractive.sdk.config.global.features.h r0 = r0.a(r3)
            com.fyber.inneractive.sdk.config.global.features.k r0 = (com.fyber.inneractive.sdk.config.global.features.k) r0
            java.lang.String r3 = "should_add_request_watchdog"
            java.lang.Boolean r3 = r0.c(r3)
            if (r3 == 0) goto L1f
            boolean r3 = r3.booleanValue()
            goto L20
        L1f:
            r3 = r2
        L20:
            if (r3 != 0) goto L35
            java.lang.String r3 = "should_report_request_watchdog"
            java.lang.Boolean r0 = r0.c(r3)
            if (r0 == 0) goto L2f
            boolean r0 = r0.booleanValue()
            goto L30
        L2f:
            r0 = r2
        L30:
            if (r0 == 0) goto L33
            goto L35
        L33:
            r0 = r2
            goto L36
        L35:
            r0 = r1
        L36:
            if (r0 == 0) goto L39
            goto L3a
        L39:
            r1 = r2
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.t0.v():boolean");
    }
}
