package or;

import org.fourthline.cling.model.message.header.UpnpHeader;
import pr.o;
import pr.y;

/* JADX INFO: compiled from: IncomingUnsubscribeRequestMessage.java */
/* JADX INFO: loaded from: classes3.dex */
public class d extends org.fourthline.cling.model.message.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qr.f f76552h;

    public d(org.fourthline.cling.model.message.b bVar, qr.f fVar) {
        super(bVar);
        this.f76552h = fVar;
    }

    public boolean A() {
        return j().s(UpnpHeader.Type.NT, o.class) != null;
    }

    public String y() {
        y yVar = (y) j().s(UpnpHeader.Type.SID, y.class);
        if (yVar != null) {
            return yVar.b();
        }
        return null;
    }

    public boolean z() {
        return j().s(UpnpHeader.Type.CALLBACK, pr.b.class) != null;
    }
}
