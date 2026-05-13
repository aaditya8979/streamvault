package is;

import br.c;
import ir.h;
import java.net.BindException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import ls.f;
import ls.g;
import ls.j;
import ls.l;
import ls.m;
import org.fourthline.cling.protocol.ProtocolCreationException;
import org.fourthline.cling.transport.RouterException;
import org.fourthline.cling.transport.spi.InitializationException;
import org.fourthline.cling.transport.spi.NoNetworkException;

/* JADX INFO: compiled from: RouterImpl.java */
/* JADX INFO: loaded from: classes9.dex */
@ApplicationScoped
public class b implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Logger f71793l = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f71794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vr.a f71795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f71796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ReentrantReadWriteLock f71797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Lock f71798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Lock f71799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f71800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j f71801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map<NetworkInterface, f> f71802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map<InetAddress, ls.c> f71803j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map<InetAddress, l> f71804k;

    public b(c cVar, vr.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(true);
        this.f71797d = reentrantReadWriteLock;
        this.f71798e = reentrantReadWriteLock.readLock();
        this.f71799f = this.f71797d.writeLock();
        this.f71802i = new HashMap();
        this.f71803j = new HashMap();
        this.f71804k = new HashMap();
        f71793l.info("Creating Router: " + getClass().getName());
        this.f71794a = cVar;
        this.f71795b = aVar;
    }

    @Override // is.a
    public vr.a a() {
        return this.f71795b;
    }

    public boolean b() throws RouterException {
        j(this.f71799f);
        try {
            if (!this.f71796c) {
                return false;
            }
            f71793l.fine("Disabling network services...");
            if (this.f71801h != null) {
                f71793l.fine("Stopping stream client connection management/pool");
                this.f71801h.stop();
                this.f71801h = null;
            }
            for (Map.Entry<InetAddress, l> entry : this.f71804k.entrySet()) {
                f71793l.fine("Stopping stream server on address: " + entry.getKey());
                entry.getValue().stop();
            }
            this.f71804k.clear();
            for (Map.Entry<NetworkInterface, f> entry2 : this.f71802i.entrySet()) {
                f71793l.fine("Stopping multicast receiver on interface: " + entry2.getKey().getDisplayName());
                entry2.getValue().stop();
            }
            this.f71802i.clear();
            for (Map.Entry<InetAddress, ls.c> entry3 : this.f71803j.entrySet()) {
                f71793l.fine("Stopping datagram I/O on address: " + entry3.getKey());
                entry3.getValue().stop();
            }
            this.f71803j.clear();
            this.f71800g = null;
            this.f71796c = false;
            return true;
        } finally {
            n(this.f71799f);
        }
    }

    public int c() {
        return 6000;
    }

    public void d(InitializationException initializationException) throws InitializationException {
        if (initializationException instanceof NoNetworkException) {
            f71793l.info("Unable to initialize network router, no network found.");
            return;
        }
        f71793l.severe("Unable to initialize network router: " + initializationException);
        f71793l.severe("Cause: " + os.a.a(initializationException));
    }

    @Override // is.a
    public void e(org.fourthline.cling.model.message.a aVar) throws RouterException {
        j(this.f71798e);
        try {
            if (this.f71796c) {
                Iterator<ls.c> it = this.f71803j.values().iterator();
                while (it.hasNext()) {
                    it.next().e(aVar);
                }
            } else {
                f71793l.fine("Router disabled, not sending datagram: " + aVar);
            }
        } finally {
            n(this.f71798e);
        }
    }

    @Override // is.a
    public boolean enable() throws RouterException {
        boolean z10;
        j(this.f71799f);
        try {
            if (this.f71796c) {
                z10 = false;
            } else {
                try {
                    f71793l.fine("Starting networking services...");
                    g gVarE = getConfiguration().e();
                    this.f71800g = gVarE;
                    m(gVarE.f());
                    l(this.f71800g.a());
                    if (!this.f71800g.c()) {
                        throw new NoNetworkException("No usable network interface and/or addresses available, check the log for errors.");
                    }
                    this.f71801h = getConfiguration().c();
                    z10 = true;
                    this.f71796c = true;
                } catch (InitializationException e10) {
                    d(e10);
                    z10 = false;
                }
            }
            return z10;
        } finally {
            n(this.f71799f);
        }
    }

    @Override // is.a
    public org.fourthline.cling.model.message.c f(org.fourthline.cling.model.message.b bVar) throws RouterException {
        j(this.f71798e);
        try {
            if (!this.f71796c) {
                f71793l.fine("Router disabled, not sending stream request: " + bVar);
            } else {
                if (this.f71801h != null) {
                    f71793l.fine("Sending via TCP unicast stream: " + bVar);
                    try {
                        return this.f71801h.a(bVar);
                    } catch (InterruptedException e10) {
                        throw new RouterException("Sending stream request was interrupted", e10);
                    }
                }
                f71793l.fine("No StreamClient available, not sending: " + bVar);
            }
            return null;
        } finally {
            n(this.f71798e);
        }
    }

    @Override // is.a
    public void g(lr.b bVar) {
        if (!this.f71796c) {
            f71793l.fine("Router disabled, ignoring incoming message: " + bVar);
            return;
        }
        try {
            vr.c cVarE = a().e(bVar);
            if (cVarE == null) {
                if (f71793l.isLoggable(Level.FINEST)) {
                    f71793l.finest("No protocol, ignoring received message: " + bVar);
                    return;
                }
                return;
            }
            if (f71793l.isLoggable(Level.FINE)) {
                f71793l.fine("Received asynchronous message: " + bVar);
            }
            getConfiguration().g().execute(cVarE);
        } catch (ProtocolCreationException e10) {
            f71793l.warning("Handling received datagram failed - " + os.a.a(e10).toString());
        }
    }

    @Override // is.a
    public c getConfiguration() {
        return this.f71794a;
    }

    @Override // is.a
    public List<h> h(InetAddress inetAddress) throws RouterException {
        l lVar;
        j(this.f71798e);
        try {
            if (!this.f71796c || this.f71804k.size() <= 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (inetAddress == null || (lVar = this.f71804k.get(inetAddress)) == null) {
                for (Map.Entry<InetAddress, l> entry : this.f71804k.entrySet()) {
                    arrayList.add(new h(entry.getKey(), entry.getValue().t(), this.f71800g.h(entry.getKey())));
                }
            } else {
                arrayList.add(new h(inetAddress, lVar.t(), this.f71800g.h(inetAddress)));
            }
            return arrayList;
        } finally {
            n(this.f71798e);
        }
    }

    @Override // is.a
    public void i(m mVar) {
        if (!this.f71796c) {
            f71793l.fine("Router disabled, ignoring incoming: " + mVar);
            return;
        }
        f71793l.fine("Received synchronous stream: " + mVar);
        getConfiguration().i().execute(mVar);
    }

    public void j(Lock lock) throws RouterException {
        k(lock, c());
    }

    public void k(Lock lock, int i10) throws RouterException {
        try {
            f71793l.finest("Trying to obtain lock with timeout milliseconds '" + i10 + "': " + lock.getClass().getSimpleName());
            if (lock.tryLock(i10, TimeUnit.MILLISECONDS)) {
                f71793l.finest("Acquired router lock: " + lock.getClass().getSimpleName());
                return;
            }
            throw new RouterException("Router wasn't available exclusively after waiting " + i10 + "ms, lock failed: " + lock.getClass().getSimpleName());
        } catch (InterruptedException e10) {
            throw new RouterException("Interruption while waiting for exclusive access: " + lock.getClass().getSimpleName(), e10);
        }
    }

    public void l(Iterator<InetAddress> it) throws InitializationException {
        while (it.hasNext()) {
            InetAddress next = it.next();
            l lVarO = getConfiguration().o(this.f71800g);
            if (lVarO == null) {
                f71793l.info("Configuration did not create a StreamServer for: " + next);
            } else {
                try {
                    if (f71793l.isLoggable(Level.FINE)) {
                        f71793l.fine("Init stream server on address: " + next);
                    }
                    lVarO.F(next, this);
                    this.f71804k.put(next, lVarO);
                } catch (InitializationException e10) {
                    Throwable thA = os.a.a(e10);
                    if (!(thA instanceof BindException)) {
                        throw e10;
                    }
                    f71793l.warning("Failed to init StreamServer: " + thA);
                    Logger logger = f71793l;
                    Level level = Level.FINE;
                    if (logger.isLoggable(level)) {
                        f71793l.log(level, "Initialization exception root cause", thA);
                    }
                    f71793l.warning("Removing unusable address: " + next);
                    it.remove();
                }
            }
            ls.c cVarX = getConfiguration().x(this.f71800g);
            if (cVarX == null) {
                f71793l.info("Configuration did not create a StreamServer for: " + next);
            } else {
                try {
                    if (f71793l.isLoggable(Level.FINE)) {
                        f71793l.fine("Init datagram I/O on address: " + next);
                    }
                    cVarX.o(next, this, getConfiguration().n());
                    this.f71803j.put(next, cVarX);
                } catch (InitializationException e11) {
                    throw e11;
                }
            }
        }
        for (Map.Entry<InetAddress, l> entry : this.f71804k.entrySet()) {
            if (f71793l.isLoggable(Level.FINE)) {
                f71793l.fine("Starting stream server on address: " + entry.getKey());
            }
            getConfiguration().u().execute(entry.getValue());
        }
        for (Map.Entry<InetAddress, ls.c> entry2 : this.f71803j.entrySet()) {
            if (f71793l.isLoggable(Level.FINE)) {
                f71793l.fine("Starting datagram I/O on address: " + entry2.getKey());
            }
            getConfiguration().s().execute(entry2.getValue());
        }
    }

    public void m(Iterator<NetworkInterface> it) throws InitializationException {
        while (it.hasNext()) {
            NetworkInterface next = it.next();
            f fVarB = getConfiguration().b(this.f71800g);
            if (fVarB == null) {
                f71793l.info("Configuration did not create a MulticastReceiver for: " + next);
            } else {
                try {
                    if (f71793l.isLoggable(Level.FINE)) {
                        f71793l.fine("Init multicast receiver on interface: " + next.getDisplayName());
                    }
                    fVarB.f0(next, this, this.f71800g, getConfiguration().n());
                    this.f71802i.put(next, fVarB);
                } catch (InitializationException e10) {
                    throw e10;
                }
            }
        }
        for (Map.Entry<NetworkInterface, f> entry : this.f71802i.entrySet()) {
            if (f71793l.isLoggable(Level.FINE)) {
                f71793l.fine("Starting multicast receiver on interface: " + entry.getKey().getDisplayName());
            }
            getConfiguration().m().execute(entry.getValue());
        }
    }

    public void n(Lock lock) {
        f71793l.finest("Releasing router lock: " + lock.getClass().getSimpleName());
        lock.unlock();
    }

    @Override // is.a
    public void shutdown() throws RouterException {
        b();
    }
}
