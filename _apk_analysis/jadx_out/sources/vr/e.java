package vr;

import ir.k;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.binding.xml.DescriptorBindingException;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.registry.RegistrationException;
import org.fourthline.cling.transport.RouterException;
import qr.i;
import qr.j;
import ur.s;
import ur.z;

/* JADX INFO: compiled from: RetrieveRemoteDescriptors.java */
/* JADX INFO: loaded from: classes2.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f86156e = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set<URL> f86157f = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final br.b f86158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f86159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<z> f86160d = new ArrayList();

    public e(br.b bVar, i iVar) {
        this.f86158b = bVar;
        this.f86159c = iVar;
    }

    public void a() throws RouterException {
        if (g().c() == null) {
            f86156e.warning("Router not yet initialized");
            return;
        }
        try {
            org.fourthline.cling.model.message.b bVar = new org.fourthline.cling.model.message.b(UpnpRequest.Method.GET, this.f86159c.r().d());
            lr.c cVarF = g().getConfiguration().f(this.f86159c.r());
            if (cVarF != null) {
                bVar.j().putAll(cVarF);
            }
            Logger logger = f86156e;
            logger.fine("Sending device descriptor retrieval message: " + bVar);
            org.fourthline.cling.model.message.c cVarF2 = g().c().f(bVar);
            if (cVarF2 == null) {
                logger.warning("Device descriptor retrieval failed, no response: " + this.f86159c.r().d());
                return;
            }
            if (cVarF2.k().f()) {
                logger.warning("Device descriptor retrieval failed: " + this.f86159c.r().d() + ", " + cVarF2.k().c());
                return;
            }
            if (!cVarF2.q()) {
                logger.fine("Received device descriptor without or with invalid Content-Type: " + this.f86159c.r().d());
            }
            String strD = cVarF2.d();
            if (strD == null || strD.length() == 0) {
                logger.warning("Received empty device descriptor:" + this.f86159c.r().d());
                return;
            }
            logger.fine("Received root device descriptor: " + cVarF2);
            b(strD);
        } catch (IllegalArgumentException e10) {
            f86156e.warning("Device descriptor retrieval failed: " + this.f86159c.r().d() + ", possibly invalid URL: " + e10);
        }
    }

    public void b(String str) throws RouterException {
        RegistrationException e10;
        i iVar;
        DescriptorBindingException e11;
        i iVar2 = null;
        try {
            iVar = (i) g().getConfiguration().k().b(this.f86159c, str);
            try {
                Logger logger = f86156e;
                logger.fine("Remote device described (without services) notifying listeners: " + iVar);
                boolean zM = g().getRegistry().m(iVar);
                logger.fine("Hydrating described device's services: " + iVar);
                i iVarD = d(iVar);
                if (iVarD != null) {
                    logger.fine("Adding fully hydrated remote device to registry: " + iVarD);
                    g().getRegistry().z(iVarD);
                    return;
                }
                if (!this.f86160d.contains(this.f86159c.r().b())) {
                    this.f86160d.add(this.f86159c.r().b());
                    logger.warning("Device service description failed: " + this.f86159c);
                }
                if (zM) {
                    g().getRegistry().C(iVar, new DescriptorBindingException("Device service description failed: " + this.f86159c));
                }
            } catch (DescriptorBindingException e12) {
                e11 = e12;
                Logger logger2 = f86156e;
                logger2.warning("Could not hydrate device or its services from descriptor: " + this.f86159c);
                logger2.warning("Cause was: " + os.a.a(e11));
                if (iVar == null || 0 == 0) {
                    return;
                }
                g().getRegistry().C(iVar, e11);
            } catch (ValidationException e13) {
                e = e13;
                iVar2 = iVar;
                if (this.f86160d.contains(this.f86159c.r().b())) {
                    return;
                }
                this.f86160d.add(this.f86159c.r().b());
                f86156e.warning("Could not validate device model: " + this.f86159c);
                Iterator<k> it = e.getErrors().iterator();
                while (it.hasNext()) {
                    f86156e.warning(it.next().toString());
                }
                if (iVar2 == null || 0 == 0) {
                    return;
                }
                g().getRegistry().C(iVar2, e);
            } catch (RegistrationException e14) {
                e10 = e14;
                Logger logger3 = f86156e;
                logger3.warning("Adding hydrated device to registry failed: " + this.f86159c);
                logger3.warning("Cause was: " + e10.toString());
                if (iVar == null || 0 == 0) {
                    return;
                }
                g().getRegistry().C(iVar, e10);
            }
        } catch (DescriptorBindingException e15) {
            e11 = e15;
            iVar = null;
        } catch (ValidationException e16) {
            e = e16;
        } catch (RegistrationException e17) {
            e10 = e17;
            iVar = null;
        }
    }

    public qr.k c(qr.k kVar) throws RouterException, ValidationException, DescriptorBindingException {
        try {
            URL urlO = kVar.d().O(kVar.o());
            org.fourthline.cling.model.message.b bVar = new org.fourthline.cling.model.message.b(UpnpRequest.Method.GET, urlO);
            lr.c cVarF = g().getConfiguration().f(kVar.d().r());
            if (cVarF != null) {
                bVar.j().putAll(cVarF);
            }
            Logger logger = f86156e;
            logger.fine("Sending service descriptor retrieval message: " + bVar);
            org.fourthline.cling.model.message.c cVarF2 = g().c().f(bVar);
            if (cVarF2 == null) {
                logger.warning("Could not retrieve service descriptor, no response: " + kVar);
                return null;
            }
            if (cVarF2.k().f()) {
                logger.warning("Service descriptor retrieval failed: " + urlO + ", " + cVarF2.k().c());
                return null;
            }
            if (!cVarF2.q()) {
                logger.fine("Received service descriptor without or with invalid Content-Type: " + urlO);
            }
            String strD = cVarF2.d();
            if (strD == null || strD.length() == 0) {
                logger.warning("Received empty service descriptor:" + urlO);
                return null;
            }
            logger.fine("Received service descriptor, hydrating service model: " + cVarF2);
            return (qr.k) g().getConfiguration().d().a(kVar, strD);
        } catch (IllegalArgumentException unused) {
            f86156e.warning("Could not normalize service descriptor URL: " + kVar.o());
            return null;
        }
    }

    public i d(i iVar) throws RouterException, ValidationException, DescriptorBindingException {
        i iVarD;
        ArrayList arrayList = new ArrayList();
        if (iVar.y()) {
            for (qr.k kVar : f(iVar.u())) {
                qr.k kVarC = c(kVar);
                if (kVarC != null) {
                    arrayList.add(kVarC);
                } else {
                    f86156e.warning("Skipping invalid service '" + kVar + "' of: " + iVar);
                }
            }
        }
        List<i> arrayList2 = new ArrayList<>();
        if (iVar.w()) {
            for (i iVar2 : iVar.p()) {
                if (iVar2 != null && (iVarD = d(iVar2)) != null) {
                    arrayList2.add(iVarD);
                }
            }
        }
        qr.d[] dVarArr = new qr.d[iVar.q().length];
        for (int i10 = 0; i10 < iVar.q().length; i10++) {
            dVarArr[i10] = iVar.q()[i10].a();
        }
        return iVar.B(((j) iVar.r()).b(), iVar.v(), iVar.getType(), iVar.m(), dVarArr, iVar.Q(arrayList), arrayList2);
    }

    public List<qr.k> f(qr.k[] kVarArr) {
        s[] sVarArrQ = g().getConfiguration().q();
        if (sVarArrQ == null || sVarArrQ.length == 0) {
            return Arrays.asList(kVarArr);
        }
        ArrayList arrayList = new ArrayList();
        for (qr.k kVar : kVarArr) {
            for (s sVar : sVarArrQ) {
                if (kVar.g().c(sVar)) {
                    f86156e.fine("Including exclusive service: " + kVar);
                    arrayList.add(kVar);
                } else {
                    f86156e.fine("Excluding unwanted service: " + sVar);
                }
            }
        }
        return arrayList;
    }

    public br.b g() {
        return this.f86158b;
    }

    @Override // java.lang.Runnable
    public void run() {
        URL urlD = this.f86159c.r().d();
        Set<URL> set = f86157f;
        if (set.contains(urlD)) {
            f86156e.finer("Exiting early, active retrieval for URL already in progress: " + urlD);
            return;
        }
        if (g().getRegistry().r(this.f86159c.r().b(), true) != null) {
            f86156e.finer("Exiting early, already discovered: " + urlD);
            return;
        }
        try {
            try {
                set.add(urlD);
                a();
            } catch (RouterException e10) {
                f86156e.log(Level.WARNING, "Descriptor retrieval failed: " + urlD, (Throwable) e10);
                set = f86157f;
            }
            set.remove(urlD);
        } catch (Throwable th2) {
            f86157f.remove(urlD);
            throw th2;
        }
    }
}
