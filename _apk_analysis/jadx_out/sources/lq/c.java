package lq;

import java.io.IOException;
import java.io.PrintWriter;
import mq.d;
import org.eclipse.jetty.security.ServerAuthException;
import sq.j;
import zm.n;
import zm.p;

/* JADX INFO: compiled from: DeferredAuthentication.java */
/* JADX INFO: loaded from: classes11.dex */
public class c implements d.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final vq.c f73900d = vq.b.a(c.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final an.c f73901e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static n f73902f = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f73903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f73904c;

    /* JADX INFO: compiled from: DeferredAuthentication.java */
    public static class a implements an.c {
        @Override // an.c
        public void a(String str, String str2) {
        }

        @Override // zm.t
        public boolean b() {
            return true;
        }

        @Override // zm.t
        public void c() {
        }

        @Override // an.c
        public void d(String str, long j10) {
        }

        @Override // zm.t
        public n e() throws IOException {
            return c.f73902f;
        }

        @Override // zm.t
        public String f() {
            return null;
        }

        @Override // an.c
        public void g(String str) throws IOException {
        }

        @Override // zm.t
        public PrintWriter h() throws IOException {
            return j.g();
        }

        @Override // an.c
        public boolean i(String str) {
            return false;
        }

        @Override // an.c
        public void j(String str, String str2) {
        }

        @Override // an.c
        public void k(int i10) {
        }

        @Override // zm.t
        public void l(String str) {
        }

        @Override // an.c
        public void m(int i10, String str) throws IOException {
        }

        @Override // an.c
        public String n(String str) {
            return null;
        }

        @Override // an.c
        public void o(int i10) throws IOException {
        }

        @Override // zm.t
        public void p(int i10) {
        }
    }

    /* JADX INFO: compiled from: DeferredAuthentication.java */
    public static class b extends n {
        @Override // zm.n
        public void b(String str) throws IOException {
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
        }
    }

    public c(e eVar) {
        if (eVar == null) {
            throw new NullPointerException("No Authenticator");
        }
        this.f73903b = eVar;
    }

    public static boolean c(an.c cVar) {
        return cVar == f73901e;
    }

    public Object b() {
        return this.f73904c;
    }

    @Override // mq.d.f
    public mq.d e(p pVar) {
        try {
            mq.d dVarA = this.f73903b.a(pVar, f73901e, true);
            if (dVarA != null && (dVarA instanceof d.h) && !(dVarA instanceof d.g)) {
                kq.f fVarE = this.f73903b.d().e();
                if (fVarE != null) {
                    this.f73904c = fVarE.b(((d.h) dVarA).getUserIdentity());
                }
                return dVarA;
            }
        } catch (ServerAuthException e10) {
            f73900d.b(e10);
        }
        return this;
    }
}
