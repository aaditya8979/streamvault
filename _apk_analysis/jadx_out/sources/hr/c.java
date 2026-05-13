package hr;

import java.util.concurrent.Future;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import org.fourthline.cling.model.message.header.UpnpHeader;
import pr.m;
import pr.t;

/* JADX INFO: compiled from: ControlPointImpl.java */
/* JADX INFO: loaded from: classes12.dex */
@ApplicationScoped
public class c implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Logger f63611d = Logger.getLogger(c.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public br.c f63612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vr.a f63613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public yr.c f63614c;

    public c() {
    }

    public c(br.c cVar, vr.a aVar, yr.c cVar2) {
        f63611d.fine("Creating ControlPoint: " + getClass().getName());
        this.f63612a = cVar;
        this.f63613b = aVar;
        this.f63614c = cVar2;
    }

    @Override // hr.b
    public vr.a a() {
        return this.f63613b;
    }

    @Override // hr.b
    public void b(d dVar) {
        f63611d.fine("Invoking subscription in background: " + dVar);
        dVar.n(this);
        f().i().execute(dVar);
    }

    @Override // hr.b
    public void c() {
        g(new t(), m.f77542c.intValue());
    }

    @Override // hr.b
    public void d(UpnpHeader upnpHeader) {
        g(upnpHeader, m.f77542c.intValue());
    }

    @Override // hr.b
    public Future e(a aVar) {
        f63611d.fine("Invoking action in background: " + aVar);
        aVar.g(this);
        return f().i().submit(aVar);
    }

    public br.c f() {
        return this.f63612a;
    }

    public void g(UpnpHeader upnpHeader, int i10) {
        f63611d.fine("Sending asynchronous search for: " + upnpHeader.a());
        f().g().execute(a().f(upnpHeader, i10));
    }

    @Override // hr.b
    public yr.c getRegistry() {
        return this.f63614c;
    }
}
