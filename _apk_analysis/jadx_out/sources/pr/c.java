package pr;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: ContentRangeHeader.java */
/* JADX INFO: loaded from: classes3.dex */
public class c extends UpnpHeader<ur.d> {
    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().b(true, "bytes ");
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        try {
            e(ur.d.d(str, "bytes "));
        } catch (InvalidValueException e10) {
            throw new InvalidHeaderException("Invalid Range Header: " + e10.getMessage());
        }
    }
}
