package pr;

import org.fourthline.cling.model.message.header.InvalidHeaderException;

/* JADX INFO: compiled from: UDAServiceTypeHeader.java */
/* JADX INFO: loaded from: classes4.dex */
public class b0 extends v {
    @Override // pr.v, org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        try {
            e(ur.y.e(str));
        } catch (Exception e10) {
            throw new InvalidHeaderException("Invalid UDA service type header value, " + e10.getMessage());
        }
    }
}
