package or;

import java.net.URL;
import java.util.Collection;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;
import pr.o;
import pr.p;
import pr.y;

/* JADX INFO: compiled from: OutgoingEventRequestMessage.java */
/* JADX INFO: loaded from: classes3.dex */
public class e extends org.fourthline.cling.model.message.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Collection<tr.d> f76553h;

    public e(kr.a aVar, URL url) {
        this(aVar, url, aVar.t(), aVar.F().values());
    }

    public e(kr.a aVar, URL url, org.fourthline.cling.model.types.b bVar, Collection<tr.d> collection) {
        super(new UpnpRequest(UpnpRequest.Method.NOTIFY, url));
        j().n(UpnpHeader.Type.CONTENT_TYPE, new pr.d());
        j().n(UpnpHeader.Type.NT, new o());
        j().n(UpnpHeader.Type.NTS, new p(NotificationSubtype.PROPCHANGE));
        j().n(UpnpHeader.Type.SID, new y(aVar.I()));
        j().n(UpnpHeader.Type.SEQ, new pr.h(bVar.c().longValue()));
        this.f76553h = collection;
    }

    public Collection<tr.d> y() {
        return this.f76553h;
    }
}
