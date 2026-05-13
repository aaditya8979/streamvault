package sg.bigo.ads.controller.c;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C3978d4;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.core.b;

/* JADX INFO: loaded from: classes10.dex */
public class b implements sg.bigo.ads.api.core.b {

    @Nullable
    private JSONObject A;

    @Nullable
    private List<sg.bigo.ads.api.core.b> B;
    private final long C;
    private final long E;

    @NonNull
    private final sg.bigo.ads.api.core.g F;
    private long G;
    private int H;
    private int I;
    private boolean K;
    private long L;
    private sg.bigo.ads.api.a.m M;
    private final String N;
    private String O;
    private boolean P;
    private boolean Q;
    private String R;
    private final double T;
    private String U;
    private final boolean V;
    private String W;
    private String X;
    private String Y;
    private b.d Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.a.l f83089a;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private int f83090aa;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private String f83091ab;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private int f83092ac;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private int f83093ad;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private boolean f83094ae;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private int f83095af;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private boolean f83096ag;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private int f83098ai;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private int f83099aj;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private sg.bigo.ads.api.core.p f83100ak;

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private String f83101al;

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    private int f83102am;

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    private int f83103an;

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    private int f83104ao;

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    private int f83105ap;

    /* JADX INFO: renamed from: ar, reason: collision with root package name */
    private String f83107ar;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public String f83108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f83109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f83110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f83111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final String f83112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f83113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f83114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f83115i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public String f83116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String f83117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public b.e f83118l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public b.f[] f83119m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public b.f[] f83120n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public b.f[] f83121o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public b.f[] f83122p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public List<b.c> f83123q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public String f83124r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f83125s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public String f83126t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public String f83127u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public b.InterfaceC1008b f83128v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b.a f83129w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f83130x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Map<String, String> f83131y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f83132z;
    private int J = 0;
    private int S = 2;

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private int f83097ah = 1;

    /* JADX INFO: renamed from: aq, reason: collision with root package name */
    private sg.bigo.ads.api.core.i f83106aq = new sg.bigo.ads.api.core.i();
    private final long D = SystemClock.elapsedRealtime();

    public b(long j10, @NonNull sg.bigo.ads.api.core.g gVar, @NonNull sg.bigo.ads.api.a.l lVar, @NonNull JSONObject jSONObject) {
        this.f83102am = 1;
        this.f83103an = 0;
        this.f83104ao = 1;
        this.f83132z = 0;
        this.f83107ar = "";
        this.E = j10;
        this.F = gVar;
        this.f83089a = lVar;
        this.f83108b = jSONObject.optString(CreativeInfo.f52474c, "");
        this.f83109c = jSONObject.optString("title", "");
        this.f83110d = jSONObject.optString(UnifiedMediationParams.KEY_DESCRIPTION, "");
        this.f83111e = jSONObject.optString("cta", "");
        String strOptString = jSONObject.optString("dsp_name", "");
        this.f83112f = strOptString;
        this.V = "BigoDsp".equalsIgnoreCase(strOptString);
        this.f83113g = jSONObject.optInt("adx_type", 0);
        this.f83114h = jSONObject.optInt("ad_type", -1);
        this.f83115i = jSONObject.optLong("sid");
        this.f83116j = jSONObject.optString("creative_id", "");
        this.f83117k = jSONObject.optString("series_id", "");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("privacy");
        if (jSONObjectOptJSONObject != null) {
            this.f83118l = new o(jSONObjectOptJSONObject);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("track_clicks_third");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject2 != null) {
                    arrayList.add(new q(jSONObjectOptJSONObject2));
                }
            }
            b.f[] fVarArr = new b.f[arrayList.size()];
            this.f83120n = fVarArr;
            this.f83120n = (b.f[]) arrayList.toArray(fVarArr);
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("track_impls_third");
        if (jSONArrayOptJSONArray2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i11);
                if (jSONObjectOptJSONObject3 != null) {
                    arrayList2.add(new q(jSONObjectOptJSONObject3));
                }
            }
            b.f[] fVarArr2 = new b.f[arrayList2.size()];
            this.f83119m = fVarArr2;
            this.f83119m = (b.f[]) arrayList2.toArray(fVarArr2);
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("ad_nurls");
        if (jSONArrayOptJSONArray3 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < jSONArrayOptJSONArray3.length(); i12++) {
                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray3.optJSONObject(i12);
                if (jSONObjectOptJSONObject4 != null) {
                    arrayList3.add(new q(jSONObjectOptJSONObject4));
                }
            }
            b.f[] fVarArr3 = new b.f[arrayList3.size()];
            this.f83121o = fVarArr3;
            this.f83121o = (b.f[]) arrayList3.toArray(fVarArr3);
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("ad_lurls");
        if (jSONArrayOptJSONArray4 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (int i13 = 0; i13 < jSONArrayOptJSONArray4.length(); i13++) {
                JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray4.optJSONObject(i13);
                if (jSONObjectOptJSONObject5 != null) {
                    arrayList4.add(new q(jSONObjectOptJSONObject5));
                }
            }
            b.f[] fVarArr4 = new b.f[arrayList4.size()];
            this.f83122p = fVarArr4;
            this.f83122p = (b.f[]) arrayList4.toArray(fVarArr4);
        }
        this.f83123q = new ArrayList();
        JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray("om_data");
        if (jSONArrayOptJSONArray5 != null) {
            this.f83123q = new ArrayList();
            for (int i14 = 0; i14 < jSONArrayOptJSONArray5.length(); i14++) {
                this.f83123q.add(new m(jSONArrayOptJSONArray5.optJSONObject(i14)));
            }
        }
        this.f83124r = jSONObject.optString("enc_price", "");
        this.f83128v = new k(jSONObject);
        this.f83129w = new f(jSONObject);
        this.f83125s = jSONObject.optLong("switch_bit_map", 0L);
        this.f83126t = jSONObject.optString("abflags", "");
        this.C = jSONObject.optLong("expired_interval", 0L);
        this.f83127u = jSONObject.optString("mapping_slot", "");
        this.G = jSONObject.optLong("probe_interval");
        this.H = jSONObject.optInt("playable_ad_switch", 0);
        this.f83130x = jSONObject.optString("req_slot");
        String strOptString2 = jSONObject.optString("interstitial_style_getad_config");
        if (!TextUtils.isEmpty(strOptString2)) {
            try {
                this.M = new sg.bigo.ads.controller.b.j(new JSONObject(strOptString2));
            } catch (JSONException unused) {
            }
        }
        this.f83106aq.a(jSONObject.optString("ad_form"));
        this.O = jSONObject.optString(C3978d4.i.F0);
        this.N = jSONObject.optString("sdk_style_id");
        this.P = jSONObject.optInt("banner_show_ad", 0) == 1;
        this.Q = jSONObject.optInt("banner_show_domain", 0) == 1;
        this.R = jSONObject.optString("ru_ad_marker");
        this.T = (jSONObject.optLong("bid_price", 0L) * 1.0d) / 1.0E8d;
        this.U = jSONObject.optString("adx_country");
        this.f83099aj = jSONObject.optInt("orientation", 0);
        if (sg.bigo.ads.api.core.a.d(this.f83114h)) {
            this.A = jSONObject;
        }
        this.W = jSONObject.optString("ad_bundle_id", "");
        this.X = jSONObject.optString("pop_h5");
        this.Y = jSONObject.optString("pop_img");
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("pop_page");
        if (jSONObjectOptJSONObject6 != null) {
            this.Z = new n(jSONObjectOptJSONObject6);
        }
        int iOptInt = jSONObject.optInt("ad_resp_type");
        this.f83090aa = iOptInt;
        if (iOptInt == 2) {
            a(jSONObject, j10, gVar, lVar);
        }
        this.f83131y = sg.bigo.ads.common.utils.l.a(jSONObject.optString("pub_extra_info"));
        this.f83101al = jSONObject.optString("dsp_extra");
        this.f83102am = jSONObject.optInt("native_banner_fill_strategy", 1);
        this.f83103an = jSONObject.optInt("guide_type", 0);
        this.f83104ao = jSONObject.optInt("native_banner_click_type", 0);
        this.f83105ap = jSONObject.optInt("is_interactive", 0);
        this.f83132z = jSONObject.optInt("vpaid_imp_method", 0);
        this.f83107ar = jSONObject.optString("sponsored", "");
    }

    @Nullable
    public static b a(long j10, @NonNull sg.bigo.ads.api.core.g gVar, @NonNull sg.bigo.ads.api.a.l lVar, String str) {
        try {
            return a(j10, gVar, lVar, new JSONObject(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    public static b a(long j10, sg.bigo.ads.api.core.g gVar, sg.bigo.ads.api.a.l lVar, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("adx_type", 0);
        if (iOptInt != 1 && iOptInt != 2) {
            if (iOptInt == 3) {
                return new d(j10, gVar, lVar, jSONObject);
            }
            if (iOptInt != 5) {
                return null;
            }
        }
        return new l(j10, gVar, lVar, jSONObject);
    }

    private void a(JSONObject jSONObject, long j10, sg.bigo.ads.api.core.g gVar, sg.bigo.ads.api.a.l lVar) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        ArrayList arrayList = null;
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    b bVarA = a(j10, gVar, lVar, jSONObjectOptJSONObject);
                    if (bVarA != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        bVarA.f83090aa = this.f83090aa;
                        arrayList.add(bVarA);
                    } else {
                        sg.bigo.ads.core.d.b.a(1005, 10205, "Error ad in ads");
                    }
                }
            }
        }
        this.B = arrayList;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String A() {
        return this.f83117k;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final b.e B() {
        return this.f83118l;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final b.f[] C() {
        return this.f83119m;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final b.f[] D() {
        return this.f83120n;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final b.f[] E() {
        return this.f83121o;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final b.f[] F() {
        return this.f83122p;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final List<b.c> G() {
        return this.f83123q;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String H() {
        return this.f83124r;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String I() {
        return this.f83126t;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean J() {
        return (!this.K || this.L <= 0) ? SystemClock.elapsedRealtime() - this.D >= this.C * 1000 : System.currentTimeMillis() > this.L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    @Override // sg.bigo.ads.api.core.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long K() {
        /*
            r9 = this;
            boolean r0 = r9.K
            r1 = 0
            if (r0 == 0) goto L1e
            long r3 = r9.L
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1e
            long r5 = r9.C
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1c
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r3
            goto L26
        L1c:
            r5 = r1
            goto L26
        L1e:
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r9.D
            long r5 = r3 - r5
        L26:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2b
            return r5
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.c.b.K():long");
    }

    @Override // sg.bigo.ads.api.core.b
    public final long L() {
        return this.C;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String M() {
        return this.f83127u;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final b.InterfaceC1008b N() {
        return this.f83128v;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final b.a O() {
        return this.f83129w;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int P() {
        return this.f83090aa;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String Q() {
        return this.f83091ab;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int R() {
        return this.f83092ac;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void S() {
        this.f83092ac = this.f83093ad;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void T() {
        this.f83094ae = true;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean U() {
        return this.f83094ae;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int V() {
        return this.f83095af;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int W() {
        return this.f83097ah;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int X() {
        return this.f83098ai;
    }

    @Override // sg.bigo.ads.api.core.b
    public final sg.bigo.ads.api.core.p Y() {
        return this.f83100ak;
    }

    @Override // sg.bigo.ads.api.core.b
    public final long Z() {
        return this.E;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final long a() {
        return sg.bigo.ads.api.a.i.f81802a.i();
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(int i10, int i11, boolean z10) {
        if (!this.f83096ag || z10) {
            this.f83096ag = true;
            this.f83097ah = i10;
            this.f83098ai = i11;
        }
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(long j10) {
        this.L = j10;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(String str) {
        this.f83091ab = str;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(@NonNull sg.bigo.ads.api.a.m mVar) {
        this.M = mVar;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(sg.bigo.ads.api.core.p pVar) {
        this.f83100ak = pVar;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(boolean z10) {
        this.S = z10 ? 1 : 2;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean a(int i10) {
        return (this.f83125s & ((long) i10)) > 0;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final sg.bigo.ads.api.core.g aa() {
        return this.F;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String ab() {
        return !sg.bigo.ads.common.utils.q.a((CharSequence) this.N) ? this.N : this.f83089a.p();
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean ac() {
        return this.H == 1;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int ad() {
        return this.I;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int ae() {
        return this.J;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final JSONObject af() {
        return this.A;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void ag() {
        this.K = true;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean ah() {
        return this.K;
    }

    @Override // sg.bigo.ads.api.core.b
    public final double ai() {
        return this.T;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int aj() {
        return this.f83089a.v();
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean ak() {
        return this.f83089a.v() == 2;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean al() {
        return this.V;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final List<sg.bigo.ads.api.core.b> am() {
        return this.B;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String an() {
        return this.f83101al;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int ao() {
        return this.f83102am;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int ap() {
        return this.f83103an;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int aq() {
        return this.f83104ao;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean ar() {
        return this.f83099aj == 1;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int as() {
        return this.f83105ap;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int at() {
        return this.f83132z;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String au() {
        return this.f83107ar;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final String b() {
        return this.f83089a.l();
    }

    @Override // sg.bigo.ads.api.core.b
    public final String b(String str) {
        if (str == null) {
            return "";
        }
        Map<String, String> map = this.f83131y;
        String str2 = map != null ? map.get(str) : "";
        return str2 == null ? "" : str2;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void b(int i10) {
        this.f83093ad = i10;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final String c() {
        return this.f83089a.n();
    }

    @Override // sg.bigo.ads.api.core.b
    public final void c(int i10) {
        this.f83095af = i10;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final sg.bigo.ads.api.a.l d() {
        return this.f83089a;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void d(int i10) {
        this.I = i10;
    }

    @Override // sg.bigo.ads.api.core.b
    public final sg.bigo.ads.api.a.m e() {
        return this.M;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void e(int i10) {
        this.J = i10;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final sg.bigo.ads.api.a.e f() {
        return this.f83106aq;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int g() {
        return this.S;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean h() {
        sg.bigo.ads.api.a.m mVar = this.M;
        return mVar != null && mVar.a("endpage.ad_component_layout") == 5;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String i() {
        return this.O;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean j() {
        return this.P;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean k() {
        return this.Q;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String l() {
        return this.R;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String m() {
        return this.U;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String n() {
        return this.W;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String o() {
        return this.X;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String p() {
        return this.Y;
    }

    @Override // sg.bigo.ads.api.core.b
    public final b.d q() {
        return this.Z;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final String r() {
        return this.f83108b;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public String s() {
        if (!sg.bigo.ads.common.utils.q.a((CharSequence) this.f83109c)) {
            return this.f83109c;
        }
        b.d dVar = this.Z;
        return (dVar == null || sg.bigo.ads.common.utils.q.a((CharSequence) dVar.b())) ? this.f83109c : this.Z.b();
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public String t() {
        if (!sg.bigo.ads.common.utils.q.a((CharSequence) this.f83110d)) {
            return this.f83110d;
        }
        b.d dVar = this.Z;
        return (dVar == null || sg.bigo.ads.common.utils.q.a((CharSequence) dVar.c())) ? this.f83110d : this.Z.c();
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String u() {
        return this.f83111e;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final String v() {
        return this.f83112f;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int w() {
        return this.f83113g;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int x() {
        return this.f83114h;
    }

    @Override // sg.bigo.ads.api.core.b
    public final long y() {
        return this.f83115i;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String z() {
        return this.f83116j;
    }
}
