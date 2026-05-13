package pr;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: HostHeader.java */
/* JADX INFO: loaded from: classes3.dex */
public class i extends UpnpHeader<ur.m> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f77537c = 1900;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f77538d = "239.255.255.250";

    public i() {
        e(new ur.m("239.255.255.250", 1900));
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return b().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        if (!str.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            this.f77538d = str;
            e(new ur.m(str, this.f77537c));
            return;
        }
        try {
            this.f77537c = Integer.valueOf(str.substring(str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER) + 1)).intValue();
            String strSubstring = str.substring(0, str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER));
            this.f77538d = strSubstring;
            e(new ur.m(strSubstring, this.f77537c));
        } catch (NumberFormatException e10) {
            throw new InvalidHeaderException("Invalid HOST header value, can't parse port: " + str + " - " + e10.getMessage());
        }
    }
}
