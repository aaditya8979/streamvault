package pr;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: ServiceUSNHeader.java */
/* JADX INFO: loaded from: classes3.dex */
public class w extends UpnpHeader<ur.p> {
    public w() {
    }

    public w(ur.z zVar, ur.s sVar) {
        e(new ur.p(zVar, sVar));
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        try {
            e(ur.p.c(str));
        } catch (Exception e10) {
            throw new InvalidHeaderException("Invalid service USN header value, " + e10.getMessage());
        }
    }
}
