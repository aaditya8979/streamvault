package com.mbridge.msdk.setting;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3978d4;
import com.ironsource.T1;
import com.ironsource.Y1;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.d0;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.bidmachine.ads.networks.nast.NastAdapter;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseSetting.java */
/* JADX INFO: loaded from: classes12.dex */
public class b {

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static int f39596e1 = 1500;
    private boolean E0;
    private long F;
    private JSONArray G0;
    private ArrayList<Integer> H;
    private JSONObject H0;
    private d I;
    private C0493b J;
    private long J0;
    private HashMap<String, String> O;
    private long O0;
    private String P;
    private boolean P0;
    private int U;
    private String V0;
    private String X;
    private Map<String, String> Y;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f39602b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private int f39605c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private String f39608d1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f39616h0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private String f39622k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f39623l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private String f39624l0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<com.mbridge.msdk.foundation.entity.a> f39627n;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f39630o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f39631p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f39632p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.setting.a f39633q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f39634q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f39635r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f39636r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Map<String, a> f39637s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f39638s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f39639t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f39641u;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private long f39644v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private long f39646w0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f39597a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONArray f39600b = new JSONArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONArray f39603c = new JSONArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f39606d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39609e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f39611f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f39613g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f39615h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f39617i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f39619j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f39621k = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f39625m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f39629o = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f39643v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f39645w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f39647x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f39649y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f39651z = "";
    private String A = "";
    private String B = "";
    private int C = 120;
    private String D = com.mbridge.msdk.foundation.same.net.utils.d.h().f37839i;
    private String E = com.mbridge.msdk.foundation.same.net.utils.d.h().f37843m;
    private int G = f39596e1;
    private int K = 0;
    private long L = 86400;
    private int M = 0;
    private int N = 3;
    private boolean Q = true;
    private int R = 0;
    private boolean S = false;
    private boolean T = false;
    private int V = 0;
    private int W = 0;
    private String Z = NastAdapter.ADAPTER_SDK_VERSION_NAME;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f39598a0 = 30;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f39601b0 = 9377;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f39604c0 = 0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f39607d0 = 5;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f39610e0 = 1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f39612f0 = 8000;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private String f39614g0 = "";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private int f39618i0 = 10;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private int f39620j0 = 120;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private String f39626m0 = "";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private String f39628n0 = "";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private String f39640t0 = "";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private String f39642u0 = "";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private List<Integer> f39648x0 = new ArrayList();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f39650y0 = 3;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private int f39652z0 = 0;
    private int A0 = 3;
    private int B0 = 0;
    private int C0 = 10;
    private int D0 = 600;
    private int F0 = 0;
    private String I0 = "";
    private int K0 = 8000;
    private int L0 = 1;
    private long M0 = 10;
    private int N0 = 3;
    private int Q0 = 1;
    private int R0 = 1;
    private int S0 = 1;
    private int T0 = 1;
    private String U0 = "";
    private int W0 = 1300;
    private int X0 = 0;
    private int Y0 = 0;
    private long Z0 = 3600;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private String f39599a1 = "";

    /* JADX INFO: compiled from: BaseSetting.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<String> f39653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<String> f39654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<String> f39655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<String> f39656d;

        public List<String> a() {
            return this.f39653a;
        }

        public void a(JSONObject jSONObject) {
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(VastAttributes.HORIZONTAL_POSITION);
                if (jSONArrayOptJSONArray != null) {
                    this.f39655c = d0.a(jSONArrayOptJSONArray);
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(VastAttributes.VERTICAL_POSITION);
                if (jSONArrayOptJSONArray2 != null) {
                    this.f39656d = d0.a(jSONArrayOptJSONArray2);
                }
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("width");
                if (jSONArrayOptJSONArray3 != null) {
                    this.f39654b = d0.a(jSONArrayOptJSONArray3);
                }
                JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("height");
                if (jSONArrayOptJSONArray4 != null) {
                    this.f39653a = d0.a(jSONArrayOptJSONArray4);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }

        public List<String> b() {
            return this.f39654b;
        }

        public List<String> c() {
            return this.f39655c;
        }

        public List<String> d() {
            return this.f39656d;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.setting.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseSetting.java */
    public static class C0493b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f39657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JSONArray f39658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f39659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f39660d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f39661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f39662f;

        public static C0493b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            C0493b c0493b = new C0493b();
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            c0493b.f39662f = jSONObject.optString("title", contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_title", TypedValues.Custom.S_STRING)));
            c0493b.f39657a = jSONObject.optString("cancel", contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_close_close", TypedValues.Custom.S_STRING)));
            c0493b.f39660d = jSONObject.optString("submit", contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_close_submit", TypedValues.Custom.S_STRING)));
            c0493b.f39661e = jSONObject.optString("submit_notice", contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_submit_notice", TypedValues.Custom.S_STRING)));
            c0493b.f39659c = jSONObject.optString("privacy", contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_privacy_des", TypedValues.Custom.S_STRING)));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("content");
            c0493b.f39658b = jSONArrayOptJSONArray;
            if (jSONArrayOptJSONArray == null) {
                JSONArray jSONArray = new JSONArray();
                c0493b.f39658b = jSONArray;
                jSONArray.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_not_play", TypedValues.Custom.S_STRING)));
                c0493b.f39658b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_sound_problems", TypedValues.Custom.S_STRING)));
                c0493b.f39658b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_misleading", TypedValues.Custom.S_STRING)));
                c0493b.f39658b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_fraud", TypedValues.Custom.S_STRING)));
                c0493b.f39658b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_por_violence", TypedValues.Custom.S_STRING)));
                c0493b.f39658b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_other", TypedValues.Custom.S_STRING)));
            }
            return c0493b;
        }

        public String a() {
            return this.f39657a;
        }

        public JSONArray b() {
            return this.f39658b;
        }

        public String c() {
            return this.f39659c;
        }

        public String d() {
            return this.f39660d;
        }

        public String e() {
            return this.f39661e;
        }

        public String f() {
            return this.f39662f;
        }
    }

    public static String a(Context context, String str) {
        try {
            g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD != null && gVarD.G() != null) {
                String host = Uri.parse(str).getHost();
                Iterator<Map.Entry<String, String>> it = gVarD.G().entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    if (!TextUtils.isEmpty(host) && host.contains(key)) {
                        String str2 = gVarD.G().get(key);
                        return TextUtils.isEmpty(str2) ? "" : str2.replace("{gaid}", com.mbridge.msdk.foundation.tools.g.d());
                    }
                }
                return "";
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static Map<String, a> a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                a aVar = new a();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    aVar.a(jSONObjectOptJSONObject);
                }
                map.put(next, aVar);
            }
            return map;
        } catch (JSONException e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return null;
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                e11.printStackTrace();
            }
            return null;
        }
    }

    private static void a(JSONObject jSONObject) {
        FastKV fastKVBuild = null;
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            try {
                fastKVBuild = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), k0.a("H+tU+FeXHM==")).build();
            } catch (Exception unused) {
            }
        }
        if (fastKVBuild != null) {
            try {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (jSONObject == null || contextD == null) {
                    return;
                }
                String strOptString = jSONObject.optString("b");
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.V, strOptString)) {
                    com.mbridge.msdk.foundation.same.a.V = strOptString;
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("b", com.mbridge.msdk.foundation.same.a.V);
                    try {
                        fastKVBuild.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                    } catch (Exception unused2) {
                    }
                }
                String strOptString2 = jSONObject.optString("c");
                if (TextUtils.isEmpty(strOptString2) || TextUtils.equals(com.mbridge.msdk.foundation.same.a.f37698g, strOptString2)) {
                    return;
                }
                com.mbridge.msdk.foundation.same.a.f37698g = strOptString2;
                com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c", com.mbridge.msdk.foundation.same.a.f37698g);
                try {
                    fastKVBuild.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f37698g);
                    return;
                } catch (Exception unused3) {
                    return;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        try {
            Context contextD2 = com.mbridge.msdk.foundation.controller.c.n().d();
            if (jSONObject == null || contextD2 == null) {
                return;
            }
            String strOptString3 = jSONObject.optString("b");
            if (!TextUtils.isEmpty(strOptString3) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.V, strOptString3)) {
                com.mbridge.msdk.foundation.same.a.V = strOptString3;
                com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("b", com.mbridge.msdk.foundation.same.a.V);
                SharedPreferences sharedPreferences = contextD2.getSharedPreferences(k0.a("H+tU+FeXHM=="), 0);
                if (sharedPreferences != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                    editorEdit.apply();
                }
            }
            String strOptString4 = jSONObject.optString("c");
            if (TextUtils.isEmpty(strOptString4) || TextUtils.equals(com.mbridge.msdk.foundation.same.a.f37698g, strOptString4)) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.f37698g = strOptString4;
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c", com.mbridge.msdk.foundation.same.a.f37698g);
            SharedPreferences sharedPreferences2 = contextD2.getSharedPreferences(k0.a("H+tU+FeXHM=="), 0);
            if (sharedPreferences2 != null) {
                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                editorEdit2.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f37698g);
                editorEdit2.apply();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static g b(JSONObject jSONObject) {
        g gVar;
        g gVar2 = null;
        arrayList = null;
        ArrayList arrayList = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            gVar = new g();
        } catch (Exception e10) {
            e = e10;
        }
        try {
            gVar.c(jSONObject);
            gVar.f(jSONObject.optString("cc"));
            gVar.s(jSONObject.optString("mv_wildcard", "<mvpackage>mbridge</mvpackage>"));
            gVar.j(jSONObject.optInt("cfc"));
            gVar.c(jSONObject.optLong("getpf"));
            gVar.b(jSONObject.optLong("current_time"));
            gVar.b(jSONObject.optBoolean("cfb"));
            gVar.a(jSONObject.optLong("awct"));
            gVar.e(jSONObject.optLong(CampaignEx.JSON_KEY_PLCT) == 0 ? 3600L : jSONObject.optLong(CampaignEx.JSON_KEY_PLCT));
            gVar.g(jSONObject.optBoolean("rurl"));
            gVar.i(jSONObject.optLong("uct"));
            gVar.h(jSONObject.optBoolean("ujds"));
            gVar.H(jSONObject.optInt("n2"));
            gVar.I(jSONObject.optInt("n3"));
            gVar.r(jSONObject.optInt("is_startup_crashsystem", 1));
            gVar.G(jSONObject.optInt("pcrn"));
            gVar.F(jSONObject.optInt("pcon", 0));
            gVar.f(jSONObject.optLong(CampaignEx.JSON_KEY_PLCTB) == 0 ? 7200L : jSONObject.optLong(CampaignEx.JSON_KEY_PLCTB));
            gVar.G(jSONObject.optInt("pcrn", 100));
            gVar.E(jSONObject.optInt("opent", 1));
            gVar.g(jSONObject.optLong("sfct", 1800L));
            gVar.W(jSONObject.optInt("upgd", 1));
            gVar.X(jSONObject.optInt("upsrl", 1));
            gVar.V(jSONObject.optInt("updevid", 1));
            gVar.Q(jSONObject.optInt("sc", 0));
            gVar.U(jSONObject.optInt("up_tips", 1));
            gVar.s(jSONObject.optInt("iseu", -1));
            gVar.p(jSONObject.optString("jm_unit"));
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("atf");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    arrayList = new ArrayList();
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i10);
                        if (a1.b(strOptString)) {
                            JSONObject jSONObject2 = new JSONObject(strOptString);
                            arrayList.add(new com.mbridge.msdk.foundation.entity.a(jSONObject2.optInt("adtype"), jSONObject2.optString("unitid")));
                        }
                    }
                }
                if (arrayList != null) {
                    gVar.a((List<com.mbridge.msdk.foundation.entity.a>) arrayList);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            gVar.g(jSONObject.optInt("adct", 259200));
            gVar.k(jSONObject.optString("confirm_title", ""));
            gVar.i(jSONObject.optString("confirm_description", ""));
            gVar.j(jSONObject.optString("confirm_t", ""));
            gVar.h(jSONObject.optString("confirm_c_rv", ""));
            gVar.g(jSONObject.optString("confirm_c_play", ""));
            gVar.c(jSONObject.optString("adchoice_icon", ""));
            gVar.d(jSONObject.optString("adchoice_link", ""));
            gVar.e(jSONObject.optString("adchoice_size", ""));
            gVar.w(jSONObject.optString("platform_logo", ""));
            gVar.x(jSONObject.optString("platform_name", ""));
            gVar.a(a(jSONObject.optString("cdnate_cfg", "")));
            gVar.i(jSONObject.optInt("atrqt", 0));
            gVar.t(jSONObject.optInt("iupdid", 0));
            gVar.C(jSONObject.optInt("mcs", 120));
            gVar.b(jSONObject.optString("ab_id", ""));
            gVar.y(jSONObject.optString(ImpressionLog.f51754x, ""));
            gVar.q(jSONObject.optString("log_rate", Y1.f30690f));
            gVar.v(jSONObject.optString("omsdkjs_url", ""));
            gVar.u(jSONObject.optString("omsdkjs_h5_url", ""));
            gVar.L(jSONObject.optInt("rty_tk_clk", 0));
            gVar.N(jSONObject.optInt("rty_tk_imp", 0));
            gVar.M(jSONObject.optInt("rty_cnt", 3));
            gVar.P(jSONObject.optInt("rty_to", 600));
            gVar.O(jSONObject.optInt("rty_inr", 10));
            gVar.n(jSONObject.optString("dns"));
            gVar.v(jSONObject.optString("omsdkjs_url", ""));
            gVar.u(jSONObject.optString("omsdkjs_h5_url", ""));
            long jOptLong = jSONObject.optLong("tcto");
            if (jOptLong == 0) {
                gVar.h(10L);
            } else {
                gVar.h(jOptLong);
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("jt");
                if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                    HashMap map = new HashMap();
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i11);
                        map.put(jSONObjectOptJSONObject.optString(C3978d4.j.D), jSONObjectOptJSONObject.optString("format"));
                    }
                    gVar.b(map);
                }
            }
            gVar.r(jSONObject.optString("mraid_js"));
            gVar.B(jSONObject.optString("web_env_url"));
            int iOptInt = jSONObject.optInt("alrbs", 0);
            if (iOptInt > 2 || iOptInt < 0) {
                iOptInt = 0;
            }
            gVar.h(iOptInt);
            gVar.e(jSONObject.optBoolean("GDPR_area", false));
            gVar.l(jSONObject.optInt(T1.f30436b, 120));
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("ercd");
            if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
                ArrayList<Integer> arrayList2 = new ArrayList<>();
                for (int i12 = 0; i12 < jSONArrayOptJSONArray3.length(); i12++) {
                    int iOptInt2 = jSONArrayOptJSONArray3.optInt(i12);
                    if (iOptInt2 != 0) {
                        arrayList2.add(Integer.valueOf(iOptInt2));
                    }
                }
                if (arrayList2.size() > 0) {
                    arrayList2.add(-1);
                    gVar.a(arrayList2);
                }
            }
            String strOptString2 = jSONObject.optString("hst");
            if (!TextUtils.isEmpty(strOptString2)) {
                try {
                    JSONObject jSONObject3 = new JSONObject(k0.a(strOptString2));
                    Iterator<String> itKeys = jSONObject3.keys();
                    HashMap<String, String> map2 = new HashMap<>();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(jSONObject3.optString(next)) && !TextUtils.isEmpty(k0.a(jSONObject3.optString(next)))) {
                            map2.put(next, jSONObject3.optString(next));
                        }
                    }
                    if (map2.size() > 0) {
                        gVar.a(map2);
                    }
                } catch (Exception e12) {
                    q0.b("SETTING", e12.getMessage());
                }
            }
            JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("refactor_switch");
            if (jSONArrayOptJSONArray4 != null && jSONArrayOptJSONArray4.length() > 0) {
                for (int i13 = 0; i13 < jSONArrayOptJSONArray4.length(); i13++) {
                    JSONObject jSONObject4 = jSONArrayOptJSONArray4.getJSONObject(i13);
                    Iterator<String> itKeys2 = jSONObject4.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        if (!TextUtils.isEmpty(next2) && jSONObject4.getBoolean(next2)) {
                            gVar.a(Integer.parseInt(next2));
                        }
                    }
                }
            }
            try {
                int iOptInt3 = jSONObject.optInt("lqcnt", 30);
                int iOptInt4 = jSONObject.optInt("lqto", 5);
                int iOptInt5 = jSONObject.optInt("lqswt", 0);
                int iOptInt6 = jSONObject.optInt("lqtype", 1);
                gVar.x(iOptInt4);
                gVar.u(iOptInt3);
                gVar.w(iOptInt5);
                gVar.y(iOptInt6);
                gVar.a(jSONObject.optJSONArray("lg_bl"));
                gVar.b(jSONObject.optJSONArray("lg_wl"));
                gVar.Z(jSONObject.optInt("lg_wl_rt"));
                gVar.R(jSONObject.optInt("srml", 8000));
                gVar.z(jSONObject.optInt("lrml", 8000));
                gVar.Y(jSONObject.optInt("wgl_d_ms", 1300));
                gVar.m(jSONObject.optInt("dp_ct", f39596e1));
                int i14 = Integer.parseInt(k0.a(jSONObject.optString("lqpt")));
                if (i14 > 0 && i14 < 65535) {
                    gVar.v(i14);
                }
            } catch (Exception unused) {
            }
            gVar.a0(jSONObject.optInt("wvddt", 0));
            gVar.l(jSONObject.optString("hst_st", ""));
            gVar.m(jSONObject.optString("hst_st_t", ""));
            try {
                int iOptInt7 = jSONObject.optInt("l", 3);
                boolean z10 = jSONObject.optInt(CampaignEx.JSON_KEY_AD_K, 0) == 1;
                boolean z11 = jSONObject.optInt(InneractiveMediationDefs.GENDER_MALE, 1) == 1;
                gVar.K(iOptInt7);
                gVar.f(z10);
                gVar.a(z11);
            } catch (Exception e13) {
                q0.b("Setting", e13.getMessage());
            }
            gVar.n(jSONObject.optInt("fbk_swt", 0));
            gVar.a(C0493b.a(jSONObject.optJSONObject("fbk")));
            try {
                int iOptInt8 = jSONObject.optInt("ad_connection_timeout", com.mbridge.msdk.foundation.same.a.f37706o);
                int iOptInt9 = jSONObject.optInt("ad_read_timeout", com.mbridge.msdk.foundation.same.a.f37708q);
                int iOptInt10 = jSONObject.optInt("ad_write_timeout", com.mbridge.msdk.foundation.same.a.f37710s);
                int iOptInt11 = jSONObject.optInt("ad_retry_count", com.mbridge.msdk.foundation.same.a.f37709r);
                if (iOptInt8 <= 0) {
                    iOptInt8 = com.mbridge.msdk.foundation.same.a.f37706o;
                }
                gVar.c(iOptInt8);
                if (iOptInt9 <= 0) {
                    iOptInt9 = com.mbridge.msdk.foundation.same.a.f37708q;
                }
                gVar.d(iOptInt9);
                if (iOptInt10 <= 0) {
                    iOptInt10 = com.mbridge.msdk.foundation.same.a.f37710s;
                }
                gVar.f(iOptInt10);
                if (iOptInt11 < 0) {
                    iOptInt11 = com.mbridge.msdk.foundation.same.a.f37709r;
                }
                gVar.e(iOptInt11);
                int iOptInt12 = jSONObject.optInt("max_download_task_size", 10);
                if (iOptInt12 <= 0) {
                    iOptInt12 = 10;
                }
                gVar.B(iOptInt12);
                gVar.A(jSONObject.optInt("max_bitmap_cache_size", 10));
                gVar.T(jSONObject.optInt("t_t", 3));
                gVar.p(jSONObject.optInt("h_t", 3));
                gVar.o(jSONObject.optInt("gtp"));
                gVar.d(jSONObject.optLong("i_i_t", 3600L));
                gVar.t(jSONObject.optString(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I, ""));
                gVar.D(jSONObject.optInt("n_c_u_p", 0));
            } catch (Exception unused2) {
            }
            try {
                gVar.o(jSONObject.optString("http_track_url", ""));
            } catch (Exception unused3) {
            }
            gVar.S(jSONObject.optInt("st_net", 1));
            gVar.A(jSONObject.optString("vtag", ""));
            try {
                gVar.c(jSONObject.optInt("check_webview", 0) != 0);
            } catch (Exception unused4) {
                gVar.c(false);
            }
            gVar.z(jSONObject.optString("swxid"));
            gVar.c(jSONObject.optJSONArray("sdk_filters"));
            try {
                gVar.k(jSONObject.optInt("ch_nv_im_cb", 1));
            } catch (Exception unused5) {
                gVar.k(1);
            }
            try {
                gVar.d(jSONObject.optInt("do_us_fi_re", 1) != 0);
            } catch (Exception unused6) {
                gVar.d(true);
            }
            try {
                a(jSONObject);
            } catch (Exception e14) {
                e14.printStackTrace();
            }
            String strOptString3 = jSONObject.optString("bcp");
            if (!TextUtils.isEmpty(strOptString3)) {
                gVar.a(com.mbridge.msdk.setting.a.a(k0.a(strOptString3)));
            }
            String strOptString4 = jSONObject.optString("monitor");
            if (!TextUtils.isEmpty(strOptString4)) {
                gVar.a(d.a(k0.a(strOptString4)));
            }
            if (jSONObject.has("new_pipeline_id")) {
                gVar.J(jSONObject.optInt("new_pipeline_id"));
            }
            return gVar;
        } catch (Exception e15) {
            e = e15;
            gVar2 = gVar;
            e.printStackTrace();
            return gVar2;
        }
    }

    public long A() {
        return this.L;
    }

    public void A(int i10) {
        if (i10 > 0) {
            this.f39618i0 = i10;
        }
    }

    public void A(String str) {
        this.U0 = str;
    }

    public int A0() {
        return this.Y0;
    }

    public int B() {
        return this.N;
    }

    public void B(int i10) {
        this.f39616h0 = i10;
    }

    public void B(String str) {
        this.V0 = str;
    }

    public boolean B0() {
        return this.Q;
    }

    public HashMap<String, String> C() {
        return this.O;
    }

    public void C(int i10) {
        this.f39620j0 = i10;
    }

    public boolean C0() {
        return this.f39639t;
    }

    public int D() {
        return this.R;
    }

    public void D(int i10) {
        this.f39602b1 = i10;
    }

    public boolean D0() {
        return this.f39645w;
    }

    public int E() {
        return this.U;
    }

    public void E(int i10) {
        this.f39630o0 = i10;
    }

    public boolean E0() {
        return this.S;
    }

    public int F() {
        return this.V;
    }

    public void F(int i10) {
        this.f39634q0 = i10;
    }

    public boolean F0() {
        return this.f39597a;
    }

    public Map<String, String> G() {
        return this.Y;
    }

    public void G(int i10) {
        this.f39632p0 = i10;
    }

    public boolean G0() {
        return (TextUtils.isEmpty(this.B) || TextUtils.isEmpty(this.f39651z) || TextUtils.isEmpty(this.A) || TextUtils.isEmpty(this.f39647x)) ? false : true;
    }

    public JSONArray H() {
        return this.f39600b;
    }

    public void H(int i10) {
        this.f39636r0 = i10;
    }

    public boolean H0() {
        return (TextUtils.isEmpty(this.B) || TextUtils.isEmpty(this.f39651z) || TextUtils.isEmpty(this.A) || TextUtils.isEmpty(this.f39649y)) ? false : true;
    }

    public JSONArray I() {
        return this.f39603c;
    }

    public void I(int i10) {
        this.f39638s0 = i10;
    }

    public boolean I0() {
        return this.T;
    }

    public String J() {
        return this.Z;
    }

    public void J(int i10) {
        this.f39605c1 = i10;
    }

    public boolean J0() {
        return this.E0;
    }

    public int K() {
        return this.f39610e0;
    }

    public void K(int i10) {
        this.f39650y0 = i10;
    }

    public boolean K0() {
        return this.P0;
    }

    public int L() {
        return this.f39612f0;
    }

    public void L(int i10) {
        this.f39652z0 = i10;
    }

    public void L0() {
        String language = Locale.getDefault().getLanguage();
        if (!H0()) {
            if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                this.B = "Confirm to close? ";
                this.f39651z = "You will not be rewarded after closing the window";
                this.A = "Close it";
                this.f39649y = "Continue";
            } else {
                this.B = "确认关闭？";
                this.f39651z = "关闭后您将不会获得任何奖励噢~ ";
                this.A = "确认关闭";
                this.f39649y = "继续观看";
            }
        }
        if (G0()) {
            return;
        }
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            this.B = "Confirm to close? ";
            this.f39651z = "You will not be rewarded after closing the window";
            this.A = "Close it";
            this.f39647x = "Continue";
            return;
        }
        this.B = "确认关闭？";
        this.f39651z = "关闭后您将不会获得任何奖励噢~ ";
        this.A = "确认关闭";
        this.f39647x = "继续试玩";
    }

    public int M() {
        return this.f39616h0;
    }

    public void M(int i10) {
        this.A0 = i10;
    }

    public int N() {
        return this.f39620j0;
    }

    public void N(int i10) {
        this.B0 = i10;
    }

    public String O() {
        return this.f39622k0;
    }

    public void O(int i10) {
        this.C0 = i10;
    }

    public String P() {
        return this.f39624l0;
    }

    public void P(int i10) {
        this.D0 = i10;
    }

    public String Q() {
        return this.f39599a1;
    }

    public void Q(int i10) {
        this.F0 = i10;
    }

    public long R() {
        return this.Z0;
    }

    public void R(int i10) {
        this.K0 = i10;
    }

    public int S() {
        return this.f39602b1;
    }

    public void S(int i10) {
        this.L0 = i10;
    }

    public String T() {
        return this.f39626m0;
    }

    public void T(int i10) {
        this.N0 = i10;
    }

    public String U() {
        return this.f39628n0;
    }

    public void U(int i10) {
        this.Q0 = i10;
    }

    public int V() {
        return this.f39630o0;
    }

    public void V(int i10) {
        this.R0 = i10;
    }

    public int W() {
        return this.f39632p0;
    }

    public void W(int i10) {
        this.S0 = i10;
    }

    public int X() {
        return this.f39636r0;
    }

    public void X(int i10) {
        this.T0 = i10;
    }

    public int Y() {
        return this.f39638s0;
    }

    public void Y(int i10) {
        this.W0 = i10;
    }

    public int Z() {
        return this.f39605c1;
    }

    public void Z(int i10) {
        this.X0 = i10;
    }

    public String a() {
        return this.f39606d;
    }

    public void a(int i10) {
        this.f39648x0.add(Integer.valueOf(i10));
    }

    public void a(long j10) {
        this.f39631p = j10;
    }

    public void a(com.mbridge.msdk.setting.a aVar) {
        this.f39633q = aVar;
    }

    public void a(C0493b c0493b) {
        this.J = c0493b;
    }

    public void a(d dVar) {
        this.I = dVar;
    }

    public void a(ArrayList<Integer> arrayList) {
        this.H = arrayList;
    }

    public void a(HashMap<String, String> map) {
        this.O = map;
    }

    public void a(List<com.mbridge.msdk.foundation.entity.a> list) {
        this.f39627n = list;
    }

    public void a(Map<String, a> map) {
        this.f39637s = map;
    }

    public void a(JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
            jSONArray.put("2000088");
        }
        this.f39600b = jSONArray;
    }

    public void a(boolean z10) {
        this.Q = z10;
    }

    public long a0() {
        return this.f39644v0;
    }

    public void a0(int i10) {
        this.Y0 = i10;
    }

    public String b() {
        return this.f39617i;
    }

    public void b(long j10) {
        this.F = j10;
    }

    public void b(String str) {
        this.f39606d = str;
    }

    public void b(Map<String, String> map) {
        this.Y = map;
    }

    public void b(JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
            jSONArray.put("2000041");
            jSONArray.put("2000042");
            jSONArray.put("2000032");
            jSONArray.put("2000079");
        }
        this.f39603c = jSONArray;
    }

    public void b(boolean z10) {
        this.f39639t = z10;
    }

    public boolean b(int i10) {
        return this.f39648x0.contains(Integer.valueOf(i10));
    }

    public long b0() {
        if (this.f39646w0 <= 0) {
            this.f39646w0 = 7200L;
        }
        return this.f39646w0;
    }

    public String c() {
        return this.f39619j;
    }

    public void c(int i10) {
        this.f39609e = i10;
    }

    public void c(long j10) {
        this.L = j10;
    }

    public void c(String str) {
        this.f39617i = str;
    }

    public void c(JSONArray jSONArray) {
        this.G0 = jSONArray;
    }

    public void c(JSONObject jSONObject) {
        this.H0 = jSONObject;
    }

    public void c(boolean z10) {
        this.f39645w = z10;
    }

    public int c0() {
        return this.f39650y0;
    }

    public String d() {
        return this.f39621k;
    }

    public void d(int i10) {
        this.f39611f = i10;
    }

    public void d(long j10) {
        this.Z0 = j10;
    }

    public void d(String str) {
        this.f39619j = str;
    }

    public void d(boolean z10) {
        this.S = z10;
    }

    public int d0() {
        return this.f39652z0;
    }

    public int e() {
        return this.f39623l;
    }

    public void e(int i10) {
        this.f39613g = i10;
    }

    public void e(long j10) {
        this.f39644v0 = j10;
    }

    public void e(String str) {
        this.f39621k = str;
    }

    public void e(boolean z10) {
        this.f39597a = z10;
    }

    public int e0() {
        return this.A0;
    }

    public int f() {
        return this.f39625m;
    }

    public void f(int i10) {
        this.f39615h = i10;
    }

    public void f(long j10) {
        this.f39646w0 = j10;
    }

    public void f(String str) {
        this.f39635r = str;
    }

    public void f(boolean z10) {
        this.T = z10;
    }

    public int f0() {
        return this.B0;
    }

    public List<com.mbridge.msdk.foundation.entity.a> g() {
        return this.f39627n;
    }

    public void g(int i10) {
        this.f39623l = i10;
    }

    public void g(long j10) {
        this.J0 = j10;
    }

    public void g(String str) {
        this.f39647x = str;
    }

    public void g(boolean z10) {
        this.E0 = z10;
    }

    public int g0() {
        return this.C0;
    }

    public int h() {
        return this.f39629o;
    }

    public void h(int i10) {
        this.f39625m = i10;
    }

    public void h(long j10) {
        this.M0 = j10;
    }

    public void h(String str) {
        this.f39649y = str;
    }

    public void h(boolean z10) {
        this.P0 = z10;
    }

    public int h0() {
        return this.D0;
    }

    public long i() {
        return this.f39631p;
    }

    public void i(int i10) {
        this.f39629o = i10;
    }

    public void i(long j10) {
        this.O0 = j10;
    }

    public void i(String str) {
        this.f39651z = str;
    }

    public int i0() {
        return this.F0;
    }

    public com.mbridge.msdk.setting.a j() {
        return this.f39633q;
    }

    public void j(int i10) {
        this.f39641u = i10;
    }

    public void j(String str) {
        this.A = str;
    }

    public JSONArray j0() {
        return this.G0;
    }

    public String k() {
        return this.f39635r;
    }

    public void k(int i10) {
        this.f39643v = i10;
    }

    public void k(String str) {
        this.B = str;
    }

    public JSONObject k0() {
        return this.H0;
    }

    public Map<String, a> l() {
        return this.f39637s;
    }

    public void l(int i10) {
        this.C = i10;
    }

    public void l(String str) {
        this.D = str;
    }

    public String l0() {
        return this.I0;
    }

    public int m() {
        return this.f39641u;
    }

    public void m(int i10) {
        this.G = i10;
        com.mbridge.msdk.click.utils.a.f35744d = i10;
    }

    public void m(String str) {
        this.E = str;
    }

    public long m0() {
        return this.J0;
    }

    public int n() {
        return this.f39643v;
    }

    public void n(int i10) {
        this.K = i10;
    }

    public void n(String str) {
        this.f39608d1 = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e.a().b(k0.a(str));
    }

    public int n0() {
        return this.K0;
    }

    public String o() {
        return this.f39647x;
    }

    public void o(int i10) {
        this.M = i10;
        com.mbridge.msdk.foundation.same.net.utils.d.h().d(i10);
    }

    public void o(String str) {
        this.P = str;
    }

    public int o0() {
        return this.L0;
    }

    public String p() {
        return this.f39649y;
    }

    public void p(int i10) {
        this.N = i10;
    }

    public void p(String str) {
        this.X = str;
    }

    public long p0() {
        return this.M0 * 1000;
    }

    public String q() {
        return this.f39651z;
    }

    public void q(int i10) {
        this.R = i10;
    }

    public void q(String str) {
        this.Z = str;
    }

    public int q0() {
        return this.N0;
    }

    public String r() {
        return this.A;
    }

    public void r(int i10) {
        this.U = i10;
    }

    public void r(String str) {
        this.f39622k0 = str;
    }

    public long r0() {
        return this.O0;
    }

    public String s() {
        return this.B;
    }

    public void s(int i10) {
        this.V = i10;
    }

    public void s(String str) {
        this.f39624l0 = str;
    }

    public int s0() {
        return this.Q0;
    }

    public int t() {
        return this.C;
    }

    public void t(int i10) {
        this.W = i10;
    }

    public void t(String str) {
        this.f39599a1 = str;
    }

    public int t0() {
        return this.R0;
    }

    public String toString() {
        return " cfc=" + this.f39641u + " getpf=" + this.L + " rurl=" + this.E0;
    }

    public String u() {
        return this.D;
    }

    public void u(int i10) {
        this.f39598a0 = i10;
    }

    public void u(String str) {
        this.f39626m0 = str;
    }

    public int u0() {
        return this.S0;
    }

    public String v() {
        return this.E;
    }

    public void v(int i10) {
        this.f39601b0 = i10;
        com.mbridge.msdk.foundation.same.net.utils.d.h().b(i10);
        com.mbridge.msdk.foundation.same.net.utils.d.h().c(i10);
    }

    public void v(String str) {
        this.f39628n0 = str;
    }

    public int v0() {
        return this.T0;
    }

    public long w() {
        return this.F;
    }

    public void w(int i10) {
        this.f39604c0 = i10;
    }

    public void w(String str) {
        this.f39640t0 = str;
    }

    public String w0() {
        return this.U0;
    }

    public ArrayList<Integer> x() {
        return this.H;
    }

    public void x(int i10) {
        this.f39607d0 = i10;
    }

    public void x(String str) {
        this.f39642u0 = str;
    }

    public String x0() {
        return this.V0;
    }

    public d y() {
        return this.I;
    }

    public void y(int i10) {
        this.f39610e0 = i10;
    }

    public void y(String str) {
        this.I0 = str;
    }

    public int y0() {
        return this.W0;
    }

    public C0493b z() {
        return this.J;
    }

    public void z(int i10) {
        this.f39612f0 = i10;
    }

    public void z(String str) {
        if (TextUtils.isEmpty(this.f39614g0)) {
            return;
        }
        this.f39614g0 = str;
        if (TextUtils.isEmpty(com.mbridge.msdk.foundation.controller.c.n().j())) {
            com.mbridge.msdk.foundation.controller.c.n().d(this.f39614g0);
        }
    }

    public int z0() {
        return this.X0;
    }
}
