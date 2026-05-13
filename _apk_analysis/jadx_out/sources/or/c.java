package or;

import org.fourthline.cling.model.message.header.UpnpHeader;
import pr.y;
import pr.z;

/* JADX INFO: compiled from: IncomingSubscribeResponseMessage.java */
/* JADX INFO: loaded from: classes3.dex */
public class c extends org.fourthline.cling.model.message.c {
    public c(org.fourthline.cling.model.message.c cVar) {
        super(cVar);
    }

    public int u() {
        return ((z) j().s(UpnpHeader.Type.TIMEOUT, z.class)).b().intValue();
    }

    public String v() {
        return ((y) j().s(UpnpHeader.Type.SID, y.class)).b();
    }

    public boolean w() {
        return (j().s(UpnpHeader.Type.SID, y.class) == null || j().s(UpnpHeader.Type.TIMEOUT, z.class) == null) ? false : true;
    }
}
