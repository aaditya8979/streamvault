package pr;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: DeviceTypeHeader.java */
/* JADX INFO: loaded from: classes3.dex */
public class e extends UpnpHeader<ur.j> {
    public e() {
    }

    public e(ur.j jVar) {
        e(jVar);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        try {
            e(ur.j.d(str));
        } catch (RuntimeException e10) {
            throw new InvalidHeaderException("Invalid device type header value, " + e10.getMessage());
        }
    }
}
