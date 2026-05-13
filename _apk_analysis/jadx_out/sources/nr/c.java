package nr;

import java.net.URL;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.UpnpHeader;
import pr.c0;
import pr.d0;
import pr.w;
import ur.o;
import ur.p;
import ur.z;

/* JADX INFO: compiled from: IncomingSearchResponse.java */
/* JADX INFO: loaded from: classes9.dex */
public class c extends lr.b<UpnpResponse> {
    public c(lr.b<UpnpResponse> bVar) {
        super(bVar);
    }

    public z A() {
        lr.c cVarJ = j();
        UpnpHeader.Type type = UpnpHeader.Type.USN;
        UpnpHeader upnpHeaderS = cVarJ.s(type, d0.class);
        if (upnpHeaderS != null) {
            return (z) upnpHeaderS.b();
        }
        UpnpHeader upnpHeaderS2 = j().s(type, c0.class);
        if (upnpHeaderS2 != null) {
            return (z) upnpHeaderS2.b();
        }
        UpnpHeader upnpHeaderS3 = j().s(type, pr.f.class);
        if (upnpHeaderS3 != null) {
            return ((o) upnpHeaderS3.b()).b();
        }
        UpnpHeader upnpHeaderS4 = j().s(type, w.class);
        if (upnpHeaderS4 != null) {
            return ((p) upnpHeaderS4.b()).b();
        }
        return null;
    }

    public boolean B() {
        UpnpHeader upnpHeaderR = j().r(UpnpHeader.Type.ST);
        UpnpHeader upnpHeaderR2 = j().r(UpnpHeader.Type.USN);
        return (upnpHeaderR == null || upnpHeaderR.b() == null || upnpHeaderR2 == null || upnpHeaderR2.b() == null || j().r(UpnpHeader.Type.EXT) == null) ? false : true;
    }

    public byte[] x() {
        pr.j jVar = (pr.j) j().s(UpnpHeader.Type.EXT_IFACE_MAC, pr.j.class);
        if (jVar != null) {
            return jVar.b();
        }
        return null;
    }

    public URL y() {
        pr.k kVar = (pr.k) j().s(UpnpHeader.Type.LOCATION, pr.k.class);
        if (kVar != null) {
            return kVar.b();
        }
        return null;
    }

    public Integer z() {
        pr.n nVar = (pr.n) j().s(UpnpHeader.Type.MAX_AGE, pr.n.class);
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }
}
