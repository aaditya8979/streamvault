package as;

import java.util.logging.Logger;
import jr.d;
import qr.l;

/* JADX INFO: compiled from: Stop.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class c extends hr.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Logger f5302d = Logger.getLogger(c.class.getName());

    public c(org.fourthline.cling.model.types.b bVar, l lVar) {
        super(new d(lVar.a("Stop")));
        d().j("InstanceID", bVar);
    }

    public c(l lVar) {
        this(new org.fourthline.cling.model.types.b(0L), lVar);
    }

    @Override // hr.a
    public void h(d dVar) {
        f5302d.fine("Execution successful");
    }
}
