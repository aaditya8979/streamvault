package hr;

import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.protocol.ProtocolCreationException;
import qr.f;
import qr.k;
import qr.l;

/* JADX INFO: compiled from: SubscriptionCallback.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class d implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Logger f63615f = Logger.getLogger(d.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f63616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f63617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hr.b f63618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kr.a f63619e;

    /* JADX INFO: compiled from: SubscriptionCallback.java */
    public class a extends kr.b {
        public a(f fVar, Integer num, List list) {
            super(fVar, num, list);
        }

        @Override // kr.b
        public void M(CancelReason cancelReason) {
            synchronized (d.this) {
                d.this.p(null);
                d.this.b(this, cancelReason, null);
            }
        }

        @Override // kr.a
        public void e() {
            synchronized (d.this) {
                d.this.p(this);
                d.this.f(this);
            }
        }

        @Override // kr.a
        public void g() {
            synchronized (d.this) {
                d.f63615f.fine("Local service state updated, notifying callback, sequence is: " + t());
                d.this.g(this);
                P();
            }
        }
    }

    /* JADX INFO: compiled from: SubscriptionCallback.java */
    public class b extends kr.c {
        public b(k kVar, int i10) {
            super(kVar, i10);
        }

        @Override // kr.c
        public void M(CancelReason cancelReason, UpnpResponse upnpResponse) {
            synchronized (d.this) {
                d.this.p(null);
                d.this.b(this, cancelReason, upnpResponse);
            }
        }

        @Override // kr.c
        public void O(int i10) {
            synchronized (d.this) {
                d.this.h(this, i10);
            }
        }

        @Override // kr.c
        public void Q(UpnpResponse upnpResponse) {
            synchronized (d.this) {
                d.this.p(null);
                d.this.i(this, upnpResponse, null);
            }
        }

        @Override // kr.c
        public void T(UnsupportedDataException unsupportedDataException) {
            synchronized (d.this) {
                d.this.m(this, unsupportedDataException);
            }
        }

        @Override // kr.a
        public void e() {
            synchronized (d.this) {
                d.this.p(this);
                d.this.f(this);
            }
        }

        @Override // kr.a
        public void g() {
            synchronized (d.this) {
                d.this.g(this);
            }
        }
    }

    public d(l lVar, int i10) {
        this.f63616b = lVar;
        this.f63617c = Integer.valueOf(i10);
    }

    public static String a(UpnpResponse upnpResponse, Exception exc) {
        if (upnpResponse != null) {
            return "Subscription failed:  HTTP response was: " + upnpResponse.c();
        }
        if (exc == null) {
            return "Subscription failed:  No response received.";
        }
        return "Subscription failed:  Exception occured: " + exc;
    }

    public abstract void b(kr.a aVar, CancelReason cancelReason, UpnpResponse upnpResponse);

    public final void c(f fVar) {
        kr.b aVar;
        if (k().getRegistry().o(fVar.d().r().b(), false) == null) {
            f63615f.fine("Local device service is currently not registered, failing subscription immediately");
            i(null, null, new IllegalStateException("Local device is not registered"));
            return;
        }
        try {
            aVar = new a(fVar, Integer.MAX_VALUE, Collections.EMPTY_LIST);
        } catch (Exception e10) {
            e = e10;
            aVar = null;
        }
        try {
            f63615f.fine("Local device service is currently registered, also registering subscription");
            k().getRegistry().i(aVar);
            f63615f.fine("Notifying subscription callback of local subscription availablity");
            aVar.N();
            f63615f.fine("Simulating first initial event for local subscription callback, sequence: " + aVar.t());
            g(aVar);
            aVar.P();
            f63615f.fine("Starting to monitor state changes of local service");
            aVar.R();
        } catch (Exception e11) {
            e = e11;
            f63615f.fine("Local callback creation failed: " + e.toString());
            f63615f.log(Level.FINE, "Exception root cause: ", os.a.a(e));
            if (aVar != null) {
                k().getRegistry().q(aVar);
            }
            i(aVar, null, e);
        }
    }

    public final void d(k kVar) {
        try {
            k().a().c(new b(kVar, this.f63617c.intValue())).run();
        } catch (ProtocolCreationException e10) {
            i(this.f63619e, null, e10);
        }
    }

    public abstract void f(kr.a aVar);

    public abstract void g(kr.a aVar);

    public abstract void h(kr.a aVar, int i10);

    public void i(kr.a aVar, UpnpResponse upnpResponse, Exception exc) {
        j(aVar, upnpResponse, exc, a(upnpResponse, exc));
    }

    public abstract void j(kr.a aVar, UpnpResponse upnpResponse, Exception exc, String str);

    public synchronized hr.b k() {
        return this.f63618d;
    }

    public l l() {
        return this.f63616b;
    }

    public void m(kr.c cVar, UnsupportedDataException unsupportedDataException) {
        f63615f.info("Invalid event message received, causing: " + unsupportedDataException);
        if (f63615f.isLoggable(Level.FINE)) {
            f63615f.fine("------------------------------------------------------------------------------");
            f63615f.fine(unsupportedDataException.getData() != null ? unsupportedDataException.getData().toString() : "null");
            f63615f.fine("------------------------------------------------------------------------------");
        }
    }

    public synchronized void n(hr.b bVar) {
        this.f63618d = bVar;
    }

    public synchronized void p(kr.a aVar) {
        this.f63619e = aVar;
    }

    @Override // java.lang.Runnable
    public synchronized void run() {
        if (k() == null) {
            throw new IllegalStateException("Callback must be executed through ControlPoint");
        }
        if (l() instanceof f) {
            c((f) this.f63616b);
        } else if (l() instanceof k) {
            d((k) this.f63616b);
        }
    }

    public String toString() {
        return "(SubscriptionCallback) " + l();
    }
}
