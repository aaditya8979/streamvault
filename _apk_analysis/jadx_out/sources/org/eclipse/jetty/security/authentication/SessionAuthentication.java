package org.eclipse.jetty.security.authentication;

import an.e;
import an.f;
import an.h;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import kq.g;
import kq.k;
import mq.d;
import mq.v;
import vq.b;
import vq.c;

/* JADX INFO: loaded from: classes4.dex */
public class SessionAuthentication implements d.h, Serializable, f, h {
    public static final String __J_AUTHENTICATED = "org.eclipse.jetty.security.UserIdentity";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f76748d = b.a(SessionAuthentication.class);
    private static final long serialVersionUID = -4643200685888258706L;
    private final Object _credentials;
    private final String _method;
    private final String _name;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient v f76749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient e f76750c;

    public SessionAuthentication(String str, v vVar, Object obj) {
        this._method = str;
        this.f76749b = vVar;
        this._name = vVar.a().getName();
        this._credentials = obj;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        k kVarI0 = k.I0();
        if (kVarI0 == null) {
            throw new IllegalStateException("!SecurityHandler");
        }
        g gVarS = kVarI0.S();
        if (gVarS == null) {
            throw new IllegalStateException("!LoginService");
        }
        this.f76749b = gVarS.d(this._name, this._credentials);
        f76748d.h("Deserialized and relogged in {}", this);
    }

    @Override // mq.d.h
    public String getAuthMethod() {
        return this._method;
    }

    @Override // mq.d.h
    public v getUserIdentity() {
        return this.f76749b;
    }

    public boolean isUserInRole(v.a aVar, String str) {
        return this.f76749b.b(str, aVar);
    }

    public void logout() {
        e eVar = this.f76750c;
        if (eVar != null && eVar.getAttribute(__J_AUTHENTICATED) != null) {
            this.f76750c.removeAttribute(__J_AUTHENTICATED);
        }
        t();
    }

    @Override // an.f
    public void sessionDidActivate(HttpSessionEvent httpSessionEvent) {
        if (this.f76750c == null) {
            this.f76750c = httpSessionEvent.getSession();
        }
    }

    @Override // an.f
    public void sessionWillPassivate(HttpSessionEvent httpSessionEvent) {
    }

    public final void t() {
        k kVarI0 = k.I0();
        if (kVarI0 != null) {
            kVarI0.L0(this);
        }
        e eVar = this.f76750c;
        if (eVar != null) {
            eVar.removeAttribute("org.eclipse.jetty.security.sessionKnownOnlytoAuthenticated");
        }
    }

    public String toString() {
        return "Session" + super.toString();
    }

    @Override // an.h
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        if (this.f76750c == null) {
            this.f76750c = httpSessionBindingEvent.getSession();
        }
    }

    @Override // an.h
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        t();
    }
}
