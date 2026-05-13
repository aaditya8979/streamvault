package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.tracker.x;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: Global.java */
/* JADX INFO: loaded from: classes9.dex */
class k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static volatile String f40935o = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f40936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f40937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f40938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private x f40939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f40940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<String> f40941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f40942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile c f40943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile l f40944i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile d f40945j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile j f40946k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile s f40947l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile boolean f40948m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile o f40949n;

    public k(String str, m mVar) {
        this.f40936a = str;
        this.f40937b = mVar;
    }

    public void a(Context context) {
        this.f40938c = context;
    }

    public void a(x xVar) {
        this.f40939d = xVar;
    }

    public void a(JSONObject jSONObject) {
        this.f40940e = jSONObject;
    }

    public boolean a() throws IllegalStateException {
        if (y.b(b())) {
            throw new IllegalStateException("config can not be null");
        }
        if (y.b(f())) {
            throw new IllegalStateException("decorate can not be null");
        }
        if (y.b(r())) {
            throw new IllegalStateException("responseHandler can not be null");
        }
        if (y.b(n()) || y.b(n().b())) {
            throw new IllegalStateException("networkStackConfig or stack can not be null");
        }
        if (TextUtils.isEmpty(n().c())) {
            throw new IllegalStateException("report url is null");
        }
        return true;
    }

    public boolean a(e eVar) {
        if (y.b(eVar)) {
            return false;
        }
        f fVar = b().f41155j;
        if (y.a(fVar)) {
            try {
                return fVar.a(eVar);
            } catch (Exception e10) {
                if (a.f40902a) {
                    Log.e("TrackManager", "event filter apply exception", e10);
                }
            }
        }
        String strG = eVar.g();
        if (TextUtils.isEmpty(strG)) {
            return false;
        }
        if (this.f40942g != null) {
            try {
                return !r0.contains(strG);
            } catch (Exception e11) {
                if (a.f40902a) {
                    Log.e("TrackManager", "disallowTrackEventNames contains exception", e11);
                }
            }
        }
        List<String> list = this.f40941f;
        if (list != null) {
            try {
                return list.contains(strG);
            } catch (Exception e12) {
                if (a.f40902a) {
                    Log.e("TrackManager", "allowTrackEventNames contains exception", e12);
                }
            }
        }
        return true;
    }

    public x b() {
        x xVar = this.f40939d;
        if (xVar != null) {
            return xVar;
        }
        x xVarA = new x.b().a();
        this.f40939d = xVarA;
        return xVarA;
    }

    public Context c() {
        return this.f40938c;
    }

    public c d() {
        if (y.b(this.f40943h)) {
            synchronized (k.class) {
                if (y.b(this.f40943h)) {
                    String strT = t();
                    this.f40943h = new c(new b(c(), e(), strT), strT);
                }
            }
        }
        return this.f40943h;
    }

    public String e() {
        return TextUtils.isEmpty(v()) ? String.format("track_manager_%s.db", "default") : String.format("track_manager_%s.db", v());
    }

    public d f() {
        if (y.b(this.f40945j)) {
            this.f40945j = b().f41153h;
        }
        return this.f40945j;
    }

    public l g() {
        if (y.b(this.f40944i)) {
            synchronized (k.class) {
                if (y.b(this.f40944i)) {
                    this.f40944i = new q(new g(d(), p()));
                }
            }
        }
        return this.f40944i;
    }

    public j h() {
        if (y.b(this.f40946k)) {
            synchronized (k.class) {
                if (y.b(this.f40946k)) {
                    this.f40946k = new j();
                }
            }
        }
        return this.f40946k;
    }

    public int i() {
        if (b().f41146a < 0) {
            return 50;
        }
        return b().f41146a;
    }

    public int j() {
        return Math.max(b().f41150e, 0);
    }

    public int k() {
        if (b().f41149d <= 0) {
            return 2;
        }
        return b().f41149d;
    }

    public int l() {
        return Math.max(b().f41147b, 0);
    }

    public o m() {
        if (y.b(this.f40949n)) {
            synchronized (k.class) {
                if (y.b(this.f40949n)) {
                    this.f40949n = new o(k(), n(), r(), q());
                }
            }
        }
        return this.f40949n;
    }

    public p n() {
        return b().f41152g;
    }

    public JSONObject o() {
        JSONObject jSONObject = this.f40940e;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f40940e = jSONObject2;
        return jSONObject2;
    }

    public s p() {
        if (y.b(this.f40947l)) {
            synchronized (k.class) {
                if (y.b(this.f40947l)) {
                    this.f40947l = new s(this);
                }
            }
        }
        return this.f40947l;
    }

    public int q() {
        return b().f41148c;
    }

    public w r() {
        return b().f41154i;
    }

    public String s() {
        if (!TextUtils.isEmpty(f40935o)) {
            return f40935o;
        }
        String string = UUID.randomUUID().toString();
        f40935o = string;
        return string;
    }

    public String t() {
        return "event_table";
    }

    public m u() {
        return this.f40937b;
    }

    public String v() {
        return this.f40936a;
    }

    public boolean w() {
        return this.f40948m;
    }

    public String x() {
        if (!y.b(this.f40938c) && !y.b(this.f40939d)) {
            try {
                p().j();
                this.f40948m = false;
                if (TextUtils.isEmpty(f40935o)) {
                    f40935o = UUID.randomUUID().toString();
                }
                return f40935o;
            } catch (Exception e10) {
                if (a.f40902a) {
                    Log.e("TrackManager", "start error", e10);
                }
                this.f40948m = true;
            }
        }
        return "";
    }
}
