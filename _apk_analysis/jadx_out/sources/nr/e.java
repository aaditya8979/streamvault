package nr;

import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;

/* JADX INFO: compiled from: OutgoingNotificationRequestDeviceType.java */
/* JADX INFO: loaded from: classes9.dex */
public class e extends d {
    public e(ir.e eVar, qr.e eVar2, NotificationSubtype notificationSubtype) {
        super(eVar, eVar2, notificationSubtype);
        j().n(UpnpHeader.Type.NT, new pr.e(eVar2.getType()));
        j().n(UpnpHeader.Type.USN, new pr.f(eVar2.r().b(), eVar2.getType()));
    }
}
