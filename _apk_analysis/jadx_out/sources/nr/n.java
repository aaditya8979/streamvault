package nr;

import org.fourthline.cling.model.message.header.UpnpHeader;
import pr.c0;

/* JADX INFO: compiled from: OutgoingSearchResponseUDN.java */
/* JADX INFO: loaded from: classes9.dex */
public class n extends j {
    public n(lr.b bVar, ir.e eVar, qr.e eVar2) {
        super(bVar, eVar, eVar2);
        j().n(UpnpHeader.Type.ST, new c0(eVar2.r().b()));
        j().n(UpnpHeader.Type.USN, new c0(eVar2.r().b()));
    }
}
