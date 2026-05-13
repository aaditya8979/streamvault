package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C3978d4;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.tools.m0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: VideoReportData.java */
/* JADX INFO: loaded from: classes6.dex */
public class n {
    public static int N = 1;
    public static int O;
    private String A;
    private String B;
    private int C;
    private String D;
    private String E;
    private String G;
    private String H;
    private String I;
    private int J;
    private long K;
    private String L;
    private int M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37609c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f37612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f37613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f37614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f37615i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f37616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f37617k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f37618l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f37619m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f37620n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f37621o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f37622p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f37623q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f37624r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f37625s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f37627u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f37628v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f37629w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f37630x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f37631y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f37632z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f37607a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37610d = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f37626t = 0;
    private int F = 0;

    public n() {
    }

    public n(Context context, CampaignEx campaignEx, int i10, String str, long j10, int i11) {
        if (i11 == 1 || i11 == 287 || i11 == 94) {
            this.f37623q = "m_download_end";
        } else if (i11 == 95) {
            this.f37623q = "2000025";
        }
        int iS = m0.s(context);
        this.f37627u = iS;
        this.f37628v = m0.a(context, iS);
        this.J = campaignEx.getVideoLength();
        this.f37631y = campaignEx.getRequestId();
        this.f37632z = campaignEx.getRequestIdNotice();
        if (!TextUtils.isEmpty(this.f37629w)) {
            try {
                this.f37629w = URLEncoder.encode(campaignEx.getNoticeUrl() == null ? campaignEx.getClickURL() : campaignEx.getNoticeUrl(), G5.N);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.C = i10;
        this.f37615i = str;
        this.K = j10 == 0 ? campaignEx.getVideoSize() : j10;
    }

    public n(String str) {
        this.f37620n = str;
    }

    public n(String str, int i10, int i11, int i12, int i13, String str2, String str3, int i14, String str4, int i15, String str5) {
        this.f37623q = str;
        this.f37627u = i10;
        this.f37628v = str5;
        this.f37622p = i11;
        this.M = i12;
        this.J = i13;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f37629w = URLEncoder.encode(str2, G5.N);
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.f37630x = str3;
        this.C = i14;
        this.f37615i = str4;
        this.K = i15;
    }

    public n(String str, int i10, int i11, String str2, int i12, String str3, int i13, String str4) {
        this.f37623q = str;
        this.f37627u = i10;
        this.f37628v = str4;
        this.J = i11;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f37629w = URLEncoder.encode(str2, G5.N);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.C = i12;
        this.f37615i = str3;
        this.K = i13;
    }

    public n(String str, int i10, String str2, String str3, String str4) {
        this.f37623q = str;
        this.f37628v = str4;
        this.f37627u = i10;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f37629w = URLEncoder.encode(str2, G5.N);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.f37630x = str3;
    }

    public n(String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f37623q = str;
        this.C = i10;
        this.f37615i = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.f37617k = URLEncoder.encode(str3, G5.N);
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.f37612f = str4;
        this.I = str5;
        this.f37630x = str6;
        this.f37616j = str7;
        if (Integer.valueOf(str2).intValue() > com.mbridge.msdk.foundation.same.a.L) {
            this.C = 2;
        }
    }

    public n(String str, String str2, String str3, String str4, String str5, int i10) {
        this.f37623q = str;
        this.f37612f = str2;
        this.f37631y = str3;
        this.f37632z = str4;
        this.I = str5;
        this.f37627u = i10;
    }

    public n(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6) {
        this.f37623q = str;
        this.f37612f = str2;
        this.f37631y = str3;
        this.f37632z = str4;
        this.I = str5;
        this.f37627u = i10;
        this.f37630x = str6;
        this.f37611e = i11;
    }

    public n(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7) {
        this.f37623q = str;
        this.f37619m = str2;
        this.H = str3;
        this.f37624r = str4;
        this.I = str5;
        this.f37612f = str6;
        this.f37627u = i10;
        this.f37628v = str7;
    }

    public String A() {
        return this.H;
    }

    public String B() {
        return this.I;
    }

    public int C() {
        return this.J;
    }

    public long D() {
        return this.K;
    }

    public String E() {
        return this.L;
    }

    public int F() {
        return this.M;
    }

    public String a() {
        return this.f37608b;
    }

    public String a(String str, String str2) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || (map = this.f37607a) == null) {
            return str2;
        }
        try {
            String str3 = map.get(str);
            return TextUtils.isEmpty(str3) ? str2 : str3;
        } catch (Exception unused) {
            return str2;
        }
    }

    public void a(int i10) {
        this.f37609c = i10;
    }

    public void a(String str) {
        this.f37608b = str;
    }

    public int b() {
        return this.f37609c;
    }

    public void b(int i10) {
        this.f37626t = i10;
    }

    public void b(String str) {
        this.f37612f = str;
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f37607a == null) {
            this.f37607a = new HashMap();
        }
        try {
            this.f37607a.put(str, str2);
        } catch (Exception unused) {
        }
    }

    public int c() {
        return this.f37611e;
    }

    public void c(int i10) {
        this.f37627u = i10;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f37613g = URLEncoder.encode(str);
    }

    public String d() {
        return this.f37612f;
    }

    public void d(int i10) {
        this.C = i10;
    }

    public void d(String str) {
        this.f37614h = str;
    }

    public String e() {
        return this.f37613g;
    }

    public void e(int i10) {
        this.F = i10;
    }

    public void e(String str) {
        this.f37615i = str;
    }

    public String f() {
        return this.f37614h;
    }

    public void f(String str) {
        this.f37616j = str;
    }

    public String g() {
        return this.f37615i;
    }

    public void g(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f37617k = URLEncoder.encode(str, G5.N);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String h() {
        return this.f37616j;
    }

    public void h(String str) {
        this.f37618l = str;
    }

    public String i() {
        return this.f37617k;
    }

    public void i(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f37621o = URLEncoder.encode(str, G5.N);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String j() {
        return this.f37618l;
    }

    public void j(String str) {
        this.f37623q = str;
    }

    public String k() {
        return this.f37619m;
    }

    public void k(String str) {
        this.f37625s = str;
    }

    public String l() {
        return this.f37621o;
    }

    public void l(String str) {
        this.f37628v = str;
    }

    public int m() {
        return this.f37622p;
    }

    public void m(String str) {
        this.f37630x = str;
    }

    public String n() {
        return this.f37623q;
    }

    public void n(String str) {
        this.f37631y = str;
    }

    public String o() {
        return this.f37624r;
    }

    public void o(String str) {
        this.f37632z = str;
    }

    public int p() {
        return this.f37626t;
    }

    public void p(String str) {
        this.A = str;
    }

    public int q() {
        return this.f37627u;
    }

    public void q(String str) {
        this.B = str;
    }

    public String r() {
        return this.f37628v;
    }

    public void r(String str) {
        this.D = str;
    }

    public String s() {
        return this.f37629w;
    }

    public void s(String str) {
        this.E = str;
    }

    public String t() {
        return TextUtils.isEmpty(this.f37630x) ? "" : this.f37630x;
    }

    public void t(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.G = URLEncoder.encode(str, G5.N);
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
    }

    @NonNull
    public String toString() {
        return "RewardReportData [key=" + this.f37623q + ", networkType=" + this.f37627u + ", isCompleteView=" + this.f37622p + ", watchedMillis=" + this.M + ", videoLength=" + this.J + ", offerUrl=" + this.f37629w + ", reason=" + this.f37630x + ", result=" + this.C + ", duration=" + this.f37615i + ", videoSize=" + this.K + C3978d4.j.f31385e;
    }

    public String u() {
        return this.f37631y;
    }

    public void u(String str) {
        this.I = str;
    }

    public String v() {
        return this.f37632z;
    }

    public void v(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.L = URLEncoder.encode(str, G5.N);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String w() {
        return this.A;
    }

    public int x() {
        return this.C;
    }

    public int y() {
        return this.F;
    }

    public String z() {
        return this.G;
    }
}
