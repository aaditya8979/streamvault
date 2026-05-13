package pr;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: CallbackHeader.java */
/* JADX INFO: loaded from: classes3.dex */
public class b extends UpnpHeader<List<URL>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f77534c = Logger.getLogger(b.class.getName());

    public b() {
        e(new ArrayList());
    }

    public b(List<URL> list) {
        this();
        b().addAll(list);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String a() {
        StringBuilder sb2 = new StringBuilder();
        for (URL url : b()) {
            sb2.append("<");
            sb2.append(url.toString());
            sb2.append(">");
        }
        return sb2.toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void d(String str) throws InvalidHeaderException {
        if (str.length() == 0) {
            return;
        }
        if (!str.contains("<") || !str.contains(">")) {
            throw new InvalidHeaderException("URLs not in brackets: " + str);
        }
        String strReplaceAll = str.replaceAll("<", "");
        String[] strArrSplit = strReplaceAll.split(">");
        try {
            ArrayList arrayList = new ArrayList();
            for (String str2 : strArrSplit) {
                String strTrim = str2.trim();
                if (strTrim.startsWith("http://")) {
                    URL url = new URL(strTrim);
                    try {
                        url.toURI();
                        arrayList.add(url);
                    } catch (URISyntaxException e10) {
                        f77534c.log(Level.WARNING, "Discarding callback URL, not a valid URI on this platform: " + url, (Throwable) e10);
                    }
                } else {
                    f77534c.warning("Discarding non-http callback URL: " + strTrim);
                }
            }
            e(arrayList);
        } catch (MalformedURLException e11) {
            throw new InvalidHeaderException("Can't parse callback URLs from '" + strReplaceAll + "': " + e11);
        }
    }
}
