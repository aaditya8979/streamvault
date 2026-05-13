package yr;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.logging.Logger;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.registry.RegistrationException;
import ur.z;

/* JADX INFO: compiled from: LocalItems.java */
/* JADX INFO: loaded from: classes3.dex */
public class b extends f<qr.e, kr.b> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Logger f98042g = Logger.getLogger(yr.c.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<z, ir.c> f98043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f98044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Random f98045f;

    /* JADX INFO: compiled from: LocalItems.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f98046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qr.e f98047c;

        public a(g gVar, qr.e eVar) {
            this.f98046b = gVar;
            this.f98047c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f98046b.c(b.this.f98075a, this.f98047c);
        }
    }

    /* JADX INFO: renamed from: yr.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LocalItems.java */
    public class RunnableC1113b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f98049b;

        public RunnableC1113b(e eVar) {
            this.f98049b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((kr.b) this.f98049b.b()).L(CancelReason.DEVICE_WAS_REMOVED);
        }
    }

    /* JADX INFO: compiled from: LocalItems.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f98051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qr.e f98052c;

        public c(g gVar, qr.e eVar) {
            this.f98051b = gVar;
            this.f98052c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f98051b.g(b.this.f98075a, this.f98052c);
        }
    }

    /* JADX INFO: compiled from: LocalItems.java */
    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qr.e f98054b;

        public d(qr.e eVar) {
            this.f98054b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b.f98042g.finer("Sleeping some milliseconds to avoid flooding the network with ALIVE msgs");
                Thread.sleep(b.this.f98045f.nextInt(100));
            } catch (InterruptedException e10) {
                b.f98042g.severe("Background execution interrupted: " + e10.getMessage());
            }
            b.this.f98075a.J().g(this.f98054b).run();
        }
    }

    public b(yr.d dVar) {
        super(dVar);
        this.f98043d = new HashMap();
        this.f98044e = 0L;
        this.f98045f = new Random();
    }

    @Override // yr.f
    public Collection<qr.e> b() {
        HashSet hashSet = new HashSet();
        Iterator<e<z, qr.e>> it = f().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().b());
        }
        return Collections.unmodifiableCollection(hashSet);
    }

    public void l(qr.e eVar) throws RegistrationException {
        m(eVar, null);
    }

    public void m(qr.e eVar, ir.c cVar) throws RegistrationException {
        w(eVar.r().b(), cVar);
        if (this.f98075a.y(eVar.r().b(), false) != null) {
            f98042g.fine("Ignoring addition, device already registered: " + eVar);
            return;
        }
        f98042g.fine("Adding local device to registry: " + eVar);
        for (sr.c cVar2 : getResources(eVar)) {
            if (this.f98075a.e(cVar2.b()) != null) {
                throw new RegistrationException("URI namespace conflict with already registered resource: " + cVar2);
            }
            this.f98075a.E(cVar2);
            f98042g.fine("Registered resource: " + cVar2);
        }
        f98042g.fine("Adding item to registry with expiration in seconds: " + eVar.r().a());
        e<z, qr.e> eVar2 = new e<>(eVar.r().b(), eVar, eVar.r().a().intValue());
        f().add(eVar2);
        f98042g.fine("Registered local device: " + eVar2);
        if (r(eVar2.c())) {
            o(eVar, true);
        }
        if (q(eVar2.c())) {
            n(eVar);
        }
        Iterator<g> it = this.f98075a.getListeners().iterator();
        while (it.hasNext()) {
            this.f98075a.I().p().execute(new a(it.next(), eVar));
        }
    }

    public void n(qr.e eVar) {
        this.f98075a.H(new d(eVar));
    }

    public void o(qr.e eVar, boolean z10) {
        wr.f fVarH = this.f98075a.J().h(eVar);
        if (z10) {
            this.f98075a.H(fVarH);
        } else {
            fVarH.run();
        }
    }

    public ir.c p(z zVar) {
        return this.f98043d.get(zVar);
    }

    public boolean q(z zVar) {
        return p(zVar) == null || p(zVar).a();
    }

    public boolean r(z zVar) {
        return p(zVar) != null && p(zVar).b();
    }

    public void s() {
        if (f().isEmpty()) {
            return;
        }
        HashSet<e> hashSet = new HashSet();
        int iL = this.f98075a.I().l();
        if (iL > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f98044e > iL) {
                this.f98044e = jCurrentTimeMillis;
                for (e<z, qr.e> eVar : f()) {
                    if (q(eVar.c())) {
                        f98042g.finer("Flooding advertisement of local item: " + eVar);
                        hashSet.add(eVar);
                    }
                }
            }
        } else {
            this.f98044e = 0L;
            for (e<z, qr.e> eVar2 : f()) {
                if (q(eVar2.c()) && eVar2.a().e(true)) {
                    f98042g.finer("Local item has expired: " + eVar2);
                    hashSet.add(eVar2);
                }
            }
        }
        for (e eVar3 : hashSet) {
            f98042g.fine("Refreshing local device advertisement: " + eVar3.b());
            n((qr.e) eVar3.b());
            eVar3.a().g();
        }
        HashSet<e> hashSet2 = new HashSet();
        for (e<String, kr.b> eVar4 : h()) {
            if (eVar4.a().e(false)) {
                hashSet2.add(eVar4);
            }
        }
        for (e eVar5 : hashSet2) {
            f98042g.fine("Removing expired: " + eVar5);
            i((kr.a) eVar5.b());
            ((kr.b) eVar5.b()).L(CancelReason.EXPIRED);
        }
    }

    public boolean t(qr.e eVar) throws RegistrationException {
        return u(eVar, false);
    }

    public boolean u(qr.e eVar, boolean z10) throws RegistrationException {
        qr.e eVarE = e(eVar.r().b(), true);
        if (eVarE == null) {
            return false;
        }
        f98042g.fine("Removing local device from registry: " + eVar);
        w(eVar.r().b(), null);
        f().remove(new e(eVar.r().b()));
        for (sr.c cVar : getResources(eVar)) {
            if (this.f98075a.M(cVar)) {
                f98042g.fine("Unregistered resource: " + cVar);
            }
        }
        Iterator<e<String, kr.b>> it = h().iterator();
        while (it.hasNext()) {
            e<String, kr.b> next = it.next();
            if (next.b().H().d().r().b().equals(eVarE.r().b())) {
                f98042g.fine("Removing incoming subscription: " + next.c());
                it.remove();
                if (!z10) {
                    this.f98075a.I().p().execute(new RunnableC1113b(next));
                }
            }
        }
        if (q(eVar.r().b())) {
            o(eVar, !z10);
        }
        if (!z10) {
            Iterator<g> it2 = this.f98075a.getListeners().iterator();
            while (it2.hasNext()) {
                this.f98075a.I().p().execute(new c(it2.next(), eVar));
            }
        }
        return true;
    }

    public void v(boolean z10) {
        for (qr.e eVar : (qr.e[]) b().toArray(new qr.e[b().size()])) {
            u(eVar, z10);
        }
    }

    public void w(z zVar, ir.c cVar) {
        if (cVar != null) {
            this.f98043d.put(zVar, cVar);
        } else {
            this.f98043d.remove(zVar);
        }
    }

    public void x() {
        f98042g.fine("Clearing all registered subscriptions to local devices during shutdown");
        h().clear();
        f98042g.fine("Removing all local devices from registry during shutdown");
        v(true);
    }
}
