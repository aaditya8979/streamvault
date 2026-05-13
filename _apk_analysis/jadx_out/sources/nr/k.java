package nr;

import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: OutgoingSearchResponseDeviceType.java */
/* JADX INFO: loaded from: classes9.dex */
public class k extends j {
    public k(lr.b bVar, ir.e eVar, qr.e eVar2) {
        super(bVar, eVar, eVar2);
        j().n(UpnpHeader.Type.ST, new pr.e(eVar2.getType()));
        j().n(UpnpHeader.Type.USN, new pr.f(eVar2.r().b(), eVar2.getType()));
    }
}
