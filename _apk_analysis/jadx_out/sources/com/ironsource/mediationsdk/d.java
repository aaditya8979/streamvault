package com.ironsource.mediationsdk;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.ironsource.B7;
import com.ironsource.C3958c2;
import com.ironsource.C4002ea;
import com.ironsource.C4030g2;
import com.ironsource.C4127la;
import com.ironsource.C4157n2;
import com.ironsource.C4228r4;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.Lb;
import com.ironsource.Q6;
import com.ironsource.V1;
import com.ironsource.X0;
import com.ironsource.X9;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class d {
    public static final boolean A = false;
    private static d B = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f32388c = "auctionId";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f32389d = "armData";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f32390e = "larmData";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f32391f = "isAdUnitCapped";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f32392g = "settings";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f32393h = "waterfall";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f32394i = "genericParams";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f32395j = "configurations";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f32396k = "instances";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f32397l = "${AUCTION_LOSS}";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f32398m = "${AUCTION_MBR}";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f32399n = "${AUCTION_PRICE}";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f32400o = "${DYNAMIC_DEMAND_SOURCE}";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f32401p = "${INSTANCE}";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f32402q = "${INSTANCE_TYPE}";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f32403r = "${PLACEMENT_NAME}";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f32404s = "adMarkup";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f32405t = "dynamicDemandSource";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f32406u = "params";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f32407v = "dlpl";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f32408w = "adUnit";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f32409x = "parallelLoad";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f32410y = "bidderExclusive";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f32411z = "showPriorityEnabled";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f32412a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B7 f32413b = Lb.U().i();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<C4157n2> f32415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C4157n2 f32416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private JSONObject f32417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private JSONObject f32418e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f32419f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f32420g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private V1 f32421h;

        public a(String str) {
            this.f32414a = str;
        }

        public com.ironsource.mediationsdk.demandOnly.p a(String str) {
            V1 v12 = this.f32421h;
            return v12 != null ? v12.a(str) : new p.b();
        }

        public String a() {
            return this.f32414a;
        }

        public JSONObject b() {
            return this.f32418e;
        }

        public int c() {
            return this.f32419f;
        }

        public String d() {
            return this.f32420g;
        }

        public C4157n2 e() {
            return this.f32416c;
        }

        public JSONObject f() {
            return this.f32417d;
        }

        public V1 g() {
            return this.f32421h;
        }

        public List<C4157n2> h() {
            return this.f32415b;
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f32422d = 15000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f32424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f32425c;

        public b(String str, String str2, String str3) {
            this.f32423a = str;
            this.f32424b = str2;
            this.f32425c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this.f32423a + ";" + this.f32424b + ";" + this.f32425c;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f32425c).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.connect();
                int iHttpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                String responseMessage = httpURLConnection.getResponseMessage();
                IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                Lb.U().q().a(new C5(iHttpUrlConnectionGetResponseCode == 200 || iHttpUrlConnectionGetResponseCode == 204 ? D5.TROUBLESHOOTING_SEND_AUCTION_URL_SUCCESS : D5.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, IronSourceVideoBridge.jsonObjectInit().put(IronSourceConstants.EVENTS_PROVIDER, "Mediation").put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1).put(IronSourceConstants.EVENTS_EXT1, str).put(IronSourceConstants.EVENTS_ERROR_CODE, iHttpUrlConnectionGetResponseCode).put("reason", responseMessage)));
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error("Send auction url failed with params - " + str + ";" + e10.getMessage());
            }
        }
    }

    public enum c {
        NOT_SECURE,
        SECURE
    }

    private c a() {
        c cVar = c.SECURE;
        return Build.VERSION.SDK_INT >= 28 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() ? c.NOT_SECURE : cVar : (ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) != 0 ? c.NOT_SECURE : cVar;
    }

    private String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        double d10 = Double.parseDouble(str);
        return Double.parseDouble(str2) == 0.0d ? "" : String.valueOf(Math.round((d10 / r7) * 1000.0d) / 1000.0d);
    }

    public static d b() {
        return B;
    }

    public a a(JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString("auctionId");
        if (TextUtils.isEmpty(strOptString)) {
            throw new JSONException("Invalid auction response - auction id is missing");
        }
        a aVar = new a(strOptString);
        if (jSONObject.has("settings")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
            aVar.f32416c = new C4157n2(jSONObject2);
            jSONObjectOptJSONObject = jSONObject2.has(f32389d) ? jSONObject2.optJSONObject(f32389d) : null;
            if (jSONObject2.has("genericParams")) {
                aVar.f32417d = jSONObject2.optJSONObject("genericParams");
            }
            if (jSONObject2.has("configurations")) {
                aVar.f32418e = jSONObject2.optJSONObject("configurations");
            }
            if (jSONObject2.has(f32396k)) {
                aVar.f32421h = new V1.a(jSONObject2.optJSONObject(f32396k));
            }
        }
        aVar.f32415b = new ArrayList();
        if (jSONObject.has(f32393h)) {
            JSONArray jSONArray = jSONObject.getJSONArray(f32393h);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                C4157n2 c4157n2 = new C4157n2(jSONArray.getJSONObject(i10), i10, jSONObjectOptJSONObject);
                if (!c4157n2.n()) {
                    aVar.f32419f = 1002;
                    aVar.f32420g = "waterfall " + i10;
                    IronLog.INTERNAL.verbose("AuctionResponseItem " + i10 + " not valid - parsing error");
                    throw new JSONException("invalid response");
                }
                aVar.f32415b.add(c4157n2);
            }
        }
        return aVar;
    }

    public String a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
            return jSONObjectJsonObjectInit.has("adMarkup") ? jSONObjectJsonObjectInit.getString("adMarkup") : str;
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error("exception " + e10.getMessage());
            return str;
        }
    }

    public String a(String str, int i10, C4157n2 c4157n2, String str2, String str3, String str4) {
        String strI = c4157n2.i();
        return a(str, c4157n2.c(), i10, b().c(c4157n2.k()), strI, b().a(strI, str2), str3, str4);
    }

    public String a(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7) {
        return str.replace(f32399n, str4).replace(f32397l, str6).replace(f32398m, str5).replace(f32401p, str2).replace(f32402q, Integer.toString(i10)).replace(f32400o, str3).replace(f32403r, str7);
    }

    public JSONObject a(i iVar) throws JSONException {
        boolean z10;
        boolean z11;
        ISBannerSize iSBannerSize;
        IronSource.a aVarC = iVar.c();
        boolean zT = iVar.t();
        Map<String, Object> mapH = iVar.h();
        List<String> listL = iVar.l();
        h hVarE = iVar.e();
        int iO = iVar.o();
        ISBannerSize iSBannerSizeF = iVar.f();
        C4002ea c4002eaN = iVar.n();
        boolean zP = iVar.p();
        boolean zQ = iVar.q();
        ArrayList<C4030g2> arrayListK = iVar.k();
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        JSONObject jSONObjectJsonObjectInit2 = IronSourceVideoBridge.jsonObjectInit();
        Iterator<String> it = mapH.keySet().iterator();
        while (true) {
            z10 = zP;
            z11 = zT;
            String strA = "";
            iSBannerSize = iSBannerSizeF;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            Iterator<String> it2 = it;
            JSONObject jSONObjectJsonObjectInit3 = IronSourceVideoBridge.jsonObjectInit();
            C4002ea c4002ea = c4002eaN;
            jSONObjectJsonObjectInit3.put(Q6.f30281y0, 2);
            jSONObjectJsonObjectInit3.put(Q6.f30254p0, new JSONObject((Map) mapH.get(next)));
            if (hVarE != null) {
                strA = hVarE.a(next);
            }
            jSONObjectJsonObjectInit3.put(Q6.B0, strA);
            jSONObjectJsonObjectInit3.put("ts", zQ ? 1 : 0);
            jSONObjectJsonObjectInit2.put(next, jSONObjectJsonObjectInit3);
            zP = z10;
            zT = z11 ? 1 : 0;
            iSBannerSizeF = iSBannerSize;
            it = it2;
            c4002eaN = c4002ea;
        }
        C4002ea c4002ea2 = c4002eaN;
        int i10 = 2;
        for (String str : listL) {
            JSONObject jSONObjectJsonObjectInit4 = IronSourceVideoBridge.jsonObjectInit();
            jSONObjectJsonObjectInit4.put(Q6.f30281y0, 1);
            jSONObjectJsonObjectInit4.put(Q6.B0, hVarE != null ? hVarE.a(str) : "");
            jSONObjectJsonObjectInit2.put(str, jSONObjectJsonObjectInit4);
        }
        for (C4030g2 c4030g2 : arrayListK) {
            JSONObject jSONObjectJsonObjectInit5 = IronSourceVideoBridge.jsonObjectInit();
            jSONObjectJsonObjectInit5.put(Q6.f30281y0, c4030g2.e() ? i10 : 1);
            Map<String, Object> mapF = c4030g2.f();
            if (!mapF.isEmpty()) {
                jSONObjectJsonObjectInit5.put(Q6.f30254p0, new JSONObject(mapF));
            }
            jSONObjectJsonObjectInit5.put(Q6.B0, hVarE != null ? hVarE.a(c4030g2.g()) : "");
            jSONObjectJsonObjectInit5.put("ts", zQ ? 1 : 0);
            if (!c4030g2.h().isEmpty()) {
                jSONObjectJsonObjectInit5.put(f32407v, c4030g2.h());
            }
            jSONObjectJsonObjectInit2.put(c4030g2.g(), jSONObjectJsonObjectInit5);
            i10 = 2;
        }
        jSONObjectJsonObjectInit.put(Q6.f30278x0, jSONObjectJsonObjectInit2);
        if (iVar.v()) {
            jSONObjectJsonObjectInit.put(Q6.f30279x1, 1);
        }
        if (iVar.s()) {
            jSONObjectJsonObjectInit.put("do", 1);
        }
        new X9().b(ContextProvider.getInstance().getApplicationContext());
        JSONObject jSONObjectA = new C3958c2(X0.a(aVarC)).a();
        a(jSONObjectA, false);
        jSONObjectA.put(Q6.f30284z0, iO);
        jSONObjectA.put(Q6.A0, a().ordinal());
        if (c4002ea2 != null) {
            jSONObjectA.put(Q6.f30237j1, c4002ea2.i());
        }
        jSONObjectJsonObjectInit.put(Q6.f30269u0, jSONObjectA);
        if (iSBannerSize != null) {
            JSONObject jSONObjectJsonObjectInit6 = IronSourceVideoBridge.jsonObjectInit();
            jSONObjectJsonObjectInit6.put(Q6.f30260r0, iSBannerSize.getDescription());
            jSONObjectJsonObjectInit6.put(Q6.f30266t0, iSBannerSize.getWidth());
            jSONObjectJsonObjectInit6.put(Q6.f30263s0, iSBannerSize.getHeight());
            jSONObjectJsonObjectInit.put(Q6.f30257q0, jSONObjectJsonObjectInit6);
        }
        jSONObjectJsonObjectInit.put(Q6.f30242l0, aVarC.toString());
        if (iVar.b() != null) {
            jSONObjectJsonObjectInit.put("adf", iVar.b());
        }
        if (iVar.d() != null) {
            jSONObjectJsonObjectInit.put("mediationAdUnitId", iVar.d());
        }
        if (iVar.u() != null) {
            jSONObjectJsonObjectInit.put(Q6.f30251o0, iVar.u());
        }
        jSONObjectJsonObjectInit.put(Q6.f30272v0, !z11 ? 1 : 0);
        if (iVar.g() != null) {
            jSONObjectJsonObjectInit.put(Q6.f30267t1, IronSourceVideoBridge.jsonObjectInit().put(Q6.f30270u1, iVar.g()));
        } else {
            Object objRemove = jSONObjectA.remove(Q6.f30267t1);
            if (objRemove != null) {
                jSONObjectJsonObjectInit.put(Q6.f30267t1, objRemove);
            }
        }
        if (z10) {
            jSONObjectJsonObjectInit.put(Q6.f30261r1, 1);
        }
        return jSONObjectJsonObjectInit;
    }

    public void a(String str, String str2, String str3) {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b(str, str2, str3));
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null || jSONObject.length() <= 0 || TextUtils.isEmpty(jSONObject.optString(Q6.f30243l1)) || !this.f32412a.compareAndSet(false, true)) {
            return;
        }
        Lb.U().q().a(new C5(D5.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.a(z10, true, -1)));
    }

    public Map<String, String> b(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
            if (jSONObjectJsonObjectInit.has("params")) {
                JSONObject jSONObject = jSONObjectJsonObjectInit.getJSONObject("params");
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof String) {
                        map.put(next, (String) obj);
                    }
                }
            }
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error("exception " + e10.getMessage());
        }
        return map;
    }

    public String c(String str) {
        String string = "";
        try {
            if (TextUtils.isEmpty(str) || !C4127la.a(str)) {
                return "";
            }
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
            if (!jSONObjectJsonObjectInit.has("params")) {
                return "";
            }
            JSONObject jSONObject = jSONObjectJsonObjectInit.getJSONObject("params");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("parameters = " + jSONObject);
            if (!jSONObject.has("dynamicDemandSource")) {
                return "";
            }
            string = jSONObject.getString("dynamicDemandSource");
            ironLog.verbose("demand source = " + string);
            return string;
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error("exception " + e10.getMessage());
            return string;
        }
    }
}
