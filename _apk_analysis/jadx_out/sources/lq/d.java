package lq;

import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Locale;
import javax.servlet.ServletException;
import kq.a;
import kq.g;
import kq.l;
import mq.d;
import mq.n;
import mq.v;
import org.eclipse.jetty.security.ServerAuthException;
import org.eclipse.jetty.security.authentication.SessionAuthentication;
import org.eclipse.jetty.util.MultiMap;
import org.eclipse.jetty.util.security.Constraint;
import sq.o;
import sq.q;
import zm.h;
import zm.p;
import zm.t;

/* JADX INFO: compiled from: FormAuthenticator.java */
/* JADX INFO: loaded from: classes10.dex */
public class d extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final vq.c f73905j = vq.b.a(d.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f73906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f73907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f73908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f73909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f73910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f73911i;

    /* JADX INFO: compiled from: FormAuthenticator.java */
    public static class a extends l implements d.g {
        public a(String str, v vVar) {
            super(str, vVar);
        }

        @Override // kq.l
        public String toString() {
            return "Form" + super.toString();
        }
    }

    /* JADX INFO: compiled from: FormAuthenticator.java */
    public static class b extends an.b {
        public b(an.a aVar) {
            super(aVar);
        }

        @Override // an.b, an.a
        public Enumeration k() {
            return Collections.enumeration(Collections.list(super.k()));
        }

        @Override // an.b, an.a
        public String m(String str) {
            if (str.toLowerCase(Locale.ENGLISH).startsWith("if-")) {
                return null;
            }
            return super.m(str);
        }

        @Override // an.b, an.a
        public Enumeration o(String str) {
            return str.toLowerCase(Locale.ENGLISH).startsWith("if-") ? Collections.enumeration(Collections.EMPTY_LIST) : super.o(str);
        }

        @Override // an.b, an.a
        public long u(String str) {
            if (str.toLowerCase(Locale.ENGLISH).startsWith("if-")) {
                return -1L;
            }
            return super.u(str);
        }
    }

    /* JADX INFO: compiled from: FormAuthenticator.java */
    public static class c extends an.d {
        public c(an.c cVar) {
            super(cVar);
        }

        @Override // an.d, an.c
        public void a(String str, String str2) {
            if (s(str)) {
                super.a(str, str2);
            }
        }

        @Override // an.d, an.c
        public void d(String str, long j10) {
            if (s(str)) {
                super.d(str, j10);
            }
        }

        @Override // an.d, an.c
        public void j(String str, String str2) {
            if (s(str)) {
                super.j(str, str2);
            }
        }

        public final boolean s(String str) {
            return ("Cache-Control".equalsIgnoreCase(str) || "Pragma".equalsIgnoreCase(str) || Command.HTTP_HEADER_ETAG.equalsIgnoreCase(str) || "Expires".equalsIgnoreCase(str) || "Last-Modified".equalsIgnoreCase(str) || "Age".equalsIgnoreCase(str)) ? false : true;
        }
    }

    @Override // kq.a
    public mq.d a(p pVar, t tVar, boolean z10) throws ServerAuthException {
        g gVar;
        String strE;
        an.a aVar = (an.a) pVar;
        an.c cVar = (an.c) tVar;
        String strV = aVar.v();
        if (strV == null) {
            strV = "/";
        }
        if (!z10 && !g(strV)) {
            return new lq.c(this);
        }
        if (h(q.a(aVar.t(), aVar.l())) && !lq.c.c(cVar)) {
            return new lq.c(this);
        }
        an.e eVarP = aVar.p(true);
        try {
            if (g(strV)) {
                String parameter = aVar.getParameter("j_username");
                v vVarE = e(parameter, aVar.getParameter("j_password"), aVar);
                an.e eVarP2 = aVar.p(true);
                if (vVarE != null) {
                    synchronized (eVarP2) {
                        strE = (String) eVarP2.getAttribute("org.eclipse.jetty.security.form_URI");
                        if (strE == null || strE.length() == 0) {
                            strE = aVar.e();
                            if (strE.length() == 0) {
                                strE = "/";
                            }
                        }
                    }
                    cVar.p(0);
                    cVar.g(cVar.n(strE));
                    return new a(getAuthMethod(), vVarE);
                }
                vq.c cVar2 = f73905j;
                if (cVar2.isDebugEnabled()) {
                    cVar2.h("Form authentication FAILED for " + o.e(parameter), new Object[0]);
                }
                String str = this.f73906d;
                if (str == null) {
                    if (cVar != null) {
                        cVar.o(403);
                    }
                } else if (this.f73910h) {
                    h hVarD = aVar.d(str);
                    cVar.j("Cache-Control", "No-cache");
                    cVar.d("Expires", 1L);
                    hVarD.a(new b(aVar), new c(cVar));
                } else {
                    cVar.g(cVar.n(q.a(aVar.e(), this.f73906d)));
                }
                return mq.d.L8;
            }
            mq.d dVar = (mq.d) eVarP.getAttribute(SessionAuthentication.__J_AUTHENTICATED);
            if (dVar != null) {
                if (!(dVar instanceof d.h) || (gVar = this.f73912a) == null || gVar.a(((d.h) dVar).getUserIdentity())) {
                    String str2 = (String) eVarP.getAttribute("org.eclipse.jetty.security.form_URI");
                    if (str2 != null) {
                        MultiMap<String> multiMap = (MultiMap) eVarP.getAttribute("org.eclipse.jetty.security.form_POST");
                        if (multiMap != null) {
                            StringBuffer stringBufferR = aVar.r();
                            if (aVar.i() != null) {
                                stringBufferR.append("?");
                                stringBufferR.append(aVar.i());
                            }
                            if (str2.equals(stringBufferR.toString())) {
                                eVarP.removeAttribute("org.eclipse.jetty.security.form_POST");
                                n nVarX = pVar instanceof n ? (n) pVar : mq.b.o().x();
                                nVarX.n0("POST");
                                nVarX.o0(multiMap);
                            }
                        } else {
                            eVarP.removeAttribute("org.eclipse.jetty.security.form_URI");
                        }
                    }
                    return dVar;
                }
                eVarP.removeAttribute(SessionAuthentication.__J_AUTHENTICATED);
            }
            if (lq.c.c(cVar)) {
                f73905j.h("auth deferred {}", eVarP.getId());
                return mq.d.I8;
            }
            synchronized (eVarP) {
                if (eVarP.getAttribute("org.eclipse.jetty.security.form_URI") == null || this.f73911i) {
                    StringBuffer stringBufferR2 = aVar.r();
                    if (aVar.i() != null) {
                        stringBufferR2.append("?");
                        stringBufferR2.append(aVar.i());
                    }
                    eVarP.a("org.eclipse.jetty.security.form_URI", stringBufferR2.toString());
                    if (ShareTarget.ENCODING_TYPE_URL_ENCODED.equalsIgnoreCase(pVar.getContentType()) && "POST".equals(aVar.getMethod())) {
                        n nVarX2 = pVar instanceof n ? (n) pVar : mq.b.o().x();
                        nVarX2.x();
                        eVarP.a("org.eclipse.jetty.security.form_POST", new MultiMap((MultiMap) nVarX2.I()));
                    }
                }
            }
            if (this.f73910h) {
                h hVarD2 = aVar.d(this.f73908f);
                cVar.j("Cache-Control", "No-cache");
                cVar.d("Expires", 1L);
                hVarD2.a(new b(aVar), new c(cVar));
            } else {
                cVar.g(cVar.n(q.a(aVar.e(), this.f73908f)));
            }
            return mq.d.K8;
        } catch (IOException e10) {
            throw new ServerAuthException(e10);
        } catch (ServletException e11) {
            throw new ServerAuthException(e11);
        }
    }

    @Override // lq.e, kq.a
    public void b(a.InterfaceC0866a interfaceC0866a) {
        super.b(interfaceC0866a);
        String initParameter = interfaceC0866a.getInitParameter("org.eclipse.jetty.security.form_login_page");
        if (initParameter != null) {
            j(initParameter);
        }
        String initParameter2 = interfaceC0866a.getInitParameter("org.eclipse.jetty.security.form_error_page");
        if (initParameter2 != null) {
            i(initParameter2);
        }
        String initParameter3 = interfaceC0866a.getInitParameter("org.eclipse.jetty.security.dispatch");
        this.f73910h = initParameter3 == null ? this.f73910h : Boolean.valueOf(initParameter3).booleanValue();
    }

    @Override // kq.a
    public boolean c(p pVar, t tVar, boolean z10, d.h hVar) throws ServerAuthException {
        return true;
    }

    @Override // lq.e
    public v e(String str, Object obj, p pVar) {
        v vVarE = super.e(str, obj, pVar);
        if (vVarE != null) {
            ((an.a) pVar).p(true).a(SessionAuthentication.__J_AUTHENTICATED, new SessionAuthentication(getAuthMethod(), vVarE, obj));
        }
        return vVarE;
    }

    public boolean g(String str) {
        int iIndexOf = str.indexOf("/j_security_check");
        if (iIndexOf < 0) {
            return false;
        }
        int i10 = iIndexOf + 17;
        if (i10 == str.length()) {
            return true;
        }
        char cCharAt = str.charAt(i10);
        return cCharAt == ';' || cCharAt == '#' || cCharAt == '/' || cCharAt == '?';
    }

    @Override // kq.a
    public String getAuthMethod() {
        return Constraint.__FORM_AUTH;
    }

    public boolean h(String str) {
        return str != null && (str.equals(this.f73907e) || str.equals(this.f73909g));
    }

    public final void i(String str) {
        if (str == null || str.trim().length() == 0) {
            this.f73907e = null;
            this.f73906d = null;
            return;
        }
        if (!str.startsWith("/")) {
            f73905j.f("form-error-page must start with /", new Object[0]);
            str = "/" + str;
        }
        this.f73906d = str;
        this.f73907e = str;
        if (str.indexOf(63) > 0) {
            String str2 = this.f73907e;
            this.f73907e = str2.substring(0, str2.indexOf(63));
        }
    }

    public final void j(String str) {
        if (!str.startsWith("/")) {
            f73905j.f("form-login-page must start with /", new Object[0]);
            str = "/" + str;
        }
        this.f73908f = str;
        this.f73909g = str;
        if (str.indexOf(63) > 0) {
            String str2 = this.f73909g;
            this.f73909g = str2.substring(0, str2.indexOf(63));
        }
    }
}
