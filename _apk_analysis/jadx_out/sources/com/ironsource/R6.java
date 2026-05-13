package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinVersion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class R6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B7 f30336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f30337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f30338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f30339d;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f30340a;

        public a(Context context) {
            this.f30340a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                R6.this.e(this.f30340a);
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            R6.this.f30338c.set(false);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static volatile R6 f30342a = new R6();

        private b() {
        }
    }

    private R6() {
        this.f30338c = new AtomicBoolean(false);
        this.f30339d = new AtomicBoolean(false);
        this.f30336a = Lb.U().i();
        this.f30337b = new ConcurrentHashMap<>();
    }

    private void a() {
        String strA = C4008eg.f31592a.a();
        if (strA != null) {
            HashMap map = new HashMap();
            map.put("sdk", strA);
            HashMap map2 = new HashMap();
            map2.put(Q6.H1, map);
            Map<String, Object> map3 = new HashMap<>();
            map3.put(Q6.E1, map2);
            a(map3);
        }
    }

    private void a(Context context) {
        if (this.f30338c.get()) {
            return;
        }
        try {
            this.f30338c.set(true);
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(context));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            this.f30338c.set(false);
        }
    }

    private void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof Boolean) {
                obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            }
            this.f30337b.put(str, obj);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private boolean a(String str) {
        return str != null && this.f30337b.containsKey(str);
    }

    public static R6 b() {
        return b.f30342a;
    }

    private void d(Context context) {
        if (context == null || this.f30339d.getAndSet(true)) {
            return;
        }
        a("auid", this.f30336a.d(context));
        a("model", this.f30336a.l());
        a(Q6.f30265t, this.f30336a.q());
        a(Q6.F, this.f30336a.f());
        a(Q6.f30253p, this.f30336a.L(context));
        String adQualitySdkVersion = AdQualityBridge.getAdQualitySdkVersion();
        if (!TextUtils.isEmpty(adQualitySdkVersion)) {
            a(Q6.C1, adQualitySdkVersion);
        }
        String strI = this.f30336a.i();
        if (strI != null) {
            a(Q6.G, strI.replaceAll("[^0-9/.]", ""));
            a(Q6.J, strI);
        }
        a(Q6.f30208a, String.valueOf(this.f30336a.e()));
        String strU = this.f30336a.u(context);
        if (!TextUtils.isEmpty(strU)) {
            a(Q6.Q0, strU);
        }
        String strE = C1.e(context);
        if (!TextUtils.isEmpty(strE)) {
            a(Q6.f30250o, strE);
        }
        String strR = this.f30336a.r(context);
        if (!TextUtils.isEmpty(strR)) {
            a(Q6.f30275w0, strR);
        }
        a("bid", context.getPackageName());
        a("mem", String.valueOf(this.f30336a.q(context)));
        a(Q6.f30212b0, "2.0");
        a(Q6.f30215c0, Long.valueOf(C1.f(context)));
        a(Q6.f30209a0, Long.valueOf(C1.d(context)));
        a(Q6.f30217d, C1.b(context));
        a(Q6.O, Integer.valueOf(Z3.f(context)));
        a(Q6.Y, Z3.g(context));
        a("stid", C3951bd.d(context));
        a("platform", "android");
        a("osArch", this.f30336a.t());
        a("mThreshold", this.f30336a.a(this.f30336a.n(context)));
        a(Q6.f30230h0, KotlinVersion.CURRENT.toString());
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        if (context == null) {
            return;
        }
        try {
            String strI = this.f30336a.I(context);
            if (!TextUtils.isEmpty(strI)) {
                a(Q6.V0, strI);
            }
            String strB = this.f30336a.b(context);
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            a(Q6.f30262s, Boolean.valueOf(Boolean.parseBoolean(strB)));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private void f(Context context) {
        if (context == null) {
            return;
        }
        a(context);
        String strY = this.f30336a.y(context);
        if (!TextUtils.isEmpty(strY)) {
            a(Q6.L0, strY);
        } else if (a(Q6.L0)) {
            b(Q6.L0);
        }
        a("idfi", this.f30336a.i(context));
        String strC = this.f30336a.c(context);
        if (!TextUtils.isEmpty(strC)) {
            a(Q6.f30256q, strC.toUpperCase(Locale.getDefault()));
        }
        a(Q6.f30259r, this.f30336a.A(context));
        String strD = this.f30336a.d();
        if (!TextUtils.isEmpty(strD)) {
            a("tz", strD);
        }
        String strB = C3924a4.b(context);
        if (!TextUtils.isEmpty(strB) && !strB.equals("none")) {
            a(Q6.f30235j, strB);
        }
        String strD2 = C3924a4.d(context);
        if (!TextUtils.isEmpty(strD2)) {
            a(Q6.f30238k, strD2);
        }
        a("vpn", Boolean.valueOf(C3924a4.e(context)));
        String strG = this.f30336a.G(context);
        if (!TextUtils.isEmpty(strG)) {
            a("icc", strG);
        }
        int iS = this.f30336a.s(context);
        if (iS >= 0) {
            a(Q6.f30240k1, Integer.valueOf(iS));
        }
        a(Q6.f30243l1, this.f30336a.v(context));
        a(Q6.f30246m1, this.f30336a.F(context));
        a(Q6.f30233i0, Float.valueOf(this.f30336a.E(context)));
        a(Q6.f30244m, String.valueOf(this.f30336a.h()));
        a(Q6.R, Integer.valueOf(this.f30336a.k()));
        a(Q6.Q, Integer.valueOf(this.f30336a.c()));
        a(Q6.Y0, String.valueOf(this.f30336a.a()));
        a(Q6.f30231h1, String.valueOf(this.f30336a.m()));
        a("mcc", Integer.valueOf(Z3.b(context)));
        a("mnc", Integer.valueOf(Z3.c(context)));
        a(Q6.T, Boolean.valueOf(this.f30336a.j()));
        a(Q6.f30226g, Boolean.valueOf(this.f30336a.C(context)));
        a(Q6.f30229h, Integer.valueOf(this.f30336a.D(context)));
        a(Q6.f30211b, Boolean.valueOf(this.f30336a.e(context)));
        a(Q6.K, Boolean.valueOf(this.f30336a.h(context)));
        a("rt", Boolean.valueOf(this.f30336a.p()));
        a(Q6.Z, String.valueOf(this.f30336a.r()));
        a(Q6.f30220e, Integer.valueOf(this.f30336a.k(context)));
        a(Q6.Z0, Boolean.valueOf(this.f30336a.J(context)));
        a(Q6.f30214c, this.f30336a.m(context));
        a(Q6.f30218d0, this.f30336a.s());
        C4359z c4359z = new C4359z(Lb.U().s());
        HashMap map = new HashMap();
        c4359z.a(map);
        a(Q6.E0, map);
        a(Q6.L, ConfigFile.getConfigFile().getPluginType());
        a(Q6.M, ConfigFile.getConfigFile().getPluginVersion());
        a(Q6.N, ConfigFile.getConfigFile().getPluginFrameworkVersion());
    }

    public void a(String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        try {
            Object obj = this.f30337b.get(str);
            if (!(obj instanceof JSONArray)) {
                a(str, (Object) jSONArray);
                return;
            }
            JSONArray jSONArray2 = (JSONArray) obj;
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                jSONArray2.put(jSONArray.get(i10));
            }
            a(str, (Object) jSONArray2);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Object obj = this.f30337b.get(str);
            if (!(obj instanceof JSONObject)) {
                a(str, (Object) jSONObject);
                return;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.putOpt(next, jSONObject.opt(next));
            }
            a(str, (Object) jSONObject2);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void a(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                if (map.containsKey(str)) {
                    a(str, map.get(str));
                }
            }
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public JSONObject b(Context context) throws JSONException {
        f(context);
        return new JSONObject(T6.a(this.f30337b));
    }

    public void b(String str) {
        if (str == null) {
            return;
        }
        try {
            this.f30337b.remove(str);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void b(String str, Object obj) {
        a(str, obj);
    }

    public void c(Context context) {
        try {
            d(context);
            f(context);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }
}
