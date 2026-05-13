package pr;

import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: MXHeader.java */
/* JADX INFO: loaded from: classes3.dex */
public class m extends UpnpHeader<Integer> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Integer f77542c = 3;

    public m() {
        e(f77542c);
    }

    public m(Integer num) {
        e(num);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        try {
            Integer numValueOf = Integer.valueOf(Integer.parseInt(str));
            if (numValueOf.intValue() < 0 || numValueOf.intValue() > 120) {
                e(f77542c);
            } else {
                e(numValueOf);
            }
        } catch (Exception unused) {
            throw new InvalidHeaderException("Can't parse MX seconds integer from: " + str);
        }
    }
}
