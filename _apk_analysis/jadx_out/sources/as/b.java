package as;

import java.util.logging.Logger;
import jr.d;
import qr.l;

/* JADX INFO: compiled from: SetAVTransportURI.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class b extends hr.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Logger f5301d = Logger.getLogger(b.class.getName());

    public b(org.fourthline.cling.model.types.b bVar, l lVar, String str, String str2) {
        super(new d(lVar.a("SetAVTransportURI")));
        f5301d.fine("Creating SetAVTransportURI action for URI: " + str);
        d().j("InstanceID", bVar);
        d().j("CurrentURI", str);
        d().j("CurrentURIMetaData", str2);
    }

    public b(l lVar, String str, String str2) {
        this(new org.fourthline.cling.model.types.b(0L), lVar, str, str2);
    }

    @Override // hr.a
    public void h(d dVar) {
        f5301d.fine("Execution successful");
    }
}
