package sg.bigo.ads.controller.e;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.Z3;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.common.utils.p;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements sg.bigo.ads.common.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public AdConfig f83290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Context f83291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.controller.b.d f83292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f83293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f83294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f83295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f83296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f83297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f83298i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f83299j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f83300k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f83301l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f83302m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f83303n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f83304o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f83305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f83306q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f83307r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f83308s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f83309t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f83311v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f83312w = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f83310u = 0;

    public d(@NonNull Context context, @NonNull AdConfig adConfig, @NonNull sg.bigo.ads.controller.b.d dVar) {
        this.f83291b = context;
        this.f83290a = adConfig;
        this.f83292c = dVar;
    }

    @Override // sg.bigo.ads.common.g
    public final String A() {
        sg.bigo.ads.common.a aVarL = this.f83292c.L();
        return aVarL != null ? aVarL.f81939b : "";
    }

    @Override // sg.bigo.ads.common.g
    public final String B() {
        return sg.bigo.ads.common.b.a.a(this.f83291b);
    }

    @Override // sg.bigo.ads.common.g
    public final String C() {
        return this.f83292c.F();
    }

    @Override // sg.bigo.ads.common.g
    public final int D() {
        return (int) (r.b() / 1000);
    }

    @Override // sg.bigo.ads.common.g
    public final String E() {
        return this.f83292c.j();
    }

    @Override // sg.bigo.ads.common.g
    public final boolean F() {
        sg.bigo.ads.common.a aVarK = this.f83292c.K();
        if (aVarK != null) {
            return aVarK.f81940c;
        }
        return true;
    }

    @Override // sg.bigo.ads.common.g
    public final String G() {
        sg.bigo.ads.common.a aVarK = this.f83292c.K();
        return aVarK != null ? aVarK.f81939b : "";
    }

    @Override // sg.bigo.ads.common.g
    public final String H() {
        return this.f83303n;
    }

    @Override // sg.bigo.ads.common.g
    public final String I() {
        return this.f83304o;
    }

    @Override // sg.bigo.ads.common.g
    public final int J() {
        return this.f83305p;
    }

    @Override // sg.bigo.ads.common.g
    public final long K() {
        return this.f83306q;
    }

    @Override // sg.bigo.ads.common.g
    public final long L() {
        return this.f83307r;
    }

    @Override // sg.bigo.ads.common.g
    public final long M() {
        return p.a(this.f83291b);
    }

    @Override // sg.bigo.ads.common.g
    public final long N() {
        return p.c();
    }

    @Override // sg.bigo.ads.common.g
    public final long O() {
        return p.a();
    }

    @Override // sg.bigo.ads.common.g
    public final String P() {
        return this.f83292c.l();
    }

    @Override // sg.bigo.ads.common.g
    public final String Q() {
        return "";
    }

    @Override // sg.bigo.ads.common.g
    public final String R() {
        return q.d(sg.bigo.ads.common.aa.b.e(this.f83291b));
    }

    @Override // sg.bigo.ads.common.g
    public final String S() {
        return q.d(sg.bigo.ads.common.aa.b.c(this.f83291b));
    }

    @Override // sg.bigo.ads.common.g
    public final String T() {
        return this.f83309t;
    }

    @Override // sg.bigo.ads.common.g
    public final String U() {
        sg.bigo.ads.controller.b.d dVar = this.f83292c;
        return dVar != null ? dVar.G() : "";
    }

    @Override // sg.bigo.ads.common.g
    public final long V() {
        return h.a().f83360e.f83365a;
    }

    @Override // sg.bigo.ads.common.g
    public final long W() {
        return h.a().f83360e.f83366b;
    }

    @Override // sg.bigo.ads.common.g
    public final String X() {
        return sg.bigo.ads.common.x.a.r();
    }

    @Override // sg.bigo.ads.common.g
    public final long Y() {
        if (this.f83311v == 0) {
            try {
                Context context = this.f83291b;
                this.f83311v = sg.bigo.ads.common.utils.c.c(context, context.getPackageName());
            } catch (Exception unused) {
                this.f83311v = -1L;
            }
        }
        return this.f83311v;
    }

    @Override // sg.bigo.ads.common.g
    public final long Z() {
        if (this.f83312w == 0) {
            try {
                Context context = this.f83291b;
                this.f83312w = sg.bigo.ads.common.utils.c.d(context, context.getPackageName());
            } catch (Exception unused) {
                this.f83312w = -1L;
            }
        }
        return this.f83312w;
    }

    @Override // sg.bigo.ads.common.g
    @NonNull
    public final String a() {
        return this.f83290a.getAppKey();
    }

    @Override // sg.bigo.ads.common.g
    public final String aa() {
        return "official";
    }

    @Override // sg.bigo.ads.common.g
    public final int ab() {
        return this.f83308s;
    }

    @Override // sg.bigo.ads.common.g
    public final sg.bigo.ads.common.b ac() {
        if (this.f83292c.n().a(15)) {
            return sg.bigo.ads.common.aa.b.h(this.f83291b);
        }
        sg.bigo.ads.common.aa.b.j(this.f83291b);
        return null;
    }

    @Override // sg.bigo.ads.common.g
    public final boolean ad() {
        sg.bigo.ads.common.a aVarM = this.f83292c.M();
        if (aVarM != null) {
            return aVarM.f81940c;
        }
        return true;
    }

    @Override // sg.bigo.ads.common.g
    public final String ae() {
        sg.bigo.ads.common.a aVarM = this.f83292c.M();
        return aVarM != null ? aVarM.f81939b : "";
    }

    @Override // sg.bigo.ads.common.g
    public final Context af() {
        return this.f83291b;
    }

    @Override // sg.bigo.ads.common.g
    public final boolean ag() {
        return sg.bigo.ads.common.aa.b.k(this.f83291b);
    }

    @Override // sg.bigo.ads.common.g
    public final int ah() {
        return sg.bigo.ads.common.aa.b.l(this.f83291b);
    }

    @Override // sg.bigo.ads.common.g
    public final boolean ai() {
        return sg.bigo.ads.common.aa.b.c();
    }

    @Override // sg.bigo.ads.common.g
    public final float aj() {
        return sg.bigo.ads.common.aa.b.m(this.f83291b);
    }

    @Override // sg.bigo.ads.common.g
    public final int ak() {
        return sg.bigo.ads.common.aa.b.o(this.f83291b);
    }

    @Override // sg.bigo.ads.common.g
    public final float al() {
        return sg.bigo.ads.common.aa.b.p(this.f83291b);
    }

    @Override // sg.bigo.ads.common.g
    public final int am() {
        return sg.bigo.ads.common.aa.b.q(this.f83291b);
    }

    @Override // sg.bigo.ads.common.g
    public final int an() {
        return sg.bigo.ads.common.aa.b.r(this.f83291b);
    }

    @Override // sg.bigo.ads.common.g
    public final boolean ao() {
        return sg.bigo.ads.common.aa.b.u(this.f83291b);
    }

    @Override // sg.bigo.ads.common.g
    public final int ap() {
        return sg.bigo.ads.common.aa.b.s(this.f83291b);
    }

    @Override // sg.bigo.ads.common.g
    public final int aq() {
        return sg.bigo.ads.common.aa.b.t(this.f83291b);
    }

    @Override // sg.bigo.ads.common.g
    public final long ar() {
        return sg.bigo.ads.common.aa.b.v(this.f83291b);
    }

    @Override // sg.bigo.ads.common.g
    public final boolean as() {
        return sg.bigo.ads.common.aa.b.w(this.f83291b);
    }

    @Override // sg.bigo.ads.common.g
    public final boolean at() {
        return sg.bigo.ads.common.aa.b.n(this.f83291b);
    }

    @Override // sg.bigo.ads.common.g
    public final boolean au() {
        return sg.bigo.ads.common.aa.b.d();
    }

    @Override // sg.bigo.ads.common.g
    public final int av() {
        return this.f83292c.n().a(25) ? 2 : 0;
    }

    @Override // sg.bigo.ads.common.g
    public final int aw() {
        return this.f83310u;
    }

    @Override // sg.bigo.ads.common.g
    public final boolean ax() {
        return this.f83292c.n().a(27);
    }

    @Override // sg.bigo.ads.common.g
    public final String b() {
        return this.f83293d;
    }

    @Override // sg.bigo.ads.common.g
    public final String c() {
        return this.f83294e;
    }

    @Override // sg.bigo.ads.common.g
    public final int d() {
        return this.f83295f;
    }

    @Override // sg.bigo.ads.common.g
    public final String e() {
        return this.f83290a.getChannel();
    }

    @Override // sg.bigo.ads.common.g
    public final int f() {
        return this.f83290a.getAge();
    }

    @Override // sg.bigo.ads.common.g
    public final int g() {
        return this.f83290a.getGender();
    }

    @Override // sg.bigo.ads.common.g
    public final long h() {
        return this.f83290a.getActivatedTime();
    }

    @Override // sg.bigo.ads.common.g
    public final String i() {
        return "android";
    }

    @Override // sg.bigo.ads.common.g
    public final String j() {
        return Build.VERSION.RELEASE;
    }

    @Override // sg.bigo.ads.common.g
    public final String k() {
        return this.f83296g;
    }

    @Override // sg.bigo.ads.common.g
    public final String l() {
        return this.f83297h;
    }

    @Override // sg.bigo.ads.common.g
    public final String m() {
        return this.f83298i;
    }

    @Override // sg.bigo.ads.common.g
    public final String n() {
        return this.f83299j;
    }

    @Override // sg.bigo.ads.common.g
    public final String o() {
        return this.f83300k;
    }

    @Override // sg.bigo.ads.common.g
    public final int p() {
        return this.f83301l;
    }

    @Override // sg.bigo.ads.common.g
    public final String q() {
        return this.f83302m;
    }

    @Override // sg.bigo.ads.common.g
    public final String r() {
        int iA = sg.bigo.ads.common.aa.c.a(this.f83291b);
        return iA != 1 ? iA != 2 ? iA != 3 ? iA != 4 ? iA != 5 ? "unknown" : "5g" : "4g" : "wifi" : Z3.f30762a : "2g";
    }

    @Override // sg.bigo.ads.common.g
    public final String s() {
        return q.d(sg.bigo.ads.common.utils.c.a());
    }

    @Override // sg.bigo.ads.common.g
    public final String t() {
        String strK = this.f83292c.k();
        return !TextUtils.isEmpty(strK) ? strK : v();
    }

    @Override // sg.bigo.ads.common.g
    public final String u() {
        return this.f83292c.k();
    }

    @Override // sg.bigo.ads.common.g
    public final String v() {
        if (!TextUtils.isEmpty("")) {
            return "";
        }
        String strR = R();
        return !TextUtils.isEmpty(strR) ? strR : S();
    }

    @Override // sg.bigo.ads.common.g
    public final String w() {
        return "";
    }

    @Override // sg.bigo.ads.common.g
    public final String x() {
        return "";
    }

    @Override // sg.bigo.ads.common.g
    public final String y() {
        return "5.6.2";
    }

    @Override // sg.bigo.ads.common.g
    public final boolean z() {
        sg.bigo.ads.common.a aVarL = this.f83292c.L();
        if (aVarL != null) {
            return aVarL.f81940c;
        }
        return true;
    }
}
