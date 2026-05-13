package nr;

import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.UpnpHeader;
import pr.u;

/* JADX INFO: compiled from: OutgoingSearchResponse.java */
/* JADX INFO: loaded from: classes9.dex */
public class j extends org.fourthline.cling.model.message.a<UpnpResponse> {
    public j(lr.b bVar, ir.e eVar, qr.e eVar2) {
        super(new UpnpResponse(UpnpResponse.Status.OK), bVar.v(), bVar.w());
        j().n(UpnpHeader.Type.MAX_AGE, new pr.n(eVar2.r().a()));
        j().n(UpnpHeader.Type.LOCATION, new pr.k(eVar.c()));
        j().n(UpnpHeader.Type.SERVER, new u());
        j().n(UpnpHeader.Type.EXT, new pr.g());
        if (!"true".equals(System.getProperty("org.fourthline.cling.network.announceMACAddress")) || eVar.b().b() == null) {
            return;
        }
        j().n(UpnpHeader.Type.EXT_IFACE_MAC, new pr.j(eVar.b().b()));
    }
}
