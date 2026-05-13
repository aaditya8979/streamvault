package kq;

import kq.a;
import mq.p;
import org.eclipse.jetty.security.authentication.DigestAuthenticator;
import org.eclipse.jetty.util.security.Constraint;

/* JADX INFO: compiled from: DefaultAuthenticatorFactory.java */
/* JADX INFO: loaded from: classes11.dex */
public class d implements a.b {
    @Override // kq.a.b
    public a a(p pVar, zm.k kVar, a.InterfaceC0866a interfaceC0866a, f fVar, g gVar) {
        String authMethod = interfaceC0866a.getAuthMethod();
        return (Constraint.__CERT_AUTH.equalsIgnoreCase(authMethod) || Constraint.__CERT_AUTH2.equalsIgnoreCase(authMethod)) ? new lq.b() : (authMethod == null || Constraint.__BASIC_AUTH.equalsIgnoreCase(authMethod)) ? new lq.a() : Constraint.__DIGEST_AUTH.equalsIgnoreCase(authMethod) ? new DigestAuthenticator() : Constraint.__FORM_AUTH.equalsIgnoreCase(authMethod) ? new lq.d() : Constraint.__SPNEGO_AUTH.equalsIgnoreCase(authMethod) ? new lq.f() : Constraint.__NEGOTIATE_AUTH.equalsIgnoreCase(authMethod) ? new lq.f(Constraint.__NEGOTIATE_AUTH) : null;
    }
}
