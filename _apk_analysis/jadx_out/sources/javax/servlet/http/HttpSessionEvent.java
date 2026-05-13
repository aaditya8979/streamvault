package javax.servlet.http;

import an.e;
import java.util.EventObject;

/* JADX INFO: loaded from: classes3.dex */
public class HttpSessionEvent extends EventObject {
    private static final long serialVersionUID = -7622791603672342895L;

    public HttpSessionEvent(e eVar) {
        super(eVar);
    }

    public e getSession() {
        return (e) super.getSource();
    }
}
