package nr;

import org.fourthline.cling.model.message.header.UpnpHeader;
import pr.v;
import pr.w;
import ur.s;

/* JADX INFO: compiled from: OutgoingSearchResponseServiceType.java */
/* JADX INFO: loaded from: classes9.dex */
public class m extends j {
    public m(lr.b bVar, ir.e eVar, qr.e eVar2, s sVar) {
        super(bVar, eVar, eVar2);
        j().n(UpnpHeader.Type.ST, new v(sVar));
        j().n(UpnpHeader.Type.USN, new w(eVar2.r().b(), sVar));
    }
}
