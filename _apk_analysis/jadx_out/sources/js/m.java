package js;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.enterprise.inject.Alternative;
import org.fourthline.cling.model.UnsupportedDataException;

/* JADX INFO: compiled from: RecoveringGENAEventProcessorImpl.java */
/* JADX INFO: loaded from: classes3.dex */
@Alternative
public class m extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Logger f72621c = Logger.getLogger(ls.e.class.getName());

    @Override // js.k, js.g, ls.e
    public void a(or.a aVar) throws UnsupportedDataException {
        try {
            super.a(aVar);
        } catch (UnsupportedDataException e10) {
            if (!aVar.c()) {
                throw e10;
            }
            f72621c.warning("Trying to recover from invalid GENA XML event: " + e10);
            aVar.A().clear();
            try {
                aVar.b(m(qs.c.c(d(aVar))));
                super.a(aVar);
            } catch (UnsupportedDataException unused) {
                if (aVar.A().isEmpty()) {
                    throw e10;
                }
                f72621c.warning("Partial read of GENA event properties (probably due to truncated XML)");
            }
        }
    }

    public String m(String str) {
        Matcher matcher = Pattern.compile("<LastChange>(.*)</LastChange>", 32).matcher(str);
        if (!matcher.find() || matcher.groupCount() != 1) {
            return str;
        }
        String strGroup = matcher.group(1);
        if (qs.c.d(strGroup)) {
            return str;
        }
        String strTrim = strGroup.trim();
        String strK = strTrim.charAt(0) == '<' ? ir.m.k(strTrim) : strTrim;
        if (strK.equals(strTrim)) {
            return str;
        }
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?><e:propertyset xmlns:e=\"urn:schemas-upnp-org:event-1-0\"><e:property><LastChange>" + strK + "</LastChange></e:property></e:propertyset>";
    }
}
