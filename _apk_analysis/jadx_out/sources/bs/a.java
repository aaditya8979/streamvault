package bs;

import ds.b;
import ir.f;
import java.util.Set;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import org.fourthline.cling.support.avtransport.lastchange.AVTransportVariable;
import org.fourthline.cling.support.lastchange.LastChangeParser;

/* JADX INFO: compiled from: AVTransportLastChangeParser.java */
/* JADX INFO: loaded from: classes11.dex */
public class a extends LastChangeParser {
    @Override // org.seamless.xml.SAXParser
    public Source[] e() {
        if (f.f71773a) {
            return null;
        }
        return new Source[]{new StreamSource(Thread.currentThread().getContextClassLoader().getResourceAsStream("org/fourthline/cling/support/avtransport/metadata-1.01-avt.xsd"))};
    }

    @Override // org.fourthline.cling.support.lastchange.LastChangeParser
    public Set<Class<? extends b>> n() {
        return AVTransportVariable.f76877a;
    }

    @Override // org.fourthline.cling.support.lastchange.LastChangeParser
    public String o() {
        return "urn:schemas-upnp-org:metadata-1-0/AVT/";
    }
}
