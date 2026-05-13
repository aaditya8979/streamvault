package or;

import java.net.URL;
import java.util.List;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.UpnpHeader;
import pr.o;
import pr.z;

/* JADX INFO: compiled from: OutgoingSubscribeRequestMessage.java */
/* JADX INFO: loaded from: classes3.dex */
public class h extends org.fourthline.cling.model.message.b {
    public h(kr.c cVar, List<URL> list, lr.c cVar2) {
        super(UpnpRequest.Method.SUBSCRIBE, cVar.S());
        j().n(UpnpHeader.Type.CALLBACK, new pr.b(list));
        j().n(UpnpHeader.Type.NT, new o());
        j().n(UpnpHeader.Type.TIMEOUT, new z(cVar.G()));
        if (cVar2 != null) {
            j().putAll(cVar2);
        }
    }

    public boolean y() {
        return ((pr.b) j().s(UpnpHeader.Type.CALLBACK, pr.b.class)).b().size() > 0;
    }
}
