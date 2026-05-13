package lq;

import java.io.IOException;
import kq.l;
import mq.d;
import mq.v;
import org.eclipse.jetty.security.ServerAuthException;
import org.eclipse.jetty.util.security.Constraint;
import zm.p;
import zm.t;

/* JADX INFO: compiled from: BasicAuthenticator.java */
/* JADX INFO: loaded from: classes11.dex */
public class a extends e {
    @Override // kq.a
    public mq.d a(p pVar, t tVar, boolean z10) throws ServerAuthException {
        int iIndexOf;
        String strA;
        int iIndexOf2;
        v vVarE;
        an.a aVar = (an.a) pVar;
        an.c cVar = (an.c) tVar;
        String strM = aVar.m("Authorization");
        try {
            if (!z10) {
                return new c(this);
            }
            if (strM != null && (iIndexOf = strM.indexOf(32)) > 0 && "basic".equalsIgnoreCase(strM.substring(0, iIndexOf)) && (iIndexOf2 = (strA = sq.d.a(strM.substring(iIndexOf + 1), "ISO-8859-1")).indexOf(58)) > 0 && (vVarE = e(strA.substring(0, iIndexOf2), strA.substring(iIndexOf2 + 1), aVar)) != null) {
                return new l(getAuthMethod(), vVarE);
            }
            if (c.c(cVar)) {
                return mq.d.I8;
            }
            cVar.j("WWW-Authenticate", "basic realm=\"" + this.f73912a.getName() + '\"');
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
        return Constraint.__BASIC_AUTH;
    }
}
