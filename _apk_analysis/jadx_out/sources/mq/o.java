package mq;

import com.ironsource.C3978d4;
import com.ironsource.Z7;
import hq.e;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import oq.c;
import org.eclipse.jetty.http.HttpStatus;

/* JADX INFO: compiled from: Response.java */
/* JADX INFO: loaded from: classes12.dex */
public class o implements an.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final vq.c f74966l = vq.b.a(o.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f74967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f74968b = 200;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f74969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Locale f74970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f74971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e.a f74972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f74973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f74974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f74975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile int f74976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PrintWriter f74977k;

    public o(b bVar) {
        this.f74967a = bVar;
    }

    public void A() throws IOException {
        if (!this.f74967a.I() || b()) {
            return;
        }
        ((org.eclipse.jetty.http.b) this.f74967a.q()).G(102);
    }

    public void B(String str) {
        e.a aVarD;
        if (this.f74967a.J() || this.f74976j != 0 || b()) {
            return;
        }
        this.f74974h = true;
        if (str == null) {
            if (this.f74973g != null) {
                this.f74973g = null;
                e.a aVar = this.f74972f;
                if (aVar != null) {
                    this.f74975i = aVar.toString();
                } else {
                    String str2 = this.f74971e;
                    if (str2 != null) {
                        this.f74975i = str2;
                    } else {
                        this.f74975i = null;
                    }
                }
                if (this.f74975i == null) {
                    this.f74967a.C().I(gq.i.f62841z);
                    return;
                } else {
                    this.f74967a.C().C(gq.i.f62841z, this.f74975i);
                    return;
                }
            }
            return;
        }
        this.f74973g = str;
        String str3 = this.f74975i;
        if (str3 != null) {
            int iIndexOf = str3.indexOf(59);
            if (iIndexOf < 0) {
                this.f74975i = null;
                e.a aVar2 = this.f74972f;
                if (aVar2 != null && (aVarD = aVar2.d(this.f74973g)) != null) {
                    this.f74975i = aVarD.toString();
                    this.f74967a.C().B(gq.i.f62841z, aVarD);
                }
                if (this.f74975i == null) {
                    this.f74975i = this.f74971e + ";charset=" + sq.m.c(this.f74973g, ";= ");
                    this.f74967a.C().C(gq.i.f62841z, this.f74975i);
                    return;
                }
                return;
            }
            int iIndexOf2 = this.f74975i.indexOf("charset=", iIndexOf);
            if (iIndexOf2 < 0) {
                this.f74975i += ";charset=" + sq.m.c(this.f74973g, ";= ");
            } else {
                int i10 = iIndexOf2 + 8;
                int iIndexOf3 = this.f74975i.indexOf(Z7.f30794r, i10);
                if (iIndexOf3 < 0) {
                    this.f74975i = this.f74975i.substring(0, i10) + sq.m.c(this.f74973g, ";= ");
                } else {
                    this.f74975i = this.f74975i.substring(0, i10) + sq.m.c(this.f74973g, ";= ") + this.f74975i.substring(iIndexOf3);
                }
            }
            this.f74967a.C().C(gq.i.f62841z, this.f74975i);
        }
    }

    public void C(int i10, String str) {
        if (i10 <= 0) {
            throw new IllegalArgumentException();
        }
        if (this.f74967a.J()) {
            return;
        }
        this.f74968b = i10;
        this.f74969c = str;
    }

    @Override // an.c
    public void a(String str, String str2) {
        if (this.f74967a.J()) {
            if (!str.startsWith("org.eclipse.jetty.server.include.")) {
                return;
            } else {
                str = str.substring(33);
            }
        }
        if ("Content-Type".equalsIgnoreCase(str)) {
            l(str2);
            return;
        }
        this.f74967a.C().e(str, str2);
        if ("Content-Length".equalsIgnoreCase(str)) {
            this.f74967a.f74870m.o(Long.parseLong(str2));
        }
    }

    @Override // zm.t
    public boolean b() {
        return this.f74967a.K();
    }

    @Override // zm.t
    public void c() {
        if (b()) {
            throw new IllegalStateException("Committed");
        }
        this.f74967a.q().c();
    }

    @Override // an.c
    public void d(String str, long j10) {
        if (this.f74967a.J()) {
            return;
        }
        this.f74967a.C().F(str, j10);
    }

    @Override // zm.t
    public zm.n e() throws IOException {
        if (this.f74976j != 0 && this.f74976j != 1) {
            throw new IllegalStateException("WRITER");
        }
        zm.n nVarT = this.f74967a.t();
        this.f74976j = 1;
        return nVarT;
    }

    @Override // zm.t
    public String f() {
        if (this.f74973g == null) {
            this.f74973g = "ISO-8859-1";
        }
        return this.f74973g;
    }

    @Override // an.c
    public void g(String str) throws IOException {
        String strB;
        if (this.f74967a.J()) {
            return;
        }
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (!sq.q.h(str)) {
            StringBuilder sbN = this.f74967a.x().N();
            if (str.startsWith("/")) {
                strB = sq.q.b(str);
            } else {
                String strV = this.f74967a.x().v();
                if (!strV.endsWith("/")) {
                    strV = sq.q.i(strV);
                }
                strB = sq.q.b(sq.q.a(strV, str));
                if (!strB.startsWith("/")) {
                    sbN.append('/');
                }
            }
            if (strB == null) {
                throw new IllegalStateException("path cannot be above root");
            }
            sbN.append(strB);
            str = sbN.toString();
        }
        c();
        j("Location", str);
        k(302);
        r();
    }

    @Override // zm.t
    public PrintWriter h() throws IOException {
        if (this.f74976j != 0 && this.f74976j != 2) {
            throw new IllegalStateException("STREAM");
        }
        if (this.f74977k == null) {
            String strA = this.f74973g;
            if (strA == null) {
                e.a aVar = this.f74972f;
                if (aVar != null) {
                    strA = gq.p.a(aVar);
                }
                if (strA == null) {
                    strA = "ISO-8859-1";
                }
                B(strA);
            }
            this.f74977k = this.f74967a.v(strA);
        }
        this.f74976j = 2;
        return this.f74977k;
    }

    @Override // an.c
    public boolean i(String str) {
        return this.f74967a.C().j(str);
    }

    @Override // an.c
    public void j(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            l(str2);
            return;
        }
        if (this.f74967a.J()) {
            if (!str.startsWith("org.eclipse.jetty.server.include.")) {
                return;
            } else {
                str = str.substring(33);
            }
        }
        this.f74967a.C().D(str, str2);
        if ("Content-Length".equalsIgnoreCase(str)) {
            if (str2 == null) {
                this.f74967a.f74870m.o(-1L);
            } else {
                this.f74967a.f74870m.o(Long.parseLong(str2));
            }
        }
    }

    @Override // an.c
    public void k(int i10) {
        C(i10, null);
    }

    @Override // zm.t
    public void l(String str) {
        if (b() || this.f74967a.J()) {
            return;
        }
        if (str == null) {
            if (this.f74970d == null) {
                this.f74973g = null;
            }
            this.f74971e = null;
            this.f74972f = null;
            this.f74975i = null;
            this.f74967a.C().I(gq.i.f62841z);
            return;
        }
        int iIndexOf = str.indexOf(59);
        if (iIndexOf <= 0) {
            this.f74971e = str;
            e.a aVarC = gq.p.f62900c.c(str);
            this.f74972f = aVarC;
            String str2 = this.f74973g;
            if (str2 == null) {
                if (aVarC != null) {
                    this.f74975i = aVarC.toString();
                    this.f74967a.C().B(gq.i.f62841z, this.f74972f);
                    return;
                } else {
                    this.f74975i = str;
                    this.f74967a.C().C(gq.i.f62841z, this.f74975i);
                    return;
                }
            }
            if (aVarC == null) {
                this.f74975i = str + ";charset=" + sq.m.c(this.f74973g, ";= ");
                this.f74967a.C().C(gq.i.f62841z, this.f74975i);
                return;
            }
            e.a aVarD = aVarC.d(str2);
            if (aVarD != null) {
                this.f74975i = aVarD.toString();
                this.f74967a.C().B(gq.i.f62841z, aVarD);
                return;
            }
            this.f74975i = this.f74971e + ";charset=" + sq.m.c(this.f74973g, ";= ");
            this.f74967a.C().C(gq.i.f62841z, this.f74975i);
            return;
        }
        String strTrim = str.substring(0, iIndexOf).trim();
        this.f74971e = strTrim;
        hq.e eVar = gq.p.f62900c;
        this.f74972f = eVar.c(strTrim);
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf("charset=", i10);
        if (iIndexOf2 < 0) {
            this.f74972f = null;
            if (this.f74973g != null) {
                str = str + ";charset=" + sq.m.c(this.f74973g, ";= ");
            }
            this.f74975i = str;
            this.f74967a.C().C(gq.i.f62841z, this.f74975i);
            return;
        }
        this.f74974h = true;
        int i11 = iIndexOf2 + 8;
        int iIndexOf3 = str.indexOf(32, i11);
        if (this.f74976j != 2) {
            if ((iIndexOf2 != i10 || iIndexOf3 >= 0) && !(iIndexOf2 == iIndexOf + 2 && iIndexOf3 < 0 && str.charAt(i10) == ' ')) {
                if (iIndexOf3 > 0) {
                    this.f74973g = sq.m.e(str.substring(i11, iIndexOf3));
                    this.f74975i = str;
                    this.f74967a.C().C(gq.i.f62841z, this.f74975i);
                    return;
                } else {
                    this.f74973g = sq.m.e(str.substring(i11));
                    this.f74975i = str;
                    this.f74967a.C().C(gq.i.f62841z, this.f74975i);
                    return;
                }
            }
            this.f74972f = eVar.c(this.f74971e);
            String strE = sq.m.e(str.substring(i11));
            this.f74973g = strE;
            e.a aVar = this.f74972f;
            if (aVar == null) {
                this.f74975i = str;
                this.f74967a.C().C(gq.i.f62841z, this.f74975i);
                return;
            }
            e.a aVarD2 = aVar.d(strE);
            if (aVarD2 != null) {
                this.f74975i = aVarD2.toString();
                this.f74967a.C().B(gq.i.f62841z, aVarD2);
                return;
            } else {
                this.f74975i = str;
                this.f74967a.C().C(gq.i.f62841z, this.f74975i);
                return;
            }
        }
        if ((iIndexOf2 != i10 || iIndexOf3 >= 0) && !(iIndexOf2 == iIndexOf + 2 && iIndexOf3 < 0 && str.charAt(i10) == ' ')) {
            if (iIndexOf3 < 0) {
                this.f74975i = str.substring(0, iIndexOf2) + ";charset=" + sq.m.c(this.f74973g, ";= ");
                this.f74967a.C().C(gq.i.f62841z, this.f74975i);
                return;
            }
            this.f74975i = str.substring(0, iIndexOf2) + str.substring(iIndexOf3) + ";charset=" + sq.m.c(this.f74973g, ";= ");
            this.f74967a.C().C(gq.i.f62841z, this.f74975i);
            return;
        }
        e.a aVar2 = this.f74972f;
        if (aVar2 == null) {
            this.f74975i = this.f74971e + ";charset=" + this.f74973g;
            this.f74967a.C().C(gq.i.f62841z, this.f74975i);
            return;
        }
        e.a aVarD3 = aVar2.d(this.f74973g);
        if (aVarD3 != null) {
            this.f74975i = aVarD3.toString();
            this.f74967a.C().B(gq.i.f62841z, aVarD3);
            return;
        }
        this.f74975i = this.f74971e + ";charset=" + this.f74973g;
        this.f74967a.C().C(gq.i.f62841z, this.f74975i);
    }

    @Override // an.c
    public void m(int i10, String str) throws IOException {
        if (this.f74967a.J()) {
            return;
        }
        if (b()) {
            f74966l.f("Committed before " + i10 + Z7.f30794r + str, new Object[0]);
        }
        c();
        this.f74973g = null;
        j("Expires", null);
        j("Last-Modified", null);
        j("Cache-Control", null);
        j("Content-Type", null);
        j("Content-Length", null);
        this.f74976j = 0;
        C(i10, str);
        if (str == null) {
            str = HttpStatus.b(i10);
        }
        if (i10 != 204 && i10 != 304 && i10 != 206 && i10 >= 200) {
            n nVarX = this.f74967a.x();
            c.d context = nVarX.getContext();
            oq.e eVarX0 = context != null ? context.b().X0() : null;
            if (eVarX0 == null) {
                eVarX0 = (oq.e) this.f74967a.n().b().t0(oq.e.class);
            }
            if (eVarX0 != null) {
                nVarX.a("javax.servlet.error.status_code", new Integer(i10));
                nVarX.a("javax.servlet.error.message", str);
                nVarX.a("javax.servlet.error.request_uri", nVarX.v());
                nVarX.a("javax.servlet.error.servlet_name", nVarX.Q());
                eVarX0.a0(null, this.f74967a.x(), this.f74967a.x(), this);
            } else {
                j("Cache-Control", "must-revalidate,no-cache,no-store");
                l("text/html;charset=ISO-8859-1");
                sq.f fVar = new sq.f(2048);
                if (str != null) {
                    str = sq.o.f(sq.o.f(sq.o.f(str, C3978d4.j.f31381c, "&amp;"), "<", "&lt;"), ">", "&gt;");
                }
                String strV = nVarX.v();
                if (strV != null) {
                    strV = sq.o.f(sq.o.f(sq.o.f(strV, C3978d4.j.f31381c, "&amp;"), "<", "&lt;"), ">", "&gt;");
                }
                fVar.write("<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html;charset=ISO-8859-1\"/>\n");
                fVar.write("<title>Error ");
                fVar.write(Integer.toString(i10));
                fVar.k(' ');
                if (str == null) {
                    str = HttpStatus.b(i10);
                }
                fVar.write(str);
                fVar.write("</title>\n</head>\n<body>\n<h2>HTTP ERROR: ");
                fVar.write(Integer.toString(i10));
                fVar.write("</h2>\n<p>Problem accessing ");
                fVar.write(strV);
                fVar.write(". Reason:\n<pre>    ");
                fVar.write(str);
                fVar.write("</pre>");
                fVar.write("</p>\n");
                if (this.f74967a.D().G0()) {
                    fVar.write("<hr /><i><small>Powered by Jetty:// ");
                    fVar.write(p.K0());
                    fVar.write("</small></i>");
                }
                for (int i11 = 0; i11 < 20; i11++) {
                    fVar.write("\n                                                ");
                }
                fVar.write("\n</body>\n</html>\n");
                fVar.flush();
                p(fVar.h());
                fVar.m(e());
                fVar.d();
            }
        } else if (i10 != 206) {
            this.f74967a.y().I(gq.i.f62841z);
            this.f74967a.y().I(gq.i.f62821j);
            this.f74973g = null;
            this.f74971e = null;
            this.f74972f = null;
        }
        r();
    }

    @Override // an.c
    public String n(String str) {
        return s(str);
    }

    @Override // an.c
    public void o(int i10) throws IOException {
        if (i10 == -1) {
            this.f74967a.f().close();
        } else if (i10 != 102) {
            m(i10, null);
        } else {
            A();
        }
    }

    @Override // zm.t
    public void p(int i10) {
        if (b() || this.f74967a.J()) {
            return;
        }
        long j10 = i10;
        this.f74967a.f74870m.o(j10);
        if (i10 > 0) {
            this.f74967a.C().H("Content-Length", j10);
            if (this.f74967a.f74870m.k()) {
                if (this.f74976j == 2) {
                    this.f74977k.close();
                } else if (this.f74976j == 1) {
                    try {
                        e().close();
                    } catch (IOException e10) {
                        throw new RuntimeException(e10);
                    }
                }
            }
        }
    }

    public void q(gq.g gVar) {
        this.f74967a.C().f(gVar);
    }

    public void r() throws IOException {
        this.f74967a.j();
    }

    public String s(String str) {
        gq.n nVar;
        n nVarX = this.f74967a.x();
        t tVarS = nVarX.S();
        if (tVarS == null) {
            return str;
        }
        String str2 = "";
        if (tVarS.t() && sq.q.h(str)) {
            nVar = new gq.n(str);
            String strH = nVar.h();
            if (strH == null) {
                strH = "";
            }
            int iJ = nVar.j();
            if (iJ < 0) {
                iJ = "https".equalsIgnoreCase(nVar.m()) ? 443 : 80;
            }
            if (!nVarX.s().equalsIgnoreCase(nVar.g()) || nVarX.P() != iJ || !strH.startsWith(nVarX.e())) {
                return str;
            }
        } else {
            nVar = null;
        }
        String strY = tVarS.Y();
        if (strY == null) {
            return str;
        }
        if (str == null) {
            return null;
        }
        if ((tVarS.O() && nVarX.Y()) || !tVarS.M()) {
            int iIndexOf = str.indexOf(strY);
            if (iIndexOf == -1) {
                return str;
            }
            int iIndexOf2 = str.indexOf("?", iIndexOf);
            if (iIndexOf2 < 0) {
                iIndexOf2 = str.indexOf("#", iIndexOf);
            }
            if (iIndexOf2 <= iIndexOf) {
                return str.substring(0, iIndexOf);
            }
            return str.substring(0, iIndexOf) + str.substring(iIndexOf2);
        }
        an.e eVarP = nVarX.p(false);
        if (eVarP == null || !tVarS.y(eVarP)) {
            return str;
        }
        String strM = tVarS.m(eVarP);
        if (nVar == null) {
            nVar = new gq.n(str);
        }
        int iIndexOf3 = str.indexOf(strY);
        if (iIndexOf3 != -1) {
            int iIndexOf4 = str.indexOf("?", iIndexOf3);
            if (iIndexOf4 < 0) {
                iIndexOf4 = str.indexOf("#", iIndexOf3);
            }
            if (iIndexOf4 <= iIndexOf3) {
                return str.substring(0, iIndexOf3 + strY.length()) + strM;
            }
            return str.substring(0, iIndexOf3 + strY.length()) + strM + str.substring(iIndexOf4);
        }
        int iIndexOf5 = str.indexOf(63);
        if (iIndexOf5 < 0) {
            iIndexOf5 = str.indexOf(35);
        }
        if (iIndexOf5 < 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            if (("https".equalsIgnoreCase(nVar.m()) || "http".equalsIgnoreCase(nVar.m())) && nVar.h() == null) {
                str2 = "/";
            }
            sb2.append(str2);
            sb2.append(strY);
            sb2.append(strM);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str.substring(0, iIndexOf5));
        if (("https".equalsIgnoreCase(nVar.m()) || "http".equalsIgnoreCase(nVar.m())) && nVar.h() == null) {
            str2 = "/";
        }
        sb3.append(str2);
        sb3.append(strY);
        sb3.append(strM);
        sb3.append(str.substring(iIndexOf5));
        return sb3.toString();
    }

    public void t() {
        c();
        this.f74977k = null;
        this.f74976j = 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HTTP/1.1 ");
        sb2.append(this.f74968b);
        sb2.append(Z7.f30794r);
        String str = this.f74969c;
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append(System.getProperty("line.separator"));
        sb2.append(this.f74967a.C().toString());
        return sb2.toString();
    }

    public String u() {
        return this.f74969c;
    }

    public String v() {
        return this.f74973g;
    }

    public int w() {
        return this.f74968b;
    }

    public boolean x() {
        return this.f74976j == 2;
    }

    public void y() {
        this.f74968b = 200;
        this.f74969c = null;
        this.f74970d = null;
        this.f74971e = null;
        this.f74972f = null;
        this.f74973g = null;
        this.f74974h = false;
        this.f74975i = null;
        this.f74977k = null;
        this.f74976j = 0;
    }

    public void z() {
        c();
        t();
        this.f74968b = 200;
        this.f74969c = null;
        org.eclipse.jetty.http.a aVarC = this.f74967a.C();
        aVarC.h();
        String strW = this.f74967a.y().w(gq.i.f62823k);
        if (strW != null) {
            String[] strArrSplit = strW.split(StringUtils.COMMA);
            for (int i10 = 0; strArrSplit != null && i10 < strArrSplit.length; i10++) {
                e.a aVarC2 = gq.h.f62794d.c(strArrSplit[0].trim());
                if (aVarC2 != null) {
                    int iE = aVarC2.e();
                    if (iE == 1) {
                        aVarC.B(gq.i.f62823k, gq.h.f62795e);
                    } else if (iE != 5) {
                        if (iE == 8) {
                            aVarC.C(gq.i.f62823k, "TE");
                        }
                    } else if ("HTTP/1.0".equalsIgnoreCase(this.f74967a.x().getProtocol())) {
                        aVarC.C(gq.i.f62823k, "keep-alive");
                    }
                }
            }
        }
    }
}
