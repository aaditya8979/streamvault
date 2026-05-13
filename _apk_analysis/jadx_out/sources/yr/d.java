package yr;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import ur.j;
import ur.s;
import ur.z;

/* JADX INFO: compiled from: RegistryImpl.java */
/* JADX INFO: loaded from: classes11.dex */
@ApplicationScoped
public class d implements c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Logger f98056i = Logger.getLogger(c.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public br.b f98057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f98058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<kr.c> f98059c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<g> f98060d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<e<URI, sr.c>> f98061e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<Runnable> f98062f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f98063g = new i(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yr.b f98064h = new yr.b(this);

    /* JADX INFO: compiled from: RegistryImpl.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f98065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qr.i f98066c;

        public a(g gVar, qr.i iVar) {
            this.f98065b = gVar;
            this.f98066c = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f98065b.f(d.this, this.f98066c);
        }
    }

    /* JADX INFO: compiled from: RegistryImpl.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f98068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qr.i f98069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Exception f98070d;

        public b(g gVar, qr.i iVar, Exception exc) {
            this.f98068b = gVar;
            this.f98069c = iVar;
            this.f98070d = exc;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f98068b.i(d.this, this.f98069c, this.f98070d);
        }
    }

    public d(br.b bVar) {
        f98056i.fine("Creating Registry: " + getClass().getName());
        this.f98057a = bVar;
        f98056i.fine("Starting registry background maintenance...");
        h hVarG = G();
        this.f98058b = hVarG;
        if (hVarG != null) {
            I().h().execute(this.f98058b);
        }
    }

    @Override // yr.c
    public synchronized boolean A(z zVar) {
        qr.a aVarY = y(zVar, true);
        if (aVarY != null && (aVarY instanceof qr.e)) {
            return j((qr.e) aVarY);
        }
        if (aVarY == null || !(aVarY instanceof qr.i)) {
            return false;
        }
        return h((qr.i) aVarY);
    }

    @Override // yr.c
    public void B(kr.c cVar) {
        synchronized (this.f98059c) {
            this.f98059c.add(cVar);
        }
    }

    @Override // yr.c
    public synchronized void C(qr.i iVar, Exception exc) {
        Iterator<g> it = getListeners().iterator();
        while (it.hasNext()) {
            I().p().execute(new b(it.next(), iVar, exc));
        }
    }

    @Override // yr.c
    public synchronized <T extends sr.c> T D(Class<T> cls, URI uri) throws IllegalArgumentException {
        T t10 = (T) e(uri);
        if (t10 != null) {
            if (cls.isAssignableFrom(t10.getClass())) {
                return t10;
            }
        }
        return null;
    }

    public synchronized void E(sr.c cVar) {
        F(cVar, 0);
    }

    public synchronized void F(sr.c cVar, int i10) {
        e<URI, sr.c> eVar = new e<>(cVar.b(), cVar, i10);
        this.f98061e.remove(eVar);
        this.f98061e.add(eVar);
    }

    public h G() {
        return new h(this, I().a());
    }

    public synchronized void H(Runnable runnable) {
        this.f98062f.add(runnable);
    }

    public br.c I() {
        return K().getConfiguration();
    }

    public vr.a J() {
        return K().a();
    }

    public br.b K() {
        return this.f98057a;
    }

    public synchronized void L() {
        if (f98056i.isLoggable(Level.FINEST)) {
            f98056i.finest("Maintaining registry...");
        }
        Iterator<e<URI, sr.c>> it = this.f98061e.iterator();
        while (it.hasNext()) {
            e<URI, sr.c> next = it.next();
            if (next.a().d()) {
                if (f98056i.isLoggable(Level.FINER)) {
                    f98056i.finer("Removing expired resource: " + next);
                }
                it.remove();
            }
        }
        for (e<URI, sr.c> eVar : this.f98061e) {
            eVar.b().c(this.f98062f, eVar.a());
        }
        this.f98063g.l();
        this.f98064h.s();
        N(true);
    }

    public synchronized boolean M(sr.c cVar) {
        return this.f98061e.remove(new e(cVar.b()));
    }

    public synchronized void N(boolean z10) {
        if (f98056i.isLoggable(Level.FINEST)) {
            f98056i.finest("Executing pending operations: " + this.f98062f.size());
        }
        for (Runnable runnable : this.f98062f) {
            if (z10) {
                I().g().execute(runnable);
            } else {
                runnable.run();
            }
        }
        if (this.f98062f.size() > 0) {
            this.f98062f.clear();
        }
    }

    @Override // yr.c
    public synchronized kr.b a(String str) {
        return this.f98064h.g(str);
    }

    @Override // yr.c
    public synchronized ir.c b(z zVar) {
        return this.f98064h.p(zVar);
    }

    @Override // yr.c
    public synchronized Collection<qr.a> c() {
        HashSet hashSet;
        hashSet = new HashSet();
        hashSet.addAll(this.f98064h.b());
        hashSet.addAll(this.f98063g.b());
        return Collections.unmodifiableCollection(hashSet);
    }

    @Override // yr.c
    public synchronized Collection<qr.a> d(s sVar) {
        HashSet hashSet;
        hashSet = new HashSet();
        hashSet.addAll(this.f98064h.d(sVar));
        hashSet.addAll(this.f98063g.d(sVar));
        return Collections.unmodifiableCollection(hashSet);
    }

    @Override // yr.c
    public synchronized sr.c e(URI uri) throws IllegalArgumentException {
        if (uri.isAbsolute()) {
            throw new IllegalArgumentException("Resource URI can not be absolute, only path and query:" + uri);
        }
        Iterator<e<URI, sr.c>> it = this.f98061e.iterator();
        while (it.hasNext()) {
            sr.c cVarB = it.next().b();
            if (cVarB.d(uri)) {
                return cVarB;
            }
        }
        if (uri.getPath().endsWith("/")) {
            URI uriCreate = URI.create(uri.toString().substring(0, uri.toString().length() - 1));
            Iterator<e<URI, sr.c>> it2 = this.f98061e.iterator();
            while (it2.hasNext()) {
                sr.c cVarB2 = it2.next().b();
                if (cVarB2.d(uriCreate)) {
                    return cVarB2;
                }
            }
        }
        return null;
    }

    @Override // yr.c
    public synchronized boolean f(kr.b bVar) {
        return this.f98064h.j(bVar);
    }

    @Override // yr.c
    public synchronized void g(kr.c cVar) {
        this.f98063g.i(cVar);
    }

    @Override // yr.c
    public synchronized Collection<g> getListeners() {
        return Collections.unmodifiableCollection(this.f98060d);
    }

    @Override // yr.c
    public synchronized Collection<sr.c> getResources() {
        HashSet hashSet;
        hashSet = new HashSet();
        Iterator<e<URI, sr.c>> it = this.f98061e.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().b());
        }
        return hashSet;
    }

    @Override // yr.c
    public synchronized <T extends sr.c> Collection<T> getResources(Class<T> cls) {
        HashSet hashSet;
        hashSet = new HashSet();
        for (e<URI, sr.c> eVar : this.f98061e) {
            if (cls.isAssignableFrom(eVar.b().getClass())) {
                hashSet.add(eVar.b());
            }
        }
        return hashSet;
    }

    @Override // yr.c
    public synchronized boolean h(qr.i iVar) {
        return this.f98063g.m(iVar);
    }

    @Override // yr.c
    public synchronized void i(kr.b bVar) {
        this.f98064h.a(bVar);
    }

    @Override // yr.c
    public synchronized boolean j(qr.e eVar) {
        return this.f98064h.t(eVar);
    }

    @Override // yr.c
    public synchronized void k(kr.c cVar) {
        this.f98063g.j(cVar);
    }

    @Override // yr.c
    public kr.c l(String str) {
        kr.c cVarP;
        synchronized (this.f98059c) {
            cVarP = p(str);
            while (cVarP == null && !this.f98059c.isEmpty()) {
                try {
                    f98056i.finest("Subscription not found, waiting for pending subscription procedure to terminate.");
                    this.f98059c.wait();
                } catch (InterruptedException unused) {
                }
                cVarP = p(str);
            }
        }
        return cVarP;
    }

    @Override // yr.c
    public synchronized boolean m(qr.i iVar) {
        if (K().getRegistry().r(iVar.r().b(), true) == null) {
            Iterator<g> it = getListeners().iterator();
            while (it.hasNext()) {
                I().p().execute(new a(it.next(), iVar));
            }
            return true;
        }
        f98056i.finer("Not notifying listeners, already registered: " + iVar);
        return false;
    }

    @Override // yr.c
    public synchronized void n(g gVar) {
        this.f98060d.add(gVar);
    }

    @Override // yr.c
    public synchronized qr.e o(z zVar, boolean z10) {
        return this.f98064h.e(zVar, z10);
    }

    @Override // yr.c
    public synchronized kr.c p(String str) {
        return this.f98063g.g(str);
    }

    @Override // yr.c
    public synchronized boolean q(kr.b bVar) {
        return this.f98064h.i(bVar);
    }

    @Override // yr.c
    public synchronized qr.i r(z zVar, boolean z10) {
        return this.f98063g.e(zVar, z10);
    }

    @Override // yr.c
    public synchronized void s(kr.c cVar) {
        this.f98063g.a(cVar);
    }

    @Override // yr.c
    public synchronized void shutdown() {
        f98056i.fine("Shutting down registry...");
        h hVar = this.f98058b;
        if (hVar != null) {
            hVar.stop();
        }
        f98056i.finest("Executing final pending operations on shutdown: " + this.f98062f.size());
        N(false);
        Iterator<g> it = this.f98060d.iterator();
        while (it.hasNext()) {
            it.next().d(this);
        }
        Set<e<URI, sr.c>> set = this.f98061e;
        for (e eVar : (e[]) set.toArray(new e[set.size()])) {
            ((sr.c) eVar.b()).e();
        }
        this.f98063g.q();
        this.f98064h.x();
        Iterator<g> it2 = this.f98060d.iterator();
        while (it2.hasNext()) {
            it2.next().b();
        }
    }

    @Override // yr.c
    public synchronized void t(g gVar) {
        this.f98060d.remove(gVar);
    }

    @Override // yr.c
    public synchronized Collection<qr.a> u(j jVar) {
        HashSet hashSet;
        hashSet = new HashSet();
        hashSet.addAll(this.f98064h.c(jVar));
        hashSet.addAll(this.f98063g.c(jVar));
        return Collections.unmodifiableCollection(hashSet);
    }

    @Override // yr.c
    public synchronized boolean update(qr.j jVar) {
        return this.f98063g.update(jVar);
    }

    @Override // yr.c
    public synchronized Collection<qr.e> v() {
        return Collections.unmodifiableCollection(this.f98064h.b());
    }

    @Override // yr.c
    public synchronized void w(qr.e eVar) {
        this.f98064h.l(eVar);
    }

    @Override // yr.c
    public void x(kr.c cVar) {
        synchronized (this.f98059c) {
            if (this.f98059c.remove(cVar)) {
                this.f98059c.notifyAll();
            }
        }
    }

    @Override // yr.c
    public synchronized qr.a y(z zVar, boolean z10) {
        qr.e eVarE = this.f98064h.e(zVar, z10);
        if (eVarE != null) {
            return eVarE;
        }
        qr.i iVarE = this.f98063g.e(zVar, z10);
        if (iVarE != null) {
            return iVarE;
        }
        return null;
    }

    @Override // yr.c
    public synchronized void z(qr.i iVar) {
        this.f98063g.k(iVar);
    }
}
