package ls;

import java.util.logging.Logger;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.protocol.ProtocolCreationException;

/* JADX INFO: compiled from: UpnpStream.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Logger f73927d = Logger.getLogger(m.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vr.a f73928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public vr.d f73929c;

    public m(vr.a aVar) {
        this.f73928b = aVar;
    }

    public org.fourthline.cling.model.message.c G(org.fourthline.cling.model.message.b bVar) {
        f73927d.fine("Processing stream request message: " + bVar);
        try {
            this.f73929c = g().j(bVar);
            f73927d.fine("Running protocol for synchronous message processing: " + this.f73929c);
            this.f73929c.run();
            org.fourthline.cling.model.message.c cVarG = this.f73929c.g();
            if (cVarG == null) {
                f73927d.finer("Protocol did not return any response message");
                return null;
            }
            f73927d.finer("Protocol returned response: " + cVarG);
            return cVarG;
        } catch (ProtocolCreationException e10) {
            f73927d.warning("Processing stream request failed - " + os.a.a(e10).toString());
            return new org.fourthline.cling.model.message.c(UpnpResponse.Status.NOT_IMPLEMENTED);
        }
    }

    public void H(Throwable th2) {
        vr.d dVar = this.f73929c;
        if (dVar != null) {
            dVar.i(th2);
        }
    }

    public void I(org.fourthline.cling.model.message.c cVar) {
        vr.d dVar = this.f73929c;
        if (dVar != null) {
            dVar.j(cVar);
        }
    }

    public vr.a g() {
        return this.f73928b;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}
