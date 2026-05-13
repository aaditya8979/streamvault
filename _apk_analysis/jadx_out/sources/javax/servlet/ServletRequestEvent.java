package javax.servlet;

import java.util.EventObject;
import zm.k;
import zm.p;

/* JADX INFO: loaded from: classes3.dex */
public class ServletRequestEvent extends EventObject {
    private static final long serialVersionUID = -7467864054698729101L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient p f72372b;

    public ServletRequestEvent(k kVar, p pVar) {
        super(kVar);
        this.f72372b = pVar;
    }

    public k getServletContext() {
        return (k) super.getSource();
    }

    public p getServletRequest() {
        return this.f72372b;
    }
}
