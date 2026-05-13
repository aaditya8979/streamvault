package com.mbridge.msdk.foundation.same.net.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.m;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.network.toolbox.i;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.u;
import com.mbridge.msdk.tracker.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: RequestUrlUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public class d {
    public String A;
    private String B;
    public String C;
    public String D;
    private String E;
    public String F;
    private String G;
    public String H;
    private String I;
    public String J;
    public String K;
    private String L;
    public String M;
    private String N;
    public String O;
    private String P;
    public String Q;
    public String R;
    private String S;
    public String T;
    public String U;
    private String V;
    public String W;
    public String X;
    private String Y;
    public String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37825a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private String f37826a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f37827b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f37828b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f37829c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private String f37830c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f37831d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public String f37832d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f37833e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f37834e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f37835f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f37836f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f37837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f37838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f37839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f37840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f37841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f37842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f37843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f37844n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f37845o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f37846p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f37847q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f37848r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f37849s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f37850t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList<String> f37851u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f37852v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f37853w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList<String> f37854x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f37855y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f37856z;

    /* JADX INFO: compiled from: RequestUrlUtil.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f37857a = new d();
    }

    private d() {
        this.f37825a = "RequestUrlUtil";
        this.f37827b = DomainNameUtils.getInstance().DEFAULT_HOST_APPLETS;
        this.f37829c = DomainNameUtils.getInstance().DEFAULT_CDN_SPARE_SETTING_URL;
        this.f37831d = DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS;
        this.f37833e = DomainNameUtils.getInstance().DEFAULT_HOST_API;
        this.f37835f = DomainNameUtils.getInstance().DEFAULT_HOST_MONITOR_DEFAULT;
        this.f37837g = DomainNameUtils.getInstance().DEFAULT_HOST_PRIVACY;
        this.f37838h = DomainNameUtils.getInstance().DEFAULT_HOST_REVENUE_DEFAULT;
        this.f37839i = DomainNameUtils.getInstance().DEFAULT_HOST_SETTING;
        this.f37840j = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_ANALYTICS;
        this.f37841k = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_MONITOR;
        this.f37842l = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_REVENUE;
        this.f37843m = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_SETTING;
        this.f37844n = 9377;
        this.f37845o = 9377;
        this.f37846p = 9988;
        this.f37847q = 9377;
        this.f37848r = false;
        this.f37849s = false;
        this.f37850t = 1;
        this.f37851u = DomainNameUtils.getInstance().SPARE_SETTING_HOST;
        this.f37852v = 0;
        this.f37853w = 0;
        this.f37854x = DomainNameUtils.getInstance().SPARE_TCP_SETTING_HOST;
        this.f37855y = DomainNameUtils.getInstance().DEFAULT_HB_HOST;
        this.f37856z = "/bid";
        this.A = this.f37855y + this.f37856z;
        this.B = "/sdk/customid";
        this.C = this.f37839i + this.B;
        this.D = this.f37843m + this.B;
        this.E = "/image";
        this.F = this.f37833e + this.E;
        this.G = "/load";
        this.H = this.f37855y + this.G;
        this.I = "/mapping";
        this.J = this.f37839i + this.I;
        this.K = this.f37843m + this.I;
        this.L = "";
        this.M = this.f37838h + this.L;
        this.N = "/batchPaidEvent";
        this.O = this.f37838h + this.N;
        this.P = "/setting";
        this.Q = this.f37839i + this.P;
        this.R = this.f37843m + this.P;
        this.S = "/rewardsetting";
        this.T = this.f37839i + this.S;
        this.U = this.f37843m + this.S;
        this.V = "/appwall/setting";
        this.W = this.f37839i + this.V;
        this.X = this.f37843m + this.V;
        this.Y = "/openapi/ad/v3";
        this.Z = this.f37833e + this.Y;
        this.f37826a0 = "/openapi/ad/v4";
        this.f37828b0 = this.f37833e + this.f37826a0;
        this.f37830c0 = "/openapi/ad/v5";
        this.f37832d0 = this.f37833e + this.f37830c0;
        this.f37834e0 = true;
        this.f37836f0 = 0;
    }

    private p a(int i10) {
        return i10 == 1 ? new p(new m((byte) 2), h().f37841k, h().f37845o) : new p(new h(), h().M, 0);
    }

    private void a() {
        this.O = this.f37838h + this.N;
    }

    private void a(g gVar) {
        com.mbridge.msdk.setting.d dVarY;
        if (gVar == null || (dVarY = gVar.y()) == null || dVarY.a() == 1) {
            return;
        }
        int iB = s0.a().b("monitor", "type", s0.a().b("t_r_t", 1));
        if (iB != 0 && iB != 1) {
            iB = 0;
        }
        u.a().a(com.mbridge.msdk.foundation.controller.c.n().d(), new x.b().a(new com.mbridge.msdk.foundation.same.report.d()).a(new n()).a(iB, a(iB)).a(s0.a().b("t_m_e_t", 604800000)).b(s0.a().b("t_m_e_s", 50)).d(s0.a().b("t_m_r_c", 50)).c(s0.a().b("t_m_t", 15000)).e(s0.a().b("t_m_r_t_s", 1)).a(), dVarY.b() * 1000, com.mbridge.msdk.foundation.same.report.c.b());
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(https|http)://[-A-Za-z0-9{}+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str.trim()).matches();
    }

    private String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Uri.parse(str).getHost();
        } catch (Throwable th2) {
            q0.b("RequestUrlUtil", th2.getMessage());
            return "";
        }
    }

    private void b() {
        this.M = this.f37835f + this.L;
    }

    private void c() {
        this.A = this.f37855y + this.f37856z;
        this.H = this.f37855y + this.G;
        i.b().f(this.f37855y);
    }

    private void d() {
        this.Z = this.f37833e + this.Y;
        this.f37828b0 = this.f37833e + this.f37826a0;
        this.f37832d0 = this.f37833e + this.f37830c0;
        this.F = this.f37833e + this.E;
    }

    public static d h() {
        return b.f37857a;
    }

    public String a(String str, int i10) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split("_");
                return strArrSplit.length > 1 ? a(true, strArrSplit[1]) : a(true, "");
            }
        } catch (Exception e10) {
            q0.b("RequestUrlUtil", e10.getMessage());
        }
        return i10 % 2 == 0 ? this.f37832d0 : this.Z;
    }

    public String a(boolean z10, String str) {
        if (!z10) {
            return this.A.replace(JsonUtils.EMPTY_JSON, "");
        }
        if (!this.H.contains(JsonUtils.EMPTY_JSON) || TextUtils.isEmpty(str)) {
            return this.H.replace(JsonUtils.EMPTY_JSON, "");
        }
        return this.H.replace(JsonUtils.EMPTY_JSON, str + "-");
    }

    public void a(boolean z10) {
        this.f37834e0 = z10;
    }

    public void b(int i10) {
        this.f37844n = i10;
    }

    public void c(int i10) {
        this.f37847q = i10;
    }

    public void d(int i10) {
        this.f37836f0 = i10;
    }

    public void e() {
        this.Q = this.f37839i + this.P;
        this.C = this.f37839i + this.B;
        this.T = this.f37839i + this.S;
        this.J = this.f37839i + this.I;
        this.W = this.f37839i + this.V;
    }

    public void f() {
        this.R = this.f37843m + this.P;
        this.D = this.f37843m + this.B;
        this.U = this.f37843m + this.S;
        this.K = this.f37843m + this.I;
        this.X = this.f37843m + this.V;
    }

    public boolean g() {
        try {
            if (this.f37849s) {
                ArrayList<String> arrayList = this.f37854x;
                if (arrayList != null && this.f37853w <= arrayList.size() - 1) {
                    if (!a(this.f37854x.get(this.f37853w))) {
                        this.f37843m = this.f37854x.get(this.f37853w);
                        f();
                    }
                    return true;
                }
            } else {
                ArrayList<String> arrayList2 = this.f37851u;
                if (arrayList2 != null && this.f37852v <= arrayList2.size() - 1) {
                    this.f37839i = this.f37851u.get(this.f37852v);
                    e();
                    return true;
                }
            }
            if (this.f37848r) {
                this.f37852v = 0;
                this.f37853w = 0;
            }
            return false;
        } catch (Throwable th2) {
            q0.a("RequestUrlUtil", th2.getMessage());
            return false;
        }
    }

    public int i() {
        return this.f37836f0;
    }

    public void j() {
        HashMap<String, String> mapC;
        g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD != null) {
            com.mbridge.msdk.setting.a aVarJ = gVarD.j();
            if (aVarJ != null) {
                this.f37842l = aVarJ.f();
                this.f37846p = aVarJ.g();
                this.f37838h = aVarJ.e();
                a();
            }
            com.mbridge.msdk.setting.d dVarY = gVarD.y();
            if (dVarY != null) {
                this.f37841k = dVarY.d();
                this.f37845o = dVarY.e();
                this.f37835f = dVarY.c();
                b();
                a(gVarD);
            }
            this.f37849s = gVarD.o0() == 2;
            this.f37850t = gVarD.o0();
            a(!gVarD.b(2));
            if (gVarD.C() != null && gVarD.C().size() > 0 && (mapC = gVarD.C()) != null && mapC.size() > 0) {
                if (mapC.containsKey("v") && !TextUtils.isEmpty(mapC.get("v")) && a(mapC.get("v"))) {
                    this.f37833e = mapC.get("v");
                    d();
                }
                if (mapC.containsKey(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(mapC.get(CampaignEx.JSON_KEY_HB)) && a(mapC.get(CampaignEx.JSON_KEY_HB))) {
                    this.f37855y = mapC.get(CampaignEx.JSON_KEY_HB);
                    c();
                }
                if (mapC.containsKey("lg") && !TextUtils.isEmpty(mapC.get("lg"))) {
                    String str = mapC.get("lg");
                    if (a(str)) {
                        this.f37831d = str;
                    } else {
                        this.f37840j = str;
                    }
                }
                if (mapC.containsKey("lgt") && !TextUtils.isEmpty(mapC.get("lgt"))) {
                    String str2 = mapC.get("lgt");
                    if (a(str2)) {
                        String strB = b(str2);
                        if (!TextUtils.isEmpty(strB)) {
                            this.f37840j = strB;
                        }
                    } else {
                        this.f37840j = str2;
                    }
                }
            }
            String strU = gVarD.u();
            if (!TextUtils.isEmpty(strU)) {
                this.f37839i = strU;
                e();
                this.f37851u.add(0, strU);
            }
            String strV = gVarD.v();
            if (TextUtils.isEmpty(strV)) {
                return;
            }
            this.f37843m = strV;
            f();
            this.f37854x.add(0, strV);
        }
    }
}
