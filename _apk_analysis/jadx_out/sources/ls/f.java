package ls;

import java.net.NetworkInterface;
import org.fourthline.cling.transport.spi.InitializationException;

/* JADX INFO: compiled from: MulticastReceiver.java */
/* JADX INFO: loaded from: classes4.dex */
public interface f<C> extends Runnable {
    void f0(NetworkInterface networkInterface, is.a aVar, g gVar, d dVar) throws InitializationException;

    void stop();
}
