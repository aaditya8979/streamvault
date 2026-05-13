package mr;

import org.fourthline.cling.model.message.UpnpResponse;

/* JADX INFO: compiled from: IncomingActionResponseMessage.java */
/* JADX INFO: loaded from: classes9.dex */
public class e extends org.fourthline.cling.model.message.c implements c {
    public e(UpnpResponse upnpResponse) {
        super(upnpResponse);
    }

    public e(org.fourthline.cling.model.message.c cVar) {
        super(cVar);
    }

    @Override // mr.a
    public String a() {
        return null;
    }

    public boolean u() {
        int iD = k().d();
        return (!k().f() || iD == UpnpResponse.Status.METHOD_NOT_SUPPORTED.getStatusCode() || (iD == UpnpResponse.Status.INTERNAL_SERVER_ERROR.getStatusCode() && n())) ? false : true;
    }

    public boolean v() {
        return n() && k().d() == UpnpResponse.Status.INTERNAL_SERVER_ERROR.getStatusCode();
    }
}
