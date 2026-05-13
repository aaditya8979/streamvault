package ls;

import java.net.InetAddress;
import org.fourthline.cling.transport.spi.InitializationException;

/* JADX INFO: compiled from: StreamServer.java */
/* JADX INFO: loaded from: classes3.dex */
public interface l<C> extends Runnable {
    void F(InetAddress inetAddress, is.a aVar) throws InitializationException;

    void stop();

    int t();
}
