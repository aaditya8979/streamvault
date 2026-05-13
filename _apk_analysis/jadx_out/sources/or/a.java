package or;

import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;
import pr.o;
import pr.p;
import pr.y;
import qr.k;

/* JADX INFO: compiled from: IncomingEventRequestMessage.java */
/* JADX INFO: loaded from: classes3.dex */
public class a extends org.fourthline.cling.model.message.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<tr.d> f76549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f76550i;

    public a(org.fourthline.cling.model.message.b bVar, k kVar) {
        super(bVar);
        this.f76549h = new ArrayList();
        this.f76550i = kVar;
    }

    public List<tr.d> A() {
        return this.f76549h;
    }

    public String B() {
        y yVar = (y) j().s(UpnpHeader.Type.SID, y.class);
        if (yVar != null) {
            return yVar.b();
        }
        return null;
    }

    public boolean C() {
        o oVar = (o) j().s(UpnpHeader.Type.NT, o.class);
        p pVar = (p) j().s(UpnpHeader.Type.NTS, p.class);
        return (oVar == null || oVar.b() == null || pVar == null || !pVar.b().equals(NotificationSubtype.PROPCHANGE)) ? false : true;
    }

    @Override // org.fourthline.cling.model.message.UpnpMessage
    public String toString() {
        return super.toString() + " SEQUENCE: " + y().c();
    }

    public org.fourthline.cling.model.types.b y() {
        pr.h hVar = (pr.h) j().s(UpnpHeader.Type.SEQ, pr.h.class);
        if (hVar != null) {
            return hVar.b();
        }
        return null;
    }

    public k z() {
        return this.f76550i;
    }
}
