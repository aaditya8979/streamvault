package or;

import java.net.URL;
import java.util.List;
import org.fourthline.cling.model.message.header.UpnpHeader;
import pr.o;
import pr.y;
import pr.z;

/* JADX INFO: compiled from: IncomingSubscribeRequestMessage.java */
/* JADX INFO: loaded from: classes3.dex */
public class b extends org.fourthline.cling.model.message.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qr.f f76551h;

    public b(org.fourthline.cling.model.message.b bVar, qr.f fVar) {
        super(bVar);
        this.f76551h = fVar;
    }

    public String A() {
        y yVar = (y) j().s(UpnpHeader.Type.SID, y.class);
        if (yVar != null) {
            return yVar.b();
        }
        return null;
    }

    public boolean B() {
        return j().s(UpnpHeader.Type.NT, o.class) != null;
    }

    public List<URL> y() {
        pr.b bVar = (pr.b) j().s(UpnpHeader.Type.CALLBACK, pr.b.class);
        if (bVar != null) {
            return bVar.b();
        }
        return null;
    }

    public Integer z() {
        z zVar = (z) j().s(UpnpHeader.Type.TIMEOUT, z.class);
        if (zVar != null) {
            return zVar.b();
        }
        return null;
    }
}
