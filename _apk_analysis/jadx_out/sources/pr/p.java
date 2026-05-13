package pr;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.NotificationSubtype;

/* JADX INFO: compiled from: NTSHeader.java */
/* JADX INFO: loaded from: classes3.dex */
public class p extends UpnpHeader<NotificationSubtype> {
    public p() {
    }

    public p(NotificationSubtype notificationSubtype) {
        e(notificationSubtype);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().getHeaderString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        NotificationSubtype[] notificationSubtypeArrValues = NotificationSubtype.values();
        int length = notificationSubtypeArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            NotificationSubtype notificationSubtype = notificationSubtypeArrValues[i10];
            if (str.equals(notificationSubtype.getHeaderString())) {
                e(notificationSubtype);
                break;
            }
            i10++;
        }
        if (b() != null) {
            return;
        }
        throw new InvalidHeaderException("Invalid NTS header value: " + str);
    }
}
