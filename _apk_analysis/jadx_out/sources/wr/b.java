package wr;

import ir.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import nr.j;
import nr.k;
import nr.l;
import nr.n;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.transport.RouterException;
import pr.c0;
import pr.m;
import pr.t;
import pr.v;
import ur.s;
import ur.z;

/* JADX INFO: compiled from: ReceivingSearch.java */
/* JADX INFO: loaded from: classes2.dex */
public class b extends vr.c<nr.b> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f86685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f86686g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Random f86687e;

    static {
        Logger logger = Logger.getLogger(b.class.getName());
        f86685f = logger;
        f86686g = logger.isLoggable(Level.FINE);
    }

    public b(br.b bVar, lr.b<UpnpRequest> bVar2) {
        super(bVar, new nr.b(bVar2));
        this.f86687e = new Random();
    }

    @Override // vr.c
    public void a() throws RouterException {
        if (c().c() == null) {
            f86685f.fine("Router hasn't completed initialization, ignoring received search message");
            return;
        }
        if (!b().z()) {
            f86685f.fine("Invalid search request, no or invalid MAN ssdp:discover header: " + b());
            return;
        }
        UpnpHeader upnpHeaderY = b().y();
        if (upnpHeaderY == null) {
            f86685f.fine("Invalid search request, did not contain ST header: " + b());
            return;
        }
        List<h> listH = c().c().h(b().u());
        if (listH.size() == 0) {
            f86685f.fine("Aborting search response, no active stream servers found (network disabled?)");
            return;
        }
        Iterator<h> it = listH.iterator();
        while (it.hasNext()) {
            k(upnpHeaderY, it.next());
        }
    }

    @Override // vr.c
    public boolean d() throws InterruptedException {
        Integer numX = b().x();
        if (numX == null) {
            f86685f.fine("Invalid search request, did not contain MX header: " + b());
            return false;
        }
        if (numX.intValue() > 120 || numX.intValue() <= 0) {
            numX = m.f77542c;
        }
        if (c().getRegistry().v().size() <= 0) {
            return true;
        }
        int iNextInt = this.f86687e.nextInt(numX.intValue() * 1000);
        f86685f.fine("Sleeping " + iNextInt + " milliseconds to avoid flooding with search responses");
        Thread.sleep((long) iNextInt);
        return true;
    }

    public List<j> f(qr.e eVar, h hVar) {
        ArrayList arrayList = new ArrayList();
        if (eVar.A()) {
            arrayList.add(new l(b(), h(hVar, eVar), eVar));
        }
        arrayList.add(new n(b(), h(hVar, eVar), eVar));
        arrayList.add(new k(b(), h(hVar, eVar), eVar));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j((j) it.next());
        }
        return arrayList;
    }

    public List<j> g(qr.e eVar, h hVar) {
        ArrayList arrayList = new ArrayList();
        for (s sVar : eVar.k()) {
            nr.m mVar = new nr.m(b(), h(hVar, eVar), eVar, sVar);
            j(mVar);
            arrayList.add(mVar);
        }
        return arrayList;
    }

    public ir.e h(h hVar, qr.e eVar) {
        return new ir.e(hVar, c().getConfiguration().getNamespace().f(eVar));
    }

    public boolean i(qr.e eVar) {
        ir.c cVarB = c().getRegistry().b(eVar.r().b());
        return (cVarB == null || cVarB.a()) ? false : true;
    }

    public void j(j jVar) {
    }

    public void k(UpnpHeader upnpHeader, h hVar) throws RouterException {
        if (upnpHeader instanceof t) {
            l(hVar);
            return;
        }
        if (upnpHeader instanceof pr.s) {
            n(hVar);
            return;
        }
        if (upnpHeader instanceof c0) {
            q((z) upnpHeader.b(), hVar);
            return;
        }
        if (upnpHeader instanceof pr.e) {
            m((ur.j) upnpHeader.b(), hVar);
            return;
        }
        if (upnpHeader instanceof v) {
            p((s) upnpHeader.b(), hVar);
            return;
        }
        f86685f.warning("Non-implemented search request target: " + upnpHeader.getClass());
    }

    public void l(h hVar) throws RouterException {
        if (f86686g) {
            f86685f.fine("Responding to 'all' search with advertisement messages for all local devices");
        }
        for (qr.e eVar : c().getRegistry().v()) {
            if (!i(eVar)) {
                if (f86686g) {
                    f86685f.finer("Sending root device messages: " + eVar);
                }
                Iterator<j> it = f(eVar, hVar).iterator();
                while (it.hasNext()) {
                    c().c().e(it.next());
                }
                if (eVar.w()) {
                    for (qr.e eVar2 : eVar.i()) {
                        if (f86686g) {
                            f86685f.finer("Sending embedded device messages: " + eVar2);
                        }
                        Iterator<j> it2 = f(eVar2, hVar).iterator();
                        while (it2.hasNext()) {
                            c().c().e(it2.next());
                        }
                    }
                }
                List<j> listG = g(eVar, hVar);
                if (listG.size() > 0) {
                    if (f86686g) {
                        f86685f.finer("Sending service type messages");
                    }
                    Iterator<j> it3 = listG.iterator();
                    while (it3.hasNext()) {
                        c().c().e(it3.next());
                    }
                }
            }
        }
    }

    public void m(ur.j jVar, h hVar) throws RouterException {
        f86685f.fine("Responding to device type search: " + jVar);
        for (qr.a aVar : c().getRegistry().u(jVar)) {
            if (aVar instanceof qr.e) {
                qr.e eVar = (qr.e) aVar;
                if (!i(eVar)) {
                    f86685f.finer("Sending matching device type search result for: " + aVar);
                    k kVar = new k(b(), h(hVar, eVar), eVar);
                    j(kVar);
                    c().c().e(kVar);
                }
            }
        }
    }

    public void n(h hVar) throws RouterException {
        f86685f.fine("Responding to root device search with advertisement messages for all local root devices");
        for (qr.e eVar : c().getRegistry().v()) {
            if (!i(eVar)) {
                l lVar = new l(b(), h(hVar, eVar), eVar);
                j(lVar);
                c().c().e(lVar);
            }
        }
    }

    public void p(s sVar, h hVar) throws RouterException {
        f86685f.fine("Responding to service type search: " + sVar);
        for (qr.a aVar : c().getRegistry().d(sVar)) {
            if (aVar instanceof qr.e) {
                qr.e eVar = (qr.e) aVar;
                if (!i(eVar)) {
                    f86685f.finer("Sending matching service type search result: " + aVar);
                    nr.m mVar = new nr.m(b(), h(hVar, eVar), eVar, sVar);
                    j(mVar);
                    c().c().e(mVar);
                }
            }
        }
    }

    public void q(z zVar, h hVar) throws RouterException {
        qr.a aVarY = c().getRegistry().y(zVar, false);
        if (aVarY == null || !(aVarY instanceof qr.e)) {
            return;
        }
        qr.e eVar = (qr.e) aVarY;
        if (i(eVar)) {
            return;
        }
        f86685f.fine("Responding to UDN device search: " + zVar);
        n nVar = new n(b(), h(hVar, eVar), eVar);
        j(nVar);
        c().c().e(nVar);
    }
}
