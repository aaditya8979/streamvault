package kq;

import mq.d;
import mq.p;
import org.eclipse.jetty.security.ServerAuthException;
import zm.t;

/* JADX INFO: compiled from: Authenticator.java */
/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: kq.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Authenticator.java */
    public interface InterfaceC0866a {
        g S();

        f e();

        String getAuthMethod();

        String getInitParameter(String str);

        boolean z();
    }

    /* JADX INFO: compiled from: Authenticator.java */
    public interface b {
        a a(p pVar, zm.k kVar, InterfaceC0866a interfaceC0866a, f fVar, g gVar);
    }

    mq.d a(zm.p pVar, t tVar, boolean z10) throws ServerAuthException;

    void b(InterfaceC0866a interfaceC0866a);

    boolean c(zm.p pVar, t tVar, boolean z10, d.h hVar) throws ServerAuthException;

    String getAuthMethod();
}
