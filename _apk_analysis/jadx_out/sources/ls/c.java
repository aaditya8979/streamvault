package ls;

import java.net.InetAddress;
import org.fourthline.cling.transport.spi.InitializationException;

/* JADX INFO: compiled from: DatagramIO.java */
/* JADX INFO: loaded from: classes4.dex */
public interface c<C> extends Runnable {
    void e(org.fourthline.cling.model.message.a aVar);

    void o(InetAddress inetAddress, is.a aVar, d dVar) throws InitializationException;

    void stop();
}
