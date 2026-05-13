package is;

import ir.h;
import java.net.InetAddress;
import java.util.List;
import ls.m;
import org.fourthline.cling.model.message.c;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: Router.java */
/* JADX INFO: loaded from: classes9.dex */
public interface a {
    vr.a a();

    void e(org.fourthline.cling.model.message.a aVar) throws RouterException;

    boolean enable() throws RouterException;

    c f(org.fourthline.cling.model.message.b bVar) throws RouterException;

    void g(lr.b bVar);

    br.c getConfiguration();

    List<h> h(InetAddress inetAddress) throws RouterException;

    void i(m mVar);

    void shutdown() throws RouterException;
}
