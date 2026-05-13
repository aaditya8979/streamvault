package nr;

import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;
import pr.d0;
import pr.s;

/* JADX INFO: compiled from: OutgoingNotificationRequestRootDevice.java */
/* JADX INFO: loaded from: classes9.dex */
public class f extends d {
    public f(ir.e eVar, qr.e eVar2, NotificationSubtype notificationSubtype) {
        super(eVar, eVar2, notificationSubtype);
        j().n(UpnpHeader.Type.NT, new s());
        j().n(UpnpHeader.Type.USN, new d0(eVar2.r().b()));
        if (!"true".equals(System.getProperty("org.fourthline.cling.network.announceMACAddress")) || eVar.b().b() == null) {
            return;
        }
        j().n(UpnpHeader.Type.EXT_IFACE_MAC, new pr.j(eVar.b().b()));
    }
}
