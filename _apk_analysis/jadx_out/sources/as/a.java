package as;

import java.util.logging.Logger;
import jr.d;
import qr.l;

/* JADX INFO: compiled from: Play.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class a extends hr.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Logger f5300d = Logger.getLogger(a.class.getName());

    public a(org.fourthline.cling.model.types.b bVar, l lVar, String str) {
        super(new d(lVar.a("Play")));
        d().j("InstanceID", bVar);
        d().j("Speed", str);
    }

    public a(l lVar, String str) {
        this(new org.fourthline.cling.model.types.b(0L), lVar, str);
    }

    @Override // hr.a
    public void h(d dVar) {
        f5300d.fine("Execution successful");
    }
}
