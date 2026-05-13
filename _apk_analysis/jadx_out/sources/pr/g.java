package pr;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: EXTHeader.java */
/* JADX INFO: loaded from: classes3.dex */
public class g extends UpnpHeader<String> {
    public g() {
        e("");
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        if (str == null || str.length() <= 0) {
            return;
        }
        throw new InvalidHeaderException("Invalid EXT header, it has no value: " + str);
    }
}
