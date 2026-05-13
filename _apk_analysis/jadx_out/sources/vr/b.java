package vr;

import java.net.URI;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.InvalidValueException;
import org.fourthline.cling.model.types.NotificationSubtype;
import org.fourthline.cling.protocol.ProtocolCreationException;
import org.fourthline.cling.transport.RouterException;
import ur.p;
import ur.s;
import xr.h;
import xr.i;
import xr.j;

/* JADX INFO: compiled from: ProtocolFactoryImpl.java */
/* JADX INFO: loaded from: classes9.dex */
@ApplicationScoped
public class b implements vr.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f86147b = Logger.getLogger(vr.a.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final br.b f86148a;

    /* JADX INFO: compiled from: ProtocolFactoryImpl.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86149a;

        static {
            int[] iArr = new int[UpnpRequest.Method.values().length];
            f86149a = iArr;
            try {
                iArr[UpnpRequest.Method.NOTIFY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f86149a[UpnpRequest.Method.MSEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(br.b bVar) {
        f86147b.fine("Creating ProtocolFactory: " + getClass().getName());
        this.f86148a = bVar;
    }

    @Override // vr.a
    public xr.g a(kr.b bVar) {
        return new xr.g(s(), bVar);
    }

    @Override // vr.a
    public j b(kr.c cVar) {
        return new j(s(), cVar);
    }

    @Override // vr.a
    public i c(kr.c cVar) throws ProtocolCreationException {
        try {
            return new i(s(), cVar, s().c().h(cVar.H().d().r().e()));
        } catch (RouterException e10) {
            throw new ProtocolCreationException("Failed to obtain local stream servers (for event callback URL creation) from router", e10);
        }
    }

    @Override // vr.a
    public xr.f d(jr.d dVar, URL url) {
        return new xr.f(s(), dVar, url);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vr.a
    public c e(lr.b bVar) throws ProtocolCreationException {
        Logger logger = f86147b;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("Creating protocol for incoming asynchronous: " + bVar);
        }
        if (bVar.k() instanceof UpnpRequest) {
            int i10 = a.f86149a[((UpnpRequest) bVar.k()).d().ordinal()];
            if (i10 == 1) {
                if (t(bVar) || u(bVar)) {
                    return m(bVar);
                }
                return null;
            }
            if (i10 == 2) {
                return o(bVar);
            }
        } else if (bVar.k() instanceof UpnpResponse) {
            if (u(bVar)) {
                return p(bVar);
            }
            return null;
        }
        throw new ProtocolCreationException("Protocol for incoming datagram message not found: " + bVar);
    }

    @Override // vr.a
    public wr.g f(UpnpHeader upnpHeader, int i10) {
        return new wr.g(s(), upnpHeader, i10);
    }

    @Override // vr.a
    public wr.e g(qr.e eVar) {
        return new wr.e(s(), eVar);
    }

    @Override // vr.a
    public wr.f h(qr.e eVar) {
        return new wr.f(s(), eVar);
    }

    @Override // vr.a
    public h i(kr.c cVar) {
        return new h(s(), cVar);
    }

    @Override // vr.a
    public d j(org.fourthline.cling.model.message.b bVar) throws ProtocolCreationException {
        Logger logger = f86147b;
        logger.fine("Creating protocol for incoming synchronous: " + bVar);
        if (bVar.k().d().equals(UpnpRequest.Method.GET)) {
            return n(bVar);
        }
        if (s().getConfiguration().getNamespace().m(bVar.v())) {
            if (bVar.k().d().equals(UpnpRequest.Method.POST)) {
                return k(bVar);
            }
        } else if (s().getConfiguration().getNamespace().o(bVar.v())) {
            if (bVar.k().d().equals(UpnpRequest.Method.SUBSCRIBE)) {
                return q(bVar);
            }
            if (bVar.k().d().equals(UpnpRequest.Method.UNSUBSCRIBE)) {
                return r(bVar);
            }
        } else if (s().getConfiguration().getNamespace().n(bVar.v())) {
            if (bVar.k().d().equals(UpnpRequest.Method.NOTIFY)) {
                return l(bVar);
            }
        } else if (bVar.v().getPath().contains("/event/cb")) {
            logger.warning("Fixing trailing garbage in event message path: " + bVar.v().getPath());
            String string = bVar.v().toString();
            bVar.x(URI.create(string.substring(0, string.indexOf("/cb") + 3)));
            if (s().getConfiguration().getNamespace().n(bVar.v()) && bVar.k().d().equals(UpnpRequest.Method.NOTIFY)) {
                return l(bVar);
            }
        }
        throw new ProtocolCreationException("Protocol for message type not found: " + bVar);
    }

    public xr.a k(org.fourthline.cling.model.message.b bVar) {
        return new xr.a(s(), bVar);
    }

    public xr.b l(org.fourthline.cling.model.message.b bVar) {
        return new xr.b(s(), bVar);
    }

    public c m(lr.b<UpnpRequest> bVar) {
        return new wr.a(s(), bVar);
    }

    public xr.c n(org.fourthline.cling.model.message.b bVar) {
        return new xr.c(s(), bVar);
    }

    public c o(lr.b<UpnpRequest> bVar) {
        return new wr.b(s(), bVar);
    }

    public c p(lr.b<UpnpResponse> bVar) {
        return new wr.c(s(), bVar);
    }

    public xr.d q(org.fourthline.cling.model.message.b bVar) {
        return new xr.d(s(), bVar);
    }

    public xr.e r(org.fourthline.cling.model.message.b bVar) {
        return new xr.e(s(), bVar);
    }

    public br.b s() {
        return this.f86148a;
    }

    public boolean t(lr.b bVar) {
        String strF = bVar.j().f(UpnpHeader.Type.NTS.getHttpName());
        return strF != null && strF.equals(NotificationSubtype.BYEBYE.getHeaderString());
    }

    public boolean u(lr.b bVar) {
        s[] sVarArrQ = s().getConfiguration().q();
        if (sVarArrQ == null) {
            return false;
        }
        if (sVarArrQ.length == 0) {
            return true;
        }
        String strF = bVar.j().f(UpnpHeader.Type.USN.getHttpName());
        if (strF == null) {
            return false;
        }
        try {
            p pVarC = p.c(strF);
            for (s sVar : sVarArrQ) {
                if (pVarC.a().c(sVar)) {
                    return true;
                }
            }
        } catch (InvalidValueException unused) {
            f86147b.finest("Not a named service type header value: " + strF);
        }
        f86147b.fine("Service advertisement not supported, dropping it: " + strF);
        return false;
    }
}
