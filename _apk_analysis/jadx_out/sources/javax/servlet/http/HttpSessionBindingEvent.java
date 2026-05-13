package javax.servlet.http;

import an.e;

/* JADX INFO: loaded from: classes3.dex */
public class HttpSessionBindingEvent extends HttpSessionEvent {
    private static final long serialVersionUID = 7308000419984825907L;
    private String name;
    private Object value;

    public HttpSessionBindingEvent(e eVar, String str) {
        super(eVar);
        this.name = str;
    }

    public HttpSessionBindingEvent(e eVar, String str, Object obj) {
        super(eVar);
        this.name = str;
        this.value = obj;
    }

    public String getName() {
        return this.name;
    }

    @Override // javax.servlet.http.HttpSessionEvent
    public e getSession() {
        return super.getSession();
    }

    public Object getValue() {
        return this.value;
    }
}
