package lq;

import java.io.IOException;
import kq.l;
import mq.d;
import mq.v;
import org.eclipse.jetty.security.ServerAuthException;
import org.eclipse.jetty.util.security.Constraint;
import zm.p;
import zm.t;

/* JADX INFO: compiled from: SpnegoAuthenticator.java */
/* JADX INFO: loaded from: classes11.dex */
public class f extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final vq.c f73915e = vq.b.a(f.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f73916d;

    public f() {
        this.f73916d = Constraint.__SPNEGO_AUTH;
    }

    public f(String str) {
        this.f73916d = str;
    }

    @Override // kq.a
    public mq.d a(p pVar, t tVar, boolean z10) throws ServerAuthException {
        v vVarE;
        an.c cVar = (an.c) tVar;
        String strM = ((an.a) pVar).m("Authorization");
        if (!z10) {
            return new c(this);
        }
        if (strM != null) {
            return (!strM.startsWith("Negotiate") || (vVarE = e(null, strM.substring(10), pVar)) == null) ? mq.d.I8 : new l(getAuthMethod(), vVarE);
        }
        try {
            if (c.c(cVar)) {
                return mq.d.I8;
            }
            f73915e.h("SpengoAuthenticator: sending challenge", new Object[0]);
            cVar.j("WWW-Authenticate", "Negotiate");
            cVar.o(401);
            return mq.d.K8;
        } catch (IOException e10) {
            throw new ServerAuthException(e10);
        }
    }

    @Override // kq.a
    public boolean c(p pVar, t tVar, boolean z10, d.h hVar) throws ServerAuthException {
        return true;
    }

    @Override // kq.a
    public String getAuthMethod() {
        return this.f73916d;
    }
}
