package nr;

import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;

/* JADX INFO: compiled from: OutgoingSearchRequest.java */
/* JADX INFO: loaded from: classes10.dex */
public class i extends org.fourthline.cling.model.message.a<UpnpRequest> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public UpnpHeader f75963j;

    public i(UpnpHeader upnpHeader, int i10) {
        super(new UpnpRequest(UpnpRequest.Method.MSEARCH), ir.f.d("239.255.255.250"), 1900);
        this.f75963j = upnpHeader;
        j().n(UpnpHeader.Type.MAN, new pr.l(NotificationSubtype.DISCOVER.getHeaderString()));
        j().n(UpnpHeader.Type.MX, new pr.m(Integer.valueOf(i10)));
        j().n(UpnpHeader.Type.ST, upnpHeader);
        j().n(UpnpHeader.Type.HOST, new pr.i());
    }
}
