package xr;

import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.binding.xml.DescriptorBindingException;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.transport.RouterException;
import pr.u;

/* JADX INFO: compiled from: ReceivingRetrieval.java */
/* JADX INFO: loaded from: classes3.dex */
public class c extends vr.d<org.fourthline.cling.model.message.b, org.fourthline.cling.model.message.c> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f87105h = Logger.getLogger(c.class.getName());

    public c(br.b bVar, org.fourthline.cling.model.message.b bVar2) {
        super(bVar, bVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vr.d
    public org.fourthline.cling.model.message.c f() throws RouterException {
        if (!((org.fourthline.cling.model.message.b) b()).o()) {
            f87105h.fine("Ignoring message, missing HOST header: " + b());
            return new org.fourthline.cling.model.message.c(new UpnpResponse(UpnpResponse.Status.PRECONDITION_FAILED));
        }
        URI uriE = ((org.fourthline.cling.model.message.b) b()).k().e();
        sr.c cVarE = c().getRegistry().e(uriE);
        if (cVarE != null || (cVarE = l(uriE)) != null) {
            return k(uriE, cVarE);
        }
        f87105h.fine("No local resource found: " + b());
        return null;
    }

    public org.fourthline.cling.model.message.c k(URI uri, sr.c cVar) {
        org.fourthline.cling.model.message.c cVar2;
        try {
            if (sr.a.class.isAssignableFrom(cVar.getClass())) {
                f87105h.fine("Found local device matching relative request URI: " + uri);
                cVar2 = new org.fourthline.cling.model.message.c(c().getConfiguration().k().a((qr.e) cVar.a(), h(), c().getConfiguration().getNamespace()), new pr.d(pr.d.f77535c));
            } else if (sr.e.class.isAssignableFrom(cVar.getClass())) {
                f87105h.fine("Found local service matching relative request URI: " + uri);
                cVar2 = new org.fourthline.cling.model.message.c(c().getConfiguration().d().b((qr.f) cVar.a()), new pr.d(pr.d.f77535c));
            } else {
                if (!sr.b.class.isAssignableFrom(cVar.getClass())) {
                    f87105h.fine("Ignoring GET for found local resource: " + cVar);
                    return null;
                }
                f87105h.fine("Found local icon matching relative request URI: " + uri);
                qr.d dVar = (qr.d) cVar.a();
                cVar2 = new org.fourthline.cling.model.message.c(dVar.b(), dVar.f());
            }
        } catch (DescriptorBindingException e10) {
            Logger logger = f87105h;
            logger.warning("Error generating requested device/service descriptor: " + e10.toString());
            logger.log(Level.WARNING, "Exception root cause: ", os.a.a(e10));
            cVar2 = new org.fourthline.cling.model.message.c(UpnpResponse.Status.INTERNAL_SERVER_ERROR);
        }
        cVar2.j().n(UpnpHeader.Type.SERVER, new u());
        return cVar2;
    }

    public sr.c l(URI uri) {
        return null;
    }
}
