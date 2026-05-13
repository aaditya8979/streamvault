package javax.servlet;

import java.util.EventObject;
import zm.k;

/* JADX INFO: loaded from: classes8.dex */
public class ServletContextEvent extends EventObject {
    private static final long serialVersionUID = -7501701636134222423L;

    public ServletContextEvent(k kVar) {
        super(kVar);
    }

    public k getServletContext() {
        return (k) super.getSource();
    }
}
