package or;

import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.UpnpHeader;
import pr.y;
import pr.z;

/* JADX INFO: compiled from: OutgoingRenewalRequestMessage.java */
/* JADX INFO: loaded from: classes3.dex */
public class g extends org.fourthline.cling.model.message.b {
    public g(kr.c cVar, lr.c cVar2) {
        super(UpnpRequest.Method.SUBSCRIBE, cVar.S());
        j().n(UpnpHeader.Type.SID, new y(cVar.I()));
        j().n(UpnpHeader.Type.TIMEOUT, new z(cVar.G()));
        if (cVar2 != null) {
            j().putAll(cVar2);
        }
    }
}
