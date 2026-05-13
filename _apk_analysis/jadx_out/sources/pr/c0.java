package pr;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: UDNHeader.java */
/* JADX INFO: loaded from: classes4.dex */
public class c0 extends UpnpHeader<ur.z> {
    public c0() {
    }

    public c0(ur.z zVar) {
        e(zVar);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        if (!str.startsWith("uuid:")) {
            throw new InvalidHeaderException("Invalid UDA header value, must start with 'uuid:': " + str);
        }
        if (!str.contains("::urn")) {
            e(new ur.z(str.substring(5)));
            return;
        }
        throw new InvalidHeaderException("Invalid UDA header value, must not contain '::urn': " + str);
    }
}
