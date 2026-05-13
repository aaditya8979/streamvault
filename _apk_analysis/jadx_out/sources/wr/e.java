package wr;

import java.util.logging.Logger;
import org.fourthline.cling.model.types.NotificationSubtype;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: SendingNotificationAlive.java */
/* JADX INFO: loaded from: classes2.dex */
public class e extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f86691f = Logger.getLogger(d.class.getName());

    public e(br.b bVar, qr.e eVar) {
        super(bVar, eVar);
    }

    @Override // wr.d, vr.f
    public void a() throws RouterException {
        f86691f.fine("Sending alive messages (" + g() + " times) for: " + h());
        super.a();
    }

    @Override // wr.d
    public NotificationSubtype i() {
        return NotificationSubtype.ALIVE;
    }
}
