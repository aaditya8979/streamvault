package pr;

import org.fourthline.cling.model.message.header.InvalidHeaderException;

/* JADX INFO: compiled from: UDADeviceTypeHeader.java */
/* JADX INFO: loaded from: classes4.dex */
public class a0 extends e {
    public a0() {
    }

    public a0(ur.j jVar) {
        super(jVar);
    }

    @Override // pr.e, org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        try {
            e(ur.w.e(str));
        } catch (Exception e10) {
            throw new InvalidHeaderException("Invalid UDA device type header value, " + e10.getMessage());
        }
    }
}
