package mr;

import java.net.URL;
import java.util.logging.Logger;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.UpnpHeader;
import pr.e0;
import pr.x;
import ur.u;

/* JADX INFO: compiled from: OutgoingActionRequestMessage.java */
/* JADX INFO: loaded from: classes9.dex */
public class f extends org.fourthline.cling.model.message.b implements b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Logger f74998i = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f74999h;

    public f(jr.d dVar, URL url) {
        this(dVar.a(), new UpnpRequest(UpnpRequest.Method.POST, url));
        if (!(dVar instanceof jr.g)) {
            if (dVar.b() != null) {
                j().putAll(dVar.b().a());
            }
        } else {
            jr.g gVar = (jr.g) dVar;
            if (gVar.o() == null || gVar.o().b() == null) {
                return;
            }
            j().n(UpnpHeader.Type.USER_AGENT, new e0(gVar.o().b()));
        }
    }

    public f(org.fourthline.cling.model.meta.a aVar, UpnpRequest upnpRequest) {
        x xVar;
        super(upnpRequest);
        j().n(UpnpHeader.Type.CONTENT_TYPE, new pr.d(pr.d.f77536d));
        if (aVar instanceof org.fourthline.cling.model.meta.b) {
            f74998i.fine("Adding magic control SOAP action header for state variable query action");
            xVar = new x(new u("schemas-upnp-org", "control-1-0", null, aVar.d()));
        } else {
            xVar = new x(new u(aVar.g().g(), aVar.d()));
        }
        this.f74999h = xVar.b().d();
        if (!k().d().equals(UpnpRequest.Method.POST)) {
            throw new IllegalArgumentException("Can't send action with request method: " + k().d());
        }
        j().n(UpnpHeader.Type.SOAPACTION, xVar);
        f74998i.fine("Added SOAP action header: " + xVar);
    }

    @Override // mr.a
    public String a() {
        return this.f74999h;
    }
}
