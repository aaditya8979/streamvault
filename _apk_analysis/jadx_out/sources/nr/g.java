package nr;

import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;
import pr.v;
import pr.w;
import ur.s;

/* JADX INFO: compiled from: OutgoingNotificationRequestServiceType.java */
/* JADX INFO: loaded from: classes10.dex */
public class g extends d {
    public g(ir.e eVar, qr.e eVar2, NotificationSubtype notificationSubtype, s sVar) {
        super(eVar, eVar2, notificationSubtype);
        j().n(UpnpHeader.Type.NT, new v(sVar));
        j().n(UpnpHeader.Type.USN, new w(eVar2.r().b(), sVar));
    }
}
