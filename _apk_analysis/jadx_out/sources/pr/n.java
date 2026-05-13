package pr;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: MaxAgeHeader.java */
/* JADX INFO: loaded from: classes3.dex */
public class n extends UpnpHeader<Integer> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f77543c = Pattern.compile(".*max-age\\s*=\\s*([0-9]+).*");

    public n() {
        e(1800);
    }

    public n(Integer num) {
        e(num);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        return "max-age=" + b().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        Matcher matcher = f77543c.matcher(str.toLowerCase(Locale.ROOT));
        if (matcher.matches()) {
            e(Integer.valueOf(Integer.parseInt(matcher.group(1))));
            return;
        }
        throw new InvalidHeaderException("Invalid cache-control value, can't parse max-age seconds: " + str);
    }
}
