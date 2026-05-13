package an;

import java.util.EventListener;
import javax.servlet.http.HttpSessionBindingEvent;

/* JADX INFO: compiled from: HttpSessionBindingListener.java */
/* JADX INFO: loaded from: classes3.dex */
public interface h extends EventListener {
    void valueBound(HttpSessionBindingEvent httpSessionBindingEvent);

    void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent);
}
