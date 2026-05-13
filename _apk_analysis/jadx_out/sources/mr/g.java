package mr;

import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.UpnpHeader;
import pr.u;

/* JADX INFO: compiled from: OutgoingActionResponseMessage.java */
/* JADX INFO: loaded from: classes9.dex */
public class g extends org.fourthline.cling.model.message.c implements c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f75000g;

    public g(UpnpResponse.Status status) {
        this(status, null);
    }

    public g(UpnpResponse.Status status, org.fourthline.cling.model.meta.a aVar) {
        super(new UpnpResponse(status));
        if (aVar != null) {
            if (aVar instanceof org.fourthline.cling.model.meta.b) {
                this.f75000g = "urn:schemas-upnp-org:control-1-0";
            } else {
                this.f75000g = aVar.g().g().toString();
            }
        }
        u();
    }

    public g(org.fourthline.cling.model.meta.a aVar) {
        this(UpnpResponse.Status.OK, aVar);
    }

    @Override // mr.a
    public String a() {
        return this.f75000g;
    }

    public void u() {
        j().n(UpnpHeader.Type.CONTENT_TYPE, new pr.d(pr.d.f77536d));
        j().n(UpnpHeader.Type.SERVER, new u());
        j().n(UpnpHeader.Type.EXT, new pr.g());
    }
}
