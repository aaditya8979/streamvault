package lr;

import java.io.ByteArrayInputStream;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.message.header.UpnpHeader;

/* JADX INFO: compiled from: UpnpHeaders.java */
/* JADX INFO: loaded from: classes8.dex */
public class c extends ns.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f73920e = Logger.getLogger(c.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<UpnpHeader.Type, List<UpnpHeader>> f73921d;

    public c() {
    }

    public c(ByteArrayInputStream byteArrayInputStream) {
        super(byteArrayInputStream);
    }

    public c(Map<String, List<String>> map) {
        super(map);
    }

    public c(boolean z10) {
        super(z10);
    }

    @Override // ns.a
    public void a(String str, String str2) {
        this.f73921d = null;
        super.a(str, str2);
    }

    @Override // ns.a, java.util.Map
    public void clear() {
        this.f73921d = null;
        super.clear();
    }

    @Override // ns.a, java.util.Map
    /* JADX INFO: renamed from: h */
    public List<String> put(String str, List<String> list) {
        this.f73921d = null;
        return super.put(str, list);
    }

    @Override // ns.a, java.util.Map
    /* JADX INFO: renamed from: l */
    public List<String> remove(Object obj) {
        this.f73921d = null;
        return super.remove(obj);
    }

    public void n(UpnpHeader.Type type, UpnpHeader upnpHeader) {
        super.a(type.getHttpName(), upnpHeader.a());
        if (this.f73921d != null) {
            o(type, upnpHeader);
        }
    }

    public void o(UpnpHeader.Type type, UpnpHeader upnpHeader) {
        Logger logger = f73920e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("Adding parsed header: " + upnpHeader);
        }
        List<UpnpHeader> linkedList = this.f73921d.get(type);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this.f73921d.put(type, linkedList);
        }
        linkedList.add(upnpHeader);
    }

    public boolean p(UpnpHeader.Type type) {
        if (this.f73921d == null) {
            u();
        }
        return this.f73921d.containsKey(type);
    }

    public UpnpHeader[] q(UpnpHeader.Type type) {
        if (this.f73921d == null) {
            u();
        }
        return this.f73921d.get(type) != null ? (UpnpHeader[]) this.f73921d.get(type).toArray(new UpnpHeader[this.f73921d.get(type).size()]) : new UpnpHeader[0];
    }

    public UpnpHeader r(UpnpHeader.Type type) {
        if (q(type).length > 0) {
            return q(type)[0];
        }
        return null;
    }

    public <H extends UpnpHeader> H s(UpnpHeader.Type type, Class<H> cls) {
        UpnpHeader[] upnpHeaderArrQ = q(type);
        if (upnpHeaderArrQ.length == 0) {
            return null;
        }
        for (UpnpHeader upnpHeader : upnpHeaderArrQ) {
            H h10 = (H) upnpHeader;
            if (cls.isAssignableFrom(h10.getClass())) {
                return h10;
            }
        }
        return null;
    }

    public String t(UpnpHeader.Type type) {
        UpnpHeader upnpHeaderR = r(type);
        if (upnpHeaderR != null) {
            return upnpHeaderR.a();
        }
        return null;
    }

    public void u() {
        this.f73921d = new LinkedHashMap();
        Logger logger = f73920e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("Parsing all HTTP headers for known UPnP headers: " + size());
        }
        for (Map.Entry<String, List<String>> entry : entrySet()) {
            if (entry.getKey() != null) {
                UpnpHeader.Type byHttpName = UpnpHeader.Type.getByHttpName(entry.getKey());
                if (byHttpName == null) {
                    Logger logger2 = f73920e;
                    if (logger2.isLoggable(Level.FINE)) {
                        logger2.fine("Ignoring non-UPNP HTTP header: " + entry.getKey());
                    }
                } else {
                    for (String str : entry.getValue()) {
                        UpnpHeader upnpHeaderC = UpnpHeader.c(byHttpName, str);
                        if (upnpHeaderC == null || upnpHeaderC.b() == null) {
                            Logger logger3 = f73920e;
                            if (logger3.isLoggable(Level.FINE)) {
                                logger3.fine("Ignoring known but irrelevant header (value violates the UDA specification?) '" + byHttpName.getHttpName() + "': " + str);
                            }
                        } else {
                            o(byHttpName, upnpHeaderC);
                        }
                    }
                }
            }
        }
    }
}
