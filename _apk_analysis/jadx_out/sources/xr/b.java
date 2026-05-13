package xr;

import java.util.logging.Logger;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: ReceivingEvent.java */
/* JADX INFO: loaded from: classes10.dex */
public class b extends vr.d<org.fourthline.cling.model.message.b, or.f> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f87098h = Logger.getLogger(b.class.getName());

    /* JADX INFO: compiled from: ReceivingEvent.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kr.c f87099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UnsupportedDataException f87100c;

        public a(kr.c cVar, UnsupportedDataException unsupportedDataException) {
            this.f87099b = cVar;
            this.f87100c = unsupportedDataException;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f87099b.T(this.f87100c);
        }
    }

    /* JADX INFO: renamed from: xr.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ReceivingEvent.java */
    public class RunnableC1102b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kr.c f87102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ or.a f87103c;

        public RunnableC1102b(kr.c cVar, or.a aVar) {
            this.f87102b = cVar;
            this.f87103c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.f87098h.fine("Calling active subscription with event state variable values");
            this.f87102b.U(this.f87103c.y(), this.f87103c.A());
        }
    }

    public b(br.b bVar, org.fourthline.cling.model.message.b bVar2) {
        super(bVar, bVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vr.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public or.f f() throws RouterException {
        if (!((org.fourthline.cling.model.message.b) b()).q()) {
            f87098h.warning("Received without or with invalid Content-Type: " + b());
        }
        sr.f fVar = (sr.f) c().getRegistry().D(sr.f.class, ((org.fourthline.cling.model.message.b) b()).v());
        if (fVar == null) {
            f87098h.fine("No local resource found: " + b());
            return new or.f(new UpnpResponse(UpnpResponse.Status.NOT_FOUND));
        }
        or.a aVar = new or.a((org.fourthline.cling.model.message.b) b(), fVar.a());
        if (aVar.B() == null) {
            f87098h.fine("Subscription ID missing in event request: " + b());
            return new or.f(new UpnpResponse(UpnpResponse.Status.PRECONDITION_FAILED));
        }
        if (!aVar.C()) {
            f87098h.fine("Missing NT and/or NTS headers in event request: " + b());
            return new or.f(new UpnpResponse(UpnpResponse.Status.BAD_REQUEST));
        }
        if (!aVar.C()) {
            f87098h.fine("Invalid NT and/or NTS headers in event request: " + b());
            return new or.f(new UpnpResponse(UpnpResponse.Status.PRECONDITION_FAILED));
        }
        if (aVar.y() == null) {
            f87098h.fine("Sequence missing in event request: " + b());
            return new or.f(new UpnpResponse(UpnpResponse.Status.PRECONDITION_FAILED));
        }
        try {
            c().getConfiguration().r().a(aVar);
            kr.c cVarL = c().getRegistry().l(aVar.B());
            if (cVarL != null) {
                c().getConfiguration().p().execute(new RunnableC1102b(cVarL, aVar));
                return new or.f();
            }
            f87098h.severe("Invalid subscription ID, no active subscription: " + aVar);
            return new or.f(new UpnpResponse(UpnpResponse.Status.PRECONDITION_FAILED));
        } catch (UnsupportedDataException e10) {
            f87098h.fine("Can't read event message request body, " + e10);
            kr.c cVarP = c().getRegistry().p(aVar.B());
            if (cVarP != null) {
                c().getConfiguration().p().execute(new a(cVarP, e10));
            }
            return new or.f(new UpnpResponse(UpnpResponse.Status.INTERNAL_SERVER_ERROR));
        }
    }
}
