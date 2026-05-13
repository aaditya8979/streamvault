package nr;

import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;

/* JADX INFO: compiled from: IncomingSearchRequest.java */
/* JADX INFO: loaded from: classes9.dex */
public class b extends lr.b<UpnpRequest> {
    public b(lr.b<UpnpRequest> bVar) {
        super(bVar);
    }

    public Integer x() {
        pr.m mVar = (pr.m) j().s(UpnpHeader.Type.MX, pr.m.class);
        if (mVar != null) {
            return mVar.b();
        }
        return null;
    }

    public UpnpHeader y() {
        return j().r(UpnpHeader.Type.ST);
    }

    public boolean z() {
        pr.l lVar = (pr.l) j().s(UpnpHeader.Type.MAN, pr.l.class);
        return lVar != null && lVar.b().equals(NotificationSubtype.DISCOVER.getHeaderString());
    }
}
