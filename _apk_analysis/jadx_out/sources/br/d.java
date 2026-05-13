package br;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import org.fourthline.cling.transport.RouterException;
import yr.g;

/* JADX INFO: compiled from: UpnpServiceImpl.java */
/* JADX INFO: loaded from: classes5.dex */
@Alternative
public class d implements b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Logger f5920f = Logger.getLogger(d.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f5921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hr.b f5922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vr.a f5923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yr.c f5924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final is.a f5925e;

    /* JADX INFO: compiled from: UpnpServiceImpl.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.f5920f.info(">>> Shutting down UPnP service...");
            d.this.k();
            d.this.l();
            d.this.j();
            d.f5920f.info("<<< UPnP service shutdown completed");
        }
    }

    public d() {
        this(new br.a(), new g[0]);
    }

    public d(c cVar, g... gVarArr) {
        this.f5921a = cVar;
        f5920f.info(">>> Starting UPnP service...");
        f5920f.info("Using configuration: " + getConfiguration().getClass().getName());
        vr.a aVarF = f();
        this.f5923c = aVarF;
        this.f5924d = g(aVarF);
        for (g gVar : gVarArr) {
            this.f5924d.n(gVar);
        }
        is.a aVarH = h(this.f5923c, this.f5924d);
        this.f5925e = aVarH;
        try {
            aVarH.enable();
            this.f5922b = e(this.f5923c, this.f5924d);
            f5920f.info("<<< UPnP service started successfully");
        } catch (RouterException e10) {
            throw new RuntimeException("Enabling network router failed: " + e10, e10);
        }
    }

    @Override // br.b
    public vr.a a() {
        return this.f5923c;
    }

    @Override // br.b
    public hr.b b() {
        return this.f5922b;
    }

    @Override // br.b
    public is.a c() {
        return this.f5925e;
    }

    public hr.b e(vr.a aVar, yr.c cVar) {
        return new hr.c(getConfiguration(), aVar, cVar);
    }

    public vr.a f() {
        return new vr.b(this);
    }

    public yr.c g(vr.a aVar) {
        return new yr.d(this);
    }

    @Override // br.b
    public c getConfiguration() {
        return this.f5921a;
    }

    @Override // br.b
    public yr.c getRegistry() {
        return this.f5924d;
    }

    public is.a h(vr.a aVar, yr.c cVar) {
        return new is.b(getConfiguration(), aVar);
    }

    public void i(boolean z10) {
        a aVar = new a();
        if (z10) {
            new Thread(aVar).start();
        } else {
            aVar.run();
        }
    }

    public void j() {
        getConfiguration().shutdown();
    }

    public void k() {
        getRegistry().shutdown();
    }

    public void l() {
        try {
            c().shutdown();
        } catch (RouterException e10) {
            Throwable thA = os.a.a(e10);
            if (thA instanceof InterruptedException) {
                f5920f.log(Level.INFO, "Router shutdown was interrupted: " + e10, thA);
                return;
            }
            f5920f.log(Level.SEVERE, "Router error on shutdown: " + e10, thA);
        }
    }

    @Override // br.b
    public synchronized void shutdown() {
        i(false);
    }
}
