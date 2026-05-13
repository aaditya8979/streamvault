package pr;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: DeviceUSNHeader.java */
/* JADX INFO: loaded from: classes3.dex */
public class f extends UpnpHeader<ur.o> {
    public f() {
    }

    public f(ur.z zVar, ur.j jVar) {
        e(new ur.o(zVar, jVar));
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        try {
            e(ur.o.c(str));
        } catch (Exception e10) {
            throw new InvalidHeaderException("Invalid device USN header value, " + e10.getMessage());
        }
    }
}
