package zm;

import java.io.IOException;

/* JADX INFO: compiled from: ServletRequestWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public class s implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f98339a;

    public s(p pVar) {
        if (pVar == null) {
            throw new IllegalArgumentException("Request cannot be null");
        }
        this.f98339a = pVar;
    }

    @Override // zm.p
    public void a(String str, Object obj) {
        this.f98339a.a(str, obj);
    }

    @Override // zm.p
    public m b() throws IOException {
        return this.f98339a.b();
    }

    @Override // zm.p
    public boolean c() {
        return this.f98339a.c();
    }

    @Override // zm.p
    public h d(String str) {
        return this.f98339a.d(str);
    }

    @Override // zm.p
    public String f() {
        return this.f98339a.f();
    }

    @Override // zm.p
    public boolean g() {
        return this.f98339a.g();
    }

    @Override // zm.p
    public Object getAttribute(String str) {
        return this.f98339a.getAttribute(str);
    }

    @Override // zm.p
    public String getContentType() {
        return this.f98339a.getContentType();
    }

    @Override // zm.p
    public String getParameter(String str) {
        return this.f98339a.getParameter(str);
    }

    @Override // zm.p
    public String getProtocol() {
        return this.f98339a.getProtocol();
    }

    @Override // zm.p
    public k getServletContext() {
        return this.f98339a.getServletContext();
    }

    @Override // zm.p
    public a h() {
        return this.f98339a.h();
    }

    @Override // zm.p
    public a q() throws IllegalStateException {
        return this.f98339a.q();
    }

    @Override // zm.p
    public String s() {
        return this.f98339a.s();
    }

    public p w() {
        return this.f98339a;
    }
}
