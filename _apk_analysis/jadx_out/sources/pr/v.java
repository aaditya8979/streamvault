package pr;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: ServiceTypeHeader.java */
/* JADX INFO: loaded from: classes3.dex */
public class v extends UpnpHeader<ur.s> {
    public v() {
    }

    public v(ur.s sVar) {
        e(sVar);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        try {
            e(ur.s.d(str));
        } catch (RuntimeException e10) {
            throw new InvalidHeaderException("Invalid service type header value, " + e10.getMessage());
        }
    }
}
