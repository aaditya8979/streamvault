package an;

import java.util.Enumeration;
import javax.servlet.http.Cookie;
import zm.s;

/* JADX INFO: compiled from: HttpServletRequestWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public class b extends s implements a {
    public b(a aVar) {
        super(aVar);
    }

    @Override // an.a
    public String e() {
        return x().e();
    }

    @Override // an.a
    public String getMethod() {
        return x().getMethod();
    }

    @Override // an.a
    public String i() {
        return x().i();
    }

    @Override // an.a
    public Cookie[] j() {
        return x().j();
    }

    @Override // an.a
    public Enumeration<String> k() {
        return x().k();
    }

    @Override // an.a
    public String l() {
        return x().l();
    }

    @Override // an.a
    public String m(String str) {
        return x().m(str);
    }

    @Override // an.a
    public String n() {
        return x().n();
    }

    @Override // an.a
    public Enumeration<String> o(String str) {
        return x().o(str);
    }

    @Override // an.a
    public e p(boolean z10) {
        return x().p(z10);
    }

    @Override // an.a
    public StringBuffer r() {
        return x().r();
    }

    @Override // an.a
    public String t() {
        return x().t();
    }

    @Override // an.a
    public long u(String str) {
        return x().u(str);
    }

    @Override // an.a
    public String v() {
        return x().v();
    }

    public final a x() {
        return (a) super.w();
    }
}
