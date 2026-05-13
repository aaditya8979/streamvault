package com.mbridge.msdk.tracker.network;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.Z7;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.thrid.okhttp.d0;
import com.unity3d.services.core.configuration.ExperimentsBase;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: NetworkMonitor.java */
/* JADX INFO: loaded from: classes8.dex */
public class p {
    private volatile long A;
    private volatile long B;
    private volatile long C;
    private volatile long D;
    private volatile long E;
    private volatile long F;
    private volatile long G;
    private volatile long H;
    private volatile List<InetAddress> I;
    private volatile InetSocketAddress J;
    private volatile Proxy K;
    private volatile com.mbridge.msdk.thrid.okhttp.q L;
    private volatile com.mbridge.msdk.thrid.okhttp.w M;
    private volatile IOException N;
    private volatile Exception P;
    private long R;
    private long S;
    private long T;
    private long U;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile String f40998d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile long f41000f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile String f41004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile String f41005k;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile long f41013s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile long f41014t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private volatile IOException f41015u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile long f41016v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private volatile long f41017w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile long f41019y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private volatile long f41020z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile String f40995a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f40996b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile String f40997c = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile String f40999e = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile int f41001g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile String f41002h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile int f41003i = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile String f41006l = ExperimentsBase.EXP_TAG_OK_HTTP;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile boolean f41007m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicInteger f41008n = new AtomicInteger(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile String f41009o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile long f41010p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile long f41011q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile long f41012r = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private volatile String f41018x = "system";
    private volatile boolean O = false;
    private volatile boolean Q = false;

    public p(String str, String str2) {
        this.f40998d = "";
        this.f41004j = "un_known";
        this.f41005k = "";
        this.f41004j = str;
        this.f41005k = str2;
        this.f40998d = UUID.randomUUID().toString();
    }

    private void P() {
        try {
            JSONObject jSONObjectX = x();
            com.mbridge.msdk.tracker.e eVarA = a(jSONObjectX, "m_request_end");
            if (MBridgeConstans.DEBUG) {
                q0.a("NetworkMonitor_" + H(), "request  end  monitor = " + jSONObjectX.toString());
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().d().d(eVarA);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("NetworkMonitor", "reportRequestEnd ", th2);
            }
        }
    }

    private void Q() {
        try {
            JSONObject jSONObjectZ = z();
            com.mbridge.msdk.tracker.e eVarA = a(jSONObjectZ, "m_request_start");
            if (MBridgeConstans.DEBUG) {
                q0.a("NetworkMonitor_" + H(), "request start monitor = " + jSONObjectZ.toString());
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().d().d(eVarA);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("NetworkMonitor", "reportRequestStart ", th2);
            }
        }
    }

    private void T() {
        this.N = null;
        this.f41015u = null;
        this.P = null;
        this.f41013s = 0L;
        this.f41014t = 0L;
        this.f41016v = 0L;
        this.f41017w = 0L;
        this.f41019y = 0L;
        this.f41020z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.F = 0L;
        this.G = 0L;
        this.H = 0L;
        this.f41011q = 0L;
        this.f41012r = 0L;
        this.f41007m = false;
        this.f41001g = -1;
        this.f41003i = -1;
        this.f41002h = "";
        this.f41009o = "";
        this.f41010p = 0L;
        this.Q = false;
    }

    private static com.mbridge.msdk.tracker.e a(JSONObject jSONObject, String str) {
        com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e(str);
        eVar.a(0);
        eVar.b(0);
        eVar.a(com.mbridge.msdk.foundation.same.report.c.d());
        eVar.a(jSONObject);
        return eVar;
    }

    private static String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        if (TextUtils.isEmpty(str2)) {
            str2 = "IOException";
        }
        objArr[0] = str2;
        sb2.append(String.format(str, objArr));
        sb2.append(TextUtils.isEmpty(str3) ? "" : str3.replaceAll("[\\n\\r]", Z7.f30794r));
        return sb2.toString();
    }

    private void a(IOException iOException, long j10) {
        if (iOException != null) {
            if (this.f41016v == 0) {
                this.f41016v = j10;
            }
            if (this.f41017w == 0) {
                this.f41017w = j10;
            }
            if (this.f41019y == 0) {
                this.f41019y = j10;
            }
            if (this.f41020z == 0) {
                this.f41020z = j10;
            }
            if (this.A == 0) {
                this.A = j10;
            }
            if (this.B == 0) {
                this.B = j10;
            }
            if (this.C == 0) {
                this.C = j10;
            }
            if (this.D == 0) {
                this.D = j10;
            }
            if (this.E == 0) {
                this.E = j10;
            }
            if (this.F == 0) {
                this.F = j10;
            }
            if (this.G == 0) {
                this.G = j10;
            }
            if (this.H == 0) {
                this.H = j10;
            }
        }
    }

    private JSONObject x() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", "m_request_end");
        jSONObject.put(CommonUrlParts.UUID, M());
        jSONObject.put("request_uuid", A());
        jSONObject.put("url", L());
        jSONObject.put("timeout", I());
        jSONObject.put("timeout_connection", e());
        jSONObject.put("timeout_read", s());
        jSONObject.put("timeout_write", N());
        jSONObject.put("scene", H());
        jSONObject.put("lrid", n());
        jSONObject.put("method", o());
        jSONObject.put("adtp", b());
        jSONObject.put("http_stack", m());
        jSONObject.put("retry_count", v() - 1);
        jSONObject.put("request_wait_duration", this.f41000f);
        jSONObject.put("duration", j());
        jSONObject.put("request_duration", w());
        jSONObject.put(com.safedk.android.analytics.brandsafety.c.f51874g, E());
        String strH = h();
        jSONObject.put("dns_result", strH);
        jSONObject.put("dns_status", TextUtils.isEmpty(strH) ? 2 : 1);
        jSONObject.put("is_connection_acquired", O() ? 1 : 0);
        jSONObject.put("address", c());
        jSONObject.put("port", p());
        jSONObject.put("proxy", r());
        jSONObject.put("protocol", q());
        jSONObject.put("tls_version", J());
        jSONObject.put("content_type", f());
        int iG = G();
        jSONObject.put("result", iG);
        if (iG != 1) {
            jSONObject.put("error_type", l());
            jSONObject.put("reason", k());
        }
        jSONObject.put("dns_duration", g());
        jSONObject.put("connect_duration", d());
        jSONObject.put("request_header_duration", y());
        jSONObject.put("request_body_duration", t());
        jSONObject.put("request_body_size", u());
        jSONObject.put("response_header_duration", F());
        jSONObject.put("response_body_duration", C());
        jSONObject.put("response_body_size", D());
        jSONObject.put("transmission_duration", K());
        jSONObject.put("current_response_body_size", B());
        jSONObject.put("dns_type", i());
        return jSONObject;
    }

    private JSONObject z() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", "m_request_start");
        jSONObject.put(CommonUrlParts.UUID, M());
        jSONObject.put("request_uuid", A());
        jSONObject.put("lrid", n());
        jSONObject.put("url", L());
        jSONObject.put("timeout", I());
        jSONObject.put("timeout_connection", e());
        jSONObject.put("timeout_read", s());
        jSONObject.put("timeout_write", N());
        jSONObject.put("scene", H());
        jSONObject.put("method", o());
        jSONObject.put("adtp", b());
        jSONObject.put("http_stack", m());
        jSONObject.put("retry_count", v() - 1);
        jSONObject.put("request_wait_duration", this.f41000f);
        return jSONObject;
    }

    public String A() {
        return TextUtils.isEmpty(this.f40999e) ? "" : this.f40999e;
    }

    public long B() {
        return this.f41012r;
    }

    public long C() {
        return this.H - this.G;
    }

    public long D() {
        return this.f41011q;
    }

    public int E() {
        return this.f41003i;
    }

    public long F() {
        return this.F - this.E;
    }

    public int G() {
        return this.f41001g;
    }

    public String H() {
        return TextUtils.isEmpty(this.f41004j) ? "un_known" : this.f41004j;
    }

    public long I() {
        return this.R;
    }

    public String J() {
        if (this.L != null) {
            try {
                d0 d0VarC = this.L.c();
                return d0VarC == null ? "" : d0VarC.d();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("NetworkMonitor", "getTlsVersion ", e10);
                }
            }
        }
        return "";
    }

    public long K() {
        return this.E - this.A;
    }

    public String L() {
        return TextUtils.isEmpty(this.f40995a) ? "" : this.f40995a;
    }

    public String M() {
        return TextUtils.isEmpty(this.f40998d) ? "" : this.f40998d;
    }

    public long N() {
        return this.U;
    }

    public boolean O() {
        return this.f41007m;
    }

    public void R() {
        this.C = SystemClock.elapsedRealtime();
    }

    public void S() {
        this.A = SystemClock.elapsedRealtime();
    }

    public void U() {
        this.G = SystemClock.elapsedRealtime();
    }

    public void V() {
        this.E = SystemClock.elapsedRealtime();
    }

    public void W() {
    }

    public void a() {
        this.f41016v = SystemClock.elapsedRealtime();
    }

    public void a(int i10) {
        this.f41001g = i10;
        if (this.Q) {
            this.Q = false;
            P();
        }
    }

    public void a(long j10) {
        this.f40999e = UUID.randomUUID().toString();
        this.f41000f = j10;
        this.f41008n.addAndGet(1);
        T();
        this.Q = true;
        Q();
    }

    public void a(com.mbridge.msdk.thrid.okhttp.a0 a0Var) {
        this.F = SystemClock.elapsedRealtime();
        if (a0Var != null) {
            try {
                com.mbridge.msdk.thrid.okhttp.r rVarM = a0Var.m();
                if (rVarM != null) {
                    String strB = rVarM.b("Content-Type");
                    if (TextUtils.isEmpty(strB)) {
                        strB = "";
                    }
                    b(strB);
                }
            } catch (Exception e10) {
                b("unknown");
                if (MBridgeConstans.DEBUG) {
                    q0.b("NetworkMonitor", "responseHeadersEnd ", e10);
                }
            }
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.d dVar) {
        this.f41013s = SystemClock.elapsedRealtime();
    }

    public void a(com.mbridge.msdk.thrid.okhttp.h hVar) {
        this.f41007m = !this.O;
        if (!this.f41007m || hVar == null) {
            return;
        }
        try {
            this.M = hVar.a();
            com.mbridge.msdk.thrid.okhttp.c0 c0VarC = hVar.c();
            if (c0VarC != null) {
                this.J = c0VarC.d();
                this.K = c0VarC.b();
            }
            this.L = hVar.b();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("NetworkMonitor", "connectionAcquired ", e10);
            }
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.q qVar) {
        this.L = qVar;
    }

    public void a(com.mbridge.msdk.thrid.okhttp.w wVar, IOException iOException) {
        this.f41020z = SystemClock.elapsedRealtime();
        this.M = wVar;
        this.N = iOException;
    }

    public void a(com.mbridge.msdk.thrid.okhttp.y yVar) {
        this.B = SystemClock.elapsedRealtime();
    }

    public void a(IOException iOException) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f41014t = jElapsedRealtime;
        this.f41015u = iOException;
        a(iOException, jElapsedRealtime);
    }

    public void a(Exception exc) {
        this.P = exc;
    }

    public void a(String str) {
        this.f40997c = str;
    }

    public void a(InetSocketAddress inetSocketAddress, Proxy proxy) {
        this.f41019y = SystemClock.elapsedRealtime();
        this.J = inetSocketAddress;
        this.K = proxy;
        this.O = true;
    }

    public void a(List<InetAddress> list) {
        this.f41017w = SystemClock.elapsedRealtime();
        this.I = list;
    }

    public String b() {
        return TextUtils.isEmpty(this.f40997c) ? "" : this.f40997c;
    }

    public void b(int i10) {
        this.f41003i = i10;
    }

    public void b(long j10) {
        this.D = SystemClock.elapsedRealtime();
    }

    public void b(com.mbridge.msdk.thrid.okhttp.h hVar) {
    }

    public void b(String str) {
        this.f41009o = str;
    }

    public String c() {
        if (this.J != null) {
            try {
                InetAddress address = this.J.getAddress();
                if (address == null) {
                    return "";
                }
                String hostAddress = address.getHostAddress();
                return TextUtils.isEmpty(hostAddress) ? "" : hostAddress;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("NetworkMonitor", "getAddress ", e10);
                }
            }
        }
        return "";
    }

    public void c(long j10) {
        this.f41012r = j10;
    }

    public void c(String str) {
        this.f41018x = str;
    }

    public long d() {
        return this.f41020z - this.f41019y;
    }

    public void d(long j10) {
        this.H = SystemClock.elapsedRealtime();
    }

    public void d(String str) {
        this.f41002h = str;
    }

    public long e() {
        return this.S;
    }

    public void e(long j10) {
        this.S = j10;
    }

    public void e(String str) {
        this.f40996b = str;
    }

    public String f() {
        return com.mbridge.msdk.foundation.same.d.a(this.f41009o);
    }

    public void f(long j10) {
        this.T = j10;
    }

    public void f(String str) {
        this.f40995a = str;
    }

    public long g() {
        return this.f41017w - this.f41016v;
    }

    public void g(long j10) {
        this.f41010p = j10;
    }

    public String h() {
        if (this.I == null || this.I.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.I.size(); i10++) {
            try {
                InetAddress inetAddress = this.I.get(i10);
                if (inetAddress != null) {
                    sb2.append(inetAddress.getHostAddress());
                    if (i10 != this.I.size() - 1) {
                        sb2.append(StringUtils.COMMA);
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("NetworkMonitor", "getDnsResult ", e10);
                }
            }
        }
        return sb2.toString();
    }

    public void h(long j10) {
        this.f41011q = j10;
    }

    public String i() {
        return TextUtils.isEmpty(this.f41018x) ? "system" : this.f41018x;
    }

    public void i(long j10) {
        this.R = j10;
    }

    public long j() {
        return (this.f41014t - this.f41013s) + this.f41000f;
    }

    public void j(long j10) {
        this.U = j10;
    }

    public String k() {
        try {
            if (this.N != null) {
                String name = this.N.getClass().getName();
                String message = this.N.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    return a("connection: %s ", name, message);
                }
            }
            if (this.f41015u != null) {
                String name2 = this.f41015u.getClass().getName();
                String message2 = this.f41015u.getMessage();
                if (!TextUtils.isEmpty(message2)) {
                    return a("call: %s ", name2, message2);
                }
            }
            if (this.P == null) {
                return "un_known";
            }
            String name3 = this.P.getClass().getName();
            String message3 = this.P.getMessage();
            return !TextUtils.isEmpty(message3) ? a("error: %s ", name3, message3) : "un_known";
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return "un_known";
            }
            q0.b("NetworkMonitor", "getError ", e10);
            return "un_known";
        }
    }

    public String l() {
        return this.f41002h;
    }

    public String m() {
        return this.f41006l;
    }

    public String n() {
        return TextUtils.isEmpty(this.f40996b) ? "" : this.f40996b;
    }

    public String o() {
        return TextUtils.isEmpty(this.f41005k) ? "" : this.f41005k;
    }

    public int p() {
        if (this.J != null) {
            return this.J.getPort();
        }
        return -1;
    }

    public String q() {
        return this.M != null ? this.M.toString() : "";
    }

    public String r() {
        Proxy.Type type;
        return (this.K == null || (type = this.K.type()) == null) ? "" : type.toString();
    }

    public long s() {
        return this.T;
    }

    public long t() {
        return this.D - this.C;
    }

    public long u() {
        return this.f41010p;
    }

    public int v() {
        return this.f41008n.getAndAdd(0);
    }

    public long w() {
        return this.f41014t - this.f41013s;
    }

    public long y() {
        return this.B - this.A;
    }
}
