package com.applovin.impl;

import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class e3 implements Comparable, AppLovinCommunicatorSubscriber {
    private final List A;
    private final List B;
    private final List C;
    private final List D;
    private final Map E;
    private final boolean F;
    private final a7 G;
    private final boolean H;
    private final String I;
    private final Map J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f8175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f8177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f8179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f8180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f8182i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f8183j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f8184k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f8185l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f8186m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f8187n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f8188o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f8189p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f8190q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f8191r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f8192s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f8193t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f8194u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f8195v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f8196w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f8197x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List f8198y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List f8199z;

    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8205a;

        a(String str) {
            this.f8205a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.f8205a;
        }
    }

    public enum b {
        NOT_SUPPORTED("Not Supported", SupportMenu.CATEGORY_MASK, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", SupportMenu.CATEGORY_MASK, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", SupportMenu.CATEGORY_MASK, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f8213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f8214c;

        b(String str, int i10, String str2) {
            this.f8212a = str;
            this.f8213b = i10;
            this.f8214c = str2;
        }

        public String b() {
            return this.f8214c;
        }

        public String c() {
            return this.f8212a;
        }

        public int d() {
            return this.f8213b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0257 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e3(org.json.JSONObject r22, com.applovin.impl.sdk.k r23) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.e3.<init>(org.json.JSONObject, com.applovin.impl.sdk.k):void");
    }

    private a a() {
        a aVar = this.f8177d ? this.f8178e ? a.COMPLETE : this.f8180g ? a.MISSING : a.INCOMPLETE_INTEGRATION : this.f8178e ? a.INCOMPLETE_INTEGRATION : a.MISSING;
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator it = this.f8199z.iterator();
        while (it.hasNext()) {
            if (!((p4) it.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        Iterator it2 = this.A.iterator();
        while (it2.hasNext()) {
            if (!((k1) it2.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        return (!this.f8188o || com.applovin.impl.sdk.k.F0()) ? E() ? a.INCOMPLETE_INTEGRATION : aVar : a.INVALID_INTEGRATION;
    }

    private List a(MaxAdapter maxAdapter, boolean z10) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            if (z10) {
                arrayList.add(MaxAdFormat.MREC);
            }
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f8191r.equals(com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f52169i)) {
            p4 p4Var = new p4("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", com.applovin.impl.sdk.k.o());
            if (p4Var.c()) {
                arrayList.add(p4Var);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                arrayList.add(new p4(next, jSONObject2.getString(next), com.applovin.impl.sdk.k.o()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject, String str, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length() + jSONArray2.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new k1(jSONObject2, kVar));
            }
        }
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null);
            if (jSONObject3 != null && k1.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new k1(jSONObject3, kVar));
            }
        }
        return arrayList;
    }

    public boolean A() {
        return this.f8179f;
    }

    public boolean B() {
        return this.f8181h;
    }

    public boolean C() {
        return this.H;
    }

    public boolean D() {
        return this.f8188o;
    }

    public boolean E() {
        if (!this.f8187n || !StringUtils.isValidString(this.f8192s)) {
            return false;
        }
        return !n7.d(this.f8192s).equals(n7.a(this.f8193t, this.f8192s.split("\\.").length));
    }

    public boolean F() {
        return this.f8177d;
    }

    public boolean G() {
        return this.f8175b == a.MISSING && this.f8184k;
    }

    public boolean H() {
        return this.F;
    }

    public boolean I() {
        return this.f8185l;
    }

    public boolean J() {
        return this.f8186m;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(e3 e3Var) {
        return this.f8190q.compareToIgnoreCase(e3Var.f8190q);
    }

    public String b() {
        return this.f8191r;
    }

    public String c() {
        return this.f8193t;
    }

    public Map d() {
        return this.J;
    }

    public String e() {
        return this.I;
    }

    public List f() {
        return this.A;
    }

    public String g() {
        return this.f8190q;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public int h() {
        return this.f8197x;
    }

    public int i() {
        return this.f8176c;
    }

    public final String j() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n---------- ");
        sb2.append(this.f8189p);
        sb2.append(" ----------");
        sb2.append("\nStatus  - ");
        sb2.append(this.f8175b.b());
        sb2.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb2.append((!this.f8177d || TextUtils.isEmpty(this.f8192s)) ? "UNAVAILABLE" : this.f8192s);
        sb2.append("\nAdapter - ");
        if (this.f8178e && !TextUtils.isEmpty(this.f8193t)) {
            str = this.f8193t;
        }
        sb2.append(str);
        for (p4 p4Var : n()) {
            if (!p4Var.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(p4Var.b());
                sb2.append(": ");
                sb2.append(p4Var.a());
            }
        }
        for (k1 k1Var : f()) {
            if (!k1Var.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(k1Var.b());
                sb2.append(": ");
                sb2.append(k1Var.a());
            }
        }
        return sb2.toString();
    }

    public String k() {
        return this.f8194u;
    }

    public List l() {
        return this.C;
    }

    public String m() {
        return this.f8189p;
    }

    public List n() {
        return this.f8199z;
    }

    public final com.applovin.impl.sdk.k o() {
        return this.f8174a;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f8191r.equals(string)) {
            this.f8176c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter maxAdapterA = w3.a(string, this.f8174a);
            if (maxAdapterA != null) {
                String strA = w3.a(maxAdapterA);
                if (this.f8192s.equals(strA)) {
                    return;
                }
                this.f8192s = strA;
                this.f8174a.t().a(this.f8192s, string);
            }
        }
    }

    public String p() {
        return this.f8192s;
    }

    public a q() {
        return this.f8175b;
    }

    public List r() {
        return this.f8198y;
    }

    public List s() {
        return this.B;
    }

    public a7 t() {
        return this.G;
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.f8189p + ", displayName=" + this.f8190q + ", sdkAvailable=" + this.f8177d + ", sdkVersion=" + this.f8192s + ", adapterAvailable=" + this.f8178e + ", adapterVersion=" + this.f8193t + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e;
    }

    public List u() {
        return this.D;
    }

    public String v() {
        return this.f8195v;
    }

    public String w() {
        return this.f8196w;
    }

    public Map x() {
        return this.E;
    }

    public b y() {
        if (!this.f8182i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.f8175b;
        return (aVar == a.COMPLETE || (aVar == a.INCOMPLETE_INTEGRATION && F() && z())) ? !this.f8174a.s0().c() ? b.DISABLED : (this.f8183j && (this.f8176c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f8176c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? b.NOT_INITIALIZED : b.READY : b.INVALID_INTEGRATION;
    }

    public boolean z() {
        return this.f8178e;
    }
}
