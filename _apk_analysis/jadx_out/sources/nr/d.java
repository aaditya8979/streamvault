package nr;

import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;
import pr.p;
import pr.u;

/* JADX INFO: compiled from: OutgoingNotificationRequest.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class d extends org.fourthline.cling.model.message.a<UpnpRequest> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public NotificationSubtype f75962j;

    public d(ir.e eVar, qr.e eVar2, NotificationSubtype notificationSubtype) {
        super(new UpnpRequest(UpnpRequest.Method.NOTIFY), ir.f.d("239.255.255.250"), 1900);
        this.f75962j = notificationSubtype;
        j().n(UpnpHeader.Type.MAX_AGE, new pr.n(eVar2.r().a()));
        j().n(UpnpHeader.Type.LOCATION, new pr.k(eVar.c()));
        j().n(UpnpHeader.Type.SERVER, new u());
        j().n(UpnpHeader.Type.HOST, new pr.i());
        j().n(UpnpHeader.Type.NTS, new p(notificationSubtype));
    }

    public NotificationSubtype getType() {
        return this.f75962j;
    }
}
