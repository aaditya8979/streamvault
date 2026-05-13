package nr;

import org.fourthline.cling.model.message.header.UpnpHeader;
import pr.d0;
import pr.s;

/* JADX INFO: compiled from: OutgoingSearchResponseRootDevice.java */
/* JADX INFO: loaded from: classes9.dex */
public class l extends j {
    public l(lr.b bVar, ir.e eVar, qr.e eVar2) {
        super(bVar, eVar, eVar2);
        j().n(UpnpHeader.Type.ST, new s());
        j().n(UpnpHeader.Type.USN, new d0(eVar2.r().b()));
    }
}
